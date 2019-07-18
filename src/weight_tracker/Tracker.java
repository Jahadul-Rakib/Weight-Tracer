
package weight_tracker;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.io.*; 
import java.sql.*; 

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.general.DefaultPieDataset;

public class Tracker extends javax.swing.JFrame {
    session s = new session();
    DBconnection d = new DBconnection();

    public Tracker() {
        initComponents();
        update();
        valuOf();
        //run();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        cmbgender = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        txtweight = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtreasultAC = new javax.swing.JTextArea();
        cmbshift = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        cmbdatetype = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        cmbmealname = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtexmin = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtsummary = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        cmbexercisename = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        cmbexercisename11 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtexercisevalue = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Age:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Gender:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Password:");

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Update Personal Information");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("--Log Out--");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtage)
                            .addComponent(txtpassword)
                            .addComponent(txtname)
                            .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(138, 138, 138)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Exersize Shift");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Meal Name");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("waist size");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Amount Of Meal");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Weight(Gram)");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Everyday Update");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtreasultAC.setColumns(20);
        txtreasultAC.setRows(5);
        jScrollPane1.setViewportView(txtreasultAC);

        cmbshift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Date");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Day Type");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmbdatetype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive", "Moderately Active" }));
        cmbdatetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdatetypeActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Calculation");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jButton2.setText("Clean");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton9.setText("Print");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(87, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(cmbshift, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(txtweight))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jTextField2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbdatetype, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField9)
                                    .addComponent(cmbmealname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(49, 49, 49))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbshift, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbdatetype, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbmealname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Daily Basis", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Exersize (Min)");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Calori Burned");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtsummary.setEditable(false);
        txtsummary.setColumns(20);
        txtsummary.setRows(5);
        jScrollPane2.setViewportView(txtsummary);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Date");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDateChooser2.setDateFormatString("dd-MM-yyyy");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Today Summary");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Taget Calories For The Day");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Exercise Name");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Exercise Name");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtexercisevalue.setColumns(20);
        txtexercisevalue.setRows(5);
        jScrollPane3.setViewportView(txtexercisevalue);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Date");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDateChooser3.setDateFormatString("dd-MM-yyyy");

        jButton8.setText("Print");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(jTextField7)
                            .addComponent(txtexmin)))
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbexercisename, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbexercisename11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton8)))
                .addGap(115, 115, 115))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbexercisename, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbexercisename11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtexmin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jButton5))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Exercize", jPanel3);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "date", "Burned Calori", "Exercise Duration", "Name Of Exercise", "Average Weight", "Day Weight", "Change Of weight"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Line Chart Of Weight Losses");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Change", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Thread update = new Thread(){
        public void run(){
        String name = txtname.getText();
        String age = txtage.getText();
        String gender = cmbgender.getSelectedItem().toString();
        String password = txtpassword.getText();

        try {

            String SqlUpdater = "UPDATE `registation` SET `name`='"+name+"',`password`='"+password+"',`gender`='"+gender+"',`age`='"+age+"' WHERE email = '"+s.UserEmail+"'";
            d.statement.execute(SqlUpdater);
            JOptionPane.showMessageDialog(null,"Your Data is Updated");

        } catch (Exception e) {
        }
    }
    };
    update.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        log_in i = new log_in();
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        

    try {
            String MealCalori = cmbmealname.getSelectedItem().toString();
            String udate1 = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
            String ushift1 = cmbshift.getSelectedItem().toString();
            Double uWeight1 = Double.parseDouble(txtweight.getText());
            Double uwaist1  = Double.parseDouble(jTextField2.getText()); 
            Double amount1  = Double.parseDouble(jTextField9.getText());
            Double Daybasis1 = Double.parseDouble(jTextField1.getText());
        
            //Here is checking the value is already exist


            
         
        String Sqlqq = "Select * from weightandwaist Where email = '"+s.UserEmail+"' AND date ='"+udate1+"' AND exerciseShift = '"+ushift1+"'";
        ResultSet rsV = d.statement.executeQuery(Sqlqq);
        System.out.println("Here Is Checking:  "+Sqlqq);
        boolean value1 = rsV.next();
        
        if(value1 == true){
            JOptionPane.showMessageDialog(null,"Today Value already Entered");
        }
        
        else{
            while(value1 == false){

            String sqlpickDayValue = "Select * from add_meal Where meal_name = '"+MealCalori+"'";
            ResultSet rs = d.statement.executeQuery(sqlpickDayValue);
            System.out.println(sqlpickDayValue);
            while(rs.next()){
            
                Double value  = rs.getDouble("calori");
                s.setValue(value);
                //txtreasultAC.setText(String.valueOf(value));
                
                
            }
            Double amount = Double.parseDouble(jTextField9.getText());
            Double sum = (s.getValue() * amount);
            //txtreasultAC.setText(String.valueOf(sum));
            System.out.println(sum);
            
            Double Weight = Double.parseDouble(txtweight.getText()); 
            Double Daybasis = Double.parseDouble(jTextField1.getText()); 
            Double SumOfCaloriNeed = (Weight * Daybasis);
            System.out.println(SumOfCaloriNeed);
            
            if(SumOfCaloriNeed < sum){
            Double Burn1 = (sum - SumOfCaloriNeed);
            System.out.println("you need to burn for maintain present weight" + Burn1);
            try {
          
             String udate = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
             String ushift = cmbshift.getSelectedItem().toString();
             Double uWeight = Double.parseDouble(txtweight.getText());
             Double uwaist  = Double.parseDouble(jTextField2.getText());

            String SqlInput = "INSERT INTO weightandwaist (email, date, exerciseShift, Weight, Waist,mealName,Calori_intake,need_burn) VALUES"
              + " ('"+s.UserEmail+"','"+udate+"','"+ushift+"','"+uWeight+"','"+uwaist+"','"+MealCalori+"','"+sum+"','"+Burn1+"')";
            d.statement.execute(SqlInput);
            
            System.out.println(SqlInput);
            JOptionPane.showMessageDialog(null,"ok");
            
            
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null," With Date Failed");
           }
            
            
            } 
            else if (SumOfCaloriNeed > sum){
            Double Burn2 = (SumOfCaloriNeed - sum);
            System.out.println("you need to Take for maintain present weight" + Burn2);
            try {
          
             String udate = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
             String ushift = cmbshift.getSelectedItem().toString();
             Double uWeight = Double.parseDouble(txtweight.getText());
             Double uwaist  = Double.parseDouble(jTextField2.getText());

            String SqlInput = "INSERT INTO weightandwaist (email, date, exerciseShift, Weight, Waist,mealName,Calori_intake,need_burn) VALUES"
              + " ('"+s.UserEmail+"','"+udate+"','"+ushift+"','"+uWeight+"','"+uwaist+"','"+MealCalori+"','"+sum+"','"+Burn2+"')";
            d.statement.execute(SqlInput);
            
            System.out.println(SqlInput);
            JOptionPane.showMessageDialog(null,"ok");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," With Date Failed");
        }
            }
            else {
            Double Burn3 = 0.0 ;
            System.out.println("you Have"+ Burn3);
            try {
          
            String udate = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
            String ushift = cmbshift.getSelectedItem().toString();
            Double uWeight = Double.parseDouble(txtweight.getText());
            Double uwaist  = Double.parseDouble(jTextField2.getText());

            String SqlInput = "INSERT INTO weightandwaist (email, date, exerciseShift, Weight, Waist,mealName,Calori_intake,need_burn) VALUES"
              + " ('"+s.UserEmail+"','"+udate+"','"+ushift+"','"+uWeight+"','"+uwaist+"','"+MealCalori+"','"+sum+"','"+Burn3+"')";
            d.statement.execute(SqlInput);
            
            System.out.println(SqlInput);
            JOptionPane.showMessageDialog(null,"ok");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," With Date Failed");
        }
            }
        try {
            
            Double uwaist  = Double.parseDouble(jTextField2.getText());
            String sql = "SELECT * FROM  weightandwaist WHERE email = '"+s.UserEmail+"' ORDER BY id asc LIMIT 1";
            ResultSet rs1 = d.statement.executeQuery(sql);
            while(rs1.next()){
            Double firstWeight = rs1.getDouble("Weight");
            Double firstWaist = rs1.getDouble("Waist");
            
            Double deifferenceOfWeight = (firstWeight - Weight);
            Double deifferenceOfWaist = (firstWaist - uwaist);
            String udate = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
            String ushift = cmbshift.getSelectedItem().toString();
        
            txtreasultAC.append("Today Date -----'"+udate+"' \n"+
               "Take Calori -----'"+sum+"' \n"+
               "Necessary Calori -----'"+SumOfCaloriNeed+"' \n"+
               "Shift Of Exercise -----'"+ushift+"' \n"+
               "Weight Difference with First Day -----'"+deifferenceOfWeight+"' \n"+
               "Waist Difference with First Day -----'"+deifferenceOfWaist+"' \n"+
                "\n"+"\n"+"\n"+"\n"
               ); 
            
            }
        } catch (Exception e) {
        } 
        break;}
        }

        }     
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Fill all the BlanK Boxes");
        }      
        
        
        
      

    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmbdatetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdatetypeActionPerformed
        
          String gender = cmbgender.getSelectedItem().toString();
          String daytype = cmbdatetype.getSelectedItem().toString();
          try {
            String sqlpickDayValue = "Select * from rules Where geder = '"+gender+"' AND day_type = '"+daytype+"' ";
            ResultSet rs = d.statement.executeQuery(sqlpickDayValue);
               
            while(rs.next()){
            
                String value  = rs.getString("rule");
                jTextField1.setText(value);
                
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_cmbdatetypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jDateChooser1.setDate(null);
        txtweight.setText(null);
        jTextField2.setText(null);
        jTextField1.setText(null);
        jTextField9.setText(null);
        txtreasultAC.setText(null);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        String udate = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
        String uexerciseName = cmbexercisename.getSelectedItem().toString();
        
            try {
            String exercisename = "Select * from add_exercise where exercise_name = '"+uexerciseName+"'";
            ResultSet rs = d.statement.executeQuery(exercisename);
            while(rs.next()){
                Double caloriburnPerMin = rs.getDouble("calori_burn");
                s.setCaloriburnPerMin(caloriburnPerMin);
            }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed in burn per min");
            }
            try {
            String totalCalori = "SELECT SUM(need_burn) FROM weightandwaist WHERE email ='"+s.UserEmail+"' AND date ='"+udate+"' ";
            ResultSet rs1 = d.statement.executeQuery(totalCalori);
            System.out.println(rs1);
            while(rs1.next()){
                Double total = rs1.getDouble("SUM(need_burn)");
                s.setTotal(total);
                System.out.println(total);
               }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed in total Calori");
            }

           Double sum =   (s.getTotal() / s.getCaloriburnPerMin() );
           s.setExeciseminsum(sum);
           txtexercisevalue.append("You need to "+uexerciseName+" Minimum "+sum+" Minuites \n");
    
           
        jDateChooser3.setEnabled(true);
        cmbexercisename11.setEnabled(true);
        txtexmin.setEnabled(true);
        jButton5.setEnabled(true);
        jButton8.setEnabled(true);
        
        jDateChooser2.setEnabled(false);
        cmbexercisename.setEnabled(false);
        cmbexercisename.setEnabled(false);
        jButton6.setEnabled(false);   
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        try{
        
        String udate = ((JTextField)jDateChooser3.getDateEditor().getUiComponent()).getText();
        String exerciseName = cmbexercisename11.getSelectedItem().toString();
        Double min  = Double.parseDouble(txtexmin.getText());

            try {
            String exercisename = "Select * from add_exercise where exercise_name = '"+exerciseName+"'";
            ResultSet rs = d.statement.executeQuery(exercisename);
            while(rs.next()){
                Double caloriburnPerMin = rs.getDouble("calori_burn");
                s.setCaloriburnPerMin(caloriburnPerMin);
            }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed in burn per min");
            }
        Double Sumofcaloriburn = (min*s.caloriburnPerMin );
        jTextField7.setText("Calori Burned: "+Sumofcaloriburn);
        
        
            try {
            String Avgweight = "SELECT AVG(Weight) FROM weightandwaist WHERE email ='"+s.UserEmail+"' AND date ='"+udate+"' ";
            ResultSet rs1 = d.statement.executeQuery(Avgweight);
            System.out.println(rs1);
            while(rs1.next()){
                Double total = rs1.getDouble("AVG(Weight)");
                s.setTotal(total);
                System.out.println(total);
               }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed in total Calori");
            }
            
            Double weightBurnAfterEx = (Sumofcaloriburn / s.caloriburnPerMin )/1000;
            
            if (s.getExeciseminsum() > min){
            Double Currentweight = ((s.total) + (weightBurnAfterEx));
            s.setCurrentweight(Currentweight);
            JOptionPane.showMessageDialog(null, "Weight Increase. Thank You");
            
            }
            else if(s.getExeciseminsum() < min){
            
            Double Currentweight = ((s.total) - (weightBurnAfterEx));
            s.setCurrentweight(Currentweight);
            JOptionPane.showMessageDialog(null, "Weight Loss. Thank You");
            
            
            }
            else{
            Double Currentweight =(s.total);
            s.setCurrentweight(Currentweight);
            JOptionPane.showMessageDialog(null, "You are sstable position Thank You");
            
            }
            
            

            
//            if (weightBurnAfterEx >= 0){
//                Double Currentweight = ((s.total) - (weightBurnAfterEx));
//                s.setCurrentweight(Currentweight);
//                JOptionPane.showMessageDialog(null, "GooD performance");
//                 }
//            else if(weightBurnAfterEx < 0){
//                Double Currentweight = ((s.total) + (weightBurnAfterEx));
//                s.setCurrentweight(Currentweight);
//                JOptionPane.showMessageDialog(null, "Need More Exercise For the day");
//            }
            
            try {
                String sqlww = "SELECT AVG(`AfterExerciseWeight`) FROM `exercise_record` WHERE email ='"+s.UserEmail+"'";
                ResultSet rss = d.statement.executeQuery(sqlww);
                while(rss.next()){
                Double averageWeight = rss.getDouble("AVG(`AfterExerciseWeight`)");
                s.setAverageWeight(averageWeight);
                }
            
            } catch (Exception e) {
        }
            
            try {
            String SqlAvgChange = "SELECT AVG(`weightChange`) FROM `exercise_record` WHERE email = '"+s.UserEmail+"'";
            ResultSet rs = d.statement.executeQuery(SqlAvgChange);
            while(rs.next()){
            Double AvgWeightChange = rs.getDouble("AVG(`weightChange`)");
            s.setAvgWeightChange(AvgWeightChange);
            }
               
            } catch (Exception e) {
            }
            
            
            
            txtsummary.append("Your Average Weight :"+s.total+"Kg \n"+ "Weight Change For Exercise: "+weightBurnAfterEx
            +"Kg \n"+ "After Losses Weight: "+s.Currentweight+"Kg \n"+ "Total Average Weight: "+s.getAverageWeight()+"Kg \n"+
             "Daily Average Weight Change : "+s.getAvgWeightChange()+"Kg \n"
            
            );
            
            try {
            
                String SqlInsert = "INSERT INTO `exercise_record`(`email`, `date`, `averageWeight`, `caloriBurn`, `exerciseName`, `exerciseDuration`, `AfterExerciseWeight`, `weightChange`)"
                        + " VALUES ('"+s.UserEmail+"','"+udate+"','"+s.total+"','"+Sumofcaloriburn+"','"+exerciseName+"','"+min+"','"+s.Currentweight+"','"+weightBurnAfterEx+"' )";
                
                d.statement.execute(SqlInsert);
                System.out.println(SqlInsert);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please Input Your Eneryday Update First For the day");
                
        }
            
        jDateChooser3.setEnabled(false);
        cmbexercisename11.setEnabled(false);
        txtexmin.setEnabled(false);
        jButton5.setEnabled(false);
        //jButton8.setEnabled(false);
        
        jDateChooser2.setEnabled(false);
        cmbexercisename.setEnabled(false);
        cmbexercisename.setEnabled(false);
        jButton6.setEnabled(false);      
        }
                 catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fill All The Blank Day");
                
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        try {
            String sqlchart = "SELECT `date`,`AfterExerciseWeight` FROM `exercise_record`WHERE `email` = '"+s.UserEmail+"'";
            ResultSet ras = d.statement.executeQuery(sqlchart);
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            while(ras.next()){
                  
                    String a = ras.getString("date");
                    //Double.parseDouble( ras.getString("AfterExerciseWeight")));
                    Double b = ras.getDouble("AfterExerciseWeight");
                    dataset.addValue(b , "Weight", a);
                    }
            //return dataset;
                
                
             JFreeChart chart = ChartFactory.createLineChart("Weight Change Line Chart", "Date", "Weight", dataset, PlotOrientation.VERTICAL,false,true,true);
        
            

             chart.setBackgroundPaint(Color.GRAY);
             chart.getTitle().setPaint(Color.RED);
             CategoryPlot p = chart.getCategoryPlot();
             p.setRangeGridlinePaint(Color.blue);
        
        
             ChartFrame frame = new ChartFrame("Weight Loss", chart);
             frame.setVisible(true);
             frame.setSize(933, 527);
            
                  int width = 560;    
                  int height = 370;    
                  File LineChart = new File( "Line_Chart.jpeg" );
                  ChartUtilities.saveChartAsJPEG( LineChart , chart , width , height );
            
            } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            try {
            boolean comp = txtsummary.print();
            
            if(comp){
            
                JOptionPane.showMessageDialog(null,"Done Printing","Information",JOptionPane.INFORMATION_MESSAGE);
            
            }
            else{
            
             JOptionPane.showMessageDialog(null,"Failed Printing","Information",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            try {
            boolean comp = txtreasultAC.print();
            
            if(comp){
            
                JOptionPane.showMessageDialog(null,"Done Printing","Information",JOptionPane.INFORMATION_MESSAGE);
            
            }
            else{
            
             JOptionPane.showMessageDialog(null,"Failed Printing","Information",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    public void valuOf(){
        try {
        DefaultTableModel mdl = (DefaultTableModel)jTable1.getModel();
        String sqla = "SELECT  `date`, `averageWeight`, `caloriBurn`, `exerciseName`, `exerciseDuration`, `AfterExerciseWeight`, `weightChange` FROM `exercise_record` WHERE `email`='"+s.UserEmail+"' ";            
        ResultSet ts = d.statement.executeQuery(sqla);
        Object[] tc = new Object[7];
                    while(ts.next()){
                        String Date= ts.getString("date");
                        String CaloriBurned = ts.getString("caloriBurn");
                        String Buration = ts.getString("exerciseDuration");
                        String Exercise = ts.getString("exerciseName");
                        String PWeight = ts.getString("averageWeight");
                        String Lweight= ts.getString("AfterExerciseWeight");
                        String ChangeWeight = ts.getString("weightChange");
                        
                        tc[0] = Date;
                        tc[1] = CaloriBurned;
                        tc[2] = Buration;
                        tc[3] = Exercise;
                        tc[4] = PWeight;
                        tc[5] = Lweight;
                        tc[6] = ChangeWeight;
                        
                        mdl.addRow(tc);
                       }
      
        } catch (Exception e) {
            
           JOptionPane.showMessageDialog(null, "Failed");
        }
        
                                       
 
        } 
 
    public void update(){
        
        try {
            String SQLupdate ="select * from registation where email = '"+s.UserEmail+"'";
            ResultSet rs=d.statement.executeQuery(SQLupdate);
            //System.out.println(SQLupdate);
            while(rs.next()){
            
            String name = rs.getString("name");
            String gender = rs.getString("gender");
            String age = rs.getString("age");
            String password = rs.getString("password");
            
            txtname.setText(name);
            txtage.setText(age);
            cmbgender.setSelectedItem(gender);
            txtpassword.setText(password);
            }
        } catch (Exception e) {
            
        }
        try {
            String Sqlmealname = "SELECT * FROM `add_meal`";
            ResultSet rs = d.statement.executeQuery(Sqlmealname);
            //System.out.println(Sqlmealname);
            while(rs.next()){
            
                String mealname = rs.getString("meal_name");
                cmbmealname.addItem(mealname);
                
            }
            
            
        } catch (Exception e) {
        }
        try {
            String Sqlmealname = "SELECT * FROM `add_exercise`";
            ResultSet rs = d.statement.executeQuery(Sqlmealname);
            //System.out.println(Sqlmealname);
            while(rs.next()){
            
                String exercisename = rs.getString("exercise_name");
                cmbexercisename.addItem(exercisename);
                cmbexercisename11.addItem(exercisename);
                
            }
            
            
        } catch (Exception e) {
        }

        
        jDateChooser3.setEnabled(false);
        cmbexercisename11.setEnabled(false);
        txtexmin.setEnabled(false);
        jButton5.setEnabled(false);
        jButton8.setEnabled(false);
        

}
    
    
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
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbdatetype;
    private javax.swing.JComboBox<String> cmbexercisename;
    private javax.swing.JComboBox<String> cmbexercisename11;
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JComboBox<String> cmbmealname;
    private javax.swing.JComboBox<String> cmbshift;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextArea txtexercisevalue;
    private javax.swing.JTextField txtexmin;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextArea txtreasultAC;
    private javax.swing.JTextArea txtsummary;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables
}
