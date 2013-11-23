import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HenWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farm extends World
{

    /**
     * Constructor for objects of class HenWorld.
     * 
     */
    public Farm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Hen hen1 = new Hen();
        addObject(hen1, 182, 116);
        hen1.setLocation(52, 41);
        Hen hen2 = new Hen();
        addObject(hen2, 281, 30);
        hen2.setLocation(155, 41);
        Hen hen3 = new Hen();
        addObject(hen3, 320, 27);
        hen3.setLocation(274, 42);
        Hen hen4 = new Hen();
        addObject(hen4, 505, 97);
        hen4.setLocation(391, 41);
        Hen hen5 = new Hen();
        addObject(hen5, 526, 37);

        hen4.setLocation(792, 60);
        hen3.setLocation(565, 60);
        hen2.setLocation(332, 60);
        hen1.setLocation(115, 60);
        hen5.setLocation(1006, 60);

        BorderLine borderline = BorderLine.getInstance();
        addObject(borderline, 1110,30);
        borderline.setLocation(30, 710);

        Player player = new Player();
        addObject(player, 832, 395);
        player.setLocation(25, 579);

        Quit quit = new Quit();
        addObject(quit, 1038, 589);
        quit.setLocation(1034, 582);

        addObject(Bucket.getInstance(), 450, 403);

        borderline.setLocation(540, 708);
        borderline.setLocation(548, 531);
    }
}
