package h11;

import java.awt.*;
import java.applet.*;

public class aftellen extends Applet 
{
	int nummer, hoogte;
	  public void init() 
	  {
		  hoogte = 50;
	  }
	  
	  public void paint(Graphics kleur) 
	  {
		  for(nummer = 20; nummer >= 10; nummer--)
		  {
			  kleur.drawString("" + nummer, 50, hoogte);
			  hoogte = hoogte + 10;
		  }
	  }
}