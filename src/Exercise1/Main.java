package Exercise1;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        String fruit;
        Basket fruits = new Basket();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("grapes");
        fruits.add("apple");
        fruits.add("pear");
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the fruit you seek");
        fruit = scanner.nextLine();
        System.out.println(String.format("The fruit %s is in the basket: %b ", fruit, fruits.find(fruit)));
        System.out.println("Enter the fruit you want to remove");
        fruit = scanner.nextLine();
        System.out.println(String.format("The fruit %s removed from basket: %b ", fruit, fruits.remove(fruit)));
        System.out.println("Enter the fruit you want to see position");
        fruit = scanner.nextLine();
        System.out.println(String.format("The fruit %s position in basket: %d ", fruit,
                (fruits.position(fruit) >= 0) ? fruits.position(fruit) : null));
        System.out.println(fruits.distict());
        System.out.println("Enter the fruit you want to add");
        fruit = scanner.nextLine();
        System.out.println(String.format("The fruit %s added to basket: %b ", fruit, fruits.add(fruit)));
        System.out.println("Number of fruits in the basket " + fruits.count());
        System.out.println("Number of fruits in the basket with custom count " + fruits.customCount());
        System.out.println(fruits.basket());
    }
}
