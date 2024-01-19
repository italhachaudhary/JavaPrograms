import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, sum;

        System.out.print("Enter two numbers: ");

        a = input.nextInt();
        b = input.nextInt();

        sum = a + b;
        System.out.println("The Sum : " + sum);

        input.close();

    }
}