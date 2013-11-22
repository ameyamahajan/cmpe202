import greenfoot.*;

public class Play extends Button
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
            Greenfoot.setWorld(new Farm());
           //men.getMusic().stop();
        }
   }
   
}



