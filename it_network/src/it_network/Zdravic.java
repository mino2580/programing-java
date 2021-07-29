package it_network;

/*****************************trida zdravic*****************************/

public class Zdravic {	
	//////////////////////////////begin////////////////////////////////////
	
public String text;

/***********Lekce 2 - První objektová aplikace v Javì - Hello object world */

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
    System.out.printf("Ahoj uživateli %s\n", jmeno);
}
*/

/*************************daslsi typ tridy s parametrem+text*******************/
/*
	

	    public void pozdrav(String jmeno) {
	        System.out.printf("%s %s\n", text, jmeno);
	    }

*/

/*************************daslsi typ tridy s navratovou hod******************/

/*Jelikož chceme, aby metoda vracela hodnotu a to String, zmìníme její dosavadní
 *  typ void na String. K návratu hodnoty použijeme pøíkaz return. 
 *  Return metodu ukonèí a navrátí hodnotu, jakýkoli kód v tìle metody 
 *  po return se již neprovede! Upravme obì tøídy*/

/*
public String pozdrav(String jmeno) {
    return String.format("%s %s", text, jmeno);
}

*/





/////////////////////////////////end////////////////////////////////////
}






