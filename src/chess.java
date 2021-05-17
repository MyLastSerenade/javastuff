
public class chess {
	public static void main(String[] args) {
		char x = 65;
		char leer = 0;
		byte y = 8;
		
		String b = "b";
		String w = "w";

		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
			if (i == 0 && j == 0) {
				System.out.print(leer);
			} else if (i == 0) {
					System.out.print(x);
					x += 1;
				} else if (j == 0) {
					System.out.print(y);
						y -= 1;
				} else if ((j + i) % 2 == 0) {
					System.out.print(w);
				} else if ((j + i) % 2 != 0) {
					System.out.print(b);
				}
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
}
