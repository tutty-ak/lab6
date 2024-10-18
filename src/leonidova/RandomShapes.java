package leonidova;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JPanel {

    private Shape[] shapes;

    public RandomShapes() {
        Random random = new Random();
        shapes = new Shape[20];
        for (int i = 0; i < shapes.length; i++) {
            int x = random.nextInt(400);
            int y = random.nextInt(400);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 10;
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = random.nextInt(50) + 10;
                int height = random.nextInt(50) + 10;
                shapes[i] = new Rectangle(color, x, y, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new RandomShapes());
        frame.setVisible(true);
    }
}