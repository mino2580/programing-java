package it_kolekce;
//Java program to demonstrate the 
//working of Vector 

import java.io.*; 
import java.util.*; 



public class vektor {

	public static void main(String[] args) {
		
/***************************Tøída vektoru v Javì*******************************************/
/*Tøída Vector implementuje rozšiøitelné pole objektù.
 *  Vektory v podstatì spadají do starších tøíd, ale nyní je plnì 
 *  kompatibilní s kolekcemi. Nachází se v balíèku java.util a 
 *  implementuje rozhraní List, takže mùžeme použít všechny metody 
 *  rozhraní List zde.

*/	
	/*Konstruktory:
1. Vektor(): Vytvoøí výchozí vektor poèáteèní kapacity je 10.

Vector<E> v = nový Vector<E>();

2. Vektor (velikost int): Vytvoøí vektor, jehož poèáteèní kapacita je
 urèena velikostí.

Vector<E> v = nový Vector<E>(int size);

3. Vektor (int velikost, int incr): Vytvoøí vektor, jehož poèáteèní 
kapacita je urèena velikostí a pøírùstek je urèen incr. Urèuje poèet
 prvkù, které mají být pøidìleny pøi každém pøemíscení vektoru smìrem
  nahoru.

Vector<E> v = nový Vector<E>(int size, int incr);

4. Vektor(Collection c): Vytvoøí vektor, který obsahuje prvky kolekce c.

Vector<E> v = nový Vector<E>(Kolekce c);


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
		
        
/************************1. Pøidání prvkù**********************************************/
	
	/*Abychom pøidali prvky do vektoru, používáme metodu add(). 
	 * Tato metoda je pøetížena k provedení více operací na základì 
	 * rùzných parametrù. Jedná se o:

pøidat(Objekt): Tato metoda se používá k pøidání prvku na konci Vector.
add(int index, Objekt): Tato metoda se používá k pøidání prvku na 
konkrétní index v Vector.*/	
		
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
/**************************2. Zmìna prvkù: ********************************************/

/*Po pøidání prvkù, pokud chceme zmìnit prvek, to mùže být provedeno 
 * pomocí set() metoda. Vzhledem k tomu, vector je indexován, prvek, 
 * který chceme zmìnit odkazuje index elementu. Proto tato metoda trvá
 *  index a aktualizovaný prvek, který je tøeba vložit do tohoto indexu.*/
		
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
		
/**************************Odstranìní prvkù********************************************/

/* Abychom odstranili prvek z vektoru, mùžeme použít metodu remove(). 
 * Tato metoda je pøetížena k provedení více operací na základì rùzných 
 * parametrù. Jedná se o:

remove(Objekt): Tato metoda se používá k jednoduše odebrat objekt z Vector. Pokud existuje více takových objektù, pak první výskyt objektu je odebrán.
remove(int index): Vzhledem k tomu, vector je indexován, tato metoda má 
celoèíslovou hodnotu, která jednoduše odebere prvek pøítomný v tomto 
konkrétním indexu v Vector. Po odebrání prvku jsou všechny prvky
 pøesunuty doleva, aby vyplnily prostor a indexy objektù byly 
 aktualizovány.*/		
		
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

/* Existuje nìkolik zpùsobù, jak iterovat prostøednictvím vektoru.
 *  Nejznámìjší zpùsoby jsou pomocí základní pro smyèku v kombinaci s 
 *  get() metoda získat () získat prvek na konkrétní index a pokroèilé 
 *  pro smyèku*/		
	
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
