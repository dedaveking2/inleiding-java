package toets01h;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class fooi extends Applet
{
	TextField tekstvlak;
	Label label;
	Button okeKnop, resetKnop, fooiMeer, fooiMinder;
	String schermtekst;
	int fooiProcent;
	double totaal, totaalFooi;
	
	public void init()
	{
		fooiProcent = 15;
		
		label = new Label("Fooi uitrekenen");
		
		tekstvlak = new TextField(20);
		
		okeKnop = new Button("Oke");
		KnopListener kl = new KnopListener();		
        okeKnop.addActionListener(kl);
        tekstvlak.addActionListener(kl);
        
		resetKnop = new Button("Reset");
		TweedeKnopLister kl2 = new TweedeKnopLister();
		resetKnop.addActionListener(kl2);
		
		fooiMeer = new Button("fooi +1%");
		DerdeKnopLister kl3 = new DerdeKnopLister();
		fooiMeer.addActionListener(kl3);
		
		fooiMinder = new Button("fooi -1%");
		VierdeKnopLister kl4 = new VierdeKnopLister();
		fooiMinder.addActionListener(kl4);
		
		add(label);
		add(tekstvlak);
		add(resetKnop);
		add(fooiMeer);
		add(fooiMinder);
		schermtekst = "";
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("je totaal is €" + totaal, 50, 140);
		kleuren.drawString(fooiProcent + "%", 50, 155);
		kleuren.drawString("€" + totaalFooi, 50, 170);
	}
	
	public void okeField()
	{
    	schermtekst = tekstvlak.getText();
    	totaal = Double.parseDouble(schermtekst);
    	totaalFooi = (totaal / 100) * fooiProcent;
    	totaalFooi = totaalFooi * 100;
    	totaalFooi = (int)totaalFooi;
    	totaalFooi = (double)totaalFooi;
    	totaalFooi = totaalFooi / 100;
    	totaal = totaal + totaalFooi;
    	repaint();
    	
	}

	public void resetField()
	{
		schermtekst = "";
		fooiProcent = 15;
		totaal = 0;
		totaalFooi = 0;
        repaint();
	}
	
	public void meerField()
	{
		fooiProcent = fooiProcent + 1;
		repaint();
	}
	
	public void minderField()
	{
		fooiProcent = fooiProcent - 1;
		repaint();
	}
	
	class KnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	okeField();
        }		      	        	               
    }
	
	class TweedeKnopLister implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{	
	        resetField();	
		}	
	}
	
	class DerdeKnopLister implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{	
	        meerField();	
		}	
	}
	
	class VierdeKnopLister implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{	
	        minderField();	
		}	
	}
}