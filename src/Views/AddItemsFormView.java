/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Antonio
 */
public class AddItemsFormView extends javax.swing.JFrame {

    JTable tabla;
    DefaultTableModel dtm;

    /**
     * Creates new form FormAddElement
     */
    public AddItemsFormView(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setLocationRelativeTo(null); //Centrar la ventana en pantalla
        this.setTitle("Formulario de Registros de Transacciones");
        this.setResizable(false); // Hacemos que la ventana no sea redimiensionable
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // configuramos los componentes

        String tipo[] = {"", "EE", "SE", "CE", "GLI", "GLE"}; // opciones del tipo de transaccion
        for (int i = 0; i < tipo.length; i++) {
            transactionChoice.add(tipo[i]);
        }

        dtm = new DefaultTableModel();
        tabla = this.jTable;
        tabla.setModel(dtm);
        String columNames[] = {"EE", "SE", "CE", "GLI", "GLE"};
        dtm.setColumnIdentifiers(new Object[]{"Descripción", "Sencilla", "Media", "Compleja", "Total PF"});
        dtm.setNumRows(5);
        for (int i = 0; i < dtm.getRowCount(); i++) {
            dtm.setValueAt(columNames[i], i, 0);
        }
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer(); //alinear al centro 
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < dtm.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
        
        //Sencillas
        dtm.setValueAt(" x 3 ", 0, 1);
        dtm.setValueAt(" x 4 ", 1, 1);
        dtm.setValueAt(" x 7 ", 2, 1);
        dtm.setValueAt(" x 5 ", 3, 1);
        dtm.setValueAt(" x 3 ", 4, 1);

        //Media
        dtm.setValueAt(" x 4 ", 0, 2);
        dtm.setValueAt(" x 5 ", 1, 2);
        dtm.setValueAt(" x 10 ", 2, 2);
        dtm.setValueAt(" x 7 ", 3, 2);
        dtm.setValueAt(" x 4", 4, 2);

        //Compleja
        dtm.setValueAt(" x 6 ", 0, 3);
        dtm.setValueAt(" x 7 ", 1, 3);
        dtm.setValueAt(" x 15 ", 2, 3);
        dtm.setValueAt(" x 10 ", 3, 3);
        dtm.setValueAt(" x 6 ", 4, 3);

        //Totales PF
        dtm.setValueAt("  ", 0, 4);
        dtm.setValueAt("  ", 1, 4);
        dtm.setValueAt("  ", 2, 4);
        dtm.setValueAt("  ", 3, 4);
        dtm.setValueAt("  ", 4, 4);
    }
    
    public String getDenominacion(){
        return textFieldDenominacion.getText();
    }
    
    public String getTipo(){
        return transactionChoice.getSelectedItem();
    }
    
    public String getNumDatosElementales(){
        return textFieldNumData.getText();
    }
    
    public String getNumFicheros(){
        return textFieldNumFiles.getText();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        textFieldDenominacion = new java.awt.TextField();
        denominacionLabel = new javax.swing.JLabel();
        transactionLabel = new javax.swing.JLabel();
        transactionChoice = new java.awt.Choice();
        numFilesLabel = new javax.swing.JLabel();
        textFieldNumFiles = new java.awt.TextField();
        textFieldNumData = new java.awt.TextField();
        numDataLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();
        resumeLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pfnajLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 102));

        titleLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Añadir Transación");

        textFieldDenominacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldDenominacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDenominacionActionPerformed(evt);
            }
        });

        denominacionLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        denominacionLabel.setText("Denominación");

        transactionLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        transactionLabel.setText("Tipo de Transacción");

        numFilesLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numFilesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numFilesLabel.setText("Número de Ficheros / Tipo de Registros");

        textFieldNumFiles.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldNumFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumFilesActionPerformed(evt);
            }
        });

        textFieldNumData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldNumData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumDataActionPerformed(evt);
            }
        });

        numDataLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numDataLabel.setText("Número de Datos Elementales");

        addButton.setBackground(new java.awt.Color(51, 204, 0));
        addButton.setText("Grabar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        resumeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resumeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resumeLabel.setText("Resumen");

        cancelButton.setBackground(new java.awt.Color(255, 51, 51));
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable);
        jTable.getAccessibleContext().setAccessibleParent(jTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOTAL PUNTOS FUNCIÓN NO AJUSTADOS (PFNA)");

        pfnajLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separator)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(resumeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(226, 226, 226))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(numDataLabel)
                                    .addGap(68, 68, 68)
                                    .addComponent(textFieldNumData, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(392, 392, 392)
                                    .addComponent(addButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cancelButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(denominacionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(transactionLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(transactionChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(numFilesLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldNumFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pfnajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(denominacionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numFilesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNumFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numDataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNumData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(cancelButton))
                .addGap(18, 18, 18)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resumeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pfnajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(290, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldDenominacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDenominacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDenominacionActionPerformed

    private void textFieldNumFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumFilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumFilesActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // Evento del botón grabar 

        if (transactionChoice.getSelectedItem().equals("") || textFieldDenominacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void textFieldNumDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumDataActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // Evento del botón Cancelar

        this.hide();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddItemsFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItemsFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItemsFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItemsFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                AddItemsFormView addItemsFromView = new AddItemsFormView(new javax.swing.JFrame(), true);

                addItemsFromView.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });

                addItemsFromView.setVisible(true); // hacemos visible la ventana

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel denominacionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel numDataLabel;
    private javax.swing.JLabel numFilesLabel;
    private javax.swing.JLabel pfnajLabel;
    private javax.swing.JLabel resumeLabel;
    private java.awt.TextField textFieldDenominacion;
    private java.awt.TextField textFieldNumData;
    private java.awt.TextField textFieldNumFiles;
    private javax.swing.JLabel titleLabel;
    private java.awt.Choice transactionChoice;
    private javax.swing.JLabel transactionLabel;
    // End of variables declaration//GEN-END:variables
}