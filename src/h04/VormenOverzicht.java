package h04;

import java.awt.*;
import java.applet.*;

public class VormenOverzicht extends Applet {

  public void init() 
  {
	  setSize(1000,500);
	  setBackground(Color.white);
  }

  public void paint(Graphics teken) 
  {
	  teken.drawLine(10, 10, 260, 10);
	  teken.drawString("Lijn", 125, 25);
	  teken.drawRect(10, 50, 250, 150);
	  teken.drawString("Rechthoek", 100, 215);
	  teken.drawRoundRect(10, 250, 250, 150, 50, 50);
	  teken.drawString("Afgeronde rechthoek", 80, 415);
	  teken.setColor(Color.magenta);
	  teken.fillRect(300, 50, 250, 150);
	  teken.setColor(Color.black);
	  teken.drawOval(300, 50, 250, 150);
	  teken.drawString("Gevulde rechthoek met ovaal", 345, 215);
	  teken.setColor(Color.magenta);
	  teken.fillOval(300, 250, 250, 150);
	  teken.setColor(Color.black);
	  teken.drawString("Gevulde ovaal", 385, 415);
	  teken.drawOval(600, 50, 250, 150);
	  teken.setColor(Color.magenta);
	  teken.fillArc(600, 50, 250, 150, 0, 50);
	  teken.setColor(Color.black);
	  teken.drawString("Taartpunt met ovaal eromheen", 640, 215);
	  teken.drawOval(650, 250, 150, 150);
	  teken.drawString("Cirkel", 710, 415);
  }
  
}