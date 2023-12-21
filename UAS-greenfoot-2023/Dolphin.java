import greenfoot.*;

public class Dolphin extends Animal
{
    Water game;
    
    public void act() 
    {
        super.move();
        checkEdge();
        randomTurn();
        eatFish();
    }
    public void randomTurn()
    {
        if( Greenfoot.getRandomNumber(100) < 30 )
            turn( Greenfoot.getRandomNumber(30) - 10 );    
    }
    public void checkEdge()
    {
        if( isAtEdge() )
        {
            turn(10);
        }
    }
    public void eatFish()
    {
        if( canSee(Fish.class) )
        {
            eat(Fish.class);
            game.lives--;
            
        }
    }
}
