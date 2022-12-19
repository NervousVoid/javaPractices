package Image;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;


public class ImgWindow {
    public static void main(String args[]) throws IOException {
        JFrame frame = new JFrame("Thomas Shelby");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize( new Dimension(491,665));
        frame.getContentPane().add(new JPanelWithBackground("/Users/nervous_void/Yandex.Disk.localized/PC DESKTOP-00S89MD/Study/Java/Pr5/src/Image/shelby.JPG"));

        frame.pack();
        frame.setVisible(true);
    }
}