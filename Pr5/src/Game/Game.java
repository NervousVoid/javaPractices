package Game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Game {
    private static int score_milan = 0;
    private static int score_madrid = 0;

    public static void main(String args[]) {
        JFrame frame = new JFrame("Мальчики походят на качков");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel= new JPanel();

        panel.setBackground(Color.WHITE);

        panel.setPreferredSize( new Dimension(400,300));
        JButton btn_milan = new JButton("AC Milan");
        JButton btn_madrid = new JButton("Real Madrid");
        JLabel score = new JLabel("Result: 0 X 0", JLabel.CENTER);
        JLabel last = new JLabel("Last scorer: N/A", JLabel.LEFT);
        JLabel winner = new JLabel("Winner: DRAW", JLabel.RIGHT);
        panel.add(btn_milan);
        panel.add(score);
        panel.add(btn_madrid);
        panel.add(last);
        panel.add(winner);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

        btn_milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score_milan++;
                score.setText(String.format("Result: %d X %d", score_milan, score_madrid));
                last.setText("Last scorer: Milan");
                if (score_madrid > score_milan)
                    winner.setText("Winner: Madrid");
                else if (score_madrid < score_milan)
                    winner.setText("Winner: Milan");
                else
                    winner.setText("Winner: DRAW");
            }
        });

        btn_madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score_madrid++;
                score.setText(String.format("Result: %d X %d", score_milan, score_madrid));
                last.setText("Last scorer: Madrid");
                if (score_madrid > score_milan)
                    winner.setText("Winner: Madrid");
                else if (score_madrid < score_milan)
                    winner.setText("Winner: Milan");
                else
                    winner.setText("Winner: DRAW");
            }
        });
    }
}