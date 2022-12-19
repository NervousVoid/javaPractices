package Examples;

import java.awt.*;
import javax.swing.*;
public class example2 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel= new JPanel();

        panel.setBackground(Color.GRAY);

        panel.setPreferredSize( new Dimension(200,300));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);

        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}