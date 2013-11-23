import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends World
{
    public int score = 0;
    
    
    public GameOver(){
        
        super(600, 400, 1); 
        this.score=100;
        prepare();
    }
    public GameOver(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.score=score;
        prepare();
    }
    
    public void setScore(int score){
        this.score=score;
       
    }
    
    public void prepare(){
        Score score=new Score(this.score);
        addObject(score, 250, 250);
        
        
    }
}
