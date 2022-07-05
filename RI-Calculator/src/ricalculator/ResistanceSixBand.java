package ricalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

public class ResistanceSixBand implements ActionListener {
    JFrame jFrame;
    JLabel jLabel, jLabelFactText1, jLabelFactText2;
    Font font;
    JTextField jTextField;
    JTextField jTextFieldB1, jTextFieldB2, jTextFieldB3, jTextFieldMultiplier, jTextFieldTolarance, jTextFieldRValue, jTextFieldMinRange, jTextFieldMaxRange, jTextFieldTemperature;

    JButton jButton;
    JButton jButtonCalculate, jButtonReset, jButtonExit, jback;
    JButton jButtonBlack, jButtonBlackB2, jButtonBlackB3, jButtonBlackMul, jButtonBlackTemp;
    JButton jButtonBrown, jButtonBrownB2, jButtonBrownB3, jButtonBrownMul, jButtonBrownTol, jButtonBrownTemp;
    JButton jButtonRed, jButtonRedB2, jButtonRedB3, jButtonRedMul, jButtonRedTol, jButtonRedTemp;
    JButton jButtonOrange, jButtonOrangeB2, jButtonOrangeB3, jButtonOrangeMul, jButtonOrangeTol, jButtonOrangeTemp;
    JButton jButtonYellow, jButtonYellowB2, jButtonYellowB3, jButtonYellowMul, jButtonYellowTol, jButtonYellowTemp;
    JButton jButtonGreen, jButtonGreenB2, jButtonGreenB3, jButtonGreenMul, jButtonGreenTol, jButtonGreenTemp;
    JButton jButtonBlue, jButtonBlueB2, jButtonBlueB3, jButtonBlueMul, jButtonBlueTol, jButtonBlueTemp;
    JButton jButtonViolet, jButtonVioletB2, jButtonVioletB3, jButtonVioletMul, jButtonVioletTol, jButtonVioletTemp;
    JButton jButtonGrey, jButtonGreyB2, jButtonGreyB3, jButtonGreyMul, jButtonGreyTol, jButtonGreyTemp;
    JButton jButtonWhite, jButtonWhiteB2, jButtonWhiteB3, jButtonWhiteMul, jButtonWhiteTemp;
    JButton jButtonGold, jButtonGoldMul, jButtonGoldTol, jButtonGoldTemp;
    JButton jButtonSilver, jButtonSilverMul, jButtonSilverTol, jButtonSilverTemp;
    JButton jButtonNone, jButtonNoneTol, jButtonNoneTemp;


