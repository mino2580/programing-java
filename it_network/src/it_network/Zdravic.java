package it_network;

/*****************************trida zdravic*****************************/

public class Zdravic {	
	//////////////////////////////begin////////////////////////////////////
	
public String text;

/***********Lekce 2 - Prvn� objektov� aplikace v Jav� - Hello object world */

/********************instance tridy bez parametru**********************/
/*
	public void pozdrav() {
        System.out.println("Hello object world!");
    }	

*/
/*************************daslsi typ tridy s parametrem*******************/

    //metoda pozdrav ,verejne,bez navratoveho typu,s parametrom na vstupu	

/*
	public void pozdrav(String jmeno) {
    System.out.printf("Ahoj u�ivateli %s\n", jmeno);
}
*/

/*************************daslsi typ tridy s parametrem+text*******************/
/*
	

	    public void pozdrav(String jmeno) {
	        System.out.printf("%s %s\n", text, jmeno);
	    }

*/

/*************************daslsi typ tridy s navratovou hod******************/

/*Jeliko� chceme, aby metoda vracela hodnotu a to String, zm�n�me jej� dosavadn�
 *  typ void na String. K n�vratu hodnoty pou�ijeme p��kaz return. 
 *  Return metodu ukon�� a navr�t� hodnotu, jak�koli k�d v t�le metody 
 *  po return se ji� neprovede! Upravme ob� t��dy*/

/*
public String pozdrav(String jmeno) {
    return String.format("%s %s", text, jmeno);
}

*/





/////////////////////////////////end////////////////////////////////////
}






