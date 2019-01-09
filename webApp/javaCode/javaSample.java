public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		logger.log("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}
