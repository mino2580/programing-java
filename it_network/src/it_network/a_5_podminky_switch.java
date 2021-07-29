package it_network;

import java.util.Scanner;

public class a_5_podminky_switch {

	public static void main(String[] args) {
		
/***************************Lekce 5 - Podm�nky (v�tven�) *******************************************/
	
/********************************program odmocnina **************************/

/*Program na�te od u�ivatele ��slo a pokud je v�t�� ne� 0, vypo��t� z n�j 
 * druhou odmocninu. Mimo jin� jsme pou�ili t��du Math, kter� na sob� 
 * obsahuje �adu u�ite�n�ch matematick�ch metod, n�kdy si ji bl�e p�edstav�me.
 *  Metoda sqrt() vrac� hodnotu jako double.*/	
		/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej n�jak� ��slo, ze kter�ho spo��t�m odmocninu:");
		int a = Integer.parseInt(sc.nextLine());
		if (a > 0)
		{
		    System.out.println("Zadal jsi ��slo v�t�� ne� 0, to znamen�, �e ho mohu odmocnit!");
		    double o = Math.sqrt(a);
		    System.out.println("Odmocnina z ��sla " + a + " je " + o);
		}
		if (a <= 0)
		{
		    System.out.println("Odmocnina ze z�porn�ho ��sla neexistuje!");
		}
		System.out.println("D�kuji za zad�n�");
 		*/

/******** kdy� neni podminka splnena provede se else *****************************************/

/*V�imn�te si, �e mus�me pokr�t i p��pad, kdy se a == 0, nejen kdy� je men��. 
 * K�d v�ak m��eme v�razn� zjednodu�it pomoc� kl��ov�ho slova else, 
 * kter� vykon� n�sleduj�c� p��kaz nebo blok p��kaz� v p��pad�, �e se
 *  podm�nka neprovede:*/		
		/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej n�jak� ��slo, ze kter�ho spo��t�m odmocninu:");
		int a = Integer.parseInt(sc.nextLine());
		if (a > 0)
		{
		    System.out.println("Zadal jsi ��slo v�t�� ne� 0, to znamen�, �e ho mohu odmocnit!");
		    double o = Math.sqrt(a);
		    System.out.println("Odmocnina z ��sla " + a + " je " + o);
		}
		else
		{
		    System.out.println("Odmocnina ze z�porn�ho ��sla neexistuje!");
		}
		System.out.println("D�kuji za zad�n�");	
		*/
		
		
/************************* priklad if *********************************************/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadejte ��slo v rozmez� 10-20 nebo 30-40:");
		int a = Integer.parseInt(sc.nextLine());
		if (((a >= 10) && (a <= 20)) || ((a >=30) && (a <= 40)))
		{
		    System.out.println("Zadal jsi spr�vn�");
		}
		else
		{
		    System.out.println("Zadal jsi �patn�");
		}
*/
/************************** switch kalkulacka ********************************************/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("V�tejte v kalkula�ce");
		System.out.println("Zadejte prvn� ��slo:");
		float a = Float.parseFloat(sc.nextLine());
		System.out.print("Zadejte druh� ��slo:");
		float b = Float.parseFloat(sc.nextLine());
		System.out.println("Zvolte si operaci:");
		System.out.println("1 - s��t�n�");
		System.out.println("2 - od��t�n�");
		System.out.println("3 - n�soben�");
		System.out.println("4 - d�len�");
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
		    System.out.println("V�sledek: " + vysledek);
		}
		else
		{
		    System.out.println("Neplatn� volba");
		}
		System.out.println();
		System.out.println("D�kuji za pou�it� kalkula�ky.");
*/
/******************* �e�en� �lohy k 5. lekci Javy ***************************************************/

/************************ delka jmena *************************************/

/*Vytvo�te program, kter� si na vstupu nech� zadat jm�no u�ivatele. 
 * Program analyzuje d�lku zadan�ho jm�na. Pokud je d�lka jm�na mezi t�emi
 *  a deseti znaky, vyp�e, �e m� u�ivatel norm�ln� jm�no. V ostatn�ch
 *   p��padech vyp�e, �e je jm�no p��li� kr�tk� nebo dlouh�.

Uk�zka obrazovky programu:

DelkaJmena Zadej sv� jm�no:
Bolehlavoslav
M� moc kr�tk� nebo moc dlouh� jm�no!*/
	
	/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadej sv� jm�no:");
		String jmeno = sc.nextLine();
		int jmeno2=jmeno.length();
		
