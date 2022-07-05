package ricalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

public class ResistanceThreeBand implements ActionListener {

    JFrame jFrame;
    JLabel jLabel, jLabelFacts, jLabelFactText1, jLabelFactText2, jLabelFactText3, jLabelFactText4, jLabelFactText5, jLabelFactText6, jLabelFactText7, jLabelFactText8;
    Font font;
    JTextField jTextField;
    JTextField jTextFieldB1, jTextFieldB2, jTextFieldMultiplier, jTextFieldTolarance, jTextFieldRValue, jTextFieldMinRange, jTextFieldMaxRange;

    JButton jButton;
    JButton jButtonCalculate, jButtonReset, jButtonExit, jback;
    JButton jButtonBlack, jButtonBlackB2, jButtonBlackMul;
    JButton jButtonBrown, jButtonBrownB2, jButtonBrownMul, jButtonBrownTol;
    JButton jButtonRed, jButtonRedB2, jButtonRedMul, jButtonRedTol;
    JButton jButtonOrange, jButtonOrangeB2, jButtonOrangeMul, jButtonOrangeTol;
    JButton jButtonYellow, jButtonYellowB2, jButtonYellowMul, jButtonYellowTol;
    JButton jButtonGreen, jButtonGreenB2, jButtonGreenMul, jButtonGreenTol;
    JButton jButtonBlue, jButtonBlueB2, jButtonBlueMul, jButtonBlueTol;
    JButton jButtonViolet, jButtonVioletB2, jButtonVioletMul, jButtonVioletTol;
    JButton jButtonGrey, jButtonGreyB2, jButtonGreyMul, jButtonGreyTol;
    JButton jButtonWhite, jButtonWhiteB2, jButtonWhiteMul;
    JButton jButtonGold, jButtonGoldMul, jButtonGoldTol;
    JButton jButtonSilver, jButtonSilverMul, jButtonSilverTol;
    JButton jButtonNone, jButtonNoneTol;

    public ResistanceThreeBand()
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
        jLabel.setText("3 BAND RESISTANCE CALCULATOR ");
        jLabel.setFont(font);
        jLabel.setBorder(BorderFactory.createLineBorder(Color.black));


        jFrame.add(jLabel); // Frame is just a plane. We put(add) different lables, buttons etc on the frame using .add


//----------------------------------------


//COLOUR BUTTONS

        jLabelFacts = new JLabel();
        jLabelFacts.setText("FACT FILE:");
        jLabelFacts.setBounds(1000, 200, 500, 15);
        jFrame.add(jLabelFacts);


        jLabelFactText1 = new JLabel();
        jLabelFactText1.setText("A resistor is an electrical component that limits or regulates ");
        jLabelFactText1.setBounds(1000, 230, 500, 15);
        jFrame.add(jLabelFactText1);

        jLabelFactText2 = new JLabel();
        jLabelFactText2.setText("the flow of electrical current in an electronic circuit.");
        jLabelFactText2.setBounds(1000, 250, 500, 15);
        jFrame.add(jLabelFactText2);

        jLabelFactText3 = new JLabel();
        jLabelFactText3.setText("Resistors can also be used to provide a specific voltage for an ");
        jLabelFactText3.setBounds(1000, 270, 500, 15);
        jFrame.add(jLabelFactText3);

        jLabelFactText4 = new JLabel();
        jLabelFactText4.setText("active device such as a transistor.");
        jLabelFactText4.setBounds(1000, 290, 500, 15);
        jFrame.add(jLabelFactText4);

        jLabelFactText5 = new JLabel();
        jLabelFactText5.setText("Why are resistors needed?");
        jLabelFactText5.setBounds(1000, 330, 500, 15);
        jFrame.add(jLabelFactText5);

        jLabelFactText6 = new JLabel();
        jLabelFactText6.setText("Resistors ensure components receive the proper voltage by ");
        jLabelFactText6.setBounds(1000, 350, 500, 15);
        jFrame.add(jLabelFactText6);

