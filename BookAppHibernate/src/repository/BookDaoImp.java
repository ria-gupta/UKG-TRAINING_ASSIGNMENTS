package repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookDaoImp implements BookDao {

	private SessionFactory factory;

	public BookDaoImp() {
		factory = MySessionFactory.getSessionFactory();
	}

	@Override
	public List<Book> getAllBooks() {
		Session session = factory.openSession();

		List<Book> books = session.createQuery("select b from Book b").list();
		session.close();

		return books;
	}

	@Override
	public Book getBookById(int bookId) {
		Session session2 = factory.openSession();
		Book book = (Book) session2.get(Book.class, bookId);
		session2.close();
		//if (book == null)
			//throw new BookNotFoundException("book with id: " + bookId + " is not found!");
		return book;
		
	}

	@Override
	public void addBook(Book book) {
		Session session3 = factory.openSession();
		Transaction tx = session3.getTransaction();

		try {
			tx.begin();
			session3.save(book);
			tx.commit();
			session3.close();
		} catch (HibernateException e) {
			throw new DataAccessException("Some Hibernate Error!", e);
		}

	}

	@Override
	public boolean updateBook(Book book) {
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		boolean update=false;
		try {
			tx.begin();
			session.merge(book);
			tx.commit();
			session.close();
			update=true;
		} catch (HibernateException ex) {
			throw new DataAccessException("some hib error", ex);
		}
		return update;
	}

	@Override
	public Book removeBook(int bookId) {
		Session session4 = factory.openSession();
		Transaction tx = session4.getTransaction();
		Book bookToBeDeleted = null;
		try {
			tx.begin();
			bookToBeDeleted = getBookById(bookId);
			session4.delete(bookToBeDeleted);
			tx.commit();
			session4.close();
		} catch (HibernateException ex) {
			throw new DataAccessException("some hib error", ex);
		}
		return bookToBeDeleted;

	}

}
