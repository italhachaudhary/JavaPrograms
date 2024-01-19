import java.util.Scanner; //import the Scanner class

public class InputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object

        System.out.println("Enter a number: ");
        int a = input.nextInt(); // read user input and store it in a variable
        System.out.println(a);

        input.close(); // close the Scanner object
    }
}
