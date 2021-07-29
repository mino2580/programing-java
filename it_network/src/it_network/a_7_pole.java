package it_network;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class a_7_pole {

	public static void main(String[] args) {

/************************ Lekce 7 - Pole v Javì  ************************/	

/**********************Pole deklarujeme pomocí hranatých závorek:*/
// int[] pole;
 		
/************************** rucne plnenie pola ****************************/
		
//K prvkùm pole potom pøistupujeme pøes hranatou závorku, pojïme na 
//první index (tedy index 0) uložit èíslo 1		
		
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

/* Foreach nemá øídící promìnnou, není tedy vhodný pro vytvoøení našeho 
 * pole a použijeme ho jen pro výpis.*/		
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
		
/*Když pole seøadíme, umožní nám v nìm Java vyhledávat prvky. 
 * Metoda binarySearch() nám vrátí index prvního nalezeného prvku. 
 * V pøípadì nenalezení prvku vrátí -1. Metoda bere dva parametry, 
 * prvním je pole, druhým hledaný prvek. Umožníme uživateli zadat jméno 
 * Simpsna a poté zkontrolujeme, zda je to opravdu Simpson. 
 * Pole musí být opravdu setøídìné, než metodu zavoláme!*/

/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");

		String[] simpsonovi = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
		System.out.println("Zadej Simpsna (z rodiny Simpsnù): ");
		String simpson = sc.nextLine();

		Arrays.sort(simpsonovi);
		int pozice = Arrays.binarySearch(simpsonovi, simpson);
		if (pozice >= 0)
		        System.out.println("Jo, to je Simpson!");
		else
		        System.out.println("Hele, tohle není Simpson!");
*/

/******************************* copyOfRange() *********************************/
/*Metoda copyOfRange() již podle názvu zkopíruje èást pole do jiného pole.
 *  Prvním parametrem je zdrojové pole, druhým startovní pozice a tøetím 
 *  koneèná pozice. Metoda vrací nové pole, které je výsekem pùvodního pole.*/		
		
/************************** Promìnná délka pole za behu programu ************************************************/
/*
		Scanner sc = new Scanner(System.in, "Windows-1250");

		System.out.println("Ahoj, spoèítám ti prùmìr známek. Kolik známek zadáš?");
		int pocet = Integer.parseInt(sc.nextLine());
		int[] cisla = new int[pocet];
		for (int i = 0; i < pocet; i++) {
		        System.out.printf("Zadejte %d. èíslo: ", i + 1);
		        cisla[i] = Integer.parseInt(sc.nextLine());
		}
		// spoèítání prùmìru
		int soucet = 0;
		for (int i: cisla) {
		        soucet += i;
		}
		float prumer = soucet / (float)cisla.length;

		System.out.printf("Prùmìr tvých známek je: %f", prumer);
/*
		
/**********************Øešené úlohy k 7. lekci Javy ****************************************************/
		
				
/******************************* vypis pole *********************************/

/*Vytvoøte program, který naplní pole o deseti prvcích postupnì èísly 
 * od 10 do 1. Pole následnì vypište pomocí cyklu foreach.*/		 
		

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

/*Vytvoøte program, kterému zadáte slovo a on zjistí, zda je to
 *  název ovoce nebo zeleniny. Pokud tedy zadáme napø. malina, vypíše, 
 *  že se jedná o ovoce. Pokud brokolice, vypíše, že se jedná o zeleninu.
 *   Na velikosti písmen nezáleží. Program samozøejmì rozpozná nìkolik slov
 *    a pokud narazí na slovo, které není definované, tak na tuto 
 *    skuteènost uživatele upozorní. Vyhnìte se použití složitého vìtvení
 *     a místo toho použijte pole.

Program se stále opakuje v cyklu dokud ho neukonèíme. 
Pøed ukonèení program vypíše na kolik slov jsme se ho zeptali. 
Pro lepší pochopení je vše názornì ukázáno na obrázku níže.

Program nauète rozeznávat alespoò tyto plodiny:

    Zeleninu: zelí, okurka, rajèe, paprika, øedkev, mrkev, brokolice
    Ovoce: jablko, hruška, pomeranè, jahoda, banán, kiwi, malina

Ukázka obrazovky programu:		

		 
		 Zadej název libovolného ovoce nebo zeleniny:
Malina
Zadal jsi ovoce
Pøeješ si zadat další slovo? (ano/ne)
ano
Zadej název libovolného ovoce nebo zeleniny:
brokolice
Zadal jsi zeleninu
Pøeješ si zadat další slovo? (ano/ne)
ano
Zadej název libovolného ovoce nebo zeleniny:
traktor
Tvoje slovo nemám v seznamu
Pøeješ si zadat další slovo? (ano/ne)
ne
Zadal jsi 3 slov
*/
		
		                    //reseni
		
/*
   Scanner sc = new Scanner(System.in, "Windows-1250");
		
		String[] zelenina = {"zelí","okurka","rajèe","paprika","øedkev","mrkev","brokolice"};	
		String[] ovoce= {"jablko","hruška","pomeranè","jahoda","banán","kiwi","malina"};
		int podminka=0;
		int pocet=0;
		while(podminka==0) {
			System.out.println("Zadej název libovolného ovoce nebo zeleniny:");
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
				System.out.println("Tvoje slovo nemám v seznamu");
				
			}
			pocet=pocet+1;
			System.out.println("Pøeješ si zadat další slovo? (ano/ne)");
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

/*Vytvoøte program, který si nechá na vstupu zadat nìkolik èísel 
 * (jejich poèet si zvolí uživatel) a z tìchto èísel následnì vypoèítá 
 * medián. Pro každé zadané èíslo vypíše jeho odchylku od tohoto mediánu.
 *  U mediánu zanedbejte fakt, že se pøi sudém poètu prvkù prùmìruje z 
 *  prostøedních dvou, k jeho urèení tedy pouze sáhnìte na prostøední index,
 *   získaný jako délka / 2;

Ukázka obrazovky programu:
Zadej poèet èísel:
5
Zadej 1. èíslo: 3
Zadej 2. èíslo: 8
Zadej 3. èíslo: 6
Zadej 4. èíslo: 1
Zadej 5. èíslo: 7
3 se od mediánu odchyluje o -3.000000
8 se od mediánu odchyluje o 2.000000
6 se od mediánu odchyluje o 0.000000
1 se od mediánu odchyluje o -5.000000
7 se od mediánu odchyluje o 1.000000
*/
		
 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej poèet èísel:");
		int pocet = Integer.parseInt(sc.nextLine());
		int cisla[] = new int[pocet];
		int pole[] = new int[pocet];
		
		for (int i = 0; i < pocet; i++) {
			System.out.printf("Zadej %d. èíslo: ",i+1);
			cisla[i] = Integer.parseInt(sc.nextLine());
			pole[i]=cisla[i];
		}
	
		
		Arrays.sort(pole);
			
		int stred = pole.length / 2;
		int median=pole[stred];
		double vysledok=0;
		
		for (int i = 0; i < pocet; i++) {
			vysledok=cisla[i]-median;
			
			System.out.println(cisla[i]+" se od mediánu odchyluje o "+vysledok);	
		
		
		}
		

  
//////////////////////////////end///////////////////////////////////////////		
	}

}

