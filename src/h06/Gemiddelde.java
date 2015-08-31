package h06;

import java.applet.*;
import java.awt.*;

public class Gemiddelde extends Applet
{
	double cijfer1, cijfer2, cijfer3, gemiddeldeCijfer;
	
	public void init()
	{
		setSize(500, 500);
		cijfer1 = 5.9;
		cijfer2 = 6.3;
		cijfer3 = 6.9;
		
		gemiddeldeCijfer = (cijfer1 + cijfer2 + cijfer3) / 3;
		gemiddeldeCijfer = gemiddeldeCijfer * 10;
		gemiddeldeCijfer = (int)gemiddeldeCijfer;
		gemiddeldeCijfer = (double)gemiddeldeCijfer;
		gemiddeldeCijfer = gemiddeldeCijfer /10;
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("Cijfer 1", 55, 50);
		kleuren.drawString("Cijfer 2", 55, 70);
		kleuren.drawString("Cijfer 3", 55, 90);
		kleuren.drawString("Gemiddelde cijfer", 0, 120);
		kleuren.drawLine(100, 30, 100, 130);
		kleuren.drawLine(50, 100, 300, 100);
		kleuren.drawString("" + cijfer1, 110, 50);
		kleuren.drawString("" + cijfer2, 110, 70);
		kleuren.drawString("" + cijfer3, 110, 90);
		kleuren.drawString("" + gemiddeldeCijfer, 110, 120);
	}
} 

