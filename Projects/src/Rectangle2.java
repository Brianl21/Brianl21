import java.awt.Rectangle;

public class Rectangle2 {

        public static void main(String[] args) {
            Rectangle box = new Rectangle(50, 50, 100, 100);
            System.out.print("box: ");
            System.out.println(box);
            double width = box.getWidth();
            System.out.print("width: ");
            System.out.println(width);
            double height = box.getHeight();
            System.out.print("height: ");
            System.out.println(height);
            double x = box.getX();
            System.out.print("x: ");
            System.out.println(x);
            System.out.print("box: ");
            System.out.println(box);
            box.translate(-60, -75);
            System.out.print("box: ");
            System.out.println(box);
        }
    }
