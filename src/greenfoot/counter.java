import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Dimension;
import java.awt.Color;

public class counter extends Score
{
    int score;
    
    public counter()
    {
        String scoreText;
        GreenfootImage image;
        Dimension dim;
        
        score = 0;
        scoreText = "aantal diamanten:  0";
        image = new GreenfootImage(10, 100);
        dim = getTextDimensions(image, scoreText);
        image.scale(dim.width, dim.height);
        setImage(image);
        image.setColor(new Color (0, 0, 0));
        image.drawString(scoreText, 0, dim.height);
    }
    
    public void act() 
    {
        
    }
    
    protected void updateImage()
    {
        String scoreText;
        GreenfootImage image;
        Dimension dim;
        
        score = 0;
        scoreText = "aantal diamanten:  0";
        image = new GreenfootImage(10, 100);
        dim = getTextDimensions(image, scoreText);
        image.scale(dim.width, dim.height);
        setImage(image);
        image.setColor(new Color (0, 0, 0));
        image.drawString(scoreText, 0, dim.height);
    }
    
    public void addscore()
    {
        score++;
        updateImage();
    }
}