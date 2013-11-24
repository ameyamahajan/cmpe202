import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;


public class BorderLine extends StatusSubject
{
  
    private float eggCount;
    private static BorderLine border;
    
    private BorderLine(){
        GreenfootImage image = getImage();
        image.scale(1100,30);
        eggCount=0;
    }
    
    public static BorderLine getInstance(){
        if (border == null){
            border=new BorderLine();
        }
        return border;
    }
     
     
    public float keepStatus(float score)
    {
        float myscore=score; 
        Actor egg =  getOneIntersectingObject(Egg.class);
        if (egg != null && egg instanceof Egg){
                World world;
                world = getWorld();
                if (egg instanceof WhiteEgg){
                    killLife();
                }
                else if (egg instanceof GoldenEgg){  
                }    
                world.removeObject(egg);
        }
        return myscore;
    }
   
    public void killLife() { 
       
        if (getWorld().getObjects(Player.class).size() > 0) 
        {
          //System.out.println("No of Lifes --> "+getWorld().getObjects(Player.class).size());
           notifyObserver();
        } 
        else{
            Greenfoot.setWorld(new GameOver()); 
           // System.out.println("No of Lifes @ GameOver --> "+getWorld().getObjects(Player.class).size());
        }
            
    }
    
    public void notifyObserver(){
        eggObserver[0].update(getWorld(),0);
    }
}
