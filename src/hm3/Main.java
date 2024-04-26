package hm3;

import java.time.LocalDate;
import java.util.Arrays;

import static hm3.congratulateEmployees.congratulateEmployees;


public class Main {
    public static void main(String[] args) {
        // Создаем сотрудников
        Employee employee1 = new Employee("Oliver Williams ", LocalDate.of(2008, 2, 23), 560000, Gender.MALE);
        Employee employee2 = new Employee("Matthew Brown ", LocalDate.of(2003, 1, 12), 67000, Gender.MALE);
        // Создаем руководителя
        Manager manager = new Manager("Katy Miller", LocalDate.of(2000, 3, 8), 92000, Gender.FEMALE);
        // Создаем список сотрудников
        Employee[] employees = {employee1, employee2, manager};
        Arrays.sort(employees);
        // Выводим ЗП сотрудников до повышения
        System.out.println("ЗП перед повышением:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        // Повышаем ЗП всем сотрудникам на 10%
        Manager.raiseSalaries(employees, 10);
        // Выводим ЗП сотрудников после повышения
        System.out.println("\nЗП после повышения:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Поздравляем сотрудников в зависимости от текущего дня и пола
        congratulateEmployees(employees);
    }
}
