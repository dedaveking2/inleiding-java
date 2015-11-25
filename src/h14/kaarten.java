package h14;

import java.awt.*;
import java.applet.*;

public class kaarten extends Applet
{
	double kleurRandom, kaartRandom;
    int kleurPick, kaartPick;
    String kleur, kaart;
    
	public void init()
	{
		kleurRandom = Math.random();
		kleurPick = (int)(kleurRandom * 4 + 1);
		
		kaartRandom = Math.random();
		kaartPick = (int)(kaartRandom * 13 + 1);
		
		 switch (kleurPick) 
		 {
         case 1:  kleur = "schoppen";
                  break;
         case 2:  kleur = "harten";
                  break;
         case 3:  kleur = "ruiten";
                  break;
         case 4:  kleur = "klaveren";
                  break;
		 }
		 
		 switch (kaartPick) 
		 {
         case 1:  kaart = "A";
                  break;
         case 2:  kaart = "2";
                  break;
         case 3:  kaart = "3";
                  break;
         case 4:  kaart = "4";
                  break;
         case 5:  kaart = "5";
         		  break;
         case 6:  kaart = "6";
         		  break;
         case 7:  kaart = "7";
         		  break;
         case 8:  kaart = "8";
         		  break;
         case 9:  kaart = "8";
         		  break;
         case 10: kaart = "10";
         		  break;
         case 11: kaart = "J";
         		  break;
         case 12: kaart = "Q";
         		  break;
         case 13: kaart = "K";
         		  break;
		 }
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString(kleur + ", " + kaart, 50, 60 );
	}
}