    public ResistanceSixBand() {

        font = new Font("Consolas", Font.BOLD, 28);

        jFrame = new JFrame();
        jFrame.setBounds(0,0,500,400);
        jFrame.setSize(1400, 750);
        jFrame.setTitle("Resistor Calculator");
        jFrame.setVisible(true);
        jFrame.setLayout(null);   // In default, the GUI is divided in various grid boxes. jFrame.setLayout(null); erases all those grids. In other words, null layout means absolute positioning - you have to do all the work in your code. No layout manager to help you out.

        jLabel = new JLabel();
        jLabel.setBounds(450, 10, 450, 30);
        jLabel.setText("6 BAND RESISTANCE CALCULATOR ");
        jLabel.setFont(font);
        jLabel.setBorder(BorderFactory.createLineBorder(Color.black));

        jFrame.add(jLabel); // Frame is just a plane. We put(add) different lables, buttons etc on the frame using .add



//----------------------------------------


//COLOUR BUTTONS

        jLabelFactText1 = new JLabel();
        jLabelFactText1.setText("Note: the 6th color band represents the TCR (Temperature Co-efficient of Resistance). The most common color for the sixth band is brown (100 ppm/K), which means that for every 10℃ ");
        jLabelFactText1.setBounds(10, 640, 1500, 15);
        jFrame.add(jLabelFactText1);

        jLabelFactText2 = new JLabel();
        jLabelFactText2.setText("change in temperature, the resistance value changes by 0.1%.");
        jLabelFactText2.setBounds(10, 660, 1500, 15);
        jFrame.add(jLabelFactText2);






        jLabel = new JLabel();
        jLabel.setBounds(55, 80, 100, 30);
        jLabel.setText("1st Band");
        jFrame.add(jLabel);

        jButtonBlack = new JButton();
        jButtonBlack.setText("BLACK");
        jButtonBlack.setForeground(white);
        jButtonBlack.setBackground(black);
        jButtonBlack.setBounds(5, 110, 100, 30);
        jButtonBlack.setSize(150, 30);
        jFrame.add(jButtonBlack);
        jButtonBlack.addActionListener(this);


        jLabel = new JLabel();
        jLabel.setBounds(205, 80, 100, 30);
        jLabel.setText("2nd Band");
        jFrame.add(jLabel);

        jButtonBlackB2 = new JButton();
        jButtonBlackB2.setText("0");
        jButtonBlackB2.setBackground(black);
        jButtonBlackB2.setForeground(white);
        jButtonBlackB2.setBounds(155, 110, 100, 30);
        jButtonBlackB2.setSize(150, 30);
        jFrame.add(jButtonBlackB2);
        jButtonBlackB2.addActionListener(this);

        jLabel = new JLabel();
        jLabel.setBounds(355, 80, 100, 30);
        jLabel.setText("3rd Band");
        jFrame.add(jLabel);

        jButtonBlackB3 = new JButton();
        jButtonBlackB3.setText("0");
        jButtonBlackB3.setBackground(black);
        jButtonBlackB3.setForeground(white);
        jButtonBlackB3.setBounds(305, 110, 100, 30);
        jButtonBlackB3.setSize(150, 30);
        jFrame.add(jButtonBlackB3);
        jButtonBlackB3.addActionListener(this);


        jLabel = new JLabel();
        jLabel.setBounds(505, 80, 100, 30);
        jLabel.setText("Multiplier");
        jFrame.add(jLabel);

        jButtonBlackMul = new JButton();
        jButtonBlackMul.setText("1");
        jButtonBlackMul.setBackground(black);
        jButtonBlackMul.setForeground(white);
        jButtonBlackMul.setBounds(455, 110, 100, 30);
        jButtonBlackMul.setSize(150, 30);
        jFrame.add(jButtonBlackMul);
        jButtonBlackMul.addActionListener(this);


        jLabel = new JLabel();
        jLabel.setBounds(655, 80, 100, 30);
        jLabel.setText("Tolerance");
        jFrame.add(jLabel);

        jButton = new JButton();
        jButton.setText("");
        jButton.setBackground(black);
        jButton.setForeground(white);
        jButton.setBounds(605, 110, 100, 30);
        jButton.setSize(150, 30);
        jFrame.add(jButton);



        jLabel = new JLabel();
        jLabel.setBounds(760, 80, 150, 30);
        jLabel.setText("Temperature Coefficient");
        jFrame.add(jLabel);

        jButtonBlackTemp = new JButton();
        jButtonBlackTemp.setText("250");
        jButtonBlackTemp.setBackground(black);
        jButtonBlackTemp.setForeground(white);
        jButtonBlackTemp.setBounds(755, 110, 100, 30);
        jButtonBlackTemp.setSize(150, 30);
        jFrame.add(jButtonBlackTemp);
        jButtonBlackTemp.addActionListener(this);

//-----------------------------------------------------------------

        jButtonBrown = new JButton();
        jButtonBrown.setText("BROWN");
        jButtonBrown.setForeground(white);
        jButtonBrown.setBackground(new Color(150,75,0));
        jButtonBrown.setBounds(5, 140, 100, 30);
        jButtonBrown.setSize(150, 30);
        jFrame.add(jButtonBrown);
        jButtonBrown.addActionListener(this);

        jButtonBrownB2 = new JButton();
        jButtonBrownB2.setText("1");
        jButtonBrownB2.setForeground(white);
        jButtonBrownB2.setBackground(new Color(150,75,0));
        jButtonBrownB2.setBounds(155, 140, 100, 30);
        jButtonBrownB2.setSize(150, 30);
        jFrame.add(jButtonBrownB2);
        jButtonBrownB2.addActionListener(this);

        jButtonBrownB3 = new JButton();
        jButtonBrownB3.setText("1");
        jButtonBrownB3.setForeground(white);
        jButtonBrownB3.setBackground(new Color(150,75,0));
        jButtonBrownB3.setBounds(305, 140, 100, 30);
        jButtonBrownB3.setSize(150, 30);
        jFrame.add(jButtonBrownB3);
        jButtonBrownB3.addActionListener(this);

        jButtonBrownMul = new JButton();
        jButtonBrownMul.setText("10");
        jButtonBrownMul.setForeground(white);
        jButtonBrownMul.setBackground(new Color(150,75,0));
        jButtonBrownMul.setBounds(455, 140, 100, 30);
        jButtonBrownMul.setSize(150, 30);
        jFrame.add(jButtonBrownMul);
        jButtonBrownMul.addActionListener(this);

        jButtonBrownTol = new JButton();
        jButtonBrownTol.setText("1%");
        jButtonBrownTol.setForeground(white);
        jButtonBrownTol.setBackground(new Color(150,75,0));
        jButtonBrownTol.setBounds(605, 140, 100, 30);
        jButtonBrownTol.setSize(150, 30);
        jFrame.add(jButtonBrownTol);
        jButtonBrownTol.addActionListener(this);

        jButtonBrownTemp = new JButton();
        jButtonBrownTemp.setText("100");
        jButtonBrownTemp.setForeground(white);
        jButtonBrownTemp.setBackground(new Color(150,75,0));
        jButtonBrownTemp.setBounds(755, 140, 100, 30);
        jButtonBrownTemp.setSize(150, 30);
        jFrame.add(jButtonBrownTemp);
        jButtonBrownTemp.addActionListener(this);

//----------------------------------------------------------------


        jButtonRed = new JButton();
        jButtonRed.setText("RED");
        jButtonRed.setForeground(black);
        jButtonRed.setBackground(red);
        jButtonRed.setBounds(5, 170, 100, 30);
        jButtonRed.setSize(150, 30);
        jFrame.add(jButtonRed);
        jButtonRed.addActionListener(this);

        jButtonRedB2 = new JButton();
        jButtonRedB2.setText("2");
        jButtonRedB2.setForeground(black);
        jButtonRedB2.setBackground(red);
        jButtonRedB2.setBounds(155, 170, 100, 30);
        jButtonRedB2.setSize(150, 30);
        jFrame.add(jButtonRedB2);
        jButtonRedB2.addActionListener(this);

        jButtonRedB3 = new JButton();
        jButtonRedB3.setText("2");
        jButtonRedB3.setForeground(black);
        jButtonRedB3.setBackground(red);
        jButtonRedB3.setBounds(305, 170, 100, 30);
        jButtonRedB3.setSize(150, 30);
        jFrame.add(jButtonRedB3);
        jButtonRedB3.addActionListener(this);

        jButtonRedMul = new JButton();
        jButtonRedMul.setText("100");
        jButtonRedMul.setForeground(black);
        jButtonRedMul.setBackground(red);
        jButtonRedMul.setBounds(455, 170, 100, 30);
        jButtonRedMul.setSize(150, 30);
        jFrame.add(jButtonRedMul);
        jButtonRedMul.addActionListener(this);

        jButtonRedTol = new JButton();
        jButtonRedTol.setText("2%");
        jButtonRedTol.setForeground(black);
        jButtonRedTol.setBackground(red);
        jButtonRedTol.setBounds(605, 170, 100, 30);
        jButtonRedTol.setSize(150, 30);
        jFrame.add(jButtonRedTol);
        jButtonRedTol.addActionListener(this);

        jButtonRedTemp = new JButton();
        jButtonRedTemp.setText("50");
        jButtonRedTemp.setForeground(black);
        jButtonRedTemp.setBackground(red);
        jButtonRedTemp.setBounds(755, 170, 100, 30);
        jButtonRedTemp.setSize(150, 30);
        jFrame.add(jButtonRedTemp);
        jButtonRedTemp.addActionListener(this);


//-----------------------------------------------------------------


        jButtonOrange = new JButton();
        jButtonOrange.setText("ORANGE");
        jButtonOrange.setForeground(black);
        jButtonOrange.setBackground(new Color(255,165,0));
        jButtonOrange.setBounds(5, 200, 100, 30);
        jButtonOrange.setSize(150, 30);
        jFrame.add(jButtonOrange);
        jButtonOrange.addActionListener(this);

        jButtonOrangeB2 = new JButton();
        jButtonOrangeB2.setText("3");
        jButtonOrangeB2.setForeground(black);
        jButtonOrangeB2.setBackground(new Color(255,165,0));
        jButtonOrangeB2.setBounds(155, 200, 100, 30);
        jButtonOrangeB2.setSize(150, 30);
        jFrame.add(jButtonOrangeB2);
        jButtonOrangeB2.addActionListener(this);

        jButtonOrangeB3 = new JButton();
        jButtonOrangeB3.setText("3");
        jButtonOrangeB3.setForeground(black);
        jButtonOrangeB3.setBackground(new Color(255,165,0));
        jButtonOrangeB3.setBounds(305, 200, 100, 30);
        jButtonOrangeB3.setSize(150, 30);
        jFrame.add(jButtonOrangeB3);
        jButtonOrangeB3.addActionListener(this);

        jButtonOrangeMul = new JButton();
        jButtonOrangeMul.setText("1000");
        jButtonOrangeMul.setForeground(black);
        jButtonOrangeMul.setBackground(new Color(255,165,0));
        jButtonOrangeMul.setBounds(455, 200, 100, 30);
        jButtonOrangeMul.setSize(150, 30);
        jFrame.add(jButtonOrangeMul);
        jButtonOrangeMul.addActionListener(this);

        jButtonOrangeTol = new JButton();
        jButtonOrangeTol.setText("3%");
        jButtonOrangeTol.setForeground(black);
        jButtonOrangeTol.setBackground(new Color(255,165,0));
        jButtonOrangeTol.setBounds(605, 200, 100, 30);
        jButtonOrangeTol.setSize(150, 30);
        jFrame.add(jButtonOrangeTol);
        jButtonOrangeTol.addActionListener(this);

        jButtonOrangeTemp = new JButton();
        jButtonOrangeTemp.setText("15");
        jButtonOrangeTemp.setForeground(black);
        jButtonOrangeTemp.setBackground(new Color(255,165,0));
        jButtonOrangeTemp.setBounds(755, 200, 100, 30);
        jButtonOrangeTemp.setSize(150, 30);
        jFrame.add(jButtonOrangeTemp);
        jButtonOrangeTemp.addActionListener(this);

//-------------------------------------------------------------

        jButtonYellow = new JButton();
        jButtonYellow.setText("YELLOW");
        jButtonYellow.setForeground(black);
        jButtonYellow.setBackground(yellow);
        jButtonYellow.setBounds(5, 230, 100, 30);
        jButtonYellow.setSize(150, 30);
        jFrame.add(jButtonYellow);
        jButtonYellow.addActionListener(this);

        jButtonYellowB2 = new JButton();
        jButtonYellowB2.setText("4");
        jButtonYellowB2.setForeground(black);
        jButtonYellowB2.setBackground(yellow);
        jButtonYellowB2.setBounds(155, 230, 100, 30);
        jButtonYellowB2.setSize(150, 30);
        jFrame.add(jButtonYellowB2);
        jButtonYellowB2.addActionListener(this);

        jButtonYellowB3 = new JButton();
        jButtonYellowB3.setText("4");
        jButtonYellowB3.setForeground(black);
        jButtonYellowB3.setBackground(yellow);
        jButtonYellowB3.setBounds(305, 230, 100, 30);
        jButtonYellowB3.setSize(150, 30);
        jFrame.add(jButtonYellowB3);
        jButtonYellowB3.addActionListener(this);

        jButtonYellowMul = new JButton();
        jButtonYellowMul.setText("10000");
        jButtonYellowMul.setForeground(black);
        jButtonYellowMul.setBackground(yellow);
        jButtonYellowMul.setBounds(455, 230, 100, 30);
        jButtonYellowMul.setSize(150, 30);
        jFrame.add(jButtonYellowMul);
        jButtonYellowMul.addActionListener(this);

        jButtonYellowTol = new JButton();
        jButtonYellowTol.setText("4%");
        jButtonYellowTol.setForeground(black);
        jButtonYellowTol.setBackground(yellow);
        jButtonYellowTol.setBounds(605, 230, 100, 30);
        jButtonYellowTol.setSize(150, 30);
        jFrame.add(jButtonYellowTol);
        jButtonYellowTol.addActionListener(this);

        jButtonYellowTemp = new JButton();
        jButtonYellowTemp.setText("25");
        jButtonYellowTemp.setForeground(black);
        jButtonYellowTemp.setBackground(yellow);
        jButtonYellowTemp.setBounds(755, 230, 100, 30);
        jButtonYellowTemp.setSize(150, 30);
        jFrame.add(jButtonYellowTemp);
        jButtonYellowTemp.addActionListener(this);

// ---------------------------------------------------------------


        jButtonGreen = new JButton();
        jButtonGreen.setText("GREEN");
        jButtonGreen.setForeground(black);
        jButtonGreen.setBackground(green);
        jButtonGreen.setBounds(5, 260, 100, 30);
        jButtonGreen.setSize(150, 30);
        jFrame.add(jButtonGreen);
        jButtonGreen.addActionListener(this);

        jButtonGreenB2 = new JButton();
        jButtonGreenB2.setText("5");
        jButtonGreenB2.setForeground(black);
        jButtonGreenB2.setBackground(green);
        jButtonGreenB2.setBounds(155, 260, 100, 30);
        jButtonGreenB2.setSize(150, 30);
        jFrame.add(jButtonGreenB2);
        jButtonGreenB2.addActionListener(this);

        jButtonGreenB3 = new JButton();
        jButtonGreenB3.setText("5");
        jButtonGreenB3.setForeground(black);
        jButtonGreenB3.setBackground(green);
        jButtonGreenB3.setBounds(305, 260, 100, 30);
        jButtonGreenB3.setSize(150, 30);
        jFrame.add(jButtonGreenB3);
        jButtonGreenB3.addActionListener(this);

        jButtonGreenMul = new JButton();
        jButtonGreenMul.setText("100000");
        jButtonGreenMul.setForeground(black);
        jButtonGreenMul.setBackground(green);
        jButtonGreenMul.setBounds(455, 260, 100, 30);
        jButtonGreenMul.setSize(150, 30);
        jFrame.add(jButtonGreenMul);
        jButtonGreenMul.addActionListener(this);

        jButtonGreenTol = new JButton();
        jButtonGreenTol.setText("0.5%");
        jButtonGreenTol.setForeground(black);
        jButtonGreenTol.setBackground(green);
        jButtonGreenTol.setBounds(605, 260, 100, 30);
        jButtonGreenTol.setSize(150, 30);
        jFrame.add(jButtonGreenTol);
        jButtonGreenTol.addActionListener(this);

        jButtonGreenTemp = new JButton();
        jButtonGreenTemp.setText("20");
        jButtonGreenTemp.setForeground(black);
        jButtonGreenTemp.setBackground(green);
        jButtonGreenTemp.setBounds(755, 260, 100, 30);
        jButtonGreenTemp.setSize(150, 30);
        jFrame.add(jButtonGreenTemp);
        jButtonGreenTemp.addActionListener(this);

//-------------------------------------------------------------------

        jButtonBlue = new JButton();
        jButtonBlue.setText("BLUE");
        jButtonBlue.setForeground(white);
        jButtonBlue.setBackground(blue);
        jButtonBlue.setBounds(5, 290, 100, 30);
        jButtonBlue.setSize(150, 30);
        jFrame.add(jButtonBlue);
        jButtonBlue.addActionListener(this);

        jButtonBlueB2 = new JButton();
        jButtonBlueB2.setText("6");
        jButtonBlueB2.setForeground(white);
        jButtonBlueB2.setBackground(blue);
        jButtonBlueB2.setBounds(155, 290, 100, 30);
        jButtonBlueB2.setSize(150, 30);
        jFrame.add(jButtonBlueB2);
        jButtonBlueB2.addActionListener(this);

        jButtonBlueB3 = new JButton();
        jButtonBlueB3.setText("6");
        jButtonBlueB3.setForeground(white);
        jButtonBlueB3.setBackground(blue);
        jButtonBlueB3.setBounds(305, 290, 100, 30);
        jButtonBlueB3.setSize(150, 30);
        jFrame.add(jButtonBlueB3);
        jButtonBlueB3.addActionListener(this);

        jButtonBlueMul = new JButton();
        jButtonBlueMul.setText("1000000");
        jButtonBlueMul.setForeground(white);
        jButtonBlueMul.setBackground(blue);
        jButtonBlueMul.setBounds(455, 290, 100, 30);
        jButtonBlueMul.setSize(150, 30);
        jFrame.add(jButtonBlueMul);
        jButtonBlueMul.addActionListener(this);

        jButtonBlueTol = new JButton();
        jButtonBlueTol.setText("0.25%");
        jButtonBlueTol.setForeground(white);
        jButtonBlueTol.setBackground(blue);
        jButtonBlueTol.setBounds(605, 290, 100, 30);
        jButtonBlueTol.setSize(150, 30);
        jFrame.add(jButtonBlueTol);
        jButtonBlueTol.addActionListener(this);

        jButtonBlueTemp = new JButton();
        jButtonBlueTemp.setText("10");
        jButtonBlueTemp.setForeground(white);
        jButtonBlueTemp.setBackground(blue);
        jButtonBlueTemp.setBounds(755, 290, 100, 30);
        jButtonBlueTemp.setSize(150, 30);
        jFrame.add(jButtonBlueTemp);
        jButtonBlueTemp.addActionListener(this);

//------------------------------------------------------------------------

        jButtonViolet = new JButton();
        jButtonViolet.setText("VIOLET");
        jButtonViolet.setForeground(black);
        jButtonViolet.setBackground(new Color(128, 0, 255));
        jButtonViolet.setBounds(5, 320, 100, 30);
        jButtonViolet.setSize(150, 30);
        jFrame.add(jButtonViolet);
        jButtonViolet.addActionListener(this);

        jButtonVioletB2 = new JButton();
        jButtonVioletB2.setText("7");
        jButtonVioletB2.setForeground(black);
        jButtonVioletB2.setBackground(new Color(128, 0, 255));
        jButtonVioletB2.setBounds(155, 320, 100, 30);
        jButtonVioletB2.setSize(150, 30);
        jFrame.add(jButtonVioletB2);
        jButtonVioletB2.addActionListener(this);

        jButtonVioletB3 = new JButton();
        jButtonVioletB3.setText("7");
        jButtonVioletB3.setForeground(black);
        jButtonVioletB3.setBackground(new Color(128, 0, 255));
        jButtonVioletB3.setBounds(305, 320, 100, 30);
        jButtonVioletB3.setSize(150, 30);
        jFrame.add(jButtonVioletB3);
        jButtonVioletB3.addActionListener(this);

        jButtonVioletMul = new JButton();
        jButtonVioletMul.setText("10000000");
        jButtonVioletMul.setForeground(black);
        jButtonVioletMul.setBackground(new Color(128, 0, 255));
        jButtonVioletMul.setBounds(455, 320, 100, 30);
        jButtonVioletMul.setSize(150, 30);
        jFrame.add(jButtonVioletMul);
        jButtonVioletMul.addActionListener(this);

        jButtonVioletTol = new JButton();
        jButtonVioletTol.setText("0.1%");
        jButtonVioletTol.setForeground(black);
        jButtonVioletTol.setBackground(new Color(128, 0, 255));
        jButtonVioletTol.setBounds(605, 320, 100, 30);
        jButtonVioletTol.setSize(150, 30);
        jFrame.add(jButtonVioletTol);
        jButtonVioletTol.addActionListener(this);

        jButtonVioletTemp = new JButton();
        jButtonVioletTemp.setText("5");
        jButtonVioletTemp.setForeground(black);
        jButtonVioletTemp.setBackground(new Color(128, 0, 255));
        jButtonVioletTemp.setBounds(755, 320, 100, 30);
        jButtonVioletTemp.setSize(150, 30);
        jFrame.add(jButtonVioletTemp);
        jButtonVioletTemp.addActionListener(this);

// ------------------------------------------------------------------

        jButtonGrey = new JButton();
        jButtonGrey.setText("GRAY");
        jButtonGrey.setBackground(gray);
        jButtonGrey.setForeground(black);
        jButtonGrey.setBounds(5, 350, 100, 30);
        jButtonGrey.setSize(150, 30);
        jFrame.add(jButtonGrey);
        jButtonGrey.addActionListener(this);

        jButtonGreyB2 = new JButton();
        jButtonGreyB2.setText("8");
        jButtonGreyB2.setBackground(gray);
        jButtonGreyB2.setForeground(black);
        jButtonGreyB2.setBounds(155, 350, 100, 30);
        jButtonGreyB2.setSize(150, 30);
        jFrame.add(jButtonGreyB2);
        jButtonGreyB2.addActionListener(this);

        jButtonGreyB3 = new JButton();
        jButtonGreyB3.setText("8");
        jButtonGreyB3.setBackground(gray);
        jButtonGreyB3.setForeground(black);
        jButtonGreyB3.setBounds(305, 350, 100, 30);
        jButtonGreyB3.setSize(150, 30);
        jFrame.add(jButtonGreyB3);
        jButtonGreyB3.addActionListener(this);

        jButtonGreyMul = new JButton();
        jButtonGreyMul.setText("100000000");
        jButtonGreyMul.setBackground(gray);
        jButtonGreyMul.setForeground(black);
        jButtonGreyMul.setBounds(455, 350, 100, 30);
        jButtonGreyMul.setSize(150, 30);
        jFrame.add(jButtonGreyMul);
        jButtonGreyMul.addActionListener(this);

        jButtonGreyTol = new JButton();
        jButtonGreyTol.setText("0.05%");
        jButtonGreyTol.setBackground(gray);
        jButtonGreyTol.setForeground(black);
        jButtonGreyTol.setBounds(605, 350, 100, 30);
        jButtonGreyTol.setSize(150, 30);
        jFrame.add(jButtonGreyTol);
        jButtonGreyTol.addActionListener(this);

        jButtonGreyTemp = new JButton();
        jButtonGreyTemp.setText("1");
        jButtonGreyTemp.setBackground(gray);
        jButtonGreyTemp.setForeground(black);
        jButtonGreyTemp.setBounds(755, 350, 100, 30);
        jButtonGreyTemp.setSize(150, 30);
        jFrame.add(jButtonGreyTemp);
        jButtonGreyTemp.addActionListener(this);

//---------------------------------------------------------------------


        jButtonWhite = new JButton();
        jButtonWhite.setText("WHITE");
        jButtonWhite.setBackground(white);
        jButtonWhite.setForeground(black);
        jButtonWhite.setBounds(5, 380, 100, 30);
        jButtonWhite.setSize(150, 30);
        jFrame.add(jButtonWhite);
        jButtonWhite.addActionListener(this);

        jButtonWhiteB2 = new JButton();
        jButtonWhiteB2.setText("9");
        jButtonWhiteB2.setBackground(white);
        jButtonWhiteB2.setForeground(black);
        jButtonWhiteB2.setBounds(155, 380, 100, 30);
        jButtonWhiteB2.setSize(150, 30);
        jFrame.add(jButtonWhiteB2);
        jButtonWhiteB2.addActionListener(this);

        jButtonWhiteB3 = new JButton();
        jButtonWhiteB3.setText("9");
        jButtonWhiteB3.setBackground(white);
        jButtonWhiteB3.setForeground(black);
        jButtonWhiteB3.setBounds(305, 380, 100, 30);
        jButtonWhiteB3.setSize(150, 30);
        jFrame.add(jButtonWhiteB3);
        jButtonWhiteB3.addActionListener(this);

        jButtonWhiteMul = new JButton();
        jButtonWhiteMul.setText("1000000000");
        jButtonWhiteMul.setBackground(white);
        jButtonWhiteMul.setForeground(black);
        jButtonWhiteMul.setBounds(455, 380, 100, 30);
        jButtonWhiteMul.setSize(150, 30);
        jFrame.add(jButtonWhiteMul);
        jButtonWhiteMul.addActionListener(this);

        jButton = new JButton();
        jButton.setText("-");
        jButton.setBackground(white);
        jButton.setForeground(black);
        jButton.setBounds(605, 380, 100, 30);
        jButton.setSize(150, 30);
        jFrame.add(jButton);

        jButtonWhiteTemp = new JButton();
//        jButtonWhiteTemp.setText("1000000000");
        jButtonWhiteTemp.setBackground(white);
        jButtonWhiteTemp.setForeground(black);
        jButtonWhiteTemp.setBounds(755, 380, 100, 30);
        jButtonWhiteTemp.setSize(150, 30);
        jFrame.add(jButtonWhiteTemp);
        jButtonWhiteTemp.addActionListener(this);

//--------------------------------------------------------------------


        jButtonGold = new JButton();
        jButtonGold.setText("GOLD");
        jButtonGold.setForeground(black);
        jButtonGold.setBackground(new Color(255,215,0));
        jButtonGold.setBounds(5, 410, 100, 30);
        jButtonGold.setSize(150, 30);
        jFrame.add(jButtonGold);
        jButtonGold.addActionListener(this);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(new Color(255,215,0));
        jButton.setBounds(155, 410, 100, 30);
        jButton.setSize(150, 30);
        jFrame.add(jButton);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(new Color(255,215,0));
        jButton.setBounds(305, 410, 100, 30);
        jButton.setSize(150, 30);
        jFrame.add(jButton);

        jButtonGoldMul = new JButton();
        jButtonGoldMul.setText("0.1");
        jButtonGoldMul.setForeground(black);
        jButtonGoldMul.setBackground(new Color(255,215,0));
        jButtonGoldMul.setBounds(455, 410, 100, 30);
        jButtonGoldMul.setSize(150, 30);
        jFrame.add(jButtonGoldMul);
        jButtonGoldMul.addActionListener(this);

        jButtonGoldTol = new JButton();
        jButtonGoldTol.setText("5%");
        jButtonGoldTol.setForeground(black);
        jButtonGoldTol.setBackground(new Color(255,215,0));
        jButtonGoldTol.setBounds(605, 410, 100, 30);
        jButtonGoldTol.setSize(150, 30);
        jFrame.add(jButtonGoldTol);
        jButtonGoldTol.addActionListener(this);

        jButtonGoldTemp = new JButton();
        jButtonGoldTemp.setForeground(black);
        jButtonGoldTemp.setBackground(new Color(255,215,0));
        jButtonGoldTemp.setBounds(755, 410, 100, 30);
        jButtonGoldTemp.setSize(150, 30);
        jFrame.add(jButtonGoldTemp);
        jButtonGoldTemp.addActionListener(this);

//------------------------------------------------------------------

        jButtonSilver = new JButton();
        jButtonSilver.setText("SILVER");
        jButtonSilver.setForeground(black);
        jButtonSilver.setBackground(new Color(211,211,211));
        jButtonSilver.setBounds(5, 440, 100, 30);
        jButtonSilver.setSize(150, 30);
        jFrame.add(jButtonSilver);
        jButtonSilver.addActionListener(this);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(new Color(211,211,211));
        jButton.setBounds(155, 440, 100, 30);
        jButton.setSize(150, 30);
        jFrame.add(jButton);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(new Color(211,211,211));
        jButton.setBounds(305, 440, 100, 30);
        jButton.setSize(150, 30);
        jFrame.add(jButton);

        jButtonSilverMul = new JButton();
        jButtonSilverMul.setText("0.01");
        jButtonSilverMul.setForeground(black);
        jButtonSilverMul.setBackground(new Color(211,211,211));
        jButtonSilverMul.setBounds(455, 440, 100, 30);
        jButtonSilverMul.setSize(150, 30);
        jFrame.add(jButtonSilverMul);
        jButtonSilverMul.addActionListener(this);

        jButtonSilverTol = new JButton();
        jButtonSilverTol.setText("10%");
        jButtonSilverTol.setForeground(black);
        jButtonSilverTol.setBackground(new Color(211,211,211));
        jButtonSilverTol.setBounds(605, 440, 100, 30);
        jButtonSilverTol.setSize(150, 30);
        jFrame.add(jButtonSilverTol);
        jButtonSilverTol.addActionListener(this);

        jButtonSilverTemp = new JButton();
        jButtonSilverTemp.setForeground(black);
        jButtonSilverTemp.setBackground(new Color(211,211,211));
        jButtonSilverTemp.setBounds(755, 440, 100, 30);
        jButtonSilverTemp.setSize(150, 30);
        jFrame.add(jButtonSilverTemp);
        jButtonSilverTemp.addActionListener(this);

//--------------------------------------------------------------

        jButtonNone = new JButton();
        jButtonNone.setText("NONE");
        jButtonNone.setForeground(black);
        jButtonNone.setBackground(white);
        jButtonNone.setBounds(5, 470, 100, 30);
        jButtonNone.setSize(150, 30);
        jFrame.add(jButtonNone);
        jButtonNone.addActionListener(this);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(white);
        jButton.setBounds(155, 470, 100, 30);
        jButton.setSize(150, 30);
        jFrame.add(jButton);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(white);
        jButton.setBounds(305, 470, 100, 30);
        jButton.setSize(150, 30);
        jFrame.add(jButton);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(white);
        jButton.setBounds(455, 470, 100, 30);
        jButton.setSize(150, 30);
        jFrame.add(jButton);

        jButtonNoneTol = new JButton();
        jButtonNoneTol.setText("20%");
        jButtonNoneTol.setForeground(black);
        jButtonNoneTol.setBackground(white);
        jButtonNoneTol.setBounds(605, 470, 100, 30);
        jButtonNoneTol.setSize(150, 30);
        jFrame.add(jButtonNoneTol);
        jButtonNoneTol.addActionListener(this);

        jButtonNoneTemp = new JButton();
        jButtonNoneTemp.setForeground(black);
        jButtonNoneTemp.setBackground(white);
        jButtonNoneTemp.setBounds(755, 470, 100, 30);
        jButtonNoneTemp.setSize(150, 30);
        jFrame.add(jButtonNoneTemp);
        jButtonNoneTemp.addActionListener(this);

//-------------------------------------------------------------------------------------


//======================================================================================

        jLabel = new JLabel();
        jLabel.setBounds(970, 110, 100, 30);
        jLabel.setText("1st Band");
        jFrame.add(jLabel);

        jTextFieldB1 = new JTextField();
        jTextFieldB1.setBounds(1100, 110, 200, 30);
        jTextFieldB1.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldB1);

//------------------------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(970, 170, 100, 30);
        jLabel.setText("2nd Band");
        jFrame.add(jLabel);

