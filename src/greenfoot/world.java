import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private counter counter;
    private endscore endscore;
    
    public MyWorld()
    {    
        super(700, 500, 1); 
        
        int teller, regel, kolom;
        
        addObject(new link(), 175, 250);
        addObject(new enemy(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(500));
        
        for(int teller1 = 0; teller1 <= 5; teller1++)
        {
            addObject(new bom(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(500));
        }
        
        for(int teller2 = 0; teller2 <= 6; teller2++)
        {
            addObject(new rock(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(500));
        }
        
        for(int teller3 = 0; teller3 <= 10; teller3++)
        {
            addObject(new rupee(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(500));
        }
        
        counter = new counter();
        regel = getHeight() - counter.getImage().getHeight() / 2 - 2;
        kolom = counter.getImage().getWidth() / 2 + 1;
        addObject(counter, kolom, regel);
        
        setPaintOrder(link.class, enemy.class, rupee.class, bom.class, rock.class);
    }
    
    public void started()
    {
        endscore = new endscore();
    }
    
    public void stopped() 
    {
        int score;
        
        score = 10;
        endscore.setEndImage(score);
        addObject(endscore, getWidth() / 2, getHeight() / 2);
    }
}
