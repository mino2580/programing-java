package it_soubory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class zapis_souboru_3 {

	public static void main(String[] args) {
		
/***************Lekce 2 - �vod do pr�ce se soubory v Jav� *****************************************************/		
		
/******************vytvorenie cesty pre subor,obecna konstrukce******************************************************/		
		
		/*
		String cesta = "";//momentalne se soubor vytvori v domovskem adresary projektu

		cesta = System.getenv("APPDATA") + File.separator + "DevbookTutorial";
		File fCesta = new File(cesta);
		if (!fCesta.isDirectory())
		{
		        if (!fCesta.mkdirs())
		        {
		                System.out.printf("Nepoda�ilo se vytvo�it slo�ku %s, zkontrolujte pros�m sv� opr�vn�n�.", cesta);
		        }
		}

		File fDatabaze = new File(cesta + File.separator + "databaze.dat");
		if (fDatabaze.exists())
		{
		        try
		        {
		                // Zde um�st�te k�d pro na�ten� va�eho nastaven� ze souboru
		        }
		        catch (Exception e)
		        {
		                System.out.printf("P�i na��t�n� nastaven� do�lo k n�sleduj�c� chyb�: %s", e.getMessage());
		        }
		}
		else
		{
		        try
		        {
		                // Zde um�st�te k�d pro vytvo�en� va�eho nastaven� ze souboru
		        }
		        catch (Exception e)
		        {
		                System.out.printf("P�i vytvo�en� nastaven� do�lo k n�sleduj�c� chyb�: %s", e.getMessage());
		        }
		}		
		
		*/
/****************Z�pis textu do nov�ho souboru********************************************************/

/*nejprve poj�me vytvo�it nov� textov� soubor a n�co do n�j zapsat. 
 * Vytvo�te si nov� projekt s n�zvem TextoveSoubory.
 *  K zapisov�n� do textov�ch soubor� n�m Java poskytuje t��du 
 *  BufferedWriter. Buffered znamen�, �e zapisova� vyu��v� vyrovn�vac�
pam�, aby urychlil z�pis na disk.

		Vytvo�me blok try-with-resources a zalo�me v n�m novou instanci 
		BufferedWriteru. Jak ji� v�me z p�edchoz�ch d�l�, 
		try-with-resources se n�m automaticky postar� o zav�en� souboru
		 po dokon�en� z�pisu/�ten�. Do konstruktoru vlo��me instanci 
		 FileWriteru, kter� BufferedWriter obaluje.
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
		
/**********************Z�pis textu do nov�ho souboru**************************************************/

/*N� BufferedWriter je nyn� nasm�rovan� na spr�vn� soubor.
 *  Nov� ��dek zap�eme pomoc� metody write(). Od��dkov�n� v souboru 
 *  doc�l�me metodou newLine(). Po dokon�en� z�pisu mus�me zavolat metodu 
 *  flush(), kter� se star� o vypr�zdn�n� bufferu. S t�m se zde nebudeme 
 *  zat�ovat, posta�� n�m v�d�t, �e n�mi zapsan� ��dky mohou z�stat chv�li
 *   ve vyrovn�vac� pam�ti a my pomoc� flush() vynut�me jejich z�pis.*/
		/*
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor1.txt")))
		{
		    bw.write("Prvn� ��dek");
		    bw.newLine();
		    bw.write("Tento text je na druh�m ��dku");
		    bw.newLine();
		    bw.write("A do t�etice.");
		    bw.newLine();
		    bw.flush();
		}
		catch (Exception e)
		{
		    System.err.println("Do souboru se nepovedlo zapsat.");
		}
		*/
/*****************P�ips�n� textu do existuj�c�ho souboru*******************************************************/

	/*Pokud soubor neexistuje, k�d v��e ho vytvo��. Pokud existuje, bude 
 * p�eps�n. Toto chov�n� m��eme zm�nit pomoc� 2. parametru konstruktoru 
 * objektu FileWriter. Pokud ho nastav�me na true, provede se tzv. append
 *  (p�ips�n�). Takto do existuj�c�ho souboru p�ip�eme nov� ��dek:*/
	/*
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt", true)))
		{
		    bw.write("P�ipsan� ��dek");
		    bw.newLine();
		    bw.flush();
		}
		catch (Exception e)
		{
		    System.err.println("Do souboru se nepovedlo zapsat.");
		}	
		*/
/*******************�ten� existuj�c�ho souboru*****************************************************/

/*Zb�v� n�m ji� jen um�t soubor na��st. Nen� to o nic slo�it�j��, 
 * ne� z�pis a op�t k tomu m�me v Jav� p�ipravenou t��du, konkr�tn� 
 * BufferedReader. Pou�it� je obdobn�, nam�sto metody write() pou�ijeme 
 * readLine(), kter� vrac� ��dek textu ze souboru a z�rove� se p�esune
 *  na ��dek n�sleduj�c�. Budeme ji tedy volat ve while cyklu. Podm�nka
 *   pro o�et�en� vyjet� ze souboru je mo�n� krkolomn�j��, kontrolujeme,
 *    zda prob�hlo p�i�azen� nov� ��dky do prom�nn�.*/
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
		    System.err.println("Chyba p�i �ten� ze souboru.");
		}
		*/
		
/***************************cely kod suboru,zapis,pripis vyis txt suboru*/
		/*
		// z�pis do souboru
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt")))
		{
		    bw.write("Prvn� ��dek");
		    bw.newLine();
		    bw.write("Tento text je na druh�m ��dku");
		    bw.newLine();
		    bw.write("A do t�etice.");
		    bw.newLine();
		    bw.flush();
		    System.out.println("Do souboru bylo zaps�no");
		}
		catch (Exception e)
		{
		    System.err.println("Do souboru se nepovedlo zapsat.");
		}

		// p�ips�n� textu do existuj�c�ho souboru
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt", true)))
		{
		    bw.write("P�ipsan� ��dek");
		    bw.newLine();
		    bw.flush();
		    System.out.println("Do souboru bylo p�ips�no");
		}
		catch (Exception e)
		{
		    System.err.println("Do souboru se nepovedlo zapsat.");
		}

		// v�pis obsahu souboru
		System.out.println("Vypisuji cel� soubor:");
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
		    System.err.println("Chyba p�i �ten� ze souboru.");
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
