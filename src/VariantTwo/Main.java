package VariantTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        int quantity;

        do {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить яблоки в коробку с яблоками");
            System.out.println("2. Добавить апельсины в коробку с апельсинами");
            System.out.println("3. Пересыпать яблоки в другую коробку");
            System.out.println("4. Пересыпать апельсины в другую коробку");
            System.out.println("5. Вывести вес коробок");
            System.out.println("0. Выйти");
            System.out.print("Ваш выбор: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Укажите количество яблок для добавления: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    appleBox.addFruits(new Apple(), quantity);
                    System.out.println("Яблоки добавлены.");
                    break;
                case "2":
                    System.out.print("Укажите количество апельсинов для добавления: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    orangeBox.addFruits(new Orange(), quantity);
                    System.out.println("Апельсины добавлены.");
                    break;
                case "3":
                    Box<Apple> anotherAppleBox = new Box<>();
                    appleBox.transferFruits(anotherAppleBox);
                    break;
                case "4":
                    Box<Orange> anotherOrangeBox = new Box<>();
                    orangeBox.transferFruits(anotherOrangeBox);
                    break;
                case "5":
                    System.out.println("Вес коробки с яблоками: " + String.format("%.2f", appleBox.getWeight()) + " кг.");
                    System.out.println("Вес коробки с апельсинами: " + String.format("%.2f", orangeBox.getWeight()) + " кг.");
                    break;
                case "0":
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Некорректный ввод. Пожалуйста, попробуйте снова.");
            }
        } while (!input.equals("0"));
        scanner.close();
    }
}
