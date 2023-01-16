/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author dnlal
 */
public class EditCityFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditCityFrame
     */
    public EditCityFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TextoSignupLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnAddCity = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNewCityName = new javax.swing.JTextField();
        btnChangeNameCity = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        FirstName_field2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnRemoveCity = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoSignupLabel.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        TextoSignupLabel.setText("Edición de ciudad");
        jPanel2.add(TextoSignupLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 360, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        txtCityName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCityName.setForeground(new java.awt.Color(153, 153, 153));
        txtCityName.setBorder(null);
        txtCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtCityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 220, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 210, 10));

        btnAddCity.setText("Agregar");
        btnAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCityActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nombre: ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, 30));

        txtNewCityName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNewCityName.setForeground(new java.awt.Color(153, 153, 153));
        txtNewCityName.setBorder(null);
        txtNewCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewCityNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtNewCityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 220, 30));

        btnChangeNameCity.setText("Cambiar nombre");
        btnChangeNameCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeNameCityActionPerformed(evt);
            }
        });
        jPanel2.add(btnChangeNameCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Nuevo nombre:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, 30));

        FirstName_field2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        FirstName_field2.setForeground(new java.awt.Color(153, 153, 153));
        FirstName_field2.setBorder(null);
        FirstName_field2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_field2ActionPerformed(evt);
            }
        });
        jPanel2.add(FirstName_field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 220, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 210, 10));

        btnRemoveCity.setText("Eliminar");
        btnRemoveCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveCityActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemoveCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Editar nombre: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 280, 380));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityNameActionPerformed

    private void btnAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCityActionPerformed

    private void txtNewCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewCityNameActionPerformed

    private void btnChangeNameCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeNameCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeNameCityActionPerformed

    private void FirstName_field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_field2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName_field2ActionPerformed

    private void btnRemoveCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveCityActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        EditStateFrame stateFrame= new EditStateFrame();
        stateFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(EditCityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCityFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstName_field2;
    private javax.swing.JLabel TextoSignupLabel;
    private javax.swing.JButton btnAddCity;
    private javax.swing.JButton btnChangeNameCity;
    private javax.swing.JButton btnRemoveCity;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtNewCityName;
    // End of variables declaration//GEN-END:variables
}
