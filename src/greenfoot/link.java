import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class link here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class link extends Actor
{
    /**
     * Act - do whatever the link wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private GreenfootImage imageLeft;
     private GreenfootImage imageRight;
    
    public link()
    {
        imageLeft = new GreenfootImage("GarpLeft.png");
        imageRight = new GreenfootImage("GarpRight.png");
        setImage(imageRight);
    }
    
    public void act() 
    {
        move();
    }
    
    private void move() 
    {
            if(Greenfoot.isKeyDown("right")) 
        {
            if(getImage() != imageRight)
            {
                setImage(imageRight);
            }
            setRotation(0);
            move(5);
        }
        
        if(Greenfoot.isKeyDown("left")) 
        {
            if(getImage() != imageLeft)
            {
                setImage(imageLeft);
            }
            setRotation(0);
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("up")) 
        {
            setImage(imageRight);
            setRotation(-90);
            move(5);
        }

        if(Greenfoot.isKeyDown("down")) 
        {
            setImage(imageRight);
            setRotation(90);
            move(5);
        }
    }
}