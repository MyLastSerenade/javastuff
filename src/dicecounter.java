public class dicecounter {
    // So lange mit einem "Würfel" würfeln, bis eine 6 heraus kommt, anschließend die Summe der bisherigen Augen herausgeben.
    public static void main(String [] args) {
        int counter = 0;
        int augenSumme = 0;
        int wuerfel;
        int diceMin = 1;
        int diceMax = 7;

        do {
            int diceRoll = (int)(Math.random()*(diceMax - diceMin)) + diceMin;
            wuerfel = diceRoll;
            augenSumme += wuerfel;
            counter++;
            System.out.println("Durchgang " + counter  +  " Zuletzt gewürfelte Zahl: " + wuerfel + " || " + " aktuelle augensumme: " + augenSumme);
    
        } while (wuerfel != 6);

    } 
}