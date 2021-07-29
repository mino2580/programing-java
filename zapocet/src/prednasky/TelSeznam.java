package prednasky;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TelSeznam {

	/**
	 * @param args
	 */
	
/*Java.io.BufferedReader t��da v Jav�
 * �te text z datov�ho proudu vstupu znak�, ukl�d�n� znak� do vyrovn�vac�
 *  pam�ti tak, aby bylo zaji�t�no efektivn� �ten� znak�, pol� a ��dk�.

M��e b�t zad�na velikost vyrovn�vac� pam�ti nebo m��e b�t pou�ita v�choz�
 velikost. V�choz� hodnota je dostate�n� velk� pro v�t�inu ��el�.
Obecn� plat�, �e ka�d� po�adavek na �ten� ze �te�ky zp�sob�, �e
 odpov�daj�c� po�adavek na �ten�, kter� maj� b�t provedeny z�kladn� 
 znak nebo bajt datov�ho proudu.
Je proto vhodn� zabalit BufferedReader kolem jak�koli Reader, jeho� 
read() operace mohou b�t n�kladn�, jako je nap��klad FileReaders a
 InputStreamReaders.
Programy, kter� pou��vaj� DataInputStreams pro textov� vstup, mohou
 b�t lokalizov�ny nahrazen�m ka�d�ho DataInputStream p��slu�n�m 
 bufferedreaderem.
 
 Metoda readLine() t��dy BufferedReader v jazyce Java se pou��v� ke 
 �ten� textu jednoho ��dku najednou. Konec ��dku je srozumiteln� pro \n nebo \r nebo EOF.

Syntaxe:

public String readLine() 
          throws IOException
Parametry: Tato metoda nep�ij�m� ��dn� parametr.

Vr�cen� hodnota: Tato metoda vr�t� String, kter� je p�e�ten touto 
metodou a vylu�uje v�echny koncov� symboly k dispozici. Pokud byl ukon�en
 datov� proud ve vyrovn�vac� pam�ti a neexistuje ��dn� ��dek ke �ten�, 
 vr�t� tato metoda hodnotu NULL.

V�jimky: Tato metoda vyvol� IOException, pokud dojde k chyb� I/O
*/	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inp = System.in;
		BufferedReader reader = new BufferedReader(new InputStreamReader(inp));
		TreeMap<String, String> telSeznam = new TreeMap<String, String>();
		String jmeno ="", cislo;
		int key =0;
		do {
			try {
				System.out.println("Vyberte z menu:\n"
						+ "1. Vlozeni noveho kontaktu\n"
						+ "2. Hledani kontaktu\n" 
						+ "3. Vypis kontaktu\n" 
				        + "4. Vymaz kontakt\n");
				
				jmeno = reader.readLine();
				if (jmeno != null)
					switch (jmeno.charAt(0)) {
					
					case '1':
						System.out.println("Vloz jmeno:");
						jmeno=reader.readLine();
						System.out.println("Vloz cislo:");
						cislo=reader.readLine();
						telSeznam.put(jmeno,cislo);
						break;
						                                   //dopl�te v� k�d!
						                                   //zde se program zepta nejdrive na jmeno, pak na telefonni cislo. Pokud jsou oba retezce OK,
						                                  //pak se vlozi novy zaznam do mapy telSeznam
					case '2':
						System.out.println("Vloz jmeno:");
						jmeno=reader.readLine();
						if(telSeznam.containsKey(jmeno)) {
						  System.out.println("\nzadane jmeno \""+ jmeno + "\" ma cislo "+ telSeznam .get(jmeno)); //dopl�te v� k�d! 
						} else System.out.println("\nzadane jmeno kolekce neobsahuje");
						break;
					
					case '3':
						for (Entry<String, String> s : telSeznam.entrySet()) {
							System.out.println(s.getKey() + ", " + s.getValue());
						}
						                                /*Metoda entrySet() t��dy Properties se pou��v� k 
						                              * z�sk�n� zobrazen� Set tohoto mapov�n� Vlastnost�.*/
						break;
						
					case '4':
						System.out.println("Vloz jmeno:");
						jmeno=reader.readLine();
						if(telSeznam.containsKey(jmeno)) {
							telSeznam.remove(jmeno);
						  System.out.println("\nzadane jmeno je zmazane");
						  
						} else System.out.println("\nzadane jmeno kolekce neobsahuje");
						break;
						
					default:
						System.out.println("Nespravna volba\n");
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (jmeno != null);
	}

}
