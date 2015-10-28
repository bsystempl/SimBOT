import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel {
    public BackgroundPanel() {
        setPreferredSize(new Dimension(400, 400));
    }

    private BufferedImage image;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // prostokat
        Rectangle2D rectangle = new Rectangle2D.Double(10, 10, 560, 340);


        File imageFile = new File("logo.jpg");
        try {
            image = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.err.println("Blad odczytu obrazka");
            e.printStackTrace();
        }

        Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
        setPreferredSize(dimension);


        g2d.drawImage(image, 0,0, this);
        g2d.draw(rectangle);

    }
}