package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class tafelVan3 extends Applet 
{
	int nummer, tafel,tafelAantal, hoogte;
	boolean invoer;
	Button okeKnop, resetKnop;
	Label label;
	TextField tekstvlak;
	String schermtekst;
	
	  public void init() 
	  {
		  setSize(500, 500);
		  hoogte = 50;
		  tafelAantal = 1;
		  schermtekst = "";
		  invoer = false;
		  
		  label = new Label("welke tafel wilt u gebruiken?");
		  
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
	  }
	  
	  public void paint(Graphics kleur) 
	  {
		  while(invoer == true && tafelAantal <= 10)
			 {
			  	 kleur.drawString(tafel + " X " + tafelAantal + " = " + nummer, 30, hoogte);
				 tafelAantal ++;
				 nummer = tafel * tafelAantal;
				 hoogte = hoogte + 10;
			 }
	  }
	  
	  public void okeField()
	  {
  		  tafel = Integer.parseInt(tekstvlak.getText());
  		  nummer = tafel * tafelAantal;
  		  invoer = true;
  		  repaint();
	  }
	  
	  public void resetField()
	  {
		  nummer = 0;
		  tafel = 0;
		  tafelAantal = 1;
		  hoogte = 50;
		  invoer = false;
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