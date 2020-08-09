/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.view;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author RUKHSAR-JAMADAR
 */
public class Add_Patient extends javax.swing.JFrame {
           static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";          //declaration of static variable JDBC_DRIVER and value initialized to it
    static final String DB_URL = "jdbc:mysql://localhost:3307/db_hospital"; //declaration of static variable DB_URL,databse path initialized to it
    //Database Credentials
    static final String USER = "root";                                  //declaration of static variable USER and value initialized to it
    static final String PASS = "";
    static Connection conn;
    static PreparedStatement pst=null;

    /**
     * Creates new form Add_Patient
     */
    public Add_Patient() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name_f = new javax.swing.JTextField();
        Dis_f = new javax.swing.JTextField();
        status_f = new javax.swing.JTextField();
        age_f = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setText("**Add Patient Details**");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Disease:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Gender:");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        rb1.setText("Male");
        rb1.setToolTipText("");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        rb2.setText("Female");
        rb2.setToolTipText("");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        rb3.setText("Other");
        rb3.setToolTipText("");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        getContentPane().add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Admit_status:");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Age:");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        name_f.setText("jTextField1");
        getContentPane().add(name_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        Dis_f.setText("jTextField2");
        getContentPane().add(Dis_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        status_f.setText("jTextField3");
        getContentPane().add(status_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        age_f.setText("jTextField4");
        getContentPane().add(age_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 102));
        jButton2.setText("ADD");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
             Class.forName(JDBC_DRIVER);
         conn=DriverManager.getConnection(DB_URL,USER,PASS);
         String name=name_f.getText().toString();
         String disease=Dis_f.getText().toString();
         String status=status_f.getText();
         String age=age_f.getText();
         
    
         name_f.setText(name);
         Dis_f.setText(disease);
         status_f.setText(status);
         age_f.setText(age);
         
         
         String selection=null;
         if(rb1.isSelected())
         {
             selection="Male";
         }
          if(rb2.isSelected())
         {
             selection="Female";
         }
        
          if(rb3.isSelected())
         {
             selection="Other";
         }
         String sql="INSERT INTO `patients_tbl`( `name`, `disease`, `gender`, `admit_status`, `age`) VALUES('"+name+"','"+disease+"','"+selection+"','"+status+"','"+age+"')";
         pst=conn.prepareStatement(sql);
        pst.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Patients deatils recorded Sucessfully!!");
        
         
        
         
         
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);
        
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
        if(rb1.isSelected())
        {
            rb2.setSelected(false);
            rb3.setSelected(false);
        }
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
        if(rb2.isSelected())
        {
            rb1.setSelected(false);
            rb3.setSelected(false);
        }
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        // TODO add your handling code here:
        if(rb3.isSelected())
        {
            rb1.setSelected(false);
            rb2.setSelected(false);
        }
    }//GEN-LAST:event_rb3ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Dis_f;
    private javax.swing.JTextField age_f;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name_f;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JTextField status_f;
    // End of variables declaration//GEN-END:variables
}
