//Обобщённые конструкторы: Создайте класс с обобщённым конструктором,
// который будет принимать параметры различных типов и устанавливать их в соответствующие поля класса.

class GenericConstructor<T, U> {
    private T firstField;  // Поле первого типа
    private U secondField; // Поле второго типа

    // Обобщённый конструктор
    public <X, Y> GenericConstructor(X firstValue, Y secondValue) {
        this.firstField = (T) firstValue; // Приведение типов
        this.secondField = (U) secondValue; // Приведение типов
    }

    public void displayFields() {
        System.out.println("First Field: " + firstField);
        System.out.println("Second Field: " + secondField);
    }
}

