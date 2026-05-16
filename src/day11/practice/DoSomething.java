package day11.practice;

public class DoSomething {
	public static void main(String[] args) {
		new DoSomething().go();
	}

	public void go() {

		try {
			System.out.print("A");
			stop();
		} catch (ArithmeticException e) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public void stop() {
		System.out.print("E");
		Object x = null;
		x.toString();
		System.out.print("F");

	}
}
