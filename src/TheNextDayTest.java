package src;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TheNextDayTest {

@Test
public void testInputDayNotExactlyWithLessThanMin(){
    int day = 32;
    int month = 2;
    int year = 2023;
    TheNextDay theNextDay = new TheNextDay(day, month, year );
    String expected = "Data day not exactly!";
    String actual = theNextDay.showNextDay();
    assertEquals(expected, actual);
}
    @Test
    public void testInputDayNotExactlyWithMoreThanMax(){
        int day = 32;
        int month = 3;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "Data day not exactly!";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayExactlyMinWithCommonYear(){
        int day = 1;
        int month = 1;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "2/1/2023";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void test1InputDayExactlyMax30WithCommonYear() {
        int day = 30;
        int month = 4;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "1/5/2023";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void test2InputDayExactlyMax30WithCommonYear() {
        int day = 30;
        int month = 6;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "1/7/2023";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void test3InputDayExactlyMax30WithCommonYear() {
        int day = 30;
        int month = 9;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "1/10/2023";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayExactlyMin30WithCommonYear() {
        int day = 1;
        int month = 9;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "2/9/2023";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void test1InputDayExactlyMax31WithCommonYear() {
        int day = 31;
        int month = 1;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "1/2/2023";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void test2InputDayExactlyMax31WithCommonYear() {
        int day = 31;
        int month = 3;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "1/4/2023";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void test3InputDayExactlyMax31WithCommonYear() {
        int day = 31;
        int month = 5;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "1/6/2023";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void test1InputDayExactlyMin31WithCommonYear() {
        int day = 1;
        int month = 5;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "2/5/2023";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void test2InputDayExactlyMin31WithCommonYear() {
        int day = 1;
        int month = 12;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "2/12/2023";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayMaxOfMonthFebruaryWithCommonYear() {
        int day = 29;
        int month = 2;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "Data day not exactly!";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayMinOfMonthFebruaryWithCommonYear() {
        int day = 1;
        int month = 2;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "2/2/2023";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayMinOfMonthFebruaryWithLeapYear() {
        int day = 1;
        int month = 2;
        int year = 2024;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "2/2/2024";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayMaxOfMonthFebruaryWithLeapYear() {
        int day = 28;
        int month = 2;
        int year = 2024;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "29/2/2024";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayEndOfTheYear(){
        int day = 31;
        int month = 12;
        int year = 2023;
        TheNextDay theNextDay = new TheNextDay(day, month, year );
        String expected = "1/1/2024";
        String actual = theNextDay.showNextDay();
        assertEquals(expected, actual);
    }
}
