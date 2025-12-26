package module1.conditionals;
import java.util.Scanner;
public class DayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day : ");
        String Day = sc.next();

        if (Day.equalsIgnoreCase("Monday") || Day.equalsIgnoreCase("Tuesday") || Day.equalsIgnoreCase("Wednesday")
                || Day.equalsIgnoreCase("Thursday") || Day.equalsIgnoreCase("Friday")
                || Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday")) {
            System.out.println("Input : " + Day + " is Valid day");

            if (Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday")) {
                System.out.println(Day + "Weekend");
            } else {
                System.out.println("Weekday");
            }
        } else {
            System.out.println("Invalid Day");
        }

        sc.close();

	}

}
