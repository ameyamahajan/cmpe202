import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Return here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Return extends Button
{
   
    
     public void act() 
    {
         begin();
    }
    
    public void setSuccessor(Button button){
    
    }
    
    public void actionHandler(){
    
    }
    
    public void begin()
    {
        HelpBoard hb1= (HelpBoard) getWorld();
        //Menu menu = (Menu) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Background());
           //men.getMusic().stop();
        }
    }
}
