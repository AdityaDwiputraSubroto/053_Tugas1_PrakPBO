/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginScreen extends JFrame {

    JLabel usernameLabel;
    JLabel passwordLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;
    JButton resetButton;
    JPanel loginPanel;

    public LoginScreen() {
        super("Login Screen");

        usernameLabel = new JLabel(" Username");
        passwordLabel = new JLabel(" Password");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        resetButton = new JButton("Reset");

        loginPanel = new JPanel(new GridLayout(3, 2));
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(resetButton);
        loginPanel.add(loginButton);

        setSize(400, 200);
        setLocationRelativeTo(null);
        add(loginPanel);
        setVisible(true);

        //event handling
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usernameField.getText().equals("tes") && new String(passwordField.getPassword()).equals("tes")) {
                    HomeScreen homeScreen = new HomeScreen();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Password atau Username Salah");
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
            }
        });

    }

}