        jLabelFactText7 = new JLabel();
        jLabelFactText7.setText("creating a voltage drop, and they can protect a component from voltage spikes.");
        jLabelFactText7.setBounds(1000, 370, 500, 15);
        jFrame.add(jLabelFactText7);

        jLabelFactText8 = new JLabel();
        jLabelFactText8.setText("from voltage spikes.");
        jLabelFactText8.setBounds(1000, 390, 500, 15);
        jFrame.add(jLabelFactText8);





        jLabel = new JLabel();
        jLabel.setBounds(70, 80, 50, 30);
        jLabel.setText("1st Band");
        jFrame.add(jLabel);

        jButtonBlack = new JButton();
        jButtonBlack.setText("BLACK");
        jButtonBlack.setForeground(white);
        jButtonBlack.setBackground(black);
        jButtonBlack.setBounds(20,110,100,30);
        jButtonBlack.setSize(150,30);
//        jButtonBlack.setAction(jTextFieldB1.setText("0"));
        jFrame.add(jButtonBlack);
        jButtonBlack.addActionListener(this);




        jLabel = new JLabel();
        jLabel.setBounds(220, 80, 100, 30);
        jLabel.setText("2nd Band");
        jFrame.add(jLabel);

        jButtonBlackB2 = new JButton();
        jButtonBlackB2.setText("0");
        jButtonBlackB2.setBackground(black);
        jButtonBlackB2.setForeground(white);
        jButtonBlackB2.setBounds(170,110,100,30);
        jButtonBlackB2.setSize(150,30);
        jFrame.add(jButtonBlackB2);
        jButtonBlackB2.addActionListener(this);


        jLabel = new JLabel();
        jLabel.setBounds(370, 80, 100, 30);
        jLabel.setText("Multiplier");
        jFrame.add(jLabel);

        jButtonBlackMul = new JButton();
        jButtonBlackMul.setText("1");
        jButtonBlackMul.setBackground(black);
        jButtonBlackMul.setForeground(white);
        jButtonBlackMul.setBounds(320,110,100,30);
        jButtonBlackMul.setSize(150,30);
        jFrame.add(jButtonBlackMul);
        jButtonBlackMul.addActionListener(this);


//-----------------------------------------------------------------

        jButtonBrown = new JButton();
        jButtonBrown.setText("BROWN");
        jButtonBrown.setForeground(white);
        jButtonBrown.setBackground(new Color(150,75,0));
        jButtonBrown.setBounds(20,140,100,30);
        jButtonBrown.setSize(150,30);
        jFrame.add(jButtonBrown);
        jButtonBrown.addActionListener(this);

        jButtonBrownB2 = new JButton();
        jButtonBrownB2.setText("1");
        jButtonBrownB2.setForeground(white);
        jButtonBrownB2.setBackground(new Color(150,75,0));
        jButtonBrownB2.setBounds(170,140,100,30);
        jButtonBrownB2.setSize(150,30);
        jFrame.add(jButtonBrownB2);
        jButtonBrownB2.addActionListener(this);

        jButtonBrownMul = new JButton();
        jButtonBrownMul.setText("10");
        jButtonBrownMul.setForeground(white);
        jButtonBrownMul.setBackground(new Color(150,75,0));
        jButtonBrownMul.setBounds(320,140,100,30);
        jButtonBrownMul.setSize(150,30);
        jFrame.add(jButtonBrownMul);
        jButtonBrownMul.addActionListener(this);


//----------------------------------------------------------------



        jButtonRed = new JButton();
        jButtonRed.setText("RED");
        jButtonRed.setForeground(black);
        jButtonRed.setBackground(red);
        jButtonRed.setBounds(20,170,100,30);
        jButtonRed.setSize(150,30);
        jFrame.add(jButtonRed);
        jButtonRed.addActionListener(this);

