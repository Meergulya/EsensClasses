package Enum;

public class CheckWeeks {

    public static void main(String[] args) {

        DaysinAWeek week = DaysinAWeek.MONDAY;

        switch(week){
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are great");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are  best");
            break;
        }



    }





}
