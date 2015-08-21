package h02;

import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Show extends Applet {

  //een (lege) methode die de Applet initialiseert
  public void init() 
  {
	  setBackground(Color.white);
  }
  
  //een methode die de inhoud van het scherm tekent
  public void paint(Graphics kleur) 
  {
	kleur.setColor(Color.blue);
    kleur.drawString("Dave", 80, 100 );
    kleur.setColor(Color.red);
    kleur.drawString("de Witte", 72, 120 );
    
  }

}