        jTextFieldB2 = new JTextField();
        jTextFieldB2.setBounds(1100, 170, 200, 30);
        jTextFieldB2.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldB2);

//--------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(970, 230, 100, 30);
        jLabel.setText("3rd Band");
        jFrame.add(jLabel);

        jTextFieldB3 = new JTextField();
        jTextFieldB3.setBounds(1100, 230, 200, 30);
        jTextFieldB3.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldB3);

//----------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(970, 290, 100, 30);
        jLabel.setText("Multiplier");
        jFrame.add(jLabel);

        jTextFieldMultiplier = new JTextField();
        jTextFieldMultiplier.setBounds(1100, 290, 200, 30);
        jTextFieldMultiplier.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldMultiplier);

//-------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(970, 350, 500, 30);
        jLabel.setText("Tolerance");
        jFrame.add(jLabel);

        jTextFieldTolarance = new JTextField();
        jTextFieldTolarance.setBounds(1100, 350, 200, 30);
        jTextFieldTolarance.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldTolarance);

//-----------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(970, 410, 500, 30);
        jLabel.setText("Temp Coeff. in ppm/K");
        jFrame.add(jLabel);

        jTextFieldTemperature = new JTextField();
        jTextFieldTemperature.setBounds(1100, 410, 200, 30);
        jTextFieldTemperature.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldTemperature);

