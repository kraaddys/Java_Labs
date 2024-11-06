// Main.java
public class Main {
    public static void main(String[] args) {
        RectangularTable[] tables = {
                new RectangularTable(4.5, 3.5),
                new RectangularTable(2, 1.2),
                new RectangularTable(1.8, 0.9),
                new RectangularTable(8.5, 3.5),
                new RectangularTable(1.2, 0.8),
                new RectangularTable(2.2, 1.4)
        };

        System.out.println("Tables Information:");
        for (int i = 0; i < tables.length; i++) {
            System.out.println("Table " + (i + 1));
            System.out.println(tables[i].toString());
            System.out.println("Can fit 9 people? " + (tables[i].canFitPeople(9) ? "Yes" : "No"));
            System.out.println();
        }

        if (tables[0].getLength() > tables[3].getLength()) {
            System.out.println("Length of Table 1 is bigger than Table 4.");
        } else if (tables[0].getLength() < tables[3].getLength()) {
            System.out.println("Length of Table 4 is bigger than Table 1.");
        } else {
            System.out.println("Length of Table 1 and Table 4 are equal.");
        }
    }
}
