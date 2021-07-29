package it_kolekce;
import java.util.*; 		



public class Tre_map_II {

	public static void main(String[] args) {
		
/*********************Tre_map P�id�n� prvk�*************************************************/	
		
/* Aby bylo mo�n� p�idat prvek do TreeMap, m��eme pou��t put() metoda.
 *  Po�ad� vlo�en� v�ak nen� zachov�na v TreeMap. Intern� pro ka�d� prvek
 *   kl��e jsou porovn�ny a se�azeny ve vzestupn�m po�ad�.
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
		
/*********************Tre_map Zm�na prvk�:*************************************************/			

/*Zm�na prvk�: Po p�id�n� prvk�, pokud chceme zm�nit prvek, to m��e b�t 
 * provedeno op�t p�id�n�m prvku s put() metodou. Vzhledem k tomu, 
 * �e prvky v stromov� map� jsou indexov�ny pomoc� kl���, hodnotu kl��e 
 * lze zm�nit jednoduch�m vlo�en�m aktualizovan� hodnoty pro kl��, pro 
 * kter� chceme zm�nit.*/	

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
/*********************Tre_map Odstran�n� prvku*************************************************/	
		
	/* Odstran�n� Element: Chcete-li odstranit prvek z TreeMap, m��eme
	 *  pou��t remove() metoda. Tato metoda p�eb�r� hodnotu kl��e a
	 *   odebere mapov�n� kl��e z t�to stromov� mapy, pokud je k dispozici
	 *    v map�.*/	
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
/*********************Iterace prost�ednictv�m TreeMap*************************************************/	

/*Existuje n�kolik zp�sob�, jak iterovat p�es mapu. Nejzn�m�j�� zp�sob 
 * je pou��t pro ka�dou smy�ku a z�skat kl��e. Hodnota kl��e se nach�z� 
 * pomoc� metody getValue().*/	

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
