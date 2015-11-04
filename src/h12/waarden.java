package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class waarden extends Applet 
{
	TextField tekstvlak;
    boolean gevonden, invoer;
    double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 }; 
    double gezocht;
    Button okeKnop;
    String schermtekst;
    int teller;
	
    public void init() 
    {
        gevonden = false;
        invoer = false;
        teller = 0;
       
        
        tekstvlak = new TextField(20);
        
        okeKnop = new Button("Oke");
		KnopListener kl = new KnopListener();		
        okeKnop.addActionListener(kl);
        
        add(tekstvlak);
        add(okeKnop);
        schermtekst = "";
    }

    public void paint(Graphics g) 
    {
    	if(invoer == true)
    	{
    		if(gevonden == true) 
            {
                g.drawString("De waarde is gevonden.", 20, 80);
            }
            else 
            {
                g.drawString("De waarde is niet gevonden.", 20, 80);
            }
    	}
    }
    
    public void okeField()
	{
    	schermtekst = tekstvlak.getText();
    	gezocht = Double.parseDouble(schermtekst);
    	
    	 while(teller < salaris.length) 
         {
             if(salaris[teller] == gezocht) 
             {
                 gevonden = true;
             }
             teller ++;
         }
    	 
    	invoer = true;
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