import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Life extends EggObserver
{
    
    public void update(World farm, int count){
      //  if ((getWorld().getObjects(Player.class).size() - Math.floor(count)) > 0){
        if (count > 1)
            addLife(farm);
        else if (count == 0)
            removeLife(farm);
        else 
            ;
     
        
    }  
    
    
    
    private void addLife(World farm){
        System.out.println("Adding life --> " + getWorld().getObjects(Player.class).size()+1);
        switch(getWorld().getObjects(Player.class).size()){
            case 0:
            Player player0 = new Player();
            farm.addObject(player0, 369, 525);
            player0.setLocation(25, 577);
            farm.repaint();
            break;
             case 1:
            Player player1 = new Player();
            farm.addObject(player1, 369, 525);
            player1.setLocation(75, 577);
            farm.repaint();
            break;
             case 2:
            Player player2 = new Player();
            farm.addObject(player2, 369, 525);
            player2.setLocation(125, 577);
            farm.repaint();
            break;
             case 3:
            Player player3 = new Player();
            farm.addObject(player3, 369, 525);
            player3.setLocation(175, 577);
            farm.repaint();
            break;
             case 4:
            Player player4 = new Player();
            farm.addObject(player4, 369, 525);
            player4.setLocation(225, 577);
            farm.repaint();
            break;
            default:
            farm.repaint();
            
        }
    }
    
    
    private void removeLife(World farm){
        
        System.out.println("Lost white eggs -> " + farm.getObjects(Player.class).size());
        farm.removeObject((Actor)farm.getObjects(Player.class).get(0));
        farm.repaint();
    }
}
