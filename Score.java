import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends EggObserver
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    Score(){
        GreenfootImage score = getImage();
        score.scale(125,40);
    }
    
    public Score(int count){
     this();
     getImage().drawImage((new GreenfootImage(count+" ",30,Color.WHITE,Color.BLACK)),30,5);

    }
    
     public void update(World farm, int count){
       
       getImage().drawImage((new GreenfootImage(count+" ",30,Color.WHITE,Color.BLACK)),30,5);
       farm.repaint();
    }
}
