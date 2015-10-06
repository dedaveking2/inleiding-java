package toets01h;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class tijden extends Applet
{
	TextField tekstvlak;
	Label label;
	Button okeKnop, resetKnop;
	String schermtekst;
	int tijd, londen, newYork, tokyo, sydney;
	
	public void init()
	{
		setSize(300, 300);
		tijd = -1;
		
		label = new Label("Hoe laat is het hier");
		
		tekstvlak = new TextField(20);
		
		okeKnop = new Button("Oke");
		KnopListener kl = new KnopListener();		
        okeKnop.addActionListener(kl);
        
		resetKnop = new Button("Reset");
		TweedeKnopLister kl2 = new TweedeKnopLister();
		resetKnop.addActionListener(kl2);
		
		add(label);
		add(tekstvlak);
		add(okeKnop);
		add(resetKnop);
		schermtekst = "";
	}
	
	public void paint(Graphics kleuren)
	{
		if(tijd > -1 && tijd < 24)
		{
		kleuren.drawString("Hier is het: " + tijd, 50, 120);
		kleuren.drawString("Londen: " + londen, 50, 140);
		kleuren.drawString("New york: " + newYork, 50, 160);
		kleuren.drawString("tokyo: " + tokyo, 50, 180);
		kleuren.drawString("Sydney: " + sydney, 50, 200);
		}
		else
		{
			resetField();
		}
	}
	
	public void okeField()
	{
    	schermtekst = tekstvlak.getText();
    	tijd = Integer.parseInt(schermtekst);
    	londen = tijd - 1;
    	newYork = tijd - 6;
    	tokyo = tijd + 8;
    	sydney = tijd + 9;
    	
    	if(londen >= 24)
    	{
    		londen = londen - 24;
    	}
    	
    	if(newYork >= 24)
    	{
    		newYork = newYork - 24;
    	}
    	
    	if(tokyo >= 24)
    	{
    		tokyo = tokyo - 24;
    	}
    	
    	if(sydney >= 24)
    	{
    		sydney = sydney - 24;
    	}
    	
    	if(londen < 0)
    	{
    		londen = londen + 24;
    	}
    	
    	if(newYork < 0)
    	{
    		newYork = newYork + 24;
    	}
    	
    	if(tokyo < 0)
    	{
    		tokyo = tokyo + 24;
    	}
    	
    	if(sydney < 0)
    	{
    		sydney = sydney + 24;
    	}
    	
    	repaint();
    	
	}

	public void resetField()
	{
		schermtekst = "";
		tijd = -1;
		londen = 0;
		newYork = 0;
		tokyo = 0;
		sydney = 0;
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
}