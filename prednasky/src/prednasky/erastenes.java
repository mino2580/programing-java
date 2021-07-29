package prednasky;

public class erastenes {	

	/*Eratosthenovo sito
     * @param upperBound horni mez, prvni cislo, ktere jiz 
     * nebude vyhodnoceno
     */
    public static void sieveOfEratosthenes(int upperBound){
        boolean[] sieve = new boolean[upperBound];
        //V okam�iku, kdy pole vytvo��me, tak jsou jeho hodnoty p�ednastaveny 
        //do v�choz�ho stavu. V p��pad� celo��seln�ch typ� se jedn� o hodnotu 0,
        //u typu boolean o hodnotu false, a v p��pad� referenc� o ukazatel do pr�zdna
        //null.
        //jsme v jave, inicializovano rovnou na false
        //true == je slozene
        //false == je prvocislo
        
          sieve[0] = sieve[1] = true; //nula a jedna nejsou prvocisla
        for(int i = 2; i <= Math.sqrt(sieve.length); i++){
            if(sieve[i] == true) continue;
            for(int j = 2*i; j < sieve.length; j += i){ //samotne citani
                sieve[j] = true; //nemuze byt z definice prvocislem (je nasobkem jineho cisla)
            }
        }
        
        printSieve(sieve); //na zaver vypiseme prvocisla
    }

    /**
     * Vypise obsah sita
     * @param sieve sito true == je slozene, false == je prvocislo
     */
    private static void printSieve(boolean[] sieve) {
        System.out.println("Prvocisla do cisla " + sieve.length);
        for (int i = 2; i < sieve.length; i++) {
            if(sieve[i] == false) System.out.print(i + " ");      
        }
    }


	public static void main(String argv[]) {
		sieveOfEratosthenes(100);
		
	}

/*****************************************end**************************/
}
