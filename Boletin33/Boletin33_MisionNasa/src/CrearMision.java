import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearMision extends JDialog {
    private JTextField txtNombre;
    private JTextField txtFechaLanzamiento;
    private JTextField txtObjetivos;
    private GestorMisiones gestorMisiones;

    public CrearMision(GestorMisiones gestorMisiones) {
        this.gestorMisiones = gestorMisiones;

        setTitle("Crear Misión");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));
        setLocationRelativeTo(null);

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Fecha de Lanzamiento:"));
        txtFechaLanzamiento = new JTextField();
        add(txtFechaLanzamiento);

        add(new JLabel("Objetivos:"));
        txtObjetivos = new JTextField();
        add(txtObjetivos);

        JButton btnCrear = new JButton("Crear");
        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mision mision = new Mision();
                mision.setNombre(txtNombre.getText());
                mision.setFechaLanzamiento(txtFechaLanzamiento.getText());
                mision.setObjetivos(txtObjetivos.getText());
                gestorMisiones.crearMision(mision.getNombre(), mision.getFechaLanzamiento(), mision.getObjetivos(), mision.getNaveEspacial(), mision.getMiembroTripulacion());
                dispose();
            }
        });
        add(btnCrear);

        setVisible(true);
    }
}