package VariantThree;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>(); // Вторая коробка для яблок
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>(); // Вторая коробка для апельсинов
        Scanner scanner = new Scanner(System.in);
        String input;
        int quantity;

        do {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить яблоки в коробку с яблоками");
            System.out.println("2. Добавить апельсины в коробку с апельсинами");
            System.out.println("3. Пересыпать яблоки из коробки в другую коробку");
            System.out.println("4. Пересыпать апельсины из коробки в другую коробку");
            System.out.println("5. Сравнить вес обеих коробок с яблоками");
            System.out.println("6. Сравнить вес обеих коробок с апельсинами");
            System.out.println("7. Вывести вес всех коробок");
            System.out.println("0. Выйти");
            System.out.print("Ваш выбор: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Укажите количество яблок для добавления: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    appleBox1.addFruits(new Apple(), quantity);
                    System.out.println("Яблоки добавлены в первую коробку.");
                    break;
                case "2":
                    System.out.print("Укажите количество апельсинов для добавления: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    orangeBox1.addFruits(new Orange(), quantity);
                    System.out.println("Апельсины добавлены в первую коробку.");
                    break;
                case "3":
                    appleBox1.transferFruits(appleBox2);
                    //System.out.println("Яблоки пересыпаны из первой коробки во вторую.");
                    break;
                case "4":
                    orangeBox1.transferFruits(orangeBox2);
                    //System.out.println("Апельсины пересыпаны из первой коробки во вторую.");
                    break;
                case "5":
                    if (appleBox1.compare(appleBox2)) {
                        System.out.println("Вес коробок с яблоками равен.");
                    } else {
                        System.out.println("Вес коробок с яблоками различается.");
                    }
                    break;
                case "6":
                    if (orangeBox1.compare(orangeBox2)) {
                        System.out.println("Вес коробок с апельсинами равен.");
                    } else {
                        System.out.println("Вес коробок с апельсинами различается.");
                    }
                    break;
                case "7":
                    System.out.println("Вес первой коробки с яблоками: " + String.format("%.2f", appleBox1.getWeight()) + " кг.");
                    System.out.println("Вес второй коробки с яблоками: " + String.format("%.2f", appleBox2.getWeight()) + " кг.");
                    System.out.println("Вес первой коробки с апельсинами: " + String.format("%.2f", orangeBox1.getWeight()) + " кг.");
                    System.out.println("Вес второй коробки с апельсинами: " + String.format("%.2f", orangeBox2.getWeight())+ " кг.");
                    break;
                case "0":
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Некорректный ввод. Пожалуйста, попробуйте снова.");
            }
        } while (true);
    }
}

