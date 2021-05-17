
public class booleans3 {

	public static void main(String[] args) {
		boolean raketenstart = false;
		boolean freigabe = true;
		int countdown = 10;
		
		while(countdown <= 11) {
			System.out.print(countdown);
			countdown -= 1;
			 System.out.println(" Sekunden bis zum Start");
			if(freigabe && countdown == 0) {
				raketenstart = true;
				System.out.print("SpaceX fliegt " + raketenstart); 
				break;
			}
		}
	}
}
	
