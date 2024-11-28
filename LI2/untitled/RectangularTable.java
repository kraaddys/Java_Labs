// RectangularTable.java
public class RectangularTable extends Rectangle {
    public RectangularTable(double length, double width) {
        super(length, width);
    }

    public double calculateTableArea() {
        return calculateArea();
    }

    public boolean canFitPeople(int numPeople) {
        double spaceRequired = numPeople * 0.85;
        double availableSpace = (length - 0.85) * (width - 0.85); // Учитываем, что каждому человеку нужно 0.85м от края стола
        return spaceRequired <= availableSpace;
    }

    public String toString() {
        return "Dimensions: " + length + "m x " + width + "m\n" +
                "Area: " + calculateTableArea() + " sq.m\n";
    }
}
