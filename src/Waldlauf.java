import java.util.Scanner;

public class Waldlauf {

	public static void main(String[] args) {
		byte zuege = 0;
		byte leben = 3;
		int min = 1;
		int max = 10;
		
		String f = "Fuettern";
		String s = "Streicheln";
		String m = "Mit dem Stock schlagen";
		
		String[][] ereignis = new String[11][11];
		ereignis[1][0] = "den Foerster";
		ereignis[2][0] = "das Reh";
		ereignis[3][0] = "den Jeep vom Foerster";
		ereignis[4][0] = "das Krokodil";
		ereignis[5][0] = "den Loewe";
		ereignis[6][0] = "He-Man";
		ereignis[7][0] = "Dr. Snuggels";
		ereignis[8][0] = "die Teletubbies";
		ereignis[9][0] = "den Hulk";
		ereignis[10][0] = "die Gummibaerenbande";
		
		ereignis[0][1] = m;
		ereignis[0][2] = f;
		ereignis[0][3] = s;
		ereignis[0][4] = f;
		ereignis[0][5] = f;
		ereignis[0][6] = m;
		ereignis[0][7] = m;
		ereignis[0][8] = s;
		ereignis[0][9] = s;
		ereignis[0][10] = f;

		Scanner input = new Scanner(System.in);
			
		System.out.println("Willkommen beim Waldlauf!");
		System.out.println("In diesem Spiel l�ufst du durch einen dunklen Wald.");
		System.out.println("Du wirst Sachen begenen die du Aufgrund der Dunkelheit nicht erkennen kannst.");
		System.out.println("Erst Wenn du deine Begenung fuetterst, streichelst oder mit dem Stock haust,");
		System.out.println("siehst du was die Begenung war und wie es weitergeht.");
		System.out.println("Aber Achtung, manche Begenungen sind dir nicht gesonnen und du hast nur 3 Leben!");
		
		
		while(zuege <= 10 && leben > 0) {
			String stats = "Du hast noch " + leben + " Leben �brig. Du bist schon " + zuege + " von 10 Zuegen durch den Wald gegangen!";
			System.out.println(stats);
			System.out.println("Du gehst durch den dunklen Wald und bemerkst etwas vor dir,");
			System.out.println("was moechtest du tuen?");
			System.out.println("1) es f�ttern");
			System.out.println("2) es streicheln");
			System.out.println("3) es mit dem Stock schlagen");
			int randomNumber;
			int auswahl = input.nextInt();
			switch (auswahl) {
			case 1:
				System.out.println(f);
				randomNumber = (int)(Math.random()*(max - min)) + min;
				System.out.println("Du fuetterst " + ereignis[randomNumber][0]);
				if(f == (ereignis[0][randomNumber])) {
					System.out.println("Da hast du aber Gl�ck das es Hunger hatte! Nun wo es abgelenkt ist, geh weiter durch den Wald!");
					zuege++;
				} else { System.out.println("Das ging in die Hose du verlierst ein Leben!");
				leben--;
				zuege++;
				}
				break;
			case 2:
				System.out.println(s);
				randomNumber = (int)(Math.random()*(max - min)) + min;
				System.out.println("Du streichelst " + ereignis[randomNumber][0]);
				if(s == (ereignis[0][randomNumber])) {
					System.out.println("Wie weich es sich anf�hlt, oder? Nun aber genug es geht weiter!");
					zuege++;
				} else { System.out.println("Das ging in die Hose du verlierst ein Leben!");
				leben--;
				zuege++;
				}
				break;
			case 3:
				System.out.println(m);
				randomNumber = (int)(Math.random()*(max - min)) + min;
				System.out.println("Du schl�gst " + ereignis[randomNumber][0] + " mit dem Stock");
				if(m == (ereignis[0][randomNumber])) {
					System.out.println("Du konntest " + ereignis[randomNumber][0] + " au�er gefecht setzen und l�ufst weiter in den Wald!");
					zuege++;
				} else { System.out.println("Das ging in die Hose du verlierst ein Leben!");
				leben--;
				zuege++;
				}
				break;
			default: 
				System.out.println("Keine g�ltige Eingabe, bitte w�hlen Sei eine Eingabe von 1-3 aus.");
			}
			
		}
		if(leben < 3) {
			System.out.println("Du hast verloren! Du hast " + zuege + " geschafft!");
		} else { System.out.println("Du hast es durch den Wald geschafft und das Spiel gewonnen!");}
		input.close();
	}
	

}
