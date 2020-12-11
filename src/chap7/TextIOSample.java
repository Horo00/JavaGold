package chap7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextIOSample {

	public static void main(String[] args) {
//		try(FileReader in = new FileReader("sample.txt");
//				FileWriter out = new FileWriter("copy.txt")){
//			int ch;
//			while ((ch = in.read()) != -1) {
//				out.write((char)ch);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}
		
		try(BufferedReader in = new BufferedReader(new FileReader("sample.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("copy.txt"))){
			String line;
			while ((line = in.readLine()) != null) {
				out.write(line);
				out.newLine();
			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
