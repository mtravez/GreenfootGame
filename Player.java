import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int fallSpeed = 1;
    private int yMoveSpeed = 3;
    private boolean isAlive = true;
    
    public boolean getIsAlive(){
        return this.isAlive;
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("down")) {
            this.setLocation(this.getX(), this.getY() + yMoveSpeed);
        }
        else if (Greenfoot.isKeyDown("up")) {
            this.setLocation(this.getX(), this.getY() - yMoveSpeed);
        }
        else
            this.setLocation(this.getX(), this.getY() + fallSpeed);
        
        Actor bird;
        bird = getOneObjectAtOffset(0, 0, Bird.class);
        if (bird != null)
        {
            //this.getWorld().stopped();
            Greenfoot.stop();
        }
    }
}
