import java.util.Scanner;

public class booleans {

	public static void main(String[] args) {
		boolean licht;
		boolean strom;
		boolean schalter;
		
		
		Scanner finger = new Scanner(System.in);
		
		System.out.println("Der Strom ist aus, m�chten sie den Strom anschalten?");
		System.out.println("true f�r ja");
		System.out.println("false f�r nein");
		
		String stromschalter = finger.next();
		if(stromschalter.equals("true")) {
			schalter = true;
		} else { schalter = false;}
		
		System.out.println(schalter);
		
		System.out.println("Der Schalter ist aus, m�chten sie den Schalter umlegen?");
		System.out.println("true f�r ja");
		System.out.println("false f�r nein");
		
		String stromschalter2 = finger.next();
		if(stromschalter2.equals("true")) {
			strom = true;
		} else { strom = false;}
		
		System.out.println(strom);
		
		if(strom && schalter) {
			licht = true;
			System.out.print("Es werde Licht! " + licht);
		} else { System.out.print("Requirement not met.");}
		finger.close();

	}

}
	
