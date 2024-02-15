import javax.swing.*;

public class Test {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);

        JButton button = new JButton("Press");
        frame.add(button);

    }
}