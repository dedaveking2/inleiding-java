package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class array extends Applet
{
	TextField tekstvlak;
	Label label;
	Button okeKnop;
	int[] array;
	int teller, y, gemiddeld, getal, arrayInput;
	boolean invoer;
	
	public void init()
	{
		setSize(500, 500);
		array = new int[10];
		y = 50;
		invoer = false;
		
		tekstvlak = new TextField(20);
		label = new Label("Welke array?");
		
		okeKnop = new Button("Oke");
		KnopListener kl = new KnopListener();		
        okeKnop.addActionListener(kl);
        tekstvlak.addActionListener(kl);

		add(label);
		add(tekstvlak);
		add(okeKnop);
	}
	
	public void paint(Graphics kleuren)
	{
		if(invoer == true)
		{
			for(teller = 0; teller < array.length; teller++)
			{
				kleuren.drawString("" + array[teller], 30, y);
				gemiddeld = gemiddeld + teller;
				y = y + 10;
			}
			if(teller == 10)
			{
				gemiddeld = gemiddeld / 10;
				kleuren.drawString("gemiddeld: " + gemiddeld, 30, y + 20);
			}
		}
	}
	
	public void okeField()
	{
		String schermtekst = tekstvlak.getText();
		getal = Integer.parseInt(schermtekst);
		invoer = true;
		if(invoer == true)
		{
			for(teller = 0; teller < array.length; teller++)
			{
				array[teller] = getal*teller;
			}
		}
    	repaint();    	
	}
	
	class KnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	okeField();
        }	
	}
}