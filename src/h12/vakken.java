package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class vakken extends Applet 
{
	TextField[] tekstvlak;
	String[] unsorted;
	String[] sorted;
	int[] sort;
	int lo, teller;
	
	public void init() 
	{
		setSize(500, 500);
		
		tekstvlak = new TextField[5];
		unsorted = new String [tekstvlak.length];
		sorted = new String [tekstvlak.length];
		sort = new int [tekstvlak.length];
		
		for (teller = 0; teller < tekstvlak.length; teller++) 
		{
			tekstvlak[teller] = new TextField(5);
			add(tekstvlak[teller]);
			tekstvlak[teller].addActionListener(new InputListener());
		}
		
		for (teller = 0; teller < tekstvlak.length; teller++) 
		{
			unsorted[teller] = "";
			sorted[teller] = "";
		}
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		for (teller = 0; teller < tekstvlak.length; teller++) 
		{
			g.drawString(""+ unsorted[teller], x / 2 - ((tekstvlak.length / 2) - teller) * 50, y / 2 - 20);
			
			if (lo == tekstvlak.length) 
			{
				Arrays.sort(sort);
				sorted[teller] = "" + sort[teller];
				g.drawString(""+ sorted[teller], x / 2 - ((tekstvlak.length / 2) - teller) * 50, y / 2 + 20);
			}
		}
	}
	
	class InputListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			TextField src = (TextField)e.getSource();
			unsorted[lo] = ""+ Integer.parseInt(src.getText());
			sort[lo] = Integer.parseInt(src.getText());
			lo++;
			repaint();
		}
	}
}