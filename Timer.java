import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int check =0;
     
    Timer(){
        GreenfootImage timer = getImage();
        timer.scale(125,40);
    }
      
    
    
    public void timer30(long ticker){
        if ((System.currentTimeMillis()-ticker)<30000){
            getImage().drawImage((new GreenfootImage(((System.currentTimeMillis()-ticker)/1000)+" sec",30,Color.RED,Color.WHITE)),0,0);
        }
       // System.out.println("Done Done Done!!!");
    }
}
