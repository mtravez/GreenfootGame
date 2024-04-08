import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Player player;
    BirdSpawner bs;

    PlayerTwo player2;
    public void partOne() {
        player = new Player();
        bs = new BirdSpawner();
        addObject(player, 50, getHeight() / 2);
        addObject(bs, 0, 0);
    }
    
    public void partTwo() {
        this.removeObject(player);
        this.removeObject(bs);
        player2 = new PlayerTwo();
        addObject(player2, player2.getImage().getWidth() / 2, getHeight() - player2.getImage().getHeight() / 2);
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        partOne();
    }
}
