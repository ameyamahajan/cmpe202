import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Button extends Actor
{
    public abstract void setSuccessor(Button button);
    public abstract void actionHandler();
}
