import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Egg extends Actor
{
    /**
     * Act - do whatever the Egg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        breakMsg();
    }    
    public void breakMsg()
    {
        
        Egg egg = (Egg)getOneObjectAtOffset(0,0,Egg.class);
         if (egg !=  null  )
         {
            GreenfootImage image2 = new GreenfootImage("You missed Egg..!!",30,Color.RED,Color.GREEN);
            getImage().drawImage(image2,120,60);
            World world;
            world = getWorld();
            world.removeObject(egg);
        }
    }
}
