import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public abstract class StatusSubject extends Actor
{
    public EggObserver eggObserver[] = {new Life(), new Score()};
    
   public void register(EggObserver observer){}
   public void unregister(EggObserver observer){}
   public abstract void notifyObserver();
}
