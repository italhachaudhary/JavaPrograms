import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        float num1, num2, num3, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Three Numbers: ");
        num1 = input.nextFloat();
        num2 = input.nextFloat();
        num3 = input.nextFloat();

        result = (num1 * num2) / num3;

        System.out.println("The Answer is: " + result);

        input.close();
    }
}
