import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    private float eggCount;
    boolean isDown = false;
    private static Bucket bucket;
    private int bonus=0;
    private static float score=0.0f;
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
       
        if(Greenfoot.isKeyDown("left"))
        {
           move(-4);
        }
        if ( !isDown && Greenfoot.isKeyDown("right") )
        {
            move(4);
        }
        if( !isDown && Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right"))
        {
            move(8);
           
        }
        if ( !isDown && Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left"))
        {
            move(-8);
        }
        
        if ( isDown &&! Greenfoot.isKeyDown("left") &&! Greenfoot.isKeyDown("right") &&
        ! Greenfoot.isKeyDown("up") &&! Greenfoot.isKeyDown("down"))
        {
            isDown = false;
        }
    }
       
   public float keepStatus(float score)
   {
       this.score=score;
       Actor egg;
        egg = getOneIntersectingObject(Actor.class);
        if (egg !=  null && egg instanceof Egg )
        {
           World world;
           world = getWorld();
           
           if (egg instanceof WhiteEgg){
               score=50.0f + score;
           }
           else if(egg instanceof GoldenEgg) {
              score=20.0f + score;
           }
           else if(egg instanceof SpoiledEgg) {
              score=-5.0f+ score;
           }
           else {
               score=0.0f+score;
           }
           world.removeObject(egg);
       }  
       if (Math.round(score) > 50 && Math.round(score)  > bonus){
           bonus=Math.round(score/50);
       }
       else bonus=1;
       
       notifyObserver();
       return score;
   } 
    
   public void notifyObserver(){
    eggObserver[0].update(getWorld(),bonus);
    eggObserver[1].update(getWorld(),Math.round(this.score));
   }
    
}
