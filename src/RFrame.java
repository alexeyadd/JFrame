import javax.swing.*;

public class RFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame jFrame = new JFrame();
            jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            jFrame.setSize(500, 400);
            jFrame.setLocationRelativeTo(null);

            jFrame.setVisible(true);
        });
    }
}
