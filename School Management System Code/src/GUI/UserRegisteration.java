
package GUI;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class UserRegisteration extends javax.swing.JFrame {

    Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    
    public UserRegisteration() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        New1 = new javax.swing.JButton();
        Save1 = new javax.swing.JButton();
        Delete1 = new javax.swing.JButton();
        Update1 = new javax.swing.JButton();
        GetData1 = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Registeration");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); 

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        txtName.setFont(new java.awt.Font("Dialog", 1, 12)); 
        txtName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");

        txtUserName.setFont(new java.awt.Font("Dialog", 1, 12)); 
        txtUserName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        txtPassword.setFont(new java.awt.Font("Dialog", 1, 12)); 
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email ID");

        txtEmailID.setFont(new java.awt.Font("Dialog", 1, 12)); 
        txtEmailID.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact No.");

        txtContactNo.setFont(new java.awt.Font("Dialog", 1, 12));
        txtContactNo.setForeground(new java.awt.Color(0, 0, 0));
        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactNoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtContactNo, txtName, txtPassword});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtContactNo, txtEmailID, txtName, txtPassword, txtUserName});

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        New1.setFont(new java.awt.Font("Dialog", 1, 12)); 
        New1.setText("New");
        New1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New1ActionPerformed(evt);
            }
        });

        Save1.setFont(new java.awt.Font("Dialog", 1, 12)); 
        Save1.setText("Save");
        Save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save1ActionPerformed(evt);
            }
        });

        Delete1.setFont(new java.awt.Font("Dialog", 1, 12)); 
        Delete1.setText("Delete");
        Delete1.setEnabled(false);
        Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete1ActionPerformed(evt);
            }
        });

        Update1.setFont(new java.awt.Font("Dialog", 1, 12)); 
        Update1.setText("Update");
        Update1.setEnabled(false);
        Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update1ActionPerformed(evt);
            }
        });

        GetData1.setFont(new java.awt.Font("Dialog", 1, 12)); 
        GetData1.setText("Get Data");
        GetData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetData1ActionPerformed(evt);
            }
        });

        menuButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        menuButton.setText("Back");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(New1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Save1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Update1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GetData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(New1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Save1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Delete1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Update1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GetData1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
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

    private void txtContactNoKeyTyped(java.awt.event.KeyEvent evt) {
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }

    private void Reset(){
    txtName.setText("");
    txtUserName.setText("");
    txtPassword.setText("");
    txtEmailID.setText("");
    txtContactNo.setText("");
    Save1.setEnabled(true);
    Delete1.setEnabled(false);
    Update1.setEnabled(false);
    txtUserName.requestDefaultFocus();
    }
    
    private void New1ActionPerformed(java.awt.event.ActionEvent evt) {
        Reset();
    }

    private void Save1ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            con=Connect.ConnectDB();
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtUserName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter user name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String Password= String.valueOf(txtPassword.getPassword());
            if (Password.equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter password","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtContactNo.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter contact no.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Statement stmt;
            stmt= con.createStatement();
            String sql1="Select username from Registeration where Username= '" + txtUserName.getText() + "'";
            rs=stmt.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog( this, "User name already exists","Error", JOptionPane.ERROR_MESSAGE);
                txtUserName.setText("");
                txtUserName.requestDefaultFocus();
                return;
            }
            String Password1= String.valueOf(txtPassword.getPassword());
            String sql= "insert into Registeration(username,password,nameofuser,Email,ContactNo)values('"+ txtUserName.getText() + "','" + Password1 + "','" + txtName.getText() + "','" + txtEmailID.getText() + "','" + txtContactNo.getText() + "')";

            pst=con.prepareStatement(sql);
            pst.execute();
            String sql2= "insert into Users(Username,User_Password)values('" + txtUserName.getText() + "','" + Password1 + "')";

            pst=con.prepareStatement(sql2);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Registered","User",JOptionPane.INFORMATION_MESSAGE);
            Save1.setEnabled(false);
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            if("".equals(txtUserName.getText())){
                JOptionPane.showMessageDialog(null, "Please select a username to delete!");
                return;
            }
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();

                String sql= "delete from Registeration where Username = '" + txtUserName.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                String sql1= "delete from Users where Username = '" + txtUserName.getText() + "'";
                pst=con.prepareStatement(sql1);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }

    }

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            con=Connect.ConnectDB();
            String Password1= String.valueOf(txtPassword.getPassword());
            String sql= "update Registeration set password='" + Password1 + "',nameofuser='" + txtName.getText() + "',Email='" + txtEmailID.getText() + "',ContactNo='" + txtContactNo.getText() + "' where Username='" + txtUserName.getText() + "'";

            pst=con.prepareStatement(sql);
            pst.execute();
            String sql2= "update Users set User_Password='" + Password1 + "' where Username='" + txtUserName.getText() + "'";

            pst=con.prepareStatement(sql2);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","User info",JOptionPane.INFORMATION_MESSAGE);
            Update1.setEnabled(false);
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void GetData1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        UserRegisterationRecord form = new UserRegisterationRecord();
        form.setVisible(true);
    }

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenu main=new MainMenu();
        this.hide();
        main.setVisible(true);
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
            java.util.logging.Logger.getLogger(UserRegisteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegisteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegisteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegisteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegisteration().setVisible(true);
            }
        });
    }

   
    public javax.swing.JButton Delete1;
    private javax.swing.JButton GetData1;
    private javax.swing.JButton New1;
    public javax.swing.JButton Save1;
    public javax.swing.JButton Update1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton menuButton;
    public javax.swing.JTextField txtContactNo;
    public javax.swing.JTextField txtEmailID;
    public javax.swing.JTextField txtName;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUserName;
    
}
