package hm3;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
    private final String name;
    private final LocalDate birthdate;
    private double salary;
    private Gender gender;

    public Employee(String name, LocalDate birthdate, double salary, Gender gender) {
        this.name = name;
        this.birthdate = birthdate;
        this.salary = salary;
        this.gender = gender;
    }

    // Повышение зарплаты сотрудника
    public void raiseSalary(double percent) {
        this.salary *= (1 + percent / 100);
    }

    public double getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return birthdate.compareTo(o.birthdate);
    }
}

