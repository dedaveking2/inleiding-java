import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;  
import greenfoot.Actor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Dimension;

public abstract class Score  extends Actor
{
    public void act() 
    {
        // Add your action code here.
    } 

    public Dimension getTextDimensions(GreenfootImage image, String tekst) 
    {
        int height, width;
        Font font;

        font = image.getFont();
        FontMetrics metrics = image.getAwtImage().getGraphics().getFontMetrics(font); 
        width = metrics.stringWidth(tekst);
        height = metrics.getLeading() + metrics.getAscent() + metrics.getDescent();
        return new Dimension(width, height);
    } 
}