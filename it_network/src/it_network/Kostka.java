package it_network;
import java.util.Scanner;
import java.util.Random;

                                     /** Tøída reprezentuje hrací kostku */
public class Kostka {
  //instance                                   /** Generátor náhodných èísel */
    private Random random;
                                     /** Poèet stìn kostky */
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
    /*Definujme na kostce metodu hod(), která nám vrátí náhodné èíslo od 1 
     * do poètu stìn. Je to velmi jednoduché, metoda bude public (pùjde
     *  volat zvenèí) a nebude mít žádný parametr. Návratová hodnota bude
     *   typu int. Náhodné èíslo získáme tak, že na generátoru zavoláme 
     *   metodu nextInt(). Ta má 2 pøetížení:

    nextInt(): Varianta bez parametru vrací náhodné èíslo v celém rozsahu 
    datového typu int;
    nextInt(Do): Vrací nezáporná èísla menší než mez Do. random.nextInt(100)
     tedy vrátí èíslo od 0 do 99.
*/
    public int hod() {
        return random.nextInt(pocetSten) + 1;
    }
    
///////////////////////////////////////////////////////////////    
    /**
     * Vrací textovou reprezentaci kostky
     * @return Textová reprezentace kostky
     */
    @Override // vzpise objekt
    public String toString() {
    return String.format("Kostka s %s stìnami", pocetSten);
    }
    
/////////////////////////end kostka//////////////////////////////////////////////////////
}
