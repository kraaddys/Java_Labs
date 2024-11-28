// Rectangle.java
public class Rectangle extends Side {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double calculateArea() {
        return length * width;
    }
}
