package it_soubory;

import java.io.*; 
import java.util.*; 


public class csv_subory_4 {

	public static void main(String[] args) {
		
/************************************************************************/

/*N�kter� u�ite�n� t��dy open csv

CSVReader � Tato t��da poskytuje operace pro �ten� souboru CSV jako 
seznamu pole String.
CSVWriter � Tato t��da n�m umo��uje zapsat data do souboru CSV.
CsvToBean � Tato t��da se pou�ije, kdy� chcete naplnit java fazole z
 obsahu souboru CSV.
BeanToCsv � Tato t��da pom�h� exportovat data do souboru CSV z va�� java
 aplikace.*/		
		
		
/**********************�ten� dat ��dek po ��dku **************************************************/

/*�ten� dat ��dek po ��dku : Umo��uje vid�t, jak ��st soubor CSV ��dek 
 * po ��dku. Pro �ten� dat ��dek po ��dku, nejprve mus�me vytvo�it a
 *  inicializovat CSVReader objekt p�ed�n�m filereader objekt csv souboru.
 *   Pot� mus�me volat metodu readNext() objektu CSVReader pro �ten� dat 
 *   ��dek po ��dku, jak je zn�zorn�no v n�e uveden�m k�du*/		
		
		/*
		// Java code to illustrate reading a 
		// CSV file line by line 
		public static void readDataLineByLine(String file) 
		{ 
		  
		    try { 
		  
		        // Create an object of filereader 
		        // class with CSV file as a parameter. 
		        FileReader filereader = new FileReader(file); 
		  
		        // create csvReader object passing 
		        // file reader as a parameter 
		        CSVReader csvReader = new CSVReader(filereader); 
		        String[] nextRecord; 
		  
		        // we are going to read data line by line 
		        while ((nextRecord = csvReader.readNext()) != null) { 
		            for (String cell : nextRecord) { 
		                System.out.print(cell + "\t"); 
		            } 
		            System.out.println(); 
		        } 
		    } 
		    catch (Exception e) { 
		        e.printStackTrace(); 
		    } 
		} 
		*/
		
/**********************P�e�t�te si v�echna data najednou**************************************************/

/*P�e�t�te si v�echna data najednou : �teme z�znamy CSV jeden po druh�m 
 * pomoc� metody readNext(). CSVReader tak� poskytuje metodu nazvanou 
 * readAll() pro �ten� v�ech z�znam� najednou do seznamu.
 List allData = csvReader.readAll(); 
Kdy� �teme soubor CSV ve v�choz�m nastaven�, hlavi�ka nebude ignorov�na, 
jak je zn�zorn�no ve v�stupu v��e uveden�ch k�d�. Kdy� pot�ebujeme 
p�esko�it prvn� prvek v seznamu, pak m��eme zadat po��te�n� ��dek p�i 
vytv��en� CSVReader.*/		
	/*
		// Java code to illustrate reading a 
		// all data at once 
		public static void readAllDataAtOnce(String file) 
		{ 
		    try { 
		        // Create an object of file reader 
		        // class with CSV file as a parameter. 
		        FileReader filereader = new FileReader(file); 
		  
		        // create csvReader object and skip first Line 
		        CSVReader csvReader = new CSVReaderBuilder(filereader) 
		                                  .withSkipLines(1) 
		                                  .build(); 
		        List<String[]> allData = csvReader.readAll(); 
		  
		        // print Data 
		        for (String[] row : allData) { 
		            for (String cell : row) { 
		                System.out.print(cell + "\t"); 
		            } 
		            System.out.println(); 
		        } 
		    } 
		    catch (Exception e) { 
		        e.printStackTrace(); 
		    } 
		} 
		*/
/****************************�ten� souboru CSV s jin�m odd�lova�em********************************************/

/*Pro vlastn� odd�lova� je vytvo�en prvn� CSVParser se specifick�m znakem
 *  analyz�toru.

CSVParser parser = new CSVParserBuilder().withSeparator(';').build();*/	
 
// Java code to illustrate 
// Reading CSV File with different separator 
		/*
public static void readDataFromCustomSeperator(String file) 
{ 
    try { 
        // Create an object of file reader class with CSV file as a parameter. 
        FileReader filereader = new FileReader(file); 
  
        // create csvParser object with 
        // custom seperator semi-colon 
        CSVParser parser = new CSVParserBuilder().withSeparator(';').build(); 
  
        // create csvReader object with parameter 
        // filereader and parser 
        CSVReader csvReader = new CSVReaderBuilder(filereader) 
                                  .withCSVParser(parser) 
                                  .build(); 
  
        // Read all data at once 
        List<String[]> allData = csvReader.readAll(); 
  
        // Print Data. 
        for (String[] row : allData) { 
            for (String cell : row) { 
                System.out.print(cell + "\t"); 
            } 
            System.out.println(); 
        } 
    } 
    catch (Exception e) { 
        e.printStackTrace(); 
    } 
} 
		*/
		
/******************************Z�pis souboru CSV******************************************/

	     
/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		
		// TODO Auto-generated method stub

	}

}
