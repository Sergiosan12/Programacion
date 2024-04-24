
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SimuladorMisiones extends JPanel {
    private static final int NUM_PUNTOS = 100;
    private int[] xPoints = new int[NUM_PUNTOS];
    private int[] yPoints = new int[NUM_PUNTOS];

    public SimuladorMisiones() {
        Random random = new Random();
        for (int i = 0; i < NUM_PUNTOS; i++) {
            xPoints[i] = random.nextInt(400);
            yPoints[i] = random.nextInt(400);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawPolyline(xPoints, yPoints, NUM_PUNTOS);
    }
}