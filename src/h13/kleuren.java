package h13;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class kleuren extends Applet
{
	TextField tekstvlak;
	Label label;
	Button knop1, knop2, knop3, knop4, knop5 ;
	String schermtekst;
	
	public void init()
	{
		label = new Label("kleuren");
		
		knop1 = new Button("1");
		KnopListener kl = new KnopListener();		
        knop1.addActionListener(kl);
        
        knop2 = new Button("2");
		TweedeKnopLister kl2 = new TweedeKnopLister();		
		knop2.addActionListener(kl2);
        
		knop3 = new Button("3");
		DerdeKnopListener kl3 = new DerdeKnopListener();		
		knop3.addActionListener(kl3);
        
		knop4 = new Button("4");
		VierdeKnopListener kl4 = new VierdeKnopListener();		
		knop4.addActionListener(kl4);
        
		knop5 = new Button("5");
		VijfdeKnopListener kl5 = new VijfdeKnopListener();		
		knop5.addActionListener(kl5);
		
		add(label);
		add(knop1);
		add(knop2);
		add(knop3);
		add(knop4);
		add(knop5);
		schermtekst = "";
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString(schermtekst, 50, 120);	
	}
	
	public void eersteField()
	{
		setBackground(Color.blue); 
    	schermtekst = "blauw";
    	repaint();
	}

	public void tweedeField()
	{
		setBackground(Color.yellow); 
		schermtekst = "geel";		
        repaint();
	}
	
	public void derdeField()
	{
		setBackground(Color.green); 
		schermtekst = "groen";
    	repaint();
	}
	
	public void vierdeField()
	{
		setBackground(Color.white); 
		schermtekst = "wit";
    	repaint();
	}
	
	public void vijfdeField()
	{
		setBackground(Color.orange); 
		schermtekst = "oranje";
    	repaint();
	}
	
	class KnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	eersteField();
        }		      	        	               
    }
	
	class TweedeKnopLister implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{	
	        tweedeField();	
		}	
	}
	
	class DerdeKnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	derdeField();
        }		      	        	               
    }
	
	class VierdeKnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	vierdeField();
        }		      	        	               
    }
	
	class VijfdeKnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	vijfdeField();
        }		      	        	               
    }
}