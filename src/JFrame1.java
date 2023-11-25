import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class JFrame1 extends JFrame {

    public JFrame1(){
        setSize(400,500);
        setTitle("GUI PART 2");
        setLocation(600,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();



        setContentPane(contentPane);

    }
    public static void main(String[] args) {
        JFrame1 window = new JFrame1();
    }
}