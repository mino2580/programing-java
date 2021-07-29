



package it_network;
import java.util.Scanner; 
import java.util.Arrays;

//import knižnice k metode next line
public class a_1_4_retazce{

	public static void main(String[] args) {

/**************** Lekce 3 - Promìnné, typový systém a parsování */
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
		System.out.println("Ahoj, jsem virtuální papoušek Lóra, rád opakuji!");
		System.out.println("Napiš nìco: ");
		String vstup;
		vstup = sc.nextLine();
		String vystup;
		vystup = vstup + ", " + vstup + "!";
		System.out.println(vystup);	
*/			
/*************************Program zdvojnásobovaè****************************************/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadejte èíslo k zdvojnásobení:");
		String s = sc.nextLine();
		int a = Integer.parseInt(s);
		a = a * 2;
		System.out.println(a);
*/	
/*************************Jednoduchá kalkulaèka****************************************/
/*	
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Vítejte v kalkulaèce");
		System.out.println("Zadejte první èíslo:");
		float a = Float.parseFloat(sc.nextLine());
		System.out.println("Zadejte druhé èíslo:");
		float b = Float.parseFloat(sc.nextLine());
		float soucet = a + b;
		float rozdil = a - b;
		float soucin = a * b;
		float podil = a / b;
		System.out.println("Souèet: " + soucet);
		System.out.println("Rozdíl: " + rozdil);
		System.out.println("Souèin: " + soucin);
		System.out.println("Podíl: " + podil);
		System.out.println("Dìkuji za použití kalkulaèky, aplikaci ukonèíte libovolnou klávesou.");	
*/		
/**********************Øešené úlohy k 3. lekci Javy ************************************/

/*Vytvoøte program, který si na vstupu nechá zadat jméno uživatele a 
 * poté jeho vlastnost. Nakonec vypíše "jméno je vlastnost", viz obrázek.

Ukázka obrazovky programu:

Vlastnosti Ahoj, jak se jmenuješ?
Bill Gates
Jaký jsi?
hustodémonsky bohatý
Bill Gates je hustodémonsky bohatý*/
		
		//reseni
/*
		  Scanner sc = new Scanner(System.in, "Windows-1250");
	        System.out.println("Ahoj, jak se jmenuješ?");
	        String jmeno = sc.nextLine();
	        System.out.println("Jaký jsi?");
	        String vlastnost = sc.nextLine();
	        System.out.println(jmeno + " je " + vlastnost);
*/
		
/**Vytvoøte program, který si na vstupu vyžádá celé èíslo a následnì 
 * vypíše jeho druhou mocninu                                       */
/*		 
		Scanner sc = new Scanner(System.in, "Windows-1250");
	        System.out.println("Zadej èíslo k umocnìní: ");
	        int a = Integer.parseInt(sc.nextLine());
	        int vysledek = a * a;
	        System.out.println("Výsledek: " + vysledek);
*/
/********Priklad  který si na vstupu vyžádá polomìr kruhu.*************/

/*Vytvoøte program, který si na vstupu vyžádá polomìr kruhu.
*  Následnì vypíše jeho obvod a obsah. Pro èíslo Pí použijte hodnotu 
*  3.1415, aby vyšel pøesný výsledek.*/
		
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
			System.out.println("Zadej polomìr kruhu (cm):");
			float a,b;
			float r = Float.parseFloat(sc.nextLine());
			a=(float) (2*3.1415*r);
			b=(float) (3.1415*r*r);
			System.out.println("Obvod zadaného kruhu je: "+a+" cm");
			System.out.println("Jeho obsah je "+b+" cm^2");
*/		
		
/*********Lekce 4 - Typový systém podruhé: Datové typy **********************/

/************************* Boolean **************************************************/
/*Boolean nabývá dvou hodnot: true (pravda) a false (nepravda). 
 * Budeme ho používat zejména tehdy, až se dostaneme k podmínkám.
 *  Do promìnné typu boolean lze uložit jak pøímo hodnotu true/false,
 *   tak i logický výraz. Zkusme si jednoduchý pøíklad:*/		
/*		
		boolean b = false;
		boolean vyraz = (15 > 5);
		System.out.println(b);
		System.out.println(vyraz);	
*/
/******************** Referenèní datové typy *************************************************/

/*********String ,startsWith(), endsWith() a contains()************************************************************/

/*Mùžeme se jednoduše zeptat, zda øetìzec zaèíná, konèí nebo zda
 *  obsahuje urèitý podøetìzec (substring). Podøetìzcem myslíme 
 *  èást pùvodního øetìzce. Všechny tyto metody budou jako parametr
 *   brát samozøejmì podøetìzec a vracet hodnoty typu boolean (true/false).
 *    Zatím na výstup neumíme reagovat, ale pojïme si ho alespoò vypsat:
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

		/*Nìkdy se nám hodí vìdìt, zda je øetìzec prázdný. To znamená, 
 * že jeho délka je 0 a neobsahuje žádný znak, ani napø. mezeru.
 *  Takový øetìzec mùžeme získat napø. tak, že uživatel nic nezadá do 
 *  nìjakého vstupu. Metoda isEmpty() nám vrátí true pokud je øetìzec
 *   prázdný a false pokud není:*/
/*		
		String s1 = " ";
		String s2 = "";
		String s3 = "slovo";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
*/
/***toUpperCase() a toLowerCase()-Rozlišování velkých a malých písmen **************************************************/

/*Rozlišování velkých a malých písmen mùže být nìkdy na obtíž. 
 * Mnohdy se budeme potøebovat zeptat na pøítomnost podøetìzce tak, 
 * aby nezáleželo na velikosti písmen. Situaci mùžeme vyøešit pomocí 
 * metod toUpperCase() a toLowerCase(), které vrací øetìzec ve velkých a
 *  v malých písmenech. Uveïme si reálnìjší pøíklad než je Krokonosohroch.
 *   Budeme mít v promìnné øádek konfiguraèního souboru, který psal 
 *   uživatel. Jelikož se na vstupy od uživatelù nelze spolehnout, 
 *   musíme se snažit eliminovat možné chyby, zde napø. s velkými písmeny.*/
/*		
		String konfig = "Fullscreen shaDows autosave";
		konfig = konfig.toLowerCase();
		System.out.println("Pobìží hra ve fullscreenu?");
		System.out.println(konfig.contains("fullscreen"));
		System.out.println("Budou zapnuté stíny?");
		System.out.println(konfig.contains("shadows"));
		System.out.println("Pøeje si hráè vypnout zvuk?");
		System.out.println(konfig.contains("nosound"));
		System.out.println("Pøeje si hráè hru automaticky ukládat?");
		System.out.println(konfig.contains("autosave"));
*/	
/*************************** trim() ******************************************/
/*Další nástrahou mohou být mezery a obecnì všechny tzv. bílé znaky,
 *  které nejsou vidìt, ale mohou nám uškodit. Obecnì mùže být dobré
 *   trimovat všechny vstupy od uživatele. Zkuste si v následující 
 *   aplikaci pøed èíslo a za èíslo zadat nìkolik mezer, trim() je 
 *   odstraní. Odstraòují se vždy bílé znaky kolem øetìzce, nikoli uvnitø:*/
/*		
		System.out.println("Zadejte èíslo:");
		Scanner sc = new Scanner(System.in, "Windows-1250");
		String s = sc.nextLine();
		System.out.println("Zadal jste text: " + s);
		System.out.println("Text po funkci trim: " + s.trim());
		int a = Integer.parseInt(s.trim());
		System.out.println("Pøevedl jsem zadaný text na èíslo parsováním, zadal jste: " + a);
*/		
/*******************replace() nahrazeni textu jinim textem**************************************************/
	
	/*Asi nejdùležitìjší metodou na Stringu je nahrazení urèité jeho èásti 
	 * jiným textem. Jako parametry zadáme dva podøetìzce, jeden co chceme
	 *  nahrazovat a druhý ten, kterým to chceme nahradit. Metoda vrátí 
	 *  nový String, ve kterém probìhlo nahrazení. Když daný podøetìzec 
	 *  metoda nenajde, vrátí pùvodní øetìzec. Zkusme si to:*/	
	/*	
		String s = "C# je nejlepší!";
		s = s.replace("C#", "Java");
		System.out.println(s);
	*/	
/**************************format()*******************************************/
	
	/*format() je velmi užiteèná metoda, která nám umožòuje vkládat do 
	 * samotného textového øetìzce zástupné znaèky. 
	 * Ty jsou reprezentovány jako procento a zkratka datového typu. 
	 * Metoda se volá na typu String, prvním parametrem je textový 
	 * øetìzec se znaèkami, další dále následují promìnné v tom poøadí,
	 *  v kterém se mají do textu místo znaèek vložit. Všimnìte si, 
	 *  že se metoda nevolá na konkrétní promìnné (pøesnìji instanci,
	 *   viz další díly), ale pøímo na typu String*/
		/*Znaèky jsou:

    %d pro celá èísla
    %s pro String
    %f pro float. U float mùžeme definovat délku desetinné èásti, napø: %.2f pro dvì desetinná místa.

Konzole sama umí pøijímat text v takovémto formátu, jen musíme místo println() volat printf(). Mùžeme tedy napsat:*/
	/*	
		int a = 10;
		int b = 20;
		int c = a + b;
		String s = String.format("Když seèteme %d a %d, dostaneme %d", a, b, c);
		System.out.println(s);
	*/
/*************************length()********************************************/
/*Poslední, ale nejdùležitìjší je length(), tedy délka. Vrací celé èíslo,
 *  které pøedstavuje poèet znakù v øetìzci.*/	
		/*
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadejte vaše jméno:");
		String jmeno = sc.nextLine();
		System.out.printf("Délka vašeho jména je: %d", jmeno.length());
		*/
/************************Øešené úlohy k 4. lekci Javy *********************************************/
/*Vytvoøte program, který si na vstupu nechá zadat jméno uživatele, 
 * jeho pøíjmení a vìk. Jméno a pøíjmení poté vypíše VELKÝMI PÍSMENY.
 *  Nakonec vypíše "Za rok ti bude vek + 1 let.", viz obrázek.

Ukázka obrazovky programu:

Jmeno Zadej jméno:
Jezis
Zadej pøíjmení:
Kristus
Zadej svùj vìk:
33
JEZIS KRISTUS
Za rok ti bude 34 let.
*/
		
		//reseni
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		 String jmeno,jmeno2;
		 int vek=0;
		 System.out.println("Zadej jméno:"); 
		 jmeno = sc.nextLine(); 
		 jmeno = jmeno.toUpperCase();
		 System.out.println("Zadej pøíjmení:"); 
		 jmeno2 = sc.nextLine(); 
		 jmeno2 = jmeno2.toUpperCase();
		 System.out.println("Zadej svùj vìk:"); 
		 int a = Integer.parseInt(sc.nextLine());
		 int b=a+1;
		 System.out.println(jmeno+" "+jmeno2);
		 System.out.println("Za rok ti bude "+b+ " let.");
*/
		
/****************priklad porovnavani dvoch retezcu **************************************/

/*Vytvoøte program, který si na vstupu nechá zadat 2 slova. Následnì vypište 
 * o kolik znakù je druhé slovo delší než první. Ignorujte bílé znaky pøed 
 * a za textem.

Ukázka obrazovky programu:

Slova Zadejte delší slovo:
pampeliska
Zadejte kratší slovo:
petrklic
Slova se liší délkou o 2 znakù*/
		
		//reseni
/*

		Scanner sc = new Scanner(System.in, "Windows-1250");
		 System.out.println("Zadejte delší slovo:");
		String jmeno = sc.nextLine();
		String jmeno2=jmeno.trim();
		int jmeno3=jmeno2.length();
		//System.out.println(jmeno);
		
		 System.out.println("Zadejte kratší slovo:");
		 String j = sc.nextLine();
			String j2=j.trim();
			int j3=j2.length();
		//	System.out.println(j);
		int b=jmeno3-j3;
			 System.out.println("Slova se liší délkou o "+b+ " znakù");
*/			 
/******Priklad pro nalezeni zadaneho slova ulozeneho v retezci********************************************/

/*Vytvoøte program, který si na vstupu vyžádá textový øetìzec.
 *  Zjistìte, zda daný textový øetìzec obsahuje slovo "itnetwork" bez 
 *  ohledu na velikost písmen.

Ukázka obrazovky programu:

itnetwork Zadej øetìzec:
Programovat se uèím hlavnì na ITnetwork a trochu i ve škole.
true*/
/*		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		 System.out.println("Zadej øetìzec:");
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
