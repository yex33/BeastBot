/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author joe
 */
public class BeastBot extends javax.swing.JFrame {

    /**
     * Creates new form BeastBot
     */
    public BeastBot() {
        initComponents();
        finalProject = new FinalProject();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfigurationWindow = new javax.swing.JFrame();
        ImportButton = new javax.swing.JButton();
        ExportButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        OKButton = new javax.swing.JButton();
        NumberOfKeysLable = new javax.swing.JLabel();
        NumberOfKeysSpinner = new javax.swing.JSpinner();
        KeysComboBox = new javax.swing.JComboBox<>();
        KeyCoordinatesLable = new javax.swing.JLabel();
        ProgramName = new javax.swing.JLabel();
        StartButton = new javax.swing.JToggleButton();
        QuitButton = new javax.swing.JButton();
        ConfigButton = new javax.swing.JButton();

        ConfigurationWindow.setTitle("Configurations");
        ConfigurationWindow.setUndecorated(true);
        ConfigurationWindow.setResizable(false);

        ImportButton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        ImportButton.setText("Import");
        ImportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportButtonActionPerformed(evt);
            }
        });

        ExportButton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        ExportButton.setText("Export");

        CancelButton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        OKButton.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        OKButton.setText("OK");

        NumberOfKeysLable.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        NumberOfKeysLable.setText("Number of Keys");

        NumberOfKeysSpinner.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        NumberOfKeysSpinner.setModel(new javax.swing.SpinnerNumberModel(4, 1, 10, 1));
        NumberOfKeysSpinner.setToolTipText("");
        NumberOfKeysSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                updateNumberOfKeys(evt);
            }
        });

        KeysComboBox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        KeysComboBox.setMaximumRowCount(10);
        KeysComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Key 1", "Key 2", "Key 3", "Key 4" }));
        KeysComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeysComboBoxActionPerformed(evt);
            }
        });

        KeyCoordinatesLable.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        KeyCoordinatesLable.setText("Key Coordinates");

        javax.swing.GroupLayout ConfigurationWindowLayout = new javax.swing.GroupLayout(ConfigurationWindow.getContentPane());
        ConfigurationWindow.getContentPane().setLayout(ConfigurationWindowLayout);
        ConfigurationWindowLayout.setHorizontalGroup(
            ConfigurationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigurationWindowLayout.createSequentialGroup()
                .addGroup(ConfigurationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConfigurationWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NumberOfKeysLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NumberOfKeysSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfigurationWindowLayout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addGroup(ConfigurationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfigurationWindowLayout.createSequentialGroup()
                                .addComponent(KeyCoordinatesLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(KeysComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ConfigurationWindowLayout.createSequentialGroup()
                                .addComponent(ImportButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExportButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(OKButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CancelButton)))))
                .addContainerGap())
        );
        ConfigurationWindowLayout.setVerticalGroup(
            ConfigurationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigurationWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConfigurationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberOfKeysLable)
                    .addComponent(NumberOfKeysSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConfigurationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KeysComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KeyCoordinatesLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(ConfigurationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImportButton)
                    .addComponent(ExportButton)
                    .addComponent(OKButton)
                    .addComponent(CancelButton))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BeastBotMain");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setUndecorated(true);

        ProgramName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ProgramName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProgramName.setText("J.Pow");

        StartButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        StartButton.setText("GO");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        QuitButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        QuitButton.setText("Quit");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });

        ConfigButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ConfigButton.setText("Configurate");
        ConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfigButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(QuitButton)
                    .addComponent(ProgramName)
                    .addComponent(StartButton)
                    .addComponent(ConfigButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProgramName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StartButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(ConfigButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartButtonActionPerformed

    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitButtonActionPerformed

    private void ImportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImportButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        ConfigurationWindow.setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void KeysComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeysComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeysComboBoxActionPerformed

    private void ConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfigButtonActionPerformed
        ConfigurationWindow.setVisible(true);
    }//GEN-LAST:event_ConfigButtonActionPerformed

    private void updateNumberOfKeys(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_updateNumberOfKeys
        int n = (int) NumberOfKeysSpinner.getModel().getValue();
        finalProject.setKEYN(n);
        KeysComboBox.setModel(new KeysComboBoxModel(n));
    }//GEN-LAST:event_updateNumberOfKeys

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
            java.util.logging.Logger.getLogger(BeastBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BeastBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BeastBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BeastBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BeastBot().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfigButton;
    private javax.swing.JFrame ConfigurationWindow;
    private javax.swing.JButton ExportButton;
    private javax.swing.JButton ImportButton;
    private javax.swing.JLabel KeyCoordinatesLable;
    private javax.swing.JComboBox<String> KeysComboBox;
    private javax.swing.JLabel NumberOfKeysLable;
    private javax.swing.JSpinner NumberOfKeysSpinner;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel ProgramName;
    private javax.swing.JButton QuitButton;
    private javax.swing.JToggleButton StartButton;
    // End of variables declaration//GEN-END:variables
    
    private FinalProject finalProject;
    
    class KeysComboBoxModel implements ComboBoxModel<String> {
        
        /**
         * 
         * @param n number of keys will be displayed in the combo box
         */
        public KeysComboBoxModel(int n) {
            keyNames = new String[n];
            for (int i = 0; i < keyNames.length; i++) {
                keyNames[i] = new StringBuffer().append("Key ").append(i + 1).toString();
            }
            selection = null;
            listDataListener = null;
        }

        @Override
        public void setSelectedItem(Object anItem) {
            selection = (String) anItem;
        }

        @Override
        public Object getSelectedItem() {
            return selection;
        }

        @Override
        public int getSize() {
            return keyNames.length;
        }

        @Override
        public String getElementAt(int index) {
            return keyNames[index];
        }

        @Override
        public void addListDataListener(ListDataListener l) {
            listDataListener = l;
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
            listDataListener = null;
        }
        
        private String[] keyNames;
        private String selection;
        private ListDataListener listDataListener;
    }
}