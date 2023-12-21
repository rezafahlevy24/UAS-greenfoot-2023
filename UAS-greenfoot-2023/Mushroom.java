import greenfoot.*;

public class Mushroom extends Actor
{
    GifImage gifImage = new GifImage("mushroom.gif");
    public void act() 
    {
        gifimage();
    }    
    
    public void gifimage()
    {
        setImage(gifImage.getCurrentImage());
    }
}
