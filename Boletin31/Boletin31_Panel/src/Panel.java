import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel {
    private JProgressBar progressBar;
    private Timer timer;
    private int counter = 0;

    public Panel() {
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.X_AXIS));

        JButton playButton = new JButton("Play");
        JButton pauseButton = new JButton("Pause");
        JButton stopButton = new JButton("Stop");


        controlPanel.add(playButton);
        controlPanel.add(pauseButton);
        controlPanel.add(stopButton);

        JPanel keypadPanel = new JPanel(new GridLayout(3, 3));

        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            keypadPanel.add(button);
        }

        JFrame frame = new JFrame("Media Control Panel");
        frame.setLayout(new BorderLayout());

        frame.add(controlPanel, BorderLayout.SOUTH);
        frame.add(keypadPanel, BorderLayout.CENTER);

        progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        frame.add(progressBar, BorderLayout.NORTH);

        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



        timer = new Timer(1000, new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                progressBar.setValue(counter);

                if (counter >= 100) {
                    timer.stop();
                }
            }
        });

        playButton.addActionListener(e -> timer.start());
        pauseButton.addActionListener(e -> timer.stop());
        stopButton.addActionListener(e -> {
            timer.stop();
            counter = 0;
            progressBar.setValue(counter);
        });
    }
}
