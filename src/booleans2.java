
public class booleans2 {

	public static void main(String[] args) {
		boolean fahren = false;
		boolean zuendschluessel = true;
		boolean handbremse = false;
		
		if(zuendschluessel && !handbremse) {
			fahren = true;
			System.out.print("Brumm Brumm " + fahren);
		} else { System.out.print("Requirement not met. " + fahren);}
		

	}

}
	
