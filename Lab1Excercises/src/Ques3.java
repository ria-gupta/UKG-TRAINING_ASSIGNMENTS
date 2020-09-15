import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		System.out.println("Enter the number of students :");
		Scanner r=new Scanner(System.in);
		int n=r.nextInt();
		int [] arr=new int [n];
		int sum=0;
		for(int i=0;i<n;i++)
		{


			System.out.println("Enter the grade of student "+(i+1)+":");
			
			int temp=r.nextInt();
			if(temp<=100&&temp>=0)
				{
				arr[i]=temp;
				sum+=arr[i];
				}
			else
			{
				System.out.println("Invalid Grade! Try Again...");
				i--;
			}
			
		}
		
       System.out.println("The Averag is: "+(double)sum/(double)n);   
       r.close();
       
	}

}
