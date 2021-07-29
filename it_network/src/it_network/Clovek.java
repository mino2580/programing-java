package it_network;

public class Clovek {

	 /**
     * Celé jméno
     */
    public String jmeno;    
    /**
     * Vìk
     */
    public int vek;
    /**
     * Kamarád
     */
    public Clovek kamarad;

    /**
     * Vypíše text, ve kterém se èlovek pøedstaví
     */
    public void predstavSe()
    {
        System.out.printf("Ahoj, já jsem %s, je mi %d let a mùj kamarád je %s\n", jmeno, vek, kamarad.jmeno);
    }
	
	
	
	
	
/////////////////////end///////////////////////////////////////////
}
