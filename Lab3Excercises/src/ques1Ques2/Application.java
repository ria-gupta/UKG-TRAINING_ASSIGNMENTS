package ques1Ques2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;

public class Application {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		List<Invoice> list = new ArrayList<>();
		emps.add(new WeeklyEmp(120, "Rajesh"));
		emps.add(new WeeklyEmp(121, "Mukesh"));
		emps.add(new HourlyEmp(122, "Suresh", new BigDecimal(40)));
		emps.add(new HourlyEmp(123, "Bhavesh", new BigDecimal(70)));
		emps.add(new CommissionEmp(124, "Ramesh", new BigDecimal(400)));
		emps.add(new CommissionEmp(125, "Brijesh", new BigDecimal(550)));
		list.add(new Invoice("200", "Brown Chair", 4, new BigDecimal(100)));
		list.add(new Invoice("201", "Yellow Book", 10, new BigDecimal(30)));
		list.add(new Invoice("202", "Sofa Set", 2, new BigDecimal(500)));
		boolean ans = true;
		while (ans) {
			int ch;
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Set salary Rate");
			System.out.println("2.Get Weekly Salary");
			System.out.println("3.Increase Salary rate");
			System.out.println("4.Get Net Payment Amount");
			System.out.println("5.Exit");
			System.out.println("Enter choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Employee Id: ");
				int id = sc.nextInt();
				boolean exist = false;
				for (Employee temp : emps) {
					if (id == temp.getId()) {
						System.out.println("Enter the salary rate");
						BigDecimal rate = sc.nextBigDecimal();
						temp.setRate(rate);
						System.out.println("The salary rate has been updated!");
						exist = true;
						break;
					}

				}
				if (!exist)
					System.out.println("Invalid Id");
				break;

			case 2:

				System.out.println("Enter Employee Id: ");
				int id2 = sc.nextInt();
				boolean exist1 = false;
				for (Employee temp : emps) {
					if (id2 == temp.getId()) {
						BigDecimal salary = temp.getSalary();
						System.out.println("The weekly salary is:" + salary);
						exist1 = true;
						break;
					}
				}
				if (!exist1)
					System.out.println("Invalid Id");
				break;

			case 3:

				System.out.println("Enter Employee Id: ");
				int id3 = sc.nextInt();
				boolean exist3 = false;
				for (Employee temp : emps) {
					if (id3 == temp.getId()) {
						System.out.println("Enter the increment value:");
						BigDecimal increment = sc.nextBigDecimal();
						temp.increaseSalary(increment);
						System.out.println("The new rate is:" + temp.getRate());
						exist3 = true;
						break;
					}

				}
				if (!exist3)
					System.out.println("Invalid Id!!");

				break;

			case 4:
				System.out.println("1.Employee Invoice");
				System.out.println("2.Product Invoice");
				System.out.println("Enter Choice");
				int ch3 = sc.nextInt();
				if (ch3 == 1) {
					System.out.println("Enter Employee Id");
					int empid = sc.nextInt();
					boolean exist4 = false;
					for (Employee temp : emps) {
						if (empid == temp.getId()) {
							System.out.println("Enter the increment value:");
							BigDecimal t1=temp.getPayment();
							System.out.println("Net Payable Salary is:"+t1);

							exist3 = true;
							break;
						}

					}
					if (!exist4)
						System.out.println("Invalid Id!!");
				}
				else if(ch3 == 2) {
					System.out.println("Enter Invoice Id");
					String invid = sc.nextLine();
					boolean exist4 = false;
					for (Invoice temp : list) {
						if (invid.equals(temp.getPartNum())) {
							BigDecimal t=temp.getPayment();
                            System.out.println("Net Payable Amount is:"+t);
							exist3 = true;
							break;
						}

					}
					if (!exist4)
						System.out.println("Invalid Id!!");
				}

			case 5:
				ans = false;
				System.out.println("Bye!");
				break;

			}

		}

	}
}
