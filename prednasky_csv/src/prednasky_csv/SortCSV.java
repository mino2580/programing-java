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
			 * TODO V t�to smy�ce proch�z�me seznam argument� p��kazov�ho ��dku
			 * 
			 * Dle p��kladu pro -f=jmenoVstupnihoSouboru zde dopl�t� sv�j k�d
			 * pro zpracov�n� argument� -o, -t, -c
			 */

			if (option.equals("-f")) { /* P��klad - zpracov�n� -f= */
				try {
					inp = new java.io.FileInputStream(value);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			} else if (option.equals("-o")) {
				/** TODO zde dopl�te sv�j k�d */
			} else if (option.equals("-c")) {
				/** TODO zde dopl�te sv�j k�d */
			} else if (option.equals("-t")) {
				/** TODO zde dopl�te sv�j k�d */
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
