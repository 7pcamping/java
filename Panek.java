import javax.swing.*;
import java.awt.*;
public class PanelExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame("PanekExample");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the panel
        JPanel panel =new JPanel();
        panel.setLayout(new GridLayout(2,2));

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
