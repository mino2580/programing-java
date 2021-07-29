package it_kolekce;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class seznam_List_3_4 {

	public static void main(String[] args) {
		
/**********************it network***********************************/
		/*Nyn� si tyto metody pop�eme:

    size() - vr�t� aktu�ln� po�et prvk� v kolekci
    isEmpty() - vr�t� true, pokud se v kolekci nenach�z� ��dn� prvek, jinak false
    contains() - vr�t� true, pokud kolekce obsahuje prvek z parametru
    add() - p�id� prvek do kolekce; vr�t� true, pokud se zm�nila kolekce (prvek byl p�id�n), jinak false
    remove() - odebere prvek z kolekce; vr�t� true, pokud se zm�nila kolekce (prvek existoval a byl odebr�n), jinak false
    clear() - vyma�e obsah kolekce
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
/************************ Vlastn� iter�tor ******************************/

	/*Uka�me si jak implementovat vlastn� iter�tor, tedy objekt umo��uj�c� 
 * pr�chod n�jakou kolekc�. Uva�ujme, �e jsme si vytvo�ili vlastn� kolekci 
 * SimpleList, kter� jen obaluje oby�ejn� pole, kter� ji p�ijde v 
 * konstruktoru. T��d� nebudeme p�id�vat ��dn� metody, pouze ji 
 * implementujeme rozhran� Iterable a metodu iterator(), kter� 
 * vr�t� anonymn� implementaci rozhran� iter�tor:*/		
		
/************************Rozhrani iterator ******************************/

/*		Rozhran� Iterator

		Na chv�li se zastav�me u rozhran� Iterator, kter� je vr�ceno stejnojmennou metodou. Toto rozhran� obsahuje dv� d�le�it� metody: next() a hasNext(). Metody si op�t popi�me:

		    next() - vr�t� n�sleduj�c� prvek
		    hasNext() - vr�t� true, pokud existuje n�sleduj�c� prvek

		Pomoc� t�chto 2 metod je Java n�sledn� schopn� kolekci od za��tku do konce projet.

		Od Javy verze 8 jsou na rozhran� tak� metody:

		    remove() - odstran� prvek z kolekce, pokud tuto operaci kolekce podporuje, jinak se vyvol� v�jimka UnsupportedOperationException; toto je jedin� spr�vn� zp�sob, jak lze odstranit prvek z kolekce, kdy� j� proch�z�me
		    forEachRemaining() - projde ka�d� prvek kolekce a aplikuje na n�j p��slu�nou akci
	*/	

/************************Lekce 3 - Seznam (List) pomoc� pole v Jav�  ******************************/
//pole

		/*Ud�lejme si na za��tku malou odbo�ku zp�t k poli, kter� bylo
		 *  prvn� "kolekc�", kterou jsme v seri�lu poznali. Pole se 
		 *  vyzna�uje t�m, �e m� pevn� dan� po�et prvk�. Z tohoto d�vodu 
		 *  n�kdy ani neb�v� pova�ov�no za kolekci, proto�e nespl�uje ��st
		 *   jejich definice. Prvky v poli jsou ��seln� indexov�ny a to od
		 *    nuly.

Hlavn� nev�hodou pole tedy je, �e do n�j nem��eme za b�hu aplikace prvky 
p�id�vat nebo je mazat. To bohu�el �asto pot�ebujeme, i kdy� jsou situace,
 kdy je pole ide�ln� volba. Touto dan� je vyv�ena obrovsk� rychlost, 
 se kterou m��eme s prvky pole pracovat. Jeliko� data jsou stejn�ho typu 
 (a� ji� �pln� stejn�ho, nebo spole�n�ho p�edka), zab�raj� v pam�ti stejn� 
prvky pole jsou v pam�ti ulo�en� za sebou, jako v �ad�, kter� je 
nep�eru�en�. Pole cel�ch ��sel si m��eme p�edstavit nap�. takto:
Struktura pole v Jav�

Pokud tedy chceme nap�. p�istoupit na 5. prvek, jen vstoup�me tam, kde 
pole za��n�, a pot� odsko��me 4 n�sobky velikosti typu (zde intu) d�le.
 Jsme na 5. prvku. �ten� a z�pis na indexy v poli m� tedy konstantn� 
 �asovou slo�itost. Pokud v�s tento term�n zm�tl, m��ete to ch�pat tak, 
 �e do pole zapisujeme okam�it� a stejn� tak z n�j i �teme.*/
		
		
	
/**************************Lekce 4 - Spojov� seznam v Jav� ***************************************/

		//vyhledava a projizdi celim seznamem pomoci reference
		
/*          Uka�me si metody, kter� m� LinkedList oproti klasick�mu ArrayListu nav�c:

		    addFirst() - P�id� nov� prvek na za��tek seznamu.
		    addLast() - P�id� nov� prvek na konec seznamu.
		    getFirst() - Vr�t� prvn� prvek.
		    getLast() - Vr�t� posledn� prvek.
		    removeFirst() - Odstran� prvn� prvek.
		    removeLast() - Odstran� posledn� prvek.
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

		// p�id�v�n� a maz�n� v prost�edku seznamu
		//seznam.add(3, 32);
		//seznam.add(3, 31);
		//seznam.remove(2);

		// v�pis seznamu
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
