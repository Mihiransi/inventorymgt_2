import java.awt.Component;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.MessageFormat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.ComboBoxUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Dashboard extends javax.swing.JFrame {

    
    

    
    
    
 
    public Dashboard() {
        initComponents();
        Connect();
        load();
        
        
   
        this.setLocationRelativeTo(null);
        
        LBL_Dlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/package.png")));
        LBL_Dclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/XX.png")));
        
        Border panelborder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white);
        P_Dnamelogo.setBorder(panelborder);
        
        //default boder for menu items
        Border default_border = BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(46,49,49));
        
        
//yellow border for te menu items
        Border yellow_border = BorderFactory.createMatteBorder(1, 0, 1, 0, Color.yellow);
        
        
    }
    
    Connection con;
    PreparedStatement pst;
    DefaultTableModel df;
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
    
    public void load(){
        
        
        int a;
        try {
            pst = con.prepareStatement("Select * from dispatch_stock");
            ResultSet ra = pst.executeQuery();
            
            
            ResultSetMetaData rd = ra.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel)T_DS.getModel();
            df.setRowCount(0);
            
            while (ra.next())
            {
            Vector v2 = new Vector();
            for (int i=1; i<=a; i++ )
            {
            
            v2.add(ra.getString("Ref_no"));  
            v2.add(ra.getString("D_catagory"));
            v2.add(ra.getString("D_quantity"));
            v2.add(ra.getString("D_Date"));
            }
            df.addRow(v2);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
   }
    
    public void disptachT()
    {
    int a;
        try {
            pst = con.prepareStatement("Select * from dispatch_stock");
            ResultSet rs = pst.executeQuery();
            
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel)T_DS.getModel();
            df.setRowCount(0);
            
            while (rs.next())
            {
            Vector v2 = new Vector();
            for (int i=1; i<=a; i++ )
            {
            
            v2.add(rs.getString("Ref_no"));
            v2.add(rs.getString("D_catagory"));
            v2.add(rs.getString("D_quantity"));
            v2.add(rs.getString("Dispatchno"));
            v2.add(rs.getString("D_Date"));
            }
            df.addRow(v2);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void saveviewVE()
     {
         int a;
        try {
            pst = con.prepareStatement("Select * from enter_stock");
            ResultSet rs = pst.executeQuery();
            
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel)T_view.getModel();
            df.setRowCount(0);
            
            while (rs.next())
            {
            Vector v2 = new Vector();
            for (int i=1; i<=a; i++ )
            {
            v2.add(rs.getString("ID"));
            v2.add(rs.getString("REFNO"));
            v2.add(rs.getString("Type"));
            v2.add(rs.getString("Catagory"));
            v2.add(rs.getString("Quantity"));
            v2.add(rs.getString("Date"));
            }
            df.addRow(v2);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
       

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LBL_Dclose = new javax.swing.JLabel();
        P_Ddashboard = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        P_Denterstock = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TF_ESrefno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TF_ESdate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CB_EStype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        TF_EScatagory = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_ESquantity = new javax.swing.JTextField();
        BTN_ESsave = new javax.swing.JButton();
        BTN_ESreset = new javax.swing.JButton();
        P_Dviewstock = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_view = new javax.swing.JTable();
        BTN_VEedit = new javax.swing.JButton();
        BTN_VEview = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TF_VErefno = new javax.swing.JTextField();
        TF_VEcatagory = new javax.swing.JTextField();
        TF_VEquantity = new javax.swing.JTextField();
        TF_VEdate = new javax.swing.JTextField();
        CB_VEtype = new javax.swing.JComboBox<>();
        BTN_VEdelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BTN_VEsave = new javax.swing.JButton();
        P_Ddispatchstock = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TF_DSrefno = new javax.swing.JTextField();
        TF_DScatagory = new javax.swing.JTextField();
        TF_DSquant = new javax.swing.JTextField();
        TF_DSdno = new javax.swing.JTextField();
        TF_DSdate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_DS = new javax.swing.JTable();
        BTN_DSdispatch = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        TF_DSavquantity = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        P_Dmenu = new javax.swing.JPanel();
        P_Dnamelogo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        LBL_Dlogo = new javax.swing.JLabel();
        jLabel_menuitem1 = new javax.swing.JLabel();
        jLabel_menuitem3 = new javax.swing.JLabel();
        jLabel_menuitem4 = new javax.swing.JLabel();
        jLabel_menuitem5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        LBL_Dclose.setBackground(new java.awt.Color(255, 255, 255));
        LBL_Dclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBL_Dclose.setOpaque(true);
        LBL_Dclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_DcloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LBL_Dclose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(LBL_Dclose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_Ddashboard.setBackground(new java.awt.Color(0, 102, 102));
        P_Ddashboard.setPreferredSize(new java.awt.Dimension(853, 565));
        P_Ddashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("INVENTORY +");
        P_Ddashboard.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel20.setText("MANAGE YOUR STOCK HERE");
        P_Ddashboard.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        P_Denterstock.setBackground(new java.awt.Color(204, 255, 204));
        P_Denterstock.setPreferredSize(new java.awt.Dimension(853, 565));
        P_Denterstock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Referance No:");
        P_Denterstock.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        TF_ESrefno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        P_Denterstock.add(TF_ESrefno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 330, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText(" Date:");
        P_Denterstock.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        TF_ESdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        P_Denterstock.add(TF_ESdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 330, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Type:");
        P_Denterstock.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        CB_EStype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CB_EStype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Raw Materials", "Finished Goods" }));
        P_Denterstock.add(CB_EStype, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 330, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Catagory:");
        P_Denterstock.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        TF_EScatagory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        P_Denterstock.add(TF_EScatagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 330, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Quantity:");
        P_Denterstock.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        TF_ESquantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        P_Denterstock.add(TF_ESquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 330, -1));

        BTN_ESsave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_ESsave.setText("Save");
        BTN_ESsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_ESsaveMouseClicked(evt);
            }
        });
        P_Denterstock.add(BTN_ESsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 130, 40));

        BTN_ESreset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_ESreset.setText("Reset");
        BTN_ESreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ESresetActionPerformed(evt);
            }
        });
        P_Denterstock.add(BTN_ESreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 130, 40));

        P_Dviewstock.setBackground(new java.awt.Color(204, 255, 204));
        P_Dviewstock.setPreferredSize(new java.awt.Dimension(853, 565));

        T_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Referance NO", "Type", "Catagory", "Quantity", "Date"
            }
        ));
        T_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_viewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(T_view);

        BTN_VEedit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BTN_VEedit.setText("EDIT");
        BTN_VEedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_VEeditMouseClicked(evt);
            }
        });
        BTN_VEedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VEeditActionPerformed(evt);
            }
        });

        BTN_VEview.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BTN_VEview.setText("VIEW");
        BTN_VEview.setToolTipText("");
        BTN_VEview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_VEviewMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Ref NO:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Type:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Catagory");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Quantity");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Date");

        TF_VErefno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TF_VEcatagory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TF_VEquantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TF_VEdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        CB_VEtype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CB_VEtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Raw Materials", "Finished Goods" }));

        BTN_VEdelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BTN_VEdelete.setText("Delete");
        BTN_VEdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_VEdeleteMouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BTN_VEsave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_VEsave.setText("SAVE");
        BTN_VEsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_VEsaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_DviewstockLayout = new javax.swing.GroupLayout(P_Dviewstock);
        P_Dviewstock.setLayout(P_DviewstockLayout);
        P_DviewstockLayout.setHorizontalGroup(
            P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DviewstockLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DviewstockLayout.createSequentialGroup()
                        .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(P_DviewstockLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF_VEdate, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(TF_VEquantity)))
                            .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(P_DviewstockLayout.createSequentialGroup()
                                    .addComponent(BTN_VEedit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BTN_VEdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(P_DviewstockLayout.createSequentialGroup()
                                    .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DviewstockLayout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12))
                                            .addGroup(P_DviewstockLayout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)))
                                        .addGroup(P_DviewstockLayout.createSequentialGroup()
                                            .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel10))
                                            .addGap(10, 10, 10)))
                                    .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TF_VEcatagory)
                                        .addComponent(CB_VEtype, 0, 175, Short.MAX_VALUE)
                                        .addComponent(TF_VErefno)))))
                        .addGap(28, 28, 28)
                        .addComponent(BTN_VEsave, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DviewstockLayout.createSequentialGroup()
                        .addComponent(BTN_VEview, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DviewstockLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        P_DviewstockLayout.setVerticalGroup(
            P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DviewstockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTN_VEview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_VEedit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_VEdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_VErefno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(CB_VEtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_VEcatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TF_VEquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_DviewstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_VEdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jButton2)
                    .addComponent(BTN_VEsave))
                .addGap(83, 83, 83))
        );

        P_Ddispatchstock.setBackground(new java.awt.Color(204, 255, 204));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Ref No:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Dispatch No:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Date:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Catagory:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Quantity:");

        TF_DSrefno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TF_DSrefno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_DSrefnoKeyPressed(evt);
            }
        });

        TF_DScatagory.setBackground(new java.awt.Color(204, 204, 204));
        TF_DScatagory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TF_DSquant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TF_DSdno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TF_DSdno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_DSdnoActionPerformed(evt);
            }
        });

        TF_DSdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        T_DS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "REFNo", "Catagory", "Quantity", "Dispatch No", "Date"
            }
        ));
        jScrollPane2.setViewportView(T_DS);

        BTN_DSdispatch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BTN_DSdispatch.setText("Dispatch");
        BTN_DSdispatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_DSdispatchMouseClicked(evt);
            }
        });
        BTN_DSdispatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DSdispatchActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Available Quantity");

        TF_DSavquantity.setBackground(new java.awt.Color(204, 204, 204));
        TF_DSavquantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 51, 0));
        jLabel19.setText("Press Enter");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_DdispatchstockLayout = new javax.swing.GroupLayout(P_Ddispatchstock);
        P_Ddispatchstock.setLayout(P_DdispatchstockLayout);
        P_DdispatchstockLayout.setHorizontalGroup(
            P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DdispatchstockLayout.createSequentialGroup()
                .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_DdispatchstockLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(P_DdispatchstockLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(TF_DSrefno, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DdispatchstockLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TF_DScatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(P_DdispatchstockLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(P_DdispatchstockLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TF_DSquant)
                                .addComponent(TF_DSdno)
                                .addComponent(TF_DSdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TF_DSavquantity))
                            .addComponent(BTN_DSdispatch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(301, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DdispatchstockLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        P_DdispatchstockLayout.setVerticalGroup(
            P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DdispatchstockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TF_DSrefno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(TF_DScatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(TF_DSavquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_DdispatchstockLayout.createSequentialGroup()
                        .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(TF_DSquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(jLabel16))
                    .addGroup(P_DdispatchstockLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_DSdno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addComponent(TF_DSdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(P_DdispatchstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_DSdispatch)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(P_Ddashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(P_Denterstock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(P_Dviewstock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(P_Ddispatchstock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(604, 604, 604)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(P_Ddashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(P_Denterstock, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(38, Short.MAX_VALUE)
                    .addComponent(P_Dviewstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(38, Short.MAX_VALUE)
                    .addComponent(P_Ddispatchstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        P_Dmenu.setBackground(new java.awt.Color(0, 51, 51));

        P_Dnamelogo.setBackground(new java.awt.Color(0, 51, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("INVENTORY+");

        LBL_Dlogo.setBackground(new java.awt.Color(153, 255, 204));
        LBL_Dlogo.setOpaque(true);

        javax.swing.GroupLayout P_DnamelogoLayout = new javax.swing.GroupLayout(P_Dnamelogo);
        P_Dnamelogo.setLayout(P_DnamelogoLayout);
        P_DnamelogoLayout.setHorizontalGroup(
            P_DnamelogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DnamelogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL_Dlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        P_DnamelogoLayout.setVerticalGroup(
            P_DnamelogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DnamelogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_DnamelogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_Dlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel_menuitem1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_menuitem1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_menuitem1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuitem1.setText(" DASHBOARD");
        jLabel_menuitem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem1.setOpaque(true);
        jLabel_menuitem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuitem1MouseClicked(evt);
            }
        });

        jLabel_menuitem3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_menuitem3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_menuitem3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuitem3.setText("  ENTER STOCK");
        jLabel_menuitem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem3.setOpaque(true);
        jLabel_menuitem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuitem3MouseClicked(evt);
            }
        });

        jLabel_menuitem4.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_menuitem4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_menuitem4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuitem4.setText("  VIEW & EDIT STOCK");
        jLabel_menuitem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem4.setOpaque(true);
        jLabel_menuitem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuitem4MouseClicked(evt);
            }
        });

        jLabel_menuitem5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_menuitem5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_menuitem5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuitem5.setText("  DISPATCH STOCK");
        jLabel_menuitem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuitem5.setOpaque(true);
        jLabel_menuitem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuitem5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_DmenuLayout = new javax.swing.GroupLayout(P_Dmenu);
        P_Dmenu.setLayout(P_DmenuLayout);
        P_DmenuLayout.setHorizontalGroup(
            P_DmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_Dnamelogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_menuitem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_menuitem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_menuitem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_menuitem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P_DmenuLayout.setVerticalGroup(
            P_DmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DmenuLayout.createSequentialGroup()
                .addComponent(P_Dnamelogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel_menuitem1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel_menuitem3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel_menuitem4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel_menuitem5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(P_Dmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_Dmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LBL_DcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_DcloseMouseClicked
        //close form
        this.dispose();

    }//GEN-LAST:event_LBL_DcloseMouseClicked

    private void jLabel_menuitem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuitem1MouseClicked
        P_Ddashboard.setVisible(true);
     
        P_Denterstock.setVisible(false);
        P_Dviewstock.setVisible(false);
        P_Ddispatchstock.setVisible(false);
        jLabel_menuitem1.setBackground(Color.WHITE);
        jLabel_menuitem1.setForeground(Color.BLACK);
        
        jLabel_menuitem3.setBackground(new Color(0,51,51));
        jLabel_menuitem3.setForeground(Color.WHITE);
        jLabel_menuitem4.setBackground(new Color(0,51,51));
        jLabel_menuitem4.setForeground(Color.WHITE);
        jLabel_menuitem5.setBackground(new Color(0,51,51));
        jLabel_menuitem5.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_menuitem1MouseClicked

    private void jLabel_menuitem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuitem3MouseClicked
        P_Ddashboard.setVisible(false);
        
        P_Denterstock.setVisible(true);
        P_Dviewstock.setVisible(false);
        P_Ddispatchstock.setVisible(false);
        jLabel_menuitem1.setBackground(new Color(0,51,51));
        jLabel_menuitem1.setForeground(Color.WHITE);
        
        jLabel_menuitem3.setBackground(Color.white);
        jLabel_menuitem3.setForeground(Color.BLACK);
        jLabel_menuitem4.setBackground(new Color(0,51,51));
        jLabel_menuitem4.setForeground(Color.WHITE);
        jLabel_menuitem5.setBackground(new Color(0,51,51));
        jLabel_menuitem5.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_menuitem3MouseClicked

    private void jLabel_menuitem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuitem4MouseClicked
        P_Ddashboard.setVisible(false);
        
        P_Denterstock.setVisible(false);
        P_Dviewstock.setVisible(true);
        P_Ddispatchstock.setVisible(false);
        jLabel_menuitem1.setBackground(new Color(0,51,51));
        jLabel_menuitem1.setForeground(Color.WHITE);
        
        jLabel_menuitem3.setBackground(new Color(0,51,51));
        jLabel_menuitem3.setForeground(Color.WHITE);
        jLabel_menuitem4.setBackground(Color.WHITE);
        jLabel_menuitem4.setForeground(Color.BLACK);
        jLabel_menuitem5.setBackground(new Color(0,51,51));
        jLabel_menuitem5.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_menuitem4MouseClicked

    private void jLabel_menuitem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuitem5MouseClicked
         P_Ddashboard.setVisible(false);
        
        P_Denterstock.setVisible(false);
        P_Dviewstock.setVisible(false);
        P_Ddispatchstock.setVisible(true);
        jLabel_menuitem1.setBackground(new Color(0,51,51));
        jLabel_menuitem1.setForeground(Color.WHITE);
        
        jLabel_menuitem3.setBackground(new Color(0,51,51));
        jLabel_menuitem3.setForeground(Color.WHITE);
        jLabel_menuitem4.setBackground(new Color(0,51,51));
        jLabel_menuitem4.setForeground(Color.WHITE);
        jLabel_menuitem5.setBackground(Color.WHITE);
        jLabel_menuitem5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_menuitem5MouseClicked

    private void BTN_ESresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ESresetActionPerformed
        
        try
        {
        TF_ESrefno.setText(null);
        TF_EScatagory.setText(null);
        TF_ESquantity.setText(null);
        TF_ESdate.setText(null);
        CB_EStype.setSelectedIndex(0);
        }
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_BTN_ESresetActionPerformed

    private void BTN_ESsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ESsaveMouseClicked
       
        try {
            String refno = TF_ESrefno.getText();
             String type = CB_EStype.getSelectedItem().toString();
              String catagory = TF_EScatagory.getText();
               String quantity = TF_ESquantity.getText();
                String date = TF_ESdate.getText();
            
            
            
            
          pst = con.prepareStatement("insert into enter_stock(REFNO,Type,Catagory,Quantity,Date)values(?,?,?,?,?)" );
          
          pst.setString(1, refno);
          pst.setString(2, type);
          pst.setString(3, catagory);
          pst.setString(4, quantity);
          pst.setString(5, date);
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data saved succesfully");
          
          TF_ESrefno.setText("");
          TF_EScatagory.setText("");
          TF_ESquantity.setText("");
          TF_ESdate.setText("");
         
          
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error");
        }
        
    }//GEN-LAST:event_BTN_ESsaveMouseClicked

    private void BTN_VEeditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_VEeditMouseClicked
       
    }//GEN-LAST:event_BTN_VEeditMouseClicked

    private void BTN_VEviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_VEviewMouseClicked
        
        
        int a;
        try {
            pst = con.prepareStatement("Select * from enter_stock");
            ResultSet rs = pst.executeQuery();
            
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel)T_view.getModel();
            df.setRowCount(0);
            
            while (rs.next())
            {
            Vector v2 = new Vector();
            for (int i=1; i<=a; i++ )
            {
            v2.add(rs.getString("ID"));
            v2.add(rs.getString("REFNO"));
            v2.add(rs.getString("Type"));
            v2.add(rs.getString("Catagory"));
            v2.add(rs.getString("Quantity"));
            v2.add(rs.getString("Date"));
            }
            df.addRow(v2);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                   
    }//GEN-LAST:event_BTN_VEviewMouseClicked

    private void T_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_viewMouseClicked
        
        df = (DefaultTableModel)T_view.getModel();
        int Selected = T_view.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(Selected, 0).toString());
        TF_VErefno.setText(df.getValueAt(Selected, 1).toString());
       
        TF_VEcatagory.setText(df.getValueAt(Selected, 3).toString());
        TF_VEquantity.setText(df.getValueAt(Selected, 4).toString());
        TF_VEdate.setText(df.getValueAt(Selected, 5).toString());
    }//GEN-LAST:event_T_viewMouseClicked

    private void BTN_VEdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_VEdeleteMouseClicked
      
        df = (DefaultTableModel)T_view.getModel();
        int Selected = T_view.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(Selected, 0).toString());
        
       
            
        try {
            pst = con.prepareStatement("delete from enter_stock where id=?" );
         
          pst.setInt(1, id);
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data Deleted Succesfully");
          
          TF_ESrefno.setText("");
          TF_ESrefno.setText("");
          TF_ESrefno.setText("");
          TF_ESrefno.setText(""); 
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BTN_VEdeleteMouseClicked

    private void TF_DSdnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_DSdnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_DSdnoActionPerformed

    private void TF_DSrefnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DSrefnoKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        try {
            String refno = TF_DSrefno.getText();
            pst = con.prepareStatement("select * from enter_stock where REFNO=?");
            pst.setString(1, refno);
             rs= pst.executeQuery();
             
             if(rs.next() == false)
             {
             JOptionPane.showMessageDialog(this , "Entry Not Found");
             TF_DSrefno.setText("");
             }
            else
             {
             String cata = rs.getString("Catagory");
             String quan = rs.getString("Quantity");
             
             
             TF_DScatagory.setText(cata.trim());
             TF_DSavquantity.setText(quan.trim());
             TF_DSquant.requestFocus();
             
             }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    }//GEN-LAST:event_TF_DSrefnoKeyPressed

    private void BTN_DSdispatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_DSdispatchMouseClicked
        
        try {
            String Drefno = TF_DSrefno.getText();
              String Dcatagory = TF_DScatagory.getText();
               String Dquantity = TF_DSquant.getText();
               String Ddispatchno = TF_DSdno.getText();
                String Ddate = TF_DSdate.getText();
            
            
            
            
          pst = con.prepareStatement("insert into dispatch_stock(Ref_no,D_catagory,D_quantity,Dispatchno,D_Date)values(?,?,?,?,?)" );
          
          pst.setString(1, Drefno);
          pst.setString(2, Dcatagory);
          pst.setString(3, Dquantity);
          pst.setString(4, Ddispatchno);
          pst.setString(5, Ddate);
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data saved succesfully");
          
          TF_DSrefno.setText("");
          TF_DScatagory.setText("");
          TF_DSquant.setText("");
          TF_DSdno.setText("");
          TF_DSdate.setText("");
         disptachT();
          
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error");
        }
        
        
        
    }//GEN-LAST:event_BTN_DSdispatchMouseClicked

    private void BTN_VEeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VEeditActionPerformed
        
        
        
        
    }//GEN-LAST:event_BTN_VEeditActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try
        {
        TF_DSrefno.setText(null);
        TF_DScatagory.setText(null);
        TF_DSavquantity.setText(null);
        TF_DSquant.setText(null);
        TF_DSdno.setText(null);
        TF_DSdate.setText(null);
        }
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
        TF_VErefno.setText(null);
        TF_VEcatagory.setText(null);
        TF_VEquantity.setText(null);
        TF_VEdate.setText(null);
        CB_VEtype.setSelectedIndex(0);
        }
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BTN_DSdispatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DSdispatchActionPerformed
        
    }//GEN-LAST:event_BTN_DSdispatchActionPerformed

    private void BTN_VEsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_VEsaveMouseClicked
        
        try {
            df = (DefaultTableModel)T_view.getModel();
        int Selected = T_view.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(Selected, 0).toString());
            String refno = TF_VErefno.getText();
             String type = CB_VEtype.getSelectedItem().toString();
              String catagory = TF_VEcatagory.getText();
               String quantity = TF_VEquantity.getText();
                String date = TF_VEdate.getText();
                
          pst = con.prepareStatement("update enter_stock set REFNO=?,Type=?,Catagory=?,Quantity=?,Date=? where id=?" );
          pst.setString(1, refno);
          pst.setString(2, type);
          pst.setString(3, catagory);
          pst.setString(4, quantity);
          pst.setString(5, date);
          pst.setInt(6, id);
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data updated succesfully");
          
          TF_VErefno.setText("");
          TF_VEcatagory.setText("");
          TF_VEquantity.setText("");
          TF_VEdate.setText(""); 
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        saveviewVE();
    }//GEN-LAST:event_BTN_VEsaveMouseClicked
     
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_DSdispatch;
    private javax.swing.JButton BTN_ESreset;
    private javax.swing.JButton BTN_ESsave;
    private javax.swing.JButton BTN_VEdelete;
    private javax.swing.JButton BTN_VEedit;
    private javax.swing.JButton BTN_VEsave;
    private javax.swing.JButton BTN_VEview;
    private javax.swing.JComboBox<String> CB_EStype;
    private javax.swing.JComboBox<String> CB_VEtype;
    private javax.swing.JLabel LBL_Dclose;
    private javax.swing.JLabel LBL_Dlogo;
    private javax.swing.JPanel P_Ddashboard;
    private javax.swing.JPanel P_Ddispatchstock;
    private javax.swing.JPanel P_Denterstock;
    private javax.swing.JPanel P_Dmenu;
    private javax.swing.JPanel P_Dnamelogo;
    private javax.swing.JPanel P_Dviewstock;
    private javax.swing.JTextField TF_DSavquantity;
    private javax.swing.JTextField TF_DScatagory;
    private javax.swing.JTextField TF_DSdate;
    private javax.swing.JTextField TF_DSdno;
    private javax.swing.JTextField TF_DSquant;
    private javax.swing.JTextField TF_DSrefno;
    private javax.swing.JTextField TF_EScatagory;
    private javax.swing.JTextField TF_ESdate;
    private javax.swing.JTextField TF_ESquantity;
    private javax.swing.JTextField TF_ESrefno;
    private javax.swing.JTextField TF_VEcatagory;
    private javax.swing.JTextField TF_VEdate;
    private javax.swing.JTextField TF_VEquantity;
    private javax.swing.JTextField TF_VErefno;
    private javax.swing.JTable T_DS;
    private javax.swing.JTable T_view;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_menuitem1;
    private javax.swing.JLabel jLabel_menuitem3;
    private javax.swing.JLabel jLabel_menuitem4;
    private javax.swing.JLabel jLabel_menuitem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
