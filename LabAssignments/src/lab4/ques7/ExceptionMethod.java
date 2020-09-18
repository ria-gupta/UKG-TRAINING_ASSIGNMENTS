package lab4.ques7;

import java.io.*;

class InputException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InputException(int n) {
		super("Number can't be greater than " + n);
	}
}

public class ExceptionMethod {
	public static void throwException() throws InputException, IOException {
	}

	public static void main(String[] args) {
		try {
			throwException();
		} catch (InputException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}