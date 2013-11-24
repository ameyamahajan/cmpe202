import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public abstract class Egg extends Actor
{
   

    
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
    
    public abstract Egg getChild();
    public abstract void addChild(Egg egg);
    public abstract void removeChild();
    public abstract int getScore(int score);
}
