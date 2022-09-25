package Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String flower;
        Buquet flowers = new Buquet();
        flowers.add("trandafir");
        flowers.add("frezie");
        flowers.add("crin");
        System.out.println(flowers.getAll().toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the flower you want to add");
        flower = scanner.nextLine();
        System.out.println("Flower added: " + flowers.add(flower));
        System.out.println("Enter the flower you want to remove");
        flower = scanner.nextLine();
        System.out.println("Flower removed: " + flowers.remove(flower));
        System.out.println(flowers.getAll().toString());
    }
}
