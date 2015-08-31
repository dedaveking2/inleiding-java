package h06;

import java.applet.*;
import java.awt.*;

public class Seconde extends Applet
{
	int seconde, minuut, uur, dag, week, jaar;
	
	public void init()
	{
		setSize(500, 500);
		seconde = 1;
		minuut = 60 * seconde;
		uur = 60 * minuut;
		dag = 24 * uur;
		week = 7 * dag;
		jaar = 52 * week;
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("Uur", 75, 50);
		kleuren.drawString("Dag", 73, 70);
		kleuren.drawString("Jaar", 72, 90);
		kleuren.drawLine(100, 30, 100, 100);
		kleuren.drawLine(50, 100, 300, 100);
		kleuren.drawString(uur + "           secondes", 110, 50);
		kleuren.drawString(dag + "         secondes", 110, 70);
		kleuren.drawString(jaar + "  secondes", 110, 90);
	}
} 

