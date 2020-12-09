package chap5;

public class TryWithSample {
	public static void main(String[] args) {
		try(AutoCloceSample sample = new AutoCloceSample()){
			System.out.println("try");
			
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("final");
		}
	}

}
