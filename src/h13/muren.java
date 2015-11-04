package h13;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class muren extends Applet
{
	int row, collum;
	Button baksteenKnop, betonKnop;
	boolean baksteenWaar, betonWaar;
	
	public void init()
	{
		baksteenWaar = false;
		betonWaar = false;
		
		setSize(500, 500);
		
		baksteenKnop = new Button("Baksteen muur");
		KnopListener kl = new KnopListener();		
		baksteenKnop.addActionListener(kl);
        
		betonKnop = new Button("Beton muur");
		TweedeKnopLister kl2 = new TweedeKnopLister();		
		betonKnop.addActionListener(kl2);
		
		add(baksteenKnop);
		add(betonKnop);
	}
	
	public void paint(Graphics kleuren)
	{
		if(baksteenWaar == true)
		{
			bakstenen(kleuren);
		}
		
		if(betonWaar == true)
		{
			beton(kleuren);
		}
	}
	
	public void bakstenen(Graphics kleuren)
	{
		kleuren.setColor(Color.red);
		
		for(row = 0; row <= 20; row++)
		{
			for(collum = 0; collum <= 20; collum++)
			{
				if (row % 2 == 0) 
				{
					kleuren.fillRect(53 * collum, 100 + 23 * row, 50, 20);
				}
				else
				{
					kleuren.fillRect(-25 + 53 * collum, 100 + 23 * row, 50, 20);
					
				}
			}
		}
	}
	
	public void beton(Graphics kleuren)
	{
		kleuren.setColor(Color.gray);
		
		for(row = 0; row <= 20; row++)
		{
			for(collum = 0; collum <= 20; collum++)
			{
				if (row % 2 == 0) 
				{
					kleuren.fillRect(63 * collum, 100 + 33 * row, 60, 30);
				}
				else
				{
					kleuren.fillRect(-30 + 63 * collum, 100 + 33 * row, 60, 30);
					
				}
			}
		}
	}
	
	public void redInputField()
	{
		baksteenWaar = true;
		betonWaar = false;
		repaint();
	}
	
	public void grayInputField()
	{
		betonWaar = true;
		baksteenWaar = false;
		repaint();
	}
	
	class KnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	redInputField();
        }		      	        	               
    }
	
	class TweedeKnopLister implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{	
	        	grayInputField();
		}	
	}
}