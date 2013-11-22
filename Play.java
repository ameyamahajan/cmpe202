import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Button
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    
    /**
     * Act - do whatever the play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        jugar();
    }
    
    /**Metodo para poder acceder al juego*/
    public void jugar()
    {
        Menu menu = (Menu) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Farm());
           //men.getMusic().stop();
        }
    }
   
/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    
    /**Metodo para poder acceder al juego*/
   
}



