package lab2.que2;

class Book {
	private String bookTitle, author, ISBN;
	private int copies;

	public void display() {
		System.out.println("Title: " + bookTitle + " Author:" + author + " ISBN:" + ISBN + " Copies:" + copies);
	}

	public Book(String bookTitle, String author, String iSBN, int copies) {
		this.bookTitle = bookTitle;
		this.author = author;
		ISBN = iSBN;
		this.copies = copies;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int noOfCopies) {
		copies = noOfCopies;
	}
}
