import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Begin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Begin extends Button
{
    /**
     * Act - do whatever the Begin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    public void act() 
    {
        jugar1();
    }
    
    /**Metodo para poder acceder al juego*/
    public void jugar1()
    {
        Background bg= (Background) getWorld();
        //Menu menu = (Menu) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
           //men.getMusic().stop();
        }
    }
}
