package lab4.ques1;

import java.io.*;

public class FileByte {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream(new File("data.txt"))) {
			StringBuilder s = new StringBuilder();
			int data;
			System.out.println("Byte Format Output:");
			while ((data = fis.read()) != -1) {
				System.out.print(data + " ");
				s.append((char) data);
			}
			System.out.println("\nFormatted Output:");
			System.out.println(s.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
