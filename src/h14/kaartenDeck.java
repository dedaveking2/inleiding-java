package h14;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;

public class kaartenDeck extends Applet
{
	String[] kleuren = {"Ruiten", "Klaver", "Harten", "Schoppen"};
	String[] kaarten = {"A", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht",  "negen", "tien", "J", "Q", "K"};
	String[] deck;
	String[] speler1;
	String[] speler2;
	String[] speler3;
	String[] speler4;
	int index, teller, teller2, teller3, teller4, teller5, hulpindex, random, x1, x2, x3, x4, y;
	
	
	public void init()
	{
		setSize(900, 500);
		
		x1 = 50;
		x2 = 250;
		x3 = 450;
		x4 = 650;
		y = 70;
		
		deck = new String[52];
		speler1 = new String[13];
		speler2 = new String[13];
		speler3 = new String[13];
		speler4 = new String[13];
		
		for(teller = 0; teller < kleuren.length; teller++)
		{
			String kleur = kleuren[teller];
			
			for(teller2 = 0; teller2 < kaarten.length; teller2++)
			{
				String kaart = kaarten[teller2];
				deck[index] = kleur + " " + kaart;
				index++;
			}
		}
		
		for(teller3 = 0; teller3 < 13; teller3++)
		{
			speler1[teller3] = deelkaart();
			speler2[teller3] = deelkaart();
			speler3[teller3] = deelkaart();
			speler4[teller3] = deelkaart();
		}
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("speler1: ", x1, y);
		kleuren.drawString("speler2: ", x2, y);
		kleuren.drawString("speler3: ", x3, y);
		kleuren.drawString("speler4: ", x4, y);
		
		y = 100;
		
		for(teller4 = 0; teller4 < 13; teller4++)
		{
			kleuren.drawString(speler1[teller4], x1, y);
			kleuren.drawString(speler2[teller4], x2, y);
			kleuren.drawString(speler3[teller4], x3, y);
			kleuren.drawString(speler4[teller4], x4, y);
			
			y += 20;
		}
	}
	
	public String deelkaart()
	{
		random = new Random().nextInt(deck.length);
		String kaart = deck[random];
		String[] hulplijst = new String[deck.length - 1]; // hier wordt steeds minder kaarten van je deck.
		hulpindex = 0;
		
		for(teller5 = 0; teller5 < deck.length; teller5++)
		{
			if(teller5 != random) //hier wordt elke keer 1 kaart verwijderd.
			{
				hulplijst[hulpindex] = deck[teller5];
				hulpindex++;
			}
		}
		deck = hulplijst; // hier wordt het hele lijst waar 1 eruit is gehaald weer terug gezet.
		return kaart;
	}
}
