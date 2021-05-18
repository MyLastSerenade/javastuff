public class doubledicecouter {
        // So lange mit einem "Würfel" würfeln, bis eine 6 heraus kommt, anschließend die Summe der bisherigen Augen herausgeben.
        //Zusatz: Mit zwei Würfeln würfeln, sobald ein Pasch kommt, die bisherige Summe verdoppeln (bitte als Methode)
        public static void main(String [] args) {
            int counter = 0;
            int augenSumme = 0;
            int diceMin = 1;
            int diceMax = 7;
            int diceRoll1;
            int diceRoll2;
            do {
                diceRoll1 = (int)(Math.random()*(diceMax - diceMin)) + diceMin;
                diceRoll2 = (int)(Math.random()*(diceMax - diceMin)) + diceMin;
                augenSumme += diceRoll2;
                augenSumme += diceRoll1;
                if (diceRoll1 == diceRoll2){
                    System.out.println("PASCH");
                    augenSumme *= 2;
                } 

                counter++;
                System.out.println("Durchgang " + counter  +  " Zuletzt gewürfelte Zahl: " + diceRoll1 + " und " + diceRoll2 + " || " + " aktuelle augensumme: " + augenSumme);
        
           } while (diceRoll1 != 6 && diceRoll2 != 6);
        } 
    }

