package h04;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet 
{
	int valerie, hans, jeroen, valerieStaaf, hansStaaf, jeroenStaaf, lijnenBronX, lijnenBronY, lijnenHoogte, lijnenBreedte, 
	staafNummerX, staafNummerY, staafBreedte, staafGap;
	Color groen, oranje, rood;
	
  public void init() 
  {
	  setSize(500,500);
	  valerie = 100; //plus van valerie
	  hans = valerie + 100; // naar hans en jeroen
	  jeroen = hans + 100; // omdat het kan 
	  valerieStaaf = 40;
	  hansStaaf = 80;
	  jeroenStaaf = 100;
	  groen = Color.GREEN;
	  oranje = Color.ORANGE;
	  rood = Color.RED;
	  lijnenBronX = 0;
	  lijnenBronY = 400;
	  lijnenBreedte = 30;
	  lijnenHoogte = 400;
	  staafNummerX = 5;
	  staafNummerY = 400;
	  staafBreedte = 20;
	  staafGap = 109;
  }

  public void paint(Graphics teken) 
  {
    teken.drawString("Gewicht", 5, 15);
    teken.drawLine(lijnenBronX, lijnenBronY, lijnenBronX + 500, lijnenBronY);
    teken.drawString("Valerie", valerie, valerie + 320);
    teken.drawString("Hans", hans, hans + 220);
    teken.drawString("Jeroen", jeroen, jeroen + 120);
    teken.drawLine(lijnenBreedte, lijnenHoogte - 20, lijnenBreedte + 470, lijnenHoogte - 20);
    teken.drawLine(lijnenBreedte, lijnenHoogte - 40, lijnenBreedte + 470, lijnenHoogte - 40);
    teken.drawLine(lijnenBreedte, lijnenHoogte - 60, lijnenBreedte + 470, lijnenHoogte - 60);
    teken.drawLine(lijnenBreedte, lijnenHoogte - 80, lijnenBreedte + 470, lijnenHoogte - 80);
    teken.drawLine(lijnenBreedte, lijnenHoogte - 100, lijnenBreedte + 470, lijnenHoogte - 100);
    teken.drawLine(lijnenBreedte, lijnenHoogte - 120, lijnenBreedte + 470, lijnenHoogte - 120);
    teken.drawString("20", staafNummerX, staafNummerY - 20);
    teken.drawString("40", staafNummerX, staafNummerY - 40);
    teken.drawString("60", staafNummerX, staafNummerY - 60);
    teken.drawString("80", staafNummerX, staafNummerY - 80);
    teken.drawString("100", staafNummerX, staafNummerY - 100);
    teken.drawString("120", staafNummerX, staafNummerY - 120);
    teken.setColor(groen);
    teken.fillRect(staafGap, lijnenHoogte - valerieStaaf, staafBreedte, valerieStaaf);
    teken.setColor(oranje);
    teken.fillRect(staafGap + 96, lijnenHoogte - hansStaaf, staafBreedte, hansStaaf);
    teken.setColor(rood);
    teken.fillRect(staafGap + 201, lijnenHoogte - jeroenStaaf, staafBreedte, jeroenStaaf);
  }
}