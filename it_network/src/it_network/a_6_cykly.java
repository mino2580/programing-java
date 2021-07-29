package it_network;

import java.util.Scanner;

public class a_6_cykly {

	public static void main(String[] args) {
		
/************************** Lekce 6 - Cykly v Javì ********************/
/*		
		for (int i=0; i < 3; i++)
		{
		    System.out.println("Knock");
		}
		System.out.println("Penny!");
		
*/		
/**************************** vypis cyklu for ******************************************/
 
/*     
       for (int i = 1; i <= 10; i++)
       {
       System.out.printf("%d ", i);
       }
       

       for (int i = 1; i <= 10; i++)
       {
       System.out.printf("%d ", i);
       }
       
*/
/*************************** Mala nasobilka*******************************************/
/*		
		System.out.println("Malá násobilka pomocí dvou cyklù:");
		for (int j = 1; j <= 10; j++)
		{
		    for (int i = 1; i <= 10; i++)
		    {
		        System.out.print((i * j) + " ");
		    }
		    System.out.println();
		}
*/	
/****************************** Mocninator ****************************************/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Mocninátor");
		System.out.println("==========");
		System.out.println("Zadejte základ mocniny: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Zadejte exponent: ");
		int n = Integer.parseInt(sc.nextLine());

		int vysledek = a;
		for (int i = 0; i < (n - 1); i++)
		{
		    vysledek = vysledek * a;
		}

		System.out.println("Výsledek: " + vysledek);
		System.out.println("Dìkuji za použití mocninátoru");
*/
/************************** kalkulacka,while+switch+metoda v podmince equals ********************************************/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");

		System.out.println("Vítejte v kalkulaèce");
		String pokracovat = "ano";
		while (pokracovat.equals("ano"))
		{
		    System.out.println("Zadejte první èíslo:");
		    float a = Float.parseFloat(sc.nextLine());
		    System.out.println("Zadejte druhé èíslo:");
		    float b = Float.parseFloat(sc.nextLine());
		    System.out.println("Zvolte si operaci:");
		    System.out.println("1 - sèítání");
		    System.out.println("2 - odèítání");
		    System.out.println("3 - násobení");
		    System.out.println("4 - dìlení");
		    int volba = Integer.parseInt(sc.nextLine());
		    float vysledek = 0;
		    switch (volba)
		    {
		        case 1:
		                vysledek = a + b;
		        break;
		        case 2:
		                vysledek = a - b;
		        break;
		        case 3:
		                vysledek = a * b;
		        break;
		        case 4:
		                vysledek = a / b;
		        break;
		    }
		    if ((volba > 0) && (volba < 5))
		    {
		        System.out.println("Výsledek: " + vysledek);
		    }
		    else
		    {
		        System.out.println("Neplatná volba");
		    }
		    System.out.println("Pøejete si zadat další pøíklad? [ano/ne]");
		    pokracovat = sc.nextLine();
		}
		System.out.println("Dìkuji za použití kalkulaèky.");
*/		

/*************************Øešené úlohy k 6. lekci Javy *****************/
		
		
/******************************** ryby k veèeri **************************************/
	
	/*Vytvoøte program, který se uživatele zeptá, kolik si dá ryb k veèeøi.
	 *Poté mu do konzole vypíše zadaný poèet ryb tímto zpùsobem:

<° )))-<
*/	
		// reseni
		
/*	 
			Scanner sc = new Scanner(System.in, "Windows-1250");
			        System.out.println("Kolik ryb si dáš k veèeøi?");
					int a = Integer.parseInt(sc.nextLine());
					
					for (int i = 1; i <= a; i++)
					{
					    System.out.println("<° )))-<");
					}
*/	
		
/********************************* sklonovanie basnicky *************************************/

/*Zadání tohoto programu je odvozeno z anglické øíkanky, která zaèíná takto:

10 zelených láhví stojí na stole a jedna láhev spadne
Program dále pokraèuje takto:
9 zelených láhví stojí na stole a jedna láhev spadne
Až skonèí poslední vìtou:

1 zelená láhev stojí na stole a jedna láhev spadne

Vytvoøte program, který provede takovýto výstup pro 10 láhví. Všimnìte si,
 že program umí skloòovat slova "zelená" a "láhev".

Ukázka obrazovky programu:
10 zelených láhví stojí na stole a jedna láhev spadne
9 zelených láhví stojí na stole a jedna láhev spadne
8 zelených láhví stojí na stole a jedna láhev spadne
7 zelených láhví stojí na stole a jedna láhev spadne
6 zelených láhví stojí na stole a jedna láhev spadne
5 zelených láhví stojí na stole a jedna láhev spadne
4 zelené láhve stojí na stole a jedna láhev spadne
3 zelené láhve stojí na stole a jedna láhev spadne
2 zelené láhve stojí na stole a jedna láhev spadne
1 zelená láhev stojí na stole a jedna láhev spadne*/
		
		//reseni
/*		
		for (int i = 10; i>0; i--)
		{
			if(i<=10 && i>=5) {
				System.out.println(i+" zelených láhví stojí na stole a jedna láhev spadne");
		    }
		    if( i<5 && i>=2) {
				System.out.println(i+" zelené láhve stojí na stole a jedna láhev spadne");
		    }
		    if( i==1) {
				System.out.println(i+" zelená láhev stojí na stole a jedna láhev spadne");
		    }
			
		}
*/
		
/********************************* sucet dvoch intervalov *************************************/

/*Vytvoøte program, který si nechá na vstupu zadat 2 intervaly 
 * (vždy dolní a horní mez jako celé èíslo). Následnì vypíše všechny 
 * dvojice èísel (z prvního a druhého intervalu), jejichž souèet leží 
 * alespoò v jednom z intervalù.

Ukázka obrazovky programu:
Zadejte levou mez 1. intervalu:
5
Zadejte pravou mez 1. intervalu:
25
Zadejte levou mez 2. intervalu:
4
Zadejte pravou mez 2. intervalu:
16
Dvojice èísel, jejichž souèet leží v nìkterém z intervalù:
(1. èíslo je z prvního intervalu a 2. z druhého intervalu)
[5;4], [5;5], [5;6], [5;7], [5;8], [5;9], [5;10], [5;11], [5;12], [5;13], 
[5;14], [5;15], [5;16], [6;4], [6;5], [6;6], [6;7], [6;8], [6;9], [6;10],
[6;11], [6;12], [6;13], [6;14], [6;15], [6;16], [7;4], [7;5], [7;6], 
[7;7], [7;8], [7;9], [7;10], [7;11], [7;12], [7;13], [7;14], [7;15], 
[7;16], [8;4], [8;5], [8;6], [8;7], [8;8], [8;9], [8;10], [8;11], [8;12], 
[8;13], [8;14], [8;15], [8;16], [9;4], [9;5], [9;6], [9;7], [9;8], [9;9],
[9;10], [9;11], [9;12], [9;13], [9;14], [9;15], [9;16], [10;4], [10;5], 
[10;6], [10;7], [10;8], [10;9], [10;10], [10;11], [10;12], [10;13], 
[10;14], [10;15], [11;4], [11;5], [11;6], [11;7], [11;8], [11;9], 
[11;10], [11;11], [11;12], [11;13], [11;14], [12;4], [12;5], [12;6],
[12;7], [12;8], [12;9], [12;10], [12;11], [12;12], [12;13], [13;4], 
[13;5], [13;6], [13;7], [13;8], [13;9], [13;10], [13;11], [13;12], 
[14;4], [14;5], [14;6], [14;7], [14;8], [14;9], [14;10], [14;11], 
[15;4], [15;5], [15;6], [15;7], [15;8], [15;9], [15;10], [16;4], [16;5],
[16;6], [16;7], [16;8], [16;9], [17;4], [17;5], [17;6], [17;7], [17;8],
[18;4], [18;5], [18;6], [18;7], [19;4], [19;5], [19;6], [20;4],
[20;5], [21;4],*/		

/*
		//reseni
		Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte levou mez 1. intervalu:");
		int leva_mez_dolni = Integer.parseInt(sc.nextLine());
		
		System.out.println("Zadejte pravou mez 1. intervalu:");
		int prava_mez_dolni = Integer.parseInt(sc.nextLine());
		
		System.out.println("Zadejte levou mez 2. intervalu:");
		int leva_mez_horni = Integer.parseInt(sc.nextLine());
		
		System.out.println("Zadejte pravou mez 2. intervalu:");
		int prava_mez_horni = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dvojice èísel, jejichž souèet leží v nìkterém z intervalù:");
		System.out.println("(1. èíslo je z prvního intervalu a 2. z druhého intervalu)");
		 
		
		for (int i =leva_mez_dolni; i<=prava_mez_dolni; i++) {
			 
			
			for (int j =leva_mez_horni; j<=prava_mez_horni; j++) {
				if( ((i+j)>=leva_mez_dolni&&(i+j)<=prava_mez_dolni) ||((i+j)>=leva_mez_horni&&(i+j)<=prava_mez_horni)) {
				System.out.print("["+i+";"+j+"], ");
			     }
			}	
		}
*/
/**********************************************************************/
/**********************************************************************/
/**********************************************************************/
/**********************************************************************/
/**********************************************************************/		
///////////////////////////////// end /////////////////////////////////////////////		  
	}

}
