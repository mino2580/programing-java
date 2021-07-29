package learncode;
/******************************************_trieda_*********************************************/
    public class Stol {
	private int pocetNoh;                //pristup iba v teto triede,mozem pristupovat
	private String farba="cervena";     //cez metody tejto triedy v inej triede
/*******************************************_metody_**********************************************/	
   void zlozSa() {
		System.out.println("skladam sa");
	}
	
	public int getPocetNoh() {
		return pocetNoh;
	}
	
	public void vratPocetNoh(int pocetNoh) {
		this.pocetNoh=pocetNoh;
	}
/****************************************** _konstruktor_ ************************************************/
	public Stol(int pocetNoh,String farba) {
		this.pocetNoh=pocetNoh;          //odkaz sam na seba
		this.farba=farba;
	}
/********************************************_main_metoda_**************************/
	public static void main(String[] args) {
		 Stol stol4nohy=new Stol(4,"biela");
		 stol4nohy.pocetNoh=4;

		 
		 
		 
/************************************************_end_*************************/		 
	}

}
