import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    public MyFrame() {
        super("SIMBOT V1");
        JPanel panel = new BackgroundPanel();

        add(panel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(592,400);
    }
}