package it_kolekce;
/*Ud�lejme si op�t trivi�ln� uk�zku, budeme evidovat cestuj�c� v autobusu, 
 * mno�ina za n�s bude sama �e�it aby v autobusu nebyl n�jak� cestuj�c� 2x.
 * 

P�idejme si k projektu novou t��du Cestujici, bude velmi jednoduch�:*/

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
