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
    private int eggCount;
    boolean isDown = false;
    private int bonus=0;
    private static Bucket bucket;
    private static int tscore=0;
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
       
   public int keepStatus(int  score)
   {
       Actor egg;
       int scoreTemp=0;
        egg = getOneIntersectingObject(Actor.class);
        if (egg !=  null && egg instanceof Egg )
        {
           World world;
           world = getWorld();
           if (egg instanceof WhiteEgg){
                scoreTemp=((WhiteEgg)egg).getScore(score);
                System.out.println("White egg in Bucket --> "+ score);
           }
           else if(egg instanceof GoldenEgg) {
               scoreTemp=((GoldenEgg)egg).getScore(score);
                System.out.println("Golden egg in Bucket --> "+ score);
           }
           else if(egg instanceof SpoiledEgg){
               scoreTemp=((SpoiledEgg)egg).getScore(score);
               System.out.println(" Spoiled egg in Bucket --> "+ score);
           }
           world.removeObject(egg);
       }
        
       if ((scoreTemp/50)>bonus && bonus<5){
           System.out.println("Score is "+scoreTemp+" Bonus Life is "+bonus);
           bonus=scoreTemp/50;
       }
       else if (bonus>5){
           //nothing to do
       }
       else 
       {
           bonus=1;
       }
       this.tscore=scoreTemp;
       notifyObserver();
       return scoreTemp;
   } 
    
   public void notifyObserver(){
    eggObserver[0].update(getWorld(),bonus);
    eggObserver[1].update(getWorld(),this.tscore);
   }
    
}
