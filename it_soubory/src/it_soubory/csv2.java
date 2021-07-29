package it_soubory;

import java.io.*;
import java.util.*;

enum TypRazeni {CISLA, RETEZCE};

class RadekCSV implements Comparable<RadekCSV> {
	String policka[];
	static int cisloSloupce;
	static TypRazeni typRazeni = TypRazeni.CISLA;
	public RadekCSV(String[] policka) {
		this.policka = policka;
	}	
	@Override
	public String toString() {
		if (policka!=null) return Arrays.toString(policka);
		else return "NULL!!!";
	}
	@Override
	public int compareTo(RadekCSV o) {
		if (cisloSloupce >= policka.length || cisloSloupce >= o.policka.length ) return -1;		
		if (typRazeni==TypRazeni.RETEZCE)
			return policka[cisloSloupce].compareTo(o.policka[cisloSloupce]);
		else {
			return Integer.parseInt(policka[cisloSloupce]) - 
					Integer.parseInt(o.policka[cisloSloupce]);
			// return Double.compare(Double.parseDouble(..), Double.parseDouble(..));
		}
	}
}
public class csv2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadekCSV.cisloSloupce = 1;
		try {
			LinkedList<RadekCSV> radky = new LinkedList<>();
			PrintStream output = System.out;
			//output = new PrintStream(new File("vystup.txt"));
			Scanner s = new Scanner(new File("data.csv"));
			while (s.hasNext()) {
				String radek = s.nextLine();
				String policka[] = radek.split(";");
				RadekCSV radekCSV= new RadekCSV(policka);
				radky.add(radekCSV);
			}
			Collections.sort(radky);
			output.println(radky);
			output.close();
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}