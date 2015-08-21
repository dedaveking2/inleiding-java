package h04;

import java.awt.*;
import java.applet.*;

public class Vormen3 extends Applet {

  public void init() 
  {
	  
  }

  public void paint(Graphics teken) 
  {
    setBackground(Color.blue); 
    teken.fillRect(85, 70, 30, 65);
    teken.drawLine(100, 100, 100, 200);
    teken.setColor(Color.red);
    teken.fillOval(96, 80, 10, 10);
    teken.setColor(Color.orange);
    teken.fillOval(96, 100, 10, 10);
    teken.setColor(Color.green);
    teken.fillOval(96, 120, 10, 10);
  }
  
}