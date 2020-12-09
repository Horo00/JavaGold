package chap5;

public class AutoCloceSample implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("close");

	}

}