//-----------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(970, 470, 150, 30);
        jLabel.setText("Resistor Value in ohms");
        jFrame.add(jLabel);

        jTextFieldRValue = new JTextField();
        jTextFieldRValue.setBounds(1100, 470, 200, 30);
        jTextFieldRValue.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldRValue);

//------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(970, 520, 150, 30);
        jLabel.setText("Min Range in ohms");
        jFrame.add(jLabel);

        jTextFieldMinRange = new JTextField();
        jTextFieldMinRange.setBounds(1100, 520, 200, 30);
        jTextFieldMinRange.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldMinRange);

//-----------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(970, 580, 150, 30);
        jLabel.setText("Max Range in ohms");
        jFrame.add(jLabel);

        jTextFieldMaxRange = new JTextField();
        jTextFieldMaxRange.setBounds(1100, 580, 200, 30);
        jTextFieldMaxRange.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldMaxRange);

//============================================================

        jButtonCalculate = new JButton();
        jButtonCalculate.setText("Calculate");
        jButtonCalculate.setBackground(lightGray);
        jButtonCalculate.setForeground(black);
        jButtonCalculate.setBounds(100, 520, 100, 30);
        jButtonCalculate.setSize(150, 100);
        jFrame.add(jButtonCalculate);
        jButtonCalculate.addActionListener(this);

