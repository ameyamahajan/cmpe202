import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpBoard1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpBoard extends World
{

    /**
     * Constructor for objects of class HelpBoard1.
     * 
     */
    public HelpBoard()
    {    
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        
        Return xreturn = new Return();
        addObject(xreturn, 654, 553);
    }
}

