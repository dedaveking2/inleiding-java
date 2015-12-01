package toets02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import java.net.*;

public class Casino extends Applet
{
	String[] images = {"fruit_1.jpg","fruit_2.jpg","fruit_3.jpg","fruit_4.jpg","fruit_5.jpg","fruit_6.jpg","fruit_7.jpg",
			 "fruit_8.jpg","fruit_9.jpg","fruit_10.jpg","fruit_11.jpg","fruit_12.jpg","fruit_13.jpg","fruit_14.jpg",
			 "fruit_15.jpg","fruit_16.jpg","fruit_17.jpg","fruit_18.jpg","fruit_19.jpg","fruit_20.jpg",};
	String gewonnen;
	Button speelButton, moneyButton;
	int credietpunten, randomUitkomst1, randomUitkomst2, randomUitkomst3;
	double random1, random2, random3;
	Image fruit1, fruit2, fruit3;
	boolean beginPlaatjesCheck;
	AudioClip sound;
	URL pad;
	
	public void init()
	{
		setSize(300, 500);
		credietpunten = 10;
		beginPlaatjesCheck = false;
		gewonnen = "";
		pad = getCodeBase();
		
		speelButton = new Button("Speel");
		KnopListener kl = new KnopListener();		
		speelButton.addActionListener(kl);
		
		moneyButton = new Button("Koop 10 kredietpunten");
		tweedeKnopListener kl2 = new tweedeKnopListener();		
		moneyButton.addActionListener(kl2);
		moneyButton.setEnabled(false);
		
		add(speelButton);
		add(moneyButton);
		
		sound = getAudioClip(getDocumentBase(), "AIRPORN.wav");
	}
	
	public void paint(Graphics kleuren)
	{
		fruit1 = getImage(pad, "toets02/" + images[randomUitkomst1]);
		fruit2 = getImage(pad, "toets02/" + images[randomUitkomst2]);
		fruit3 = getImage(pad, "toets02/" + images[randomUitkomst3]);
		
		kleuren.drawString("credietpunten: " + credietpunten, 50, 300);
		kleuren.drawString(gewonnen, 50, 330);
		kleuren.drawImage(fruit1, 50, 100, 50, 150, this);	
	    kleuren.drawImage(fruit2, 110, 100, 50, 150, this);
	    kleuren.drawImage(fruit3, 170, 100, 50, 150, this);
	}
	
	public void speelField()
	{
		if(credietpunten > 0)
		{
			beginPlaatjesCheck = true;
			credietpunten = credietpunten - 1;
			
			random1 = Math.random();
			randomUitkomst1 = (int)(random1 * 20);
		
			random2 = Math.random();
			randomUitkomst2 = (int)(random2 * 20);
		
			random3 = Math.random();
			randomUitkomst3 = (int)(random3 * 20);
			
			if(credietpunten == 0)
			{
				moneyButton.setEnabled(true);
				speelButton.setEnabled(false);
			}
			
			if(randomUitkomst1 == randomUitkomst2)
			{
				credietpunten = credietpunten + 4;
				gewonnen = "Je hebt 4 punten gewonnen!";
				sound.play();
			}
			
			else if(randomUitkomst1 == randomUitkomst3)
			{
				credietpunten = credietpunten + 4;
				gewonnen = "Je hebt 4 punten gewonnen!";
				sound.play();
			}
			
			else if(randomUitkomst2 == randomUitkomst3)
			{
				credietpunten = credietpunten + 4;
				gewonnen = "Je hebt 4 punten gewonnen!";
				sound.play();
			}
			
			else if(randomUitkomst1 == randomUitkomst2 && randomUitkomst1 == randomUitkomst3)
			{
				credietpunten = credietpunten + 20;
				gewonnen = "Je hebt 20 punten gewonnen!";
				sound.play();
			}
			else
			{
				gewonnen = "";
			}
		
			repaint();
		}
	}
	
	public void moneyField()
	{
			credietpunten = 10;
			moneyButton.setEnabled(false);
			speelButton.setEnabled(true);
			repaint();
	}
	
	class KnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	speelField();
        }		      	        	               
    }
	
	class tweedeKnopListener implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
        {
        	moneyField();
        }		      	        	               
    }
}