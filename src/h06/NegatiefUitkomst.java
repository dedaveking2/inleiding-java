package h06;

import java.applet.*;
import java.awt.*;

public class NegatiefUitkomst extends Applet
{
	int cijfer1, cijfer2, cijfer3;
	
	public void init()
	{
		setSize(500, 500);
		cijfer1 = 2147000000;
		cijfer2 = 2000000000;
		cijfer3 = cijfer1 + cijfer2;
	}
	
	public void paint(Graphics kleuren)
	{
		kleuren.drawString("" + cijfer3, 50, 50);
	}
} 
