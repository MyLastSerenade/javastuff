
public class ArrayUebung {

	public static void main(String[] args) {
		String[][] mitarbeiterNamen = {{"Frau", "Gaby", "Gabel"},
				{"Herr", "Jock", "Sporrow"},
				{"Gandel", "Gukelei", ""}};


		for (int j = 0; j < 3; j++) {

			for (int i = 0; i < 3; i++) {
				System.out.print(mitarbeiterNamen[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
