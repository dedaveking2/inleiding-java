package h11;

import java.awt.*;
import java.applet.*;

public class rondje extends Applet 
{
	int hoogte, breedte, x, y;
	
	  public void init() 
	  {
		  setSize(500, 500);
		  breedte = 10;
		  hoogte = 10;
		  x = 245;
		  y = 245;
	  }
	  
	  public void paint(Graphics kleur) 
	  {
		 while(breedte <= 50 && hoogte <= 50)
		 {
			  kleur.drawOval(x, y, breedte, hoogte);
			  breedte = breedte + 10;
			  hoogte = hoogte + 10;
			  x = x - 5;
			  y = y - 5;
		 }
	  }
}