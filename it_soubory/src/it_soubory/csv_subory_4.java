package it_soubory;

import java.io.*; 
import java.util.*; 


public class csv_subory_4 {

	public static void main(String[] args) {
		
/************************************************************************/

/*Nìkteré užiteèné tøídy open csv

CSVReader – Tato tøída poskytuje operace pro ètení souboru CSV jako 
seznamu pole String.
CSVWriter – Tato tøída nám umožòuje zapsat data do souboru CSV.
CsvToBean – Tato tøída se použije, když chcete naplnit java fazole z
 obsahu souboru CSV.
BeanToCsv – Tato tøída pomáhá exportovat data do souboru CSV z vaší java
 aplikace.*/		
		
		
/**********************Ètení dat øádek po øádku **************************************************/

/*Ètení dat øádek po øádku : Umožòuje vidìt, jak èíst soubor CSV øádek 
 * po øádku. Pro ètení dat øádek po øádku, nejprve musíme vytvoøit a
 *  inicializovat CSVReader objekt pøedáním filereader objekt csv souboru.
 *   Poté musíme volat metodu readNext() objektu CSVReader pro ètení dat 
 *   øádek po øádku, jak je znázornìno v níže uvedeném kódu*/		
		
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
		
/**********************Pøeètìte si všechna data najednou**************************************************/

/*Pøeètìte si všechna data najednou : Èteme záznamy CSV jeden po druhém 
 * pomocí metody readNext(). CSVReader také poskytuje metodu nazvanou 
 * readAll() pro ètení všech záznamù najednou do seznamu.
 List allData = csvReader.readAll(); 
Když èteme soubor CSV ve výchozím nastavení, hlavièka nebude ignorována, 
jak je znázornìno ve výstupu výše uvedených kódù. Když potøebujeme 
pøeskoèit první prvek v seznamu, pak mùžeme zadat poèáteèní øádek pøi 
vytváøení CSVReader.*/		
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
/****************************Ètení souboru CSV s jiným oddìlovaèem********************************************/

/*Pro vlastní oddìlovaè je vytvoøen první CSVParser se specifickým znakem
 *  analyzátoru.

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
		
/******************************Zápis souboru CSV******************************************/

	     
/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		/************************************************************************/
		
		// TODO Auto-generated method stub

	}

}
