
package ricalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseRI implements ActionListener {

    JFrame jFrameChooseRI;
    JLabel jLabel, jLabelFactText1, jLabelFactText2;
    Font font,font2, font3;
    JButton jButtonInductance,jButtonResistance;

    public ChooseRI(){


        font = new Font("Algerian",Font.BOLD,38);
        font2 = new Font("Aerial",Font.BOLD,25);
        font3 = new Font("Aerial",Font.BOLD,15);

        jFrameChooseRI = new JFrame();
        jFrameChooseRI.setBounds(0,0,500,400);
        jFrameChooseRI.getContentPane().setBackground(Color.black);
        jFrameChooseRI.setSize(1400, 750);
        jFrameChooseRI.setTitle("R-I CALCULATOR");
        jFrameChooseRI.setVisible(true);
        jFrameChooseRI.setLayout(null);

        jLabel = new JLabel();
        jLabel.setBounds(550,40,350,100);
        jLabel.setText("CHOOSE ANY ONE");
        jLabel.setForeground(Color.white);
        jLabel.setFont(font);
        jLabel.setBorder(BorderFactory.createLineBorder(Color.white));

        jButtonInductance = new JButton();
        jButtonInductance.setText("INDUCTANCE");
        jButtonInductance.setForeground(Color.black);
        jButtonInductance.setBackground(Color.LIGHT_GRAY);
        jButtonInductance.setBounds(600,250,200,50);
        jButtonInductance.setSize(250,100);
        jButtonInductance.setFont(font2);
        jButtonInductance.addActionListener(this);


        jLabelFactText1 = new JLabel();
        jLabelFactText1.setText(" (Inductance is a property of an electric circuit by which an electromotive force is induced in it by a variation of current either in the circuit itself or in a neighboring circuit.)");
        jLabelFactText1.setBounds(100, 360, 1500, 20);
        jLabelFactText1.setForeground(Color.white);
        jLabelFactText1.setFont(font3);
        jFrameChooseRI.add(jLabelFactText1);



        jButtonResistance = new JButton();
        jButtonResistance.setText("RESISTANCE");
        jButtonResistance.setForeground(Color.black);
        jButtonResistance.setBackground(Color.LIGHT_GRAY);
        jButtonResistance.setBounds(600,450,200,50);
        jButtonResistance.setSize(250,100);
        jButtonResistance.setFont(font2);
        jButtonResistance.addActionListener(this);

        jLabelFactText2 = new JLabel();
        jLabelFactText2.setText("(Resistance is a measure of the opposition to current flow in an electrical circuit.)");
        jLabelFactText2.setBounds(450, 560, 1500, 20);
        jLabelFactText2.setForeground(Color.white);
        jLabelFactText2.setFont(font3);
        jFrameChooseRI.add(jLabelFactText2);



        jFrameChooseRI.add(jLabel);
        jFrameChooseRI.add(jButtonInductance);
        jFrameChooseRI.add(jButtonResistance);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButtonInductance)
        {
            ChooseIBands ChooseIBandsObject = new ChooseIBands();
            jFrameChooseRI.dispose();
        }
        else if (e.getSource() == jButtonResistance)
        {
            ChooseRBands ChooseRBandsObject = new ChooseRBands();
            jFrameChooseRI.dispose();
        }

    }
}