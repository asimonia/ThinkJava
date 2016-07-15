class NewLine {

	public static void newLine() {
		System.out.println("");
	}

	public static void threeLine() {
		for(int i = 0; i <= 3; i++) {
			newLine();
		}
	}

	public static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	}

	public static void printTime(int hour, int minute) {
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute + "\n");
	}

	public static int addTwo(int x, int y) {
		// Add x and y and return an int
		return x + y;
	}

	public static double subtractTwo(double x, double y) {
		// Subtract x and y and return a double
		return x - y;
	}

	public static void addAndSub() {
		System.out.println(addTwo(4, 2));
		System.out.println(subtractTwo(24.212, 4.000));
	}

	public static void main(String[] args) {
		System.out.print("First line!");
		threeLine();
		printTwice("Howdy!");
		printTime(2, 30);
		addAndSub();
		System.out.print("\nNot your first line!\n");
	}
}