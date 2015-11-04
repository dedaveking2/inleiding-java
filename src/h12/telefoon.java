package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class telefoon extends Applet
{
	TextField tekstvlak, tekstvlak2;
	Label label, label2;
	Button okeKnop;
	String[] schermtekst, schermtekst2;
	int teller, y;
	boolean alles;
	
	public void init()
	{
		y = 50;
		
		schermtekst = new String[10];
		schermtekst2 = new String[10];
		
		setSize(200, 200);
		
		label = new Label("naam");
		label2 = new Label("telefoon");
		
		tekstvlak = new TextField(20);
		tekstvlak2 = new TextField(20);
		
		okeKnop = new Button("Oke");
		KnopListener kl = new KnopListener();		
        okeKnop.addActionListener(kl);
		
		add(label);
		add(tekstvlak);
		add(label2);
		add(tekstvlak2);
		add(okeKnop);
	}
	
	public void paint(Graphics kleuren)
	{
		for (int i = 0; i < schermtekst.length; i++) 
		{
			if (teller == 10) 
			{
				kleuren.drawString("" + schermtekst[i], 100, y);
				kleuren.drawString("" + schermtekst2[i], 300, y);
				y = y + 10;
			}
		}
	}
	
	public void okeField()
	{
		teller++;
		schermtekst[(teller-1)] = "Naam: "+ tekstvlak.getText();
		schermtekst2[(teller-1)] = "Telefoonnummer: "+ tekstvlak2.getText();
		tekstvlak.setText("");
		tekstvlak2.setText("");
		tekstvlak.requestFocus();
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