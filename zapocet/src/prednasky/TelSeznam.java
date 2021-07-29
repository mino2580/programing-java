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
	
/*Java.io.BufferedReader tøída v Javì
 * Ète text z datového proudu vstupu znakù, ukládání znakù do vyrovnávací
 *  pamìti tak, aby bylo zajištìno efektivní ètení znakù, polí a øádkù.

Mùže být zadána velikost vyrovnávací pamìti nebo mùže být použita výchozí
 velikost. Výchozí hodnota je dostateènì velká pro vìtšinu úèelù.
Obecnì platí, že každý požadavek na ètení ze èteèky zpùsobí, že
 odpovídající požadavek na ètení, které mají být provedeny základní 
 znak nebo bajt datového proudu.
Je proto vhodné zabalit BufferedReader kolem jakékoli Reader, jehož 
read() operace mohou být nákladné, jako je napøíklad FileReaders a
 InputStreamReaders.
Programy, které používají DataInputStreams pro textový vstup, mohou
 být lokalizovány nahrazením každého DataInputStream pøíslušným 
 bufferedreaderem.
 
 Metoda readLine() tøídy BufferedReader v jazyce Java se používá ke 
 ètení textu jednoho øádku najednou. Konec øádku je srozumitelný pro \n nebo \r nebo EOF.

Syntaxe:

public String readLine() 
          throws IOException
Parametry: Tato metoda nepøijímá žádný parametr.

Vrácená hodnota: Tato metoda vrátí String, který je pøeèten touto 
metodou a vyluèuje všechny koncové symboly k dispozici. Pokud byl ukonèen
 datový proud ve vyrovnávací pamìti a neexistuje žádný øádek ke ètení, 
 vrátí tato metoda hodnotu NULL.

Výjimky: Tato metoda vyvolá IOException, pokud dojde k chybì I/O
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
						                                   //doplòte váš kód!
						                                   //zde se program zepta nejdrive na jmeno, pak na telefonni cislo. Pokud jsou oba retezce OK,
						                                  //pak se vlozi novy zaznam do mapy telSeznam
					case '2':
						System.out.println("Vloz jmeno:");
						jmeno=reader.readLine();
						if(telSeznam.containsKey(jmeno)) {
						  System.out.println("\nzadane jmeno \""+ jmeno + "\" ma cislo "+ telSeznam .get(jmeno)); //doplòte váš kód! 
						} else System.out.println("\nzadane jmeno kolekce neobsahuje");
						break;
					
					case '3':
						for (Entry<String, String> s : telSeznam.entrySet()) {
							System.out.println(s.getKey() + ", " + s.getValue());
						}
						                                /*Metoda entrySet() tøídy Properties se používá k 
						                              * získání zobrazení Set tohoto mapování Vlastností.*/
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
