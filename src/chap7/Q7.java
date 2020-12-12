package chap7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q7 {

	public static void main(String[] args) throws IOException {
		new File("out.txt").createNewFile();
		
		try(FileWriter writer = new FileWriter("out.txt")){
			writer.write("Hello");
			writer.write(5);
			writer.write("true");
		}
	}
}
