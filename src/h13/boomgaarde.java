package h13;

import java.applet.*;
import java.awt.*;

public class boomgaarde extends Applet
{
	int row, collum;
	
	public void init()
	{
		setSize(1500, 900);
	}
	
	public void paint(Graphics kleuren)
	{
		for(row = 0; row < 5; row++)
		{
			for(collum = 0; collum < 3; collum++)
			{
				boom(kleuren, 50 + 300 * row, 25 + 300 * collum);
			}
		}
		
	}
	
	public void boom(Graphics kleuren, int x, int y)
	{
		kleuren.setColor(new Color(185, 75, 5));
		kleuren.fillRect(x, y, 30, 200);
		kleuren.setColor(Color.green);
		kleuren.fillOval(x - 35, y - 20, 100, 80);
	}
}