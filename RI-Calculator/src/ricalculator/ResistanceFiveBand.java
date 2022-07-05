package ricalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

public class ResistanceFiveBand implements ActionListener {
    JFrame jFrame;
    JLabel jLabel, jLabelFactText1;
    Font font;
    JTextField jTextField;
    JTextField jTextFieldB1, jTextFieldB2, jTextFieldB3, jTextFieldMultiplier, jTextFieldTolarance, jTextFieldRValue, jTextFieldMinRange, jTextFieldMaxRange;

    JButton jButton;
    JButton jButtonCalculate, jButtonReset, jButtonExit, jback;
    JButton jButtonBlack, jButtonBlackB2, jButtonBlackB3, jButtonBlackMul;
    JButton jButtonBrown, jButtonBrownB2, jButtonBrownB3, jButtonBrownMul, jButtonBrownTol;
    JButton jButtonRed, jButtonRedB2, jButtonRedB3, jButtonRedMul, jButtonRedTol;
    JButton jButtonOrange, jButtonOrangeB2, jButtonOrangeB3, jButtonOrangeMul, jButtonOrangeTol;
    JButton jButtonYellow, jButtonYellowB2, jButtonYellowB3, jButtonYellowMul, jButtonYellowTol;
    JButton jButtonGreen, jButtonGreenB2, jButtonGreenB3, jButtonGreenMul, jButtonGreenTol;
    JButton jButtonBlue, jButtonBlueB2, jButtonBlueB3, jButtonBlueMul, jButtonBlueTol;
    JButton jButtonViolet, jButtonVioletB2, jButtonVioletB3, jButtonVioletMul, jButtonVioletTol;
    JButton jButtonGrey, jButtonGreyB2, jButtonGreyB3, jButtonGreyMul, jButtonGreyTol;
    JButton jButtonWhite, jButtonWhiteB2, jButtonWhiteB3, jButtonWhiteMul;
    JButton jButtonGold, jButtonGoldMul, jButtonGoldTol;
    JButton jButtonSilver, jButtonSilverMul, jButtonSilverTol;
    JButton jButtonNone, jButtonNoneTol;

