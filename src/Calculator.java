import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int a, b, value;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two Numbers");

        a = input.nextInt();
        b = input.nextInt();

        System.out.println("Please choose \n1 for Add \n2 for Subtract \n3 for Multiply \n4 for Divide ");
        value = input.nextInt();

        if (value == 1)
            System.out.println("Addition = " + (a + b));
        else if (value == 2)
            System.out.println("Subtraction = " + (a - b));
        else if (value == 3)
            System.out.println("Multiplication = " + (a * b));
        else if (value == 4)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Enter valid number");

        input.close();

    }
}