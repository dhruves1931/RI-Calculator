
package ricalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseIBands implements ActionListener {


    JFrame jFrameIBands;
    JLabel jLabel;
    Font font,font2,font3;
    JButton jButtonIFourBand,jButtonIFiveBand,jback;

    public ChooseIBands(){

        font = new Font("Algerian",Font.BOLD,38);
        font2 = new Font("Aerial",Font.BOLD,25);
        font3 = new Font("Aerial",Font.BOLD,20);

        jFrameIBands = new JFrame();
        jFrameIBands.setBounds(0,0,500,400);
        jFrameIBands.setSize(1400, 750);
        jFrameIBands.getContentPane().setBackground(Color.black);
        jFrameIBands.setTitle("INDUCTANCE CALCULATOR");
        jFrameIBands.setVisible(true);
        jFrameIBands.setLayout(null);

        jLabel = new JLabel();
        jLabel.setBounds(550,50,350,100);
        jLabel.setText("CHOOSE ANY ONE");
        jLabel.setForeground(Color.white);
        jLabel.setFont(font);
        jLabel.setBorder(BorderFactory.createLineBorder(Color.white));

        jButtonIFourBand = new JButton();
        jButtonIFourBand.setText("4 BAND");
        jButtonIFourBand.setForeground(Color.black);
        jButtonIFourBand.setBackground(Color.LIGHT_GRAY);
        jButtonIFourBand.setBounds(600,250,200,50);
        jButtonIFourBand.setSize(250,100);
        jButtonIFourBand.setFont(font2);
        jButtonIFourBand.addActionListener(this);


        jButtonIFiveBand = new JButton();
        jButtonIFiveBand.setText("5 BAND");
        jButtonIFiveBand.setForeground(Color.black);
        jButtonIFiveBand.setBackground(Color.LIGHT_GRAY);
        jButtonIFiveBand.setBounds(600,450,200,50);
        jButtonIFiveBand.setSize(250,100);
        jButtonIFiveBand.setFont(font2);
        jButtonIFiveBand.addActionListener(this);

        jback = new JButton();
        jback.setText("BACK");
        jback.setForeground(Color.black);
        jback.setBackground(Color.LIGHT_GRAY);
        jback.setBounds(100,600,200,50);
        jback.setSize(100,60);
        jback.setFont(font3);
        jback.addActionListener(this);

        jFrameIBands.add(jLabel);
        jFrameIBands.add(jButtonIFourBand);
        jFrameIBands.add(jButtonIFiveBand);
        jFrameIBands.add(jback);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButtonIFourBand)
        {
            IfourBand FourBandObject = new IfourBand();
            jFrameIBands.dispose();
        }

        else  if (e.getSource() == jButtonIFiveBand)
        {
            InductanceFiveBand FiveBandObject = new InductanceFiveBand();
            jFrameIBands.dispose();
        }
        else if (e.getSource() == jback)
        {
            ChooseRI obj = new ChooseRI();
            jFrameIBands.dispose();
        }
    }
}