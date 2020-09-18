package lab1;

public class Ques1 {
	static int sum = 1;

	static void fibAvg(int limit) {
		int n1 = 0, n2 = 1;
		int count = 0;
		while (count <= limit) {
			sum += n1;
			System.out.print(n1 + " ");

			int n3 = n1 + n2;

			n1 = n2;
			n2 = n3;

			count++;
		}
	}

	public static void main(String[] args) {

		int n = 20;

		fibAvg(n);
		double avg = (double)sum/20.0;
		System.out.println("");
		System.out.println("Average =" + avg);

	}

}
