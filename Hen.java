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
    int score = 0;
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
            tempEgg=new WhiteEgg();
            tempEgg.addChild(new GoldenEgg());
            break;
            default: 
            tempEgg=new WhiteEgg();break;
        }
        world.addObject(tempEgg.getChild(),henSelect,150);
        return tempEgg.getChild();
    }
    
    public void moveEgg(int xloc, int yloc){
            egg.setLocation(xloc,yloc);
            Greenfoot.delay(85);
        }
        
        
    public void touch(){
        
        Bucket.getInstance().register(0,((Score)getWorld().getObjects(Score.class).get(0)));
        Bucket.getInstance().register(1,Life.getInstance());
        BorderLine.getInstance().register(0,Life.getInstance());
        
        Bucket.getInstance().act();
        int scorel=this.score;
        scorel=Bucket.getInstance().keepStatus(this.score);
        System.out.println("Score after catch "+scorel);
        BorderLine.getInstance().keepStatus(this.score);
       // ((Score)getWorld().getObjects(Score.class).get(0)).update(getWorld(),scorel);
        this.score=scorel;
    }
    
    
    public void timer30(){
       if( getWorld().getObjects(Timer.class).size() > 0 )
       {
            ((Timer)getWorld().getObjects(Timer.class).get(0)).timer30(ticker);
       }
    }
}



