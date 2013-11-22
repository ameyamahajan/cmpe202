import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Begin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Begin extends Button
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
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
        }
    }
}
