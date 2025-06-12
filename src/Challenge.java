import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        validNumber("");
    }

    public static void validNumber(String y) {

        Scanner scanner = new Scanner(System.in);

        int orderNumber = 1;
        int sum = 1;

        do {
            System.out.println("Enter Number #" + orderNumber);
            String nextNumber = scanner.nextLine();

            try {
            int number = Integer.parseInt(nextNumber);
                orderNumber++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number");
            }

        } while (orderNumber < 6);

        System.out.println("The sum of the 5 numbers = " + sum);

        return;
    }

}
