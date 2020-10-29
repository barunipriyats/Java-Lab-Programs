/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_13;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Baruni Priya T S
 */
public class Registration_form {
    
    JFrame frame1;
    JLabel label1, label2, password1, password2, signin, signin1;
    JTextField textbox1, textbox2, textbox3;
    JPasswordField password11, password22;
    JCheckBox checkbox;
    JButton register;
    
    Registration_form() {
        
        frame1 = new JFrame(" Registration_form ");
        
        label1 = new JLabel(" Register ");
        label1.setBounds(170, 10, 300, 100);
        label1.setFont(new Font(" Verdana ", Font.PLAIN, 30));
        
        label2 = new JLabel(" Create your account. It's free and only takes a minute. ");
        label2.setBounds(50, 50, 500, 100);
        label2.setFont(new Font(" Arial ", Font.PLAIN, 15));
        
        textbox1 = new JTextField(" First Name ");
        textbox1.setBounds(50, 150, 150, 30);
        textbox1.setFont(new Font(" Arial ", Font.PLAIN, 12));
        
        textbox2 = new JTextField(" Last Name ");
        textbox2.setBounds(250, 150, 150, 30);
        textbox2.setFont(new Font(" Arial ", Font.PLAIN, 12));
        
        textbox3 = new JTextField(" Email ");
        textbox3.setBounds(50, 200, 350, 30);
        textbox3.setFont(new Font(" Arial ", Font.PLAIN, 12));
        
        password1 = new JLabel(" Password ");
        password1.setBounds(50, 250, 70, 30);
        password1.setFont(new Font(" Arial ", Font.PLAIN, 12));
        
        password11 = new JPasswordField();
        password11.setBounds(200, 250, 200, 30);
        
        password2 = new JLabel(" Confirm Password ");
        password2.setBounds(50, 300, 150, 30);
        password2.setFont(new Font(" Arial ", Font.PLAIN, 12));
        
        password22 = new JPasswordField();
        password22.setBounds(200, 300, 200, 30);
        
        checkbox = new JCheckBox(" I accept the Terms of Use & Privacy Policy. ");
        checkbox.setBounds(50, 350, 500, 30);
        checkbox.setFont(new Font(" Arial ", Font.PLAIN, 12));
        
        register = new JButton(" Register Now ");
        register.setBounds(50, 400, 350, 30);
        Color c = new Color(0,153,0);
        register.setBackground(c);
        register.setForeground(Color.WHITE);
        
        signin = new JLabel(" Already have an account? ");
        signin.setBounds(140, 450, 150, 30);
        signin.setFont(new Font(" Arial ", Font.PLAIN, 12));
        
        signin1 = new JLabel(" Sign in ");
        signin1.setBounds(285, 450, 100, 30);
        signin1.setFont(new Font(" Arial ", Font.ITALIC, 12));
        
        frame1.add(label1);
        frame1.add(label2);
        frame1.add(textbox1);
        frame1.add(textbox2);
        frame1.add(textbox3);
        frame1.add(password1);
        frame1.add(password11);
        frame1.add(password2);
        frame1.add(password22);
        frame1.add(checkbox);
        frame1.add(register);
        frame1.add(signin);
        frame1.add(signin1);
        frame1.setLayout(null);
        frame1.setSize(500, 600);
        frame1.setVisible(true);      
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        
        new Registration_form();
        
    }
    
}
