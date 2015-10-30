import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MyFrame extends JFrame {
    public MyFrame() {
        super("SIMBOT V1");
        JPanel panel = new BackgroundPanel();
        JTextField text = new JTextField();
        JButton ok = new JButton();

        File imageFile = new File("logo.jpg");
        Image image = GenerateImage.toImage(true); //this generates an image file
        JLabel thumb = new JLabel();
        thumb.setIcon(image);
        panel.add(text);
        panel.add(ok);

        ok.setText("OK");
        ok.setEnabled(true);
        text.setPreferredSize(new Dimension(200, 24));
        add(panel);


        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(592,400);
    }

}