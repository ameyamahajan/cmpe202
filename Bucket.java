import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Bucket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bucket extends StatusSubject
{
    /**
     * Act - do whatever the Bucket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean isDown = false;
    private int bonus=1;
    private static Bucket bucket;
    private int tscore=0;
    ArrayList<EggObserver> eggObserver =new ArrayList<EggObserver>();
    Bucket()
    {
        GreenfootImage image = getImage() ;
        image.scale( 125, 125 ) ; 
    }
    
    public static Bucket getInstance(){
        if (bucket == null)
            bucket = new Bucket();
        return bucket;
    }
    
    public void act()
    {
        isKeyDown();
    } 
    
    
   
    
   public void isKeyDown()
    {
        if(Greenfoot.isKeyDown("left")){
           move(-4);
        }
        if ( !isDown && Greenfoot.isKeyDown("right")){
            move(4);
        }
        if( !isDown && Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right")) {
            move(8);
        }
        if ( !isDown && Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left")){
            move(-8);
        }
        if ( isDown &&! Greenfoot.isKeyDown("left") &&! Greenfoot.isKeyDown("right") &&
        ! Greenfoot.isKeyDown("up") &&! Greenfoot.isKeyDown("down")){
            isDown = false;
        }
    }
       
   public int keepStatus(int  score)
   {
       System.out.println("In bucket score ->"+ score+" Tscore --> "+tscore); 
       Actor egg;
       tscore=score;
        egg = getOneIntersectingObject(Actor.class);
        if (egg !=  null && egg instanceof Egg )
        {
           World world;
           world = getWorld();
           if (egg instanceof WhiteEgg){
                tscore=((WhiteEgg)egg).getScore(tscore);
                System.out.println("White egg in Bucket --> "+ tscore);
           }
           else if(egg instanceof GoldenEgg) {
               tscore=((GoldenEgg)egg).getScore(tscore);
                System.out.println("Golden egg in Bucket --> "+ tscore);
           }
           else if(egg instanceof SpoiledEgg){
               tscore=((SpoiledEgg)egg).getScore(score);
               System.out.println(" Spoiled egg in Bucket --> "+ tscore);
           }
           world.removeObject(egg);
       }
        
       if ((tscore/50)>bonus && bonus<5){
           System.out.println("Score is "+tscore+" Bonus Life is "+bonus);
           bonus=tscore/50;
       }
       else if (bonus>5){
           //nothing to do
       }
       else 
       {
           bonus=1;
       }
       
       notifyObserver();
       return tscore;
   } 
    
   public void notifyObserver(){
    eggObserver.get(1).update(getWorld(),bonus);
    eggObserver.get(0).update(getWorld(),tscore);
   }
    
   
   public void register(int index, EggObserver observer){
       eggObserver.add(index,observer);
   }
   
   
   
   public void unregister(EggObserver observer){
   // Not needed. 
   }
}
