package lab2.que2;

import java.util.*;

class BookStore {

	private Book[] book = new Book[10];

	public void sell(String bookTitle, int quantity) {
		Book selectBook = null;
		for (Book temp : book) {
			if (temp != null && temp.getBookTitle().equals(bookTitle)) {
				selectBook = temp;
				break;
			}

		}
		if (selectBook != null)
			selectBook.setCopies(Math.max(0, selectBook.getCopies() - quantity));
		else
			System.out.println("Book currently unavailable!!");

	}

	public void order(String isbn, int quantity) {
		for (Book temp : book) {
			if (temp != null && temp.getISBN().equals(isbn)) {
				temp.setCopies(temp.getCopies() + quantity);
				break;
			} else if (temp == null) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Book not found!");
				System.out.print("Enter the title of the book");
				String title = sc.nextLine();
				System.out.print("Enter the author of the book");
				String author = sc.nextLine();
				book[Arrays.asList(book).indexOf(temp)]= new Book(title, author, isbn, quantity);
				sc.close();
				break;

			}

		}

	}

	public void display() {
		for (Book temp : book)
			if (temp != null)
				temp.display();

	}

}
