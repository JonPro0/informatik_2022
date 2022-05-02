package eisdiele_projekt;

import javax.swing.*;

public class Eisdiele extends JFrame{
    private JPanel pMain;
    private JPanel pKunde;
    private JPanel pEisdieler;
    private JButton bSorte1;
    private JButton bSorte2;
    private JButton bSorte3;
    private JButton bSorte4;
    private JButton bSorte5;
    private JButton bSorte6;
    private JButton bSorte7;
    private JTextArea tName;
    private JLabel pInfo;
    private JLabel pInfo2;
    private JLabel pInfo3;

    public Eisdiele (){
        super("ZellEisdiele");
        setDefaultCloseOperation(EXIT_ON_CLOSE);




        add(pMain);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
