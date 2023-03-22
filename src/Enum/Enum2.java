package Enum;

import java.util.Arrays;

public class Enum2 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.Friday);
        today.daysInfo();
        WeekDays2 w1 = WeekDays2.Friday;
        WeekDays2 w2 = WeekDays2.Friday;
        WeekDays2 w3 = WeekDays2.Monday;
//        System.out.println(WeekDays.Friday.equals(WeekDays2.Friday));
//        System.out.println(w1==w3);
        WeekDays2 w15 = WeekDays2.valueOf("Monday");

        WeekDays2[] array = WeekDays2.values();
        System.out.println(Arrays.toString(array));

    }
}

enum WeekDays2 {
    Monday("bad"),
    Tuesday("bad"),
    Wednesday("so-so"),
    Thursday("so-so"),
    Friday("good"),
    Saturday("great"),
    Sunday("great");
    private String mood;

    private WeekDays2(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class Today2 {
    WeekDays2 weekDay;

    public Today2(WeekDays2 weekDay) {
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
        System.out.println("Dispozitia in ziua aceasta"
                + weekDay.getMood());
    }
}

