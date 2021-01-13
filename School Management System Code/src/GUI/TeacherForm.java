
package GUI;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class TeacherForm extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
   
    public TeacherForm() {
        initComponents();
    }
    
    void reset(){
        firstNameField.setText("");
        teacherIdField.setText("");
        lastNameField.setText("");
        salaryField.setText("");
        fatherNameField.setText("");
        emailAddress.setText("");
        mobileField.setText("");
        cnicField.setText("");
        designationField.setText("");
        aqField.setText("");
        addressField.setText("");
        cmbGender.setSelectedIndex(0);
        experienceField.setText("");
        dobField.setText("");
        deleteButton.setEnabled(false);
        updateButton.setEnabled(false);
        teacherIdField.requestFocus();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        fatherNameLabel = new javax.swing.JLabel();
        fatherNameField = new javax.swing.JTextField();
        cnicLabel = new javax.swing.JLabel();
        cnicField = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        mobileField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        dobLabel = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        PhoneLabel1 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        designationField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        aqField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        experienceField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();
        teacherIdField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        joinningDateField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        newButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        getDataButton = new javax.swing.JButton();
        teacherRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teacher Form");
        setMinimumSize(new java.awt.Dimension(1366, 700));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1666, 720));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                                   Teacher's Details");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Basic Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        firstNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        firstNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name:");

        firstNameField.setBackground(new java.awt.Color(255, 255, 255));
        firstNameField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        firstNameField.setForeground(new java.awt.Color(0, 0, 0));
        firstNameField.setToolTipText("Enter First Name here");
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyTyped(evt);
            }
        });

        lastNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name:");
        lastNameLabel.setToolTipText("");

        lastNameField.setBackground(new java.awt.Color(255, 255, 255));
        lastNameField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        lastNameField.setForeground(new java.awt.Color(0, 0, 0));
        lastNameField.setToolTipText("Enter Last Name Here");
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameFieldKeyTyped(evt);
            }
        });

        fatherNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        fatherNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        fatherNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fatherNameLabel.setText("Father's Name:");

        fatherNameField.setBackground(new java.awt.Color(255, 255, 255));
        fatherNameField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        fatherNameField.setForeground(new java.awt.Color(0, 0, 0));
        fatherNameField.setToolTipText("Enter Father's Name here");
        fatherNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatherNameFieldActionPerformed(evt);
            }
        });
        fatherNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fatherNameFieldKeyTyped(evt);
            }
        });

        cnicLabel.setBackground(new java.awt.Color(0, 0, 0));
        cnicLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        cnicLabel.setForeground(new java.awt.Color(255, 255, 255));
        cnicLabel.setText("CNIC:");

        cnicField.setBackground(new java.awt.Color(255, 255, 255));
        cnicField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        cnicField.setForeground(new java.awt.Color(0, 0, 0));
        cnicField.setToolTipText("Enter Father's CNIC Number");
        cnicField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnicFieldKeyTyped(evt);
            }
        });

        mobileLabel.setBackground(new java.awt.Color(0, 0, 0));
        mobileLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        mobileLabel.setForeground(new java.awt.Color(255, 255, 255));
        mobileLabel.setText("Mobile Number: ");

        mobileField.setBackground(new java.awt.Color(255, 255, 255));
        mobileField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        mobileField.setForeground(new java.awt.Color(0, 0, 0));
        mobileField.setToolTipText("Enter Father's Mobile Number here");
        mobileField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileFieldKeyTyped(evt);
            }
        });

        addressLabel.setBackground(new java.awt.Color(0, 0, 0));
        addressLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address:");

        addressField.setBackground(new java.awt.Color(255, 255, 255));
        addressField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        addressField.setForeground(new java.awt.Color(0, 0, 0));
        addressField.setToolTipText("EnterStudent's Address here");
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        genderLabel.setBackground(new java.awt.Color(0, 0, 0));
        genderLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender:");

        cmbGender.setBackground(new java.awt.Color(102, 102, 102));
        cmbGender.setFont(new java.awt.Font("Dialog", 1, 12)); 
        cmbGender.setForeground(new java.awt.Color(255, 255, 255));
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));

        dobLabel.setBackground(new java.awt.Color(0, 0, 0));
        dobLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        dobLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobLabel.setText("Date of Birth:");

        dobField.setBackground(new java.awt.Color(255, 255, 255));
        dobField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        dobField.setForeground(new java.awt.Color(0, 0, 0));
        dobField.setToolTipText("Enter Student's Date of Birth here");
        dobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobFieldActionPerformed(evt);
            }
        });

        PhoneLabel1.setBackground(new java.awt.Color(0, 0, 0));
        PhoneLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); 
        PhoneLabel1.setForeground(new java.awt.Color(255, 255, 255));
        PhoneLabel1.setText("Email Address:");

        emailAddress.setBackground(new java.awt.Color(255, 255, 255));
        emailAddress.setFont(new java.awt.Font("Dialog", 1, 12));
        emailAddress.setForeground(new java.awt.Color(0, 0, 0));
        emailAddress.setToolTipText("Enter Father's Phone Number here");
        emailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fatherNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(fatherNameField)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dobLabel)
                                .addGap(30, 30, 30)
                                .addComponent(dobField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobileLabel)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cnicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(cnicField)
                            .addComponent(mobileField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(addressField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                        .addComponent(PhoneLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(343, 343, 343))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatherNameLabel)
                    .addComponent(fatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnicLabel)
                    .addComponent(cnicField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileLabel)
                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobLabel)
                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneLabel1)
                    .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Education & Experience", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        designationField.setBackground(new java.awt.Color(255, 255, 255));
        designationField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        designationField.setForeground(new java.awt.Color(0, 0, 0));
        designationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationFieldActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); 
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Designation:");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); 
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Academic Qualification:");

        aqField.setBackground(new java.awt.Color(255, 255, 255));
        aqField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        aqField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Experience:");

        experienceField.setBackground(new java.awt.Color(255, 255, 255));
        experienceField.setFont(new java.awt.Font("Dialog", 1, 12));
        experienceField.setForeground(new java.awt.Color(0, 0, 0));
        experienceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experienceFieldActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); 
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Salary:");

        salaryField.setBackground(new java.awt.Color(255, 255, 255));
        salaryField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        salaryField.setForeground(new java.awt.Color(0, 0, 0));
        salaryField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryFieldKeyTyped(evt);
            }
        });

        teacherIdField.setBackground(new java.awt.Color(255, 255, 255));
        teacherIdField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        teacherIdField.setForeground(new java.awt.Color(0, 0, 0));
        teacherIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherIdFieldActionPerformed(evt);
            }
        });
        teacherIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teacherIdFieldKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teacher ID:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Joinning Date:");

        joinningDateField.setBackground(new java.awt.Color(255, 255, 255));
        joinningDateField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        joinningDateField.setForeground(new java.awt.Color(0, 0, 0));
        joinningDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinningDateFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aqField))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(designationField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(experienceField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teacherIdField)
                    .addComponent(joinningDateField, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(teacherIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(designationField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aqField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(experienceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(joinningDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        newButton.setBackground(new java.awt.Color(0, 0, 0));
        newButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        newButton.setForeground(new java.awt.Color(255, 255, 255));
        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(0, 0, 0));
        saveButton.setFont(new java.awt.Font("Dialog", 1, 12));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 0, 0));
        updateButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        getDataButton.setBackground(new java.awt.Color(0, 0, 0));
        getDataButton.setFont(new java.awt.Font("Dialog", 1, 12));
        getDataButton.setForeground(new java.awt.Color(255, 255, 255));
        getDataButton.setText("Get Data");
        getDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataButtonActionPerformed(evt);
            }
        });

        teacherRecord.setBackground(new java.awt.Color(0, 0, 0));
        teacherRecord.setFont(new java.awt.Font("Dialog", 1, 12)); 
        teacherRecord.setForeground(new java.awt.Color(255, 255, 255));
        teacherRecord.setText("Teacher Record");
        teacherRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getDataButton)
                .addGap(18, 18, 18)
                .addComponent(teacherRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, deleteButton, getDataButton, newButton, saveButton, teacherRecord, updateButton});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(newButton)
                    .addComponent(saveButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(getDataButton)
                    .addComponent(teacherRecord))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backButton, deleteButton, getDataButton, newButton, saveButton, teacherRecord, updateButton});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(263, 263, 263))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void fatherNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void dobFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void emailAddressActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void teacherIdFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenu menu=new MainMenu();
        this.hide();
        menu.setVisible(true);
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {

        try{
            con = Connect.ConnectDB();
            if("".equals(teacherIdField.getText())){
                JOptionPane.showMessageDialog(null, "Please Enter Teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Statement st;
            st = con.createStatement();
            String sql1="select TeacherID from TeacherRecord where TeacherID='"+teacherIdField.getText()+"'";
            rs = st.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Teacher ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                teacherIdField.setText("");
                teacherIdField.requestDefaultFocus();
                return;
            }

            String sql= "insert into TeacherRecord(TeacherID,FirstName,LastName,FatherName,EmailAddress,ContactNo,CNIC,Salary,Designation,AcademicQualification,Address,Gender,Experience,DateOfBirth,DateOfJoinning)values('"+teacherIdField.getText()+"','"+firstNameField.getText()+"','"+lastNameField.getText()+"','"+fatherNameField.getText()+"','"+emailAddress.getText()+"','"+mobileField.getText()+"','"+cnicField.getText()+"','"+salaryField.getText()+"','"+designationField.getText()+"','"+aqField.getText()+"','"+addressField.getText()+"','"+cmbGender.getSelectedItem()+"','"+dobField.getText()+"','"+experienceField.getText()+"','"+joinningDateField.getText()+"')";
            
                
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Registered!", "Teacher", JOptionPane.INFORMATION_MESSAGE);
            saveButton.setEnabled(false);
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            con = Connect.ConnectDB();
            String sql = "update TeacherRecord set FirstName='"+firstNameField.getText()+"',LastName='"+lastNameField.getText()+"',FatherName='"+fatherNameField.getText()+"',EmailAddress='"+emailAddress.getText()+"',ContactNo='"+mobileField.getText()+"',CNIC='"+cnicField.getText()+"',Salary='"+salaryField.getText()+"',Designation='"+designationField.getText()+"',AcademicQualification='"+aqField.getText()+"',Address='"+addressField.getText()+"',Gender='"+cmbGender.getSelectedItem()+"',Experience='"+experienceField.getText()+"',DateOfBirth='"+ dobField.getText()+"',DateOfJoinning='"+joinningDateField.getText()+"'where TeacherID='"+teacherIdField.getText()+"'";

            pst = con.prepareStatement(sql);
            pst.execute();
            if("".equals(teacherIdField.getText())){
                JOptionPane.showMessageDialog(null, "Please select a record to update!");
                return;
            }
            JOptionPane.showMessageDialog(this, "Updated Successfully!","Record",JOptionPane.INFORMATION_MESSAGE);
            updateButton.setEnabled(false);
        }
        catch(HeadlessException | SQLException ex){

            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            if("".equals(teacherIdField.getText())){
                JOptionPane.showMessageDialog(null, "Please enter Teacher ID to delete record!");
                return;
            }
            int d = JOptionPane.showConfirmDialog(this, "Are sure want to delete.?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if(d==0){
                con = Connect.ConnectDB();
                String sql = "delete from TeacherRecord where TeacherID='"+teacherIdField.getText()+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                reset();
            }

        }
        catch(Exception ex){

        }
    }

    private void getDataButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        TeacherRecord teacher=new TeacherRecord();
        teacher.setVisible(true);
    }

    private void experienceFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void designationFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void joinningDateFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void salaryFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char input = evt.getKeyChar();
         if((input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Please enter digits!");
         }
    }

    private void mobileFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char input = evt.getKeyChar();
         if((input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Please enter digits!");
         }
    }

    private void cnicFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char input = evt.getKeyChar();
         if((input<'0' || input>'9' || input=='-') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Please enter digits!");
         }
    }

    private void firstNameFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char input = evt.getKeyChar();
         if(!(input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
         }
    }

    private void fatherNameFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char input = evt.getKeyChar();
         if(!(input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
         }
    }

    private void lastNameFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char input = evt.getKeyChar();
         if(!(input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
         }
    }

    private void teacherRecordActionPerformed(java.awt.event.ActionEvent evt) {
        TeacherRecord record=new TeacherRecord();
        this.hide();
        record.setVisible(true);
    }

    private void teacherIdFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char input = evt.getKeyChar();
         if((input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "ID can not contain any letters Please enter digits!");
         }
    }

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherForm().setVisible(true);
            }
        });
    }

    
    private javax.swing.JLabel PhoneLabel1;
    public javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    public javax.swing.JTextField aqField;
    private javax.swing.JButton backButton;
    public javax.swing.JComboBox<String> cmbGender;
    public javax.swing.JTextField cnicField;
    private javax.swing.JLabel cnicLabel;
    public javax.swing.JButton deleteButton;
    public javax.swing.JTextField designationField;
    public javax.swing.JTextField dobField;
    private javax.swing.JLabel dobLabel;
    public javax.swing.JTextField emailAddress;
    public javax.swing.JTextField experienceField;
    public javax.swing.JTextField fatherNameField;
    private javax.swing.JLabel fatherNameLabel;
    public javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton getDataButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField joinningDateField;
    public javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    public javax.swing.JTextField mobileField;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JButton newButton;
    public javax.swing.JTextField salaryField;
    public javax.swing.JButton saveButton;
    public javax.swing.JTextField teacherIdField;
    private javax.swing.JButton teacherRecord;
    public javax.swing.JButton updateButton;
}
