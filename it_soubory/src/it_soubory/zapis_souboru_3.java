package it_soubory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class zapis_souboru_3 {

	public static void main(String[] args) {
		
/***************Lekce 2 - Úvod do práce se soubory v Javì *****************************************************/		
		
/******************vytvorenie cesty pre subor,obecna konstrukce******************************************************/		
		
		/*
		String cesta = "";//momentalne se soubor vytvori v domovskem adresary projektu

		cesta = System.getenv("APPDATA") + File.separator + "DevbookTutorial";
		File fCesta = new File(cesta);
		if (!fCesta.isDirectory())
		{
		        if (!fCesta.mkdirs())
		        {
		                System.out.printf("Nepodaøilo se vytvoøit sloku %s, zkontrolujte prosím svá oprávnìní.", cesta);
		        }
		}

		File fDatabaze = new File(cesta + File.separator + "databaze.dat");
		if (fDatabaze.exists())
		{
		        try
		        {
		                // Zde umístìte kód pro naètení vašeho nastavení ze souboru
		        }
		        catch (Exception e)
		        {
		                System.out.printf("Pøi naèítání nastavení došlo k následující chybì: %s", e.getMessage());
		        }
		}
		else
		{
		        try
		        {
		                // Zde umístìte kód pro vytvoøení vašeho nastavení ze souboru
		        }
		        catch (Exception e)
		        {
		                System.out.printf("Pøi vytvoøení nastavení došlo k následující chybì: %s", e.getMessage());
		        }
		}		
		
		*/
/****************Zápis textu do nového souboru********************************************************/

/*nejprve pojïme vytvoøit novı textovı soubor a nìco do nìj zapsat. 
 * Vytvoøte si novı projekt s názvem TextoveSoubory.
 *  K zapisování do textovıch souborù nám Java poskytuje tøídu 
 *  BufferedWriter. Buffered znamená, e zapisovaè vyuívá vyrovnávací
pamì, aby urychlil zápis na disk.

		Vytvoøme blok try-with-resources a zalome v nìm novou instanci 
		BufferedWriteru. Jak ji víme z pøedchozích dílù, 
		try-with-resources se nám automaticky postará o zavøení souboru
		 po dokonèení zápisu/ètení. Do konstruktoru vloíme instanci 
		 FileWriteru, kterı BufferedWriter obaluje.
*/
		
		/*
		//vytvorenie suboru s nazvom soubor.txt
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt")))
		{
		}
		catch (Exception e)
		{
		    System.err.println("Do souboru se nepovedlo zapsat.");
		}
		*/
		
/**********************Zápis textu do nového souboru**************************************************/

/*Náš BufferedWriter je nyní nasmìrovanı na správnı soubor.
 *  Novı øádek zapíšeme pomocí metody write(). Odøádkování v souboru 
 *  docílíme metodou newLine(). Po dokonèení zápisu musíme zavolat metodu 
 *  flush(), která se stará o vyprázdnìní bufferu. S tím se zde nebudeme 
 *  zatìovat, postaèí nám vìdìt, e námi zapsané øádky mohou zùstat chvíli
 *   ve vyrovnávací pamìti a my pomocí flush() vynutíme jejich zápis.*/
		/*
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor1.txt")))
		{
		    bw.write("První øádek");
		    bw.newLine();
		    bw.write("Tento text je na druhém øádku");
		    bw.newLine();
		    bw.write("A do tøetice.");
		    bw.newLine();
		    bw.flush();
		}
		catch (Exception e)
		{
		    System.err.println("Do souboru se nepovedlo zapsat.");
		}
		*/
/*****************Pøipsání textu do existujícího souboru*******************************************************/

	/*Pokud soubor neexistuje, kód vıše ho vytvoøí. Pokud existuje, bude 
 * pøepsán. Toto chování mùeme zmìnit pomocí 2. parametru konstruktoru 
 * objektu FileWriter. Pokud ho nastavíme na true, provede se tzv. append
 *  (pøipsání). Takto do existujícího souboru pøipíšeme novı øádek:*/
	/*
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt", true)))
		{
		    bw.write("Pøipsanı øádek");
		    bw.newLine();
		    bw.flush();
		}
		catch (Exception e)
		{
		    System.err.println("Do souboru se nepovedlo zapsat.");
		}	
		*/
/*******************Ètení existujícího souboru*****************************************************/

/*Zbıvá nám ji jen umìt soubor naèíst. Není to o nic sloitìjší, 
 * ne zápis a opìt k tomu máme v Javì pøipravenou tøídu, konkrétnì 
 * BufferedReader. Pouití je obdobné, namísto metody write() pouijeme 
 * readLine(), která vrací øádek textu ze souboru a zároveò se pøesune
 *  na øádek následující. Budeme ji tedy volat ve while cyklu. Podmínka
 *   pro ošetøení vyjetí ze souboru je moná krkolomnìjší, kontrolujeme,
 *    zda probìhlo pøiøazení nové øádky do promìnné.*/
		/*
		try (BufferedReader br = new BufferedReader(new FileReader("soubor.txt")))
		{
		    String s;
		    while ((s = br.readLine()) != null)
		    {
		        System.out.println(s);
		    }
		}
		catch (Exception e)
		{
		    System.err.println("Chyba pøi ètení ze souboru.");
		}
		*/
		
/***************************cely kod suboru,zapis,pripis vyis txt suboru*/
		/*
		// zápis do souboru
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt")))
		{
		    bw.write("První øádek");
		    bw.newLine();
		    bw.write("Tento text je na druhém øádku");
		    bw.newLine();
		    bw.write("A do tøetice.");
		    bw.newLine();
		    bw.flush();
		    System.out.println("Do souboru bylo zapsáno");
		}
		catch (Exception e)
		{
		    System.err.println("Do souboru se nepovedlo zapsat.");
		}

		// pøipsání textu do existujícího souboru
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt", true)))
		{
		    bw.write("Pøipsanı øádek");
		    bw.newLine();
		    bw.flush();
		    System.out.println("Do souboru bylo pøipsáno");
		}
		catch (Exception e)
		{
		    System.err.println("Do souboru se nepovedlo zapsat.");
		}

		// vıpis obsahu souboru
		System.out.println("Vypisuji celı soubor:");
		try (BufferedReader br = new BufferedReader(new FileReader("soubor.txt")))
		{
		    String s;
		    while ((s = br.readLine()) != null)
		    {
		        System.out.println(s);
		    }
		}
		catch (Exception e)
		{
		    System.err.println("Chyba pøi ètení ze souboru.");
		}
		*/
		
/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
