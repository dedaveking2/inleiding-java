package h11;

import java.awt.*;
import java.applet.*;

public class lijnen extends Applet 
{
	int lijnX, lijnY, lijnHoogte;
	
	  public void init() 
	  {
		  lijnX = 20;
		  lijnY = 20;
		  lijnHoogte = 50;
	  }
	  
	  public void paint(Graphics kleur) 
	  {
		  while(lijnX <= 110)
		  {
			  kleur.drawLine(lijnX, lijnY, lijnX, lijnY + lijnHoogte);
			  lijnX = lijnX + 10;
			  
		  }
	  }
}