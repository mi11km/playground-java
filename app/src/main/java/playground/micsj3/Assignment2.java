package playground.micsj3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OmikujiFrame extends JFrame implements ActionListener {
    private final JLabel label;

    public OmikujiFrame() {
        this.setTitle("Omikuji Frame");
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b = new JButton("おみくじを引く");
        this.add(b, BorderLayout.SOUTH);
        label = new JLabel("おみくじ", JLabel.CENTER);
        this.add(label, BorderLayout.CENTER);
        b.addActionListener(this);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double r = Math.random();
        if (r > 0.7) {
            label.setText("Good!");
        } else if (r > 0.2) {
            label.setText("So so");
        } else {
            label.setText("Bad...");
        }
    }

    public static void main(String[] args) {
        new OmikujiFrame();
    }
}

public class Assignment2 {
    public void execute() {
        new OmikujiFrame();
    }
}