        jButtonRedB2 = new JButton();
        jButtonRedB2.setText("2");
        jButtonRedB2.setForeground(black);
        jButtonRedB2.setBackground(red);
        jButtonRedB2.setBounds(170,170,100,30);
        jButtonRedB2.setSize(150,30);
        jFrame.add(jButtonRedB2);
        jButtonRedB2.addActionListener(this);

        jButtonRedMul = new JButton();
        jButtonRedMul.setText("100");
        jButtonRedMul.setForeground(black);
        jButtonRedMul.setBackground(red);
        jButtonRedMul.setBounds(320,170,100,30);
        jButtonRedMul.setSize(150,30);
        jFrame.add(jButtonRedMul);
        jButtonRedMul.addActionListener(this);

//-----------------------------------------------------------------


        jButtonOrange = new JButton();
        jButtonOrange.setText("ORANGE");
        jButtonOrange.setForeground(black);
        jButtonOrange.setBackground(new Color(255,165,0));
        jButtonOrange.setBounds(20,200,100,30);
        jButtonOrange.setSize(150,30);
        jFrame.add(jButtonOrange);
        jButtonOrange.addActionListener(this);

        jButtonOrangeB2 = new JButton();
        jButtonOrangeB2.setText("3");
        jButtonOrangeB2.setForeground(black);
        jButtonOrangeB2.setBackground(new Color(255,165,0));
        jButtonOrangeB2.setBounds(170,200,100,30);
        jButtonOrangeB2.setSize(150,30);
        jFrame.add(jButtonOrangeB2);
        jButtonOrangeB2.addActionListener(this);

        jButtonOrangeMul = new JButton();
        jButtonOrangeMul.setText("1000");
        jButtonOrangeMul.setForeground(black);
        jButtonOrangeMul.setBackground(new Color(255,165,0));
        jButtonOrangeMul.setBounds(320,200,100,30);
        jButtonOrangeMul.setSize(150,30);
        jFrame.add(jButtonOrangeMul);
        jButtonOrangeMul.addActionListener(this);


//-------------------------------------------------------------

        jButtonYellow = new JButton();
        jButtonYellow.setText("YELLOW");
        jButtonYellow.setForeground(black);
        jButtonYellow.setBackground(yellow);
        jButtonYellow.setBounds(20,230,100,30);
        jButtonYellow.setSize(150,30);
        jFrame.add(jButtonYellow);
        jButtonYellow.addActionListener(this);

        jButtonYellowB2 = new JButton();
        jButtonYellowB2.setText("4");
        jButtonYellowB2.setForeground(black);
        jButtonYellowB2.setBackground(yellow);
        jButtonYellowB2.setBounds(170,230,100,30);
        jButtonYellowB2.setSize(150,30);
        jFrame.add(jButtonYellowB2);
        jButtonYellowB2.addActionListener(this);

        jButtonYellowMul = new JButton();
        jButtonYellowMul.setText("10000");
        jButtonYellowMul.setForeground(black);
        jButtonYellowMul.setBackground(yellow);
        jButtonYellowMul.setBounds(320,230,100,30);
        jButtonYellowMul.setSize(150,30);
        jFrame.add(jButtonYellowMul);
        jButtonYellowMul.addActionListener(this);


// ---------------------------------------------------------------


        jButtonGreen = new JButton();
        jButtonGreen.setText("GREEN");
        jButtonGreen.setForeground(black);
        jButtonGreen.setBackground(green);
        jButtonGreen.setBounds(20,260,100,30);
        jButtonGreen.setSize(150,30);
        jFrame.add(jButtonGreen);
        jButtonGreen.addActionListener(this);

        jButtonGreenB2 = new JButton();
        jButtonGreenB2.setText("5");
        jButtonGreenB2.setForeground(black);
        jButtonGreenB2.setBackground(green);
        jButtonGreenB2.setBounds(170,260,100,30);
        jButtonGreenB2.setSize(150,30);
        jFrame.add(jButtonGreenB2);
        jButtonGreenB2.addActionListener(this);

