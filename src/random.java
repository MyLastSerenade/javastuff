import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Spieler 1 bitte w�hlen sie Ihre Zahl!");
		byte spieler1 = input.nextByte();
		System.out.println("Spieler 2 bitte w�hlen sie Ihre Zahl!");
		byte spieler2 = input.nextByte();
		
		System.out.println("Spieler 1 hat " + spieler1 + " gew�hlt");
		System.out.println("Spieler 2 hat " + spieler2 + " gew�hlt");
		
		int zahl = 100;
		//int gewinnChance = 42;
		
		System.out.println("Der Spieler der am n�chsten an der Zuf�lligen Zahl ist hat gewonnen!");
		double randomValue = Math.random();
		randomValue = randomValue * zahl;
	
		double closer = Math.abs(randomValue - spieler2) < Math.abs(randomValue - spieler1) ? spieler1 : spieler2;
		
		if(closer == spieler1) {
			System.out.print("Spieler 1 mit der Zahl " + (int)closer + " hat gewonnen!");
		} else { System.out.print("Spieler 2 mit der Zahl " + (int)closer + " hat gewonnen!");}
		input.close();
	}

}
