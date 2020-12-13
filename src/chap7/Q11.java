package chap7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Q11 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sample.txt"))){
			out.writeObject(new SerializableSample());
		}

//		SerializableSample sample;
//		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("sample.txt"))){
//			sample = (SerializableSample) in.readObject();
//		}
//		System.out.println(sample);
	}
}
