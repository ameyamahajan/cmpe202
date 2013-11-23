import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class BorderLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BorderLine extends Actor
{
    /**
     * Act - do whatever the BorderLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
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
        return score;
    }
   
    public void killLife() { 
       
        if (getWorld().getObjects(Player.class).size() > 0) 
        { 
           getWorld().removeObject((Actor)getWorld().getObjects(Player.class).get(0));
           getWorld().repaint();
           System.out.println("Lost White Egg" + getWorld().getObjects(Player.class).size());
        } 
        else{
            Greenfoot.setWorld(new GameOver()); 
            System.out.println("Game Over");
        }
            
    } 
}
