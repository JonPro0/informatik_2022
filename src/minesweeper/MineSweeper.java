package minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// t1p.de/uv4p
public class MineSweeper extends JFrame {
    private JPanel pMain;
    private JPanel pButtons;
    private JPanel pMinefield;
    private JButton restartButton;
    private JButton debugButton;
    private final int cols = 9;
    private final int rows = 9;
    private final FieldButton[] field;
    private final ImageIcon imgfield = new ImageIcon("media/field.png");
    private final ImageIcon imgMine0 = new ImageIcon("media/mine0.png");
    private final ImageIcon imgRed = new ImageIcon("media/red.png");
    private final ImageIcon imgMine = new ImageIcon("media/mine.png");

    public MineSweeper()  {
        super("Mr K.'s MineSweeper");
        pMinefield.setLayout(new GridLayout(rows, cols));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        field = new FieldButton[cols * rows];
        FieldButtonListener fbl = new FieldButtonListener();

        for (int i = 0; i < cols * rows; i++) {
            FieldButton fb = new FieldButton();
            fb.addActionListener(fbl);
            field[i] = fb;
            pMinefield.add(fb);
        }

        add(pMain);
        pack();
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setVisible(true);

        restartGame();
        restartButton.addActionListener(e -> restartGame());
        debugButton.addActionListener(e -> showAll());
    }

    private void restartGame() {
        Random gen = new Random();

        for (FieldButton fb : field) {
            fb.setName("L");
            fb.setIcon(imgfield);
        }

        // Setze Minen
        int mineCount = 10;
        for (int i = 0; i < mineCount; i++) {
            int mine = gen.nextInt(rows*cols);
            field[mine].setName("M");
        }
    }

    private void showAll() {
        for (FieldButton fb : field) {
            if(fb.getName().equals("L")){
                fb.setIcon(imgMine0);
            } else {
                fb.setIcon(imgMine);
            }
        }
    }

    public static void main(String[] args) {
        new MineSweeper();
    }

    class FieldButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            FieldButton fb = (FieldButton) e.getSource();
            //fb.setText(fb.getName());
            if(fb.getName().equals("L")){
                fb.setIcon(imgMine0);
            } else {
                fb.setIcon(imgRed);
                JOptionPane.showMessageDialog(null, "Du hast verloren!\n Drücke auf OK und das Spiel startet in 1 Sekunde neu:)");
                try {
                    Thread.sleep(1000);
                    restartGame();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

            }
        }
    }}

class FieldButton extends JButton {
    public FieldButton() {
        super();
    }
}
