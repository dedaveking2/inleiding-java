package h04;

import java.awt.*;
import java.applet.*;

public class Vormen extends Applet {

  public void init() 
  {
	  
  }

  public void paint(Graphics teken) 
  {
    setBackground(Color.blue); 
    teken.drawLine(100, 50, 50, 100);
    teken.drawLine(100, 50, 150, 100);
    teken.drawLine(50, 100, 150, 100);
    teken.drawRect(50, 100, 100, 75);
    teken.drawRect(60, 140, 20, 35);
    teken.drawOval(65, 160, 1, 1);
    teken.drawRect(90, 150, 40, 20);
    teken.drawLine(90, 160, 130, 160);
    teken.drawLine(110, 150, 110, 170);
    teken.drawLine(130, 80, 130, 30);
    teken.setColor(Color.red);
    teken.drawRect(130, 30, 40, 5);
    teken.fillRect(130, 30, 40, 5);
    teken.setColor(Color.white);
    teken.drawRect(130, 35, 40, 5);
    teken.fillRect(130, 35, 40, 5);
    teken.setColor(Color.blue);
    teken.drawRect(130, 40, 40, 5);
    teken.fillRect(130, 40, 40, 5);
  }
  
}