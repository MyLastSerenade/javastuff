
public class alter_filmauswahl {

	public static void main(String[] args) {
		int age = 21;
		boolean brony = true;
		String[] movies = {"Starship Troopers", "Pulp fiction", "The Big Lebowsky", "My Littly Pony"};
		
		if(age < 12) {
			System.out.println("Der Film ist genau das richtige für Sie! " + movies[3]);
		} else if(age < 16) { 
			System.out.println("Der Film ist genau das richtige für Sie! " + movies[2]);
		} else if(age <= 18) { 
			System.out.println("Der Film ist genau das richtige für Sie! " + movies[1]);
		} else if(age > 18 && !brony){ 
			System.out.println("Der Film ist genau das richtige für Sie! " + movies[0]);
	    } else if(age > 18 && brony) {
	    	System.out.println("Der Film ist genau das richtige für Sie! " + movies[3]);
	    }
   }
}
