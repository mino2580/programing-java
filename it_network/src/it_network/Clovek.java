package it_network;

public class Clovek {

	 /**
     * Cel� jm�no
     */
    public String jmeno;    
    /**
     * V�k
     */
    public int vek;
    /**
     * Kamar�d
     */
    public Clovek kamarad;

    /**
     * Vyp�e text, ve kter�m se �lovek p�edstav�
     */
    public void predstavSe()
    {
        System.out.printf("Ahoj, j� jsem %s, je mi %d let a m�j kamar�d je %s\n", jmeno, vek, kamarad.jmeno);
    }
	
	
	
	
	
/////////////////////end///////////////////////////////////////////
}
