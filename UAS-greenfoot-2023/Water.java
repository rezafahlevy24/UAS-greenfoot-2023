import greenfoot.*;

public class Water extends World
{
    Counter counter = new Counter();
    public static int lives = 1;
    public static int score = 0;
    
    public Water()
    {    
        super(800, 600, 1); 
        prepare();
    }
    
    public void act(){
        if (lives < 1) {
            Greenfoot.setWorld(new End());
        }
    }
    
    public void prepare()
    {
        Fish fish = new Fish();
        Dolphin dolphin = new Dolphin();
        Dolphin dolphin2 = new Dolphin();
        Dolphin dolphin3 = new Dolphin();
        Mushroom mushroom = new Mushroom();
        Mushroom mushroom2 = new Mushroom();
        Mushroom mushroom3 = new Mushroom();
        Mushroom mushroom4 = new Mushroom();
        Mushroom mushroom5 = new Mushroom();
        addObject(fish, 396, 280);
        addObject(dolphin, 317, 68);
        addObject(dolphin2, 136, 325);
        addObject(dolphin3, 520, 434);
        addObject(mushroom, 603, 129);
        addObject(mushroom2, 675, 441);
        addObject(mushroom3, 77, 451);
        addObject(mushroom4, 148, 117);
        addObject(mushroom5, 330, 502);
        
        addObject(counter, 58, 41);
        counter.setLocation(59, 22);
    }
    
    public void Spawn(){
        
    }

}
