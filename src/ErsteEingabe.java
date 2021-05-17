import java.util.Scanner;

public class ErsteEingabe {

	public static void main(String[] args) {
		int x = 0;
		Scanner  eingabe = new Scanner(System.in);
		
		System.out.println("Zur Zeit ist x = "  + x);
		System.out.println("Wie möchten sie die Variable erhöhen?");
		System.out.println("1. +1");
		System.out.println("1. x++");
		System.out.println("1. ++x");
		
		String operator = eingabe.next();
		
		if(operator.equals("+1")) {
			x = 0 + 1;
			System.out.println("x ist = " + x);
		} else if(operator.equals("x++")) {
			x++;
			System.out.println("x ist = " + x);
		} else if(operator.equals("++x")) {
			++x;
			System.out.println("x ist = " + x);
		}
		
		eingabe.close();
	}

}