        jButtonGreenMul = new JButton();
        jButtonGreenMul.setText("100000");
        jButtonGreenMul.setForeground(black);
        jButtonGreenMul.setBackground(green);
        jButtonGreenMul.setBounds(320,260,100,30);
        jButtonGreenMul.setSize(150,30);
        jFrame.add(jButtonGreenMul);
        jButtonGreenMul.addActionListener(this);


//-------------------------------------------------------------------

        jButtonBlue = new JButton();
        jButtonBlue.setText("BLUE");
        jButtonBlue.setForeground(black);
        jButtonBlue.setBackground(blue);
        jButtonBlue.setBounds(20,290,100,30);
        jButtonBlue.setSize(150,30);
        jFrame.add(jButtonBlue);
        jButtonBlue.addActionListener(this);

        jButtonBlueB2 = new JButton();
        jButtonBlueB2.setText("6");
        jButtonBlueB2.setForeground(black);
        jButtonBlueB2.setBackground(blue);
        jButtonBlueB2.setBounds(170,290,100,30);
        jButtonBlueB2.setSize(150,30);
        jFrame.add(jButtonBlueB2);
        jButtonBlueB2.addActionListener(this);

        jButtonBlueMul = new JButton();
        jButtonBlueMul.setText("1000000");
        jButtonBlueMul.setForeground(black);
        jButtonBlueMul.setBackground(blue);
        jButtonBlueMul.setBounds(320,290,100,30);
        jButtonBlueMul.setSize(150,30);
        jFrame.add(jButtonBlueMul);
        jButtonBlueMul.addActionListener(this);


//------------------------------------------------------------------------

        jButtonViolet = new JButton();
        jButtonViolet.setText("VIOLET");
        jButtonViolet.setForeground(black);
        jButtonViolet.setBackground(new Color(128, 0, 255));
        jButtonViolet.setBounds(20,320,100,30);
        jButtonViolet.setSize(150,30);
        jFrame.add(jButtonViolet);
        jButtonViolet.addActionListener(this);

        jButtonVioletB2 = new JButton();
        jButtonVioletB2.setText("7");
        jButtonVioletB2.setForeground(black);
        jButtonVioletB2.setBackground(new Color(128, 0, 255));
        jButtonVioletB2.setBounds(170,320,100,30);
        jButtonVioletB2.setSize(150,30);
        jFrame.add(jButtonVioletB2);
        jButtonVioletB2.addActionListener(this);

        jButtonVioletMul = new JButton();
        jButtonVioletMul.setText("10000000");
        jButtonVioletMul.setForeground(black);
        jButtonVioletMul.setBackground(new Color(128, 0, 255));
        jButtonVioletMul.setBounds(320,320,100,30);
        jButtonVioletMul.setSize(150,30);
        jFrame.add(jButtonVioletMul);
        jButtonVioletMul.addActionListener(this);


// ------------------------------------------------------------------

        jButtonGrey = new JButton();
        jButtonGrey.setText("GRAY");
        jButtonGrey.setBackground(gray);
        jButtonGrey.setForeground(black);
        jButtonGrey.setBounds(20,350,100,30);
        jButtonGrey.setSize(150,30);
        jFrame.add(jButtonGrey);
        jButtonGrey.addActionListener(this);

        jButtonGreyB2 = new JButton();
        jButtonGreyB2.setText("8");
        jButtonGreyB2.setBackground(gray);
        jButtonGreyB2.setForeground(black);
        jButtonGreyB2.setBounds(170,350,100,30);
        jButtonGreyB2.setSize(150,30);
        jFrame.add(jButtonGreyB2);
        jButtonGreyB2.addActionListener(this);

        jButtonGreyMul = new JButton();
        jButtonGreyMul.setText("100000000");
        jButtonGreyMul.setBackground(gray);
        jButtonGreyMul.setForeground(black);
        jButtonGreyMul.setBounds(320,350,100,30);
        jButtonGreyMul.setSize(150,30);
        jFrame.add(jButtonGreyMul);
        jButtonGreyMul.addActionListener(this);


//---------------------------------------------------------------------


