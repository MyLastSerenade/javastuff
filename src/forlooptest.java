import java.util.Scanner;

public class forlooptest {

	//Test des Strukotogram aus der Klausur
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("zahl w�hlen");
		
		int zahl = sc.nextInt();
		int ergebnis = 1;
		
		for(int i = 1; i >= zahl; i++) {
			ergebnis = ergebnis * i;
			System.out.println(ergebnis);
		}
	}

}
