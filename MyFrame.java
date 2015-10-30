import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        super("SIMBOT V1");
        JPanel panel = new BackgroundPanel();
        JTextField text = new JTextField();
        JButton ok = new JButton();

        panel.add(text);
        panel.add(ok);

        ok.setText("OK");
        ok.setEnabled(false);
        text.setPreferredSize(new Dimension(200, 24));
        add(panel);


        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(592,400);
    }

}