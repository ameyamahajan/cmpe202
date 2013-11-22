import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

   

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    /**Regresa la musica para poder detenerla*/
    
    
    /**Mi menu*/
    private void prepare()
    {

        Play play = new Play();
        addObject(play, 69, 45);
        //Quit quit = new Quit();
        //addObject(quit, 536, 382);
        Back back = new Back();
        addObject(back, 470, 356);
        Help help = new Help();
        addObject(help, 492, 137);
    }
}

   
    

