package it_kolekce;
/*Udìlejme si opìt triviální ukázku, budeme evidovat cestující v autobusu, 
 * množina za nás bude sama øešit aby v autobusu nebyl nìjaký cestující 2x.
 * 

Pøidejme si k projektu novou tøídu Cestujici, bude velmi jednoduchá:*/

public class Cestujici {
	
    private final String jmeno;
    private final String prijmeni;

    public Cestujici(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni;
    }
    
    ////////////////////////////////////////////////////////////////
}
