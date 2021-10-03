package lab1;

public class Task10 {
    public static void main(final String[] args){
        final Day[] days = new Day[7];

        days[0] = new Day("Monday", new Weather("Snowy",0,60));
        days[1] = new Day("Tuesday", new Weather("Sunny",10,65));
        days[2] = new Day("Wednesday", new Weather("Cloudy",15,70));
        days[3] = new Day("Thursday", new Weather("Rainy",10,85));
        days[4] = new Day("Friday",new Weather( "Stormy",13,70));
        days[5] = new Day("Saturday",new Weather( "Sunny",16,65));
        days[6] = new Day("Sunday",new Weather( "Sunny",17,65));

        for(int i = 0; i < days.length;i++)
        {
            System.out.println(days[i]);
        }
    }
}
