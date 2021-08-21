/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.course.view;

import com.java.course.controller.Controlador;
import com.java.course.model.vo.Requerimiento_1;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicolas
 */
public class GUIConstruction extends javax.swing.JFrame {

    /**
     * Creates new form GUIConstruction
     */
    public GUIConstruction() {
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

        SearchButton = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();
        OptionsTab = new javax.swing.JTabbedPane();
        Req1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ScrollQuery1 = new javax.swing.JScrollPane();
        TableQuery1 = new javax.swing.JTable();
        Req2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Req3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        QueryOptions = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        OptionsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyectos Construcción");
        setMaximumSize(new java.awt.Dimension(3000, 3000));
        setSize(new java.awt.Dimension(550, 300));

        SearchButton.setBackground(new java.awt.Color(254, 254, 254));
        SearchButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(69, 126, 47));
        SearchButton.setText("Buscar");
        SearchButton.setMargin(new java.awt.Insets(1, 3, 1, 3));
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });

        OptionsTab.setToolTipText("");

        Req1.setLayout(new java.awt.BorderLayout());

        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setLabelFor(Req1);
        Title.setText("Proyectos");
        Title.setMaximumSize(new java.awt.Dimension(70, 25));
        Title.setMinimumSize(new java.awt.Dimension(70, 25));
        Req1.add(Title, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setDividerLocation(40);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane1.setTopComponent(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        TableQuery1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Constructora", "Ciudad", "Banco", "Porcentaje", "Clasificación", "Fecha"
            }
        ));
        ScrollQuery1.setViewportView(TableQuery1);

        jPanel2.add(ScrollQuery1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel2);

        Req1.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        OptionsTab.addTab("Requerimiento 1", Req1);

        javax.swing.GroupLayout Req2Layout = new javax.swing.GroupLayout(Req2);
        Req2.setLayout(Req2Layout);
        Req2Layout.setHorizontalGroup(
            Req2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        Req2Layout.setVerticalGroup(
            Req2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );

        OptionsTab.addTab("Requerimiento 2", Req2);

        Req3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Req3.setAlignmentX(0.2F);
        Req3.setAlignmentY(0.2F);
        Req3.setPreferredSize(new java.awt.Dimension(500, 180));

        javax.swing.GroupLayout Req3Layout = new javax.swing.GroupLayout(Req3);
        Req3.setLayout(Req3Layout);
        Req3Layout.setHorizontalGroup(
            Req3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        Req3Layout.setVerticalGroup(
            Req3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );

        OptionsTab.addTab("Requerimiento 3", Req3);

        QueryOptions.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        QueryOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proyecto", "Proveedores", "Cargo" }));

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        OptionsLabel.setText("Seleccione un proyecto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OptionsTab)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QueryOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OptionsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OptionsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QueryOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                .addComponent(OptionsTab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        OptionsTab.getAccessibleContext().setAccessibleName("Requerimiento 1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String selectedOption () {
        
        String selectedValue = QueryOptions.getSelectedItem().toString();
        
        return selectedValue;
    }
    
    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        switch(selectedOption()){
            case "Proyecto":
                OptionsTab.setSelectedIndex(0);
                break;
            case "Proveedores":
                OptionsTab.setSelectedIndex(1);
                break;
            case "Cargo":
                OptionsTab.setSelectedIndex(2);
                break;
            default:
                OptionsTab.setSelectedIndex(0);
                break;
        }
    }//GEN-LAST:event_SearchButtonMouseClicked

    public void updateTableReq1() throws SQLException{
        
        Controlador controller = new Controlador();
        
        ArrayList<Requerimiento_1> list_1 = controller.consultarRequerimiento1();
        
        DefaultTableModel model = (DefaultTableModel) TableQuery1.getModel();
        
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        
        int cols = model.getColumnCount();
        
        for(Requerimiento_1 requerimiento : list_1){
            
            Object[] row = new Object[cols];
            
            row[0] = requerimiento.getConstructora();
            row[1] = requerimiento.getCiudad();
            row[2] = requerimiento.getBanco();
            row[3] = requerimiento.getPorcentaje();
            row[4] = requerimiento.getClasificacion();
            row[5] = requerimiento.getFecha();
            
            model.addRow(row);
        }
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
            java.util.logging.Logger.getLogger(GUIConstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIConstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIConstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIConstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIConstruction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OptionsLabel;
    private javax.swing.JTabbedPane OptionsTab;
    private javax.swing.JComboBox<String> QueryOptions;
    private javax.swing.JPanel Req1;
    private javax.swing.JPanel Req2;
    private javax.swing.JPanel Req3;
    private javax.swing.JScrollPane ScrollQuery1;
    private javax.swing.JButton SearchButton;
    private javax.swing.JSeparator Separator;
    private javax.swing.JTable TableQuery1;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
