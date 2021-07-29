package it_kolekce;

public class Araylist {

	public static void main(String[] args) {
		
	/*************************GeeksforGeeks************************/
		
		/*Metody na ArrayListu

		    size() - Funguje jako length na poli, vrací poèet prvkù v kolekci.
		   
		    add(položka) - Metodu add() jsme si již vyzkoušeli, jako parametr bere
		     položku, kterou vloží do listu.
		    
		    addAll(kolekce) - Pøidá do listu více položek, napø. z pole.
		    
		    clear() - Vymaže všechny položky v listu.
		    
		    contains(položka) - Vrací true/false podle toho, zda ArrayList
		     obsahuje pøedanou položku.
		    
		    indexOf(položka) - Vrátí index prvního výskytu položky (jako u pole).
		     Vrací -1 pøi neúspìchu.
		    
		    lastIndexOf(po­ložka) - Vrací index posledního výskytu položky v Listu.
		     Vrací -1 pøi neúspìchu.
		   
		    remove(položka) - Vymaže první nalezenou položku.
		   
		    removeAll(index, poèet) - Vymaže daný poèet prvkù od zadaného indexu.
		    
		    toArray() - Zkopíruje položky z ArrayListu do pole a to vrátí.

		Další metody

		Další metody a pro práci s listem najdeme ve tøídì Collections. Jako parametr berou danou kolekci.

		    min() - Vrátí nejmenší prvek z kolekce.
		    max() - Vrátí nejvìtší prvek z kolekce.
		    reverse() - Obrátí list tak, že je první položka poslední a naopak.
		     Metoda nic nevrací, zmìny se provedou v zadaném listu.
		    sort() - Sort již také známe, setøídí položky v listu. Metoda opìt 
		    nic nevrací.

		Vidíme, že kolekce ArrayList toho umí mnohem více, než pole. Nejvìtší 
		výhodou je pøidávání a mazání prvkù. Daò ve výkonu je zanedbatelná
		*/
				
	/************************ Arraylist ***********************************************/
				
				    //ArrayList v Javì  GeeksforGeeks
		/*		
		                                      // Size of the 
		                                      // ArrayList 
		int n = 5; 
		                                     // Declaring the ArrayList with 
		                                     // initial size n 
		ArrayList<Integer> arrli = new ArrayList<Integer>(n); 

		                                   // Appending new elements at 
		                                   // the end of the list 
		for (int i = 1; i <= n; i++) {
		arrli.add(i); }
		                                    // Printing elements 
		System.out.println(arrli); 
		                                   // Remove element at index 3 
		arrli.remove(3); 

		                                   // Displaying the ArrayList 
		                                   // after deletion 
		System.out.println(arrli); 
		                                   // Printing elements one by one 
		for (int i = 0; i < arrli.size(); i++) 
		System.out.print(arrli.get(i) + " ");
		*/
	/************************ add-pridavani prvku *****************************************/

		/* Pøidání prvkù: Chcete-li pøidat prvek do ArrayList, mùžeme použít add()
		 *  metoda. Tato metoda je pøetížena k provedení více operací na základì
		 *   rùzných parametrù. Jedná se o:

		add(Objekt): Tato metoda se používá k pøidání prvku na konci ArrayList.
		add(int index, Objekt): Tato metoda se používá k pøidání prvku v urèitém 
		indexu v ArrayList.*/

		/*
		ArrayList<String> al = new ArrayList<String>(); 

		al.add("Geeks"); 
		al.add("Geeks"); 
		al.add(1, "For"); 

		System.out.println(al); 
		*/

	/**************************set-zmena prvku********************************************/

		/*2. Zmìna prvkù: Po pøidání prvkù, pokud chceme zmìnit prvek,
		 *  to mùže být provedeno pomocí set() metoda. Vzhledem k tomu,
		 *   ArrayList je indexován, prvek, který chceme zmìnit odkazuje
		 *    index elementu. Proto tato metoda trvá index a aktualizovaný prvek,
		 *     který je tøeba vložit do tohoto indexu.*/
				
				/*
		        ArrayList<String> al = new ArrayList<String>(); 
		  
		        al.add("Geeks"); 
		        al.add("Geeks"); 
		        al.add(1, "Geeks"); 
		  
		        System.out.println("Initial ArrayList " + al); 
		  
		        al.set(1, "For"); 
		  
		        System.out.println("Updated ArrayList " + al);
		        */
	/************************* Odstranìní prvkù *********************************************/

		/*3. Odstranìní prvkù: Chcete-li odstranit prvek z ArrayList, mùžeme 
		 * použít remove() metoda. Tato metoda je pøetížena k provedení více 
		 * operací na základì rùzných parametrù. Jedná se o:

		remove(Objekt): Tato metoda se používá k jednoduše odebrat objekt z 
		ArrayList. Pokud existuje více takových objektù, pak první výskyt objektu je odebrán.
		remove(int index): Vzhledem k tomu, že ArrayList je indexován, tato 
		metoda má celoèíslovou hodnotu, která jednoduše odebere prvek pøítomný 
		v tomto konkrétním indexu v ArrayList. Po odebrání prvku jsou všechny 
		prvky pøesunuty doleva, aby vyplnily prostor a indexy objektù byly 
		aktualizovány.*/
				 /*
				ArrayList<String> al = new ArrayList<String>(); 
				  
			        al.add("Geeks"); 
			        al.add("Geeks"); 
			        al.add(1, "For"); 
			  
			        System.out.println( 
			            "Initial ArrayList " + al); 
			  
			        al.remove(1); 
			  
			        System.out.println( 
			            "After the Index Removal " + al); 
			  
			        al.remove("Geeks"); 
			  
			        System.out.println( 
			            "After the Object Removal " + al); 
		*/
	/************************* iterace *********************************************/

		/* Iterace ArrayList: Existuje nìkolik zpùsobù, jak iterovat 
		 * prostøednictvím ArrayList. Nejznámìjší zpùsoby jsou pomocí 
		 * základní pro smyèku v kombinaci s get() metoda získat () 
		 * získat prvek na konkrétní index a pokroèilé pro smyèku.*/
				 
			/*	
				ArrayList<String> al  = new ArrayList<String>(); 

		     al.add("Geeks"); 
		     al.add("Geeks"); 
		     al.add(1, "For"); 

		     // Using the Get method and the 
		     // for loop 
		     for (int i = 0; i < al.size(); i++) { 

		         System.out.print(al.get(i) + " "); 
		     } 

		     System.out.println(); 

		     // Using the for each loop 
		     for (String str : al) 
		         System.out.print(str + " "); 	
		         */
/**********************it network**************************************/
		
/**************************** Seznamy Array(Listy) ********************************************/
		
		/*Metody a další prvky na tøídì List

//Arraylist je lepsi pole,kde se muze menit pocet prvku za behu programu
 * prvky su usporadane podle indexu
 * 
Popišme si dùležité metody na tomto rozhraní. List tvoøí základ pro 
všechny seznamy v Javì a obsahuje zejména následující metody:

    add() - Pøidá nový prvek do listu.
    addAll() - Pøidá více nových prvkù do listu
    clear() - Vymaže všechny prvky.
    contains() - Vrátí true, pokud list obsahuje daný prvek.
    toArray() - Metoda zkopíruje prvky z listu do pole.
    remove() - Vymaže daný prvek. Tato funkce je velmi užiteèná v pøípadì,
     že máme v listu instance nìjaké tøídy (napø. uživatele), nemusíme si
      držet jejich èíselné indexy, jen zavoláme napø. list.remove(karel),
       kdy pøedáme konkrétní instanci, která se má ze seznamu odebrat.
    removeAll()- Vymaže více daných prvkù.
    count() - Vrátí poèet prvkù v poli.

Metoda add() má dvì pøetížení. V jednom pøípadì pøijímá pouze pøidávaný
 objekt, ve druhém pøípadì pøijímá ještì index, na který se má prvek 
 vložit. Metoda remove() má také dvì pøetížení. Jednou pøijímá objekt,
  který se má odstranit, v pøípadì druhém pøijímá index, na kterém má
   prvek odstranit.

Aèkoli jsme si ArrayList vyzkoušeli již 1000krát, pro úplnost si pøeci
 jen ukažme nìkolik øádkù kódu:*/
	
		
		/*
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		System.out.println(list.get(0));
		*/
		
		
/*Dále List nabízí metody:

    indexOf() - Vrátí index prvního výskytu daného prvku v listu.
    lastIndexOf() - Obdoba metody indexOf(), vrací index posledního
     výskytu daného prvku v listu.
    removeIf() - Odstraní všechny prvky, které odpovídají dané podmínce 
    (predikátu, viz dále v kurzu).
    sort() - Setøídí list. Je dùležité, aby jeho prvky implementovaly 
    rozhraní Comparable, jinak metoda vyvolá výjimku. Základní tøídy a
     struktury z Javy rozhraní Comparable implementují, u svých tøíd ho
      umíme dodat.
*/
/**********************************end************************************/
		
		
	}

}
