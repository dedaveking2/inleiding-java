package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class maandenJaren extends Applet
{
	TextField tekstvlak, tekstvlak2;
	Label label, label2;
	Button okeKnop;
	Button resetKnop;
	String schermtekst, schermtekst2, tekst, tekst2, tekst3;
	int maand, jaar;
	
	public void init()
	{
		label = new Label("Maanden");
		label2= new Label("Jaren");
		tekstvlak = new TextField(20);
		tekstvlak2 = new TextField(20);
		
		okeKnop = new Button("Oke");
		KnopListener kl = new KnopListener();		
        okeKnop.addActionListener(kl);
        tekstvlak.addActionListener(kl);
        tekstvlak2.addActionListener(kl);
        
		resetKnop = new Button("Reset");
		TweedeKnopLister kl2 = new TweedeKnopLister();
		resetKnop.addActionListener(kl2);
		
		add(label);
		add(tekstvlak);
		add(label2);
		add(tekstvlak2);
		add(okeKnop);
		add(resetKnop);
		schermtekst = "";
		schermtekst2 = "";
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString(tekst, 50, 160);
		kleuren.drawString(tekst2, 50, 180);
		kleuren.drawString(tekst3, 50, 200);
	}
	
	public void okeField()
	{
    	schermtekst = tekstvlak.getText();
    	schermtekst2 = tekstvlak2.getText();
    	jaar = Integer.parseInt(schermtekst2);
    	maand = Integer.parseInt(schermtekst);
        switch(maand) {
            case 1:
                tekst = "januari";
                tekst2 ="31";
                break;
            case 2:
                tekst = "februari";
                if((jaar % 4 == 0 && !(jaar % 100 == 0)) || 
                		jaar % 400 == 0)
                {
                	tekst2 = "29";
                	tekst3 = "Het is een schrikkel jaar";
                	
                }
                else
                {
                	tekst2 = "28";
                	tekst3 = "Het is geen schrikkel jaar";
                }
                break;
            case 3:
                tekst = "maart";
                tekst2 ="31";
                break;
            case 4:
                tekst = "april";
                tekst2 ="30";
                break;
            case 5:
                tekst = "mei";
                tekst2 ="31";
                break;
            case 6:
                tekst = "juni";
                tekst2 ="30";
                break;
            case 7:
                tekst = "juli";
                tekst2 ="31";
                break;
            case 8:
            	tekst = "augustus";
            	tekst2 ="31";
            	break;
            case 9:
            	tekst = "september";
            	tekst2 ="30";
            	break;
            case 10:
                tekst = "oktober";
                tekst2 ="31";
                break;
            case 11:
                tekst = "november";
                tekst2 ="30";
                break;
            case 12:
                tekst = "december";
                tekst2 ="31";
                break;
            default:
                tekst = "Dat is geen maand.";
                break;
        }
    	repaint();
	}

	public void resetField()
	{
		tekst = "";
		tekst2 = "";
		tekst3 = "";
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