import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AppMisiones extends JFrame {
    private GestorMisiones gestorMisiones;
    private JComboBox<String> cmbMisiones;


    public AppMisiones() {
        gestorMisiones = new GestorMisiones();
        cmbMisiones = new JComboBox<>();

        setTitle("Planificación y seguimiento de misiones espaciales");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1)); // Cambiar a GridLayout

        JButton btnCrearMision = new JButton("Crear misión");
        JButton btnAsignarNave = new JButton("Asignar nave");
        JButton btnAsignarTripulacion = new JButton("Asignar tripulación");
        JButton btnVerEstado = new JButton("Ver estado de la misión");
        JButton btnTrayectoria = new JButton("Ver trayectoria de la misión");

        // Agregar los botones al panel
        buttonPanel.add(btnCrearMision);
        buttonPanel.add(btnAsignarNave);
        buttonPanel.add(btnAsignarTripulacion);
        buttonPanel.add(btnVerEstado);
        buttonPanel.add(btnTrayectoria);

        // Agregar el panel de botones al JFrame
        add(buttonPanel);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();

                switch (source.getText()) {
                    case "Crear misión":
                        new CrearMision(gestorMisiones);
                        break;
                    case "Asignar nave":
                        new AsignarNave(gestorMisiones);
                        break;
                    case "Asignar tripulación":
                        new AsignarTripulacion(gestorMisiones);
                        break;
                    case "Ver estado de la misión":
                        String nombreMisionReciente = gestorMisiones.getNombreMisionReciente();
                        if (nombreMisionReciente != null) {
                            InformeMisiones informeMisiones = new InformeMisiones(nombreMisionReciente);
                            informeMisiones.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay ninguna misión reciente para mostrar su informe.");
                        }
                        break;
                    case "Ver trayectoria de la misión":
                        SimuladorMisiones simuladorMisiones = new SimuladorMisiones();
                        JFrame frame = new JFrame("Trayectoria de la misión");
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.add(simuladorMisiones);
                        frame.setSize(450, 400);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                        break;
                }
            }
        };

        // Asignar el ActionListener a los botones
        btnCrearMision.addActionListener(actionListener);
        btnAsignarNave.addActionListener(actionListener);
        btnAsignarTripulacion.addActionListener(actionListener);
        btnVerEstado.addActionListener(actionListener);
        btnTrayectoria.addActionListener(actionListener);

        setVisible(true);
    }
}