import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SpoiledEgg extends Egg
{
     private final int sscore=5;
     
     public SpoiledEgg(){
        GreenfootImage image = getImage() ;
        image.scale( 75, 75 ) ;   
    }   
    
    public int getScore(int score){
        return (score - sscore);
    }
    
    public Egg getChild() {
        return this; 
    }
    
    public void addChild(Egg egg){}
    
    public  void removeChild() {}
   
}
