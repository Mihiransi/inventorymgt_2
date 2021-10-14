
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Login_Form extends javax.swing.JFrame {

   
    public Login_Form() {
        
        initComponents();
        Connect();
        
        this.setLocationRelativeTo(null);
        
        LBL_Lclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/XX.png")));
        LBL_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/user.png")));
        LBL_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/lock.png")));
        LBL_showpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/eye.png")));
        LBL_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/up.png")));
        
        Border panelborder = BorderFactory.createMatteBorder(5, 5, 5, 5, Color.black);
        jPanel1_cont.setBorder(panelborder);
        
        Border titleborder = BorderFactory.createMatteBorder(0, 0, 4, 0, Color.darkGray);
        jLabel1_title.setBorder(titleborder);
              
        
    }
    
    Connection con;
    PreparedStatement pst;
    
    ResultSet rs;
    
     public void Connect() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/inventory2","root","");
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

    //timer to hid the message pnale
    Timer timerup = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(P_Lmessage.getHeight() != 0)
            {
            P_Lmessage.setBounds(P_Lmessage.getX(), P_Lmessage.getY(), P_Lmessage.getWidth(), P_Lmessage.getHeight() - 5);
            }
            else
            {
            timerup.stop();
            }
        }
    });
          //timer to show message panel
    Timer timerdown = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(P_Lmessage.getHeight() != 58)
            {
            P_Lmessage.setBounds(P_Lmessage.getX(), P_Lmessage.getY(), P_Lmessage.getWidth(), P_Lmessage.getHeight() + 5);
            }
            else
            {
            timerdown.stop();
            }
        }
    });
    
           
            
            
            
            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1_cont = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1_title = new javax.swing.JLabel();
        LBL_username = new javax.swing.JLabel();
        TF_username = new javax.swing.JTextField();
        LBL_password = new javax.swing.JLabel();
        PF_password = new javax.swing.JPasswordField();
        BTN_login = new javax.swing.JButton();
        CB_showpassword = new javax.swing.JCheckBox();
        LBL_showpassword = new javax.swing.JLabel();
        P_Lmessage = new javax.swing.JPanel();
        LBL_up = new javax.swing.JLabel();
        LBL_Lmessage = new javax.swing.JLabel();
        LBL_Lnewuser = new javax.swing.JLabel();
        LBL_Lclose = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1_cont.setBackground(new java.awt.Color(162, 222, 208));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1_title.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1_title.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        jLabel1_title.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_title.setText("LOGIN");
        jLabel1_title.setOpaque(true);

        LBL_username.setBackground(new java.awt.Color(255, 255, 255));
        LBL_username.setOpaque(true);

        TF_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LBL_password.setBackground(new java.awt.Color(255, 255, 255));
        LBL_password.setOpaque(true);

        PF_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BTN_login.setBackground(new java.awt.Color(204, 255, 204));
        BTN_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN_login.setText("Login");
        BTN_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_loginActionPerformed(evt);
            }
        });

        CB_showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_showpasswordActionPerformed(evt);
            }
        });

        LBL_showpassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        P_Lmessage.setBackground(new java.awt.Color(255, 102, 51));
        P_Lmessage.setPreferredSize(new java.awt.Dimension(58, 58));

        LBL_up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBL_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_upMouseClicked(evt);
            }
        });

        LBL_Lmessage.setText("MESSAGE");

        javax.swing.GroupLayout P_LmessageLayout = new javax.swing.GroupLayout(P_Lmessage);
        P_Lmessage.setLayout(P_LmessageLayout);
        P_LmessageLayout.setHorizontalGroup(
            P_LmessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_LmessageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL_Lmessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(LBL_up, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_LmessageLayout.setVerticalGroup(
            P_LmessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_LmessageLayout.createSequentialGroup()
                .addComponent(LBL_up, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(P_LmessageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL_Lmessage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LBL_Lnewuser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBL_Lnewuser.setForeground(new java.awt.Color(102, 0, 0));
        LBL_Lnewuser.setText("New User: Register Here");
        LBL_Lnewuser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBL_Lnewuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_LnewuserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(P_Lmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(LBL_password, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                            .addComponent(LBL_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TF_username)
                                            .addComponent(PF_password, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(CB_showpassword)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(LBL_showpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LBL_Lnewuser))))
                                    .addComponent(BTN_login, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1_title, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LBL_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TF_username, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBL_password, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PF_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CB_showpassword)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_Lnewuser)
                            .addComponent(LBL_showpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(BTN_login)
                .addGap(18, 18, 18)
                .addComponent(P_Lmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        LBL_Lclose.setBackground(new java.awt.Color(162, 222, 208));
        LBL_Lclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBL_Lclose.setOpaque(true);
        LBL_Lclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_LcloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_contLayout = new javax.swing.GroupLayout(jPanel1_cont);
        jPanel1_cont.setLayout(jPanel1_contLayout);
        jPanel1_contLayout.setHorizontalGroup(
            jPanel1_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_contLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBL_Lclose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1_contLayout.setVerticalGroup(
            jPanel1_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_contLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL_Lclose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_cont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_cont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_loginActionPerformed
      
        
String us=TF_username.getText();
String pass=PF_password.getText();
 try {
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/inventory2","root","");

    pst = con.prepareStatement("Select * from user_register");
    rs = pst.executeQuery();
   
    while(rs.next())
        
{
String Username= rs.getString("Username");
String Password= rs.getString("Password");

if (us.equals(Username) && pass.equals(Password))
{
    JOptionPane.showMessageDialog(this, "Login Sucessfull");
    this.dispose();
   Dashboard dashboard = new Dashboard();
   dashboard.setVisible(true);
   
   
}
else if(us.equals("") && pass.equals(""))
{
JOptionPane.showMessageDialog(this, "Please enter the user name and password!");
}
else if(us.equals("Username") && pass.equals(""))
{
JOptionPane.showMessageDialog(this, "Please enter the password!");
}
else if(us.equals("") && pass.equals("Password"))
{
JOptionPane.showMessageDialog(this, "Please enter the user name!");
}
else
{
JOptionPane.showMessageDialog(this, "Username and Password is incorrect!");
}
}
}catch(ClassNotFoundException | SQLException | HeadlessException ex)
{
JOptionPane.showMessageDialog(null, "Error while establishing connection");
}
           
        
        
    }//GEN-LAST:event_BTN_loginActionPerformed

    private void CB_showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_showpasswordActionPerformed
       
        //show hide password
        if(CB_showpassword.isSelected())
        {
         PF_password.setEchoChar((char)0);
         
        }
        else
        {
         PF_password.setEchoChar('*');
        }
        
    }//GEN-LAST:event_CB_showpasswordActionPerformed

    private void LBL_LcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_LcloseMouseClicked
        //close form
        this.dispose();
        
    }//GEN-LAST:event_LBL_LcloseMouseClicked

    private void LBL_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_upMouseClicked
        
        //hide Login panel message
        timerup.start();
        
    }//GEN-LAST:event_LBL_upMouseClicked

    private void LBL_LnewuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_LnewuserMouseClicked
        
        this.dispose();
        LoginRegister lreg = new LoginRegister();
        lreg.setVisible(true);
        
        
    }//GEN-LAST:event_LBL_LnewuserMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_login;
    private javax.swing.JCheckBox CB_showpassword;
    private javax.swing.JLabel LBL_Lclose;
    private javax.swing.JLabel LBL_Lmessage;
    private javax.swing.JLabel LBL_Lnewuser;
    private javax.swing.JLabel LBL_password;
    private javax.swing.JLabel LBL_showpassword;
    private javax.swing.JLabel LBL_up;
    private javax.swing.JLabel LBL_username;
    private javax.swing.JPasswordField PF_password;
    private javax.swing.JPanel P_Lmessage;
    private javax.swing.JTextField TF_username;
    private javax.swing.JLabel jLabel1_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1_cont;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
