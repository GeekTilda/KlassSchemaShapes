import java.awt.*;

public class Circle extends Shape {
    double radius;

    public Circle() {}

    public Circle(Color color, double xCord, double yCord, double radius) {
        super(color, xCord, yCord);
        this.radius = radius;
    }

    public void draw() {}

    public void erase() {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void zoom(double db2) {}

    @Override
    public String toString() {
        return "CIRCLE. Color: " + color + " | X-Coordinate: " + xCord + " | Y-Coordinate: " + yCord + " | Radius: " + radius;
    }
}
