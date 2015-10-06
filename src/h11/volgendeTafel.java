package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class volgendeTafel extends Applet 
{
	int nummer, tafel,tafelAantal, hoogte;
	boolean invoer;
	Button okeKnop, resetKnop;
	Label label;
	String schermtekst;
	
	  public void init() 
	  {
		  setSize(500, 500);
		  hoogte = 50;
		  tafelAantal = 1;
		  tafel = 1;
		  schermtekst = "";
		  invoer = false;
		  
		  okeKnop = new Button("Volgende");
		  KnopListener kl = new KnopListener();		
	      okeKnop.addActionListener(kl);
	      
	      resetKnop = new Button("Reset");
	      TweedeKnopLister kl2 = new TweedeKnopLister();
	      resetKnop.addActionListener(kl2);
	      
		  add(okeKnop);
		  add(resetKnop);
	  }
	  
	  public void paint(Graphics kleur) 
	  {
		  while(invoer == true && tafelAantal <= 11)
			 {
			  	 kleur.drawString(tafel + " X " + tafelAantal + " = " + nummer, 30, hoogte);
				 tafelAantal ++;
				 nummer = tafel * tafelAantal;
				 hoogte = hoogte + 10;
				 
				 if(tafelAantal == 11)
					{
						invoer = false;
						tafelAantal = 1;
						tafel = tafel + 1;
						hoogte = 50;
					}
				 
		  		  if(tafel > 10)
		  		  {
		  			  tafel = 1;
		  		  }
			 }
	  }
	  
	  public void okeField()
	  {
  		  nummer = tafel * tafelAantal;
  		  invoer = true;
  		  repaint(); 
	  }
	  
	  public void resetField()
	  {
		  nummer = 0;
		  tafel = 1;
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
		/** if(tafelAantal >= 10)
		{
			invoer = false;
			tafel = tafel + 1;
		} */
}