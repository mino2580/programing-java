package it_soubory;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;

public class Prace_slozky_14 {

	public static void main(String[] args) {
		
/**********************Lekce 14 - Práce se soubory a složkami v Javì **************************************************/
/*GET metody

Máme k dispozici následující get metody, které si všechny hned prakticky 
vyzkoušíme:

    getAbsolutePath(): String - vrátí absolutní cestu k souboru
    getCanonicalPath(): String - vrátí canonizovanou cestu k souboru
    getFreeSpace(): long - vrátí poèet volných bytù v oddílu, ve kterém 
    se soubor nachází
    getName(): String - vrátí název souboru
    getParent(): String - vrátí absolutní cestu k rodièi, nebo null, 
    pokud soubor je sám rodiè
    getParentFile(): File - vrátí instanci tøídy File reprezentující 
    rodièe aktuálního souboru
    getPath(): String - vrátí cestu k souboru (pøedem není jisté, v 
    jakém tvaru ji dostanete, proto je lepší používat getCanonicalPath()
    getTotalSpace(): long - vrátí celkový poèet bytù v oddílu, ve kterém 
    se soubor nachází
    getUsableSpace(): long - vrátí poèet použitelných bytù pro aktuální 
    virtuální stroj; výsledek je pøesnìjší, než z metody getFreeSpace()

    ET metody

Set metody, jak název již napovídá, souborùm nastavují nìjaké vlastnosti. Jsou to:

    setExecutable(boolean executable, boolean ownerOnly): boolean - nastaví, zda-li je soubor spustitelný; druhý parametr je nepovinný (existuje pøetížení, kdy se tento parametr automaticky nastaví na true); pokud je druhý parametr true, tak se spustitelnost nastaví pouze aktuálnímu uživateli
    setLastModified(long time): boolean - nastaví datum poslední zmìny souboru
    setReadable(boolean readable, boolean ownerOnly): boolean - nastaví, zda-li je soubor možné èíst; pro druhý parametr platí to samé jako u první metody
    setReadOnly(): boolean - jednosmìrná metoda, pomocí které se nastaví soubor pouze pro ètení -> nepùjde do nìj zapisovat
    setWritable(boolean writable, boolean ownerOnly): boolean - nastaví, zda-li je možné do souboru zapisovat; pro druhý parametr platí to samé jako u první metody

CAN metody

Can metody máme následující:

    canExecute(): boolean - vrátí true, pokud lze soubor spustit, jinak false
    canRead(): boolean - vrátí true, pokud lze ze souboru èíst, jinak false
    canWrite(): boolean vrátí true, pokud lze do souboru zapisovat, jinak false

IS metody

Pomocí "IS" metod se mùžeme ptát na tyto vìci:

    isAbsolute(): boolean - vrátí true, pokud byla instance vytvoøena za pomoci absolutní cesty
    isDirectory(): boolean - vrátí true, pokud se jedná o složku
    isFile(): boolean - vrátí true, pokud se jedná o soubor
    isHidden(): boolean - vrátí true, pokud je soubor skrytý

FUNKÈNÍ metody

Z probíraných metod nám už jenom chybí tvz. "funkèní" metody, tedy 
takové metody, které nìco provádí se samotným souborem a které budeme
 využívat nejèastìji.

    toURI(): URI - vytvoøí URI z použité instance souboru
    createNewFile(): boolean - vytvoøí nový soubor pokud neexistuje; 
          vrátí true, pokud se soubor podaøilo vytvoøit, jinak false
    delete(): boolean - smaže soubor; vrátí true, pokud se soubor podaøilo 
          smazat, jinak false
    deleteOnExit(): void - smaže soubor až po ukonèení programu
    exists(): boolean - vrátí true, pokud soubor existuje, jinak false
    length(): long - vrátí velikost souboru v bytech
    list(): String[] - vrátí pole absolutních cest souborù ve složce
    listFiles(): File[] - vrátí pole instancí souboru ve složce
    mkdir(): boolean - pokusí se vytvoøit složku; vrátí true, pokud se 
           složka vytvoøila, jinak false
    mkdirs(): boolean - pokusí se vytvoøit všechny složky v cestì; vrátí 
            true, pokud se všechny složky vytvoøily, jinak false
    renameTo(File dest): boolean - pøejmenuje soubor na nové jméno; lze 
            chápat jako "pøesun" souboru z jednoho místa na druhé; metoda je
            platformì závislá; nelze použít pro pøesun souboru mezi dvìma 
            souborovými systémy
    toPath(): Path - vytvoøí novou instanci rozhraní Path, o kterém 
    si povíme v pøíští lekci

*/	
		
		
/***********************Knihovní tøída Files*************************************************/

/***********************Vytvorenie suboru*************************************************/

		/*createFile()

		Funkce createNewFile() je souèástí tøídy File v jazyce Java . 
		Tato funkce vytvoøí nový prázdný soubor. Funkce vrátí hodnotu 
		true, pokud abstraktní cesta k souboru neexistuje a je vytvoøen 
		nový soubor. Vrátí hodnotu false, pokud název souboru již 
		existuje.	*/
		  /*
		  try { 
			  
	            // Get the file 
	            //File f = new File("D:\\program\\123.txt"); 
			  File f = new File("D:\\123.txt");
	            // Create new file 
	            // if it does not exist 
	            if (f.createNewFile()) 
	                System.out.println("File created"); 
	            else
	                System.out.println("File already exists"); 
	        } 
	        catch (Exception e) { 
	            System.err.println(e); 
	        } 
	        */
/*********************createDirectory()************************************************/
		/*
		// create an abstract pathname (File object) 
        File f = new File("D:\\program"); 
        f.mkdir();
        // check if the directory can be created 
        // using the abstract path name 
       
        /*if (f.mkdir()) { 
  
            // display that the directory is created 
            // as the function returned true 
            System.out.println("Directory is created"); 
        } 
        else { 
            // display that the directory cannot be created 
            // as the function returned false 
            System.out.println("Directory cannot be created"); 
        } */
/********* Pokusíme se najít všechny soubory a adresáøe v daném adresáø************************************************/

/*Metoda listFiles() je souèástí tøídy File. Funkce vrátí pole Souborù
 *  oznaèujících soubory v daném abstraktním názvu cesty, pokud je
 *   název cesty adresáø else vrátí hodnotu null. Funkce je pøetížená
 *    funkce. Jedna z funkcí nemá žádný parametr, druhá funkce pøebírá 
 *    objekt FilenameFilter jako parametr, tøetí funkce pøebírá objekt 
 *    FileFilter jako parametr

Podpis funkce:

public File[] listFiles()
public File[] listFiles(FilenameFilter f)
public File[] listFiles(FileFilter f)
Syntaxe funkce:

file.listFiles()
file.listFiles(filter)
Parametry: Tato funkce je pøetížená funkce

Jedna z funkcí nemá žádný parametr,
Druhá funkce pøebírá objekt FilenameFilter jako parametr,
Tøetí funkce pøebírá objekt FileFilter jako parametr
Vrácená hodnota: Funkce vrátí pole Soubor nebo hodnotu null, pokud je
 objektem souboru soubor.



Výjimka: Tato metoda vyvolá výjimku zabezpeèení, pokud funkce není 
povolen pøístup pro ètení do souboru

Níže uvedené programy ilustrují použití funkce listFiles()*/
		/*
		 
		  // try-catch block to handle exceptions 
        try { 
  
            // Create a file object 
            File f = new File("D:\\program"); 
  
            // Get all the names of the files present 
            // in the given directory 
            File[] files = f.listFiles(); 
  
            System.out.println("Files are:"); 
  
            // Display the names of the files 
            for (int i = 0; i < files.length; i++) { 
                System.out.println(files[i].getName()); 
            } 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 	
       */  
/****Pokusíme se najít všechny soubory a adresáøe v daném adresáøi, 
 ****jehož jména zaèínají na "12"                                  */
		/*
		// try-catch block to handle exceptions 
        try { 
  
            // Create a file object 
            File f = new File("D:\\program"); 
  
            // Create a FilenameFilter 
            FilenameFilter filter = new FilenameFilter() { 
  
                public boolean accept(File f, String name) 
                { 
                    return name.startsWith("12"); 
                } 
            }; 
  
            // Get all the names of the files present 
            // in the given directory 
            // and whose names start with "12" 
            File[] files = f.listFiles(filter); 
  
            System.out.println("Files are:"); 
  
            // Display the names of the files 
            for (int i = 0; i < files.length; i++) { 
                System.out.println(files[i].getName()); 
            } 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
		*/
		/************************************************************************/
		/************************************************************************/
		
		// TODO Auto-generated method stub

	}

}
