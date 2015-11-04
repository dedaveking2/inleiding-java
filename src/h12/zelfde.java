package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class zelfde extends Applet
{
	TextField tekstvlak; 
	Button okeKnop;
	String schermtekst;
	int[] cijfers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 8, 8, 9, 9, 9, 9, 9, 10};
	int teller, getal, gelijk;
	
	public void init()
	{
		setSize(500, 500);
		
		schermtekst = "";
		
		tekstvlak = new TextField(20);
		
		okeKnop = new Button("Oke");
		KnopListener kl = new KnopListener();		
        okeKnop.addActionListener(kl);
        
        add(tekstvlak);
        add(okeKnop);
	}
	
	public void paint(Graphics g) 
	{
		g.drawString(""+ schermtekst, 50, 50);
	}
	
	public void okeField()
	{
		gelijk = Integer.parseInt(tekstvlak.getText());
		
		for (int i = 0; i < cijfers.length; i++) 
		{
			if (cijfers[i] == gelijk) 
			{
				teller++;
			}
		}
		
		if (teller > 0) 
		{
			schermtekst = "De waarde is "+ teller +" keer gevonden.";
		} 
		else 
		{
			schermtekst = "De waarde is niet gevonden.";
		}
		
		teller = 0;
		tekstvlak.setText("");
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