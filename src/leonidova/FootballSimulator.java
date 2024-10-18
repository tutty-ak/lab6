package leonidova;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballSimulator extends JFrame {
    private int scoreMilan = 0;
    private int scoreMadrid = 0;

    private JButton btnMilan = new JButton("AC Milan");
    private JButton btnMadrid = new JButton("Real Madrid");
    private JLabel lblResult = new JLabel("Result: 0 X 0");
    private JLabel lblLastScorer = new JLabel("Last Scorer: - ");
    private JLabel lblWinner = new JLabel("Winner: DRAW");

    public FootballSimulator() {
        setTitle("Football Match");
        setSize(400, 200);
        setLayout(new GridLayout(4, 1));

        add(lblResult);
        add(lblLastScorer);
        add(lblWinner);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnMilan);
        buttonPanel.add(btnMadrid);
        add(buttonPanel);

// Event listeners for buttons
        btnMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan++;
                updateMatchInfo("AC Milan");
            }
        });

        btnMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid++;
                updateMatchInfo("Real Madrid");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void updateMatchInfo(String lastScorer) {
        lblResult.setText("Result: " + scoreMilan + " X " + scoreMadrid);
        lblLastScorer.setText("Last Scorer: " + lastScorer);

        if (scoreMilan > scoreMadrid) {
            lblWinner.setText("Winner: AC Milan");
        } else if (scoreMadrid > scoreMilan) {
            lblWinner.setText("Winner: Real Madrid");
        } else {
            lblWinner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new FootballSimulator();
    }
}