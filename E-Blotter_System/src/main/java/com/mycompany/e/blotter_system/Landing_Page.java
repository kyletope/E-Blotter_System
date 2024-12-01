package com.mycompany.e.blotter_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Landing_Page {
    public void frames() {
        // Create the frame
        JFrame frame = new JFrame();
        
        // Set the size of the frame before using it
        frame.setSize(1000, 700);
        
        // Set the title
        frame.setTitle("E-Blotter System");
        
        // Set frame's default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the layout manager to null to manually position components
        frame.setLayout(null);
        
        // Create and position the title label
        JLabel title = new JLabel("E-BLOTTER SYSTEM");
        title.setBounds(350, 10, 400, 50); // Set position and size of title label
        title.setFont(new Font("Arial", Font.BOLD, 35)); // Optional: to make the title more prominent
        
        // USERNAME
        JLabel usernameLabel = new JLabel ("USERNAME: ");
        usernameLabel.setBounds (150,180, 400, 30 );
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 30));
        
        //USERNAME INPUT
        JTextField usernameText = new JTextField(180);
        usernameText.setBounds(400, 180, 400, 30 );
        
        //PASSWORD
        JLabel passwordLabel = new JLabel ("PASSWORD: ");
        passwordLabel.setBounds (150,250, 400, 30 );
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 30));
        
        //PASSWORD INPUT
        JTextField passwordText = new JTextField();
        passwordText.setBounds(400, 250, 400, 30 );
        
        //FORGET BUTTON
        JButton forget = new JButton("Forget Password?");
        forget.setBounds(600, 300, 200, 10);
        forget.setFont(new Font("Arial", Font.BOLD, 10));
        
        //BUTTON Function
        JButton btlogin = new JButton("Login");
        btlogin.setBounds(600, 350, 200, 30);
        btlogin.addActionListener(new ActionListener(){
        @Override
        public void  actionPerformed(ActionEvent e){
            Dashboard log = new Dashboard();
            log.Login();
            frame.dispose();
        }
        });
        
        //SUCCESS
        JLabel success = new JLabel("");
        success.setBounds(500, 50, 200, 100);
        
        //REGISTER
        JButton register = new JButton("Register");
        register.setBounds(700, 400, 100, 10);
        register.addActionListener(new ActionListener(){
        @Override
        public void  actionPerformed(ActionEvent e){
            CreateAccount reg = new CreateAccount();
            reg.cAcc();
            frame.dispose();
        }
        });
        
        // Load and scale the image
        ImageIcon image = new ImageIcon("C:/Users/kylei/OneDrive/Documents/NetBeansProjects/E-Blotter_System/DCIT 50 Project .png");
        Image scaledImage = image.getImage().getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);
        
        // Create and position the image label
        JLabel label = new JLabel(resizedIcon);
        label.setBounds(0, 0, frame.getWidth(), frame.getHeight()); // Set position below the title
        
        // Add the title and image label to the frame
        frame.add(usernameLabel);
        frame.add(usernameText);
        frame.add(passwordLabel);
        frame.add(passwordText);
        frame.add(forget);
        frame.add(btlogin);
        frame.add(success);
        frame.add(register);
        frame.add(title);
        frame.add(label);
        
        // Center the frame on the screen
        frame.setLocationRelativeTo(null);
        
        // Set the frame visibility
        frame.setVisible(true);
    }   

}
