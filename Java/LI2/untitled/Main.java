// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Инициализация массивов K и M
            MDouble[] K = MDouble.initializeArray(5, scanner, "K");
            MDouble[] M = MDouble.initializeArray(5, scanner, "M");

            // Вычисление массива L: li = ki / mi
            MDouble[] L = MDouble.calculateLArray(K, M);
        }
    }
}
//Лабораторная работа №3. Создание и обработка собственных исключений. В программе требуется:
// Создать собственное исключение (class)0
// Создать метод (throw), который может возбуждать это исключение(throw)
// Написать метод, перехватывающий и обрабатывающий исключение (try-catch), возбуждаемое другим методом
// Создать класс MDouble, который ведет себя как double, но не допускает значений NEGATIVE_INFINITY и NaN.
// Получение этих значений рассматривать как исключительную ситуацию. Вместо значений NEGATIVE_INFINITY записывать -99999.
// Вместо значений NaN записывать 0. Рассмотреть задачу: заданы два массива произвольных значений типа MDouble K и M.
// Получить третий массив L: li = ki/mi;
