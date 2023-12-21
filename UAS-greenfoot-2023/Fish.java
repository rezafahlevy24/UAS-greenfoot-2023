import greenfoot.*;

public class Fish extends Animal
{
    GifImage gifImage = new GifImage("fish.gif");
    Water game;
    int noOfShroomEaten = 0;
    public void act() 
    {
        super.move();
        move();
        checkKeys();
        eatShroom();
        gifimage();
    }
    public void move()
    {
        move(3+noOfShroomEaten);
        if(isAtEdge())
        {
            if (getX() == 0 )
                setLocation(799, getY());
            else if (getX() == 799 )
                setLocation(0, getY());
            else if (getY() == 0 )
                setLocation(getX(), 599);
            else if (getY() == 599 )
                setLocation(getX(),0);
               
        }
    }
    public void checkKeys()
    {
            if( Greenfoot.isKeyDown("left") )
                turn(-5);
            if( Greenfoot.isKeyDown("right") )
                turn(5);
    }
    public void eatShroom()
    {
        if( canSee(Mushroom.class) )
        {
            eat( Mushroom.class);
            noOfShroomEaten++;
            updateScore();
            createShroom();
        }
        if ( noOfShroomEaten == 100 )
        {
            World w = getWorld();
            w.addObject(new GameOver(), w.getWidth() / 2, w.getHeight() / 2);
            Greenfoot.stop();
        }
            
    }
    public void createShroom()
    {
        Mushroom m = new Mushroom();
        World w;
        w = getWorld();
        w.addObject(m, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
    }
    public void updateScore()
    {
        game.score++;
    }
    public void gifimage()
    {
        setImage(gifImage.getCurrentImage());
    }
}
