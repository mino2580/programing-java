package prednasky_csv;
import java.io.*;

class CSV {
	/**
	 * 
	 * 
	 * 
	 * @author Tomáš Dulík
	 * 
	 * @version 0.9, 10/2007
	 */

	enum TypRazeni {
		TEXTOVE, CISELNE
	};

	int cisloSloupce = 0;
	TypRazeni typRazeni = TypRazeni.TEXTOVE;

	class RadekCSV implements Comparable<RadekCSV> {
		String policka[];
		public int compareTo(RadekCSV arg0) {
			if (typRazeni == TypRazeni.TEXTOVE) {
				return policka[cisloSloupce]
						.compareTo(arg0.policka[cisloSloupce]);
			} else if (typRazeni == TypRazeni.CISELNE) {
				return Integer.decode(policka[cisloSloupce])
						- Integer.decode(arg0.policka[cisloSloupce]);
			}
			return 0;
		}

		public void print(PrintStream ps) {
			for (String s : policka)
				ps.print(s + " ");
		}
	}

	static final int VELIKOST = 1024;
	RadekCSV radky[] = new RadekCSV[VELIKOST];
	int indexRadku = 0;

	public void pridejRadek(String radek) {
		radky[indexRadku] = new RadekCSV();
		radky[indexRadku++].policka = radek.split("[;|,]");
		if (indexRadku >= radky.length) {
			RadekCSV pomPole[] = new RadekCSV[2 * radky.length];
			System.arraycopy(radky, 0, pomPole, 0, radky.length);
			radky = pomPole;
		}
	}

	public void sort() {
		java.util.Arrays.sort(radky, 0, indexRadku);
	}

	public void print(PrintStream ps) {
		for (int i = 0; i < indexRadku; i++) {
			radky[i].print(ps);
			ps.println();
		}
	}
}

