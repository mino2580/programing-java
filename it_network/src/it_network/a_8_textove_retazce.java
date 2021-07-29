package it_network;

import java.util.Scanner;

public class a_8_textove_retazce {

	public static void main(String[] args) {
		
/*****Lekce 8 - Textové øetìzce v Javì podruhé - práce s jednotlivými znaky*****************************************************************/
		
/***********************vypsani konkretneho znaku v textu pomoci indexu***********************************************/
		/*
		String s = "Ahoj ITnetwork";
		System.out.println(s);
		System.out.println(s.charAt(2));	
		*/
/*************** Analýza výskytu znakù ve vìtì *******************************************************/

/*Napišme si jednoduchý program, který nám analyzuje zadanou vìtu. 
 * Bude nás zajímat poèet samohlásek, souhlásek a poèet nepísmenných 
 * znakù (napø. mezera nebo !).

Daný textový øetìzec si nejprve v programu zadáme napevno,
 abychom ho nemuseli pøi každém spuštìní psát. Až bude program hotový, 
 nahradíme ho sc.nextLine(). Øetìzec budeme projíždìt cyklem po jednom znaku.
  Rovnou zde øíkám, že neapelujeme na rychlost programu a budeme volit názorná
   a jednoduchá øešení.*/	
/*
		// øetìzec, který chceme analyzovat
		String s = "Programátor se zasekne ve sprše, protože instrukce na šampónu byly: Namydlit, omýt, opakovat.";
		System.out.println(s);
		s = s.toLowerCase();

		// inicializace poèítadel
		int pocetSamohlasek = 0;
		int pocetSouhlasek = 0;

		// definice typù znakù
		String samohlasky = "aeiouyáéìíóúùý";
		String souhlasky = "bcèdïfghjklmnpqrøsštvwxzž";

		// hlavní cyklus
		for (char c : s.toCharArray()) {
		    if (samohlasky.contains(String.valueOf(c))) {
		        pocetSamohlasek++;
		    }
		    else if (souhlasky.contains(String.valueOf(c))) {
		        pocetSouhlasek++;
		    }
		}

		System.out.printf("Samohlásek: %d\n", pocetSamohlasek);
		System.out.printf("Souhlásek: %d\n", pocetSouhlasek);
		System.out.printf("Nepísmenných znakù: %d\n", s.length() - (pocetSamohlasek + pocetSouhlasek));
*/
		
/*Metodu contains() na øetìzci již známe, jako parametr ji lze pøedat
 *  podøetìzec. Bohužel nemùžeme pøedat znak char, musíme tedy znak pøevést
na String. K tomu slouží výše uvedená metoda valueOf(). Daný znak c naší vìty
 tedy nejprve zkusíme vyhledat v øetìzce samohlasky a pøípadnì zvýšit jejich 
 poèítadlo. Pokud v samohláskách není, podíváme se do souhlásek a pøípadnì 
 opìtovnì zvýšíme jejich poèítadlo. Nyní nám chybí již jen výpis na konec. 
 V textu použijeme speciální sekvenci znakù "\n", ta zpùsobí odøádkování.*/		
		// hlavní cyklus
		 
/***********************ASCII hodnota***********************************************/
		/*
		char c; // znak
		int i; // ordinální (ASCII) hodnota znaku
		// pøevedeme znak na jeho ASCII hodnotu
		c = 'a';
		i = (int)c;
		System.out.printf("Znak %c jsme pøevedli na ASCII hodnotu %d\n", c, i);
		// Pøevedeme ASCII hodnotu na znak
		i = 98;
		c = (char)i;
		System.out.printf("ASCII hodnotu %d jsme pøevedli na znak %c", i, c);
		*/		
/*********************** Cézarova šifra ***********************************************/
		/*
		// inicializace promìnných
		String s = "cernediryjsoutamkdebuhdelilnulou";
		System.out.printf("Pùvodní zpráva: %s\n", s);
		String zprava = "";
		int posun = 3;

		// cyklus projíždìjící jednotlivé znaky
		for (char c : s.toCharArray()) {  //prevod textu na pole
			int i = (int)c;     //v premenne c sa budu menit znaky textu -pola +prevod do asci hodnoty
			i += posun;
			// kontrola pøeteèení
			if (i > (int)'z') {   //aby som sa nedostal za z-tko v tabulke
			    i -= 26;     //i = i - 26.
			}
			char znak = (char)i;//prevod asci do znaku
			zprava += znak;
		}

		// výpis
		System.out.printf("Zašifrovaná zpráva: %s\n", zprava);
		*/
		/*
		//demodulacia
		// inicializace promìnných
				String s = "fhuqhglubmvrxwdpnghexkgholoqxorx";
				System.out.printf("Pùvodní zpráva: %s\n", s);
				String zprava = "";
				int posun = -3;

				// cyklus projíždìjící jednotlivé znaky
				for (char c : s.toCharArray()) {  //prevod textu na pole
					int i = (int)c;     //v premenne c sa budu menit znaky textu -pola +prevod do asci hodnoty
					i += posun;
					// kontrola pøeteèení
					if (i > (int)'z') {   //aby som sa nedostal za z-tko v tabulke
					    i -= 26;     //i = i - 26.
					}
					char znak = (char)i;//prevod asci do znaku
					zprava += znak;
				}

				// výpis
				System.out.printf("Zašifrovaná zpráva: %s\n", zprava);
		*/
/***********************Øešené úlohy k 8. lekci Javy ***********************************************/
		
/************************ASCII kód 33 až 255.**********************************************/

/*V minulém tutoriálu jsme si øíkali o existenci ASCII tabulky.
 *  Ta obsahuje vždy ASCII kód a pøíslušný znak, který se k nìmu váže. 
 *  Vypište tuto tabulku do konzole pro kódy 33 až 255.*/		
/*
                  
		char c;                        // znak
		System.out.println("ASCII tabulka"); 
		System.out.println("============="); 
		for (int i=33;i<=255;i++) {    // cyklus projíždìjící jednotlivé znaky
			c = (char)i;
			System.out.println(i+":"+c);
		}


	*/	
/******************* palindrom reverse a porovnavani stringu *******************************************/

/*Naprogramujte aplikaci, které zadáte na vstupu textový øetìzec a ona zjistí,
 *  zda je to palindrom. Palindrom je slovo, které se ète stejnì zleva i 
 *  zprava. Jsou to tedy napø. slova: oko, anna, level, radar.*/	
		
		
		/* String s1 = new String("HELLO"); 
        String s2 = new String("HELLO"); 
        System.out.println(s1 == s2); 
        System.out.println(s1.equals(s2)); */
		
		
	    /*
		  Scanner sc = new Scanner(System.in, "Windows-1250");   
		  String reverse = "";   
	      System.out.println("Zadej palindrom:");  
	      String original = sc.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- ) { 
	         reverse = reverse + original.charAt(i);
	      }
	      if (original.equals(reverse))  {
	         System.out.println("Ano, toto je palindrom.");
	         }  
	      else  System.out.println("Toto není palindrom.");   
         
	     */  
			
/************************* Vigenerovy šifry. nedokoncene *********************************************/

/*Naprogramujte šifraci textu pomocí Vigenerovy šifry. Program si na vstupu 
 * vyžádá šifrované slovo a heslo. Pøedpokládejme zadání slova "moribundus" 
 * a hesla "ahoj". Program posune jednotlivá písmena v šifrovaném slovu o 
 * urèitý poèet znakù v abecedì dopøedu. Tento poèet závisí na písmenech v
 *  heslu. V našem pøípadì program posune první znak ve slovu o 1 ('a'), 
 *  druhý o 8('h'), tøetí o 15('o'), ètvrtý o 10 ('j'), pátý zas o 1 ('a') 
 *  a tak dále.*/
		
	// inicializace promìnných
		/*
		Scanner sc = new Scanner(System.in, "Windows-1250"); 		
		String abeceda = "abcdefghijklmnopqrstuvwxyz";
			System.out.println("Zadejte text k zašifrování:");
			String zprava = sc.nextLine();  	
			System.out.println("Zadejte heslo:");
			String heslo = sc.nextLine();  
			
			String prazdny = "";
				int posun = 3;
				  
				  
				                                   // cyklus projíždìjící jednotlivé znaky
				for (char c : s.toCharArray()) {    //prevod textu na pole
					int i = (int)c;                //v premenne c sa budu menit znaky textu -pola +prevod do asci hodnoty
					i += posun;
					                              // kontrola pøeteèení
					if (i > (int)'z') {           //aby som sa nedostal za z-tko v tabulke
					    i -= 26;                  //i = i - 26.
					}
					char znak = (char)i;    //prevod asci do znaku
					zprava += znak;
				}

				                               // výpis
				System.out.printf("Zašifrovaná zpráva: %s\n", zprava);
			*/	 		
/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
////////////////////////////////// end ///////////////////////////////////////
	}

}
