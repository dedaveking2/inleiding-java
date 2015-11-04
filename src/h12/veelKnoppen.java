package h12;

import java.applet.*;
import java.awt.*;

public class veelKnoppen extends Applet
{
	Button[] arrayKnop;
	int teller;
	
	public void init()
	{
		arrayKnop = new Button[25];
		
		for(teller = 0; teller < arrayKnop.length; teller++)
		{
			arrayKnop [teller] = new Button();
			add(arrayKnop[teller]);
		}
	}
}
