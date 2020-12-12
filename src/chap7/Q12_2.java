package chap7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q12_2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.ser"))){
			Foo foo =(Foo)in.readObject();
			System.out.println(foo);
		}
	}
}
