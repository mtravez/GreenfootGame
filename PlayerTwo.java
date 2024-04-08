import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTwo extends Actor
{
    /**
     * Act - do whatever the PlayerTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int fallSpeed = 1;
    private int xMoveSpeed = 3;
    public void act()
    {
        if (Greenfoot.isKeyDown("right")) {
            this.setLocation(this.getX() + xMoveSpeed, this.getY());
        }
        else if (Greenfoot.isKeyDown("left")) {
            this.setLocation(this.getX() - xMoveSpeed, this.getY());
        }
        
    }
}
