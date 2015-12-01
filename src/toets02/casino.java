package toets02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.applet.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class casino extends Applet
{
	String gewonnen;
	Button speelButton, moneyButton;
	int credietpunten, randomUitkomst1, randomUitkomst2, randomUitkomst3;
	double random1, random2, random3;
	Image fruit1, fruit2, fruit3, fruit4, fruit5, fruit6, fruit7, fruit8, fruit9, fruit10, 
	fruit11, fruit12, fruit13, fruit14, fruit15, fruit16, fruit17, fruit18, fruit19, fruit20;
	boolean beginPlaatjesCheck;
	AudioClip sound;
	
	public void init()
	{
		setSize(300, 500);
		credietpunten = 10;
		beginPlaatjesCheck = false;
		gewonnen = "";
		
		speelButton = new Button("Speel");
		KnopListener kl = new KnopListener();		
		speelButton.addActionListener(kl);
		
		moneyButton = new Button("Koop 10 kredietpunten");
		tweedeKnopListener kl2 = new tweedeKnopListener();		
		moneyButton.addActionListener(kl2);
		moneyButton.setEnabled(false);
		
		add(speelButton);
		add(moneyButton);
		
		random1 = Math.random();
		randomUitkomst1 = (int)(random1 * 20 + 1);
		
		random2 = Math.random();
		randomUitkomst2 = (int)(random2 * 20 + 1);
		
		random3 = Math.random();
		randomUitkomst3 = (int)(random3 * 20 + 1);
		
		try 
		{
			fruit1 = ImageIO.read(getClass().getResourceAsStream("fruit_1.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit2 = ImageIO.read(getClass().getResourceAsStream("fruit_2.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit3 = ImageIO.read(getClass().getResourceAsStream("fruit_3.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit4 = ImageIO.read(getClass().getResourceAsStream("fruit_4.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit5 = ImageIO.read(getClass().getResourceAsStream("fruit_5.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit6 = ImageIO.read(getClass().getResourceAsStream("fruit_6.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit7 = ImageIO.read(getClass().getResourceAsStream("fruit_7.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit8 = ImageIO.read(getClass().getResourceAsStream("fruit_8.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit9 = ImageIO.read(getClass().getResourceAsStream("fruit_9.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit10 = ImageIO.read(getClass().getResourceAsStream("fruit_10.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit11 = ImageIO.read(getClass().getResourceAsStream("fruit_11.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit12 = ImageIO.read(getClass().getResourceAsStream("fruit_12.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit13 = ImageIO.read(getClass().getResourceAsStream("fruit_13.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit14 = ImageIO.read(getClass().getResourceAsStream("fruit_14.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit15 = ImageIO.read(getClass().getResourceAsStream("fruit_15.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit16 = ImageIO.read(getClass().getResourceAsStream("fruit_16.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit17 = ImageIO.read(getClass().getResourceAsStream("fruit_17.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit18 = ImageIO.read(getClass().getResourceAsStream("fruit_18.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit19 = ImageIO.read(getClass().getResourceAsStream("fruit_19.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		try 
		{
			fruit20 = ImageIO.read(getClass().getResourceAsStream("fruit_20.jpg"));
		} 
		catch(IOException e) { e.printStackTrace(); }
		
		sound = getAudioClip(getDocumentBase(), "AIRPORN.wav");
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("credietpunten: " + credietpunten, 50, 300);
		kleuren.drawString(gewonnen, 50, 330);
		
		if(beginPlaatjesCheck == false)
		{
			kleuren.drawImage(fruit1, 50, 100, 50, 150, this);
			kleuren.drawImage(fruit2, 110, 100, 50, 150, this);
			kleuren.drawImage(fruit3, 170, 100, 50, 150, this);
		}
		else
		{
			switch(randomUitkomst1)
			{
				case 1:  kleuren.drawImage(fruit1, 50, 100, 50, 150, this);
				break;
				case 2:  kleuren.drawImage(fruit2, 50, 100, 50, 150, this);
				break;
				case 3:  kleuren.drawImage(fruit3, 50, 100, 50, 150, this);
				break;
				case 4:  kleuren.drawImage(fruit4, 50, 100, 50, 150, this);
				break;
				case 5:  kleuren.drawImage(fruit5, 50, 100, 50, 150, this);
				break;
				case 6:  kleuren.drawImage(fruit6, 50, 100, 50, 150, this);
				break;
				case 7:  kleuren.drawImage(fruit7, 50, 100, 50, 150, this);
				break;
				case 8:  kleuren.drawImage(fruit8, 50, 100, 50, 150, this);
				break;
				case 9:  kleuren.drawImage(fruit9, 50, 100, 50, 150, this);
				break;
				case 10:  kleuren.drawImage(fruit10, 50, 100, 50, 150, this);
				break;
				case 11:  kleuren.drawImage(fruit11, 50, 100, 50, 150, this);
				break;
				case 12:  kleuren.drawImage(fruit12, 50, 100, 50, 150, this);
				break;
				case 13:  kleuren.drawImage(fruit13, 50, 100, 50, 150, this);
				break;
				case 14:  kleuren.drawImage(fruit14, 50, 100, 50, 150, this);
				break;
				case 15:  kleuren.drawImage(fruit15, 50, 100, 50, 150, this);
				break;
				case 16:  kleuren.drawImage(fruit16, 50, 100, 50, 150, this);
				break;
				case 17:  kleuren.drawImage(fruit17, 50, 100, 50, 150, this);
				break;
				case 18:  kleuren.drawImage(fruit18, 50, 100, 50, 150, this);
				break;
				case 19:  kleuren.drawImage(fruit19, 50, 100, 50, 150, this);
				break;
				case 20:  kleuren.drawImage(fruit20, 50, 100, 50, 150, this);
				break;
			}
			
			switch(randomUitkomst2)
			{
				case 1:  kleuren.drawImage(fruit1, 110, 100, 50, 150, this);
				break;
				case 2:  kleuren.drawImage(fruit2, 110, 100, 50, 150, this);
				break;
				case 3:  kleuren.drawImage(fruit3, 110, 100, 50, 150, this);
				break;
				case 4:  kleuren.drawImage(fruit4, 110, 100, 50, 150, this);
				break;
				case 5:  kleuren.drawImage(fruit5, 110, 100, 50, 150, this);
				break;
				case 6:  kleuren.drawImage(fruit6, 110, 100, 50, 150, this);
				break;
				case 7:  kleuren.drawImage(fruit7, 110, 100, 50, 150, this);
				break;
				case 8:  kleuren.drawImage(fruit8, 110, 100, 50, 150, this);
				break;
				case 9:  kleuren.drawImage(fruit9, 110, 100, 50, 150, this);
				break;
				case 10:  kleuren.drawImage(fruit10, 110, 100, 50, 150, this);
				break;
				case 11:  kleuren.drawImage(fruit11, 110, 100, 50, 150, this);
				break;
				case 12:  kleuren.drawImage(fruit12, 110, 100, 50, 150, this);
				break;
				case 13:  kleuren.drawImage(fruit13, 110, 100, 50, 150, this);
				break;
				case 14:  kleuren.drawImage(fruit14, 110, 100, 50, 150, this);
				break;
				case 15:  kleuren.drawImage(fruit15, 110, 100, 50, 150, this);
				break;
				case 16:  kleuren.drawImage(fruit16, 110, 100, 50, 150, this);
				break;
				case 17:  kleuren.drawImage(fruit17, 110, 100, 50, 150, this);
				break;
				case 18:  kleuren.drawImage(fruit18, 110, 100, 50, 150, this);
				break;
				case 19:  kleuren.drawImage(fruit19, 110, 100, 50, 150, this);
				break;
				case 20:  kleuren.drawImage(fruit20, 110, 100, 50, 150, this);
				break;
			}
			
			switch(randomUitkomst3)
			{
				case 1:  kleuren.drawImage(fruit1, 170, 100, 50, 150, this);
				break;
				case 2:  kleuren.drawImage(fruit2, 170, 100, 50, 150, this);
				break;
				case 3:  kleuren.drawImage(fruit3, 170, 100, 50, 150, this);
				break;
				case 4:  kleuren.drawImage(fruit4, 170, 100, 50, 150, this);
				break;
				case 5:  kleuren.drawImage(fruit5, 170, 100, 50, 150, this);
				break;
				case 6:  kleuren.drawImage(fruit6, 170, 100, 50, 150, this);
				break;
				case 7:  kleuren.drawImage(fruit7, 170, 100, 50, 150, this);
				break;
				case 8:  kleuren.drawImage(fruit8, 170, 100, 50, 150, this);
				break;
				case 9:  kleuren.drawImage(fruit9, 170, 100, 50, 150, this);
				break;
				case 10:  kleuren.drawImage(fruit10, 170, 100, 50, 150, this);
				break;
				case 11:  kleuren.drawImage(fruit11, 170, 100, 50, 150, this);
				break;
				case 12:  kleuren.drawImage(fruit12, 170, 100, 50, 150, this);
				break;
				case 13:  kleuren.drawImage(fruit13, 170, 100, 50, 150, this);
				break;
				case 14:  kleuren.drawImage(fruit14, 170, 100, 50, 150, this);
				break;
				case 15:  kleuren.drawImage(fruit15, 170, 100, 50, 150, this);
				break;
				case 16:  kleuren.drawImage(fruit16, 170, 100, 50, 150, this);
				break;
				case 17:  kleuren.drawImage(fruit17, 170, 100, 50, 150, this);
				break;
				case 18:  kleuren.drawImage(fruit18, 170, 100, 50, 150, this);
				break;
				case 19:  kleuren.drawImage(fruit19, 170, 100, 50, 150, this);
				break;
				case 20:  kleuren.drawImage(fruit20, 170, 100, 50, 150, this);
				break;
			}
		}
	}
	
	public void speelField()
	{
		if(credietpunten > 0)
		{
			beginPlaatjesCheck = true;
			credietpunten = credietpunten - 1;
			
			random1 = Math.random();
			randomUitkomst1 = (int)(random1 * 20 + 1);
		
			random2 = Math.random();
			randomUitkomst2 = (int)(random2 * 20 + 1);
		
			random3 = Math.random();
			randomUitkomst3 = (int)(random3 * 20 + 1);
			
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