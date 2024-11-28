//Лабораторная работа №4. Обработка строк. Коллекции. Регулярные выражения.
//При решении задач использовать:класс String, StringBuffer, коллекции, настраиваемые коллекции, регулярные выражения.
//Избегать, по возможности, “мелкой” работы на уровне отдельных символов.
//
//Дан HTML документ. Требуется удалить из него все HTML тэги, получив чистый текст.
//Полученный текст разбить на слова. Удалить и списка всех слов повторения;
//Отсортировать все слова по алфавиту и вывести на экран. Слова хранить в коллекции.

import java.nio.file.*;
import java.util.*;

public class HTMLProcessing {
    public static void main(String[] args) {
        try {
            // Чтение содержимого HTML-файла
            String filePath = "index.html"; // Укажите путь к вашему HTML-файлу
            String htmlDocument = Files.readString(Path.of(filePath));

            // Шаг 1: Удаление HTML-тегов
            String plainText = htmlDocument.replaceAll("<[^>]+>", " ");

            // Шаг 2: Разделение текста на слова
            String[] wordsArray = plainText.split("\\s+");

            // Шаг 3: Удаление дубликатов (использование TreeSet для сортировки и удаления дубликатов)
            Set<String> wordsSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
            Collections.addAll(wordsSet, wordsArray);

            // Удаление пустых строк (если они есть)
            wordsSet.removeIf(String::isEmpty);

            // Шаг 4: Вывод результата
            System.out.println("Уникальные слова в алфавитном порядке:");
            for (String word : wordsSet) {
                System.out.println(word);
            }

        } catch (Exception e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
