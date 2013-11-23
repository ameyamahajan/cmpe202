import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Quit extends Button
{
   public void act() 
   {
       proceed();
   }
    
   public void setSuccessor(Button button){
    
   }
   
   public void actionHandler(){
    
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
           // menu.getMusic().stop();
        }
    }
    
}

