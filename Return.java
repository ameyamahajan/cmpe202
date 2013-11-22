import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Return here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Return extends Button
{
    /**
     * Act - do whatever the Return wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     public void act() 
    {
         regresa2();
    }
    
    
    public void regresa2()
    {
        HelpBoard1 hb1= (HelpBoard1) getWorld();
        //Menu menu = (Menu) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Background());
           //men.getMusic().stop();
        }
    }
}
