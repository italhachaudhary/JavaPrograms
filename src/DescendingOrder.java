import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start, end;

        System.out.println("Enter Starting and Ending Values: ");
        start = input.nextInt();
        end = input.nextInt();

        System.out.println("Output: ");

        for (int i = start; i >= end; i--) {

            System.out.println(i);

        }

        input.close();

    }

}