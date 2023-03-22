package Enum;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.Friday);
        today.daysInfo();
    }
}

enum WeekDays {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                System.out.println("Plecam la munca");
                break;
            case Saturday:
            case Sunday:
                System.out.println("Ne odihnim");
                break;

        }

    }
}