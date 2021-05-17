
public class booleans4 {

	public static void main(String[] args) {
		boolean satt;
		boolean vorspeise = true;
		boolean steak = false;
		boolean nachspeise = true;
		int getraenke = 3;
		int kartoffeln = 3;
		
		if(vorspeise && getraenke >= 3 && kartoffeln >= 2 && steak || nachspeise) {
			satt = true;
			System.out.print("Sie sind Satt" + satt);
		} else { satt = false; System.out.print("Sie haben noch hunger" + satt);}
	
	}

}
	
