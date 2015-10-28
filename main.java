import java.awt.*;

/**
 * Created by purba on 23.10.2015.
 */
public class main  {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();

            }
        });
    }
}
