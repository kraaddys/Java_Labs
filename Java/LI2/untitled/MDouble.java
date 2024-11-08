import java.util.Scanner;

public class MDouble {
    private final double value; // Сделали значение `final`, чтобы убрать предупреждение

    // Конструктор, который проверяет на наличие исключительных значений
    public MDouble(double value) throws InvalidMDoubleException {
        if (Double.isNaN(value)) {
            this.value = 0; // Замена NaN на 0
        } else if (value == Double.NEGATIVE_INFINITY) {
            this.value = -99999; // Замена NEGATIVE_INFINITY на -99999
        } else {
            this.value = value;
        }
    }

    public double getValue() {
        return value;
    }

    // Метод деления, который может выбросить исключение
    public static MDouble divide(MDouble a, MDouble b) throws InvalidMDoubleException {
        /*if (b.getValue() == 0) {
            throw new InvalidMDoubleException("Division by zero is not allowed in MDouble.");
        }*/
        return new MDouble(a.getValue() / b.getValue());
    }

    // Метод для инициализации массива
    public static MDouble[] initializeArray(int size, Scanner scanner, String arrayName) {
        MDouble[] array = new MDouble[size];
        System.out.println("Введите значения для массива " + arrayName + ":");
        for (int i = 0; i < size; i++) {
            System.out.print(arrayName + "[" + i + "]: ");
            try {
                array[i] = new MDouble(scanner.nextDouble());
            } catch (InvalidMDoubleException e) {
                System.out.println("Ошибка при инициализации: " + e.getMessage());
                try {
                    array[i] = new MDouble(0); // Задаем значение 0 при ошибке
                } catch (InvalidMDoubleException ex) {
                    // Этот блок теоретически недостижим, так как значение 0 корректно
                }
            }
        }
        return array;
    }

    // Метод для вычисления массива L
    public static MDouble[] calculateLArray(MDouble[] K, MDouble[] M) {
        MDouble[] L = new MDouble[K.length];
        for (int i = 0; i < K.length; i++) {
            try {
                L[i] = MDouble.divide(K[i], M[i]);
                System.out.println("L[" + i + "] = " + L[i].getValue());
            } catch (InvalidMDoubleException e) {
                System.out.println("Ошибка при делении: " + e.getMessage());
                try {
                    L[i] = new MDouble(0); // Устанавливаем значение в 0 при ошибке
                } catch (InvalidMDoubleException ex) {
                    // Этот блок теоретически недостижим, так как значение 0 корректно
                }
            }
        }
        return L;
    }
}