//---------------------------------------------------------

        jButtonReset = new JButton();
        jButtonReset.setText("Reset");
        jButtonReset.setBackground(lightGray);
        jButtonReset.setForeground(black);
        jButtonReset.setBounds(420, 520, 100, 30);
        jButtonReset.setSize(150, 100);
        jFrame.add(jButtonReset);

        jButtonReset.addActionListener(this);


//---------------------------------------------------------

        jback = new JButton();
        jback.setText("Back");
        jback.setForeground(black);
        jback.setBackground(white);
        jback.setBounds(1100,650,100,30);
        jback.setSize(150,30);
        jFrame.add(jback);
        jback.addActionListener(this);

//---------------------------------------------------------
        jButtonExit = new JButton();
        jButtonExit.setText("Exit");
        jButtonExit.setBackground(lightGray);
        jButtonExit.setForeground(black);
        jButtonExit.setBounds(720, 520, 100, 30);
        jButtonExit.setSize(150, 100);
        jFrame.add(jButtonExit);

        jButtonExit.addActionListener(this);


//---------------------------------------------------------


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
            if (e.getSource() == jButtonBlack)
            {
                jTextFieldB1.setText("0");
            }
            else if(e.getSource() == jButtonBlackB2)
            {
                jTextFieldB2.setText("0");
            }
            else if(e.getSource() == jButtonBlackB3)
            {
                jTextFieldB3.setText("0");
            }
            else if(e.getSource() == jButtonBlackMul)
            {
                jTextFieldMultiplier.setText("1");
            }
            else if(e.getSource() == jButtonBlackTemp)
            {
                jTextFieldTemperature.setText("250");
            }
