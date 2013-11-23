import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Menu extends World
{

    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
   
    private void prepare()
    {

        Play play = new Play();
        addObject(play, 69, 45);
        Back back = new Back();
        addObject(back, 470, 356);
        Help help = new Help();
        addObject(help, 492, 137);
        
        
        
    }
}

   
    

