package h04;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

  public void init() 
  {
	  setSize(500,500);
  }

  public void paint(Graphics teken) 
  {
    teken.drawString("Gewicht", 5, 15);
    teken.drawLine(0, 400, 500, 400);
    teken.drawString("Valerie", 100, 420);
    teken.drawString("Hans", 200, 420);
    teken.drawString("Jeroen", 300, 420);
    teken.drawLine(30, 380, 500, 380);
    teken.drawLine(30, 360, 500, 360);
    teken.drawLine(30, 340, 500, 340);
    teken.drawLine(30, 320, 500, 320);
    teken.drawLine(30, 300, 500, 300);
    teken.drawLine(30, 280, 500, 280);
    teken.drawString("20", 5, 380);
    teken.drawString("40", 5, 360);
    teken.drawString("60", 5, 340);
    teken.drawString("80", 5, 320);
    teken.drawString("100", 5, 300);
    teken.drawString("120", 5, 280);
    teken.setColor(Color.green);
    teken.fillRect(109, 360, 20, 40);
    teken.setColor(Color.orange);
    teken.fillRect(205, 320, 20, 80);
    teken.setColor(Color.red);
    teken.fillRect(310, 300, 20, 100);
  }
  
}