// -----------------------------------------------------------------------------------------
            else  if (e.getSource() == jButtonBrown)
            {
                jTextFieldB1.setText("1");
            }
            else if(e.getSource() == jButtonBrownB2)
            {
                jTextFieldB2.setText("1");
            }
            else if(e.getSource() == jButtonBrownB3)
            {
                jTextFieldB3.setText("1");
            }
            else if(e.getSource() == jButtonBrownMul)
            {
                jTextFieldMultiplier.setText("10");
            }
            else if (e.getSource() == jButtonBrownTol)
            {
                jTextFieldTolarance.setText("0.01");
            }
            else if (e.getSource() == jButtonBrownTemp)
            {
                jTextFieldTemperature.setText("100");
            }
//--------------------------------------------------------------------------------------------
            else  if (e.getSource() == jButtonRed)
            {
                jTextFieldB1.setText("2");
            }
            else if(e.getSource() == jButtonRedB2)
            {
                jTextFieldB2.setText("2");
            }
            else if(e.getSource() == jButtonRedB3)
            {
                jTextFieldB3.setText("2");
            }
            else if(e.getSource() == jButtonRedMul)
            {
                jTextFieldMultiplier.setText("100");
            }
            else if (e.getSource() == jButtonRedTol)
            {
                jTextFieldTolarance.setText("0.02");
            }
            else if (e.getSource() == jButtonRedTemp)
            {
                jTextFieldTemperature.setText("50");
            }
