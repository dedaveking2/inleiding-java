package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class geslaagd extends Applet
{
	TextField tekstvlak;
	Label label;
	Button okeKnop, resetKnop, invoerKnop;
	String schermtekst, geslaagd, beoordeling;
	double cijfer, cijfer2, cijfer3;
	int aantal;
	boolean invoer;
	
	public void init()
	{
		invoer = false;
		schermtekst = "";
		geslaagd = "";
		beoordeling = "";
		
		label = new Label("Geslaagd of niet?");
		
		tekstvlak = new TextField(20);
		
		okeKnop = new Button("Oke");
		KnopListener kl = new KnopListener();		
        okeKnop.addActionListener(kl);
        
		resetKnop = new Button("Reset");
		TweedeKnopLister kl2 = new TweedeKnopLister();
		resetKnop.addActionListener(kl2);
		
		invoerKnop = new Button("Alles invoeren");
		DerdeKnopListener kl3 = new DerdeKnopListener();
		invoerKnop.addActionListener(kl3);
		
		add(label);
		add(tekstvlak);
		add(okeKnop);
		add(invoerKnop);
		add(resetKnop);
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("gemiddelde: " + cijfer3, 50, 120);	
		kleuren.drawString("Aantal cijfers: " + aantal, 50, 140);
		kleuren.drawString("" + geslaagd, 50, 160);
		kleuren.drawString("" + beoordeling, 50, 180);
	}
	
	public void okeField()
	{
    	if(invoer != true)
    	{
    		schermtekst = tekstvlak.getText();
    		cijfer = Double.parseDouble(schermtekst);
    		if(cijfer > 10)
    		{
    			cijfer = 0;
    		}
    		else
    		{
    			cijfer2 = cijfer2 + cijfer;
        		aantal ++;
        		repaint();
    		}
    	}
	}

	public void resetField()
	{
		schermtekst = "";
		cijfer = 0;
		cijfer2 = 0;
		cijfer3 = 0;
		aantal = 0;
		invoer = false;
        repaint();
	}
	
	public void invoerField()
	{
		invoer = true;
		cijfer2 = cijfer2 / aantal;
		cijfer2 = cijfer2 * 10;
		cijfer2 = (int)cijfer2;
		cijfer2 = (double)cijfer2;
		cijfer2 = cijfer2 /10;
		cijfer3 = cijfer2;
		
		if(cijfer3 >= 5.5)
		{
			geslaagd = "Je bent geslaagd";
		}
		else
		{
			geslaagd = "Je bent niet geslaagd";
		}
		
		if(cijfer3 < 4)
		{
			beoordeling = "Je hebt het slecht gedaan";
		}
		
		if(cijfer3 < 5 && cijfer3 >= 4)
		{
			beoordeling = "Je hebt het onvoldoende gedaan";
		}
		
		if(cijfer3 < 6 && cijfer3 >= 5)
		{
			beoordeling = "Je hebt het matig gedaan";
		}
		
		if(cijfer3 < 8 && cijfer3 >= 6)
		{
			beoordeling = "Je hebt het voldoende gedaan";
		}
		
		if(cijfer3 >= 8)
		{
			beoordeling = "Je hebt het goed gedaan";
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
	
	class TweedeKnopLister implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{	
	        resetField();	
		}	
	}
	
	class DerdeKnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	invoerField();
        }		      	        	               
    }
}