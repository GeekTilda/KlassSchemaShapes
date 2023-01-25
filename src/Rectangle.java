import java.awt.*;

public class Rectangle extends Shape {
    protected double height;

    protected double width;

    public Rectangle() {}

    public Rectangle(Color color, double xCord, double yCord, double height, double width) {
        super(color, xCord, yCord);
        this.height = height;
        this.width = width;
    }

    public void draw() {}

    public void erase() {}

    public void zoom(double db2) {}

    @Override
    public String toString() {
        return "RECTANGLE. Color: " + color + " | X-Coordinate: " + xCord + " | Y-Coordinate: " + yCord + " | Height: " + height + " | Width: " + width;
    }
}
