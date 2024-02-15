import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double randBox = Math.random();
        Scanner input = new Scanner(System.in);
        int dieVal = (int) (randBox * 6) + 1;
        System.out.println(dieVal);

        int a = input.nextInt();
        System.out.println(a);

        input.close();
    }
}
