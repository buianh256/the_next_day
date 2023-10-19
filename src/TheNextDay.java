package src;

public class TheNextDay {
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
    public String showNextDay() {
        String message = "";
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                message = get31DayConditions();
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                message = get30DayConditions();
                break;
            case 2:
                message = getFebruaryConditions();
                break;
                default:
                    message = "Thang khong hop le!";
        }
        return message;
    }

    private String getFebruaryConditions() {
        String message = "";
        boolean isLeapYear = false;
        if (this.year % 4 == 0) {
            if(this.year % 100 == 0) {
                if(this.year % 400 == 0)
                    isLeapYear = true;
            }else{
                isLeapYear = true;
            }
        }
        if (isLeapYear){
            if(this.day < 29){
                message = (this.day + 1) + "/" + this.month + "/" + this.year;
            }else if (this.day == 29){
                this.day = 1;
                message = this.day + "/" + (this.month + 1) + "/" + this.year;
            }else {
                message = "khong hop le!";
            }
        }else {
            if(this.day < 28){
                message = (this.day + 1) + "/" + this.month + "/" + this.year;
            }else if (this.day == 28){
                this.day = 1;
                message = this.day + "/" + (this.month + 1) + "/" + this.year;
            }else {
                message = "khong hop le!";
            }
        }
        return message;
    }

    private String get30DayConditions() {
        String message = "";
        if (this.day < 30) {
            message = (this.day + 1) + "/" + this.month + "/" + this.year;
        } else if (this.day == 30) {
            this.day = 1;
            message = this.day + "/" + (this.month + 1) + "/" + this.year;
        }else {
            message = "Khong hop le!";
        }
        return message;
    }

    private String get31DayConditions() {
        String message = "";
        if (this.day < 31) {
            message = (this.day + 1) + "/" + this.month + "/" + this.year;
        } else if (this.day == 31 ) {
            if(this.month == 12) {
                this.day = 1;
                this.month = 1;
                message = this.day + "/" + this.month + "/" + (this.year + 1);
            }else {
                this.day = 1;
                message = this.day + "/" + (this.month + 1) + "/" + this.year;
            }
        } else {
            message = "Khong hop le!";
        }
        return message;
    }

}
