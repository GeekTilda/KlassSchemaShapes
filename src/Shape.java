import java.awt.*;

public class Shape {
    Color color;
    double xCord;
    double yCord;

    public Shape() {}

    public Shape(Color color, double xCord, double yCord) {
        this.color = color;
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public void draw() {}

    public void erase() {}

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move() {}

    public void zoom(double db2) {}
}
