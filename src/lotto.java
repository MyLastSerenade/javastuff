
public class lotto {
	public static void main(String[] args) {
		int zahlen[] = new int[6];

		int max = 49;
		int min = 1;

		int lottoZahl;

		int buffer = 0;

		boolean sorted = false;
		//boolean unique = false;

		for (int i = 0; i < 6; i++) {
			lottoZahl = (int) (Math.random() * (max - min)) + min; // lottoZahl wird zuf�llig generiert
			for (int j = 0; j < i; j++) {

				if (zahlen[j] == lottoZahl) // Schleife geht durch das array und sucht nach einem Duplikat
				{
					System.out.println(zahlen[j] + " und " + lottoZahl + " sind identisch");
					lottoZahl = (int) (Math.random() * (max - min)) + min;// Wurde ein Duplikat gefunden, wird eine neue
																			// zuf�llige Zahl generiert
					j = -1; // hat if gegriffen wird wieder der loop eine iteration zur�ckgesetzt und es
							// wird wieder auf duplikate gecheckt.
				}

			}
			zahlen[i] = lottoZahl;
			for (int number : zahlen) {
				System.out.print(number + " ");
			}
			System.out.println();
		}

		do {
			sorted = true;
			for (int i = 0; i < zahlen.length - 1; i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					buffer = zahlen[i + 1];
					zahlen[i + 1] = zahlen[i];
					zahlen[i] = buffer;
					sorted = false;
				}
			}
		} while (!sorted);

		for (int number : zahlen) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
