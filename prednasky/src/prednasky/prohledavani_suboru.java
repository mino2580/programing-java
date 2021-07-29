package prednasky;

import java.io.*;

import java.util.*;
//Naprogramujte program, který prohledá všechny podadresáøe v adresáøi 
//zadaném v 2. parametru pøíkazové øádky (napø. "c:\") a najde všechny 
//výskyty názvu souboru zadaného 1. parametrem pøíkazové øádky
//(napø. ".*[0-9]+.*jpg"). Cesty ke všem výskytùm souboru uloží do
//kolekce a kolekci nakonec vypíše do souboru.

//dodelat zapis do soboru...!!!!


class mujComparator implements Comparator<File> { //porovnavanie a ukladanie do stromu
	public int compare(File o1,File o2) {
	return o1.getName().compareTo(o2.getName());	
	}
	
}
public class prohledavani_suboru {
	static String vzor=".*";
	                                          //".*[0-9]+.*jpg";  //tecka  jakekoliv pismenko,                       
	                                          //hviezdicka 0 avice opakovani predchoziho znaku
	
	                                          //.*  prazdny nebo jakykoliv retezec
	static TreeSet<File>soubory = new TreeSet<File>(new mujComparator());      //strom do kotreho ukladam typ file
	public static void listFilesInDirectory(File dir) {
		File[] files = dir.listFiles();   
		                                       //pole suboru,kde su nazvy souboru vcetne cesty
		                                      //listFiles( funkce ktera ty nazvy vraci
		if (files != null) {                  //ak se nerovna nule,alebo ak nie je prazdny adresar
			for (File f : files) {            //pro kasdy soubor files ktery se nachazi v poli delej
				if (f.isDirectory()) {        //pokud je adresar ,tak zavolas funkci ktera vola sama sebe listFilesInDirectory(f);
					listFilesInDirectory(f);     //vypise vsechny soubory v adreasari
				} else {                         //pokud to neni adresar ale soubor
					String name = f.getName();
					if (name.matches(vzor)) {     //pokud odpovida regularnemu vyrazu tak ho vypis
                        soubory.add(f);           //ukladani do stromu
						System.out.print('.');    //tisk tecek
                                                  //System.out.println(f.getPath());
					}
				}
			}
		}
	}

////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		String dir=".";
		if(args.length>=1) {             //uzivatel nam na zacatek prikazu dal parameter,,1 je vzor
			vzor=args[0];
			if(args.length>=2) {             //jestli uzivatel zadal druhy parameter prikazove radky
				dir=args[1]; 
			}
				
		}
		listFilesInDirectory(new File(dir));  //vzpise korenovz adresar java
		for(File f: soubory) {
			System.out.print(f.getPath()+";"+f.getParent());	
		}
		
		                                     //"c:\\"  --vzpise s disku c
	}
///////////////////////////////////////////////////////////////////////
}
