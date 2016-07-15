class Sample {

	static void printParity(int number) {
		// Check to see if even or odd.
		// Returns Void
		if (number % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

	static void sign(int number) {
		if (number > 0) {
			System.out.println("Number is positive");
		} else if (number < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is zero");
		}
	}

	static void printLogarithm(double x) {
		// If negative, then terminate function
		if (x <= 0.0) {
			System.out.println("Positive numbers only");
			return;
		}

		double result = Math.log(x);
		System.out.println("The log of x is " + result);
	}

	static void countdown(int n) {
		// A recursive function is a function that CALLS ITSELF
		// How does it do this without going on FOREVER?!
		// A condition is needed to terminate the function afer a finite amount of calls
		// The argument that is passed to the function inside itself will vary from the original call
		if (n == 0) {
			System.out.println("Blastoff!");
		} else {
			System.out.println(n);
			countdown(n-1);
		}
	}

	public static void main(String[] args) {
		printParity(5);
		printParity(6);
		sign(-2);
		sign(0);
		sign(2);
		printLogarithm(30.2);
		countdown(10);
	}
}