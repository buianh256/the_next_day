package src;

public class TheNextDay {
    public static final int January = 1;
    public static final int March = 3;
    public static final int May = 5;
    public static final int July = 7;
    public static final int August = 8;
    public static final int October = 10;
    public static final int December = 12;
    public static final int April = 4;
    public static final int June = 6;
    public static final int September = 9;
    public static final int November = 11;
    public static final int February = 2;
    public static final int LAST_DAY_OF_LEAP_YEAR = 29;
    public static final int LAST_DAY_OF_COMMON_YEAR = 28;
    public static final int LAST_DAY_OF_MONTH_30_DAY = 30;
    public static final int LAST_DAY_OF_MONTH_31_DAY = 31;
    private int day;
    private int month;
    private int year;
    public TheNextDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public  String showNextDay() {
        String message = "";
        switch (getMonth()) {
            case January:
            case March:
            case May:
            case July:
            case August:
            case October:
            case December:
                message = get31DayConditions();
                break;
            case April:
            case June:
            case September:
            case November:
                message = get30DayConditions();
                break;
            case February:
                message = getFebruaryConditions();
                break;
                default:
                    message = "Thang khong hop le!";
        }
        return message;
    }

    private String getFebruaryConditions() {
        int nextDay = this.day + 1;
        int nextMonth = this.month + 1;
        String firstDay = "1";
        String message = "";
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = getYear() % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = getYear() % 100 == 0;
            if(isDivisibleBy100) {
                boolean isDivisibleBy400 = getYear() % 400 == 0;
                if(isDivisibleBy400)
                    isLeapYear = true;
            }else{
                isLeapYear = true;
            }
        }
        if (isLeapYear){
            if(getDay() < LAST_DAY_OF_LEAP_YEAR){
                message = nextDay + "/" + getMonth() + "/" + getYear();
            }else if (getDay() == LAST_DAY_OF_LEAP_YEAR){
                message = firstDay + "/" + nextMonth + "/" + getYear();
            }else {
                message = "Data day not exactly!";
            }
        }else {
            if(getDay() < LAST_DAY_OF_COMMON_YEAR){
                message = nextDay + "/" + getMonth() + "/" + getYear();
            }else if (getDay() == LAST_DAY_OF_COMMON_YEAR){
                message = firstDay + "/" + nextMonth + "/" + getYear();
            }else {
                message = "Data day not exactly!";
            }
        }
        return message;
    }

    private String get30DayConditions() {
        int nextDay = this.day + 1;
        int nextMonth = this.month + 1;
        String firstDay = "1";
        String message = "";
        if (getDay() < LAST_DAY_OF_MONTH_30_DAY) {
            message = nextDay + "/" + getMonth() + "/" + getYear();
        } else if (getDay() == LAST_DAY_OF_MONTH_30_DAY) {
            message = firstDay + "/" + nextMonth + "/" + getYear();
        }else {
            message = "Data day not exactly!";
        }
        return message;
    }

    private String get31DayConditions() {
        int nextDay = this.day + 1;
        int nextMonth = this.month + 1;
        int nextYear = this.year + 1;
        String firstDay = "1";
        String firstMonth = "1";
        String message = "";
        if (getDay() < LAST_DAY_OF_MONTH_31_DAY) {
            message = nextDay + "/" + getMonth() + "/" + getYear();
        } else if (getDay() == LAST_DAY_OF_MONTH_31_DAY ) {
            if(getMonth() == December) {
                message = firstDay + "/" + firstMonth + "/" + nextYear;
            }else {
                message = firstDay + "/" + nextMonth + "/" + getYear();
            }
        } else {
            message = "Data day not exactly!";
        }
        return message;
    }

}
