import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            getWorld().removeObject(this);
        }
    }
}
