package it_kolekce;
//Java program to demonstrate the 
//working of Vector 

import java.io.*; 
import java.util.*; 



public class vektor {

	public static void main(String[] args) {
		
/***************************T��da vektoru v Jav�*******************************************/
/*T��da Vector implementuje roz�i�iteln� pole objekt�.
 *  Vektory v podstat� spadaj� do star��ch t��d, ale nyn� je pln� 
 *  kompatibiln� s kolekcemi. Nach�z� se v bal��ku java.util a 
 *  implementuje rozhran� List, tak�e m��eme pou��t v�echny metody 
 *  rozhran� List zde.

*/	
	/*Konstruktory:
1. Vektor(): Vytvo�� v�choz� vektor po��te�n� kapacity je 10.

Vector<E> v = nov� Vector<E>();

2. Vektor (velikost int): Vytvo�� vektor, jeho� po��te�n� kapacita je
 ur�ena velikost�.

Vector<E> v = nov� Vector<E>(int size);

3. Vektor (int velikost, int incr): Vytvo�� vektor, jeho� po��te�n� 
kapacita je ur�ena velikost� a p��r�stek je ur�en incr. Ur�uje po�et
 prvk�, kter� maj� b�t p�id�leny p�i ka�d�m p�em�scen� vektoru sm�rem
  nahoru.

Vector<E> v = nov� Vector<E>(int size, int incr);

4. Vektor(Collection c): Vytvo�� vektor, kter� obsahuje prvky kolekce c.

Vector<E> v = nov� Vector<E>(Kolekce c);


*/
		/*
		// Size of the 
        // Vector 
        int n = 5; 
  
        // Declaring the Vector with 
        // initial size n 
        Vector<Integer> v = new Vector<Integer>(n); 
  
        // Appending new elements at 
        // the end of the vector 
        for (int i = 1; i <= n; i++) 
            v.add(i); 
  
        // Printing elements 
        System.out.println(v); 
  
        // Remove element at index 3 
        v.remove(3); 
  
        // Displaying the vector 
        // after deletion 
        System.out.println(v); 
  
        // Printing elements one by one 
        for (int i = 0; i < v.size(); i++) 
            System.out.print(v.get(i) + " "); 
        */
		
        
/************************1. P�id�n� prvk�**********************************************/
	
	/*Abychom p�idali prvky do vektoru, pou��v�me metodu add(). 
	 * Tato metoda je p�et�ena k proveden� v�ce operac� na z�klad� 
	 * r�zn�ch parametr�. Jedn� se o:

p�idat(Objekt): Tato metoda se pou��v� k p�id�n� prvku na konci Vector.
add(int index, Objekt): Tato metoda se pou��v� k p�id�n� prvku na 
konkr�tn� index v Vector.*/	
		
		/*
		// create default vector 
        Vector v1 = new Vector(); 
  
          // Add elements using add() method 
        v1.add(1); 
        v1.add(2); 
        v1.add("geeks"); 
        v1.add("forGeeks"); 
        v1.add(3); 
          
          // print the vector to the console 
        System.out.println("Vector v1 is " + v1); 
  
        // create generic vector 
        Vector<Integer> v2 = new Vector<Integer>(); 
  
        v2.add(1); 
        v2.add(2); 
        v2.add(3); 
        System.out.println("Vector v2 is " + v2);
        */ 	
/**************************2. Zm�na prvk�: ********************************************/

/*Po p�id�n� prvk�, pokud chceme zm�nit prvek, to m��e b�t provedeno 
 * pomoc� set() metoda. Vzhledem k tomu, vector je indexov�n, prvek, 
 * kter� chceme zm�nit odkazuje index elementu. Proto tato metoda trv�
 *  index a aktualizovan� prvek, kter� je t�eba vlo�it do tohoto indexu.*/
		
		/*
		// Creating an empty Vector  
        Vector<Integer> vec_tor = new Vector<Integer>();  
  
        // Use add() method to add elements in the vector  
        vec_tor.add(12);  
        vec_tor.add(23);  
        vec_tor.add(22);  
        vec_tor.add(10);  
        vec_tor.add(20);  
  
        // Displaying the Vector  
        System.out.println("Vector: " + vec_tor);  
  
        // Using set() method to replace 12 with 21  
        System.out.println("The Object that is replaced is: "
                        + vec_tor.set(0, 21));  
  
        // Using set() method to replace 20 with 50  
        System.out.println("The Object that is replaced is: "
                        + vec_tor.set(4, 50));  
  
        // Displaying the modified vector  
        System.out.println("The new Vector is:" + vec_tor);  
    */
		
/**************************Odstran�n� prvk�********************************************/

/* Abychom odstranili prvek z vektoru, m��eme pou��t metodu remove(). 
 * Tato metoda je p�et�ena k proveden� v�ce operac� na z�klad� r�zn�ch 
 * parametr�. Jedn� se o:

remove(Objekt): Tato metoda se pou��v� k jednodu�e odebrat objekt z Vector. Pokud existuje v�ce takov�ch objekt�, pak prvn� v�skyt objektu je odebr�n.
remove(int index): Vzhledem k tomu, vector je indexov�n, tato metoda m� 
celo��slovou hodnotu, kter� jednodu�e odebere prvek p��tomn� v tomto 
konkr�tn�m indexu v Vector. Po odebr�n� prvku jsou v�echny prvky
 p�esunuty doleva, aby vyplnily prostor a indexy objekt� byly 
 aktualizov�ny.*/		
		
		/*
		  // create default vector of capacity 10 
        Vector v = new Vector(); 
  
          // Add elements using add() method 
        v.add(1); 
        v.add(2); 
        v.add("Geeks"); 
        v.add("forGeeks"); 
        v.add(4); 
  
        // removing first occurrence element at 1 
        v.remove(1); 
  
        // checking vector 
        System.out.println("after removal: " + v); 
        */
		
/*********************** Iterace Vektor***********************************************/

/* Existuje n�kolik zp�sob�, jak iterovat prost�ednictv�m vektoru.
 *  Nejzn�m�j�� zp�soby jsou pomoc� z�kladn� pro smy�ku v kombinaci s 
 *  get() metoda z�skat () z�skat prvek na konkr�tn� index a pokro�il� 
 *  pro smy�ku*/		
	
		/*
		 // create an instance of vector 
        Vector<String> v = new Vector<>(); 
  
          // Add elements using add() method 
        v.add("Geeks"); 
        v.add("Geeks"); 
        v.add(1, "For"); 
  
        // Using the Get method and the 
        // for loop 
        for (int i = 0; i < v.size(); i++) { 
  
            System.out.print(v.get(i) + " "); 
        } 
  
        System.out.println(); 
  
        // Using the for each loop 
        for (String str : v) 
            System.out.print(str + " "); 
		*/
/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		/**********************************************************************/
		
		// TODO Auto-generated method stub

	}

}
