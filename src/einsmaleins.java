import java.util.Scanner;

public class einsmaleins {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		/*System.out.println("Welche Zahl möchten Sie im 1x1 rechnen? Bitte geben sie ein: ");
		int zahl = input.nextInt();
		int Ergebnis; */
		long startTime = System.currentTimeMillis();
		
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= 100; j++) {
			System.out.print("\t" + j* i);
			} 
			System.out.println("");
		}
		
		input.close();
		
		float estimatedTime = System.currentTimeMillis() - startTime;
		estimatedTime = (float) (estimatedTime/1_000_000_000.0);
		/*estimatedTime = (float) (estimatedTime + 0.005);
		estimatedTime = (int)(estimatedTime*1000);
		estimatedTime = estimatedTime/1000;*/
		System.out.print(estimatedTime);
	} 

}
