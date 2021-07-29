package it_network;

import java.util.Scanner;

public class a_8_textove_retazce {

	public static void main(String[] args) {
		
/*****Lekce 8 - Textov� �et�zce v Jav� podruh� - pr�ce s jednotliv�mi znaky*****************************************************************/
		
/***********************vypsani konkretneho znaku v textu pomoci indexu***********************************************/
		/*
		String s = "Ahoj ITnetwork";
		System.out.println(s);
		System.out.println(s.charAt(2));	
		*/
/*************** Anal�za v�skytu znak� ve v�t� *******************************************************/

/*Napi�me si jednoduch� program, kter� n�m analyzuje zadanou v�tu. 
 * Bude n�s zaj�mat po�et samohl�sek, souhl�sek a po�et nep�smenn�ch 
 * znak� (nap�. mezera nebo !).

Dan� textov� �et�zec si nejprve v programu zad�me napevno,
 abychom ho nemuseli p�i ka�d�m spu�t�n� ps�t. A� bude program hotov�, 
 nahrad�me ho sc.nextLine(). �et�zec budeme proj�d�t cyklem po jednom znaku.
  Rovnou zde ��k�m, �e neapelujeme na rychlost programu a budeme volit n�zorn�
   a jednoduch� �e�en�.*/	
/*
		// �et�zec, kter� chceme analyzovat
		String s = "Program�tor se zasekne ve spr�e, proto�e instrukce na �amp�nu byly: Namydlit, om�t, opakovat.";
		System.out.println(s);
		s = s.toLowerCase();

		// inicializace po��tadel
		int pocetSamohlasek = 0;
		int pocetSouhlasek = 0;

		// definice typ� znak�
		String samohlasky = "aeiouy��������";
		String souhlasky = "bc�d�fghjklmnpqr�s�t�vwxz�";

		// hlavn� cyklus
		for (char c : s.toCharArray()) {
		    if (samohlasky.contains(String.valueOf(c))) {
		        pocetSamohlasek++;
		    }
		    else if (souhlasky.contains(String.valueOf(c))) {
		        pocetSouhlasek++;
		    }
		}

		System.out.printf("Samohl�sek: %d\n", pocetSamohlasek);
		System.out.printf("Souhl�sek: %d\n", pocetSouhlasek);
		System.out.printf("Nep�smenn�ch znak�: %d\n", s.length() - (pocetSamohlasek + pocetSouhlasek));
*/
		
/*Metodu contains() na �et�zci ji� zn�me, jako parametr ji lze p�edat
 *  pod�et�zec. Bohu�el nem��eme p�edat znak char, mus�me tedy znak p�ev�st
na String. K tomu slou�� v��e uveden� metoda valueOf(). Dan� znak c na�� v�ty
 tedy nejprve zkus�me vyhledat v �et�zce samohlasky a p��padn� zv��it jejich 
 po��tadlo. Pokud v samohl�sk�ch nen�, pod�v�me se do souhl�sek a p��padn� 
 op�tovn� zv���me jejich po��tadlo. Nyn� n�m chyb� ji� jen v�pis na konec. 
 V textu pou�ijeme speci�ln� sekvenci znak� "\n", ta zp�sob� od��dkov�n�.*/		
		// hlavn� cyklus
		 
/***********************ASCII hodnota***********************************************/
		/*
		char c; // znak
		int i; // ordin�ln� (ASCII) hodnota znaku
		// p�evedeme znak na jeho ASCII hodnotu
		c = 'a';
		i = (int)c;
		System.out.printf("Znak %c jsme p�evedli na ASCII hodnotu %d\n", c, i);
		// P�evedeme ASCII hodnotu na znak
		i = 98;
		c = (char)i;
		System.out.printf("ASCII hodnotu %d jsme p�evedli na znak %c", i, c);
		*/		
/*********************** C�zarova �ifra ***********************************************/
		/*
		// inicializace prom�nn�ch
		String s = "cernediryjsoutamkdebuhdelilnulou";
		System.out.printf("P�vodn� zpr�va: %s\n", s);
		String zprava = "";
		int posun = 3;

		// cyklus proj�d�j�c� jednotliv� znaky
		for (char c : s.toCharArray()) {  //prevod textu na pole
			int i = (int)c;     //v premenne c sa budu menit znaky textu -pola +prevod do asci hodnoty
			i += posun;
			// kontrola p�ete�en�
			if (i > (int)'z') {   //aby som sa nedostal za z-tko v tabulke
			    i -= 26;     //i = i - 26.
			}
			char znak = (char)i;//prevod asci do znaku
			zprava += znak;
		}

		// v�pis
		System.out.printf("Za�ifrovan� zpr�va: %s\n", zprava);
		*/
		/*
		//demodulacia
		// inicializace prom�nn�ch
				String s = "fhuqhglubmvrxwdpnghexkgholoqxorx";
				System.out.printf("P�vodn� zpr�va: %s\n", s);
				String zprava = "";
				int posun = -3;

				// cyklus proj�d�j�c� jednotliv� znaky
				for (char c : s.toCharArray()) {  //prevod textu na pole
					int i = (int)c;     //v premenne c sa budu menit znaky textu -pola +prevod do asci hodnoty
					i += posun;
					// kontrola p�ete�en�
					if (i > (int)'z') {   //aby som sa nedostal za z-tko v tabulke
					    i -= 26;     //i = i - 26.
					}
					char znak = (char)i;//prevod asci do znaku
					zprava += znak;
				}

				// v�pis
				System.out.printf("Za�ifrovan� zpr�va: %s\n", zprava);
		*/
/***********************�e�en� �lohy k 8. lekci Javy ***********************************************/
		
/************************ASCII k�d 33 a� 255.**********************************************/

/*V minul�m tutori�lu jsme si ��kali o existenci ASCII tabulky.
 *  Ta obsahuje v�dy ASCII k�d a p��slu�n� znak, kter� se k n�mu v�e. 
 *  Vypi�te tuto tabulku do konzole pro k�dy 33 a� 255.*/		
/*
                  
		char c;                        // znak
		System.out.println("ASCII tabulka"); 
		System.out.println("============="); 
		for (int i=33;i<=255;i++) {    // cyklus proj�d�j�c� jednotliv� znaky
			c = (char)i;
			System.out.println(i+":"+c);
		}


	*/	
/******************* palindrom reverse a porovnavani stringu *******************************************/

/*Naprogramujte aplikaci, kter� zad�te na vstupu textov� �et�zec a ona zjist�,
 *  zda je to palindrom. Palindrom je slovo, kter� se �te stejn� zleva i 
 *  zprava. Jsou to tedy nap�. slova: oko, anna, level, radar.*/	
		
		
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
	      else  System.out.println("Toto nen� palindrom.");   
         
	     */  
			
/************************* Vigenerovy �ifry. nedokoncene *********************************************/

/*Naprogramujte �ifraci textu pomoc� Vigenerovy �ifry. Program si na vstupu 
 * vy��d� �ifrovan� slovo a heslo. P�edpokl�dejme zad�n� slova "moribundus" 
 * a hesla "ahoj". Program posune jednotliv� p�smena v �ifrovan�m slovu o 
 * ur�it� po�et znak� v abeced� dop�edu. Tento po�et z�vis� na p�smenech v
 *  heslu. V na�em p��pad� program posune prvn� znak ve slovu o 1 ('a'), 
 *  druh� o 8('h'), t�et� o 15('o'), �tvrt� o 10 ('j'), p�t� zas o 1 ('a') 
 *  a tak d�le.*/
		
	// inicializace prom�nn�ch
		/*
		Scanner sc = new Scanner(System.in, "Windows-1250"); 		
		String abeceda = "abcdefghijklmnopqrstuvwxyz";
			System.out.println("Zadejte text k za�ifrov�n�:");
			String zprava = sc.nextLine();  	
			System.out.println("Zadejte heslo:");
			String heslo = sc.nextLine();  
			
			String prazdny = "";
				int posun = 3;
				  
				  
				                                   // cyklus proj�d�j�c� jednotliv� znaky
				for (char c : s.toCharArray()) {    //prevod textu na pole
					int i = (int)c;                //v premenne c sa budu menit znaky textu -pola +prevod do asci hodnoty
					i += posun;
					                              // kontrola p�ete�en�
					if (i > (int)'z') {           //aby som sa nedostal za z-tko v tabulke
					    i -= 26;                  //i = i - 26.
					}
					char znak = (char)i;    //prevod asci do znaku
					zprava += znak;
				}

				                               // v�pis
				System.out.printf("Za�ifrovan� zpr�va: %s\n", zprava);
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
