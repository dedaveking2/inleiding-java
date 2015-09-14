package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class geslachtTeller extends Applet
{
	Button manKnop, vrouwKnop, jongeKnop, meisjeKnop;
	int manGetal, vrouwGetal, jongeGetal, meisjeGetal;
	
	public void init()
	{
		setSize(300, 200);
		
		manKnop = new Button("Man");
		KnopListener kl = new KnopListener();		
        manKnop.addActionListener(kl);
        
		vrouwKnop = new Button("Vrouw");
		KnopListener2 kl2 = new KnopListener2();		
        vrouwKnop.addActionListener(kl2);
        
		jongeKnop = new Button("Jonge");
		KnopListener3 kl3 = new KnopListener3();		
        jongeKnop.addActionListener(kl3);
        
		meisjeKnop = new Button("Meisje");
		KnopListener4 kl4 = new KnopListener4();		
        meisjeKnop.addActionListener(kl4);
        
		add(manKnop);
		add(vrouwKnop);
		add(jongeKnop);
		add(meisjeKnop);
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("man " + manGetal, 25, 120);
		kleuren.drawString("vrouw " + vrouwGetal, 100, 120);	
		kleuren.drawString("jonge " + jongeGetal, 175, 120);	
		kleuren.drawString("meisje " + meisjeGetal, 250, 120);
	}
	
	public void manField()
	{
		manGetal ++;
		repaint();
	}
	
	public void vrouwField()
	{
		vrouwGetal ++;
		repaint();
	}
	
	public void jongeField()
	{
		jongeGetal ++;
		repaint();
	}
	
	public void meisjeField()
	{
		meisjeGetal ++;
		repaint();
	}
	
	class KnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	manField();
        }	
	}
	
	class KnopListener2 implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	vrouwField();
        }	
	}
	
	class KnopListener3 implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	jongeField();
        }	
	}
	
	class KnopListener4 implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	meisjeField();
        }	
	}
}