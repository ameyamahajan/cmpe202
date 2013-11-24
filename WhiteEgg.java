import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class WhiteEgg extends Egg
{
    private final int wscore=10;
    ArrayList<Egg> eggList = new ArrayList<Egg>();
    
     public WhiteEgg()
    {
        GreenfootImage image = getImage() ;
        image.scale( 75, 75 ) ; 
    }
    
    public int getScore(int score){
        return (score + wscore);
    }
    
    public Egg getChild() {
        Egg egg= (eggList.size() >= 1) ? eggList.get(0) : this; 
        return egg;
    }
    
    public void addChild(Egg egg){
        eggList.add(egg);
    }
    
    public  void removeChild() {
        eggList.remove(0);
    }
      
}
