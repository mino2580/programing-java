



package it_network;
import java.util.Scanner; 
import java.util.Arrays;

//import kni�nice k metode next line
public class a_1_4_retazce{

	public static void main(String[] args) {

/**************** Lekce 3 - Prom�nn�, typov� syst�m a parsov�n� */
 /*	
		int a;
		a = 56;
		System.out.println(a);
		
		float a1;
		a1 = 56.6F;
		System.out.println(a1);
		
 	*/
/************************* Program Papousek ********************************************/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Ahoj, jsem virtu�ln� papou�ek L�ra, r�d opakuji!");
		System.out.println("Napi� n�co: ");
		String vstup;
		vstup = sc.nextLine();
		String vystup;
		vystup = vstup + ", " + vstup + "!";
		System.out.println(vystup);	
*/			
/*************************Program zdvojn�sobova�****************************************/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadejte ��slo k zdvojn�soben�:");
		String s = sc.nextLine();
		int a = Integer.parseInt(s);
		a = a * 2;
		System.out.println(a);
*/	
/*************************Jednoduch� kalkula�ka****************************************/
/*	
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("V�tejte v kalkula�ce");
		System.out.println("Zadejte prvn� ��slo:");
		float a = Float.parseFloat(sc.nextLine());
		System.out.println("Zadejte druh� ��slo:");
		float b = Float.parseFloat(sc.nextLine());
		float soucet = a + b;
		float rozdil = a - b;
		float soucin = a * b;
		float podil = a / b;
		System.out.println("Sou�et: " + soucet);
		System.out.println("Rozd�l: " + rozdil);
		System.out.println("Sou�in: " + soucin);
		System.out.println("Pod�l: " + podil);
		System.out.println("D�kuji za pou�it� kalkula�ky, aplikaci ukon��te libovolnou kl�vesou.");	
*/		
/**********************�e�en� �lohy k 3. lekci Javy ************************************/

/*Vytvo�te program, kter� si na vstupu nech� zadat jm�no u�ivatele a 
 * pot� jeho vlastnost. Nakonec vyp�e "jm�no je vlastnost", viz obr�zek.

Uk�zka obrazovky programu:

Vlastnosti Ahoj, jak se jmenuje�?
Bill Gates
Jak� jsi?
hustod�monsky bohat�
Bill Gates je hustod�monsky bohat�*/
		
		//reseni
/*
		  Scanner sc = new Scanner(System.in, "Windows-1250");
	        System.out.println("Ahoj, jak se jmenuje�?");
	        String jmeno = sc.nextLine();
	        System.out.println("Jak� jsi?");
	        String vlastnost = sc.nextLine();
	        System.out.println(jmeno + " je " + vlastnost);
*/
		
/**Vytvo�te program, kter� si na vstupu vy��d� cel� ��slo a n�sledn� 
 * vyp�e jeho druhou mocninu                                       */
/*		 
		Scanner sc = new Scanner(System.in, "Windows-1250");
	        System.out.println("Zadej ��slo k umocn�n�: ");
	        int a = Integer.parseInt(sc.nextLine());
	        int vysledek = a * a;
	        System.out.println("V�sledek: " + vysledek);
*/
/********Priklad  kter� si na vstupu vy��d� polom�r kruhu.*************/

/*Vytvo�te program, kter� si na vstupu vy��d� polom�r kruhu.
*  N�sledn� vyp�e jeho obvod a obsah. Pro ��slo P� pou�ijte hodnotu 
*  3.1415, aby vy�el p�esn� v�sledek.*/
		
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
			System.out.println("Zadej polom�r kruhu (cm):");
			float a,b;
			float r = Float.parseFloat(sc.nextLine());
			a=(float) (2*3.1415*r);
			b=(float) (3.1415*r*r);
			System.out.println("Obvod zadan�ho kruhu je: "+a+" cm");
			System.out.println("Jeho obsah je "+b+" cm^2");
*/		
		
/*********Lekce 4 - Typov� syst�m podruh�: Datov� typy **********************/

/************************* Boolean **************************************************/
/*Boolean nab�v� dvou hodnot: true (pravda) a false (nepravda). 
 * Budeme ho pou��vat zejm�na tehdy, a� se dostaneme k podm�nk�m.
 *  Do prom�nn� typu boolean lze ulo�it jak p��mo hodnotu true/false,
 *   tak i logick� v�raz. Zkusme si jednoduch� p��klad:*/		
/*		
		boolean b = false;
		boolean vyraz = (15 > 5);
		System.out.println(b);
		System.out.println(vyraz);	
*/
/******************** Referen�n� datov� typy *************************************************/

/*********String ,startsWith(), endsWith() a contains()************************************************************/

/*M��eme se jednodu�e zeptat, zda �et�zec za��n�, kon�� nebo zda
 *  obsahuje ur�it� pod�et�zec (substring). Pod�et�zcem mysl�me 
 *  ��st p�vodn�ho �et�zce. V�echny tyto metody budou jako parametr
 *   br�t samoz�ejm� pod�et�zec a vracet hodnoty typu boolean (true/false).
 *    Zat�m na v�stup neum�me reagovat, ale poj�me si ho alespo� vypsat:
//vystup s konzole
		false
		true
		true
		false*/
		
/*		
		String s = "Krokonosohroch";
		System.out.println(s.startsWith("krok"));
		System.out.println(s.endsWith("hroch"));
		System.out.println(s.contains("nos"));
		System.out.println(s.contains("roh"));
*/		
/********************isEmpty() jestli je retezec prazdny*************************************************/

		/*N�kdy se n�m hod� v�d�t, zda je �et�zec pr�zdn�. To znamen�, 
 * �e jeho d�lka je 0 a neobsahuje ��dn� znak, ani nap�. mezeru.
 *  Takov� �et�zec m��eme z�skat nap�. tak, �e u�ivatel nic nezad� do 
 *  n�jak�ho vstupu. Metoda isEmpty() n�m vr�t� true pokud je �et�zec
 *   pr�zdn� a false pokud nen�:*/
/*		
		String s1 = " ";
		String s2 = "";
		String s3 = "slovo";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
*/
/***toUpperCase() a toLowerCase()-Rozli�ov�n� velk�ch a mal�ch p�smen **************************************************/

/*Rozli�ov�n� velk�ch a mal�ch p�smen m��e b�t n�kdy na obt�. 
 * Mnohdy se budeme pot�ebovat zeptat na p��tomnost pod�et�zce tak, 
 * aby nez�le�elo na velikosti p�smen. Situaci m��eme vy�e�it pomoc� 
 * metod toUpperCase() a toLowerCase(), kter� vrac� �et�zec ve velk�ch a
 *  v mal�ch p�smenech. Uve�me si re�ln�j�� p��klad ne� je Krokonosohroch.
 *   Budeme m�t v prom�nn� ��dek konfigura�n�ho souboru, kter� psal 
 *   u�ivatel. Jeliko� se na vstupy od u�ivatel� nelze spolehnout, 
 *   mus�me se sna�it eliminovat mo�n� chyby, zde nap�. s velk�mi p�smeny.*/
/*		
		String konfig = "Fullscreen shaDows autosave";
		konfig = konfig.toLowerCase();
		System.out.println("Pob�� hra ve fullscreenu?");
		System.out.println(konfig.contains("fullscreen"));
		System.out.println("Budou zapnut� st�ny?");
		System.out.println(konfig.contains("shadows"));
		System.out.println("P�eje si hr�� vypnout zvuk?");
		System.out.println(konfig.contains("nosound"));
		System.out.println("P�eje si hr�� hru automaticky ukl�dat?");
		System.out.println(konfig.contains("autosave"));
*/	
/*************************** trim() ******************************************/
/*Dal�� n�strahou mohou b�t mezery a obecn� v�echny tzv. b�l� znaky,
 *  kter� nejsou vid�t, ale mohou n�m u�kodit. Obecn� m��e b�t dobr�
 *   trimovat v�echny vstupy od u�ivatele. Zkuste si v n�sleduj�c� 
 *   aplikaci p�ed ��slo a za ��slo zadat n�kolik mezer, trim() je 
 *   odstran�. Odstra�uj� se v�dy b�l� znaky kolem �et�zce, nikoli uvnit�:*/
/*		
		System.out.println("Zadejte ��slo:");
		Scanner sc = new Scanner(System.in, "Windows-1250");
		String s = sc.nextLine();
		System.out.println("Zadal jste text: " + s);
		System.out.println("Text po funkci trim: " + s.trim());
		int a = Integer.parseInt(s.trim());
		System.out.println("P�evedl jsem zadan� text na ��slo parsov�n�m, zadal jste: " + a);
*/		
/*******************replace() nahrazeni textu jinim textem**************************************************/
	
	/*Asi nejd�le�it�j�� metodou na Stringu je nahrazen� ur�it� jeho ��sti 
	 * jin�m textem. Jako parametry zad�me dva pod�et�zce, jeden co chceme
	 *  nahrazovat a druh� ten, kter�m to chceme nahradit. Metoda vr�t� 
	 *  nov� String, ve kter�m prob�hlo nahrazen�. Kdy� dan� pod�et�zec 
	 *  metoda nenajde, vr�t� p�vodn� �et�zec. Zkusme si to:*/	
	/*	
		String s = "C# je nejlep��!";
		s = s.replace("C#", "Java");
		System.out.println(s);
	*/	
/**************************format()*******************************************/
	
	/*format() je velmi u�ite�n� metoda, kter� n�m umo��uje vkl�dat do 
	 * samotn�ho textov�ho �et�zce z�stupn� zna�ky. 
	 * Ty jsou reprezentov�ny jako procento a zkratka datov�ho typu. 
	 * Metoda se vol� na typu String, prvn�m parametrem je textov� 
	 * �et�zec se zna�kami, dal�� d�le n�sleduj� prom�nn� v tom po�ad�,
	 *  v kter�m se maj� do textu m�sto zna�ek vlo�it. V�imn�te si, 
	 *  �e se metoda nevol� na konkr�tn� prom�nn� (p�esn�ji instanci,
	 *   viz dal�� d�ly), ale p��mo na typu String*/
		/*Zna�ky jsou:

    %d pro cel� ��sla
    %s pro String
    %f pro float. U float m��eme definovat d�lku desetinn� ��sti, nap�: %.2f pro dv� desetinn� m�sta.

Konzole sama um� p�ij�mat text v takov�mto form�tu, jen mus�me m�sto println() volat printf(). M��eme tedy napsat:*/
	/*	
		int a = 10;
		int b = 20;
		int c = a + b;
		String s = String.format("Kdy� se�teme %d a %d, dostaneme %d", a, b, c);
		System.out.println(s);
	*/
/*************************length()********************************************/
/*Posledn�, ale nejd�le�it�j�� je length(), tedy d�lka. Vrac� cel� ��slo,
 *  kter� p�edstavuje po�et znak� v �et�zci.*/	
		/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadejte va�e jm�no:");
		String jmeno = sc.nextLine();
		System.out.printf("D�lka va�eho jm�na je: %d", jmeno.length());
		*/
/************************�e�en� �lohy k 4. lekci Javy *********************************************/
/*Vytvo�te program, kter� si na vstupu nech� zadat jm�no u�ivatele, 
 * jeho p��jmen� a v�k. Jm�no a p��jmen� pot� vyp�e VELK�MI P�SMENY.
 *  Nakonec vyp�e "Za rok ti bude vek + 1 let.", viz obr�zek.

Uk�zka obrazovky programu:

Jmeno Zadej jm�no:
Jezis
Zadej p��jmen�:
Kristus
Zadej sv�j v�k:
33
JEZIS KRISTUS
Za rok ti bude 34 let.
*/
		
		//reseni
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		 String jmeno,jmeno2;
		 int vek=0;
		 System.out.println("Zadej jm�no:"); 
		 jmeno = sc.nextLine(); 
		 jmeno = jmeno.toUpperCase();
		 System.out.println("Zadej p��jmen�:"); 
		 jmeno2 = sc.nextLine(); 
		 jmeno2 = jmeno2.toUpperCase();
		 System.out.println("Zadej sv�j v�k:"); 
		 int a = Integer.parseInt(sc.nextLine());
		 int b=a+1;
		 System.out.println(jmeno+" "+jmeno2);
		 System.out.println("Za rok ti bude "+b+ " let.");
*/
		
/****************priklad porovnavani dvoch retezcu **************************************/

/*Vytvo�te program, kter� si na vstupu nech� zadat 2 slova. N�sledn� vypi�te 
 * o kolik znak� je druh� slovo del�� ne� prvn�. Ignorujte b�l� znaky p�ed 
 * a za textem.

Uk�zka obrazovky programu:

Slova Zadejte del�� slovo:
pampeliska
Zadejte krat�� slovo:
petrklic
Slova se li�� d�lkou o 2 znak�*/
		
		//reseni
/*

		Scanner sc = new Scanner(System.in, "Windows-1250");
		 System.out.println("Zadejte del�� slovo:");
		String jmeno = sc.nextLine();
		String jmeno2=jmeno.trim();
		int jmeno3=jmeno2.length();
		//System.out.println(jmeno);
		
		 System.out.println("Zadejte krat�� slovo:");
		 String j = sc.nextLine();
			String j2=j.trim();
			int j3=j2.length();
		//	System.out.println(j);
		int b=jmeno3-j3;
			 System.out.println("Slova se li�� d�lkou o "+b+ " znak�");
*/			 
/******Priklad pro nalezeni zadaneho slova ulozeneho v retezci********************************************/

/*Vytvo�te program, kter� si na vstupu vy��d� textov� �et�zec.
 *  Zjist�te, zda dan� textov� �et�zec obsahuje slovo "itnetwork" bez 
 *  ohledu na velikost p�smen.

Uk�zka obrazovky programu:

itnetwork Zadej �et�zec:
Programovat se u��m hlavn� na ITnetwork a trochu i ve �kole.
true*/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		 System.out.println("Zadej �et�zec:");
		String jmeno = sc.nextLine();
		//System.out.println(jmeno);
		String konfig = jmeno.toLowerCase();
		System.out.println(konfig.contains("itnetwork"));
*/		
/*********************************************************************/
/*********************************************************************/
/*********************************************************************/
		  
		
//////////////////////////// end ///////////////////////////////////////	
	}

}
