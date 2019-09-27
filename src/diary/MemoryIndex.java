/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diary;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author root
 */
public class MemoryIndex extends javax.swing.JFrame {

    /**
     * Creates new form MemoryIndex
     */
    public MemoryIndex() {
        initComponents();
        getContentPane().setBackground(Color.black);
        fetchResultForTable();
    }
    
    public void fetchResultForTable()
    {
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String host = "jdbc:sqlserver://localhost:61271";
        String username = "sa";
        String password = "alvi";
        try
        {
            //connect database and fetch result
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(host, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM diary.dbo.memoryAll");
            //add row to table - according to result
            DefaultTableModel defaultTableModel = (DefaultTableModel) resultTable.getModel();
            while(resultSet.next())
            {
                int memoryID = resultSet.getInt("memoryID");
                String memoryName = resultSet.getString("memoryName");
                defaultTableModel.addRow(new Object[]{memoryID,memoryName});
            }
            //close all
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog
            (this,
             "Error code : "+sqlException.getErrorCode()+"\n"+
             "Error message : "+sqlException.getMessage()+"\n"+
             "SQL state : "+sqlException.getSQLState()+"\n"
            );
        }
        catch (ClassNotFoundException classNotFoundException) 
        {
            classNotFoundException.printStackTrace();
            JOptionPane.showMessageDialog
            (this,
             "Error message : "+classNotFoundException.getMessage()+"\n"
            );
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        memoryLabel = new javax.swing.JLabel();
        resultTableScrollPane = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        backToMenuButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        memoryDetailsLabel = new javax.swing.JLabel();
        memoryIDLabel = new javax.swing.JLabel();
        memoryIdInputTextField = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        memoryLabel.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        memoryLabel.setForeground(new java.awt.Color(255, 51, 153));
        memoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memoryLabel.setText("YOUR MEMORIES HERE");

        resultTableScrollPane.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N

        resultTable.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "memoryID", "memoryName"
            }
        ));
        resultTableScrollPane.setViewportView(resultTable);

        backToMenuButton.setBackground(new java.awt.Color(0, 0, 0));
        backToMenuButton.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        backToMenuButton.setForeground(new java.awt.Color(0, 255, 0));
        backToMenuButton.setText("BACK TO MENU");
        backToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 255, 0));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        memoryDetailsLabel.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        memoryDetailsLabel.setForeground(new java.awt.Color(0, 255, 0));
        memoryDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memoryDetailsLabel.setText("TO INSERT NEW MEMORIES,");

        memoryIDLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        memoryIDLabel.setForeground(new java.awt.Color(255, 255, 0));
        memoryIDLabel.setText("MEMORY ID : ");

        memoryIdInputTextField.setBackground(new java.awt.Color(0, 0, 0));
        memoryIdInputTextField.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        memoryIdInputTextField.setForeground(new java.awt.Color(0, 255, 0));
        memoryIdInputTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        goButton.setBackground(new java.awt.Color(0, 0, 0));
        goButton.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        goButton.setForeground(new java.awt.Color(0, 255, 0));
        goButton.setText("GO");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATE OR DELETE OLD MEMORIES,");

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FIND YOUR 'ID'  NUMBER FROM ABOVE TABLE");

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("THEN INSERT BELOW AND PRESS 'GO'  TO CONTINUE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backToMenuButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memoryDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(memoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(memoryIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(memoryIdInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(memoryLabel)
                .addGap(18, 18, 18)
                .addComponent(resultTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(memoryDetailsLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memoryIdInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goButton)
                    .addComponent(memoryIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backToMenuButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        // TODO add your handling code here:
        int memoryID = Integer.parseInt(memoryIdInputTextField.getText());
        this.setVisible(false);
        MemoryDetails memoryDetails = new MemoryDetails(memoryID);
        memoryDetails.setVisible(true);
    }//GEN-LAST:event_goButtonActionPerformed

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_backToMenuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MemoryIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoryIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoryIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoryIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoryIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel memoryDetailsLabel;
    private javax.swing.JLabel memoryIDLabel;
    private javax.swing.JTextField memoryIdInputTextField;
    private javax.swing.JLabel memoryLabel;
    private javax.swing.JTable resultTable;
    private javax.swing.JScrollPane resultTableScrollPane;
    // End of variables declaration//GEN-END:variables
}