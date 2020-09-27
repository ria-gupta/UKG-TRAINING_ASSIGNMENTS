package repository;

import java.util.List;

public interface BookDao {
	public List<Book> getAllBooks();
	public Book getBookById(int bookId);
	public void addBook(Book book);
	public boolean updateBook(Book book);
	public Book removeBook(int bookId);

}
