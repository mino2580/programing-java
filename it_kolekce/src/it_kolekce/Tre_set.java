package it_kolekce;

import java.util.Comparator;
import java.util.TreeSet;

public class Tre_set {

	public static void main(String[] args) {
		
		/*TreeSet v Javì
Naposledy aktualizováno: 26-06-2020
TreeSet je jednou z nejdùležitìjších implementací rozhraní SortedSet v 
jazyce Java, která používá strom pro ukládání. Øazení prvkù je udržována 
sadu pomocí jejich pøirozené øazení, zda je k dispozici explicitní
 komparátor. To musí být konzistentní s rovná se, pokud je správnì 
 implementovat Set rozhraní. Lze také objednat komparátoru k dispozici 
 v dobì vytvoøení sady, v závislosti na tom, který konstruktor se používá. 
 TreeSet implementuje rozhraní NavigableSet dìdìním tøídy AbstractSet.*/
		
/*********************1. Pøidání prvkù**************************************************/		

/*Aby bylo možné pøidat prvek do TreeMap, mùžeme použít add() metoda.
 *  Poøadí vložení však není zachována v TreeSet. Internì pro každý 
 *  prvek jsou hodnoty porovnány a seøazeny ve vzestupném poøadí. 
 *  Musíme si uvìdomit, že duplicitní prvky nejsou povoleny a všechny
 *   duplicitní prvky jsou ignorovány. A také Null hodnoty nejsou pøijaty
 *    TreeSet.*/	
		
		/*
		TreeSet<String> ts = new TreeSet<String>(); 

    // Elements are added using add() method 
    ts.add("Geek"); 
    ts.add("For"); 
    ts.add("Geeks"); 

    System.out.println(ts); 
    */
/**********************2. Pøístup k prvkùm:*************************************************/		

/*Po pøidání prvkù, pokud chceme získat pøístup k prvkùm, mùžeme
 *  použít vestavìné metody, jako je contains(), first(), last()atd.*/		
	
		/*
		 TreeSet<String> ts  = new TreeSet<String>(); 

     // Elements are added using add() method 
     ts.add("Geek"); 
     ts.add("For"); 
     ts.add("Geeks"); 

     System.out.println("Tree Set is " + ts); 

     String check = "Geeks"; 

     // Check if the above string exists in 
     // the treeset or not 
     System.out.println("Contains " + check 
                        + " " + ts.contains(check)); 

     // Print the first element in 
     // the TreeSet 
     System.out.println("First Value " + ts.first()); 

     // Print the last element in 
     // the TreeSet 
     System.out.println("Last Value " + ts.last()); 

     String val = "Geek"; 

     // Find the values just greater 
     // and smaller than the above string 
     System.out.println("Higher " + ts.higher(val)); 
     System.out.println("Lower " + ts.lower(val)); 
     */
/*********************3. Odebrání hodnoty**************************************************/		
		/*
		 TreeSet<String> ts 
         = new TreeSet<String>(); 

     // Elements are added using add() method 
     ts.add("Geek"); 
     ts.add("For"); 
     ts.add("Geeks"); 
     ts.add("A"); 
     ts.add("B"); 
     ts.add("Z"); 

     System.out.println("Initial TreeSet " + ts); 

     // Removing the element b 
     ts.remove("B"); 

     System.out.println("After removing element " + ts); 

     // Removing the first element 
     ts.pollFirst(); 

     System.out.println("After removing first " + ts); 

     // Removing the last element 
     ts.pollLast(); 

     System.out.println("After removing last " + ts); 
 		*/
/***********************4. Iterace prostøednictvím TreeSet:************************************************/		
	/*	
		 TreeSet<String> ts 
         = new TreeSet<String>(); 

     // Elements are added using add() method 
     ts.add("Geek"); 
     ts.add("For"); 
     ts.add("Geeks"); 
     ts.add("A"); 
     ts.add("B"); 
     ts.add("Z"); 

     // Iterating though the TreeSet 
     for (String value : ts) 
         System.out.print(value 
                          + ", "); 
     System.out.println(); 	
     */	
/***********************************************************************/		
/*
METHOD	DESCRIPTION

add(Object o)	This method will add the specified element according to the same sorting order mentioned during the creation of the TreeSet. Duplicate entires will not get added.
addAll(Collection c)	This method will add all elements of specified Collection to the set. Elements in the Collection should be homogeneous otherwise ClassCastException will be thrown. Duplicate Entries of Collection will not be added to TreeSet.
ceiling?(E e)	This method returns the least element in this set greater than or equal to the given element, or null if there is no such element.
clear()	This method will remove all the elements.
clone()	The method is used to return a shallow copy of the set, which is just a simple copied set.
Comparator comparator()	This method will return Comparator used to sort elements in TreeSet or it will return null if default natural sorting order is used.
contains(Object o)	This method will return true if given element is present in TreeSet else it will return false.
descendingIterator?()	This method returns an iterator over the elements in this set in the descending order.
descendingSet?()	This method returns a reverse order view of the elements contained in this set.
first()	This method will return first element in TreeSet if TreeSet is not null else it will throw NoSuchElementException.
floor?(E e)	This method returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
headSet(Object toElement)	This method will return elements of TreeSet which are less than the specified element.
higher?(E e)	This method returns the least element in this set strictly greater than the given element, or null if there is no such element.
isEmpty()	This method is used to return true if this set contains no elements or is empty and false for the opposite case.
Iterator iterator()	Returns an iterator for iterating over the elements of the set.
last()	This method will return last element in TreeSet if TreeSet is not null else it will throw NoSuchElementException.
lower?(E e)	This method returns the greatest element in this set strictly less than the given element, or null if there is no such element.
pollFirst?()	This method retrieves and removes the first (lowest) element, or returns null if this set is empty.
pollLast?()	This method retrieves and removes the last (highest) element, or returns null if this set is empty.
remove(Object o)	This method is used to return a specific element from the set.
size()	This method is used to return the size of the set or the number of elements present in the set.
spliterator?()	This method creates a late-binding and fail-fast Spliterator over the elements in this set.
subSet(Object fromElement, Object toElement)	This method will return elements ranging from fromElement to toElement. fromElement is inclusive and toElement is exclusive.
tailSet(Object fromElement)	This method will return elements of TreeSet which are greater than or equal to the specified element.*/		

/**************************TreeSet comparator()*********************************************/		

/*Metoda java.util.TreeSet.comparator() sdílí dùležitou funkci nastavení 
 * a vrácení komparátoru, který lze použít k øazení prvkù v TreeSet. 
 * Metoda vrátí hodnotu Null, pokud sada následuje pøirozený vzorek
 *  øazení prvkù.

Syntaxe:

comp_set = (TreeSet)tree_set.comparator()*/		
	/*
		 // Creating an empty TreeSet 
        TreeSet<Integer> tree_set = new TreeSet<Integer>(); 
  
        // Adding elemetns to the set 
        tree_set.add(20); 
        tree_set.add(24); 
        tree_set.add(30); 
        tree_set.add(35); 
        tree_set.add(45); 
        tree_set.add(50); 
  
      System.out.println("Tree Set values are: "+ tree_set); 
  
      // Creating a comparator 
      Comparator comp = tree_set.comparator(); 
        
      // Displaying the comparator values 
      System.out.println("Since the Comparator value is: "+ comp); 
      System.out.println("it follows natural ordering"); 
 	*/
/***************Program 2: Pøi použití konkrétního komparátoru.***********************************************/		
		
/***********************************************************************/		
		/***********************************************************************/		
		/***********************************************************************/		
		/***********************************************************************/		
		/***********************************************************************/		

		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
