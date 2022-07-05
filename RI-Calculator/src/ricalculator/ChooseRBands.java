
package ricalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChooseRBands implements ActionListener {


    JFrame jFrameRBands;
    JLabel jLabel;
    Font font,font2,font3;
    JButton jButtonRThreeBand,jButtonRFourBand,jButtonRFiveBand,jButtonRSixBand,jback;

    public ChooseRBands(){

        font = new Font("Algerian",Font.BOLD,40);
        font2 = new Font("Aerial",Font.BOLD,25);
        font3 = new Font("Aerial",Font.BOLD,20);

        jFrameRBands = new JFrame();
        jFrameRBands.setBounds(0,0,500,400);
        jFrameRBands.setSize(1400, 750);
        jFrameRBands.getContentPane().setBackground(Color.black);
        jFrameRBands.setTitle("R-I CALCULATOR");
        jFrameRBands.setVisible(true);
        jFrameRBands.setLayout(null);

        jLabel = new JLabel();
        jLabel.setBounds(550,50,495,100);
        jLabel.setText("CHOOSE ANY ONE BAND");
        jLabel.setForeground(Color.white);
        jLabel.setFont(font);
        jLabel.setBorder(BorderFactory.createLineBorder(Color.white));

        jButtonRThreeBand = new JButton();
        jButtonRThreeBand.setText("3 BAND");
        jButtonRThreeBand.setForeground(Color.black);
        jButtonRThreeBand.setBackground(Color.LIGHT_GRAY);
        jButtonRThreeBand.setBounds(500,250,200,50);
        jButtonRThreeBand.setSize(200,100);
        jButtonRThreeBand.setFont(font2);
        jButtonRThreeBand.addActionListener(this);

        jButtonRFourBand = new JButton();
        jButtonRFourBand.setText("4 BAND");
        jButtonRFourBand.setForeground(Color.black);
        jButtonRFourBand.setBackground(Color.LIGHT_GRAY);
        jButtonRFourBand.setBounds(850,250,200,50);
        jButtonRFourBand.setSize(200,100);
        jButtonRFourBand.setFont(font2);
        jButtonRFourBand.addActionListener(this);

        jButtonRFiveBand = new JButton();
        jButtonRFiveBand.setText("5 BAND");
        jButtonRFiveBand.setForeground(Color.black);
        jButtonRFiveBand.setBackground(Color.LIGHT_GRAY);
        jButtonRFiveBand.setBounds(500,450,200,50);
        jButtonRFiveBand.setSize(200,100);
        jButtonRFiveBand.setFont(font2);
        jButtonRFiveBand.addActionListener(this);

        jButtonRSixBand = new JButton();
        jButtonRSixBand.setText("6 BAND");
        jButtonRSixBand.setForeground(Color.black);
        jButtonRSixBand.setBackground(Color.LIGHT_GRAY);
        jButtonRSixBand.setBounds(850,450,200,50);
        jButtonRSixBand.setSize(200,100);
        jButtonRSixBand.setFont(font2);
        jButtonRSixBand.addActionListener(this);

        jback = new JButton();
        jback.setText("BACK");
        jback.setForeground(Color.black);
        jback.setBackground(Color.LIGHT_GRAY);
        jback.setBounds(100,600,200,50);
        jback.setSize(100,60);
        jback.setFont(font3);
        jback.addActionListener(this);

        jFrameRBands.add(jLabel);
        jFrameRBands.add(jButtonRThreeBand);
        jFrameRBands.add(jButtonRFourBand);
        jFrameRBands.add(jButtonRFiveBand);
        jFrameRBands.add(jButtonRSixBand);
        jFrameRBands.add(jback);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButtonRThreeBand)
        {
            ResistanceThreeBand RThreeBandObject = new ResistanceThreeBand();
            jFrameRBands.dispose();
        }
        else if (e.getSource() == jButtonRFourBand)
        {
            GUI RFourBandObject = new GUI();
            jFrameRBands.dispose();
        }
        else  if (e.getSource() == jButtonRFiveBand)
        {
            ResistanceFiveBand RFiveBandObject = new ResistanceFiveBand();
            jFrameRBands.dispose();
        }
        else if (e.getSource() == jButtonRSixBand)
        {
            ResistanceSixBand RSixBandObject = new ResistanceSixBand();
            jFrameRBands.dispose();
        }
        else if (e.getSource() == jback)
        {
            ChooseRI obj = new ChooseRI();
            jFrameRBands.dispose();
        }

    }
}