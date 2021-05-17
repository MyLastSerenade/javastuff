import java.util.Scanner;
public class Rechner {
	public static void main(String[] args) {
		boolean rechner = true;
		Scanner input = new Scanner(System.in);
		while(rechner) {
			String addition = "+", substraction = "-", division = "/", multi = "*";
			
			System.out.println("Bitte geben sie die erste Zahl der Berechnung ein");
			int Zahl1 = input.nextInt();
			System.out.println("Bitte geben sie die zweite Zahl der Berechnung ein");
			int Zahl2 = input.nextInt();
			System.out.println("Bitte geben sie einen der folgenden Operatoren ein: " 
			+ addition 	+ " ," + substraction + " ," +division + " ," + multi);
			String operator = input.next();
			System.out.println("Der gewählte Operator ist " + operator);
			
			if(operator.equals(addition)) {
				System.out.println("Das Ergebnis ist: " + (Zahl1 + Zahl2));
			} else if(operator.equals(substraction)) {
				System.out.println("Das Ergebnis ist: " + (Zahl1 - Zahl2));
			} else if(operator.equals(division)) {
				System.out.println("Das Ergebnis ist: " + (Zahl1 / Zahl2));
			} else if(operator.equals(multi)) {
				System.out.println("Das Ergebnis ist: " + (Zahl1 * Zahl2));
			} else { System.out.print("Das war keine valider Operator, bitte starten sie neu");}
			
			System.out.println("Möchten sie noch eine Berechnung? ja/nein");
			String jaNein = input.next();
			if(jaNein.equals("ja")) {
				rechner = true;
			} else { rechner = false;}
			
			
		}
		input.close();
	}
}
