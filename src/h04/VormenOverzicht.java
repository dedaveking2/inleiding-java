package h04;

/*
 * dit is ook hoofdstuk 5
 */

import java.awt.*;
import java.applet.*;

public class VormenOverzicht extends Applet {
	
	Color lijnKleur, vulKleur;
	int breedte, hoogte;

  public void init() 
  {
	  setSize(1000,500);
	  setBackground(Color.white);
	  breedte = 250;
	  hoogte = 150;
	  lijnKleur = Color.black;
	  vulKleur = Color.magenta;
  }

  public void paint(Graphics teken) 
  {
	  //lijn
	  teken.drawLine(10, 10, 260, 10);
	  teken.drawString("Lijn", 125, 25);
	  
	  //rechthoek
	  teken.drawRect(10, 50, breedte, hoogte);
	  teken.drawString("Rechthoek", 100, 215);
	  
	  //afgeronde rechthoek
	  teken.drawRoundRect(10, 250, breedte, hoogte, 50, 50);
	  teken.drawString("Afgeronde rechthoek", 80, 415);
	  teken.setColor(vulKleur);
	  teken.fillRect(300, 50, breedte, hoogte);
	  
	  //gevulde rechthoek met ovaal
	  teken.setColor(lijnKleur);
	  teken.drawOval(300, 50, breedte, hoogte);
	  teken.drawString("Gevulde rechthoek met ovaal", 345, 215);
	  
	  //gevulde ovaal
	  teken.setColor(vulKleur);
	  teken.fillOval(300, 250, breedte, hoogte);
	  teken.setColor(lijnKleur);
	  teken.drawString("Gevulde ovaal", 385, 415);
	  
	  //taartpunt met ovaal eromheen
	  teken.drawOval(600, 50, breedte, hoogte);
	  teken.setColor(vulKleur);
	  teken.fillArc(600, 50, breedte, hoogte, 0, 50);
	  teken.setColor(lijnKleur);
	  teken.drawString("Taartpunt met ovaal eromheen", 640, 215);
	  
	  //cirkel
	  teken.drawOval(650, breedte, hoogte, 150);
	  teken.drawString("Cirkel", 710, 415);
  }
  
}