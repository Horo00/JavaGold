package exception;

import java.io.PrintStream;

public class Main {

	public static void main(String[] args) throws Exception,Myexception {
		PrintStream out = new PrintStream(System.out);

		out.println("a");
	}
}
