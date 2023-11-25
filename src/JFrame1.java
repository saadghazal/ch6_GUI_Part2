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
        contentPane.setLayout(new GridLayout(5,3));
        JLabel label = new JLabel("Label"); // creating label
        Font yaserFont = new Font("SanSerif",Font.ITALIC,40); // creating font
        Color originalColor = new Color(95, 189, 255); // creating the color with red , green ,blue
        label.setForeground(originalColor); // setting the original color to label
        label.setFont(yaserFont); // setting the created font to the label
        contentPane.add(label);//adding the label to the content pane
        JLabel label1 = new JLabel("Label1"); // creating label 1
        label1.setFont(yaserFont); // setting font to label 1
        label1.setForeground(originalColor.brighter()); // set the color that is brighter than the original color
        contentPane.add(label1);
        JLabel label2 = new JLabel("Label2"); // creating label
        label2.setFont(yaserFont); // setting font to label 2
        label2.setForeground(originalColor.darker());// set the color that is darker than the original color
        contentPane.add(label2);


        setContentPane(contentPane);

    }
    public static void main(String[] args) {
        JFrame1 window = new JFrame1();
    }
}