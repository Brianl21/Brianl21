import java.awt.*;

public class Rectangle {
    public static void main(String[] args)
    {
        java.awt.Rectangle box = new java.awt.Rectangle(50,50,100,100);
        System.out.print("box: ");
        System.out.println(box);

        // getWidth is an accessor method

        double width = box.getWidth();
        System.out.print("width: ");
        System.out.println(width);

        double height = box.getHeight();
        System.out.print("height: ");
        System.out.println(height);

        double x = box.getX();
        System.out.print("x: ");
        System.out.println(x);


        // Calling an accessor doesn't change the object

        System.out.print("box: ");
        System.out.println(box);

        // translate is a mutator method

        box.translate(-60,-75);

        // Calling a mutator changes the object.

        System.out.print("box: ");
        System.out.println(box);
    }
}

