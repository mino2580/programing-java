package prednasky;

import java.io.*;
import java.util.*;

class csvRow implements Comparable<csvRow> {
	static int colNr = 0;// pozice slopcu ktere sestupne budou serazeny
	static boolean cmpAsString = true; // true-string,false-razeni podle integer
	String data[];

	public csvRow(String s) {
		data = s.split(";");

	}

	@Override // razeni
	public int compareTo(csvRow o) {
		if (cmpAsString)
			return data[colNr].compareTo(o.data[colNr]);
		else {
			int x = Integer.parseInt(data[colNr]);
			int y = Integer.parseInt(o.data[colNr]);
			return x - y;
		}
	}

	public String toString() {
		return Arrays.deepToString(data);
	}

}
/*
 * PrintStream(soubor): Vytvo�� nov� datov� proud tisku bez automatick�ho
 * vypr�zdn�n� ��dku se zadan�m souborem. PrintStream(Soubor, String csn) :
 * Vytvo�� nov� datov� proud tisku bez automatick�ho vypr�zdn�n� ��dk� se
 * zadan�m souborem a sadou znak�. PrintStream(V�stup v�stupu) : Vytvo�� nov�
 * tiskov� datov� proud.
 */

/*
 * import java.io.FileInputStream; import java.io.FileOutputStream; import
 * java.io.IOException;
 * 
 * [[public]] [[T��da (programov�n�)|class]] Zkop�rujBajty { public static
 * [[void]] main(String[] args) throws [[V�jimka (programov�n�)|IOException]] {
 * 
 * FileInputStream in = null; FileOutputStream out = null;
 * 
 * try { in = new FileInputStream("vstup.txt"); //otev�i vstupn� proud out = new
 * FileOutputStream("vystup.txt"); //otev�i v�stup.proud int c; //pr�v� �ten�
 * bajt; pokud je -1, je konec souboru
 * 
 * while ((c = in.read()) != -1) { //dokud jsou data na vstupu out.write(c);
 * //po�li je na v�stup } } finally { if (in != null) { //pokud je otev�en�
 * vstupn� proud in.close(); //uzav�i ho } if (out != null) { //pokud je
 * otev�en� v�stupn� proud out.close(); //uzav�i ho } } } }
 */

public class Cteni_csv {

	public static void main(String[] args) throws IOException {
		
		String vstup="vstup";
		String cs=".csv";
		String a[]= {"-","f"};
		String b="-o";
		String c="-c";
		String d="-t";
		String f=".csv";
		String c1="-f";
		String dir=".";      
		//aktualni adresar
		if(args.length>=1) {             //uzivatel nam na zacatek prikazu dal parameter,,1 je vzor
			c1=args[0];
			if(args.length>=2) {             //jestli uzivatel zadal druhy parameter prikazove radky
				dir=args[1]; 
			}
				
		}
	
	
	
	
	
		PrintStream out= System.out;    //1 //datovy tok je presmerovany na vystupni konzolu
		InputStream in=System.in;       //2 datovy tok nacita s vstupni konzoly
		
		try 
		{
		
			//Scanner s=new Scanner(in);    //3
			//out= new PrintStream("vystup.csv");
			//Scanner s=new Scanner(new File(vstup+cs)); 
			
			Scanner s=new Scanner(new File("vstup.csv")); //b
			// PrintStream out= new PrintStream("vystup.csv");  //a   //vypis soubor
			 ArrayList<csvRow> list=new ArrayList<>();
			//s.useDelimiter(";"); 
		
			 while(s.hasNext())
              {                               //cteni po radku 
				 String radek=s.nextLine();   //cteni retezce
				csvRow row=new csvRow(radek);
				 list.add(row);
			   }
			 
			Collections.sort(list);
			// System.out.println(list);  //vypis na konzolu   
			out.println(list);    //vypis do souboru
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
