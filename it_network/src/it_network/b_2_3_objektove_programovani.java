 package it_network;

import java.util.Scanner;
import java.util.Random;
/*P�ed metodou bude tzv. modifik�tor p��stupu, v na�em p��pad� public
 *  (ve�ejn�). Metoda nebude vracet ��dnou hodnotu, toho doc�l�me kl��ov�m 
 *  slovem void. D�le bude n�sledovat samotn� n�zev metody, metody p�eme 
 *  stejn� jako prom�nn� velbloud� notac� s mal�m po�. p�smenem. Z�vorka s 
 *  parametry je povinn�, my ji nech�me pr�zdnou, proto�e metoda ��dn� 
 *  parametry m�t nebude. Do t�la metody zap�eme k�d pro v�pis na konzoli:*/



public class b_2_3_objektove_programovani {
	
public static void main(String[] args) {
	
/***********Lekce 2 - Prvn� objektov� aplikace v Jav� - Hello object world */

 /********************instance tridy bez parametru**********************/
/*Nyn� si v t�le metody main() vytvo��me instanci t��dy Zdravic. Bude to tedy ten
 *  objekt zdravi�, se kter�m budeme pracovat. Objekty se ukl�daj� do
 *   prom�nn�ch, n�zev t��dy slou�� jako datov� typ. Instance m� zpravidla 
 *   n�zev t��dy, jen m� prvn� p�smeno mal�. Deklarujme si prom�nnou a 
 *   n�sledn� v n� zalo�me novou instanci t��dy Zdravic:*/

/*
		 
		Zdravic zdravic = new Zdravic(); //vytvoreni instanci t��dy Zdravic
		    zdravic.pozdrav();
*/
		
/*************************daslsi typ tridy s parametrem*******************/
		/*
		//trida - instance-objekt
		Zdravic zdravic = new Zdravic();
		zdravic.pozdrav("Karel");         //volani metody pozdrav
		zdravic.pozdrav("Petr");	
		
		*/
		
		
/*************************daslsi typ tridy s parametrem+text*******************/

		/*T��d� p�id�me n�jak� atribut, nab�z� se text, kde bude ulo�en text 
 * pozdravu. Atributy se definuj� stejn�, jako prom�nn�. 
 * Jako u metod plat�, �e p�ed n� p�eme modifik�tor p��stupu, bez n�j je
 *  Java bere jako package-private, viz d�le v kurzu. Upravme na�i t��du:*/
	/*	
		Zdravic zdravic = new Zdravic();
		    zdravic.text = "Ahoj u�ivateli";
		    zdravic.pozdrav("Karel");
		    zdravic.pozdrav("Petr");
		    zdravic.text = "V�t�m t� tu program�tore";
		    zdravic.pozdrav("Richard");
		*/
/*************************daslsi typ tridy s navratovou hod******************/
/*
	Zdravic zdravic = new Zdravic();
    zdravic.text = "Ahoj u�ivateli";
    System.out.println(zdravic.pozdrav("Karel"));
    System.out.println(zdravic.pozdrav("Petr"));
    zdravic.text = "V�t�m t� tu program�tore";
    System.out.println(zdravic.pozdrav("Richard"));
*/

/********************�e�en� �lohy k 2. lekci OOP v Jav� ******************************************************/

/**********************kalkulacka pomoci metod alias funkcii****************************************************/	
	/*
	   Kalkulacka kalkulacka= new Kalkulacka();
		Scanner sc = new Scanner(System.in, "Windows-1250");
		
		System.out.println("Zadej 1. ��slo:");
		kalkulacka.a = Float.parseFloat(sc.nextLine());
		System.out.println("Zadej 2. ��slo:");
		kalkulacka.b = Float.parseFloat(sc.nextLine());
		 
		System.out.println("Sou�et: "+kalkulacka.soucet());
		System.out.println("Rozd�l: "+kalkulacka.rozdil());
		System.out.println("Sou�in: "+kalkulacka.soucin());
		System.out.println("Pod�l: "+kalkulacka.podil());
		*/
/**************************nakladne auto************************************************/

/*S pou�it�m objektov� orientovan�ho programov�n� vytvo�te aplikaci,
 *  ve kter� figuruje n�kladn� auto, kter� p�ev�� p�sek. Toto auto
 *   m� nosnost 3 tuny a jeho n�klad je zpo��tku pr�zdn�.

Nechte auto postupn�:

    nalo�it 10 tun
    nalo�it 500 kg
    vylo�it 300 kg
    vylo�it 1 tunu

Jak asi tu��te, nalo�en� a vylo�en� n�kladu bude prob�hat pomoc� metod,
 kter� si p�ed zm�nou v�hy n�kladu nejprve ov���, zda je v aut� dost m�sta 
 nebo zda nevykl�d�me v�ce, ne� je nalo�eno. V p��pad� chyby se n�klad 
 nevlo��/nevylo��.

Po dokon�en� nakl�d�n� a vykl�d�n� nechte vypsat kolik je v aut� kg n�kladu,
 m�lo by v�m vyj�t 200 kg.

Uk�zka obrazovky programu:

Konzolov� aplikace V n�kladn�m aut� je nalo�eno 200 kg
*/
	/*
	NakladniAuto nakladak=new NakladniAuto();
	nakladak.naloz(10000); 
	nakladak.naloz(500);
	nakladak.vyloz(300);
	nakladak.vyloz(1000);
	nakladak.vypis();
	*/
	//nakladak.vyloz(10000); 
	
/***************************seznamka***********************************************/

/*Vytvo�te aplikaci, eviduj�c� dva lidi. Ka�d� �lov�k m� jm�no, v�k a p��tele. Ka�d� �lov�k se tak� um� p�edstavit a to tak, �e vyp�e sv� jm�no, v�k a jm�no sv�ho kamar�da. Vytvo�te v aplikaci n�sleduj�c� 2 lidi:

    "Karel Nov�k", 33 let
    "Josef Nov�", 27 let

Nechte je se skamar�dit a p�edstavit se.

Uk�zka obrazovky programu:

Konzolov� aplikace Ahoj, j� jsem Karel Nov�k, je mi 33 let a m�j kamar�d je Josef Nov�
Ahoj, j� jsem Josef Nov�, je mi 27 let a m�j kamar�d je Karel Nov�k*/
	/*
	 Clovek karel = new Clovek();
     karel.jmeno = "Karel Nov�k";
     karel.vek = 33;
     Clovek josef = new Clovek();
     josef.jmeno = "Josef Nov�";
     josef.vek = 27;
     // Sp��telen�
     karel.kamarad = josef;
     josef.kamarad = karel;
     // P�edstaven�
     karel.predstavSe();
     josef.predstavSe();
	*/
/**********Lekce 3 - Hrac� kostka v Jav� - konstruktory a n�hodn� ��sla***********************************************************/

/*
	    // vytvo�en�
	    Kostka sestistenna = new Kostka();
	    Kostka desetistenna = new Kostka(10);
	    
	    // System.out.println(sestistenna); 
	    //vypis objektu do 
	    //textove podobz pomoci tostring metody s oznacenim @Override
	    // hod �estist�nnou
	   
	    System.out.println(sestistenna);
	    for (int i = 0; i < 10; i++) {
	        System.out.print(sestistenna.hod() + " ");
	    }

	    // hod desetist�nnou
	    System.out.println("\n\n" + desetistenna);
	    for (int i = 0; i < 10; i++) {
	        System.out.print(desetistenna.hod() + " ");
	    } 
*/
/********************�e�en� �lohy k 3. lekci OOP v Jav� *****************************************************************/

/**************************************************************************/
	
	/**************************************************************************/
	/**************************************************************************/		
	/**************************************************************************/
	/**************************************************************************/		
	/**************************************************************************/
	/**************************************************************************/		

////////////////////////////////end////////////////////////////////////////
	}

}
 
 

   
 