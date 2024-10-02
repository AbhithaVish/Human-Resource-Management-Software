package hr.management.software;
import java.io.*;
import javax.swing.JOptionPane;
public class ManagerUserAdd extends javax.swing.JFrame {
    File myFile;
    public ManagerUserAdd() {
        initComponents();
        try {
            myFile = new File ("D:\\HR Management Software\\UserDetails\\Login Data Form.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created:" + myFile.getName());
            } 
            
            else{
                System.out.println("File is already exists.");
            }
        }
        
        catch(IOException e) {
            System.err.println("An error occurred creating file"+e);
            
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnEmployee2 = new javax.swing.JButton();
        btnHome2 = new javax.swing.JButton();
        btnSallery2 = new javax.swing.JButton();
        btnDepartments3 = new javax.swing.JButton();
        btnLogout2 = new javax.swing.JButton();
        backmenu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbUserType = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        btnRegister123 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEmployee = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnSallery = new javax.swing.JButton();
        btnDepartments1 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(251, 683));

        btnEmployee2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnEmployee2.setText("Employee");
        btnEmployee2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployee2ActionPerformed(evt);
            }
        });

        btnHome2.setBackground(new java.awt.Color(51, 51, 51));
        btnHome2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnHome2.setForeground(new java.awt.Color(255, 255, 255));
        btnHome2.setText("Home");
        btnHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome2ActionPerformed(evt);
            }
        });

        btnSallery2.setBackground(new java.awt.Color(51, 51, 51));
        btnSallery2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnSallery2.setForeground(new java.awt.Color(255, 255, 255));
        btnSallery2.setText("Sallery ");
        btnSallery2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSallery2ActionPerformed(evt);
            }
        });

        btnDepartments3.setBackground(new java.awt.Color(51, 51, 51));
        btnDepartments3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnDepartments3.setForeground(new java.awt.Color(255, 255, 255));
        btnDepartments3.setText("Department");
        btnDepartments3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartments3ActionPerformed(evt);
            }
        });

        btnLogout2.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnLogout2.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout2.setText("Log out");
        btnLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmployee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSallery2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDepartments3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmployee2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSallery2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDepartments3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backmenu.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        backmenu.setText("Back To Menu");
        backmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backmenuActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel3.setText("User ID");

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel4.setText("Password");

        txtUserID.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        txtUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel6.setText("Profile Type");

        cmbUserType.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assitant" }));
        cmbUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUserTypeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel7.setText("Confirm Password");

        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });

        btnRegister123.setBackground(new java.awt.Color(51, 51, 255));
        btnRegister123.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        btnRegister123.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister123.setText("Register");
        btnRegister123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister123ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Dubai Medium", 1, 48)); // NOI18N
        jLabel53.setText("Add Assistant");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPackage/add user mini icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(158, 158, 158)
                        .addComponent(txtUserID))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(141, 141, 141)
                        .addComponent(txtPassword))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(75, 75, 75)
                        .addComponent(txtConfirmPassword))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(121, 121, 121)
                        .addComponent(cmbUserType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnRegister123, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnRegister123)
                .addGap(276, 276, 276))
        );

        jPanel25.setBackground(new java.awt.Color(0, 0, 0));

        jLabel49.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Colombo Institue of Studies");

        jLabel50.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Add Users Menu");

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPackage/logo ico.png"))); // NOI18N

        jPanel26.setBackground(new java.awt.Color(51, 51, 51));

        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPackage/menu icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(0, 469, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel50)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(251, 683));

        btnEmployee.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPackage/employee icon.png"))); // NOI18N
        btnEmployee.setText("Employee");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(51, 51, 51));
        btnHome.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPackage/home Icon.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnSallery.setBackground(new java.awt.Color(51, 51, 51));
        btnSallery.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnSallery.setForeground(new java.awt.Color(255, 255, 255));
        btnSallery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPackage/Sallery icon.png"))); // NOI18N
        btnSallery.setText("Sallery ");
        btnSallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalleryActionPerformed(evt);
            }
        });

        btnDepartments1.setBackground(new java.awt.Color(51, 51, 51));
        btnDepartments1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnDepartments1.setForeground(new java.awt.Color(255, 255, 255));
        btnDepartments1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPackage/department icon.png"))); // NOI18N
        btnDepartments1.setText("Department");
        btnDepartments1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartments1ActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPackage/exit icon.png"))); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSallery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDepartments1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSallery, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDepartments1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIDActionPerformed

    private void cmbUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUserTypeActionPerformed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void btnRegister123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister123ActionPerformed
         try
     {
      boolean valid=true;  
     if( txtUserID.getText().isEmpty() || txtPassword.getText().isEmpty() || txtConfirmPassword.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Field Cannot be blank ",
            "User Profile Management",JOptionPane.ERROR_MESSAGE);	
         valid=false;
        } 
     else{
     if(txtPassword.getText().length()<3)
     {
     JOptionPane.showMessageDialog(null, "Password must have 8 characters", "User Profile Management",JOptionPane.ERROR_MESSAGE);
     valid = false;
     }
     else if(!txtPassword.getText().equals(txtConfirmPassword.getText().toString()))
     {
     JOptionPane.showMessageDialog(null, "Password and confirm password should match","User Profile Management",JOptionPane.ERROR_MESSAGE);
     valid = false;
        }
     }
     if(valid) 
     {
        String UserId=txtUserID.getText();
       String Password=txtPassword.getText(); 
       String UserType=cmbUserType.getSelectedItem().toString();
          
       String Record=UserId +" "+Password+" "+UserType;
       
          FileWriter fileWriter = new FileWriter(myFile,true);  
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);  
          
     if(IdSpace())
        {
            JOptionPane.showMessageDialog(rootPane,"Id is alredy Available",
                    "User Profile Management",JOptionPane.ERROR_MESSAGE);
        }
     else
     {
            bufferedWriter.write(Record);  
            bufferedWriter.newLine(); 
            bufferedWriter.close();  
            fileWriter.close();   

        JOptionPane.showMessageDialog(null,"User Profile Added Successfully.");
       }
     }
     }
       catch(IOException ex)
       {
           System.err.println("File Saving Failed!!!"+ex);
       }
    }//GEN-LAST:event_btnRegister123ActionPerformed

    private void backmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backmenuActionPerformed
        // TODO add your handling code here:
        ManagerHome DisplayPage = new ManagerHome();
        DisplayPage.show();
        this.dispose();
    }//GEN-LAST:event_backmenuActionPerformed

    private void btnEmployee2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployee2ActionPerformed
        // TODO add your handling code here:
        ManagerEmployee DisplayPage = new ManagerEmployee();
        DisplayPage.show();
        this.dispose();
    }//GEN-LAST:event_btnEmployee2ActionPerformed

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed
        ManagerHome DisplayPage = new ManagerHome();
        DisplayPage.show();
        this.dispose();
    }//GEN-LAST:event_btnHome2ActionPerformed

    private void btnSallery2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSallery2ActionPerformed
        ManagerSalary DisplayPage = new ManagerSalary();
        DisplayPage.show();
        this.dispose();
    }//GEN-LAST:event_btnSallery2ActionPerformed

    private void btnDepartments3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartments3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepartments3ActionPerformed

    private void btnLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout2ActionPerformed
        LoginScreen DisplayPage=new LoginScreen();
        DisplayPage.show();
        this.dispose();
    }//GEN-LAST:event_btnLogout2ActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
        ManagerEmployee DisplayPage = new ManagerEmployee();
        DisplayPage.show();
        this.dispose();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        ManagerHome DisplayPage = new ManagerHome();
        DisplayPage.show();
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSalleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalleryActionPerformed
        ManagerSalary DisplayPage = new ManagerSalary();
        DisplayPage.show();
        this.dispose();
    }//GEN-LAST:event_btnSalleryActionPerformed

    private void btnDepartments1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartments1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepartments1ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginScreen DisplayPage=new LoginScreen();
        DisplayPage.show();
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    public boolean IdSpace()
    {
         boolean IdFound=false;
    try
              {    
      String[] space=null;  //Intialize the word Array
      FileReader fileReader = new FileReader(myFile);  //Creation of File Reader object
      BufferedReader bufferedReader = new BufferedReader(fileReader); //Creation of BufferedReader object
      String Found;     
      String input=txtUserID.getText();   // Input word to be searched
        
      while((Found=bufferedReader.readLine())!=null)   //Reading Content from the file
      {
         space=Found.split(" ");  //Split the word using space
          for (String word : space) 
          {
                 if (word.equals(input))   //Search for the given word
                 {
                 IdFound=true;               
                 }             
          }        
      }    
         bufferedReader.close();
         fileReader.close();
              }    
    catch (IOException e) {
      System.out.println("An error occurred searching Id."+e);
    } 
    return IdFound;        
    }
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
            java.util.logging.Logger.getLogger(ManagerUserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerUserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerUserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerUserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerUserAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backmenu;
    private javax.swing.JButton btnDepartments1;
    private javax.swing.JButton btnDepartments3;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnEmployee2;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome2;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLogout2;
    private javax.swing.JButton btnRegister123;
    private javax.swing.JButton btnSallery;
    private javax.swing.JButton btnSallery2;
    private javax.swing.JComboBox cmbUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
