package Que4;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int choice;
		Student s = null;
		Scanner sc = new Scanner(System.in);
		boolean ans=true;
		while(ans) {
			
		System.out.println("1.Create Student profile");
		System.out.println("2.Display Student profile");
		System.out.println("3. Exit");
		System.out.print("Enter choice: ");
		choice = sc.nextInt();
		
		
		switch (choice) {
		case 1:
			int ch2;
			System.out.println("1. Create profile with name,id,grade");
			System.out.println("2. Create profile with name,id");
			System.out.println("3. Create profile with id");
			System.out.print("Enter choice: ");
			ch2 = sc.nextInt();
			switch (ch2) {
			case 1:
				System.out.print("Enter name of student: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Enter id of student: ");
				// sc.nextLine();
				String id = sc.nextLine();
				System.out.print("Enter grade of student: ");
				double grade = sc.nextDouble();
				s = new Student(name, id, grade);
				break;
			case 2:
				System.out.print("Enter name of student: ");
				sc.nextLine();
				String name1 = sc.nextLine();
				System.out.print("Enter id of student: ");
				String id1 = sc.nextLine();
				s = new Student(name1, id1);
				break;
			case 3:
				System.out.print("Enter id of student: ");
				String id2 = sc.nextLine();
				s = new Student(id2);
				break;

			}
			break;
		case 2:
			int ch3;
			System.out.println("1.Display profile ");
			System.out.println("2.Display profile with year");
			System.out.print("Enter choice: ");
			ch3 = sc.nextInt();
			switch (ch3) {
			case 1:
				if (s != null)
					s.display();
				else
					System.out.println("No profile in db");
				break;
			case 2:
				if (s!= null) {
					System.out.println("Enter year");
					int year = sc.nextInt();
					s.display(year);
				} 
				else
					System.out.println("No profile in db");
				break;
			}
			break;
			
		case 3:
			ans=false;
			System.out.println("Bye!");
			break;

		}

	}
		sc.close();

}
}
