import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Colores extends JFrame {
    private JComboBox<String> cajaColores;
    private JPanel colorPanel;

    public Colores() {
        setLayout(new FlowLayout());

        String[] colors = {"Elige Color", "Rojo", "Verde", "Azul"};
        cajaColores = new JComboBox<>(colors);
        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(100, 100));

        add(cajaColores);
        add(colorPanel);

        cajaColores.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                switch (cajaColores.getSelectedItem().toString()) {
                    case "Rojo":
                        colorPanel.setBackground(Color.RED);
                        break;
                    case "Verde":
                        colorPanel.setBackground(Color.GREEN);
                        break;
                    case "Azul":
                        colorPanel.setBackground(Color.BLUE);
                        break;
                    default:
                        colorPanel.setBackground(Color.WHITE);
                        break;
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
    }
}