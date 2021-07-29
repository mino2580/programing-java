package it_network;

import java.util.Arrays;
import java.util.Scanner;

public class sigp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej poèet èísel:");
		int pocet = Integer.parseInt(sc.nextLine());
		int cisla[] = new int[pocet];
		int pole[] = new int[pocet];
		
		for (int i = 0; i < pocet; i++) {
			System.out.printf("Zadej %d. èíslo: ",i+1);
			cisla[i] = Integer.parseInt(sc.nextLine());
			pole[i]=cisla[i];
		}
	
		
		Arrays.sort(pole);
		for (int i : pole) {
		    System.out.print(i + " ");
		}	

	}

}
