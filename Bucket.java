import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bucket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bucket extends Actor
{
    /**
     * Act - do whatever the Bucket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private float eggCount;
    boolean isDown = false;
    private static Bucket bucket;
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
    
    public float checkTouch() 
    {
        isKeyDown();
        keepScore();
        return eggCount;
        
    } 
    
   public void isKeyDown()
    {
       
        if(Greenfoot.isKeyDown("left"))
        {
           //isDown = true;
           //setRotation(360);
           move(-4);
           setSpeed(100);
        }
        if ( !isDown && Greenfoot.isKeyDown("right") )
        {
            //isDown = true;
            //setRotation(180);
            move(4);
            setSpeed(100);
        }
        if( !isDown && Greenfoot.isKeyDown("up") )
        {
            //isDown = true;
            //setRotation(90);
            move(8);
            setSpeed(500);
        }
        if ( !isDown && Greenfoot.isKeyDown("down") )
        {
            //isDown = true;
            //setRotation(-90);
            move(-8);
             setSpeed(500);
        }
        
        if ( isDown &&! Greenfoot.isKeyDown("left") &&! Greenfoot.isKeyDown("right") &&
        ! Greenfoot.isKeyDown("up") &&! Greenfoot.isKeyDown("down"))
        {
            isDown = false;
        }
    }
       
   public void keepScore()
   {
       Actor egg;
        egg = getOneIntersectingObject(Actor.class);
        if (egg !=  null && egg instanceof Egg )
        {
           World world;
           world = getWorld();
           world.removeObject(egg);
           if (egg instanceof WhiteEgg){
               this.eggCount=5.0f + this.eggCount;
           }
           else if(egg instanceof GoldenEgg) {
               this.eggCount=10.0f + this.eggCount;
           }
           else if(egg instanceof SpoiledEgg) {
                   this.eggCount=-20.0f+ this.eggCount;
           }
           else {
               this.eggCount=0.0f+this.eggCount;
           }
        //  System.out.println("Your Score is -> "+this.eggCount);
       }  
   } 
    
    public void setSpeed(int speed)
    {
      // System.out.println("The speed is:"+speed);
    }
}
