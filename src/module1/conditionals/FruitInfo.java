package module1.conditionals;
import java.util.Scanner;
public class FruitInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Fruit name : ");
        String fruit = sc.next();

        switch (fruit) {
            case "apple":
                System.out.println("Apples are rich in fiber and vitamin c");
                break;

            case "banana":
                System.out.println("bananas are rich in potasium");
                break;

            case "mango":
                System.out.println("mangos are king of fruits");
                break;

            case "orange":
                System.out.println("oranges are rich in vitmin c");
                break;

            default:
                System.out.println("Sorry, I don't have information about that fruit");
                break;

        }
        sc.close();
	}

}
