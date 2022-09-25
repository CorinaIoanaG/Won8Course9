package Exercise3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        System.out.println(company.employ(new Person("Popescu Ioan", 43, "welder")));
        System.out.println(company.employ(new Person("Anghel Dorin", 31, "welder")));
        System.out.println(company.employ(new Person("Pop George", 25, "carpenter")));
        System.out.println(company.employ(new Person("Muresan Ioan", 29, "plummer")));
        System.out.println(company.employ(new Person("Chirila Tudor", 50, "manager")));
        System.out.println(company.employ(new Person("Bara Andrei", 38, "manager")));
        System.out.println(company.employ(new Person("Goje Calin", 41, "electrician")));

        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("Manager is: %s %d years", company.getManager().getName(), company.getManager().getAge()));

        System.out.println("Enter the profession you want to see employees");
        String input = scanner.next();
        for (Person item : company.getPersons(input)) {
            System.out.println(item.getName() + " " + item.getAge() + " years");
        }

        System.out.println("Enter the minimum age you want to see employees");
        int age = scanner.nextInt();
        for (Person item : company.getPersonsOlder(age)) {
            System.out.println(String.format("%s %d years %s", item.getName(), item.getAge(), item.getPosition()));
        }

        System.out.println("Enter the name you seek");
        input = scanner.next();
        for (Person item : company.getPerson(input)) {
            System.out.println(String.format("%s %d years %s", item.getName(), item.getAge(), item.getPosition()));
        }
    }

}
