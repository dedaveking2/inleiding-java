package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class btw extends Applet
{
	TextField tekstvlak;
	Label label;
	Button okeKnop;
	double getal;
	
	public void init()
	{
		tekstvlak = new TextField(20);
		label = new Label("Bedrag + 19% BTW");
		
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
		kleuren.drawString("" + getal, 50, 120);	
	}
	
	public void okeField()
	{
		String schermtekst = tekstvlak.getText();
		getal = Double.parseDouble(schermtekst);
		getal = getal * 1.19;
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