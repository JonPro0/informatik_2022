package eisdiele_projekt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eisdiele extends JFrame{
    private JPanel pMain;
    private JPanel pKunde;
    private JPanel pEisdieler;
    private JTextArea tName;
    private JLabel pInfo;
    private JLabel pInfo2;
    private JLabel pInfo3;
    private JTextArea tEis;
    private JLabel lName;
    private JLabel lEissorte;
    private JButton bBestellen;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private String kunde;
    private int kundenCounter = 1;

    public Eisdiele (){
        super("ZellEisdiele");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        bBestellen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!proofName()){
                    kunde = "Kunde" + kundenCounter;
                    kundenCounter++;
                } else {
                    kunde = tName.getText();
                }
                if (!proofIce()){
                    JOptionPane.showMessageDialog(null, "Du musst eine Eissorte eintagen!!");
                }
            }


        });


        add(pMain);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private boolean proofIce() {
        return tEis.getText() != null;
    }

    private boolean proofName() {
        return tName.getText() == null;
    }
}
