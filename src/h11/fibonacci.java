package h11;

import java.awt.*;
import java.applet.*;

public class fibonacci extends Applet 
{
	int nummer, nummer2, nummer3, hoogte;
	
	  public void init() 
	  {
		  setSize(500, 500);
		  nummer = 1;
		  hoogte = 10;
	  }
	  
	  public void paint(Graphics kleur) 
	  {
		 while(nummer <= 1000000)
		 {
			 kleur.drawString("" + nummer, 10, hoogte);
			 nummer2 = nummer3;
			 nummer3 = nummer;
			 nummer = nummer2 + nummer3;
			 hoogte = hoogte + 10;
		 }
	  }
}