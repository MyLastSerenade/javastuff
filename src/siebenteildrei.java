import java.util.Scanner;

public class siebenteildrei {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bitte w�hlen sie zum Fr�hst�ck : ");
		System.out.println("Brot 1");
		System.out.println("M�sli & Jogurt 2");
		System.out.println("Unentschlossen 3");
		int auswahl = input.nextInt();
		
		switch (auswahl) {
		case 1:
			System.out.println("Sie erhalten ein Messer");
			break;
		case 2:
			System.out.println("Sie erhalten einen L�ffel");
			break;
		case 3:
			System.out.println("Sie erhalten ein Messer und einen L�ffel");
			break;
		default: 
			System.out.println("Keine g�ltige Eingabe, bitte w�hlen Sei eine Eingabe von 1-3 aus.");
		}
		input.close();
	}
}
