import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class BorderLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BorderLine extends Actor
{
    /**
     * Act - do whatever the BorderLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     private float egg;
     boolean a,b,c;
    
    
    public void eggRemove()
    {
        Actor egg =  getOneIntersectingObject(Egg.class);
        if (egg != null){
            System.out.println(egg.getClass());
            if (egg instanceof Egg )
            {
                System.out.println("Egg touched Me \n\n\n\n!");
                World world;
                world = getWorld();
                world.removeObject(egg);
            }
        }
    }

}
