import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameWorld extends World
{

    SimpleTimer appleTimer = new SimpleTimer();
    
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 480, 1);
        appleTimer.mark();
        
    }
    
    public void act(){
        if(appleTimer.millisElapsed() > 3000){
            spawnApple();
            appleTimer.mark();
        }
    }
    
    public void spawnApple(){
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(new Apple(), x, y);
    }
}
