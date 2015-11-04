package h13;

import java.applet.*;
import java.awt.*;

public class driehoek extends Applet
{
	public void init()
	{
		setSize(500, 500);
	}
	
	public void paint(Graphics kleuren)
	{
		tekenDriehoek(kleuren, 100, 50, 50, 150, 150, 150);
	}
	
	public  void tekenDriehoek(Graphics kleuren, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		kleuren.drawLine(x1, y1, x2, y2);
		kleuren.drawLine(x2, y2, x3, y3);
		kleuren.drawLine(x3, y2, x1, y1);
	}
}