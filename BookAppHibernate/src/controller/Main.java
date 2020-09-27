package controller;

import java.util.*;


import org.apache.taglibs.standard.tag.common.core.RemoveTag;

import repository.*;

public class Main {

	public static void main(String[] args) {

		BookDaoImp dao = new BookDaoImp();
		int ch;
		boolean exitStatus = true;
		while (exitStatus) {
			System.out.println("1.Add Book into the database");
			System.out.println("2.Display all books in the database");
			System.out.println("3.Update a book's details");
			System.out.println("4.Delete a book from the database");
			System.out.println("5.Exit");
			System.out.println("Enter choice :");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter book name:");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("Enter author name:");
				String author = sc.nextLine();
				System.out.print("Enter price of book:");
				double price = sc.nextDouble();
				Book book = new Book(title, author, price);
				dao.addBook(book);
				break;
			case 2:
				List <Book> books=dao.getAllBooks();
				for(Book temp:books)
					System.out.println(temp);

				break;
				
			case 3:
				System.out.println("Enter Book Id");
				int id=sc.nextInt();
			    Book bookToBeUpdated=dao.getBookById(id);
			    if(bookToBeUpdated==null)
						throw new BookNotFoundException("book with id: " + id + " is not found!");
			    else
			    {
			    	//List<Integer> list=new ArrayList<>();
			    	System.out.println("1. Title Update");
			    	System.out.println("2. Author Update");
			    	System.out.println("3. Price Update");
			    	System.out.println("4. Exit");
			    	boolean exit=true;
			    	while(exit)
			    	{
			    		System.out.println("Enter choice");
			    		int ch1=sc.nextInt();
			    		if(ch==1)
			    		{
			    		    System.out.println("Enter the new Title");
			    		    String titleUpdate=sc.nextLine();
			    		    bookToBeUpdated.setTitle(titleUpdate);
			    		}
			    		else if(ch==2)
			    		{
			    		    System.out.println("Enter the Updated Author");
			    		    String authorUpdate=sc.nextLine();
			    		    bookToBeUpdated.setAuthor(authorUpdate);
			    		}
			    		else if(ch==3)
			    		{
			    		    System.out.println("Enter the updated price");
			    		    double priceUpdate=sc.nextDouble();
			    		    bookToBeUpdated.setPrice(priceUpdate);
			    		}
			    		else
			    		{
			    			exit=false;
			    			break;
			    		}
			    		dao.updateBook(bookToBeUpdated);	
			    	}
			    	
			    }
			    break;
			case 4: System.out.println("Enter the id of the book to be deleted");
			        int delId=sc.nextInt();
			        Book deletedBook=dao.removeBook(delId);
			        if(deletedBook!=null)
			        	System.out.println("The following book was deleted:");
			        System.out.println(deletedBook);
			        break;
			case 5:
				exitStatus=false;
				break;

			}

		}

	}
}
