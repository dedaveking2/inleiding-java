package h11;

import java.awt.*;
import java.applet.*;

public class schaakbord extends Applet 
{	
	int tegel, tegel2, x, y, breedte, hoogte;
	
	  public void init() 
	  {
		  setSize(500, 500);
		  x = 50;
		  y = 50;
		  breedte = 20;
		  hoogte = 20;
	  }
	  
	  public void paint(Graphics kleur) 
	  {
		  for(tegel = 0; tegel <= 8; tegel ++)
		  {
			for(tegel2 = 0; tegel2 <= 8; tegel2 ++)
			{
				if((tegel + tegel2) % 2 == 0)
				{
					kleur.setColor(Color.black);
					kleur.fillRect(x, y, breedte, hoogte);
					
				}
				else
				{
					kleur.drawRect(x, y, breedte, hoogte);
					
				}
				x = x + breedte;
			}
			x = 50;
			y = y + hoogte;
		  }
		  kleur.drawRect(50, 50, 180, 180);
	  }
}