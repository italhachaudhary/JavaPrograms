import java.util.Scanner;

public class AverageAndTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveNumber, temp, total = 0;
        float average;

        System.out.println("Enter a Positive Number: ");
        positiveNumber = input.nextInt();

        System.out.println("Enter Values: ");
        for (int i = 1; i <= positiveNumber; i++) {
            temp = input.nextInt();
            total += temp;
        }

        average = total / positiveNumber;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        input.close();
    }
}
