import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Bitte geben sie eine Zahl ein!");
		int n = input.nextInt();

		System.out.println(fib(n));
		System.out.println(fact(n));
		input.close();
	}
	

	public static int fact(int f) {
		if (f >= 1) {
			return f * fact(f - 1);
		} else
			return 1;
	}

	public static int fib(int f) {
		if (f >= 3) {
			return fib(f-1) + fib(f - 2) ;
		} else
			return 1;
	}

}
