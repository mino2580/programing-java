package it_soubory;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;

public class Prace_slozky_14 {

	public static void main(String[] args) {
		
/**********************Lekce 14 - Pr�ce se soubory a slo�kami v Jav� **************************************************/
/*GET metody

M�me k dispozici n�sleduj�c� get metody, kter� si v�echny hned prakticky 
vyzkou��me:

    getAbsolutePath(): String - vr�t� absolutn� cestu k souboru
    getCanonicalPath(): String - vr�t� canonizovanou cestu k souboru
    getFreeSpace(): long - vr�t� po�et voln�ch byt� v odd�lu, ve kter�m 
    se soubor nach�z�
    getName(): String - vr�t� n�zev souboru
    getParent(): String - vr�t� absolutn� cestu k rodi�i, nebo null, 
    pokud soubor je s�m rodi�
    getParentFile(): File - vr�t� instanci t��dy File reprezentuj�c� 
    rodi�e aktu�ln�ho souboru
    getPath(): String - vr�t� cestu k souboru (p�edem nen� jist�, v 
    jak�m tvaru ji dostanete, proto je lep�� pou��vat getCanonicalPath()
    getTotalSpace(): long - vr�t� celkov� po�et byt� v odd�lu, ve kter�m 
    se soubor nach�z�
    getUsableSpace(): long - vr�t� po�et pou�iteln�ch byt� pro aktu�ln� 
    virtu�ln� stroj; v�sledek je p�esn�j��, ne� z metody getFreeSpace()

    ET metody

Set metody, jak n�zev ji� napov�d�, soubor�m nastavuj� n�jak� vlastnosti. Jsou to:

    setExecutable(boolean executable, boolean ownerOnly): boolean - nastav�, zda-li je soubor spustiteln�; druh� parametr je nepovinn� (existuje p�et�en�, kdy se tento parametr automaticky nastav� na true); pokud je druh� parametr true, tak se spustitelnost nastav� pouze aktu�ln�mu u�ivateli
    setLastModified(long time): boolean - nastav� datum posledn� zm�ny souboru
    setReadable(boolean readable, boolean ownerOnly): boolean - nastav�, zda-li je soubor mo�n� ��st; pro druh� parametr plat� to sam� jako u prvn� metody
    setReadOnly(): boolean - jednosm�rn� metoda, pomoc� kter� se nastav� soubor pouze pro �ten� -> nep�jde do n�j zapisovat
    setWritable(boolean writable, boolean ownerOnly): boolean - nastav�, zda-li je mo�n� do souboru zapisovat; pro druh� parametr plat� to sam� jako u prvn� metody

CAN metody

Can metody m�me n�sleduj�c�:

    canExecute(): boolean - vr�t� true, pokud lze soubor spustit, jinak false
    canRead(): boolean - vr�t� true, pokud lze ze souboru ��st, jinak false
    canWrite(): boolean vr�t� true, pokud lze do souboru zapisovat, jinak false

IS metody

Pomoc� "IS" metod se m��eme pt�t na tyto v�ci:

    isAbsolute(): boolean - vr�t� true, pokud byla instance vytvo�ena za pomoci absolutn� cesty
    isDirectory(): boolean - vr�t� true, pokud se jedn� o slo�ku
    isFile(): boolean - vr�t� true, pokud se jedn� o soubor
    isHidden(): boolean - vr�t� true, pokud je soubor skryt�

FUNK�N� metody

Z prob�ran�ch metod n�m u� jenom chyb� tvz. "funk�n�" metody, tedy 
takov� metody, kter� n�co prov�d� se samotn�m souborem a kter� budeme
 vyu��vat nej�ast�ji.

    toURI(): URI - vytvo�� URI z pou�it� instance souboru
    createNewFile(): boolean - vytvo�� nov� soubor pokud neexistuje; 
          vr�t� true, pokud se soubor poda�ilo vytvo�it, jinak false
    delete(): boolean - sma�e soubor; vr�t� true, pokud se soubor poda�ilo 
          smazat, jinak false
    deleteOnExit(): void - sma�e soubor a� po ukon�en� programu
    exists(): boolean - vr�t� true, pokud soubor existuje, jinak false
    length(): long - vr�t� velikost souboru v bytech
    list(): String[] - vr�t� pole absolutn�ch cest soubor� ve slo�ce
    listFiles(): File[] - vr�t� pole instanc� souboru ve slo�ce
    mkdir(): boolean - pokus� se vytvo�it slo�ku; vr�t� true, pokud se 
           slo�ka vytvo�ila, jinak false
    mkdirs(): boolean - pokus� se vytvo�it v�echny slo�ky v cest�; vr�t� 
            true, pokud se v�echny slo�ky vytvo�ily, jinak false
    renameTo(File dest): boolean - p�ejmenuje soubor na nov� jm�no; lze 
            ch�pat jako "p�esun" souboru z jednoho m�sta na druh�; metoda je
            platform� z�visl�; nelze pou��t pro p�esun souboru mezi dv�ma 
            souborov�mi syst�my
    toPath(): Path - vytvo�� novou instanci rozhran� Path, o kter�m 
    si pov�me v p��t� lekci

*/	
		
		
/***********************Knihovn� t��da Files*************************************************/

/***********************Vytvorenie suboru*************************************************/

		/*createFile()

		Funkce createNewFile() je sou��st� t��dy File v jazyce Java . 
		Tato funkce vytvo�� nov� pr�zdn� soubor. Funkce vr�t� hodnotu 
		true, pokud abstraktn� cesta k souboru neexistuje a je vytvo�en 
		nov� soubor. Vr�t� hodnotu false, pokud n�zev souboru ji� 
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
/********* Pokus�me se naj�t v�echny soubory a adres��e v dan�m adres��************************************************/

/*Metoda listFiles() je sou��st� t��dy File. Funkce vr�t� pole Soubor�
 *  ozna�uj�c�ch soubory v dan�m abstraktn�m n�zvu cesty, pokud je
 *   n�zev cesty adres�� else vr�t� hodnotu null. Funkce je p�et�en�
 *    funkce. Jedna z funkc� nem� ��dn� parametr, druh� funkce p�eb�r� 
 *    objekt FilenameFilter jako parametr, t�et� funkce p�eb�r� objekt 
 *    FileFilter jako parametr

Podpis funkce:

public File[] listFiles()
public File[] listFiles(FilenameFilter f)
public File[] listFiles(FileFilter f)
Syntaxe funkce:

file.listFiles()
file.listFiles(filter)
Parametry: Tato funkce je p�et�en� funkce

Jedna z funkc� nem� ��dn� parametr,
Druh� funkce p�eb�r� objekt FilenameFilter jako parametr,
T�et� funkce p�eb�r� objekt FileFilter jako parametr
Vr�cen� hodnota: Funkce vr�t� pole Soubor nebo hodnotu null, pokud je
 objektem souboru soubor.



V�jimka: Tato metoda vyvol� v�jimku zabezpe�en�, pokud funkce nen� 
povolen p��stup pro �ten� do souboru

N�e uveden� programy ilustruj� pou�it� funkce listFiles()*/
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
/****Pokus�me se naj�t v�echny soubory a adres��e v dan�m adres��i, 
 ****jeho� jm�na za��naj� na "12"                                  */
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
