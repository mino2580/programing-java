package it_kolekce;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Hash_mapy_5_6 {

	public static void main(String[] args) {
		
		//  Hash map vyhledavani prvku pomoci klicu.princip vyhledavani je 
//le abecedy
		
		/*Tøída HashMap obsahuje mimo jiné následující metody:

    put(klíè, hodnota) - Pøidá do slovníku daný klíè a pod nìj zaøadí 
    danou hodnotu.
    clear() - Vyprázdní slovník (vymaže všechny prvky).
    containsKey(klíè) - Vrátí true, pokud je ve slovníku daný klíè.
    containsValue(hod­nota) - Vratí true, pokud slovník obsahuje danou 
    hodnotu (pod libovolným klíèem).
    size() - Vrátí poèet prvkù ve slovníku.
    keySet() - Vrátí množinu klíèù.
    remove(klíè) - Vymaže prvek pod daným klíèem.
    get(klíè) - Vrátí hodnotu pod daným klíèem. Pokud klíè neexistuje, 
    vrátí null.
    values() - Vrací kolekci hodnot slovníku.
    entrySet() - Vrátí množinu všech záznamù ve slovníku.
*/

/**************************Slovnik **********************************/
		/*
		HashMap<String, String> slovnik = new HashMap<>();	
		
//Do slovníku si pøidáme nìkolik slovíèek:		
		slovnik.put("cat", "koèka");
		slovnik.put("mouse", "myš");
		slovnik.put("computer", "poèítaè");
		
//A nyní nechme uživatele zadat hledané slovo:		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Zadej slovo: ");
		String slovo = scanner.nextLine();
		
//Pokud slovník dané slovo obsahuje, vypíšeme jeho pøeklad, pøesnìji 
		//hodnotu pod klíèem, který uživatel zadal. V opaèném pøípadì 
		//zahlásíme, že slovíèko ve slovníku není:	
		
		if (slovnik.containsKey(slovo)) {
		    System.out.println("Pøeklad: " + slovnik.get(slovo));
		} else {
		    System.out.println("Takové slovíèko ve slovníku není.");
		}

//Ukažme si ještì, jakým zpùsobem pøes slovník iterovat. 
		//Mùžeme iterovat buï jeho klíèe:
		
		System.out.println("Výpis slovníku: ");
		for (String s : slovnik.keySet()) {
		    System.out.println(s + " - " + slovnik.get(s));
		}		
*/
/******************************HashSet -Cestujici *******************************/
/*HashSet  Cestujici

Rozhraní Set reprezentující množiny implementuje v Java Collections Frameworku více tøíd, liší se v implementaci. Nejèastìji se setkáte s implementací v podobì tøídy HashSet. Další tøída, kterou je možné použít, je tøída TreeSet. My budeme používat první zmínìnou, tedy HashSet. Množina jako obvykle poskytuje nám známé vlastnosti a metody:

    add(),
    clear(),
    contains(),
    size(),
    remove().
*/	
		
/*
		// vytvoøení nìkolika cestujících
		Cestujici karel = new Cestujici("Karel", "Novák");
		Cestujici josef = new Cestujici("Josef", "Nový");
		Cestujici tomas = new Cestujici("Tomáš", "Marný");

		// vytvoøení HashSetu
		HashSet<Cestujici> cestujici = new HashSet<>();	
		
		
	//Vložme cestující do množiny tak, abychom nìkteré vložili vícekrát:
		
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
