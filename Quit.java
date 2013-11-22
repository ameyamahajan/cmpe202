import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quit extends Button
{
    /**
     * Act - do whatever the Quit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       
    
    public void act() 
    {
       proceed();
    }
    
    
    public void proceed()
    {
        Farm farm= (Farm) getWorld();
        //HenWorld henworld= (HenWorld) getWorld();
        //Menu menu = (Menu) getWorld();
        Menu menu= new Menu();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
           //men.getMusic().stop();
        }
    }
    
}

