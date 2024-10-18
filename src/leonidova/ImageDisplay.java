package leonidova;
import javax.swing.*;

public class ImageDisplay extends JFrame {
    public ImageDisplay(String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);
        add(imageLabel);

        setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            new ImageDisplay(args[0]);
        } else {
            System.out.println("Пожалуйста, укажите путь к изображению");
        }
    }
}