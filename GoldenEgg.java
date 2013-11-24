import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GoldenEgg extends WhiteEgg
{
    private final int gscore=20;
    
     public GoldenEgg()
    {
        GreenfootImage image = getImage() ;
        image.scale( 75, 75 ) ; 
    }   
    
    public int getScore(int score){
        return (score + gscore);
    }
    
    public Egg getChild() {
        return null; 
    }
    
    public void addChild(Egg egg){}
    
    public  void removeChild() {}
}
