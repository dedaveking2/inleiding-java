package toets01;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class toets01 extends Applet
{
	Button frisKnop, wijnKnop, koffieKnop, binDistKnop, buitDistKnop, bestellingKnop;
	double frisGetal, wijnGetal, koffieGetal, binDistGetal, buitDistGetal, dagomzet, totaalBestelling, 
	dagomzetGemiddelde, bestellingGemiddelde;
	int frisAantal, wijnAantal, koffieAantal, binDistAantal, buitDistAantal, bestellingAantal, dagomzetAantal;
	
	public void init()
	{
		setSize(300, 300);
		
		frisKnop = new Button("Fris");
		KnopListener kl = new KnopListener();		
        frisKnop.addActionListener(kl);
        
		wijnKnop = new Button("Wijn");
		KnopListener2 kl2 = new KnopListener2();		
        wijnKnop.addActionListener(kl2);
        
		koffieKnop = new Button("Koffie");
		KnopListener3 kl3 = new KnopListener3();		
        koffieKnop.addActionListener(kl3);
        
		binDistKnop = new Button("BinDist");
		KnopListener4 kl4 = new KnopListener4();		
        binDistKnop.addActionListener(kl4);
        
		buitDistKnop = new Button("BuitDist");
		KnopListener5 kl5 = new KnopListener5();		
        buitDistKnop.addActionListener(kl5);
        
		bestellingKnop = new Button("nieuweBestelling");
		KnopListener6 kl6 = new KnopListener6();		
        bestellingKnop.addActionListener(kl6);
        
		add(frisKnop);
		add(wijnKnop);
		add(koffieKnop);
		add(binDistKnop);
		add(buitDistKnop);
		add(bestellingKnop);
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("Fris € " + frisGetal, 25, 80);
		kleuren.drawString("aantal" + frisAantal, 200, 80);
		kleuren.drawString("Wijn € " + wijnGetal, 25, 100);
		kleuren.drawString("aantal" + wijnAantal, 200, 100);
		kleuren.drawString("Koffie € " + koffieGetal, 25, 120);
		kleuren.drawString("aantal" + koffieAantal, 200, 120);
		kleuren.drawString("BinDist € " + binDistGetal, 25, 140);
		kleuren.drawString("aantal" + binDistAantal, 200, 140);
		kleuren.drawString("BuitDist € " + buitDistGetal, 25, 160);
		kleuren.drawString("aantal" + buitDistAantal, 200, 160);
		kleuren.drawString("Totaal bestelling € " + totaalBestelling, 25, 200);
		kleuren.drawString("aantal " + bestellingAantal, 200, 200);
		kleuren.drawString("Dagomzet € " + dagomzet, 25, 220);
		kleuren.drawString("aantal " + dagomzetAantal, 200, 220);
		kleuren.drawString("Gemiddelde bestelling € " + bestellingGemiddelde, 25, 260);
		kleuren.drawString("Gemiddelde dagomzet € " + dagomzetGemiddelde, 25, 280);
		kleuren.drawLine(190, 60, 190, 290);
		kleuren.drawLine(20, 175, 275, 175);
		kleuren.drawLine(20, 60, 275, 60);
		kleuren.drawLine(20, 240, 275, 240);
		kleuren.drawLine(20, 60, 20, 290);
		kleuren.drawLine(275, 60, 275, 240);
		kleuren.drawLine(20, 290, 190, 290);
	}
	
	public void frisField()
	{
		frisAantal ++;
		frisGetal = frisGetal + 2;
		bestellingAantal = frisAantal + wijnAantal + koffieAantal + binDistAantal + buitDistAantal;
		totaalBestelling = totaalBestelling + 2;
		bestellingGemiddelde = totaalBestelling / bestellingAantal;
		bestellingGemiddelde = bestellingGemiddelde * 100;
		bestellingGemiddelde = (int)bestellingGemiddelde;
		bestellingGemiddelde = (double)bestellingGemiddelde;
		bestellingGemiddelde = bestellingGemiddelde / 100;
		repaint();
	}
	
	public void wijnField()
	{
		wijnAantal ++;
		wijnGetal = wijnGetal + 2.50;
		bestellingAantal = frisAantal + wijnAantal + koffieAantal + binDistAantal + buitDistAantal;
		totaalBestelling = totaalBestelling + 2.50;
		bestellingGemiddelde = totaalBestelling / bestellingAantal;
		bestellingGemiddelde = totaalBestelling / bestellingAantal;
		bestellingGemiddelde = bestellingGemiddelde * 100;
		bestellingGemiddelde = (int)bestellingGemiddelde;
		bestellingGemiddelde = (double)bestellingGemiddelde;
		bestellingGemiddelde = bestellingGemiddelde / 100;
		repaint();
	}
	
	public void koffieField()
	{
		koffieAantal ++;
		koffieGetal = koffieGetal + 1.75;
		bestellingAantal = frisAantal + wijnAantal + koffieAantal + binDistAantal + buitDistAantal;
		totaalBestelling = totaalBestelling + 1.75;
		bestellingGemiddelde = totaalBestelling / bestellingAantal;
		bestellingGemiddelde = totaalBestelling / bestellingAantal;
		bestellingGemiddelde = bestellingGemiddelde * 100;
		bestellingGemiddelde = (int)bestellingGemiddelde;
		bestellingGemiddelde = (double)bestellingGemiddelde;
		bestellingGemiddelde = bestellingGemiddelde / 100;
		repaint();
	}
	
	public void binDistField()
	{
		binDistAantal ++;
		binDistGetal = binDistGetal + 2.75;
		bestellingAantal = frisAantal + wijnAantal + koffieAantal + binDistAantal + buitDistAantal;
		totaalBestelling = totaalBestelling + 2.75;
		bestellingGemiddelde = totaalBestelling / bestellingAantal;
		bestellingGemiddelde = totaalBestelling / bestellingAantal;
		bestellingGemiddelde = bestellingGemiddelde * 100;
		bestellingGemiddelde = (int)bestellingGemiddelde;
		bestellingGemiddelde = (double)bestellingGemiddelde;
		bestellingGemiddelde = bestellingGemiddelde / 100;
		repaint();
	}
	
	public void buitDistField()
	{
		buitDistAantal ++;
		buitDistGetal = buitDistGetal + 3.50;
		bestellingAantal = frisAantal + wijnAantal + koffieAantal + binDistAantal + buitDistAantal;
		totaalBestelling = totaalBestelling + 3.50;
		bestellingGemiddelde = totaalBestelling / bestellingAantal;
		bestellingGemiddelde = totaalBestelling / bestellingAantal;
		bestellingGemiddelde = bestellingGemiddelde * 100;
		bestellingGemiddelde = (int)bestellingGemiddelde;
		bestellingGemiddelde = (double)bestellingGemiddelde;
		bestellingGemiddelde = bestellingGemiddelde / 100;
		repaint();
	}
	
	public void nieuweBestellingField()
	{
		dagomzet = dagomzet + totaalBestelling;
		dagomzetAantal = dagomzetAantal + bestellingAantal;
		dagomzetGemiddelde = dagomzet / dagomzetAantal;
		dagomzetGemiddelde = dagomzetGemiddelde * 100;
		dagomzetGemiddelde = (int)dagomzetGemiddelde;
		dagomzetGemiddelde = (double)dagomzetGemiddelde;
		dagomzetGemiddelde = dagomzetGemiddelde / 100;
		bestellingGemiddelde = 0;
		bestellingAantal = 0;
		totaalBestelling = 0;
		frisAantal = 0;
		wijnAantal = 0;
		koffieAantal = 0;
		binDistAantal = 0;
		buitDistAantal = 0;
		repaint();
	}
	
	class KnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	frisField();
        }	
	}
	
	class KnopListener2 implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	wijnField();
        }	
	}
	
	class KnopListener3 implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	koffieField();
        }	
	}
	
	class KnopListener4 implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	binDistField();
        }	
	}
	
	class KnopListener5 implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	buitDistField();
        }	
	}
	
	class KnopListener6 implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	nieuweBestellingField();
        }	
	}
}