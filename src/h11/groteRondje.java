package h11;

import java.awt.*;
import java.applet.*;

public class groteRondje extends Applet 
{
	int hoogte, breedte, x, y;
	
	  public void init() 
	  {
		  setSize(1100, 1100);
		  breedte = 10;
		  hoogte = 10;
		  x = 500;
		  y = 500;
	  }
	  
	  public void paint(Graphics kleur) 
	  {
		 while(breedte <= 1000 && hoogte <= 1000)
		 {
			  kleur.drawOval(x, y, breedte, hoogte);
			  breedte = breedte + 10;
			  hoogte = hoogte + 10;
			  x = x - 5;
			  y = y - 5;
		 }
	  }
}