import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BirdSpawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BirdSpawner extends Actor
{
    private long spawnTimer = Greenfoot.getRandomNumber(200) + 100;
    public void act()
    {
        if (spawnTimer <= 0)
        {
            World world = this.getWorld();
            world.addObject(new Bird(), world.getWidth(), Greenfoot.getRandomNumber(world.getHeight()));
            spawnTimer = Greenfoot.getRandomNumber(200) + 100;
        }
        else
            spawnTimer--;
    }
}