        jButtonWhite = new JButton();
        jButtonWhite.setText("WHITE");
        jButtonWhite.setBackground(white);
        jButtonWhite.setForeground(black);
        jButtonWhite.setBounds(20,380,100,30);
        jButtonWhite.setSize(150,30);
        jFrame.add(jButtonWhite);
        jButtonWhite.addActionListener(this);

        jButtonWhiteB2 = new JButton();
        jButtonWhiteB2.setText("9");
        jButtonWhiteB2.setBackground(white);
        jButtonWhiteB2.setForeground(black);
        jButtonWhiteB2.setBounds(170,380,100,30);
        jButtonWhiteB2.setSize(150,30);
        jFrame.add(jButtonWhiteB2);
        jButtonWhiteB2.addActionListener(this);

        jButtonWhiteMul = new JButton();
        jButtonWhiteMul.setText("1000000000");
        jButtonWhiteMul.setBackground(white);
        jButtonWhiteMul.setForeground(black);
        jButtonWhiteMul.setBounds(320,380,100,30);
        jButtonWhiteMul.setSize(150,30);
        jFrame.add(jButtonWhiteMul);
        jButtonWhiteMul.addActionListener(this);

//--------------------------------------------------------------------


        jButtonGold = new JButton();
        jButtonGold.setText("GOLD");
        jButtonGold.setForeground(black);
        jButtonGold.setBackground(new Color(255,215,0));
        jButtonGold.setBounds(20,410,100,30);
        jButtonGold.setSize(150,30);
        jFrame.add(jButtonGold);
        jButtonGold.addActionListener(this);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(new Color(255,215,0));
        jButton.setBounds(170,410,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

        jButtonGoldMul = new JButton();
        jButtonGoldMul.setText("0.1");
        jButtonGoldMul.setForeground(black);
        jButtonGoldMul.setBackground(new Color(255,215,0));
        jButtonGoldMul.setBounds(320,410,100,30);
        jButtonGoldMul.setSize(150,30);
        jFrame.add(jButtonGoldMul);
        jButtonGoldMul.addActionListener(this);

//------------------------------------------------------------------

        jButtonSilver = new JButton();
        jButtonSilver.setText("SILVER");
        jButtonSilver.setForeground(black);
        jButtonSilver.setBackground(new Color(211,211,211));
        jButtonSilver.setBounds(20,440,100,30);
        jButtonSilver.setSize(150,30);
        jFrame.add(jButtonSilver);
        jButtonSilver.addActionListener(this);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(new Color(211,211,211));
        jButton.setBounds(170,440,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

        jButtonSilverMul = new JButton();
        jButtonSilverMul.setText("0.01");
        jButtonSilverMul.setForeground(black);
        jButtonSilverMul.setBackground(new Color(211,211,211));
        jButtonSilverMul.setBounds(320,440,100,30);
        jButtonSilverMul.setSize(150,30);
        jFrame.add(jButtonSilverMul);
        jButtonSilverMul.addActionListener(this);

//--------------------------------------------------------------

        jButtonNone = new JButton();
        jButtonNone.setText("NONE");
        jButtonNone.setForeground(black);
        jButtonNone.setBackground(white);
        jButtonNone.setBounds(20,470,100,30);
        jButtonNone.setSize(150,30);
        jFrame.add(jButtonNone);
        jButtonNone.addActionListener(this);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(white);
        jButton.setBounds(170,470,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

        jButton = new JButton();
        jButton.setText("");
        jButton.setForeground(black);
        jButton.setBackground(white);
        jButton.setBounds(320,470,100,30);
        jButton.setSize(150,30);
        jFrame.add(jButton);

//======================================================================================

        jLabel = new JLabel();
        jLabel.setBounds(670, 110, 100, 30);
        jLabel.setText("1st Band");
        jFrame.add(jLabel);

        jTextFieldB1 = new JTextField();
        jTextFieldB1.setBounds(790,110,200,30);
        jTextFieldB1.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldB1);

//--------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(670, 170, 100, 30);
        jLabel.setText("2nd Band");
        jFrame.add(jLabel);

        jTextFieldB2 = new JTextField();
        jTextFieldB2.setBounds(790,170,200,30);
        jTextFieldB2.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldB2);

//----------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(670, 230, 100, 30);
        jLabel.setText("Multiplier");
        jFrame.add(jLabel);

        jTextFieldMultiplier = new JTextField();
        jTextFieldMultiplier.setBounds(790,230,200,30);
        jTextFieldMultiplier.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldMultiplier);

//-------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(670, 290, 100, 30);
        jLabel.setText("Tolerance");
        jFrame.add(jLabel);

