package hm3;

import java.time.LocalDate;

class Manager extends Employee {
    public Manager(String name, LocalDate birthday, double salary, Gender gender) {
        super(name, birthday, salary, gender);
    }

    public static void raiseSalaries(Employee[] employees, double percent) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.raiseSalary(percent);
            }
        }
    }
}
