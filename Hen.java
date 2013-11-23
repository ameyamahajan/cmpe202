import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Hen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hen extends Actor
{
    /**
     * Act - do whatever the Hen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    boolean isDown = false;
    Egg egg ;
    final int[] HenLocation = {115,332,565,792,1006};
    int scroller;
    float score = 0.0f;
    private long ticker=System.currentTimeMillis();
    
    public Hen()
    {
        GreenfootImage image = getImage() ;
        image.scale( 125, 125 ) ; 
    }
    public void act() 
    {
        chooseHen();
        timer30();
    }
    public void chooseHen()
    {
        int pick= new Random().nextInt(5);
        int eggChoice = new Random().nextInt(9)+1;
        scroller=150;
        egg = createEgg(eggChoice,HenLocation[pick]);
        while(scroller < 700){
            moveEgg(HenLocation[pick],scroller);
            timer30();
            touch();
            scroller=scroller+1;
            timer30();
        }
    }
    

    public Egg createEgg(int eggType, int henSelect)
    { // Strategy pattern is implemented here
        World world;
        world = getWorld();
        Egg tempEgg ;
        switch(eggType){
            case 1: case 2: case 3: case 4: case 5: 
            tempEgg=new WhiteEgg();break;
            case 6: case 7: case 8: 
            tempEgg=new SpoiledEgg();break;
            case 9:
            tempEgg=new GoldenEgg();break;
            default: 
            tempEgg=new WhiteEgg();break;
        }
        world.addObject(tempEgg,henSelect,150);
        return tempEgg;
    }
    
    public void moveEgg(int xloc, int yloc){
            egg.setLocation(xloc,yloc);
            Greenfoot.delay(50);
        }
        
        
    public void touch(){
        Bucket.getInstance().act();
        this.score=Bucket.getInstance().keepStatus(this.score);
        this.score=BorderLine.getInstance().keepStatus(this.score);
    }
    
    
    public void timer30(){
       if( getWorld().getObjects(Timer.class).size() > 0 )
       {
            ((Timer)getWorld().getObjects(Timer.class).get(0)).timer30(ticker);
       }
    }
    
   
}



