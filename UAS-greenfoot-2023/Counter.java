import greenfoot.*;
import java.awt.*;

public class Counter extends Actor
{
    Water game;
    public void act()
    {
        setImage(new GreenfootImage("Skor: " + game.score,28,greenfoot.Color.GREEN,greenfoot.Color.BLUE));
    }
}
