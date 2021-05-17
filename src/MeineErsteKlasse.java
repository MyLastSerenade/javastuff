
public class MeineErsteKlasse {

	public static void main(String[] args) {
		final float pi = 3.14f;
		byte radius = 50;
		float flaechenInhalt = 0f;
		float kreisUmfang = 0f;
		final String qm = "qm";
		final char meter = 'm';
		
		flaechenInhalt = radius * radius *pi;
		System.out.println("Der Flächeninhalt des Kreises mit dem Radius 50m ergibt " + 
		(int)flaechenInhalt + qm);
		kreisUmfang = 100 * pi;
		System.out.println("Der Kreisumfang bei Durchmesser 100"+ meter + " ergibt " + 
		(int)kreisUmfang + meter);
		
	}	
		 
	
}

