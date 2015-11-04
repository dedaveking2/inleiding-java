package h02;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

  public void init() 
  {
	  setBackground(Color.white);
  }
  
  public void paint(Graphics kleur) 
  {
	kleur.setColor(Color.blue);
    kleur.drawString("Dave", 80, 100 );
    kleur.setColor(Color.red);
    kleur.drawString("de Witte", 72, 120 );
    
  }

}