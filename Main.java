package JavaMONEY;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            employees.add(generateEmployee());
        }

        System.out.println("Исходный список сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Сортировка с использованием компаратора по возрасту
        employees.sort(new AgeComparator());

        System.out.println("\nСписок сотрудников после сортировки по возрасту:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static final String[] names = {"Борис", "Алексей", "Маргарита", "Александр", "Иван", "Дмитрий", "Сергей", "Мария", "Михаил", "Лариса", "Святослав", "Вячеслав", "Олег", "Ксения", "Татьяна"};

    private static Employee generateEmployee() {
        String name = names[random.nextInt(names.length)];
        double hourlyRate = random.nextDouble() * 10;
        int age = random.nextInt(40) + 20;

        if (random.nextBoolean()) {
            return new Freelancer(name, hourlyRate, age);
        } else {
            int hoursWorked = random.nextInt(160);
            return new Worker(name, hourlyRate, hoursWorked);
        }
    }
}