import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     Score(){
        GreenfootImage score = getImage();
        score.scale(125,40);
    }
    
    public Score(int score){
     this();
     getImage().drawImage((new GreenfootImage(score+" points",30,Color.WHITE,Color.BLACK)),0,0);

    }
}
