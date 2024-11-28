public class Main {
    public static void main(String[] args) {
        // Создаём объект с разными типами
        GenericConstructor<String, Integer> obj = new GenericConstructor<>("Hello", 123);
        obj.displayFields();

        // Ещё один пример
        GenericConstructor<Double, Boolean> obj2 = new GenericConstructor<>(3.14, true);
        obj2.displayFields();
    }
}