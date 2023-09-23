package bank;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;

public class Login extends JFrame {

    public Login() {

        setLayout(null);
        setTitle("Banking Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);

        getContentPane().setBackground(Color.BLUE);

        add(label);
        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);

    }

    public static void main(String[] args) {

        new Login();

    }

}
