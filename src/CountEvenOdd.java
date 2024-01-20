import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count1 = 0, count2 = 0;

        System.out.println("Enter Numbers: ");

        for (int i = 1; i <= 5; i++) {
            num = input.nextInt();
            if (num % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println(count1 + " Numbers are Even");
        System.out.println(count2 + " Numbers are Odd");

        input.close();
    }
}
