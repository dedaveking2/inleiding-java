package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TekstApplet extends Applet
{
	TextField tekstvlak;
	Label label;
	Button okeKnop, resetKnop;
	String schermtekst;
	
	public void init()
	{
		label = new Label("woorden poster");
		
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
		kleuren.drawString(schermtekst, 50, 120);	
	}
	
	public void okeField()
	{
    	schermtekst = tekstvlak.getText();
    	repaint();
	}

	public void resetField()
	{
		schermtekst = "";		
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