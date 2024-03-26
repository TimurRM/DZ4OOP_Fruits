package VariantThree;


import java.util.ArrayList;



public class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();

    // Добавление заданного количества фруктов одного типа в коробку
    public void addFruits(T fruit, int quantity) {
        for (int i = 0; i < quantity; i++) {
            fruits.add(fruit);
        }
    }

    // Вычисление и получение веса коробки, суммируя веса всех фруктов внутри
    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    // Сравнение веса текущей коробки с весом другой коробки. Возвращает true, если веса равны
    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.001;
    }

    // Пересыпание фруктов из текущей коробки в другую коробку того же типа
    public void transferFruits(Box<T> otherBox) {
//        if (this == otherBox) {
//            System.out.println("Нельзя пересыпать фрукты в ту же самую коробку.");
//            return;
//        }
        if (this.fruits.isEmpty()) {
            System.out.println("Пересыпание невозможно: коробка пуста.");
            return;
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
        System.out.println("Фрукты успешно пересыпаны.");
    }
}