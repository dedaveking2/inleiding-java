package h11;

import java.awt.*;
import java.applet.*;

public class vierkanten extends Applet 
{
	int hoogte, breedte, x, y;
	
	  public void init() 
	  {
		  setSize(500, 500);
		  breedte = 20;
		  hoogte = 20;
		  x = 20;
		  y = 20;
	  }
	  
	  public void paint(Graphics kleur) 
	  {
		 while(x <= 100 && y <= 100)
		 {
			  kleur.drawRect(x, y, breedte, hoogte);
			  x = x + 20;
			  y = y + 20;
		 }
	  }
}