//-----------------------------------------------------------------------------------------
            else  if (e.getSource() == jButtonOrange)
            {
                jTextFieldB1.setText("3");
            }
            else if(e.getSource() == jButtonOrangeB2)
            {
                jTextFieldB2.setText("3");
            }
            else if(e.getSource() == jButtonOrangeB3)
            {
                jTextFieldB3.setText("3");
            }
            else if(e.getSource() == jButtonOrangeMul)
            {
                jTextFieldMultiplier.setText("1000");
            }
            else if (e.getSource() == jButtonOrangeTol)
            {
                jTextFieldTolarance.setText("0.03");
            }
            else if (e.getSource() == jButtonOrangeTemp)
            {
                jTextFieldTemperature.setText("15");
            }
//-------------------------------------------------------------------------------------------
            else  if (e.getSource() == jButtonYellow)
            {
                jTextFieldB1.setText("4");
            }
            else if(e.getSource() == jButtonYellowB2)
            {
                jTextFieldB2.setText("4");
            }
            else if(e.getSource() == jButtonYellowB3)
            {
                jTextFieldB3.setText("4");
            }
            else if(e.getSource() == jButtonYellowMul)
            {
                jTextFieldMultiplier.setText("10000");
            }
            else if (e.getSource() == jButtonYellowTol)
            {
                jTextFieldTolarance.setText("0.04");
            }
            else if (e.getSource() == jButtonYellowTemp)
            {
                jTextFieldTemperature.setText("25");
            }
//------------------------------------------------------------------------------------------
            else  if (e.getSource() == jButtonGreen)
            {
                jTextFieldB1.setText("5");
            }
            else if(e.getSource() == jButtonGreenB2)
            {
                jTextFieldB2.setText("5");
            }
            else if(e.getSource() == jButtonGreenB3)
            {
                jTextFieldB3.setText("5");
            }
            else if(e.getSource() == jButtonGreenMul)
            {
                jTextFieldMultiplier.setText("100000");
            }
            else if (e.getSource() == jButtonGreenTol)
            {
                jTextFieldTolarance.setText("0.005");
            }
            else if (e.getSource() == jButtonGreenTemp)
            {
                jTextFieldTemperature.setText("20");
            }
