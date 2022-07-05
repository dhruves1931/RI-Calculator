package ricalculator;


import javax.swing.*;
import java.awt.*;


public class ProgramCheck {
    JFrame jFrame;
    JLabel jLabel;
    Font font;
    JTextField jTextField;
    JComboBox jComboBox;
    ImageIcon imageIcon;
    Box box;
    JButton jButton;
    {

        font = new Font("Consolas",Font.BOLD,28);

        jFrame = new JFrame();
        jFrame.setBounds(50,50,500,400);
        jFrame.setTitle("Student Registration");
        jFrame.setVisible(true);
        jFrame.setLayout(null);   // In default, the GUI is divided in various grid boxes. jFrame.setLayout(null); erases all those grids. In other words, null layout means absolute positioning - you have to do all the work in your code. No layout manager to help you out.

        jLabel = new JLabel();
        jLabel.setBounds(20,10,200,30);
        jLabel.setText("Enter ID : ");
        jLabel.setFont(font);

        jTextField = new JTextField();
        jTextField.setBounds(240,10,200,30);
        jTextField.setFont(font);

        jFrame.add(jLabel); // Frame is just a plane. We put(add) different lables, buttons etc on the frame using .add
        jFrame.add(jTextField);


//----------------------------------------
        jLabel = new JLabel();
        jLabel.setBounds(20,10,200,130);
        jLabel.setText("Enter Name : ");
        jLabel.setFont(font);

        jTextField = new JTextField();
        jTextField.setBounds(240,60,200,30);
        jTextField.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextField);



//-------------------------------------------
        jLabel = new JLabel();
        jLabel.setBounds(20,10,200,130);

        String College[] = {"RCOEM", "YCCE", "Raisoni", "S.B. Jain"};

        jComboBox =new JComboBox(College);
        jComboBox.setBounds(240, 110,200,30);

        jLabel.setText("College : ");
        jLabel.setBounds(20,60,200,130);


        jLabel.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jComboBox);



//--------------------------------------------------
        jLabel = new JLabel();
        jLabel.setBounds(20,10,200,130);

        String Dept[] = {"CS", "EE", "IT", "ME", "EN", "Civil"};

        jLabel.setText("Dept : ");
        jLabel.setBounds(20,110,200,130);

        jComboBox =new JComboBox(Dept);
        jComboBox.setBounds(240, 160,200,30);


        jLabel.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jComboBox);

//------------------------------------------------------------
        jLabel = new JLabel();
        jLabel.setBounds(20,10,200,130);

        String Sem[] = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};

        jLabel.setText("Sem : ");
        jLabel.setBounds(20,160,200,130);

        jComboBox =new JComboBox(Sem);
        jComboBox.setBounds(240, 210,200,30);


        jLabel.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jComboBox);

//-------------------------------------------------------------
        jLabel = new JLabel();
        jLabel.setBounds(20,210,200,130);
//        julianCalendar = new JulianCalendar();

        jLabel.setText("Date : ");

        jLabel.setFont(font);

        jFrame.add(jLabel);


        //jComboBox =new JComboBox(Sem);
        //jComboBox.setBounds(240, 260,200,30);


        // DATE WALA NAHI JAM RAHA.
//------------------------------------------------------------

        jLabel = new JLabel();
        jLabel.setBounds(20,260,200,130);
        jLabel.setText("Mobile No. : ");
        jLabel.setFont(font);

        jTextField = new JTextField();
        jTextField.setBounds(240,310,200,30);
        jTextField.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextField);

//-----------------------------------------------------------
        jLabel = new JLabel();
        jLabel.setBounds(20,310,200,130);
        jLabel.setText("Email : ");
        jLabel.setFont(font);

        jTextField = new JTextField();
        jTextField.setBounds(240,360,200,30);
        jTextField.setFont(font);

        jFrame.add(jLabel);
        jFrame.add(jTextField);



//----------------------------------------------------------

        imageIcon = new ImageIcon("C:\\Users\\LENOVO\\Pictures\\Saved Pictures");
        box = new Box(1);
        box.setBounds(550,50,500,500);
        box.setVisible(true);

        imageIcon.setDescription("Student Image");

        jFrame.add(box);

        //YE IMAGE ICON/ PICTURE BOX NAHI BAN RAHA
//-------------------------------------------------------------
        jButton = new JButton();
        jButton.setText("Submit");

        jButton.setBounds(20,410,100,30);

        jFrame.add(jButton);


    }
}
