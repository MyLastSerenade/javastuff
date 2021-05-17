import java.util.Scanner;

public class alter_name_geschlecht {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		byte age;
		String name;
		String gender;
		
		System.out.println("Bitte geben Sie Ihre Alter ein: ");
		age = input.nextByte();
		System.out.println("Bitte geben Sie Ihren Namen ein: ");
		name = input.next();
		System.out.println("Bitte geben Sie Ihre Geschlecht ein (m/w/d): ");
		gender = input.next();
		
		input.close();
		
		if(age > 16) {
			if(gender.equals("w")) {
				System.out.print("Guten Tag Frau " + name + "!");
			} else if (gender.equals("m")) {
				System.out.print("Guten Tag Herr " + name + "!");
			} else if (gender.equals("d")) {
				System.out.print("Guten Tag " + name + "!");
		} 
		} else {System.out.print("Hallo " + name);}
		
		
	}
}
