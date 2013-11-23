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
    private static final double speed = 5.0;
    public Hen()
    {
        GreenfootImage image = getImage() ;
        image.scale( 125, 125 ) ; 
    }
    public void act() 
    {
        chooseHen();
    }
    public void chooseHen()
    {
        int pick= new Random().nextInt(5);
        int eggChoice = new Random().nextInt(3)+1;
        scroller=150;
        egg = createEgg(eggChoice,HenLocation[pick]);
        while(scroller < 700){
            moveEgg(HenLocation[pick],scroller);
            touch();
            scroller=scroller+1;
        }
    }
    

    public Egg createEgg(int eggType, int henSelect)
    { // Strategy pattern is implemented here
        World world;
        world = getWorld();
        Egg tempEgg ;
        switch(eggType){
            case 1:
            tempEgg=new WhiteEgg();break;
            case 2:
            tempEgg=new GoldenEgg();break;
            default:
            tempEgg=new SpoiledEgg();break;
        }
        world.addObject(tempEgg,henSelect,150);
        return tempEgg;
    }
    
    public void moveEgg(int xloc, int yloc){
            egg.setLocation(xloc,yloc);
            Greenfoot.delay(500);
        }
        
        
    public void touch(){
        Bucket.getInstance().act();   
        BorderLine.getInstance().eggRemove();
    }
}



