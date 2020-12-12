package chap7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Q12_1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out.ser"))){
			Foo foo = new Foo(1, 2, 3);
			out.writeObject(foo);

		}
	}
}
