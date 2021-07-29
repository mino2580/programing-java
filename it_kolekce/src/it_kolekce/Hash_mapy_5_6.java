package it_kolekce;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Hash_mapy_5_6 {

	public static void main(String[] args) {
		
		//  Hash map vyhledavani prvku pomoci klicu.princip vyhledavani je 
//le abecedy
		
		/*T��da HashMap obsahuje mimo jin� n�sleduj�c� metody:

    put(kl��, hodnota) - P�id� do slovn�ku dan� kl�� a pod n�j za�ad� 
    danou hodnotu.
    clear() - Vypr�zdn� slovn�k (vyma�e v�echny prvky).
    containsKey(kl��) - Vr�t� true, pokud je ve slovn�ku dan� kl��.
    containsValue(hod�nota) - Vrat� true, pokud slovn�k obsahuje danou 
    hodnotu (pod libovoln�m kl��em).
    size() - Vr�t� po�et prvk� ve slovn�ku.
    keySet() - Vr�t� mno�inu kl���.
    remove(kl��) - Vyma�e prvek pod dan�m kl��em.
    get(kl��) - Vr�t� hodnotu pod dan�m kl��em. Pokud kl�� neexistuje, 
    vr�t� null.
    values() - Vrac� kolekci hodnot slovn�ku.
    entrySet() - Vr�t� mno�inu v�ech z�znam� ve slovn�ku.
*/

/**************************Slovnik **********************************/
		/*
		HashMap<String, String> slovnik = new HashMap<>();	
		
//Do slovn�ku si p�id�me n�kolik slov��ek:		
		slovnik.put("cat", "ko�ka");
		slovnik.put("mouse", "my�");
		slovnik.put("computer", "po��ta�");
		
//A nyn� nechme u�ivatele zadat hledan� slovo:		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Zadej slovo: ");
		String slovo = scanner.nextLine();
		
//Pokud slovn�k dan� slovo obsahuje, vyp�eme jeho p�eklad, p�esn�ji 
		//hodnotu pod kl��em, kter� u�ivatel zadal. V opa�n�m p��pad� 
		//zahl�s�me, �e slov��ko ve slovn�ku nen�:	
		
		if (slovnik.containsKey(slovo)) {
		    System.out.println("P�eklad: " + slovnik.get(slovo));
		} else {
		    System.out.println("Takov� slov��ko ve slovn�ku nen�.");
		}

//Uka�me si je�t�, jak�m zp�sobem p�es slovn�k iterovat. 
		//M��eme iterovat bu� jeho kl��e:
		
		System.out.println("V�pis slovn�ku: ");
		for (String s : slovnik.keySet()) {
		    System.out.println(s + " - " + slovnik.get(s));
		}		
*/
/******************************HashSet -Cestujici *******************************/
/*HashSet  Cestujici

Rozhran� Set reprezentuj�c� mno�iny implementuje v Java Collections Frameworku v�ce t��d, li�� se v implementaci. Nej�ast�ji se setk�te s implementac� v podob� t��dy HashSet. Dal�� t��da, kterou je mo�n� pou��t, je t��da TreeSet. My budeme pou��vat prvn� zm�n�nou, tedy HashSet. Mno�ina jako obvykle poskytuje n�m zn�m� vlastnosti a metody:

    add(),
    clear(),
    contains(),
    size(),
    remove().
*/	
		
/*
		// vytvo�en� n�kolika cestuj�c�ch
		Cestujici karel = new Cestujici("Karel", "Nov�k");
		Cestujici josef = new Cestujici("Josef", "Nov�");
		Cestujici tomas = new Cestujici("Tom�", "Marn�");

		// vytvo�en� HashSetu
		HashSet<Cestujici> cestujici = new HashSet<>();	
		
		
	//Vlo�me cestuj�c� do mno�iny tak, abychom n�kter� vlo�ili v�cekr�t:
		
		cestujici.add(karel);
		cestujici.add(josef);
		cestujici.add(tomas);
		cestujici.add(tomas);
		cestujici.add(karel);
		
		//vypis
		
		for (Cestujici c : cestujici) {
		    System.out.println(c);
		}
		
		*/
/******************************HashSet*******************************/
		
		/******************************HashSet*******************************/
		/******************************HashSet*******************************/
		/******************************HashSet*******************************/
		/******************************HashSet*******************************/
		/******************************HashSet*******************************/
		
		
////////////////////////////////end/////////////////////////////////		
	}

}
