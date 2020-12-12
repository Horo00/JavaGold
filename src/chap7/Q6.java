package chap7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q6 {

	public static void main(String[] args) {
		try(BufferedReader in = new BufferedReader(new FileReader("sample.txt"))){
//			for(int i = 0; i < 3 ; i++) {
//				in.skip(i);
//				System.out.println((char)in.read());
//			}
			System.out.println((char)in.read());
			System.out.println((char)in.read());
			System.out.println((char)in.read());
			in.mark(30);
			System.out.println(in.readLine());
			in.reset();
			System.out.println((char)in.read());
			in.reset();
			System.out.println((char)in.read());
			System.out.println((char)in.read());
			in.reset();
			System.out.println(in.readLine());
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
