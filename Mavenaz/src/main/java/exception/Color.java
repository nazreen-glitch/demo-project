package exception;

public class Color {

	public static void main(String[] args) {
		try {
			int a = 100/0;
		}
		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("the color is purple");
		}
		finally {
			System.out.println("the sky is blue");
		}
	}

}
