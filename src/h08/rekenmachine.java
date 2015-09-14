package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class rekenmachine extends Applet
{
	TextField tekstvlak, tekstvlak2;
	Label label;
	Button keerKnop, deelKnop, plusKnop, minKnop;
	double totaal, totaal1, totaal2;
	
	public void init()
	{
		setSize(500, 200);
		tekstvlak = new TextField(15);
		tekstvlak2 = new TextField(15);
		
		keerKnop = new Button("*");
		KnopListener kl = new KnopListener();		
		keerKnop.addActionListener(kl);
		
		deelKnop = new Button("/");
		KnopListener2 kl2 = new KnopListener2();		
		deelKnop.addActionListener(kl2);
		
		plusKnop = new Button("+");
		KnopListener3 kl3 = new KnopListener3();		
		plusKnop.addActionListener(kl3);
		
		minKnop = new Button("-");
		KnopListener4 kl4 = new KnopListener4();		
		minKnop.addActionListener(kl4);

		add(tekstvlak);
        add(tekstvlak2);
		add(keerKnop);
		add(deelKnop);
		add(plusKnop);
		add(minKnop);
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("" + totaal, 50, 120);	
	}
	
	public void keerField()
	{
		String schermtekst = tekstvlak.getText();
		String schermtekst2 = tekstvlak2.getText();
		totaal1 = Double.parseDouble(schermtekst);
		totaal2 = Double.parseDouble(schermtekst2);
		totaal = totaal1 * totaal2;
    	repaint();
    	
	}
	
	public void deelField()
	{
		String schermtekst = tekstvlak.getText();
		String schermtekst2 = tekstvlak2.getText();
		totaal1 = Double.parseDouble(schermtekst);
		totaal2 = Double.parseDouble(schermtekst2);
		totaal = totaal1 / totaal2;
    	repaint();
	}
	
	public void plusField()
	{
		String schermtekst = tekstvlak.getText();
		String schermtekst2 = tekstvlak2.getText();
		totaal1 = Double.parseDouble(schermtekst);
		totaal2 = Double.parseDouble(schermtekst2);
		totaal = totaal1 + totaal2;
    	repaint();
	}
	
	public void minField()
	{
		String schermtekst = tekstvlak.getText();
		String schermtekst2 = tekstvlak2.getText();
		totaal1 = Double.parseDouble(schermtekst);
		totaal2 = Double.parseDouble(schermtekst2);
		totaal = totaal1 - totaal2;
    	repaint();
	}
	
	class KnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	keerField();
        }	
	}
	
	class KnopListener2 implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	deelField();
        }	
	}
	
	class KnopListener3 implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	plusField();
        }	
	}
	
	class KnopListener4 implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	minField();
        }	
	}
}