package it_soubory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;

public class hlavni {

	public static void main(String[] args)  throws IOException {
		
		TreeSet<String> map=new TreeSet<>();
		map.add("orange");
		File file=new File("D:\\program.txt");
		BufferedWriter bf=new BufferedWriter (new FileWriter(file));
		
		//Iterate
		
		for(String u : map) {
			bf.write(u+";");
			bf.newLine();
		}
		bf.close();
		// TODO Auto-generated method stub

	}

}
