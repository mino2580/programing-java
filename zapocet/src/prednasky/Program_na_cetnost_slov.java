package prednasky;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Program_na_cetnost_slov{
    
    public static void main(String[] args) {
    	
    	Scanner soubor;
		try {
			soubor = new Scanner(new File("vstup.txt"));
			Map<String, Integer> cetnost = new TreeMap<String, Integer>();
			while (soubor.hasNext())//bere retezec,slovo po slovevraci true pokud je k nacteni dalsi slovo
			{
				                                       //   System.out.println("soubor.hasNext() "+soubor.hasNext() );
						
			    String s = soubor.next();
			    //System.out.println("soubor.next() "+s );
			    Integer i = cetnost.get(s);                 /*Metoda java.util.HashMap.get() t��dy HashMap se pou��v� k na�ten� nebo na�ten� hodnoty mapovan� konkr�tn�m kl��em uveden�m v parametru. Vr�t� hodnotu NULL, pokud mapa neobsahuje ��dn� takov� mapov�n� pro kl��.*/
			  //  System.out.println("cetnost.get(s) "+i );
			    int c;
			    if (i == null) {
				c = 1;
			    } else {
				c = i.intValue() + 1;
			    }
			    cetnost.put(s, Integer.valueOf(c));
			    
			    for (Map.Entry<String,Integer> e: cetnost.entrySet()) {
				    System.out.printf("%s: %d%n", e.getKey(),e.getValue());
				}
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	
	
    }
    
}
