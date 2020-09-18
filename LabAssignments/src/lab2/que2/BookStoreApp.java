package lab2.que2;

import java.util.*;

public class BookStoreApp {
	public static void main(String[] args) {
		boolean ans = true;
		BookStore b = new BookStore();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 1 to display book information");
			System.out.println("Enter 2 to sell books");
			System.out.println("Enter 3 to order books");
			System.out.println("Enter 0 to exit");
			System.out.print("Enter your choice :");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				b.display();
				break;

			case 2:
				System.out.print("Enter the Title of the book");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("Enter the no of copies required");
				int copies = sc.nextInt();
				b.sell(title, copies);
				break;

			case 3:
				System.out.print("Enter the ISBN of the book");
				sc.nextLine();
				String isbn = sc.nextLine();
				System.out.print("Enter the no of copies required");
				int quantity = sc.nextInt();
				b.order(isbn, quantity);
				break;

			case 0:
				System.out.println("Bye!");
				ans = false;
				break;

			}
		} while (ans);
		sc.close();
	}

}
