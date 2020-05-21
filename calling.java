public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World its java");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}
