class Fermat {

	private static void checkFermat(int a, int b, int c, int n) {
		double left = Math.pow(a, n) + Math.pow(b, n);
		double right = Math.pow(c, n);

		if (left == right) {
			System.out.println("Fermat was wrong!");
		} else {
			System.out.println("Doesn't work!");
		}
	}

	public static void main(String[] args) {
		checkFermat(4, 5, 10, 7);
	}
}