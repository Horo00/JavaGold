package chap7;

import java.io.Console;
import java.io.Serializable;
import java.nio.file.FileSystems;

public class ConsoleSample implements Serializable{
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			String line = console.readLine();
			return ;
		}
		System.out.println(console);
		
		System.out.println(System.out);

//		console.readPassword("Password:");
		System.out.println(FileSystems.getDefault());
	}
}
