package Enums;

public enum Week
{
    ONE("Monday"),
    TWO("Tuesday"),
    THREE("Wednesday"),
    FOUR("Thursday"),
    FIVE("Friday"),
    SIX("Saturday"),
    SEVEN("Sunday");

    private String dayname;

    Week(String dayname){
        this.dayname = dayname;
    }

    public String getDayname(){
        return dayname;
    }
}
