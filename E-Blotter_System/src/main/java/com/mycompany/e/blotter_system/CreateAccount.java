package com.mycompany.e.blotter_system;

import javax.swing.*;
import java.awt.*;

public class CreateAccount {
    public void cAcc(){
    
    // Create the main frame
        JFrame frame = new JFrame("Create Police Account");
        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        // Create a frame to hold all components
        JPanel panel = new JPanel();
        panel.setLayout(null); // Use null layout for absolute positioning
        panel.setPreferredSize(new Dimension(900, 1200)); // Larger size for scrolling
                
                JLabel createAccountLabel = new JLabel("CREATE AN ACCOUNT");
                createAccountLabel.setBounds(275, 20, 450, 60);
                createAccountLabel.setFont(new Font("Arial", Font.BOLD, 40));
                
		JLabel badgeLabel = new JLabel("Police Badge Number:");
                badgeLabel.setBounds(150, 100, 200, 40);
                JTextField badgeField = new JTextField();
                badgeField.setBounds(150, 140, 250, 40);
                badgeLabel.setFont(new Font("Arial", Font.BOLD, 15));

		JLabel firstNameLabel =  new JLabel("First Name:");
                firstNameLabel.setBounds(550, 100, 400, 40);
                JTextField firstNameField = new JTextField();
                firstNameField.setBounds(550, 140, 250, 40);
                firstNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
                
		JLabel middleNameLabel =  new JLabel("Middle Name:");
                middleNameLabel.setBounds(150, 200, 400, 40);
                JTextField middleNameField = new JTextField();
                middleNameField.setBounds(150, 240, 250, 40);
                middleNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
                
		JLabel lastNameLabel =  new JLabel("Last Name:");
                lastNameLabel.setBounds(550, 200, 200, 40);
                JTextField lastNameField = new JTextField();
                lastNameField.setBounds(550, 240, 250, 40);
                lastNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
                
		JLabel ageLabel = new JLabel("Age:");
                ageLabel.setBounds(150, 300, 200, 40);
		JTextField ageField = new JTextField();
                ageField.setBounds(150, 340, 250, 40);
                ageLabel.setFont(new Font("Arial", Font.BOLD, 15));
                
		JLabel addressLabel =  new JLabel("Address:");
                addressLabel.setBounds(550, 300, 200, 40);
		JTextField addressField = new JTextField();
                addressField.setBounds(550, 340, 250, 40);
                addressLabel.setFont(new Font("Arial", Font.BOLD, 15));
                 
                JLabel rankLabel = new JLabel("Rank:");
                rankLabel.setBounds(150, 400, 200, 40);
		JTextField rankField = new JTextField();
                rankField.setBounds(150, 440, 250, 40);
                rankField.setFont(new Font("Arial", Font.BOLD, 15));

		JLabel yearsOfDutyLabel = new JLabel("Years Of Duty:");
                yearsOfDutyLabel.setBounds(550, 400, 200, 40);
		JTextField yearsOfDutyField = new JTextField();
                yearsOfDutyField.setBounds(550, 440, 250, 40);
                yearsOfDutyField.setFont(new Font("Arial", Font.BOLD, 15));

		JLabel areaLabel = new JLabel("Designated Area Of Responsibility:");
                areaLabel.setBounds(150, 500, 350, 40);
		JTextField areaField = new JTextField();
                areaField.setBounds(150, 540, 650, 40);
                areaField.setFont(new Font("Arial", Font.BOLD, 15));

		JLabel birthdayLabel = new JLabel("Birthday:");
                birthdayLabel.setBounds(150, 600, 200, 40);
		JTextField birthdayField = new JTextField();
                birthdayField.setBounds(150, 640, 250, 40);
                birthdayField.setFont(new Font("Arial", Font.BOLD, 15));

		JLabel civilStatusLabel = new JLabel("Civil Status:");
                civilStatusLabel.setBounds(550, 600, 200, 40);
		JTextField civilStatusField = new JTextField();
                civilStatusField.setBounds(550, 640, 250, 40);
                civilStatusField.setFont(new Font("Arial", Font.BOLD, 15));

		JLabel nationalityLabel = new JLabel("Nationality:");
                nationalityLabel.setBounds(150, 700, 200, 40);
		JTextField nationalityField = new JTextField();
                nationalityField.setBounds(150, 740, 250, 40);
                nationalityField.setFont(new Font("Arial", Font.BOLD, 15));

                
              // Submit Button
               JButton submitButton = new JButton("Submit");
               submitButton.setBounds(500, 900, 200, 50);
               submitButton.addActionListener(e -> {
             /*  String badge = badgeField.getText();
               String firstName = firstNameField.getText();
               String middleName = middleNameField.getText();
               String lastName = lastNameField.getText();
               String age = ageField.getText();
               String address = addressField.getText();
               String rank = rankField.getText();
               String yearsOfDuty = yearsOfDutyField.getText();
               String area = areaField.getText();
               String birthday = birthdayField.getText();
               String civilStatus = civilStatusField.getText();
               String nationality = nationalityField.getText (); */
               
               

                if (badgeField.getText().isEmpty() || firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || ageField.getText().isEmpty() || addressField.getText().isEmpty() || rankField.getText().isEmpty() || yearsOfDutyField.getText().isEmpty() || areaField.getText().isEmpty() || birthdayField.getText().isEmpty() || civilStatusField.getText().isEmpty() || nationalityField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(panel, "Please fill all mandatory fields", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                JOptionPane.showMessageDialog(panel, "Account Created Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
        });
            
                
                // Add the title and image label to the panel
		panel.add(badgeLabel);
		panel.add(badgeField);
		panel.add(firstNameLabel);
		panel.add(firstNameField);
		panel.add(middleNameLabel);
		panel.add(middleNameField);
		panel.add(lastNameLabel);
		panel.add(lastNameField);
		panel.add(ageLabel);
		panel.add(ageField);
		panel.add(addressLabel);
		panel.add(addressField);
		panel.add(createAccountLabel);
                panel.add(rankLabel);
                panel.add(rankField);
                panel.add(yearsOfDutyLabel);
                panel.add(yearsOfDutyField);
                panel.add(areaLabel);
                panel.add(areaField);
                panel.add(birthdayLabel);
                panel.add(birthdayField);
                panel.add(civilStatusLabel);
                panel.add(civilStatusField);
                panel.add(nationalityLabel);
                panel.add(nationalityField);
                panel.add(submitButton);
               
		panel.setVisible(true);
      
         
        // Wrap the panel in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Add the JScrollPane to the frame
        frame.add(scrollPane);

        // Show the frame
        frame.setVisible(true);
    }
}