    public ResistanceFiveBand()
    {

        font = new Font("Consolas",Font.BOLD,28);

        jFrame = new JFrame();
        jFrame.setBounds(0,0,500,400);
        jFrame.setSize(1400, 750);
        jFrame.setTitle("Resistance Calculator");
        jFrame.setVisible(true);
        jFrame.setLayout(null);   // In default, the GUI is divided in various grid boxes. jFrame.setLayout(null); erases all those grids. In other words, null layout means absolute positioning - you have to do all the work in your code. No layout manager to help you out.

        jLabel = new JLabel();
        jLabel.setBounds(450,10,450,30);
        jLabel.setText("5 BAND RESISTANCE CALCULATOR ");
        jLabel.setFont(font);
        jLabel.setBorder(BorderFactory.createLineBorder(Color.black));



        jFrame.add(jLabel); // Frame is just a plane. We put(add) different lables, buttons etc on the frame using .add



//----------------------------------------


//COLOUR BUTTONS




        jLabelFactText1 = new JLabel();
        jLabelFactText1.setText("Note: The 5th color band on the right side represent the tolerance of the resistor. 5 band resistor has an extra digit before you get to the multiplier band, this allows for more precision in describing the value of the resistor.");
        jLabelFactText1.setBounds(25, 640, 1500, 15);
        jFrame.add(jLabelFactText1);





        jLabel = new JLabel();
        jLabel.setBounds(120, 80, 100, 30);
        jLabel.setText("1st Band");
        jFrame.add(jLabel);

        jButtonBlack = new JButton();
        jButtonBlack.setText("BLACK");
        jButtonBlack.setForeground(white);
        jButtonBlack.setBackground(black);
        jButtonBlack.setBounds(70,110,100,30);
        jButtonBlack.setSize(150,30);
//        jButtonBlack.setAction(jTextFieldB1.setText("0"));
        jFrame.add(jButtonBlack);
        jButtonBlack.addActionListener(this);




        jLabel = new JLabel();
        jLabel.setBounds(270, 80, 100, 30);
        jLabel.setText("2nd Band");
        jFrame.add(jLabel);

        jButtonBlackB2 = new JButton();
        jButtonBlackB2.setText("0");
        jButtonBlackB2.setBackground(black);
        jButtonBlackB2.setForeground(white);
        jButtonBlackB2.setBounds(220,110,100,30);
        jButtonBlackB2.setSize(150,30);
        jFrame.add(jButtonBlackB2);
        jButtonBlackB2.addActionListener(this);

        jLabel = new JLabel();
        jLabel.setBounds(420, 80, 100, 30);
        jLabel.setText("3rd Band");
        jFrame.add(jLabel);

        jButtonBlackB3 = new JButton();
        jButtonBlackB3.setText("0");
        jButtonBlackB3.setBackground(black);
        jButtonBlackB3.setForeground(white);
        jButtonBlackB3.setBounds(370,110,100,30);
        jButtonBlackB3.setSize(150,30);
        jFrame.add(jButtonBlackB3);
        jButtonBlackB3.addActionListener(this);


        jLabel = new JLabel();
        jLabel.setBounds(570, 80, 100, 30);
        jLabel.setText("Multiplier");
        jFrame.add(jLabel);

        jButtonBlackMul = new JButton();
        jButtonBlackMul.setText("1");
        jButtonBlackMul.setBackground(black);
        jButtonBlackMul.setForeground(white);
        jButtonBlackMul.setBounds(520,110,100,30);
        jButtonBlackMul.setSize(150,30);
        jFrame.add(jButtonBlackMul);
        jButtonBlackMul.addActionListener(this);


        jLabel = new JLabel();
        jLabel.setBounds(720, 80, 100, 30);
        jLabel.setText("Tolerance");
        jFrame.add(jLabel);

        jButton = new JButton();
        jButton.setText("");
        jButton.setBackground(black);
        jButton.setForeground(white);
        jButton.setBounds(670,110,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

//-----------------------------------------------------------------

        jButtonBrown = new JButton();
        jButtonBrown.setText("BROWN");
        jButtonBrown.setForeground(white);
        jButtonBrown.setBackground(new Color(150,75,0));
        jButtonBrown.setBounds(70,140,100,30);
        jButtonBrown.setSize(150,30);
        jFrame.add(jButtonBrown);
        jButtonBrown.addActionListener(this);

        jButtonBrownB2 = new JButton();
        jButtonBrownB2.setText("1");
        jButtonBrownB2.setForeground(white);
        jButtonBrownB2.setBackground(new Color(150,75,0));
        jButtonBrownB2.setBounds(220,140,100,30);
        jButtonBrownB2.setSize(150,30);
        jFrame.add(jButtonBrownB2);
        jButtonBrownB2.addActionListener(this);

        jButtonBrownB3 = new JButton();
        jButtonBrownB3.setText("1");
        jButtonBrownB3.setForeground(white);
        jButtonBrownB3.setBackground(new Color(150,75,0));
        jButtonBrownB3.setBounds(370,140,100,30);
        jButtonBrownB3.setSize(150,30);
        jFrame.add(jButtonBrownB3);
        jButtonBrownB3.addActionListener(this);

        jButtonBrownMul = new JButton();
        jButtonBrownMul.setText("10");
        jButtonBrownMul.setForeground(white);
        jButtonBrownMul.setBackground(new Color(150,75,0));
        jButtonBrownMul.setBounds(520,140,100,30);
        jButtonBrownMul.setSize(150,30);
        jFrame.add(jButtonBrownMul);
        jButtonBrownMul.addActionListener(this);

        jButtonBrownTol = new JButton();
        jButtonBrownTol.setText("1%");
        jButtonBrownTol.setForeground(white);
        jButtonBrownTol.setBackground(new Color(150,75,0));
        jButtonBrownTol.setBounds(670,140,100,30);
        jButtonBrownTol.setSize(150,30);
        jFrame.add(jButtonBrownTol);
        jButtonBrownTol.addActionListener(this);

//----------------------------------------------------------------



        jButtonRed = new JButton();
        jButtonRed.setText("RED");
        jButtonRed.setForeground(black);
        jButtonRed.setBackground(red);
        jButtonRed.setBounds(70,170,100,30);
        jButtonRed.setSize(150,30);
        jFrame.add(jButtonRed);
        jButtonRed.addActionListener(this);

        jButtonRedB2 = new JButton();
        jButtonRedB2.setText("2");
        jButtonRedB2.setForeground(black);
        jButtonRedB2.setBackground(red);
        jButtonRedB2.setBounds(220,170,100,30);
        jButtonRedB2.setSize(150,30);
        jFrame.add(jButtonRedB2);
        jButtonRedB2.addActionListener(this);

        jButtonRedB3 = new JButton();
        jButtonRedB3.setText("2");
        jButtonRedB3.setForeground(black);
        jButtonRedB3.setBackground(red);
        jButtonRedB3.setBounds(370,170,100,30);
        jButtonRedB3.setSize(150,30);
        jFrame.add(jButtonRedB3);
        jButtonRedB3.addActionListener(this);

        jButtonRedMul = new JButton();
        jButtonRedMul.setText("100");
        jButtonRedMul.setForeground(black);
        jButtonRedMul.setBackground(red);
        jButtonRedMul.setBounds(520,170,100,30);
        jButtonRedMul.setSize(150,30);
        jFrame.add(jButtonRedMul);
        jButtonRedMul.addActionListener(this);

        jButtonRedTol = new JButton();
        jButtonRedTol.setText("2%");
        jButtonRedTol.setForeground(black);
        jButtonRedTol.setBackground(red);
        jButtonRedTol.setBounds(670,170,100,30);
        jButtonRedTol.setSize(150,30);
        jFrame.add(jButtonRedTol);
        jButtonRedTol.addActionListener(this);

//-----------------------------------------------------------------


        jButtonOrange = new JButton();
        jButtonOrange.setText("ORANGE");
        jButtonOrange.setForeground(black);
        jButtonOrange.setBackground(new Color(255,165,0));
        jButtonOrange.setBounds(70,200,100,30);
        jButtonOrange.setSize(150,30);
        jFrame.add(jButtonOrange);
        jButtonOrange.addActionListener(this);

        jButtonOrangeB2 = new JButton();
        jButtonOrangeB2.setText("3");
        jButtonOrangeB2.setForeground(black);
        jButtonOrangeB2.setBackground(new Color(255,165,0));
        jButtonOrangeB2.setBounds(220,200,100,30);
        jButtonOrangeB2.setSize(150,30);
        jFrame.add(jButtonOrangeB2);
        jButtonOrangeB2.addActionListener(this);

        jButtonOrangeB3 = new JButton();
        jButtonOrangeB3.setText("3");
        jButtonOrangeB3.setForeground(black);
        jButtonOrangeB3.setBackground(new Color(255,165,0));
        jButtonOrangeB3.setBounds(370,200,100,30);
        jButtonOrangeB3.setSize(150,30);
        jFrame.add(jButtonOrangeB3);
        jButtonOrangeB3.addActionListener(this);

        jButtonOrangeMul = new JButton();
        jButtonOrangeMul.setText("1000");
        jButtonOrangeMul.setForeground(black);
        jButtonOrangeMul.setBackground(new Color(255,165,0));
        jButtonOrangeMul.setBounds(520,200,100,30);
        jButtonOrangeMul.setSize(150,30);
        jFrame.add(jButtonOrangeMul);
        jButtonOrangeMul.addActionListener(this);

        jButtonOrangeTol = new JButton();
        jButtonOrangeTol.setText("3%");
        jButtonOrangeTol.setForeground(black);
        jButtonOrangeTol.setBackground(new Color(255,165,0));
        jButtonOrangeTol.setBounds(670,200,100,30);
        jButtonOrangeTol.setSize(150,30);
        jFrame.add(jButtonOrangeTol);
        jButtonOrangeTol.addActionListener(this);

//-------------------------------------------------------------

        jButtonYellow = new JButton();
        jButtonYellow.setText("YELLOW");
        jButtonYellow.setForeground(black);
        jButtonYellow.setBackground(yellow);
        jButtonYellow.setBounds(70,230,100,30);
        jButtonYellow.setSize(150,30);
        jFrame.add(jButtonYellow);
        jButtonYellow.addActionListener(this);

        jButtonYellowB2 = new JButton();
        jButtonYellowB2.setText("4");
        jButtonYellowB2.setForeground(black);
        jButtonYellowB2.setBackground(yellow);
        jButtonYellowB2.setBounds(220,230,100,30);
        jButtonYellowB2.setSize(150,30);
        jFrame.add(jButtonYellowB2);
        jButtonYellowB2.addActionListener(this);

        jButtonYellowB3 = new JButton();
        jButtonYellowB3.setText("4");
        jButtonYellowB3.setForeground(black);
        jButtonYellowB3.setBackground(yellow);
        jButtonYellowB3.setBounds(370,230,100,30);
        jButtonYellowB3.setSize(150,30);
        jFrame.add(jButtonYellowB3);
        jButtonYellowB3.addActionListener(this);

        jButtonYellowMul = new JButton();
        jButtonYellowMul.setText("10000");
        jButtonYellowMul.setForeground(black);
        jButtonYellowMul.setBackground(yellow);
        jButtonYellowMul.setBounds(520,230,100,30);
        jButtonYellowMul.setSize(150,30);
        jFrame.add(jButtonYellowMul);
        jButtonYellowMul.addActionListener(this);

        jButtonYellowTol = new JButton();
        jButtonYellowTol.setText("4%");
        jButtonYellowTol.setForeground(black);
        jButtonYellowTol.setBackground(yellow);
        jButtonYellowTol.setBounds(670,230,100,30);
        jButtonYellowTol.setSize(150,30);
        jFrame.add(jButtonYellowTol);
        jButtonYellowTol.addActionListener(this);

// ---------------------------------------------------------------


        jButtonGreen = new JButton();
        jButtonGreen.setText("GREEN");
        jButtonGreen.setForeground(black);
        jButtonGreen.setBackground(green);
        jButtonGreen.setBounds(70,260,100,30);
        jButtonGreen.setSize(150,30);
        jFrame.add(jButtonGreen);
        jButtonGreen.addActionListener(this);

        jButtonGreenB2 = new JButton();
        jButtonGreenB2.setText("5");
        jButtonGreenB2.setForeground(black);
        jButtonGreenB2.setBackground(green);
        jButtonGreenB2.setBounds(220,260,100,30);
        jButtonGreenB2.setSize(150,30);
        jFrame.add(jButtonGreenB2);
        jButtonGreenB2.addActionListener(this);

        jButtonGreenB3 = new JButton();
        jButtonGreenB3.setText("5");
        jButtonGreenB3.setForeground(black);
        jButtonGreenB3.setBackground(green);
        jButtonGreenB3.setBounds(370,260,100,30);
        jButtonGreenB3.setSize(150,30);
        jFrame.add(jButtonGreenB3);
        jButtonGreenB3.addActionListener(this);

        jButtonGreenMul = new JButton();
        jButtonGreenMul.setText("100000");
        jButtonGreenMul.setForeground(black);
        jButtonGreenMul.setBackground(green);
        jButtonGreenMul.setBounds(520,260,100,30);
        jButtonGreenMul.setSize(150,30);
        jFrame.add(jButtonGreenMul);
        jButtonGreenMul.addActionListener(this);

        jButtonGreenTol = new JButton();
        jButtonGreenTol.setText("0.5%");
        jButtonGreenTol.setForeground(black);
        jButtonGreenTol.setBackground(green);
        jButtonGreenTol.setBounds(670,260,100,30);
        jButtonGreenTol.setSize(150,30);
        jFrame.add(jButtonGreenTol);
        jButtonGreenTol.addActionListener(this);

//-------------------------------------------------------------------

        jButtonBlue = new JButton();
        jButtonBlue.setText("BLUE");
        jButtonBlue.setForeground(black);
        jButtonBlue.setBackground(blue);
        jButtonBlue.setBounds(70,290,100,30);
        jButtonBlue.setSize(150,30);
        jFrame.add(jButtonBlue);
        jButtonBlue.addActionListener(this);

        jButtonBlueB2 = new JButton();
        jButtonBlueB2.setText("6");
        jButtonBlueB2.setForeground(black);
        jButtonBlueB2.setBackground(blue);
        jButtonBlueB2.setBounds(220,290,100,30);
        jButtonBlueB2.setSize(150,30);
        jFrame.add(jButtonBlueB2);
        jButtonBlueB2.addActionListener(this);

        jButtonBlueB3 = new JButton();
        jButtonBlueB3.setText("6");
        jButtonBlueB3.setForeground(black);
        jButtonBlueB3.setBackground(blue);
        jButtonBlueB3.setBounds(370,290,100,30);
        jButtonBlueB3.setSize(150,30);
        jFrame.add(jButtonBlueB3);
        jButtonBlueB3.addActionListener(this);

        jButtonBlueMul = new JButton();
        jButtonBlueMul.setText("1000000");
        jButtonBlueMul.setForeground(black);
        jButtonBlueMul.setBackground(blue);
        jButtonBlueMul.setBounds(520,290,100,30);
        jButtonBlueMul.setSize(150,30);
        jFrame.add(jButtonBlueMul);
        jButtonBlueMul.addActionListener(this);

        jButtonBlueTol = new JButton();
        jButtonBlueTol.setText("0.25%");
        jButtonBlueTol.setForeground(black);
        jButtonBlueTol.setBackground(blue);
        jButtonBlueTol.setBounds(670,290,100,30);
        jButtonBlueTol.setSize(150,30);
        jFrame.add(jButtonBlueTol);
        jButtonBlueTol.addActionListener(this);

//------------------------------------------------------------------------

        jButtonViolet = new JButton();
        jButtonViolet.setText("VIOLET");
        jButtonViolet.setForeground(black);
        jButtonViolet.setBackground(new Color(128, 0, 255));
        jButtonViolet.setBounds(70,320,100,30);
        jButtonViolet.setSize(150,30);
        jFrame.add(jButtonViolet);
        jButtonViolet.addActionListener(this);

        jButtonVioletB2 = new JButton();
        jButtonVioletB2.setText("7");
        jButtonVioletB2.setForeground(black);
        jButtonVioletB2.setBackground(new Color(128, 0, 255));
        jButtonVioletB2.setBounds(220,320,100,30);
        jButtonVioletB2.setSize(150,30);
        jFrame.add(jButtonVioletB2);
        jButtonVioletB2.addActionListener(this);

        jButtonVioletB3 = new JButton();
        jButtonVioletB3.setText("7");
        jButtonVioletB3.setForeground(black);
        jButtonVioletB3.setBackground(new Color(128, 0, 255));
        jButtonVioletB3.setBounds(370,320,100,30);
        jButtonVioletB3.setSize(150,30);
        jFrame.add(jButtonVioletB3);
        jButtonVioletB3.addActionListener(this);

        jButtonVioletMul = new JButton();
        jButtonVioletMul.setText("10000000");
        jButtonVioletMul.setForeground(black);
        jButtonVioletMul.setBackground(new Color(128, 0, 255));
        jButtonVioletMul.setBounds(520,320,100,30);
        jButtonVioletMul.setSize(150,30);
        jFrame.add(jButtonVioletMul);
        jButtonVioletMul.addActionListener(this);

        jButtonVioletTol = new JButton();
        jButtonVioletTol.setText("0.1%");
        jButtonVioletTol.setForeground(black);
        jButtonVioletTol.setBackground(new Color(128, 0, 255));
        jButtonVioletTol.setBounds(670,320,100,30);
        jButtonVioletTol.setSize(150,30);
        jFrame.add(jButtonVioletTol);
        jButtonVioletTol.addActionListener(this);

// ------------------------------------------------------------------

        jButtonGrey = new JButton();
        jButtonGrey.setText("GRAY");
        jButtonGrey.setBackground(gray);
        jButtonGrey.setForeground(black);
        jButtonGrey.setBounds(70,350,100,30);
        jButtonGrey.setSize(150,30);
        jFrame.add(jButtonGrey);
        jButtonGrey.addActionListener(this);

        jButtonGreyB2 = new JButton();
        jButtonGreyB2.setText("8");
        jButtonGreyB2.setBackground(gray);
        jButtonGreyB2.setForeground(black);
        jButtonGreyB2.setBounds(220,350,100,30);
        jButtonGreyB2.setSize(150,30);
        jFrame.add(jButtonGreyB2);
        jButtonGreyB2.addActionListener(this);

        jButtonGreyB3 = new JButton();
        jButtonGreyB3.setText("8");
        jButtonGreyB3.setBackground(gray);
        jButtonGreyB3.setForeground(black);
        jButtonGreyB3.setBounds(370,350,100,30);
        jButtonGreyB3.setSize(150,30);
        jFrame.add(jButtonGreyB3);
        jButtonGreyB3.addActionListener(this);

        jButtonGreyMul = new JButton();
        jButtonGreyMul.setText("100000000");
        jButtonGreyMul.setBackground(gray);
        jButtonGreyMul.setForeground(black);
        jButtonGreyMul.setBounds(520,350,100,30);
        jButtonGreyMul.setSize(150,30);
        jFrame.add(jButtonGreyMul);
        jButtonGreyMul.addActionListener(this);

        jButtonGreyTol = new JButton();
        jButtonGreyTol.setText("0.05%");
        jButtonGreyTol.setBackground(gray);
        jButtonGreyTol.setForeground(black);
        jButtonGreyTol.setBounds(670,350,100,30);
        jButtonGreyTol.setSize(150,30);
        jFrame.add(jButtonGreyTol);
        jButtonGreyTol.addActionListener(this);

//---------------------------------------------------------------------


        jButtonWhite = new JButton();
        jButtonWhite.setText("WHITE");
        jButtonWhite.setBackground(white);
        jButtonWhite.setForeground(black);
        jButtonWhite.setBounds(70,380,100,30);
        jButtonWhite.setSize(150,30);
        jFrame.add(jButtonWhite);
        jButtonWhite.addActionListener(this);

        jButtonWhiteB2 = new JButton();
        jButtonWhiteB2.setText("9");
        jButtonWhiteB2.setBackground(white);
        jButtonWhiteB2.setForeground(black);
        jButtonWhiteB2.setBounds(220,380,100,30);
        jButtonWhiteB2.setSize(150,30);
        jFrame.add(jButtonWhiteB2);
        jButtonWhiteB2.addActionListener(this);

        jButtonWhiteB3 = new JButton();
        jButtonWhiteB3.setText("9");
        jButtonWhiteB3.setBackground(white);
        jButtonWhiteB3.setForeground(black);
        jButtonWhiteB3.setBounds(370,380,100,30);
        jButtonWhiteB3.setSize(150,30);
        jFrame.add(jButtonWhiteB3);
        jButtonWhiteB3.addActionListener(this);

        jButtonWhiteMul = new JButton();
        jButtonWhiteMul.setText("1000000000");
        jButtonWhiteMul.setBackground(white);
        jButtonWhiteMul.setForeground(black);
        jButtonWhiteMul.setBounds(520,380,100,30);
        jButtonWhiteMul.setSize(150,30);
        jFrame.add(jButtonWhiteMul);
        jButtonWhiteMul.addActionListener(this);

        jButton = new JButton();
        jButton.setText("-");
        jButton.setBackground(white);
        jButton.setForeground(black);
        jButton.setBounds(670,380,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

//--------------------------------------------------------------------


        jButtonGold = new JButton();
        jButtonGold.setText("GOLD");
        jButtonGold.setForeground(black);
        jButtonGold.setBackground(new Color(255,215,0));
        jButtonGold.setBounds(70,410,100,30);
        jButtonGold.setSize(150,30);
        jFrame.add(jButtonGold);
        jButtonGold.addActionListener(this);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(new Color(255,215,0));
        jButton.setBounds(220,410,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(new Color(255,215,0));
        jButton.setBounds(370,410,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

        jButtonGoldMul = new JButton();
        jButtonGoldMul.setText("0.1");
        jButtonGoldMul.setForeground(black);
        jButtonGoldMul.setBackground(new Color(255,215,0));
        jButtonGoldMul.setBounds(520,410,100,30);
        jButtonGoldMul.setSize(150,30);
        jFrame.add(jButtonGoldMul);
        jButtonGoldMul.addActionListener(this);

        jButtonGoldTol = new JButton();
        jButtonGoldTol.setText("5%");
        jButtonGoldTol.setForeground(black);
        jButtonGoldTol.setBackground(new Color(255,215,0));
        jButtonGoldTol.setBounds(670,410,100,30);
        jButtonGoldTol.setSize(150,30);
        jFrame.add(jButtonGoldTol);
        jButtonGoldTol.addActionListener(this);

//------------------------------------------------------------------

        jButtonSilver = new JButton();
        jButtonSilver.setText("SILVER");
        jButtonSilver.setForeground(black);
        jButtonSilver.setBackground(new Color(211,211,211));
        jButtonSilver.setBounds(70,440,100,30);
        jButtonSilver.setSize(150,30);
        jFrame.add(jButtonSilver);
        jButtonSilver.addActionListener(this);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(new Color(211,211,211));
        jButton.setBounds(220,440,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(new Color(211,211,211));
        jButton.setBounds(370,440,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

        jButtonSilverMul = new JButton();
        jButtonSilverMul.setText("0.01");
        jButtonSilverMul.setForeground(black);
        jButtonSilverMul.setBackground(new Color(211,211,211));
        jButtonSilverMul.setBounds(520,440,100,30);
        jButtonSilverMul.setSize(150,30);
        jFrame.add(jButtonSilverMul);
        jButtonSilverMul.addActionListener(this);

        jButtonSilverTol = new JButton();
        jButtonSilverTol.setText("10%");
        jButtonSilverTol.setForeground(black);
        jButtonSilverTol.setBackground(new Color(211,211,211));
        jButtonSilverTol.setBounds(670,440,100,30);
        jButtonSilverTol.setSize(150,30);
        jFrame.add(jButtonSilverTol);
        jButtonSilverTol.addActionListener(this);

//--------------------------------------------------------------

        jButtonNone = new JButton();
        jButtonNone.setText("NONE");
        jButtonNone.setForeground(black);
        jButtonNone.setBackground(white);
        jButtonNone.setBounds(70,470,100,30);
        jButtonNone.setSize(150,30);
        jFrame.add(jButtonNone);
        jButtonNone.addActionListener(this);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(white);
        jButton.setBounds(220,470,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(white);
        jButton.setBounds(370,470,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(white);
        jButton.setBounds(520,470,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

        jButtonNoneTol = new JButton();
        jButtonNoneTol.setText("20%");
        jButtonNoneTol.setForeground(black);
        jButtonNoneTol.setBackground(white);
        jButtonNoneTol.setBounds(670,470,100,30);
        jButtonNoneTol.setSize(150,30);
        jFrame.add(jButtonNoneTol);
        jButtonNoneTol.addActionListener(this);

//-------------------------------------------------------------------------------------







//======================================================================================

        jLabel = new JLabel();
        jLabel.setBounds(870, 50, 100, 30);
        jLabel.setText("1st Band");
        jFrame.add(jLabel);

        jTextFieldB1 = new JTextField();
        jTextFieldB1.setBounds(1000,50,200,30);
        jTextFieldB1.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldB1);

//------------------------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(870, 110, 100, 30);
        jLabel.setText("2nd Band");
        jFrame.add(jLabel);

        jTextFieldB2 = new JTextField();
        jTextFieldB2.setBounds(1000,110,200,30);
        jTextFieldB2.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldB2);

//--------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(870, 170, 100, 30);
        jLabel.setText("3rd Band");
        jFrame.add(jLabel);

        jTextFieldB3 = new JTextField();
        jTextFieldB3.setBounds(1000,170,200,30);
        jTextFieldB3.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldB3);

//----------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(870, 230, 100, 30);
        jLabel.setText("Multiplier");
        jFrame.add(jLabel);

        jTextFieldMultiplier = new JTextField();
        jTextFieldMultiplier.setBounds(1000,230,200,30);
        jTextFieldMultiplier.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldMultiplier);

//-------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(870, 290, 500, 30);
        jLabel.setText("Tolerance");
        jFrame.add(jLabel);

        jTextFieldTolarance = new JTextField();
        jTextFieldTolarance.setBounds(1000,290,200,30);
        jTextFieldTolarance.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldTolarance);

//-----------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(870, 350, 150, 30);
        jLabel.setText("Resistor Value in ohms");
        jFrame.add(jLabel);

        jTextFieldRValue = new JTextField();
        jTextFieldRValue.setBounds(1000,350,200,30);
        jTextFieldRValue.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldRValue);

//------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(870, 410, 150, 30);
        jLabel.setText("Min Range in ohms");
        jFrame.add(jLabel);

        jTextFieldMinRange = new JTextField();
        jTextFieldMinRange.setBounds(1000,410,200,30);
        jTextFieldMinRange.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldMinRange);

//-----------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(870, 470, 150, 30);
        jLabel.setText("Max Range in ohms");
        jFrame.add(jLabel);

        jTextFieldMaxRange = new JTextField();
        jTextFieldMaxRange.setBounds(1000,470,200,30);
        jTextFieldMaxRange.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldMaxRange);

//============================================================

        jButtonCalculate = new JButton();
        jButtonCalculate.setText("Calculate");
        jButtonCalculate.setBackground(lightGray);
        jButtonCalculate.setForeground(black);
        jButtonCalculate.setBounds(220,520,100,30);
        jButtonCalculate.setSize(150,100);
        jFrame.add(jButtonCalculate);
        jButtonCalculate.addActionListener(this);

//---------------------------------------------------------

        jButtonReset = new JButton();
        jButtonReset.setText("Reset");
        jButtonReset.setBackground(lightGray);
        jButtonReset.setForeground(black);
        jButtonReset.setBounds(540,520,100,30);
        jButtonReset.setSize(150,100);
        jFrame.add(jButtonReset);

        jButtonReset.addActionListener(this);


//---------------------------------------------------------

        jback = new JButton();
        jback.setText("Back");
        jback.setForeground(black);
        jback.setBackground(white);
        jback.setBounds(1100,600,100,30);
        jback.setSize(150,30);
        jFrame.add(jback);
        jback.addActionListener(this);

//---------------------------------------------------------
        jButtonExit = new JButton();
        jButtonExit.setText("Exit");
        jButtonExit.setBackground(lightGray);
        jButtonExit.setForeground(black);
        jButtonExit.setBounds(840,520,100,30);
        jButtonExit.setSize(150,100);
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
