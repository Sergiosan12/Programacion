import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParkingGUI {
    private Parking parking;
    private JFrame frame;
    private JTextArea textArea;

    public ParkingGUI() {
        parking = new Parking(10);
        frame = new JFrame("Sistema de Gestión de Parking");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        textArea = new JTextArea();
        frame.add(new JScrollPane(textArea), "Center");

        JPanel panel = new JPanel();
        JButton btnIntroducir = new JButton("Introducir Vehículo");
        JButton btnSacar = new JButton("Sacar Vehículo");
        JButton btnComprobar = new JButton("Comprobar Estado");
        JButton btnSalir = new JButton("Salir");

        panel.add(btnIntroducir);
        panel.add(btnSacar);
        panel.add(btnComprobar);
        panel.add(btnSalir);
        frame.add(panel, "South");

        btnIntroducir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipo = JOptionPane.showInputDialog("Ingrese el tipo de vehículo (coche/camion):");
                String id = JOptionPane.showInputDialog("Ingrese el ID del vehículo:");
                Vehiculo vehiculo;
                if (tipo.equalsIgnoreCase("coche")) {
                    vehiculo = new Coche(id);
                } else if (tipo.equalsIgnoreCase("camion")) {
                    vehiculo = new Camion(id);
                } else {
                    JOptionPane.showMessageDialog(frame, "Tipo de vehículo no válido.");
                    return;
                }
                parking.introducirParking(vehiculo);
            }
        });

        btnSacar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = JOptionPane.showInputDialog("Ingrese el ID del vehículo a retirar:");
                parking.sacarParking(id);
            }
        });

        btnComprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                parking.comprobarParking();
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ParkingGUI();
            }
        });
    }
}
