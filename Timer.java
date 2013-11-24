import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Timer extends Actor
{
     int check =0;
     
    Timer(){
        GreenfootImage timer = getImage();
        timer.scale(125,40);
    }
      
    
    
    public void timer30(long ticker){
        
        
        if ((System.currentTimeMillis()-ticker)<100000){
            getImage().drawImage((new GreenfootImage(((System.currentTimeMillis()-ticker)/1000)+" sec",30,Color.WHITE,Color.BLACK)),30,5);
        }
        else {
            getImage().drawImage((new GreenfootImage("30 sec",30,Color.WHITE,Color.BLACK)),30,5);
            Greenfoot.delay(10);
            Greenfoot.setWorld(new GameOver());
        }
    }
    
   
}
