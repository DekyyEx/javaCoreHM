package hm3;

import java.time.LocalDate;

class Holiday2 {
    public static Holiday getHolidayForDate(LocalDate date) {
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();

        if (month == 1 && day == 1) {
            return Holiday.NEW_YEAR;
        } else if (month == 3 && day == 8) {
            return Holiday.INTERNATIONAL_WOMENS_DAY;
        } else if (month == 2 && day == 23) {
            return Holiday.DEFENDERS_OF_THE_FATHERLAND_DAY;
        }

        return Holiday.NONE;
    }
}