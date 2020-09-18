package Que5;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		boolean ans=true;
		while(ans)
		{
			int ch;
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Create a Vehicle object");
			System.out.println("2. Create a Car object");
			System.out.println("3. Create a Convertible object");
			System.out.println("4. Create a SportsCar object");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			
			if(ch==1) {
				System.out.print("Enter No of wheels :");
				sc.nextLine();
				int wheels=sc.nextInt();
				System.out.print("Enter No of Pasenger :");
				int passenger=sc.nextInt();
				System.out.print("Enter the Make :");
				sc.nextLine();
				String make=sc.nextLine();
				System.out.print("Enter the model :");
				int model=sc.nextInt();
				Vehicle v=new Vehicle(wheels, passenger, model, make);
				v.display();}
			else if(ch==2) {
				System.out.print("Enter No of wheels :");
				sc.nextLine();
				int wheels=sc.nextInt();
				System.out.print("Enter No of Pasenger :");
				int passenger=sc.nextInt();
				System.out.print("Enter the Make :");
				sc.nextLine();
				String make=sc.nextLine();
				System.out.print("Enter the model :");
				int model=sc.nextInt();
				System.out.print("Enter No of Doors :");
				int doors=sc.nextInt();
				Car c=new Car(wheels, passenger, model, make, doors);
				c.display();}
			else if(ch==3) {
				System.out.print("Enter No of wheels :");
				sc.nextLine();
				int wheels=sc.nextInt();
				System.out.print("Enter No of Pasenger :");
				int passenger=sc.nextInt();
				System.out.print("Enter the Make :");
				sc.nextLine();
				String make=sc.nextLine();
				System.out.print("Enter the model :");
				int model=sc.nextInt();
				System.out.print("Enter No of Doors :");
				int doors=sc.nextInt();
				System.out.println("Is hood open(true/false)");
				boolean isHoodOpen=sc.nextBoolean();
				Convertible v=new Convertible(wheels, passenger, model, make,doors,isHoodOpen);
				v.display();
			}
			else if(ch==4) {
				System.out.print("Enter No of wheels :");
				sc.nextLine();
				int wheels=sc.nextInt();
				System.out.print("Enter No of Pasenger :");
				int passenger=sc.nextInt();
				System.out.print("Enter the Make :");
				sc.nextLine();
				String make=sc.nextLine();
				System.out.print("Enter the model :");
				int model=sc.nextInt();
				SportsCar v=new SportsCar(wheels, passenger, model, make);
				v.display();
			}
			else
			{
				ans=false;
				
			}
			sc.close();
		}

	}

}
