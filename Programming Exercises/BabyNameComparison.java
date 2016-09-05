import java.util.Scanner;

/**
 * Created by Graeme on 29/08/2016.
 */
public class BabyNameComparison {
    public static void main(String[] args) {
        String name1, name2, name3;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name: ");
        name1 = in.nextLine();
        System.out.print("Enter second name: ");
        name2 = in.nextLine();
        System.out.print("Enter third name: ");
        name3 = in.nextLine();
        System.out.println("The combination of names are: \n" +
                name1 + " " + name2 + "\n" +
                name1 + " " + name3 + "\n" +
                name2 + " " + name1 + "\n" +
                name2 + " " + name3 + "\n" +
                name3 + " " + name1 + "\n" +
                name3 + " " + name2);
    }


}
