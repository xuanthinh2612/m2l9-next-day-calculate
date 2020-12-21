import java.time.Year;

public class NextDayCalculator {

    public static final int FIRSTDAYOFMONTH = 1;
    public static final int LASTMONTHOFTHEYEAR = 12;
    public static final int FIRSTMONTHOFTHEYEAR = 1;
    public static int maxDayInMonth;

    public static String nextDay(int day, int month, int year) {
        calculateMaxDayInMonth(month, year);
        day++;
        if (day > maxDayInMonth) {
            day = FIRSTDAYOFMONTH;
            month++;
        }
        if (month> LASTMONTHOFTHEYEAR) {
            month = FIRSTMONTHOFTHEYEAR;
            year++;
        }
        return day + "-" + month + "-" + year;
    }

    private static void calculateMaxDayInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDayInMonth = 31;
                break;
            case 2:
                isLeapYear(year);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDayInMonth = 30;
                break;
        }
    }

    private static void isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    maxDayInMonth = 29;
                } else maxDayInMonth = 28;
            } else maxDayInMonth = 29;
        }

        maxDayInMonth = 28;
    }
}
