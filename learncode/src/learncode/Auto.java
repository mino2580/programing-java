package learncode;

public class Auto {
	static int pocet_aut=0;//static pocet aut patri triede nie objektu
	String znacka;         //nemusim inicializovat,dojde k tomu automaticky
	String farba;
	
	public Auto() {                   //konstruktor
		pocet_aut++;
	}
/***********metody*****************/
	
	void startuj() {                 //metoda  bez navratove hodnoty
		System.out.println("startuj void");
	}

	int startuj_vrat(int n,String s ) {             //metod s navratovou hodnotou
		int cislo=0;           // pri navrate viac hodnot,pouzi if podmiennku
		 System.out.println("startuj int");  //premenne musim inicializovat vnutri metody
		 System.out.println(n);
		 System.out.println(s);
		 return cislo;
	}
	
	
/***********************************************************************/
	public static void main(String[] args) {
		 
		Auto auto=new Auto();         //konstruktor
		 auto.znacka="ford";
		 auto.farba="cervena";
		 //auto.startuj();

		
		// System.out.println(Auto.pocet_aut);
		 
		 int k=1;
		 String f="fo";                          //vstupne parametre
		 int cislo=auto.startuj_vrat(k,f);      //praca s objektom a s metodou s navratom cislo
		 System.out.println(cislo);      
		 
		
		 
	}

}
