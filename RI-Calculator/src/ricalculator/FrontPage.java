
package ricalculator;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;

public class FrontPage implements ActionListener {

    JFrame jFrameFront;
    JLabel jLabel,jLabel2,jlabel3, jLabel4;
    Font font,font2,font3,font4;
    JButton jButtonGetStarted;
    ImageIcon rcoemImg = new ImageIcon("RCOEM-logo1.png");

    public FrontPage() throws IOException {



        font = new Font("Aerial",Font.BOLD,34);
        font2 = new Font("Aerial",Font.BOLD,30);
        font3 = new Font("Algerian",Font.BOLD,30);
        font4 = new Font("Aerial",Font.BOLD,30);

        jFrameFront = new JFrame();
        jFrameFront.setBounds(0,0,500,400);
        jFrameFront.getContentPane().setBackground(Color.black);
        jFrameFront.setSize(1400, 750);
        jFrameFront.setTitle("R-I CALCULATOR");
        jFrameFront.setVisible(true);
        jFrameFront.setLayout(null);



        jLabel = new JLabel();
        jLabel.setBounds(40,30,1500,210);
        jLabel.setText("<HTML> <U>SHRI RAMDEOBABA COLLEGE OF ENGINEERING AND MANAGEMENT,NAGPUR </U> </HTML>");
        jLabel.setForeground(Color.white);
        jLabel.setFont(font);
//        jLabel.setBorder(BorderFactory.createLineBorder(Color.white));


       BufferedImage myImg = ImageIO.read(new File("C:\\Users\\LENOVO\\Desktop\\RCOEM-logo.png"));

        JLabel picLabel = new JLabel(new ImageIcon(myImg));
//        picLabel.setBounds(10,5,250,100);   // Img at top left corner
        picLabel.setBounds(600,5,250,100);  // Img at top mid
//        picLabel.setSize(15,15);

//        jFrameFront.add(new JLabel(new ImageIcon("Desktop/RCOEM-logo.png")));


        jLabel2 = new JLabel();
        jLabel2.setBounds(480,150,1500,210);
        jLabel2.setText("<HTML> <U> E CIRCUIT DESIGN AND TESTING LAB </U> </HTML>");
        jLabel2.setForeground(Color.white);
        jLabel2.setFont(font2);

        jlabel3 = new JLabel();
        jLabel4 = new JLabel();
        jlabel3.setBounds(130,270,1500,210);
        jlabel3.setText("<HTML> <U>CALCULATION OF RESISTANCE AND INDUCTANCE FOR GIVEN COLOR CODE </U> </HTML> ");
        jLabel4.setText("<HTML> <U> USING JAVA </U> </HTML> ");
        jLabel4.setBounds(630,310,1500,210);
        jlabel3.setForeground(Color.white);
        jLabel4.setForeground(Color.white);
        jlabel3.setFont(font3);
        jLabel4.setFont(font3);
//        jLabel4.setBorder(BorderFactory.createLineBorder(Color.white));
//        jlabel3.setBorder(BorderFactory.createLineBorder(Color.white));

        jButtonGetStarted = new JButton();
        jButtonGetStarted.setText("<HTML><U>GET STARTED <U> </HTML>");
        jButtonGetStarted.setForeground(Color.black);
        jButtonGetStarted.setBackground(Color.LIGHT_GRAY);
        jButtonGetStarted.setBounds(600,550,200,50);
        jButtonGetStarted.setSize(270,100);
        jButtonGetStarted.setFont(font4);
        jButtonGetStarted.addActionListener(this);

        jFrameFront.add(jLabel);
        jFrameFront.add(jLabel2);
        jFrameFront.add(jlabel3);
        jFrameFront.add(jLabel4);
        jFrameFront.add(jButtonGetStarted);
        jFrameFront.add(picLabel);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == jButtonGetStarted) {
                ChooseRI obj = new ChooseRI();
                jFrameFront.dispose();
            }


        }

        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
}