//-------------------------------------------------------------------------------------------
            else  if (e.getSource() == jButtonBlue)
            {
                jTextFieldB1.setText("6");
            }
            else if(e.getSource() == jButtonBlueB2)
            {
                jTextFieldB2.setText("6");
            }
            else if(e.getSource() == jButtonBlueB3)
            {
                jTextFieldB3.setText("6");
            }
            else if(e.getSource() == jButtonBlueMul)
            {
                jTextFieldMultiplier.setText("1000000");
            }
            else if (e.getSource() == jButtonBlueTol)
            {
                jTextFieldTolarance.setText("0.0025");
            }
            else if (e.getSource() == jButtonBlueTemp)
            {
                jTextFieldTemperature.setText("10");
            }
//---------------------------------------------------------------------------------------
            else  if (e.getSource() == jButtonViolet)
            {
                jTextFieldB1.setText("7");
            }
            else if(e.getSource() == jButtonVioletB2)
            {
                jTextFieldB2.setText("7");
            }
            else if(e.getSource() == jButtonVioletB3)
            {
                jTextFieldB3.setText("7");
            }
            else if(e.getSource() == jButtonVioletMul)
            {
                jTextFieldMultiplier.setText("10000000");
            }
            else if (e.getSource() == jButtonVioletTol)
            {
                jTextFieldTolarance.setText("0.001");
            }
            else if (e.getSource() == jButtonVioletTemp)
            {
                jTextFieldTemperature.setText("5");
            }
//---------------------------------------------------------------------------------------
            else  if (e.getSource() == jButtonGrey)
            {
                jTextFieldB1.setText("8");
            }
            else if(e.getSource() == jButtonGreyB2)
            {
                jTextFieldB2.setText("8");
            }
            else if(e.getSource() == jButtonGreyB3)
            {
                jTextFieldB3.setText("8");
            }
            else if(e.getSource() == jButtonGreyMul)
            {
                jTextFieldMultiplier.setText("100000000");
            }
            else if (e.getSource() == jButtonGreyTol)
            {
                jTextFieldTolarance.setText("0.0005");
            }
            else if (e.getSource() == jButtonGreyTemp)
            {
                jTextFieldTemperature.setText("1");
            }
//-----------------------------------------------------------------------------------------
            else  if (e.getSource() == jButtonWhite)
            {
                jTextFieldB1.setText("9");
            }
            else if(e.getSource() == jButtonWhiteB2)
            {
                jTextFieldB2.setText("9");
            }
            else if(e.getSource() == jButtonWhiteB3)
            {
                jTextFieldB3.setText("9");
            }
            else if(e.getSource() == jButtonWhiteMul)
            {
                jTextFieldMultiplier.setText("1000000000");
            }
//----------------------------------------------------------------------------------------
            else if (e.getSource() == jButtonGold)
            {
                jTextFieldTolarance.setText("0.05");
            }
            else if (e.getSource() == jButtonGoldMul)
            {
                jTextFieldMultiplier.setText("0.1");
            }
            else if(e.getSource() == jButtonGoldTol)
            {
                jTextFieldTolarance.setText("0.05");
            }
//-----------------------------------------------------------------------------------------
            else if (e.getSource() == jButtonSilver)
            {
                jTextFieldTolarance.setText("0.1");
            }
            else if (e.getSource() == jButtonSilverMul)
            {
                jTextFieldMultiplier.setText("0.01");
            }
            else if(e.getSource() == jButtonSilverTol)
            {
                jTextFieldTolarance.setText("0.1");
            }
//-------------------------------------------------------------------------------------------
            else if(e.getSource() == jButtonNone)
            {
                jTextFieldTolarance.setText("0.2");
            }
            else if(e.getSource() == jButtonNoneTol)
            {
                jTextFieldTolarance.setText("0.2");
            }
//--------------------------------------------------------------------------------------

//================================================================================================




            else if (e.getSource() == jButtonCalculate)
            {

                String b1 = jTextFieldB1.getText();
                String b2 = jTextFieldB2.getText();
                String b3 = jTextFieldB3.getText();
                String MulInString = jTextFieldMultiplier.getText();
                String tolInString = jTextFieldTolarance.getText();
                float MulInInt = Float.parseFloat(MulInString);

                float tolInFloat = Float.parseFloat(tolInString);


                String numInString = b1.concat(b2);
                String finalConcat = numInString.concat(b3);
                float numInInt = Float.parseFloat(finalConcat);
                float resistorValveInInt = numInInt * MulInInt;
                String resistorValveInString = Float.toString(resistorValveInInt);    //Final Answer
                jTextFieldRValue.setText(resistorValveInString);



                float minRvalue = resistorValveInInt - (resistorValveInInt * tolInFloat);
                String minRvalueInString = Float.toString(minRvalue);
                float maxRvalue = (resistorValveInInt) + (resistorValveInInt) * tolInFloat;
                String maxRvalueInString = Float.toString(maxRvalue);


                jTextFieldMinRange.setText(minRvalueInString);
                jTextFieldMaxRange.setText(maxRvalueInString);

            }

            else if (e.getSource() == jback)
            {
                ChooseRBands obj = new ChooseRBands();
                jFrame.dispose();
            }



            else if (e.getSource() == jButtonReset)
            {
                int input =  JOptionPane.showConfirmDialog(jFrame, "Do you want to RESET?");
                if (input == 0)
                {
                    jTextFieldB1.setText("");
                    jTextFieldB2.setText("");
                    jTextFieldB3.setText("");
                    jTextFieldMultiplier.setText("");
                    jTextFieldTolarance.setText("");
                    jTextFieldTemperature.setText("");
                    jTextFieldRValue.setText("");
                    jTextFieldMinRange.setText("");
                    jTextFieldMaxRange.setText("");
                }


            }

            else if (e.getSource() == jButtonExit)
            {
                int input =  JOptionPane.showConfirmDialog(jFrame, "Do you want to exit?");
                if (input == 0)
                {
                    System.exit(0);
                }
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(jFrame, "Sorry, Something went wrong !");
        }
    }
}
