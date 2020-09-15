
public class Ques2 {
	
	public static void printTimeTable(int n1,int n2)
	{
		System.out.print("*| ");
		
		for(int i=1;i<=n1;i++)
			System.out.print(i+" ");
		System.out.println("");
		System.out.println("--------------------");
		//System.out.println("");
		//for(int i=1;i<=n2;i++)
			
		
		for(int i=1;i<=n1;i++)
		{
		System.out.print(i+"|");
			for(int j=1;j<=n2;j++)
			{
				
				System.out.print(" "+i*j);
				
			}
			System.out.println("");
		}
	   
		
		
	}

	public static void main(String[] args) {
		
           printTimeTable(9, 9);
	}

}
