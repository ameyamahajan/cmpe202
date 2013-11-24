import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.ArrayList;

public class BorderLine extends StatusSubject
{
    private int eggCount;
    private static BorderLine border;
    private ArrayList<EggObserver> eggObserver=new ArrayList<EggObserver>();
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
     
    public int keepStatus(int score)
    {
        int myscore=score; 
        Actor egg =  getOneIntersectingObject(Egg.class);
        if (egg != null && egg instanceof Egg){
            World world;
            world = getWorld();
            if ( ((Egg)egg).getChild() instanceof WhiteEgg){ 
                killLife();
            }
            else if (((Egg)egg).getChild() instanceof GoldenEgg){  
            }    
            world.removeObject(egg);
        }
        return myscore;
    }
   
    public void killLife() { 
       
        if (getWorld().getObjects(Player.class).size() > 0) 
        {
          System.out.println("No of Lifes --> "+getWorld().getObjects(Player.class).size());
           notifyObserver();
        } 
        else{
            Greenfoot.setWorld(new GameOver()); 
           System.out.println("No of Lifes @ GameOver --> "+getWorld().getObjects(Player.class).size());
        }
            
    }
    
    public void notifyObserver(){
        eggObserver.get(0).update(getWorld(),0);
    }
    
    public void register(int index, EggObserver observer){
       eggObserver.add(index,observer);
   }
   
   
   
   public void unregister(EggObserver observer){
   // Not needed. 
   }
}
