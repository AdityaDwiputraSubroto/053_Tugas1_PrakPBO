/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomeScreen extends JFrame {

    JLabel title;
    JButton logoutButton;
    JPanel homePanel;
    public HomeScreen() {
        super("Home Screen");
        title = new JLabel("Anda telah login", SwingConstants.CENTER);
        logoutButton = new JButton("Logout");
        
        homePanel = new JPanel(new GridLayout(2,1));
        homePanel.add(title);
        homePanel.add(logoutButton);
        
        setSize(400,200);
        add(homePanel);
        setVisible(true);
        setLocationRelativeTo(null);
        
        //event handling
        logoutButton.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "Logout Berhasil");
               LoginScreen loginScreen = new LoginScreen();
               dispose();
            }
        });
    }
    
}
