import java.util.Scanner;

public class aufgabeseitesieben {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben sie eine Zahl ein :");
		int number = input.nextInt();
		int numbertwo;
		
		numbertwo = number % 2;
		
		//System.out.println(number);
		
		if(numbertwo == 0) {
			number /= 2;
			System.out.print(number);
		} else {
			number +=3;
			System.out.print(number);
		}
		input.close();
	}

}
