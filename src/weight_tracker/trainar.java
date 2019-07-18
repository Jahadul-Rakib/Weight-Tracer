
package weight_tracker;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class trainar extends javax.swing.JFrame {
    
    DBconnection d = new DBconnection();
    session s = new session();

    public trainar() {
        initComponents();
        info();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtmealname = new javax.swing.JTextField();
        txtcaloripergram = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtexercisename = new javax.swing.JTextField();
        txtcaloriburn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableallinfo = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtableexercise = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtablemeal = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD MEAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Meal Name:");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 94, 21));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Calori Per Gram:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 122, 23));
        jPanel6.add(txtmealname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 135, -1));
        jPanel6.add(txtcaloripergram, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 135, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("ADD Meal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, 30));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD Exercize", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("ADD Exercize");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 150, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Calori BurnPer min :");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 23));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Exercize Name:");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 138, 21));
        jPanel8.add(txtexercisename, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 127, -1));
        jPanel8.add(txtcaloriburn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 127, -1));

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("All Information"));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        tableallinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Date", "Gender", "Age", "Number", "Before EX. Weight", "After Ex. Weight", "Weight Change"
            }
        ));
        jScrollPane1.setViewportView(tableallinfo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Details", jPanel2);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Exercise Name");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Calori Burn Rate");

        jTextField14.setEditable(false);

        jTextField19.setEditable(false);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Meal Name");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Caloric Per Gram");

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Meal Update");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("Exercise Update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jtableexercise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exercise Name", "Burn Calori Per Min"
            }
        ));
        jtableexercise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableexerciseMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtableexercise);

        jtablemeal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meal Name", "Calori Per Gram"
            }
        ));
        jtablemeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablemealMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jtablemeal);

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("Delate Meal");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("Delate Exercise");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jTextField18))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel9))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField15)
                            .addComponent(jTextField14)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)))
                .addGap(35, 35, 35))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                        .addGap(2, 2, 2))
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Update", jPanel14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public void info(){
    
        try {
        DefaultTableModel model = (DefaultTableModel)tableallinfo.getModel();
        String sqla = "SELECT * FROM registation, exercise_record WHERE registation.email = exercise_record.email";            
        ResultSet ts = d.statement.executeQuery(sqla);
        Object[] tc = new Object[8];
                    while(ts.next()){
                        String Email= ts.getString("email");
                        String Gender = ts.getString("gender");
                        String Age = ts.getString("age");
                        String number = ts.getString("number");
                        String PWeight = ts.getString("averageWeight");
                        String Lweight= ts.getString("AfterExerciseWeight");
                        String ChangeWeight = ts.getString("weightChange");
                        String Date = ts.getString("date");
                        
                        tc[0] = Email;
                        tc[1] = Date;
                        tc[2] = Gender;
                        tc[3] = Age;
                        tc[4] = number;
                        tc[5] = PWeight;
                        tc[6] = Lweight;
                        tc[7] = ChangeWeight;
                        
                        model.addRow(tc);
                       }
      
        } catch (Exception e) {
            
           JOptionPane.showMessageDialog(null, "Failed");
        }
        try {
        DefaultTableModel model = (DefaultTableModel)jtablemeal.getModel();
        String sqla = "SELECT * FROM add_meal";            
        ResultSet ts = d.statement.executeQuery(sqla);
        Object[] tc = new Object[2];
                    while(ts.next()){
                        String meal_name= ts.getString("meal_name");
                        String calori = ts.getString("calori");
                       
                        
                        tc[0] = meal_name;
                        tc[1] = calori;
                        
                        
                        model.addRow(tc);
                       }
      
        } catch (Exception e) {
            
           JOptionPane.showMessageDialog(null, "Failed");
        }
        try {
        DefaultTableModel model = (DefaultTableModel)jtableexercise.getModel();
        String sqla = "SELECT * FROM add_exercise";            
        ResultSet ts = d.statement.executeQuery(sqla);
        Object[] tc = new Object[2];
                    while(ts.next()){
                        String exercise_name= ts.getString("exercise_name");
                        String calori_burn = ts.getString("calori_burn");
                       
                        
                        tc[0] = exercise_name;
                        tc[1] = calori_burn;
                        
                        
                        model.addRow(tc);
                       }
      
        } catch (Exception e) {
            
           JOptionPane.showMessageDialog(null, "Failed");
        }
    
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        String mealname  = txtmealname.getText();
        String calorigram = txtcaloripergram.getText();

        try {
            String Sqlmeal = "INSERT INTO `add_meal`(`meal_name`, `calori`,`email`) VALUES ('"+mealname+"','"+calorigram+"','"+s.UserEmail+"')";
            d.statement.execute(Sqlmeal);
            txtmealname.setText(null);
            txtcaloripergram.setText(null);
            JOptionPane.showMessageDialog(null, "Ok");
            trainar t = new trainar();
            t.setVisible(true);
            this.setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
            
        }
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String exercisename  = txtexercisename.getText();
        String calorigramburn = txtcaloriburn.getText();

        try {
            String Sqlexersize = "INSERT INTO `add_exercise`(`exercise_name`, `calori_burn`,`email`) VALUES ('"+exercisename+"','"+calorigramburn+"','"+s.UserEmail+"')";
            d.statement.execute(Sqlexersize);
            txtexercisename.setText(null);
            txtcaloriburn.setText(null);
            JOptionPane.showMessageDialog(null, "Ok");
            trainar t = new trainar();
            t.setVisible(true);
            this.setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        log_in i = new log_in();
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        try {
            


                    String a = jTextField19.getText();
                    String b = jTextField18.getText();
                    String sql2 ="UPDATE `add_meal` SET `calori`='"+b+"' WHERE `meal_name`='"+a+"'";
                    d.statement.executeUpdate(sql2);
                    System.out.println(sql2);
                    
                    JOptionPane.showMessageDialog(null, "ok");
                    
            

        } 
            
                    catch (SQLException ex) {
                    Logger.getLogger(trainar.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
            try {
            
            DefaultTableModel mdlInv = (DefaultTableModel)jtablemeal.getModel();
            if(jtablemeal.getModel().getRowCount()>0){
                if(jtablemeal.getSelectedRowCount()==1){
                    int rowIndex = jtablemeal.getSelectedRow();
                    String meal_Name = jtablemeal.getModel().getValueAt(rowIndex,0).toString();
                    String calori = jtablemeal.getModel().getValueAt(rowIndex,1).toString();
                    jTextField18.setText(calori);
                    jTextField19.setText(meal_Name);
                    String a = jTextField19.getText();
                    
                    String sql2 ="DELETE FROM `add_meal` WHERE `meal_name`='"+a+"'";
                    d.statement.executeUpdate(sql2);
                    System.out.println(sql2);
                    
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);
            
                } 
                else{
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } 
            
                    catch (SQLException ex) {
                    Logger.getLogger(trainar.class.getName()).log(Level.SEVERE, null, ex);
            
        }
     
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jtablemealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablemealMouseClicked

            DefaultTableModel mdlInv = (DefaultTableModel)jtablemeal.getModel();
            if(jtablemeal.getModel().getRowCount()>0){
                if(jtablemeal.getSelectedRowCount()==1){
                    int rowIndex = jtablemeal.getSelectedRow();
                    String meal_Name = jtablemeal.getModel().getValueAt(rowIndex,0).toString();
                    String calori = jtablemeal.getModel().getValueAt(rowIndex,1).toString();
                    jTextField18.setText(calori);
                    jTextField19.setText(meal_Name);
                    
      }  
    }//GEN-LAST:event_jtablemealMouseClicked
    }
    private void jtableexerciseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableexerciseMouseClicked
        
             DefaultTableModel mdlInv = (DefaultTableModel)jtableexercise.getModel();
            if(jtableexercise.getModel().getRowCount()>0){
                if(jtableexercise.getSelectedRowCount()==1){
                    int rowIndex = jtableexercise.getSelectedRow();
                    String exercise_Name = jtableexercise.getModel().getValueAt(rowIndex,0).toString();
                    String calori = jtableexercise.getModel().getValueAt(rowIndex,1).toString();
                    jTextField15.setText(calori);
                    jTextField14.setText(exercise_Name);
                }
        
    }//GEN-LAST:event_jtableexerciseMouseClicked
    }
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        
        
        try {
            

                    String a = jTextField14.getText();
                    String b = jTextField15.getText();
                    String sql2 ="UPDATE `add_exercise` SET `calori_burn`='"+b+"' WHERE `exercise_name`='"+a+"'";
                    d.statement.executeUpdate(sql2);
                    System.out.println(sql2);
                    
                    JOptionPane.showMessageDialog(null, "ok");

        } 
            
                    catch (SQLException ex) {
                    Logger.getLogger(trainar.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                
        try {
            
            DefaultTableModel mdlInv = (DefaultTableModel)jtableexercise.getModel();
            if(jtableexercise.getModel().getRowCount()>0){
                if(jtableexercise.getSelectedRowCount()==1){
                    int rowIndex = jtableexercise.getSelectedRow();
                    String exercise_Name = jtableexercise.getModel().getValueAt(rowIndex,0).toString();
                    String calori = jtableexercise.getModel().getValueAt(rowIndex,1).toString();
                    
                    jTextField15.setText(calori);
                    jTextField14.setText(exercise_Name);
                    String a = jTextField14.getText();
                    
                    String sql2 ="DELETE FROM `add_exercise` WHERE `exercise_name`='"+a+"'";
                    d.statement.executeUpdate(sql2);
                    System.out.println(sql2);
                    
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);
            
                } 
                else{
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } 
            
                    catch (SQLException ex) {
                    Logger.getLogger(trainar.class.getName()).log(Level.SEVERE, null, ex);
            
        }
     
    }//GEN-LAST:event_jButton8ActionPerformed
    
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
            java.util.logging.Logger.getLogger(trainar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trainar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trainar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trainar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trainar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTable jtableexercise;
    private javax.swing.JTable jtablemeal;
    private javax.swing.JTable tableallinfo;
    private javax.swing.JTextField txtcaloriburn;
    private javax.swing.JTextField txtcaloripergram;
    private javax.swing.JTextField txtexercisename;
    private javax.swing.JTextField txtmealname;
    // End of variables declaration//GEN-END:variables
}
