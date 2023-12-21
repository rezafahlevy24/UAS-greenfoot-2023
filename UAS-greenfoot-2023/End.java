import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class End extends World
{
    Water water = new Water();
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new GameOver(), 400, 300);
        addObject(new Counter(), 400, 340);
    }
    
    public void act(){
        if (Greenfoot.mouseClicked(this)) {
            water.lives = 1;
            water.score = 0;
            Greenfoot.setWorld(water);
        }
    }
}
