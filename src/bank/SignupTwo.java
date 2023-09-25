package bank;

import java.awt.Color;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame.*;

import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener {

    long random;
    JTextField religionTextField, fatherTextField, emailTextField, addressTextField,
            cityTextField, staTextField, pincodeTextField;
    JButton next;
    JRadioButton male, female, married, notMarried;
    JDateChooser dateChooser;

    SignupTwo() {

        setLayout(null);

        // Random ran = new Random();
        // random = Math.abs((ran.nextLong() % 9000L) + 1000);

        // Application Number Showing at top
        // JLabel formo = new JLabel("Application Form Number :" + random);
        // formo.setFont(new Font("Raleway", Font.BOLD, 30));
        // formo.setBounds(140, 20, 600, 40);
        // add(formo);

        // Personal Detail Heading Showing for entering the details of customer
        JLabel additionalDetail = new JLabel("Page 2: Additional Detail 😊😊");
        additionalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetail.setBounds(290, 80, 400, 30);
        add(additionalDetail);

        // name of person
        JLabel religion = new JLabel("Religion :");
        religion.setFont(new Font("Arial", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        String[] religion_arr = { "Hindu", "Muslim", "Sikh", "Chritsian", "Other" };
        JComboBox religiondrop = new JComboBox<>(religion_arr);
        religiondrop.setBounds(300, 140, 400, 30);
        religiondrop.setBackground(Color.WHITE);
        add(religiondrop);

        // fathers name

        JLabel fathersName = new JLabel("Category :");
        fathersName.setFont(new Font("Arial", Font.BOLD, 20));
        fathersName.setBounds(100, 190, 200, 30);
        add(fathersName);

        // combo for category
        String valcategory[] = { "General", "OBC", "Gen-EWS", "ST", "SC", "PWD" };
        JComboBox categoryDropBox = new JComboBox<>(valcategory);
        categoryDropBox.setBounds(300, 190, 400, 30);
        categoryDropBox.setBackground(Color.white);
        add(categoryDropBox);

        // date of birth
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Arial", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        // date calendar
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 200, 30);
        add(dateChooser);

        // gender
        JLabel gender = new JLabel("Educational :");
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
        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        // eamil textfield
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        // Martail status
        JLabel martial = new JLabel("Occupation :");
        martial.setFont(new Font("Arial", Font.BOLD, 20));
        martial.setBounds(100, 390, 200, 30);
        add(martial);

        // radio button for martial status
        married = new JRadioButton("Yes");
        married.setBounds(300, 390, 60, 30);
        add(married);

        notMarried = new JRadioButton("No");
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
        JLabel address = new JLabel("Pan :");
        address.setFont(new Font("Arial", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        // address textfield
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Arial", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        // city
        JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Arial", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        // city texxt field
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Arial", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        // state
        JLabel state = new JLabel("Senior Citizen :");
        state.setFont(new Font("Arial", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        // state text field
        staTextField = new JTextField();
        staTextField.setFont(new Font("Arial", Font.BOLD, 14));
        staTextField.setBounds(300, 540, 400, 30);
        add(staTextField);

        // pincode
        JLabel pincode = new JLabel("Exisiting Account :");
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
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setTitle("NEW ACCOUNT APPLICATION FORM PAGE - 2");
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        String formo = "" + random; // long
        String name = religionTextField.getText(); //
        String fname = fatherTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }

        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else {
            marital = "Not Married";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = staTextField.getText();
        String pin = pincodeTextField.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('" + formo + "','" + name + "','" + fname + "','" + dob
                        + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','"
                        + pin + "','" + state
                        + "')";

                c.s.executeUpdate(query);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        new SignupTwo();

    }

}
