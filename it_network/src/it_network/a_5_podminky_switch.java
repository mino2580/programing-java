package it_network;

import java.util.Scanner;

public class a_5_podminky_switch {

	public static void main(String[] args) {
		
/***************************Lekce 5 - Podmínky (vìtvení) *******************************************/
	
/********************************program odmocnina **************************/

/*Program naète od uživatele èíslo a pokud je vìtší než 0, vypoèítá z nìj 
 * druhou odmocninu. Mimo jiné jsme použili tøídu Math, která na sobì 
 * obsahuje øadu užiteèných matematických metod, nìkdy si ji blíže pøedstavíme.
 *  Metoda sqrt() vrací hodnotu jako double.*/	
		/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej nìjaké èíslo, ze kterého spoèítám odmocninu:");
		int a = Integer.parseInt(sc.nextLine());
		if (a > 0)
		{
		    System.out.println("Zadal jsi èíslo vìtší než 0, to znamená, že ho mohu odmocnit!");
		    double o = Math.sqrt(a);
		    System.out.println("Odmocnina z èísla " + a + " je " + o);
		}
		if (a <= 0)
		{
		    System.out.println("Odmocnina ze záporného èísla neexistuje!");
		}
		System.out.println("Dìkuji za zadání");
 		*/

/******** když neni podminka splnena provede se else *****************************************/

/*Všimnìte si, že musíme pokrýt i pøípad, kdy se a == 0, nejen když je menší. 
 * Kód však mùžeme výraznì zjednodušit pomocí klíèového slova else, 
 * které vykoná následující pøíkaz nebo blok pøíkazù v pøípadì, že se
 *  podmínka neprovede:*/		
		/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej nìjaké èíslo, ze kterého spoèítám odmocninu:");
		int a = Integer.parseInt(sc.nextLine());
		if (a > 0)
		{
		    System.out.println("Zadal jsi èíslo vìtší než 0, to znamená, že ho mohu odmocnit!");
		    double o = Math.sqrt(a);
		    System.out.println("Odmocnina z èísla " + a + " je " + o);
		}
		else
		{
		    System.out.println("Odmocnina ze záporného èísla neexistuje!");
		}
		System.out.println("Dìkuji za zadání");	
		*/
		
		
/************************* priklad if *********************************************/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadejte èíslo v rozmezí 10-20 nebo 30-40:");
		int a = Integer.parseInt(sc.nextLine());
		if (((a >= 10) && (a <= 20)) || ((a >=30) && (a <= 40)))
		{
		    System.out.println("Zadal jsi správnì");
		}
		else
		{
		    System.out.println("Zadal jsi špatnì");
		}
*/
/************************** switch kalkulacka ********************************************/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Vítejte v kalkulaèce");
		System.out.println("Zadejte první èíslo:");
		float a = Float.parseFloat(sc.nextLine());
		System.out.print("Zadejte druhé èíslo:");
		float b = Float.parseFloat(sc.nextLine());
		System.out.println("Zvolte si operaci:");
		System.out.println("1 - sèítání");
		System.out.println("2 - odèítání");
		System.out.println("3 - násobení");
		System.out.println("4 - dìlení");
		int volba = Integer.parseInt(sc.nextLine());
		float vysledek = 0;
		switch (volba)
		{
		    case 1:
		        vysledek = a + b;
		    break;
		    case 2:
		        vysledek = a - b;
		    break;
		    case 3:
		        vysledek = a * b;
		    break;
		    case 4:
		        vysledek = a / b;
		    break;
		}
		if ((volba > 0) && (volba < 5))
		{
		    System.out.println("Výsledek: " + vysledek);
		}
		else
		{
		    System.out.println("Neplatná volba");
		}
		System.out.println();
		System.out.println("Dìkuji za použití kalkulaèky.");
*/
/******************* Øešené úlohy k 5. lekci Javy ***************************************************/

/************************ delka jmena *************************************/

/*Vytvoøte program, který si na vstupu nechá zadat jméno uživatele. 
 * Program analyzuje délku zadaného jména. Pokud je délka jména mezi tøemi
 *  a deseti znaky, vypíše, že má uživatel normální jméno. V ostatních
 *   pøípadech vypíše, že je jméno pøíliš krátké nebo dlouhé.

Ukázka obrazovky programu:

DelkaJmena Zadej své jméno:
Bolehlavoslav
Máš moc krátké nebo moc dlouhé jméno!*/
	
	/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej své jméno:");
		String jmeno = sc.nextLine();
		int jmeno2=jmeno.length();
		
		if (jmeno2>=3 && jmeno2<=10) {
			System.out.println("Normální jméno.");
		}
		else System.out.println("Máš moc krátké nebo moc dlouhé jméno!");
	*/		
/***************************** smajlici *****************************************/

/*Vytvoøte program, který si na vstupu nechá zadat smajlíka.
 *  Následnì vypište slovy o jakou emoci se jedná. Rozeznávejte smajlíky:

    :-) - "Tvùj smajlík je veselý"
    :-( - "Tvùj smajlík je smutný"
    :-* - "Tvùj smajlík je zamilovaný"
    :-P - "Tvùj smajlík je s vyplazeným jazykem"
    jakýkoli jiný - "Tvùj smajlík je neznámý"

Pokud zadaný smajlík nesouhlasí ani s jedním z tìchto, program vypíše, že je neznámý. K øešení aplikace použijte konstrukci switch.

Zamyslete se nad tím, aby program rozeznával smajlíky s nosem i bez nosu.

Ukázka obrazovky programu:

Smajlik Zadej smajlíka:
:-P
Tvùj smajlík je s vyplazeným jazykem*/

	/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej smajlíka:");
        String jmeno = sc.nextLine();
		if (jmeno.length() == 3) {
		switch (jmeno)
		{
		    case ":-)":
		    	System.out.println("Tvùj smajlík je veselý");
		    break;
		    
		    case ":-(":
		    	System.out.println("Tvùj smajlík je smutný");
		    break;
		    
		    case ":-*":
		    	System.out.println("Tvùj smajlík je zamilovaný");
		    break;
		    
		    case ":-P":
		    	System.out.println("Tvùj smajlík je s vyplazeným jazykem");
		    break;
		    
		    default:
		    	System.out.println("Tvùj smajlík je neznámý");
		}
		}else 
			switch (jmeno)
			{
			    case ":)":
			    	System.out.println("Tvùj smajlík je veselý");
			    break;
			    
			    case ":(":
			    	System.out.println("Tvùj smajlík je smutný");
			    break;
			    
			    case ":*":
			    	System.out.println("Tvùj smajlík je zamilovaný");
			    break;
			    
			    case ":P":
			    	System.out.println("Tvùj smajlík je s vyplazeným jazykem");
			    break;
			    
			    default:
			    	System.out.println("Tvùj smajlík je neznámý");
			}
	*/	
/************************ kvadraticka rovnice **********************************************/
		
/*Vytvoøte program, který si na vstupu vyžádá postupnì koeficienty a, b, c
 *  kvadratické rovnice ax^2 + bx + c = 0 a vypoèítá její reálné koøeny 
 *  pomocí diskriminantu.

Vzoreèek pro výpoèet diskriminantu je:

d = b^2 - 4 * a * c

A vzoreèek pro výpoèet koøenù je:

    x_1 = (-b + odmocnina(d)) / 2a
    x_2 = (-b - odmocnina(d)) / 2a

Komplexními koøeny se nezabývejte, pøi záporném diskriminantu tedy program vypíše, že rovnice nemá øešení.

Ukázka obrazovky programu:

KvadratickaRovnice Zadejte postupnì koeficienty a,b,c kvadratické rovnice ax^2+bx+c=0 :
2
-4
2
Rovnice má jeden koøen x = 1.000000*/
		
		/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadejte postupnì koeficienty a,b,c kvadratické rovnice ax^2+bx+c=0 :");
		
		float a = Float.parseFloat(sc.nextLine());
		float b = Float.parseFloat(sc.nextLine());
		float c = Float.parseFloat(sc.nextLine());
		
		float d =  (b*b - 4 *a *c);
		
		if(a!=0&&b!=0&&c!=0) {
			if(d<0) {
				System.out.println("Neexistuje øešení v oblasti reálných èísel");	
			}
			
			if(d==0) {
				float x1 =  (float) ((-b + Math.sqrt(d)) / (2*a));
				System.out.println("Rovnice má jeden koøen x = "+x1);	
			}
			if(d>0) {
				float x1 =  (float) ((-b + Math.sqrt(d)) / (2*a));
				float x2 =  (float) ((-b - Math.sqrt(d)) / (2*a));
				System.out.println("Rovnice má 2 reálné koøeny x1 = "+x1+", x2 = "+x2);	
			}
			
		}else System.out.println("Není kvadratická rovnice");	
*/		
 /************************************************************************/
/*************************************************************************/					
//////////////////////////////// end ////////////////////////////////////////
	}

}
