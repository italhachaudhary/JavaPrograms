import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers");
        a = input.nextInt();
        b = input.nextInt();

        if (a > b)
            System.out.println(a + " is Greater");

        else
            System.out.println(b + " is Greater");

        input.close();

    }
}