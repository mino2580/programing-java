package it_kolekce;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class seznam_List_3_4 {

	public static void main(String[] args) {
		
/**********************it network***********************************/
		/*Nyní si tyto metody popíšeme:

    size() - vrátí aktuální poèet prvkù v kolekci
    isEmpty() - vrátí true, pokud se v kolekci nenachází žádný prvek, jinak false
    contains() - vrátí true, pokud kolekce obsahuje prvek z parametru
    add() - pøidá prvek do kolekce; vrátí true, pokud se zmìnila kolekce (prvek byl pøidán), jinak false
    remove() - odebere prvek z kolekce; vrátí true, pokud se zmìnila kolekce (prvek existoval a byl odebrán), jinak false
    clear() - vymaže obsah kolekce
*/
/************************prochazeni pole ******************************/
		/*
		String[] jmena = new String[] {"Karel", "Pepa", "Michal", "Vojta"};

		for (int i = 0; i < jmena.length; i++) {
		    System.out.println(jmena[i]);
		}
		*/		
/************************prochazeni pole foreach: ******************************/
		/*
		String[] jmena = new String[] {"Karel", "Pepa", "Michal", "Vojta"};

		for (String jmeno: jmena) {
		    System.out.println(jmeno);
		}
		*/
/************************ Vlastní iterátor ******************************/

	/*Ukažme si jak implementovat vlastní iterátor, tedy objekt umožòující 
 * prùchod nìjakou kolekcí. Uvažujme, že jsme si vytvoøili vlastní kolekci 
 * SimpleList, která jen obaluje obyèejné pole, které ji pøijde v 
 * konstruktoru. Tøídì nebudeme pøidávat žádné metody, pouze ji 
 * implementujeme rozhraní Iterable a metodu iterator(), která 
 * vrátí anonymní implementaci rozhraní iterátor:*/		
		
/************************Rozhrani iterator ******************************/

/*		Rozhraní Iterator

		Na chvíli se zastavíme u rozhraní Iterator, které je vráceno stejnojmennou metodou. Toto rozhraní obsahuje dvì dùležité metody: next() a hasNext(). Metody si opìt popišme:

		    next() - vrátí následující prvek
		    hasNext() - vrátí true, pokud existuje následující prvek

		Pomocí tìchto 2 metod je Java následnì schopná kolekci od zaèátku do konce projet.

		Od Javy verze 8 jsou na rozhraní také metody:

		    remove() - odstraní prvek z kolekce, pokud tuto operaci kolekce podporuje, jinak se vyvolá výjimka UnsupportedOperationException; toto je jediný správný zpùsob, jak lze odstranit prvek z kolekce, když jí procházíme
		    forEachRemaining() - projde každý prvek kolekce a aplikuje na nìj pøíslušnou akci
	*/	

/************************Lekce 3 - Seznam (List) pomocí pole v Javì  ******************************/
//pole

		/*Udìlejme si na zaèátku malou odboèku zpìt k poli, které bylo
		 *  první "kolekcí", kterou jsme v seriálu poznali. Pole se 
		 *  vyznaèuje tím, že má pevnì daný poèet prvkù. Z tohoto dùvodu 
		 *  nìkdy ani nebývá považováno za kolekci, protože nesplòuje èást
		 *   jejich definice. Prvky v poli jsou èíselnì indexovány a to od
		 *    nuly.

Hlavní nevýhodou pole tedy je, že do nìj nemùžeme za bìhu aplikace prvky 
pøidávat nebo je mazat. To bohužel èasto potøebujeme, i když jsou situace,
 kdy je pole ideální volba. Touto daní je vyvážena obrovská rychlost, 
 se kterou mùžeme s prvky pole pracovat. Jelikož data jsou stejného typu 
 (a již úplnì stejného, nebo spoleèného pøedka), zabírají v pamìti stejnì 
prvky pole jsou v pamìti uložené za sebou, jako v øadì, která je 
nepøerušená. Pole celých èísel si mùžeme pøedstavit napø. takto:
Struktura pole v Javì

Pokud tedy chceme napø. pøistoupit na 5. prvek, jen vstoupíme tam, kde 
pole zaèíná, a poté odskoèíme 4 násobky velikosti typu (zde intu) dále.
 Jsme na 5. prvku. Ètení a zápis na indexy v poli má tedy konstantní 
 èasovou složitost. Pokud vás tento termín zmátl, mùžete to chápat tak, 
 že do pole zapisujeme okamžitì a stejnì tak z nìj i èteme.*/
		
		
	
/**************************Lekce 4 - Spojový seznam v Javì ***************************************/

		//vyhledava a projizdi celim seznamem pomoci reference
		
/*          Ukažme si metody, které má LinkedList oproti klasickému ArrayListu navíc:

		    addFirst() - Pøidá nový prvek na zaèátek seznamu.
		    addLast() - Pøidá nový prvek na konec seznamu.
		    getFirst() - Vrátí první prvek.
		    getLast() - Vrátí poslední prvek.
		    removeFirst() - Odstraní první prvek.
		    removeLast() - Odstraní poslední prvek.
*/
		
		/*
		LinkedList<Integer> seznam = new LinkedList<>();
		seznam.add(5);
		seznam.addFirst(6);
		seznam.addLast(10);
		System.out.println(seznam.getFirst());
		System.out.println(seznam.getLast());
		*/
		/*
		LinkedList<Integer> seznam = new LinkedList<>();
		seznam.addLast(1);
		seznam.addLast(2);
		seznam.addLast(3);
		seznam.addLast(4);
		seznam.addLast(5);

		// pøidávání a mazání v prostøedku seznamu
		//seznam.add(3, 32);
		//seznam.add(3, 31);
		//seznam.remove(2);

		// výpis seznamu
		for (Integer i : seznam) {
		    System.out.print(i + ", ");
		}
		*/
/*****************************************************************/
		/*****************************************************************/
		/*****************************************************************/
		/*****************************************************************/
		/*****************************************************************/
		/*****************************************************************/
		/*****************************************************************/
		 
	}

}
