

public class parser {

	public static void main(String[] args) {
		String zeichenkette = "Hans;Werner;Hanswernerstr. 7;59368;Werner";
		//String[] arr  = zeichenkette.split(";");
	
		

		while (zeichenkette.indexOf(';') > 0) {
			System.out.println(zeichenkette.substring(0,zeichenkette.indexOf(';')));
			
			zeichenkette = zeichenkette.substring(zeichenkette.indexOf(';')+1,zeichenkette.length());
		}
		
		System.out.println(zeichenkette);
		
		
		
		
		
		/*for(String ch: arr) {
			System.out.println(ch);
		}*/

	}

}