        jTextFieldTolarance = new JTextField();
        jTextFieldTolarance.setBounds(790,290,200,30);
        jTextFieldTolarance.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldTolarance);

//-----------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(650, 350, 150, 30);
        jLabel.setText("Resistor Value in ohms");
        jFrame.add(jLabel);

        jTextFieldRValue = new JTextField();
        jTextFieldRValue.setBounds(790,350,200,30);
        jTextFieldRValue.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldRValue);

//------------------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(670, 410, 150, 30);
        jLabel.setText("Min Range in ohms");
        jFrame.add(jLabel);

        jTextFieldMinRange = new JTextField();
        jTextFieldMinRange.setBounds(790,410,200,30);
        jTextFieldMinRange.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextFieldMinRange);

//-----------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(670, 470, 150, 30);
        jLabel.setText("Max Range in ohms");
        jFrame.add(jLabel);

        jTextFieldMaxRange = new JTextField();
        jTextFieldMaxRange.setBounds(790,470,200,30);
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

        jButtonExit = new JButton();
        jButtonExit.setText("Exit");
        jButtonExit.setBackground(lightGray);
        jButtonExit.setForeground(black);
        jButtonExit.setBounds(840,520,100,30);
        jButtonExit.setSize(150,100);
        jFrame.add(jButtonExit);

        jButtonExit.addActionListener(this);
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
            else if(e.getSource() == jButtonBrownMul)
            {
                jTextFieldMultiplier.setText("10");
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
            else if(e.getSource() == jButtonRedMul)
            {
                jTextFieldMultiplier.setText("100");
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
            else if(e.getSource() == jButtonOrangeMul)
            {
                jTextFieldMultiplier.setText("1000");
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
            else if(e.getSource() == jButtonYellowMul)
            {
                jTextFieldMultiplier.setText("10000");
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
            else if(e.getSource() == jButtonGreenMul)
            {
                jTextFieldMultiplier.setText("100000");
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
            else if(e.getSource() == jButtonBlueMul)
            {
                jTextFieldMultiplier.setText("1000000");
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
            else if(e.getSource() == jButtonVioletMul)
            {
                jTextFieldMultiplier.setText("10000000");
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
            else if(e.getSource() == jButtonGreyMul)
            {
                jTextFieldMultiplier.setText("100000000");
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

//----------------------------------------------------------------------------------------
            else if (e.getSource() == jButtonGold)
            {
                jTextFieldTolarance.setText("0.05");
            }
            else if (e.getSource() == jButtonGoldMul)
            {
                jTextFieldMultiplier.setText("0.1");
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

//-------------------------------------------------------------------------------------------
            else if(e.getSource() == jButtonNone)
            {
                jTextFieldTolarance.setText("0.2");
            }


//================================================================================================




            else if (e.getSource() == jButtonCalculate)
            {

                String b1 = jTextFieldB1.getText();
                String b2 = jTextFieldB2.getText();
                String MulInString = jTextFieldMultiplier.getText();
                String tolInString = "20";
                jTextFieldTolarance.setText("20%");
                float MulInInt = Float.parseFloat(MulInString);

                float tolInFloat = Float.parseFloat(tolInString);


                String numInString = b1.concat(b2);
                float numInInt = Float.parseFloat(numInString);
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
