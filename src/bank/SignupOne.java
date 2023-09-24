package bank;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame {

    long random;
    JTextField nameTextField, fatherTextField, emailTextField, addressTextField,
            cityTextField, staTextField, pincodeTextField;
    JButton next;
    JRadioButton male, female, other;

    public SignupOne() {

        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000);

        // Application Number Showing at top
        JLabel formo = new JLabel("Application Form Number :" + random);
        formo.setFont(new Font("Raleway", Font.BOLD, 30));
        formo.setBounds(140, 20, 600, 40);
        add(formo);

        // Personal Detail Heading Showing for entering the details of customer
        JLabel personalDetail = new JLabel("Page 1: Personal Detail 😊😊");
        personalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetail.setBounds(290, 80, 400, 30);
        add(personalDetail);

        // name of person
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        // adding textfield
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        // fathers name
        JLabel fathersName = new JLabel("Father's Name :");
        fathersName.setFont(new Font("Arial", Font.BOLD, 20));
        fathersName.setBounds(100, 190, 200, 30);
        add(fathersName);

        // father name textfield
        fatherTextField = new JTextField();
        fatherTextField.setFont(new Font("Arial", Font.BOLD, 14));
        fatherTextField.setBounds(300, 190, 400, 30);
        add(fatherTextField);

        // date of birth
        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Arial", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        // date calendar
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 200, 30);
        add(dateChooser);

        // gender
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Arial", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        // gender radio button
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 90, 30);
        add(female);

        // grouping the female and male here

        ButtonGroup gendGroup = new ButtonGroup();
        gendGroup.add(male);
        gendGroup.add(female);

        // email
        JLabel email = new JLabel("Eamil :");
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        // eamil textfield
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        // Martail status
        JLabel martial = new JLabel("Martial Status :");
        martial.setFont(new Font("Arial", Font.BOLD, 20));
        martial.setBounds(100, 390, 200, 30);
        add(martial);

        // radio button for martial status
        JRadioButton married = new JRadioButton("Yes");
        married.setBounds(300, 390, 60, 30);
        add(married);

        JRadioButton notMarried = new JRadioButton("No");
        notMarried.setBounds(450, 390, 90, 30);
        add(notMarried);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(630, 390, 90, 30);
        add(other);

        // button grouping

        ButtonGroup martialGroup = new ButtonGroup();
        martialGroup.add(married);
        martialGroup.add(notMarried);
        martialGroup.add(other);

        // address
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Arial", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        // address textfield
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Arial", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        // city
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Arial", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        // city texxt field
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Arial", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        // state
        JLabel state = new JLabel("Name :");
        state.setFont(new Font("Arial", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        // state text field
        staTextField = new JTextField();
        staTextField.setFont(new Font("Arial", Font.BOLD, 14));
        staTextField.setBounds(300, 540, 400, 30);
        add(staTextField);

        // pincode
        JLabel pincode = new JLabel("Pincode :");
        pincode.setFont(new Font("Arial", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        // pincode textfield
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Arial", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);

        // Buttons

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620, 660, 80, 30);
        next.setFont(new Font("Arial", Font.BOLD, 14));
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setTitle("Signup Page");
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public static void main(String[] args) {

        new SignupOne();

    }

}
