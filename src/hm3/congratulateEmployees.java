package hm3;


import java.time.LocalDate;

import static hm3.Holiday2.getHolidayForDate;

public class congratulateEmployees {
    public static void congratulateEmployees(Employee[] employees) {
        LocalDate today = LocalDate.of(2003,3,8);
        Holiday currentHoliday = getHolidayForDate(today);

        for (Employee employee : employees) {
            if (currentHoliday == Holiday.NEW_YEAR) {
                System.out.println("С Новым Годом, " + employee.getName() + "!");
            } else if (currentHoliday == Holiday.INTERNATIONAL_WOMENS_DAY && employee.getGender() == Gender.FEMALE) {
                System.out.println("С 8 Марта, " + employee.getName() + "!");
            } else if (currentHoliday == Holiday.DEFENDERS_OF_THE_FATHERLAND_DAY && employee.getGender() == Gender.MALE) {
                System.out.println("С Днем защитника Отечества, " + employee.getName() + "!");
            }
        }
    }
}



