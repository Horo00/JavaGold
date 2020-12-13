package chap7;

import java.io.File;
import java.io.IOException;

public class FileSample {
	public static void main(String[] args) {
		File file = new File("out.ser");
		try {
			System.out.println(file.createNewFile());
			System.out.println(file.exists());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getParent());
//			System.out.println(file.delete());
			System.out.println(file.exists());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.getParent());
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			System.out.println(file.isHidden());
			System.out.println(file.isAbsolute());
			System.out.println(file.length());
			System.out.println(file.list());
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
