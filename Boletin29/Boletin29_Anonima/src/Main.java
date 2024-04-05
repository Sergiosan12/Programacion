import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        final String[] message = {"Mensaje personalizado"};
        final int[] count = {0};
        final int[] activationCount = {0};


        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (activationCount[0] >= 10) {
                    ((Timer) evt.getSource()).stop();
                    System.exit(0);
                } else {
                    if (count[0] >= 5) {
                        message[0] = "Mensaje cambiado";
                    }
                    System.out.println(message[0]);
                    count[0]++;
                    activationCount[0]++;
                }
            }
        };

        Timer timer = new Timer(2000, taskPerformer);
        timer.setRepeats(true);
        timer.start();


        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}