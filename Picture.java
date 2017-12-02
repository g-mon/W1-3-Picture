/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sunset1;
    private Square ground;
    private Square trunk;
    private Circle leaf;
    private Circle fruit;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        wall.changeColor("blue");
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();
        
        sunset1 = new Circle();
        sunset1.changeColor("red");
        sunset1.moveHorizontal(160);
        sunset1.moveVertical(-40);
        sunset1.changeSize(100);
        sunset1.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        ground = new Square();
        ground.changeSize(300);
        ground.moveVertical(180);
        ground.moveHorizontal(-60);
        ground.changeColor("green");
        ground.makeVisible();
        
        trunk = new Square();
        trunk.makeVisible();
        trunk.moveHorizontal(140);
        trunk.moveVertical(150);
        trunk.changeColor("black");
        
        leaf = new Circle();
        leaf.moveHorizontal(175);
        leaf.moveVertical(110);
        leaf.changeColor("green");
        leaf.makeVisible();
        
        fruit = new Circle();
        fruit.makeVisible();
        fruit.changeSize(10);
        fruit.changeColor("magenta");
        fruit.moveHorizontal(170);
        fruit.moveVertical(120);
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    /**
     * Make the sun set and the fruit fall
     */
    public void sunSet()
    {
        sunset1.makeInvisible();
        sun.slowMoveHorizontal(-180);
        ground.makeVisible();
        sun.slowMoveVertical(200);
        ground.makeVisible();
        fruitDrop();
    }
    /**
     * Make the sun rise and the fruit regrow
     */
    public void sunRise()
    {
        sun.slowMoveHorizontal(180);
        sun.slowMoveVertical(-200);
        sunset1.makeVisible();
        sun.makeVisible();
        fruitRegrow();
    }
    /**
     * Make the fruit drop to the ground
     */
    public void fruitDrop()
    {
        fruit.slowMoveVertical(60);
    }
    /**
     * Make the fruit regrow, using the same object for the fruit
     */
    public void fruitRegrow()
    {
        fruit.makeInvisible();
        fruit.moveVertical(-60);
        fruit.makeVisible();
    }
    /**
     * Move the whole picture by a specified amount
     */
    public void shift(int distance)
    {
        wall.moveHorizontal(distance);
        window.moveHorizontal(distance);
        roof.moveHorizontal(distance);
        sun.moveHorizontal(distance);
        sunset1.moveHorizontal(distance);
        ground.moveHorizontal(distance);
        trunk.moveHorizontal(distance);
        leaf.moveHorizontal(distance);
        fruit.moveHorizontal(distance);
    }
   
    
}
