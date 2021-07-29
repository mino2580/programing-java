package it_kolekce;
import java.util.*; 		



public class Tre_map_II {

	public static void main(String[] args) {
		
/*********************Tre_map Pøidání prvkù*************************************************/	
		
/* Aby bylo možné pøidat prvek do TreeMap, mùžeme použít put() metoda.
 *  Poøadí vložení však není zachována v TreeMap. Internì pro každý prvek
 *   klíèe jsou porovnány a seøazeny ve vzestupném poøadí.
filter_none*/		
		
		/*
		// Default Initialization of a 
        // TreeMap 
        TreeMap tm1 = new TreeMap(); 
  
        // Initialization of a TreeMap 
        // using Generics 
        TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>(); 
  
        // Inserting the Elements 
        tm1.put(3, "Geeks"); 
        tm1.put(2, "For"); 
        tm1.put(1, "Geeks"); 
  
        tm2.put(new Integer(3), "Geeks"); 
        tm2.put(new Integer(2), "For"); 
        tm2.put(new Integer(1), "Geeks"); 
  
        System.out.println(tm1); 
        System.out.println(tm2); 
		*/
		
/*********************Tre_map Zmìna prvkù:*************************************************/			

/*Zmìna prvkù: Po pøidání prvkù, pokud chceme zmìnit prvek, to mùže být 
 * provedeno opìt pøidáním prvku s put() metodou. Vzhledem k tomu, 
 * že prvky v stromové mapì jsou indexovány pomocí klíèù, hodnotu klíèe 
 * lze zmìnit jednoduchým vložením aktualizované hodnoty pro klíè, pro 
 * který chceme zmìnit.*/	

/*
		  // Initialization of a TreeMap 
        // using Generics 
        TreeMap<Integer, String> tm 
            = new TreeMap<Integer, String>(); 
  
        // Inserting the Elements 
        tm.put(3, "Geeks"); 
        tm.put(2, "Geeks"); 
        tm.put(1, "Geeks"); 
  
        System.out.println(tm); 
  
        tm.put(2, "For"); 
  
        System.out.println(tm);
*/
/*********************Tre_map Odstranìní prvku*************************************************/	
		
	/* Odstranìní Element: Chcete-li odstranit prvek z TreeMap, mùžeme
	 *  použít remove() metoda. Tato metoda pøebírá hodnotu klíèe a
	 *   odebere mapování klíèe z této stromové mapy, pokud je k dispozici
	 *    v mapì.*/	
		/*
		
		// Initialization of a TreeMap 
        // using Generics 
        TreeMap<Integer, String> tm 
            = new TreeMap<Integer, String>(); 
  
        // Inserting the Elements 
        tm.put(3, "Geeks"); 
        tm.put(2, "Geeks"); 
        tm.put(1, "Geeks"); 
        tm.put(4, "For"); 
  
        System.out.println(tm); 
  
        tm.remove(4); 
  
        System.out.println(tm); 	
		
		*/
/*********************Iterace prostøednictvím TreeMap*************************************************/	

/*Existuje nìkolik zpùsobù, jak iterovat pøes mapu. Nejznámìjší zpùsob 
 * je použít pro každou smyèku a získat klíèe. Hodnota klíèe se nachází 
 * pomocí metody getValue().*/	

/*
        // Initialization of a TreeMap 
        // using Generics 
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(); 
  
        // Inserting the Elements 
        tm.put(3, "Geeks"); 
        tm.put(2, "For"); 
        tm.put(1, "Geeks"); 
  
        for (Map.Entry mapElement : tm.entrySet()) { 
            int key = (int)mapElement.getKey(); 
  
            // Finding the value 
            String value = (String)mapElement.getValue(); 
  
            System.out.println(key + " : "+ value); 
        } 	
*/
/**********************************************************************/	
		

		
		
		
	
		// TODO Auto-generated method stub

	}

}
