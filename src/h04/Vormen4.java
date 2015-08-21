package h04;

import java.awt.*;
import java.applet.*;

public class Vormen4 extends Applet {

  public void init() 
  {
	  
  }

  public void paint(Graphics teken) 
  {
    setBackground(Color.blue); 
    teken.setColor(Color.white);
    teken.fillRect(75, 75, 50, 50);
    teken.setColor(Color.black);
    teken.fillOval(80, 80, 10, 10);
    teken.fillOval(110, 80, 10, 10);
    teken.fillOval(80, 110, 10, 10);
    teken.fillOval(110, 110, 10, 10);
  }
  
}