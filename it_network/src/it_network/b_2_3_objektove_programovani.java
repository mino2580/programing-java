 package it_network;

import java.util.Scanner;
import java.util.Random;
/*Pøed metodou bude tzv. modifikátor pøístupu, v našem pøípadì public
 *  (veøejná). Metoda nebude vracet žádnou hodnotu, toho docílíme klíèovým 
 *  slovem void. Dále bude následovat samotný název metody, metody píšeme 
 *  stejnì jako promìnné velbloudí notací s malým poè. písmenem. Závorka s 
 *  parametry je povinná, my ji necháme prázdnou, protože metoda žádné 
 *  parametry mít nebude. Do tìla metody zapíšeme kód pro výpis na konzoli:*/



public class b_2_3_objektove_programovani {
	
public static void main(String[] args) {
	
/***********Lekce 2 - První objektová aplikace v Javì - Hello object world */

 /********************instance tridy bez parametru**********************/
/*Nyní si v tìle metody main() vytvoøíme instanci tøídy Zdravic. Bude to tedy ten
 *  objekt zdraviè, se kterým budeme pracovat. Objekty se ukládají do
 *   promìnných, název tøídy slouží jako datový typ. Instance má zpravidla 
 *   název tøídy, jen má první písmeno malé. Deklarujme si promìnnou a 
 *   následnì v ní založme novou instanci tøídy Zdravic:*/

/*
		 
		Zdravic zdravic = new Zdravic(); //vytvoreni instanci tøídy Zdravic
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

		/*Tøídì pøidáme nìjaký atribut, nabízí se text, kde bude uložen text 
 * pozdravu. Atributy se definují stejnì, jako promìnné. 
 * Jako u metod platí, že pøed nì píšeme modifikátor pøístupu, bez nìj je
 *  Java bere jako package-private, viz dále v kurzu. Upravme naši tøídu:*/
	/*	
		Zdravic zdravic = new Zdravic();
		    zdravic.text = "Ahoj uživateli";
		    zdravic.pozdrav("Karel");
		    zdravic.pozdrav("Petr");
		    zdravic.text = "Vítám tì tu programátore";
		    zdravic.pozdrav("Richard");
		*/
/*************************daslsi typ tridy s navratovou hod******************/
/*
	Zdravic zdravic = new Zdravic();
    zdravic.text = "Ahoj uživateli";
    System.out.println(zdravic.pozdrav("Karel"));
    System.out.println(zdravic.pozdrav("Petr"));
    zdravic.text = "Vítám tì tu programátore";
    System.out.println(zdravic.pozdrav("Richard"));
*/

/********************Øešené úlohy k 2. lekci OOP v Javì ******************************************************/

/**********************kalkulacka pomoci metod alias funkcii****************************************************/	
	/*
	   Kalkulacka kalkulacka= new Kalkulacka();
		Scanner sc = new Scanner(System.in, "Windows-1250");
		
		System.out.println("Zadej 1. èíslo:");
		kalkulacka.a = Float.parseFloat(sc.nextLine());
		System.out.println("Zadej 2. èíslo:");
		kalkulacka.b = Float.parseFloat(sc.nextLine());
		 
		System.out.println("Souèet: "+kalkulacka.soucet());
		System.out.println("Rozdíl: "+kalkulacka.rozdil());
		System.out.println("Souèin: "+kalkulacka.soucin());
		System.out.println("Podíl: "+kalkulacka.podil());
		*/
/**************************nakladne auto************************************************/

/*S použitím objektovì orientovaného programování vytvoøte aplikaci,
 *  ve které figuruje nákladní auto, které pøeváží písek. Toto auto
 *   má nosnost 3 tuny a jeho náklad je zpoèátku prázdný.

Nechte auto postupnì:

    naložit 10 tun
    naložit 500 kg
    vyložit 300 kg
    vyložit 1 tunu

Jak asi tušíte, naložení a vyložení nákladu bude probíhat pomocí metod,
 které si pøed zmìnou váhy nákladu nejprve ovìøí, zda je v autì dost místa 
 nebo zda nevykládáme více, než je naloženo. V pøípadì chyby se náklad 
 nevloží/nevyloží.

Po dokonèení nakládání a vykládání nechte vypsat kolik je v autì kg nákladu,
 mìlo by vám vyjít 200 kg.

Ukázka obrazovky programu:

Konzolová aplikace V nákladním autì je naloženo 200 kg
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

/*Vytvoøte aplikaci, evidující dva lidi. Každý èlovìk má jméno, vìk a pøítele. Každý èlovìk se také umí pøedstavit a to tak, že vypíše své jméno, vìk a jméno svého kamaráda. Vytvoøte v aplikaci následující 2 lidi:

    "Karel Novák", 33 let
    "Josef Nový", 27 let

Nechte je se skamarádit a pøedstavit se.

Ukázka obrazovky programu:

Konzolová aplikace Ahoj, já jsem Karel Novák, je mi 33 let a mùj kamarád je Josef Nový
Ahoj, já jsem Josef Nový, je mi 27 let a mùj kamarád je Karel Novák*/
	/*
	 Clovek karel = new Clovek();
     karel.jmeno = "Karel Novák";
     karel.vek = 33;
     Clovek josef = new Clovek();
     josef.jmeno = "Josef Nový";
     josef.vek = 27;
     // Spøátelení
     karel.kamarad = josef;
     josef.kamarad = karel;
     // Pøedstavení
     karel.predstavSe();
     josef.predstavSe();
	*/
/**********Lekce 3 - Hrací kostka v Javì - konstruktory a náhodná èísla***********************************************************/

/*
	    // vytvoøení
	    Kostka sestistenna = new Kostka();
	    Kostka desetistenna = new Kostka(10);
	    
	    // System.out.println(sestistenna); 
	    //vypis objektu do 
	    //textove podobz pomoci tostring metody s oznacenim @Override
	    // hod šestistìnnou
	   
	    System.out.println(sestistenna);
	    for (int i = 0; i < 10; i++) {
	        System.out.print(sestistenna.hod() + " ");
	    }

	    // hod desetistìnnou
	    System.out.println("\n\n" + desetistenna);
	    for (int i = 0; i < 10; i++) {
	        System.out.print(desetistenna.hod() + " ");
	    } 
*/
/********************Øešené úlohy k 3. lekci OOP v Javì *****************************************************************/

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
 
 

   
 