		if (jmeno2>=3 && jmeno2<=10) {
			System.out.println("Norm�ln� jm�no.");
		}
		else System.out.println("M� moc kr�tk� nebo moc dlouh� jm�no!");
	*/		
/***************************** smajlici *****************************************/

/*Vytvo�te program, kter� si na vstupu nech� zadat smajl�ka.
 *  N�sledn� vypi�te slovy o jakou emoci se jedn�. Rozezn�vejte smajl�ky:

    :-) - "Tv�j smajl�k je vesel�"
    :-( - "Tv�j smajl�k je smutn�"
    :-* - "Tv�j smajl�k je zamilovan�"
    :-P - "Tv�j smajl�k je s vyplazen�m jazykem"
    jak�koli jin� - "Tv�j smajl�k je nezn�m�"

Pokud zadan� smajl�k nesouhlas� ani s jedn�m z t�chto, program vyp�e, �e je nezn�m�. K �e�en� aplikace pou�ijte konstrukci switch.

Zamyslete se nad t�m, aby program rozezn�val smajl�ky s nosem i bez nosu.

Uk�zka obrazovky programu:

Smajlik Zadej smajl�ka:
:-P
Tv�j smajl�k je s vyplazen�m jazykem*/

	/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej smajl�ka:");
        String jmeno = sc.nextLine();
		if (jmeno.length() == 3) {
		switch (jmeno)
		{
		    case ":-)":
		    	System.out.println("Tv�j smajl�k je vesel�");
		    break;
		    
		    case ":-(":
		    	System.out.println("Tv�j smajl�k je smutn�");
		    break;
		    
		    case ":-*":
		    	System.out.println("Tv�j smajl�k je zamilovan�");
		    break;
		    
		    case ":-P":
		    	System.out.println("Tv�j smajl�k je s vyplazen�m jazykem");
		    break;
		    
		    default:
		    	System.out.println("Tv�j smajl�k je nezn�m�");
		}
		}else 
			switch (jmeno)
			{
			    case ":)":
			    	System.out.println("Tv�j smajl�k je vesel�");
			    break;
			    
			    case ":(":
			    	System.out.println("Tv�j smajl�k je smutn�");
			    break;
			    
			    case ":*":
			    	System.out.println("Tv�j smajl�k je zamilovan�");
			    break;
			    
			    case ":P":
			    	System.out.println("Tv�j smajl�k je s vyplazen�m jazykem");
			    break;
			    
			    default:
			    	System.out.println("Tv�j smajl�k je nezn�m�");
			}
	*/	
/************************ kvadraticka rovnice **********************************************/
		
/*Vytvo�te program, kter� si na vstupu vy��d� postupn� koeficienty a, b, c
 *  kvadratick� rovnice ax^2 + bx + c = 0 a vypo��t� jej� re�ln� ko�eny 
 *  pomoc� diskriminantu.

Vzore�ek pro v�po�et diskriminantu je:

d = b^2 - 4 * a * c

A vzore�ek pro v�po�et ko�en� je:

    x_1 = (-b + odmocnina(d)) / 2a
    x_2 = (-b - odmocnina(d)) / 2a

Komplexn�mi ko�eny se nezab�vejte, p�i z�porn�m diskriminantu tedy program vyp�e, �e rovnice nem� �e�en�.

Uk�zka obrazovky programu:

KvadratickaRovnice Zadejte postupn� koeficienty a,b,c kvadratick� rovnice ax^2+bx+c=0 :
2
-4
2
Rovnice m� jeden ko�en x = 1.000000*/
		
		/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadejte postupn� koeficienty a,b,c kvadratick� rovnice ax^2+bx+c=0 :");
		
		float a = Float.parseFloat(sc.nextLine());
		float b = Float.parseFloat(sc.nextLine());
		float c = Float.parseFloat(sc.nextLine());
		
		float d =  (b*b - 4 *a *c);
		
		if(a!=0&&b!=0&&c!=0) {
			if(d<0) {
				System.out.println("Neexistuje �e�en� v oblasti re�ln�ch ��sel");	
			}
			
			if(d==0) {
				float x1 =  (float) ((-b + Math.sqrt(d)) / (2*a));
				System.out.println("Rovnice m� jeden ko�en x = "+x1);	
			}
			if(d>0) {
				float x1 =  (float) ((-b + Math.sqrt(d)) / (2*a));
				float x2 =  (float) ((-b - Math.sqrt(d)) / (2*a));
				System.out.println("Rovnice m� 2 re�ln� ko�eny x1 = "+x1+", x2 = "+x2);	
			}
			
		}else System.out.println("Nen� kvadratick� rovnice");	
*/		
 /************************************************************************/
/*************************************************************************/					
//////////////////////////////// end ////////////////////////////////////////
	}

}
