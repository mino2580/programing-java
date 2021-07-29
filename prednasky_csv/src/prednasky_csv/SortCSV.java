package prednasky_csv;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class SortCSV {

	public static void main(String[] args) {
		InputStream inp = System.in;
		PrintStream outp = System.out;
		CSV csv = new CSV();
		for (String s : args) {
			String option = s.substring(0, 2);
			String value = s.substring(3);
			/**
			 * TODO V této smyèce procházíme seznam argumentù pøíkazového øádku
			 * 
			 * Dle pøíkladu pro -f=jmenoVstupnihoSouboru zde doplòtì svùj kód
			 * pro zpracování argumentù -o, -t, -c
			 */

			if (option.equals("-f")) { /* Pøíklad - zpracování -f= */
				try {
					inp = new java.io.FileInputStream(value);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			} else if (option.equals("-o")) {
				/** TODO zde doplòte svùj kód */
			} else if (option.equals("-c")) {
				/** TODO zde doplòte svùj kód */
			} else if (option.equals("-t")) {
				/** TODO zde doplòte svùj kód */
			}
		}
		BufferedReader inb = new BufferedReader(new InputStreamReader(inp));
		String str;
		try {
			while ((str = inb.readLine()) != null) {
				csv.pridejRadek(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		csv.sort();
		csv.print(outp);
	}
}
