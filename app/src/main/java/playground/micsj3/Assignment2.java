package playground.micsj3;

import javax.swing.*;

class NewFrame extends JFrame {
    public NewFrame() {
        this.setTitle("New Frame");
        this.setSize(1200, 800);
        this.setVisible(true);
    }
}

public class Assignment2 {
    public void execute() {
        new NewFrame();
    }
}