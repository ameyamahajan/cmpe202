import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Help extends Button
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
        Menu menu = (Menu) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HelpBoard());
           //men.getMusic().stop();
        }
   }
}
