package it_network;

import java.util.Scanner;

public class a_6_cykly {

	public static void main(String[] args) {
		
/************************** Lekce 6 - Cykly v Jav� ********************/
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
		System.out.println("Mal� n�sobilka pomoc� dvou cykl�:");
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
		System.out.println("Mocnin�tor");
		System.out.println("==========");
		System.out.println("Zadejte z�klad mocniny: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Zadejte exponent: ");
		int n = Integer.parseInt(sc.nextLine());

		int vysledek = a;
		for (int i = 0; i < (n - 1); i++)
		{
		    vysledek = vysledek * a;
		}

		System.out.println("V�sledek: " + vysledek);
		System.out.println("D�kuji za pou�it� mocnin�toru");
*/
/************************** kalkulacka,while+switch+metoda v podmince equals ********************************************/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");

		System.out.println("V�tejte v kalkula�ce");
		String pokracovat = "ano";
		while (pokracovat.equals("ano"))
		{
		    System.out.println("Zadejte prvn� ��slo:");
		    float a = Float.parseFloat(sc.nextLine());
		    System.out.println("Zadejte druh� ��slo:");
		    float b = Float.parseFloat(sc.nextLine());
		    System.out.println("Zvolte si operaci:");
		    System.out.println("1 - s��t�n�");
		    System.out.println("2 - od��t�n�");
		    System.out.println("3 - n�soben�");
		    System.out.println("4 - d�len�");
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
		        System.out.println("V�sledek: " + vysledek);
		    }
		    else
		    {
		        System.out.println("Neplatn� volba");
		    }
		    System.out.println("P�ejete si zadat dal�� p��klad? [ano/ne]");
		    pokracovat = sc.nextLine();
		}
		System.out.println("D�kuji za pou�it� kalkula�ky.");
*/		

/*************************�e�en� �lohy k 6. lekci Javy *****************/
		
		
/******************************** ryby k ve�eri **************************************/
	
	/*Vytvo�te program, kter� se u�ivatele zept�, kolik si d� ryb k ve�e�i.
	 *Pot� mu do konzole vyp�e zadan� po�et ryb t�mto zp�sobem:

<� )))-<
*/	
		// reseni
		
/*	 
			Scanner sc = new Scanner(System.in, "Windows-1250");
			        System.out.println("Kolik ryb si d� k ve�e�i?");
					int a = Integer.parseInt(sc.nextLine());
					
					for (int i = 1; i <= a; i++)
					{
					    System.out.println("<� )))-<");
					}
*/	
		
/********************************* sklonovanie basnicky *************************************/

/*Zad�n� tohoto programu je odvozeno z anglick� ��kanky, kter� za��n� takto:

10 zelen�ch l�hv� stoj� na stole a jedna l�hev spadne
Program d�le pokra�uje takto:
9 zelen�ch l�hv� stoj� na stole a jedna l�hev spadne
A� skon�� posledn� v�tou:

1 zelen� l�hev stoj� na stole a jedna l�hev spadne

Vytvo�te program, kter� provede takov�to v�stup pro 10 l�hv�. V�imn�te si,
 �e program um� sklo�ovat slova "zelen�" a "l�hev".

Uk�zka obrazovky programu:
10 zelen�ch l�hv� stoj� na stole a jedna l�hev spadne
9 zelen�ch l�hv� stoj� na stole a jedna l�hev spadne
8 zelen�ch l�hv� stoj� na stole a jedna l�hev spadne
7 zelen�ch l�hv� stoj� na stole a jedna l�hev spadne
6 zelen�ch l�hv� stoj� na stole a jedna l�hev spadne
5 zelen�ch l�hv� stoj� na stole a jedna l�hev spadne
4 zelen� l�hve stoj� na stole a jedna l�hev spadne
3 zelen� l�hve stoj� na stole a jedna l�hev spadne
2 zelen� l�hve stoj� na stole a jedna l�hev spadne
1 zelen� l�hev stoj� na stole a jedna l�hev spadne*/
		
		//reseni
/*		
		for (int i = 10; i>0; i--)
		{
			if(i<=10 && i>=5) {
				System.out.println(i+" zelen�ch l�hv� stoj� na stole a jedna l�hev spadne");
		    }
		    if( i<5 && i>=2) {
				System.out.println(i+" zelen� l�hve stoj� na stole a jedna l�hev spadne");
		    }
		    if( i==1) {
				System.out.println(i+" zelen� l�hev stoj� na stole a jedna l�hev spadne");
		    }
			
		}
*/
		
/********************************* sucet dvoch intervalov *************************************/

/*Vytvo�te program, kter� si nech� na vstupu zadat 2 intervaly 
 * (v�dy doln� a horn� mez jako cel� ��slo). N�sledn� vyp�e v�echny 
 * dvojice ��sel (z prvn�ho a druh�ho intervalu), jejich� sou�et le�� 
 * alespo� v jednom z interval�.

Uk�zka obrazovky programu:
Zadejte levou mez 1. intervalu:
5
Zadejte pravou mez 1. intervalu:
25
Zadejte levou mez 2. intervalu:
4
Zadejte pravou mez 2. intervalu:
16
Dvojice ��sel, jejich� sou�et le�� v n�kter�m z interval�:
(1. ��slo je z prvn�ho intervalu a 2. z druh�ho intervalu)
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
		
		System.out.println("Dvojice ��sel, jejich� sou�et le�� v n�kter�m z interval�:");
		System.out.println("(1. ��slo je z prvn�ho intervalu a 2. z druh�ho intervalu)");
		 
		
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
