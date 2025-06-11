import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        validNumber("");
    }

    public static void validNumber(String y) {

        int orderNumber = 1;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Number #" + orderNumber);

        if (!numberChecker(scanner.nextLine())) {
            System.out.println("Invalid Number");
        }
        else {
        orderNumber++; }
        } while (orderNumber < 6);

        return;
    }

    public static boolean numberChecker(String y) {

        int x = Integer.parseInt(y);
        return x == 15 || x == 30 || x == 45 || x == 60 || x == 75;
    }
}
