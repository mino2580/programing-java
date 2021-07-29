package it_network;

public class NakladniAuto {
///////////////////////////////////////////////////////////////////////
	//instance
int vaha=0;
int nosnost=3000;
int aktualna_vaha=0;


//metoda naloz pisok na auto
public void naloz(int pisek) {
	
	if(pisek<=nosnost&&(aktualna_vaha+pisek)<=nosnost) {
	aktualna_vaha=aktualna_vaha+pisek;
	} else pisek=0;
	
	//System.out.printf("V nákladním autì je naloženo %f kg" ,aktualna_vaha);
}


//metoda vypis,vzpise aktualnu vahu auta
public void vypis() {
	
	System.out.printf("V nákladním autì je naloženo %d kg" ,aktualna_vaha);
}


//metoda vyloz piesok s auta	
public void vyloz(int pisek) {
	
	if(pisek<=nosnost&&(aktualna_vaha-pisek)>=0) {
	aktualna_vaha=aktualna_vaha-pisek;
	} else pisek=0;
	
	//System.out.printf("V nákladním autì je naloženo %f kg" ,aktualna_vaha);
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//////////////////////end////////////////////////////////////////////
}
