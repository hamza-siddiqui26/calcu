
package GUI;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class StudentForm extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public StudentForm() {
        initComponents();
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
        phoneField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        studentIdField = new javax.swing.JTextField();
        studentIdLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admissionClass = new javax.swing.JTextField();
        doaLabel = new javax.swing.JLabel();
        doaField = new javax.swing.JTextField();
        lastSchoolLabel = new javax.swing.JLabel();
        lastSchoolAttendedField = new javax.swing.JTextField();
        lastClassLabel = new javax.swing.JLabel();
        lastClassAttendedField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        getDataButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        studentRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Form");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 710));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                                   Student's Details");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Basic Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); 
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
        cnicLabel.setText("Father's CNIC:");

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
        mobileLabel.setText("Father's Mobile: ");

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
        PhoneLabel1.setText("Father's Phone:");

        phoneField.setBackground(new java.awt.Color(255, 255, 255));
        phoneField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        phoneField.setForeground(new java.awt.Color(0, 0, 0));
        phoneField.setToolTipText("Enter Father's Phone Number here");
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        phoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneFieldKeyTyped(evt);
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
                            .addComponent(cnicLabel)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(cnicField)
                            .addComponent(mobileField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressField)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PhoneLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneLabel1)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Academic Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); 
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        studentIdField.setBackground(new java.awt.Color(255, 255, 255));
        studentIdField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        studentIdField.setToolTipText("Enter Student ID here");
        studentIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdFieldActionPerformed(evt);
            }
        });
        studentIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                studentIdFieldKeyTyped(evt);
            }
        });

        studentIdLabel.setBackground(new java.awt.Color(0, 0, 0));
        studentIdLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        studentIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        studentIdLabel.setText("Student ID:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admission in Class:");

        admissionClass.setBackground(new java.awt.Color(255, 255, 255));
        admissionClass.setFont(new java.awt.Font("Dialog", 1, 12)); 
        admissionClass.setForeground(new java.awt.Color(0, 0, 0));

        doaLabel.setBackground(new java.awt.Color(0, 0, 0));
        doaLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        doaLabel.setForeground(new java.awt.Color(255, 255, 255));
        doaLabel.setText("Date of Admission:");

        doaField.setBackground(new java.awt.Color(255, 255, 255));
        doaField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        doaField.setForeground(new java.awt.Color(0, 0, 0));
        doaField.setToolTipText("Enter Student's Date of Admission here");
        doaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doaFieldActionPerformed(evt);
            }
        });

        lastSchoolLabel.setBackground(new java.awt.Color(0, 0, 0));
        lastSchoolLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        lastSchoolLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastSchoolLabel.setText("Last School Attended:");

        lastSchoolAttendedField.setBackground(new java.awt.Color(255, 255, 255));
        lastSchoolAttendedField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        lastSchoolAttendedField.setForeground(new java.awt.Color(0, 0, 0));
        lastSchoolAttendedField.setToolTipText("Enter Last School Name");
        lastSchoolAttendedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastSchoolAttendedFieldActionPerformed(evt);
            }
        });

        lastClassLabel.setBackground(new java.awt.Color(0, 0, 0));
        lastClassLabel.setFont(new java.awt.Font("Dialog", 1, 14)); 
        lastClassLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastClassLabel.setText("Last Class Attended:");

        lastClassAttendedField.setBackground(new java.awt.Color(255, 255, 255));
        lastClassAttendedField.setFont(new java.awt.Font("Dialog", 1, 12)); 
        lastClassAttendedField.setForeground(new java.awt.Color(0, 0, 0));
        lastClassAttendedField.setToolTipText("Enter Last Class Attended");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(studentIdLabel)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lastSchoolLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(studentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(admissionClass, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lastSchoolAttendedField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(doaLabel)
                        .addGap(44, 44, 44)
                        .addComponent(doaField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lastClassLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastClassAttendedField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentIdLabel)
                            .addComponent(studentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(admissionClass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doaField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doaLabel)))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastClassAttendedField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastClassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastSchoolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastSchoolAttendedField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        backButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        newButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        getDataButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        getDataButton.setText("Get Data");
        getDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        studentRecord.setFont(new java.awt.Font("Dialog", 1, 12)); 
        studentRecord.setText("Student Record");
        studentRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(newButton)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(getDataButton)
                .addGap(18, 18, 18)
                .addComponent(studentRecord)
                .addGap(185, 185, 185))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, deleteButton, getDataButton, newButton, saveButton, studentRecord, updateButton});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(getDataButton)
                    .addComponent(studentRecord)
                    .addComponent(updateButton)
                    .addComponent(saveButton)
                    .addComponent(newButton)
                    .addComponent(backButton))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void fatherNameFieldActionPerformed(java.awt.event.ActionEvent evt) {{
    	}
    }

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void dobFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void studentIdFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void doaFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void lastSchoolAttendedFieldActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenu menu=new MainMenu();
        this.hide();
        menu.setVisible(true);
    }

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {
        firstNameField.setText("");
        studentIdField.setText("");
        lastNameField.setText("");
        lastSchoolAttendedField.setText("");
        fatherNameField.setText("");
        phoneField.setText("");
        mobileField.setText("");
        cnicField.setText("");
        lastClassAttendedField.setText("");
        addressField.setText("");
        cmbGender.setSelectedIndex(0);
        admissionClass.setText("");
        dobField.setText("");
        doaField.setText("");
        deleteButton.setEnabled(false);
        updateButton.setEnabled(false);
        studentIdField.requestFocus();
    }//GEN-LAST:event_newButtonActionPerformed

    private void getDataButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        StudentRecord record=new StudentRecord();
        record.setVisible(true);
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
         try{
            con = Connect.ConnectDB();
            String sql = "update StudentRecord set FirstName='"+firstNameField.getText()+"',LastName='"+lastNameField.getText()+"',DateOfBirth='"+dobField.getText()+"',FatherName='"+fatherNameField.getText()+"',FatherCNIC='"+cnicField.getText()+"',FatherPhone='"+phoneField.getText()+"',FatherMobile='"+mobileField.getText()+"',Address='"+addressField.getText()+"',DOA='"+doaField.getText()+"',LCA='"+lastClassAttendedField.getText()+"',PSN='"+lastSchoolAttendedField.getText()+"',Gender='"+cmbGender.getSelectedItem()+"',Class='"+ admissionClass.getText()+"'where StudentID='"+studentIdField.getText()+"'";

            pst = con.prepareStatement(sql);
            pst.execute();
            if("".equals(studentIdField.getText())){
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

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        try{
            con = Connect.ConnectDB();
            if("".equals(studentIdField.getText())){
                JOptionPane.showMessageDialog(null, "Please Enter Student ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Statement st;
            st = con.createStatement();
            String sql1="select StudentID from StudentRecord where StudentID='"+studentIdField.getText()+"'";
            rs = st.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Student ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                studentIdField.setText("");
                studentIdField.requestDefaultFocus();
                return;
            }

            String sql= "insert into StudentRecord(StudentID,FirstName,LastName,DateOfBirth,FatherName,FatherCNIC,FatherPhone,FatherMobile,Address,DOA,LCA,PSN,Gender,Class) values ('"+studentIdField.getText()+"','"+firstNameField.getText()+"','"+lastNameField.getText()+"','"+dobField.getText()+"','"+fatherNameField.getText()+"','"+cnicField.getText()+"','"+phoneField.getText()+"','"+mobileField.getText()+"','"+addressField.getText()+"','"+doaField.getText()+"','"+lastClassAttendedField.getText()+"','"+lastSchoolAttendedField.getText()+"','"+cmbGender.getSelectedItem()+"','"+admissionClass.getText()+"')";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Registered!", "Student", JOptionPane.INFORMATION_MESSAGE);
            saveButton.setEnabled(false);
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        try{
            if("".equals(studentIdField.getText())){
                JOptionPane.showMessageDialog(null, "Please enter Student ID to delete record!");
                return;
            }
            int d = JOptionPane.showConfirmDialog(this, "Are sure want to delete.?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if(d==0){
                con = Connect.ConnectDB();
                String sql = "delete from StudentRecord where StudentID='"+studentIdField.getText()+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                reset();
            }

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
        
    }

    private void studentRecordActionPerformed(java.awt.event.ActionEvent evt) {
        StudentRecord record = new StudentRecord();
        this.hide();
        record.setVisible(true);
    }

    private void cnicFieldKeyTyped(java.awt.event.KeyEvent evt) {
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

    private void studentIdFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char input = evt.getKeyChar();
         if((input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Please enter digits!");
         }
    }

    private void phoneFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char input = evt.getKeyChar();
         if((input<'0' || input>'9') && input!='\b'){
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

     void reset(){
        firstNameField.setText("");
        studentIdField.setText("");
        lastNameField.setText("");
        lastSchoolAttendedField.setText("");
        fatherNameField.setText("");
        phoneField.setText("");
        mobileField.setText("");
        cnicField.setText("");
        lastClassAttendedField.setText("");
        addressField.setText("");
        cmbGender.setSelectedIndex(0);
        admissionClass.setText("");
        dobField.setText("");
        doaField.setText("");
        deleteButton.setEnabled(false);
        updateButton.setEnabled(false);
        studentIdField.requestFocus();
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
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentForm().setVisible(true);
            }
        });
    }

   
    private javax.swing.JLabel PhoneLabel1;
    public javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    public javax.swing.JTextField admissionClass;
    private javax.swing.JButton backButton;
    public javax.swing.JComboBox<String> cmbGender;
    public javax.swing.JTextField cnicField;
    private javax.swing.JLabel cnicLabel;
    public javax.swing.JButton deleteButton;
    public javax.swing.JTextField doaField;
    private javax.swing.JLabel doaLabel;
    public javax.swing.JTextField dobField;
    private javax.swing.JLabel dobLabel;
    public javax.swing.JTextField fatherNameField;
    private javax.swing.JLabel fatherNameLabel;
    public javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton getDataButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField lastClassAttendedField;
    private javax.swing.JLabel lastClassLabel;
    public javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    public javax.swing.JTextField lastSchoolAttendedField;
    private javax.swing.JLabel lastSchoolLabel;
    public javax.swing.JTextField mobileField;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JButton newButton;
    public javax.swing.JTextField phoneField;
    public javax.swing.JButton saveButton;
    public javax.swing.JTextField studentIdField;
    private javax.swing.JLabel studentIdLabel;
    private javax.swing.JButton studentRecord;
    public javax.swing.JButton updateButton;
    
}
