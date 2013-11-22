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
    private float egg;
    boolean isDown = false;
    private static Bucket bucket;
    private Bucket()
    {
        GreenfootImage image = getImage() ;
        image.scale( 125, 125 ) ; 
        
    }
    
    public static Bucket getInstance(){
        if (bucket == null)
            bucket = new Bucket();
        return bucket;
    }
    
    public void check() 
    {
        isKeyDown();
        printMsg();
        
    } 
    
   public void isKeyDown()
    {
       
        if(Greenfoot.isKeyDown("left"))
        {
           //isDown = true;
           //setRotation(360);
           move(-150);
           setSpeed(100);
        }
        if ( !isDown && Greenfoot.isKeyDown("right") )
        {
            //isDown = true;
            //setRotation(180);
            move(150);
            setSpeed(100);
        }
        if ( !isDown && Greenfoot.isKeyDown("up") )
        {
            //isDown = true;
            //setRotation(90);
            move(300);
            setSpeed(1000);
        }
        if ( !isDown && Greenfoot.isKeyDown("down") )
        {
            //isDown = true;
            //setRotation(-90);
            move(-300);
             setSpeed(1000);
        }
        if ( isDown &&! Greenfoot.isKeyDown("left") &&! Greenfoot.isKeyDown("right") &&
        ! Greenfoot.isKeyDown("up") &&! Greenfoot.isKeyDown("down"))
        {
            isDown = false;
        }
    }
       /* if (Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-2);
        }
    }*/
    public void printMsg()
    {
        Actor egg;
         egg = getOneIntersectingObject(Actor.class);
         if (egg !=  null && egg instanceof Egg )
        {
            World world;
            world = getWorld();
            world.removeObject(egg);
            if (egg instanceof WhiteEgg){
                this.egg=5.0f + this.egg;
            }
            else if(egg instanceof GoldenEgg) {
                this.egg=10.0f + this.egg;
            }
            else if(egg instanceof SpoiledEgg) {
                    this.egg=-20.0f+ this.egg;
            }
            else {
                this.egg=0.0f+this.egg;
            }
            
        }  
        
    } 
    
    public void setSpeed(int speed)
    {
       System.out.println("The speed is:"+speed);
    }
}
