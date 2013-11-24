import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public abstract class StatusSubject extends Actor
{
   
   public abstract void register(int index,EggObserver observer);
   public abstract void unregister(EggObserver observer);
   public abstract void notifyObserver();
}
