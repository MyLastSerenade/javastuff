import java.util.Scanner;

public class siebenteilzwei {
	public static void main(String[] args) {

		//int a = 4;
		//int b = 100;
		//int c = 400;
		int d = 1562;
		int e = 3000;

		Scanner input = new Scanner(System.in);

		System.out.println("Bitte geben sie die zu pr�fende Jahreszahl ein: ");
		int jahreszahl = input.nextInt();

		if (jahreszahl >= d && jahreszahl <= e) {
			int restfour = jahreszahl % 4;
			int resthundo = jahreszahl % 100;
			int resthundobutnotfourhundo = jahreszahl % 400;
			
			if (restfour == 0  && resthundo != 0) {
				 System.out.println("Schaltjahr gefunden!! " + jahreszahl);
			} else {
					if (resthundobutnotfourhundo == 0 && resthundo != 0) {
						System.out.println("Schaltjahr gefunden!! " + jahreszahl);
					} else {
						System.out.print("Kein Schaltjahr!");
					} 
			}
		} else {
			System.out.print("Bitte nehmen Sie ein Jahr zwischen " + d + " und " + e + "!");
		}

		input.close();
	}
}
