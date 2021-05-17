
public class buublesort {

	public static void main(String[] args) {
		int[] zahlen = new int[8];
		
		zahlen[0] = 28;
		zahlen[1] = 18;
		zahlen[2] = 49;
		zahlen[3] = 40;
		zahlen[4] = 57;
		zahlen[5] = 86;
		zahlen[6] = 12;
		zahlen[7] = 33;

		int buffer = 0;
		boolean sorted = false;

		
		//java.util.Arrays.sort(zahlen);
		
		
		do {
			sorted = true;
			for (int i = 0; i < 7; i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					buffer = zahlen[i + 1];
					zahlen[i + 1] = zahlen[i];
					zahlen[i] = buffer;
					sorted = false;
				}
				System.out.println(zahlen[i + 1]);
			}
		} while (!sorted); 
		
			System.out.print(zahlen[0] + " ist die kleinste Zahl und " + zahlen[zahlen.length-1] + " ist die größte Zahl!");

	}

}
