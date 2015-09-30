package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class groterDan extends Applet
{
	TextField tekstvlak;
	Label label;
	Button okeKnop;
	Button resetKnop;
	String schermtekst;
	String schermtekst2;
	double getal1, getal2, getal3, getal4;
	
	public void init()
	{
		tekstvlak = new TextField(20);
		label = new Label("groter dan");
		
		okeKnop = new Button("Oke");
		KnopListener kl = new KnopListener();		
        okeKnop.addActionListener(kl);
        tekstvlak.addActionListener(kl);
        
		resetKnop = new Button("Reset");
		TweedeKnopLister kl2 = new TweedeKnopLister();
		resetKnop.addActionListener(kl2);
		
		add(label);
		add(tekstvlak);
		add(okeKnop);
		add(resetKnop);
		schermtekst = "";
		schermtekst2 = "";
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("" + getal1, 50, 120);
		kleuren.drawString("" + getal2, 50, 140);
	}
	
	public void okeField()
	{
		schermtekst = tekstvlak.getText();
		getal3 = Double.parseDouble(schermtekst);
		
		if(getal3 > getal2)
		{
			getal1 = getal3;
			getal2 = getal1;
		}
	}
	
	public void laatsteField()
	{
		getal2 = Double.parseDouble(schermtekst);
		repaint();
	}

	public void resetField()
	{
		schermtekst = "";
		getal1 = 0;
		getal2 = 0;
		getal3 = 0;
		getal4 = 0;
        repaint();
	}
	
	class KnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	okeField();
        	laatsteField();
        }		      	        	               
    }
	
	class TweedeKnopLister implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{	
	        resetField();	
		}	
	} 
}