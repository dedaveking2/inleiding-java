package h04;

import java.awt.*;
import java.applet.*;

public class Vormen2 extends Applet {

  public void init() 
  {
	  
  }

  public void paint(Graphics teken) 
  {
    setBackground(Color.blue); 
    teken.setColor(Color.yellow);
    teken.fillArc(0, 0, 200, 200, 0, 360);
  }
  
}