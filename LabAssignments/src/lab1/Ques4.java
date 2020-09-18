package lab1;

public class Ques4 {

	
	public static int[] copyOf(int[] arr)
	{
		int[] copy=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			copy[i]=arr[i];
		}
		
		return copy;
		
	}
	public static void main(String[] args) {
	
		int[] arr= {1,2,3,4,5};
		int [] copy=copyOf(arr);
		arr=null;
		for(int i=0;i<copy.length;i++)
		{
			System.out.println(copy[i]);
		}

	}

}
