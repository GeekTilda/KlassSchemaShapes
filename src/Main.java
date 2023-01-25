import javax.swing.plaf.IconUIResource;
import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int circles = 0;
        int rectangles = 0;

        try {
            System.out.println("How many circles do you want?");
            circles = sc.nextInt();
            System.out.println("How many rectangles do you want?");
            rectangles = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Enter number! ex. 1, 2, 3. NOT one, two, three");
        }

        if (circles >= 1) {
            System.out.println("CIRCLES: ");
        }

        ArrayList<Circle> circleList = new ArrayList<>();
        for (int i = 0; i < circles; i++) {
            System.out.println("Which color do you want? ");
            String color = sc.next().toLowerCase();
            double xCord = 0;
            double yCord = 0;
            double radius = 0;
            try {
                System.out.println("What's the circles X-coordinate? ");
                xCord = sc.nextDouble();
                System.out.println("What's the circles Y-coordinate? ");
                yCord = sc.nextDouble();
                System.out.println("What's the circles radius? ");
                radius = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Write in numbers! ex. 1, 2, 3. NOT one, two, three.");
                e.printStackTrace();
            }
            Circle circle = new Circle(daColor(color),xCord,yCord,radius);
            circleList.add(circle);
            System.out.println(circle);
        }

        if (rectangles >= 1) {
            System.out.println("RECTANGLES: ");
        }

        ArrayList<Rectangle> rectangleList = new ArrayList<>();
        for (int i = 0; i < rectangles; i++) {
            System.out.println("Which color do you want? ");
            String color = sc.next().toLowerCase();
            double xCord = 0;
            double yCord = 0;
            double height = 0;
            double width = 0;
            try {
                System.out.println("What's the rectangles X-coordinate? ");
                xCord = sc.nextDouble();
                System.out.println("What's the rectangles Y-coordinate? ");
                yCord = sc.nextDouble();
                System.out.println("What's the rectangles height? ");
                height = sc.nextDouble();
                System.out.println("What's the rectangles width? ");
                width = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Write in numbers! ex. 1, 2, 3. NOT one, two, three.");
                e.printStackTrace();
            }
            Rectangle rectangle = new Rectangle(daColor(color),xCord,yCord,height,width);
            rectangleList.add(rectangle);
            System.out.println(rectangle);
        }

        /* HÅRDKOD:
        Circle circle1 = new Circle(Color.blue,50,40,2);
        System.out.println(circle1);
        Circle circle2 = new Circle(Color.cyan, 75, 20,4);
        System.out.println(circle2);

        Rectangle rectangle1 = new Rectangle(Color.pink,10,20,5,2);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(Color.orange, 20,30,4,8);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(Color.gray,90,30,20,30);
        System.out.println(rectangle3);
        Rectangle rectangle4 = new Rectangle(Color.magenta,90,100,50,50);
        System.out.println(rectangle4);
        */
    }
    public static Color daColor(String colour) {
        Color color;
        try {
            Field field = Color.class.getField(colour);
            color = (Color)field.get(null);
        } catch (Exception e) {
            color = null;
        }
        return color;
    }
}