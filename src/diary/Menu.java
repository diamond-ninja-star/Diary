/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diary;

import java.awt.Color;

/**
 *
 * @author root
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    public Menu() 
    {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        makeAllRadioButtonsUnset();
    }
    
    public void makeAllRadioButtonsUnset()
    {
        displayRadioButton.setSelected(false);
        insertRadioButton.setSelected(false);
        updateRadioButton.setSelected(false);
        deleteRadioButton.setSelected(false);
        searchRadioButton.setSelected(false);
    }
    /*
    public void makeOtherRadioButtonsUnset()
    {
        if(displayRadioButton.isSelected())
        {
            //displayRadioButton.setSelected(false);
            insertRadioButton.setSelected(false);
            updateRadioButton.setSelected(false);
            deleteRadioButton.setSelected(false);
            searchRadioButton.setSelected(false);
        }
        else if(insertRadioButton.isSelected())
        {
            displayRadioButton.setSelected(false);
            //insertRadioButton.setSelected(false);
            updateRadioButton.setSelected(false);
            deleteRadioButton.setSelected(false);
            searchRadioButton.setSelected(false);
        }
        else if(updateRadioButton.isSelected())
        {
            displayRadioButton.setSelected(false);
            insertRadioButton.setSelected(false);
            //updateRadioButton.setSelected(false);
            deleteRadioButton.setSelected(false);
            searchRadioButton.setSelected(false);
        }
        else if(deleteRadioButton.isSelected())
        {
            displayRadioButton.setSelected(false);
            insertRadioButton.setSelected(false);
            updateRadioButton.setSelected(false);
            //deleteRadioButton.setSelected(false);
            searchRadioButton.setSelected(false);
        }
        else if(searchRadioButton.isSelected())
        {
            displayRadioButton.setSelected(false);
            insertRadioButton.setSelected(false);
            updateRadioButton.setSelected(false);
            deleteRadioButton.setSelected(false);
            //searchRadioButton.setSelected(false);
        }
    }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuLabel = new javax.swing.JLabel();
        displayRadioButton = new javax.swing.JRadioButton();
        insertRadioButton = new javax.swing.JRadioButton();
        deleteRadioButton = new javax.swing.JRadioButton();
        updateRadioButton = new javax.swing.JRadioButton();
        searchRadioButton = new javax.swing.JRadioButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuLabel.setBackground(new java.awt.Color(51, 51, 51));
        menuLabel.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(0, 153, 255));
        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel.setText("MENU");

        displayRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        displayRadioButton.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        displayRadioButton.setForeground(new java.awt.Color(255, 0, 102));
        displayRadioButton.setText("DISPLAY MEMORY");
        displayRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayRadioButtonActionPerformed(evt);
            }
        });

        insertRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        insertRadioButton.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        insertRadioButton.setForeground(new java.awt.Color(51, 204, 0));
        insertRadioButton.setText("INSERT MEMORY");
        insertRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insertRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertRadioButtonActionPerformed(evt);
            }
        });

        deleteRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        deleteRadioButton.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        deleteRadioButton.setForeground(new java.awt.Color(0, 255, 255));
        deleteRadioButton.setText("DELETE MEMORY");
        deleteRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRadioButtonActionPerformed(evt);
            }
        });

        updateRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        updateRadioButton.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        updateRadioButton.setForeground(new java.awt.Color(255, 0, 255));
        updateRadioButton.setText("UPDATE MEMORY");
        updateRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRadioButtonActionPerformed(evt);
            }
        });

        searchRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        searchRadioButton.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        searchRadioButton.setForeground(new java.awt.Color(255, 153, 0));
        searchRadioButton.setText("SEARCH MEMORY");
        searchRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRadioButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(51, 51, 51));
        exitButton.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 0));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(insertRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayRadioButton)
                .addGap(18, 18, 18)
                .addComponent(insertRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteRadioButton)
                .addGap(18, 18, 18)
                .addComponent(updateRadioButton)
                .addGap(18, 18, 18)
                .addComponent(searchRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void displayRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayRadioButtonActionPerformed
       // TODO add your handling code here:
       makeAllRadioButtonsUnset();
       this.setVisible(false);
       MemoryIndex memoryIndex = new MemoryIndex();
       memoryIndex.setVisible(true);
    }//GEN-LAST:event_displayRadioButtonActionPerformed

    private void insertRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertRadioButtonActionPerformed
       // TODO add your handling code here:
       makeAllRadioButtonsUnset();
       this.setVisible(false);
       MemoryInsert memoryInsert = new MemoryInsert();
       memoryInsert.setVisible(true);
    }//GEN-LAST:event_insertRadioButtonActionPerformed

    private void deleteRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRadioButtonActionPerformed
        // TODO add your handling code here:
       makeAllRadioButtonsUnset();
       this.setVisible(false);
       MemoryIndex memoryIndex = new MemoryIndex();
       memoryIndex.setVisible(true);
    }//GEN-LAST:event_deleteRadioButtonActionPerformed

    private void updateRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRadioButtonActionPerformed
        // TODO add your handling code here:
       makeAllRadioButtonsUnset();
       this.setVisible(false);
       MemoryIndex memoryIndex = new MemoryIndex();
       memoryIndex.setVisible(true);
    }//GEN-LAST:event_updateRadioButtonActionPerformed

    private void searchRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRadioButtonActionPerformed
        // TODO add your handling code here:
        makeAllRadioButtonsUnset();
        this.setVisible(false);
        MemorySearch memorySearch = new MemorySearch();
        memorySearch.setVisible(true);
    }//GEN-LAST:event_searchRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton deleteRadioButton;
    private javax.swing.JRadioButton displayRadioButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton insertRadioButton;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JRadioButton searchRadioButton;
    private javax.swing.JRadioButton updateRadioButton;
    // End of variables declaration//GEN-END:variables
}
