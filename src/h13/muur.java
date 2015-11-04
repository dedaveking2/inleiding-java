package h13;

import java.applet.*;
import java.awt.*;

public class muur extends Applet
{
	int row, collum;
	
	public void init()
	{
		setSize(500, 500);
	}
	
	public void paint(Graphics kleuren)
	{
		muur(kleuren);
	}
	
	public  void muur(Graphics kleuren)
	{
		kleuren.setColor(Color.red);
		
		for(row = 0; row <= 20; row++)
		{
			for(collum = 0; collum <= 20; collum++)
			{
				if (row % 2 == 0) 
				{
					kleuren.fillRect(53 * collum, 23 * row, 50, 20);
				}
				else
				{
					kleuren.fillRect(-25 + 53 * collum, 23 * row, 50, 20);
					
				}
			}
		}
	}
}