package bank;

import java.awt.*;
import java.util.*;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame.*;
import javax.swing.text.JTextComponent.*;

public class SignupTwo extends JFrame implements ActionListener {

    long random;
    JLabel religion, category, seniorCitizen, income, education, qualification, occupation, pan, aadhar,
            exisitingAccount;
    JTextField aadharTextField, panTextField;
    JComboBox religiondrop, categoryDropBox, incomeBox, qualificationBox, occupationalBox;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;

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
        religion = new JLabel("Religion :");
        religion.setFont(new Font("Arial", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        String[] religion_arr = { "Hindu", "Muslim", "Sikh", "Chritsian", "Other" };
        religiondrop = new JComboBox<>(religion_arr);
        religiondrop.setBounds(300, 140, 400, 30);
        religiondrop.setBackground(Color.WHITE);
        add(religiondrop);

        // Category name

        category = new JLabel("Category :");
        category.setFont(new Font("Arial", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);

        // combo for category
        String valcategory[] = { "General", "OBC", "Gen-EWS", "ST", "SC", "PWD" };
        categoryDropBox = new JComboBox<>(valcategory);
        categoryDropBox.setBounds(300, 190, 400, 30);
        categoryDropBox.setBackground(Color.white);
        add(categoryDropBox);

        // income
        income = new JLabel("Income :");
        income.setFont(new Font("Arial", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);

        // icme comboBox
        String valIncome[] = { "NULL", "< 1,50,000", "< 2,50,000", "< 5,00,0000", "upto 1000000" };
        incomeBox = new JComboBox<>(valIncome);
        incomeBox.setBounds(300, 240, 400, 30);
        incomeBox.setBackground(Color.white);
        add(incomeBox);

        // education
        education = new JLabel("Educational :");
        education.setFont(new Font("Arial", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        add(education);

        // qualification
        qualification = new JLabel("Qualification :");
        qualification.setFont(new Font("Arial", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);

        String valQualification[] = { "Non-Graduate", "Graduation", "Post-Graduation", "Doctrate", "Other" };
        qualificationBox = new JComboBox<>(valQualification);
        qualificationBox.setBounds(300, 315, 400, 30);
        qualificationBox.setBackground(Color.white);
        add(qualificationBox);

        // Occupation
        occupation = new JLabel("Occupation :");
        occupation.setFont(new Font("Arial", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);

        // Ocupation choose field
        String valOccupational[] = { "Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others" };
        occupationalBox = new JComboBox<>(valOccupational);
        occupationalBox.setBounds(300, 390, 400, 30);
        occupationalBox.setBackground(Color.white);
        add(occupationalBox);

        // pan
        pan = new JLabel("Pan :");
        pan.setFont(new Font("Arial", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);

        // pan textfield
        panTextField = new JTextField();
        panTextField.setFont(new Font("Arial", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        // aadhar
        aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Arial", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);

        // aadhar texxt field
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Arial", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        // senior Setizion
        seniorCitizen = new JLabel("Senior Citizen :");
        seniorCitizen.setFont(new Font("Arial", Font.BOLD, 20));
        seniorCitizen.setBounds(100, 540, 200, 30);
        add(seniorCitizen);

        // Senior Citizen radio button

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.white);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.white);
        add(sno);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(syes);
        seniorGroup.add(sno);

        // existing
        exisitingAccount = new JLabel("Exisiting Account :");
        exisitingAccount.setFont(new Font("Arial", Font.BOLD, 20));
        exisitingAccount.setBounds(100, 590, 200, 30);
        add(exisitingAccount);

        // Exisiting radio button
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.white);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.white);
        add(eno);

        ButtonGroup exisitngGroup = new ButtonGroup();
        exisitngGroup.add(eyes);
        exisitngGroup.add(eno);

        // Buttons

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620, 760, 80, 30);
        next.setFont(new Font("Arial", Font.BOLD, 14));
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setTitle("NEW ACCOUNT APPLICATION FORM PAGE - 2");
        setSize(900, 1000);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        String formo = "" + random; // long
        String sreligion = (String) religiondrop.getSelectedItem();
        String scatagory = (String) categoryDropBox.getSelectedItem();
        String sincome = (String) incomeBox.getSelectedItem();
        String seducation = (String) qualificationBox.getSelectedItem();
        String soccupation = (String) occupationalBox.getSelectedItem();
        String eseinorcitizen = null;
        if (syes.isSelected()) {
            eseinorcitizen = "Yes";

        } else if (sno.isSelected()) {
            eseinorcitizen = "No";
        }

        String exisitingaccount = null;
        if (eyes.isSelected()) {
            exisitingaccount = "Yes";
        } else {
            exisitingaccount = "No";
        }

        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();

        try {

            Conn c = new Conn();
            //
            // create table signuptwo(formno varchar(20), religion varchar(20),
            // category varchar(20), income varchar(20), education varchar(20), occupation
            // varchar(20),
            // pan varchar(20), aadhar varchar(20), seniorcitizen varchar(20),
            // existingaccount varchar(20));

            String query = "insert into signuptwo values('" + formo + "','" + sreligion + "','" + scatagory + "','"
                    + sincome
                    + "','" + seducation + "','" + soccupation + "','" + span + "','" + saadhar
                    + "','"
                    + eseinorcitizen + "','" + exisitingaccount + "')";

            c.s.executeUpdate(query);
            // signup3 object

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        new SignupTwo("");

    }

}
