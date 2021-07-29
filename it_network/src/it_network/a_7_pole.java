package it_network;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class a_7_pole {

	public static void main(String[] args) {

/************************ Lekce 7 - Pole v Jav�  ************************/	

/**********************Pole deklarujeme pomoc� hranat�ch z�vorek:*/
// int[] pole;
 		
/************************** rucne plnenie pola ****************************/
		
//K prvk�m pole potom p�istupujeme p�es hranatou z�vorku, poj�me na 
//prvn� index (tedy index 0) ulo�it ��slo 1		
		
/*
		int[] pole = new int[10];
		pole[0] = 1;
*/
/********************* plnenie pola pomoci for cyklu  ****************/	

/*
		 int[] pole = new int[10];
         pole[0] = 1;
         for (int i = 0; i < 10; i++) {
         pole[i] = i + 1;
        }
         for (int i = 0; i < pole.length; i++) {
 		    System.out.print(pole[i] + " ");
 		}
*/
/************************ vypis pole ***************************************/
/*		
		int[] pole = new int[10];
		pole[0] = 1;
		for (int i = 0; i < 10; i++) {
		    pole[i] = i + 1;
		}
                   //vypis pole 
                    
		for (int i = 0; i < pole.length; i++) {
		    System.out.print(pole[i] + " ");
		}
*/
/******************************* foreach-vypis pole *********************************/

/* Foreach nem� ��d�c� prom�nnou, nen� tedy vhodn� pro vytvo�en� na�eho 
 * pole a pou�ijeme ho jen pro v�pis.*/		
/*
		int[] pole = new int[10];
		pole[0] = 1;
		for (int i = 0; i < 10; i++) {
		    pole[i] = i + 1;
		}
		//
		for (int i : pole) {
		    System.out.print(i + " ");
		}	
		
*/		
/********************** Metody tridy Arrays -pole stringu *********************************/

//String[] simpsonovi = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};

/********************* sort -setrideni pole *******************************/

/*		 
String[] simpsonovi = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
Arrays.sort(simpsonovi);
for (String s : simpsonovi) {
    System.out.print(s + " ");
}	 	

*/		
/********** binarySearch() -vyhledavani jmena v retezci poli******************/
		
/*Kdy� pole se�ad�me, umo�n� n�m v n�m Java vyhled�vat prvky. 
 * Metoda binarySearch() n�m vr�t� index prvn�ho nalezen�ho prvku. 
 * V p��pad� nenalezen� prvku vr�t� -1. Metoda bere dva parametry, 
 * prvn�m je pole, druh�m hledan� prvek. Umo�n�me u�ivateli zadat jm�no 
 * Simpsna a pot� zkontrolujeme, zda je to opravdu Simpson. 
 * Pole mus� b�t opravdu set��d�n�, ne� metodu zavol�me!*/

/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");

		String[] simpsonovi = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
		System.out.println("Zadej Simpsna (z rodiny Simpsn�): ");
		String simpson = sc.nextLine();

		Arrays.sort(simpsonovi);
		int pozice = Arrays.binarySearch(simpsonovi, simpson);
		if (pozice >= 0)
		        System.out.println("Jo, to je Simpson!");
		else
		        System.out.println("Hele, tohle nen� Simpson!");
*/

/******************************* copyOfRange() *********************************/
/*Metoda copyOfRange() ji� podle n�zvu zkop�ruje ��st pole do jin�ho pole.
 *  Prvn�m parametrem je zdrojov� pole, druh�m startovn� pozice a t�et�m 
 *  kone�n� pozice. Metoda vrac� nov� pole, kter� je v�sekem p�vodn�ho pole.*/		
		
/************************** Prom�nn� d�lka pole za behu programu ************************************************/
/*
		Scanner sc = new Scanner(System.in, "Windows-1250");

		System.out.println("Ahoj, spo��t�m ti pr�m�r zn�mek. Kolik zn�mek zad�?");
		int pocet = Integer.parseInt(sc.nextLine());
		int[] cisla = new int[pocet];
		for (int i = 0; i < pocet; i++) {
		        System.out.printf("Zadejte %d. ��slo: ", i + 1);
		        cisla[i] = Integer.parseInt(sc.nextLine());
		}
		// spo��t�n� pr�m�ru
		int soucet = 0;
		for (int i: cisla) {
		        soucet += i;
		}
		float prumer = soucet / (float)cisla.length;

		System.out.printf("Pr�m�r tv�ch zn�mek je: %f", prumer);
/*
		
/**********************�e�en� �lohy k 7. lekci Javy ****************************************************/
		
				
/******************************* vypis pole *********************************/

/*Vytvo�te program, kter� napln� pole o deseti prvc�ch postupn� ��sly 
 * od 10 do 1. Pole n�sledn� vypi�te pomoc� cyklu foreach.*/		 
		

		                    // reseni
/*
		int[] pole = new int[10];
		pole[0] = 0;
		int j=11;
		for (int i = 0; i < 10; i++) {
		    pole[i] = j - 1;
		    j--;
		}
		
		for (int i : pole) {
		    System.out.println(i + " ");
		}
*/
/******************************* rozlisi nazov ovocia a zeleniny ***************************************/

/*Vytvo�te program, kter�mu zad�te slovo a on zjist�, zda je to
 *  n�zev ovoce nebo zeleniny. Pokud tedy zad�me nap�. malina, vyp�e, 
 *  �e se jedn� o ovoce. Pokud brokolice, vyp�e, �e se jedn� o zeleninu.
 *   Na velikosti p�smen nez�le��. Program samoz�ejm� rozpozn� n�kolik slov
 *    a pokud naraz� na slovo, kter� nen� definovan�, tak na tuto 
 *    skute�nost u�ivatele upozorn�. Vyhn�te se pou�it� slo�it�ho v�tven�
 *     a m�sto toho pou�ijte pole.

Program se st�le opakuje v cyklu dokud ho neukon��me. 
P�ed ukon�en� program vyp�e na kolik slov jsme se ho zeptali. 
Pro lep�� pochopen� je v�e n�zorn� uk�z�no na obr�zku n�e.

Program nau�te rozezn�vat alespo� tyto plodiny:

    Zeleninu: zel�, okurka, raj�e, paprika, �edkev, mrkev, brokolice
    Ovoce: jablko, hru�ka, pomeran�, jahoda, ban�n, kiwi, malina

Uk�zka obrazovky programu:		

		 
		 Zadej n�zev libovoln�ho ovoce nebo zeleniny:
Malina
Zadal jsi ovoce
P�eje� si zadat dal�� slovo? (ano/ne)
ano
Zadej n�zev libovoln�ho ovoce nebo zeleniny:
brokolice
Zadal jsi zeleninu
P�eje� si zadat dal�� slovo? (ano/ne)
ano
Zadej n�zev libovoln�ho ovoce nebo zeleniny:
traktor
Tvoje slovo nem�m v seznamu
P�eje� si zadat dal�� slovo? (ano/ne)
ne
Zadal jsi 3 slov
*/
		
		                    //reseni
		
/*
   Scanner sc = new Scanner(System.in, "Windows-1250");
		
		String[] zelenina = {"zel�","okurka","raj�e","paprika","�edkev","mrkev","brokolice"};	
		String[] ovoce= {"jablko","hru�ka","pomeran�","jahoda","ban�n","kiwi","malina"};
		int podminka=0;
		int pocet=0;
		while(podminka==0) {
			System.out.println("Zadej n�zev libovoln�ho ovoce nebo zeleniny:");
			String zeli=sc.nextLine();
			zeli = zeli.trim().toLowerCase();  //odstranit bile yankz  + prevod na mala pismena
			Arrays.sort(zelenina);  //setridene pole inak to nefunguje
			Arrays.sort(ovoce); //arrazs je trida s metodamy pro praci s poli
			int pozice=Arrays.binarySearch(zelenina,zeli);
			int pozice2=Arrays.binarySearch(ovoce,zeli);
			 
			
			if(pozice>=0) {
				System.out.println("Zadal jsi zeleninu");
				
			}
			
			else if(pozice2>=0) {
				System.out.println("Zadal jsi ovoce");
				
			}
			else {
				System.out.println("Tvoje slovo nem�m v seznamu");
				
			}
			pocet=pocet+1;
			System.out.println("P�eje� si zadat dal�� slovo? (ano/ne)");
			String p=sc.nextLine();
			p=p.trim().toLowerCase(); 
			if (p.contains("ano")) {  //porovnavanie nie ==,to nefunguje
				podminka=0;
				
			}
			else {
				podminka=1;
				System.out.printf("Zadal jsi %d slov",pocet);
			}
			
		}      
*/

/**************************** Priklad ******************************************/

/*Vytvo�te program, kter� si nech� na vstupu zadat n�kolik ��sel 
 * (jejich po�et si zvol� u�ivatel) a z t�chto ��sel n�sledn� vypo��t� 
 * medi�n. Pro ka�d� zadan� ��slo vyp�e jeho odchylku od tohoto medi�nu.
 *  U medi�nu zanedbejte fakt, �e se p�i sud�m po�tu prvk� pr�m�ruje z 
 *  prost�edn�ch dvou, k jeho ur�en� tedy pouze s�hn�te na prost�edn� index,
 *   z�skan� jako d�lka / 2;

Uk�zka obrazovky programu:
Zadej po�et ��sel:
5
Zadej 1. ��slo: 3
Zadej 2. ��slo: 8
Zadej 3. ��slo: 6
Zadej 4. ��slo: 1
Zadej 5. ��slo: 7
3 se od medi�nu odchyluje o -3.000000
8 se od medi�nu odchyluje o 2.000000
6 se od medi�nu odchyluje o 0.000000
1 se od medi�nu odchyluje o -5.000000
7 se od medi�nu odchyluje o 1.000000
*/
		
 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej po�et ��sel:");
		int pocet = Integer.parseInt(sc.nextLine());
		int cisla[] = new int[pocet];
		int pole[] = new int[pocet];
		
		for (int i = 0; i < pocet; i++) {
			System.out.printf("Zadej %d. ��slo: ",i+1);
			cisla[i] = Integer.parseInt(sc.nextLine());
			pole[i]=cisla[i];
		}
	
		
		Arrays.sort(pole);
			
		int stred = pole.length / 2;
		int median=pole[stred];
		double vysledok=0;
		
		for (int i = 0; i < pocet; i++) {
			vysledok=cisla[i]-median;
			
			System.out.println(cisla[i]+" se od medi�nu odchyluje o "+vysledok);	
		
		
		}
		

  
//////////////////////////////end///////////////////////////////////////////		
	}

}

