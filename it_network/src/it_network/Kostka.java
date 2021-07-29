package it_network;
import java.util.Scanner;
import java.util.Random;

                                     /** T��da reprezentuje hrac� kostku */
public class Kostka {
  //instance                                   /** Gener�tor n�hodn�ch ��sel */
    private Random random;
                                     /** Po�et st�n kostky */
    public int pocetSten;

//konstruktor////////////////////////////////////////////
    
    public Kostka(int aPocetSten) {
        pocetSten = aPocetSten;
        random = new Random();
    }
  
    //alternativny zapis
    
/*  public Kostka(int pocetSten) {
    this.pocetSten = pocetSten;
    random = new Random();
    }
*/      
         
//dalsi konstruktor bez parametru,uzivatel ocekava defaultni nastaveni 6    
   
    public Kostka() {
        pocetSten = 6;
        random = new Random();
    }
    
 //////////////////////////////////////////////////////////////   

    //metody
    
    public int vratPocetSten() {   //muzu jenom cist,nemuzu menit 
        return pocetSten;
    }
////////////////////////////////////////////////////////////////
    /*Definujme na kostce metodu hod(), kter� n�m vr�t� n�hodn� ��slo od 1 
     * do po�tu st�n. Je to velmi jednoduch�, metoda bude public (p�jde
     *  volat zven��) a nebude m�t ��dn� parametr. N�vratov� hodnota bude
     *   typu int. N�hodn� ��slo z�sk�me tak, �e na gener�toru zavol�me 
     *   metodu nextInt(). Ta m� 2 p�et�en�:

    nextInt(): Varianta bez parametru vrac� n�hodn� ��slo v cel�m rozsahu 
    datov�ho typu int;
    nextInt(Do): Vrac� nez�porn� ��sla men�� ne� mez Do. random.nextInt(100)
     tedy vr�t� ��slo od 0 do 99.
*/
    public int hod() {
        return random.nextInt(pocetSten) + 1;
    }
    
///////////////////////////////////////////////////////////////    
    /**
     * Vrac� textovou reprezentaci kostky
     * @return Textov� reprezentace kostky
     */
    @Override // vzpise objekt
    public String toString() {
    return String.format("Kostka s %s st�nami", pocetSten);
    }
    
/////////////////////////end kostka//////////////////////////////////////////////////////
}
