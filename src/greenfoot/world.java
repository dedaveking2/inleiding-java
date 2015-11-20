import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        
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
        
        setPaintOrder(link.class, enemy.class, rupee.class, bom.class, rock.class);
    }
}