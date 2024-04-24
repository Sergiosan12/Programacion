import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InformeMisiones extends JFrame {
    public InformeMisiones(String nombreMision) {
        setTitle("Reporte de la misión: " + nombreMision);
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombreMision + ".txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line);
                textArea.append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        setVisible(true);
    }
}
