public class Fib {
	public static void ma1n(String[] args) {
		System.out.println(fib(100));
	}

	public static int fib(int fibNumber) {
		switch (fibNumber) {
			case 0:
				return 0;
			case 1:
				return 1;
		}

		int n = 0;
		int n1 = 1;
		int n2 = 0;

		for (int i = 2; i < fibNumber + 1; i++) {
			n2 = n1;
			n = n1 + n2;
			n1 = n;
		}

		return n;
	}
}
