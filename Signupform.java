package javaswing.js;

import javax.swing.*;
import java.awt.*;

public class Signupform {

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("SIGN UP FORM");
        mainFrame.setSize(400, 150);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2, 10, 10));

        // Name
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        // Email
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genButtonGroup = new ButtonGroup();
        genButtonGroup.add(male);
        genButtonGroup.add(female);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(male);
        genderPanel.add(female);

        // Country
        JLabel countryLabel = new JLabel("Country:");
        String[] countries = {"India", "China", "Dubai"};
        JComboBox<String> countryBox = new JComboBox<>(countries);

        // Address
        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(3, 10);
        JScrollPane addressScrollPane = new JScrollPane(addressArea);

        // Submit Button
        JLabel emptyLabel = new JLabel("");  // Filler
        JButton submitBtn = new JButton("Submit");

        // Add components to panel
        mainPanel.add(nameLabel);
        mainPanel.add(nameField);

        mainPanel.add(emailLabel);
        mainPanel.add(emailField);

        mainPanel.add(genderLabel);
        mainPanel.add(genderPanel);

        mainPanel.add(countryLabel);
        mainPanel.add(countryBox);

        mainPanel.add(addressLabel);
        mainPanel.add(addressScrollPane);

        mainPanel.add(emptyLabel);
        mainPanel.add(submitBtn);

        // Final frame setup
        mainFrame.add(mainPanel);
        mainFrame.setLocationRelativeTo(null); // Center the frame
        mainFrame.setVisible(true);
    }
}

