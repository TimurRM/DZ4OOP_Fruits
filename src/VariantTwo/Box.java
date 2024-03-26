package VariantTwo;

import java.util.ArrayList;

class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();

    // Добавление фруктов в коробку
    public void addFruits(T fruit, int quantity) {
        for (int i = 0; i < quantity; i++) {
            fruits.add(fruit);
        }
    }
    // Получение веса коробки
    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.weight;
        }
        return weight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.001;
    }

    // Пересыпание фруктов
    public void transferFruits(Box<T> otherBox) {
        if (this == otherBox) {
            System.out.println("Нельзя пересыпать фрукты в ту же самую коробку.");
            return;
        }
        if (this.fruits.isEmpty()) {
            System.out.println("Пересыпание невозможно: коробка пуста.");
            return;
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
        System.out.println("Фрукты успешно пересыпаны.");
    }
}