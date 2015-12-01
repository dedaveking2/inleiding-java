package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import javax.imageio.ImageIO;
import org.omg.CORBA.portable.InputStream;


public class smileyGame extends Applet 
{
	TextField tekstvlak;
	Label label;
	Button okeKnop;
	String schermtekst;
	double cijfer;
	Image afbeelding;
	int aantalSmileys, x, y;
	
	public void init()
	{
		setSize(500, 700);
		schermtekst = "";
		aantalSmileys = 23;
		x = 50;
		y = 70;
		
		label = new Label("Hoeveel smileys neem je (één, twee of drie)?");
		
		tekstvlak = new TextField(20);
		
		okeKnop = new Button("Oke");
		KnopListener kl = new KnopListener();
		okeKnop.addActionListener(kl);
		tekstvlak.addActionListener(kl);
		
		add(label);
		add(tekstvlak);
		add(okeKnop);
		
		try 
		{
			afbeelding = ImageIO.read(getClass().getResourceAsStream("index.png"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics kleuren)
	{
		for(int i = 0; i < aantalSmileys; i++)
		{
			kleuren.drawImage(afbeelding, x, y, 50, 50, this);
			x = x + 60;
			
			if(x > 240)
			{
				y = y + 60;
				x = 50;
			}
		}
	}
	
	public void okeField()
	{
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
