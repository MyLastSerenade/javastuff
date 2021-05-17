
public class wuerfelspielchen {

	public static void main(String[] args) {
		int min = 1;
		int max = 6;
		int zahl = 1;
		
		 do {
			 System.out.println("Random value in int from "+min+" to "+max+ ":");
		      zahl = (int) (Math.random()*(max-min+1)+min);
		      System.out.println(zahl);
		} while (zahl != 1);
		
		

	}

}
