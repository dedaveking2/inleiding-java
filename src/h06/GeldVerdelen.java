package h06;

import java.applet.*;
import java.awt.*;

public class GeldVerdelen extends Applet
{
	float aantalPersonen, totaalVoorElk, totaal;
	
	public void init()
	{
		setSize(500, 500);
		totaal = 113;
		aantalPersonen = 4;
		
		totaalVoorElk = totaal / aantalPersonen;
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("Jan", 75, 50);
		kleuren.drawString("Ali", 80, 70);
		kleuren.drawString("Jeannette", 40, 90);
		kleuren.drawString("Ik", 83, 110);
		kleuren.drawString("Totaal", 60, 130);
		kleuren.drawLine(100, 30, 100, 150);
		kleuren.drawLine(50, 115, 200, 115);
		kleuren.drawString("€ " + totaalVoorElk, 110, 50);
		kleuren.drawString("€ " + totaalVoorElk, 110, 70);
		kleuren.drawString("€ " + totaalVoorElk, 110, 90);
		kleuren.drawString("€ " + totaalVoorElk, 110, 110);
		kleuren.drawString("€ " + (int)totaal, 110, 130);
	}
}

