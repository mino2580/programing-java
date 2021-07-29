package it_kolekce;

public class Araylist {

	public static void main(String[] args) {
		
	/*************************GeeksforGeeks************************/
		
		/*Metody na ArrayListu

		    size() - Funguje jako length na poli, vrac� po�et prvk� v kolekci.
		   
		    add(polo�ka) - Metodu add() jsme si ji� vyzkou�eli, jako parametr bere
		     polo�ku, kterou vlo�� do listu.
		    
		    addAll(kolekce) - P�id� do listu v�ce polo�ek, nap�. z pole.
		    
		    clear() - Vyma�e v�echny polo�ky v listu.
		    
		    contains(polo�ka) - Vrac� true/false podle toho, zda ArrayList
		     obsahuje p�edanou polo�ku.
		    
		    indexOf(polo�ka) - Vr�t� index prvn�ho v�skytu polo�ky (jako u pole).
		     Vrac� -1 p�i ne�sp�chu.
		    
		    lastIndexOf(po�lo�ka) - Vrac� index posledn�ho v�skytu polo�ky v Listu.
		     Vrac� -1 p�i ne�sp�chu.
		   
		    remove(polo�ka) - Vyma�e prvn� nalezenou polo�ku.
		   
		    removeAll(index, po�et) - Vyma�e dan� po�et prvk� od zadan�ho indexu.
		    
		    toArray() - Zkop�ruje polo�ky z ArrayListu do pole a to vr�t�.

		Dal�� metody

		Dal�� metody a pro pr�ci s listem najdeme ve t��d� Collections. Jako parametr berou danou kolekci.

		    min() - Vr�t� nejmen�� prvek z kolekce.
		    max() - Vr�t� nejv�t�� prvek z kolekce.
		    reverse() - Obr�t� list tak, �e je prvn� polo�ka posledn� a naopak.
		     Metoda nic nevrac�, zm�ny se provedou v zadan�m listu.
		    sort() - Sort ji� tak� zn�me, set��d� polo�ky v listu. Metoda op�t 
		    nic nevrac�.

		Vid�me, �e kolekce ArrayList toho um� mnohem v�ce, ne� pole. Nejv�t�� 
		v�hodou je p�id�v�n� a maz�n� prvk�. Da� ve v�konu je zanedbateln�
		*/
				
	/************************ Arraylist ***********************************************/
				
				    //ArrayList v Jav�  GeeksforGeeks
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

		/* P�id�n� prvk�: Chcete-li p�idat prvek do ArrayList, m��eme pou��t add()
		 *  metoda. Tato metoda je p�et�ena k proveden� v�ce operac� na z�klad�
		 *   r�zn�ch parametr�. Jedn� se o:

		add(Objekt): Tato metoda se pou��v� k p�id�n� prvku na konci ArrayList.
		add(int index, Objekt): Tato metoda se pou��v� k p�id�n� prvku v ur�it�m 
		indexu v ArrayList.*/

		/*
		ArrayList<String> al = new ArrayList<String>(); 

		al.add("Geeks"); 
		al.add("Geeks"); 
		al.add(1, "For"); 

		System.out.println(al); 
		*/

	/**************************set-zmena prvku********************************************/

		/*2. Zm�na prvk�: Po p�id�n� prvk�, pokud chceme zm�nit prvek,
		 *  to m��e b�t provedeno pomoc� set() metoda. Vzhledem k tomu,
		 *   ArrayList je indexov�n, prvek, kter� chceme zm�nit odkazuje
		 *    index elementu. Proto tato metoda trv� index a aktualizovan� prvek,
		 *     kter� je t�eba vlo�it do tohoto indexu.*/
				
				/*
		        ArrayList<String> al = new ArrayList<String>(); 
		  
		        al.add("Geeks"); 
		        al.add("Geeks"); 
		        al.add(1, "Geeks"); 
		  
		        System.out.println("Initial ArrayList " + al); 
		  
		        al.set(1, "For"); 
		  
		        System.out.println("Updated ArrayList " + al);
		        */
	/************************* Odstran�n� prvk� *********************************************/

		/*3. Odstran�n� prvk�: Chcete-li odstranit prvek z ArrayList, m��eme 
		 * pou��t remove() metoda. Tato metoda je p�et�ena k proveden� v�ce 
		 * operac� na z�klad� r�zn�ch parametr�. Jedn� se o:

		remove(Objekt): Tato metoda se pou��v� k jednodu�e odebrat objekt z 
		ArrayList. Pokud existuje v�ce takov�ch objekt�, pak prvn� v�skyt objektu je odebr�n.
		remove(int index): Vzhledem k tomu, �e ArrayList je indexov�n, tato 
		metoda m� celo��slovou hodnotu, kter� jednodu�e odebere prvek p��tomn� 
		v tomto konkr�tn�m indexu v ArrayList. Po odebr�n� prvku jsou v�echny 
		prvky p�esunuty doleva, aby vyplnily prostor a indexy objekt� byly 
		aktualizov�ny.*/
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

		/* Iterace ArrayList: Existuje n�kolik zp�sob�, jak iterovat 
		 * prost�ednictv�m ArrayList. Nejzn�m�j�� zp�soby jsou pomoc� 
		 * z�kladn� pro smy�ku v kombinaci s get() metoda z�skat () 
		 * z�skat prvek na konkr�tn� index a pokro�il� pro smy�ku.*/
				 
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
		
		/*Metody a dal�� prvky na t��d� List

//Arraylist je lepsi pole,kde se muze menit pocet prvku za behu programu
 * prvky su usporadane podle indexu
 * 
Popi�me si d�le�it� metody na tomto rozhran�. List tvo�� z�klad pro 
v�echny seznamy v Jav� a obsahuje zejm�na n�sleduj�c� metody:

    add() - P�id� nov� prvek do listu.
    addAll() - P�id� v�ce nov�ch prvk� do listu
    clear() - Vyma�e v�echny prvky.
    contains() - Vr�t� true, pokud list obsahuje dan� prvek.
    toArray() - Metoda zkop�ruje prvky z listu do pole.
    remove() - Vyma�e dan� prvek. Tato funkce je velmi u�ite�n� v p��pad�,
     �e m�me v listu instance n�jak� t��dy (nap�. u�ivatele), nemus�me si
      dr�et jejich ��seln� indexy, jen zavol�me nap�. list.remove(karel),
       kdy p�ed�me konkr�tn� instanci, kter� se m� ze seznamu odebrat.
    removeAll()- Vyma�e v�ce dan�ch prvk�.
    count() - Vr�t� po�et prvk� v poli.

Metoda add() m� dv� p�et�en�. V jednom p��pad� p�ij�m� pouze p�id�van�
 objekt, ve druh�m p��pad� p�ij�m� je�t� index, na kter� se m� prvek 
 vlo�it. Metoda remove() m� tak� dv� p�et�en�. Jednou p�ij�m� objekt,
  kter� se m� odstranit, v p��pad� druh�m p�ij�m� index, na kter�m m�
   prvek odstranit.

A�koli jsme si ArrayList vyzkou�eli ji� 1000kr�t, pro �plnost si p�eci
 jen uka�me n�kolik ��dk� k�du:*/
	
		
		/*
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		System.out.println(list.get(0));
		*/
		
		
/*D�le List nab�z� metody:

    indexOf() - Vr�t� index prvn�ho v�skytu dan�ho prvku v listu.
    lastIndexOf() - Obdoba metody indexOf(), vrac� index posledn�ho
     v�skytu dan�ho prvku v listu.
    removeIf() - Odstran� v�echny prvky, kter� odpov�daj� dan� podm�nce 
    (predik�tu, viz d�le v kurzu).
    sort() - Set��d� list. Je d�le�it�, aby jeho prvky implementovaly 
    rozhran� Comparable, jinak metoda vyvol� v�jimku. Z�kladn� t��dy a
     struktury z Javy rozhran� Comparable implementuj�, u sv�ch t��d ho
      um�me dodat.
*/
/**********************************end************************************/
		
		
	}

}
