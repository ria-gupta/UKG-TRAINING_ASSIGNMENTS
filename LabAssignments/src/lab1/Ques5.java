package lab1;

public class Ques5 {
	public static void printPattern(int n)
	{
		
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPattern(8);

	}

}

