import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    @DisplayName("1-1-2018")
    void testNextDay112018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected ="2-1-2018" ;
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(result,expected);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("31-1-2018")
    void testNextDay3112018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected ="1-2-2018" ;
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("30-4-2018")
    void testNextDay3042018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected ="1-5-2018" ;
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("28-2-2018")
    void testNextDay2822018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected ="1-3-2018" ;
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("29-2-2020")
    void testNextDay2922020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected ="1-3-2020" ;
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("31-12-2018")
    void testNextDay31122019() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected ="1-1-2019" ;
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected, result);
    }
}