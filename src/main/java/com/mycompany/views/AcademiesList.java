package com.mycompany.views;

import com.mycompany.dao.DaoClient;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class AcademiesList extends javax.swing.JFrame {
        
    /*
        This needs refactoring there are so much repetitive code to get rid of 
    */
    public AcademiesList() {
        initComponents();

        DaoClient client = new DaoClient();
        
        ResultSet rs = client.getAcademies();
        
        String[] columns = {"ID", "Name", "Phone", "Web"};
        String [][] data = {};
          DefaultTableModel tableModel = new DefaultTableModel(data, columns);
          academiesTable.setModel(tableModel);
          
          try{
              
              while(rs.next()){
                  Object [] rows = new Object[columns.length];
                 for(int i = 0; i < columns.length; i++){
                 //tableModel.addRow(rs.getObject(i));
                 rows[i] = rs.getObject(i + 1);
                }
                 tableModel.addRow(rows);
          }
          }catch( SQLException ex) {
              System.out.println(ex.toString());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        academiesTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        createAcademyBtn = new javax.swing.JButton();
        deleteAcademyBtn = new javax.swing.JButton();
        editAcademyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        academiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone", "Web"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        academiesTable.setColumnSelectionAllowed(true);
        academiesTable.setRowHeight(25);
        academiesTable.setRowMargin(2);
        academiesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        academiesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        academiesTable.setShowGrid(false);
        academiesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(academiesTable);
        academiesTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (academiesTable.getColumnModel().getColumnCount() > 0) {
            academiesTable.getColumnModel().getColumn(0).setHeaderValue("Name");
            academiesTable.getColumnModel().getColumn(1).setHeaderValue("Phone");
            academiesTable.getColumnModel().getColumn(2).setHeaderValue("Web");
        }

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel1.setText("Academies List");

        createAcademyBtn.setBackground(new java.awt.Color(0, 102, 255));
        createAcademyBtn.setForeground(new java.awt.Color(255, 255, 255));
        createAcademyBtn.setText("Create");
        createAcademyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAcademyBtnActionPerformed(evt);
            }
        });

        deleteAcademyBtn.setBackground(new java.awt.Color(255, 102, 102));
        deleteAcademyBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteAcademyBtn.setText("Delete");

        editAcademyBtn.setBackground(new java.awt.Color(102, 102, 255));
        editAcademyBtn.setForeground(new java.awt.Color(255, 255, 255));
        editAcademyBtn.setText("Edit");
        editAcademyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAcademyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel1)
                .addContainerGap(362, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createAcademyBtn)
                .addGap(9, 9, 9)
                .addComponent(editAcademyBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteAcademyBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAcademyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAcademyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAcademyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createAcademyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAcademyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createAcademyBtnActionPerformed

    private void editAcademyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAcademyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editAcademyBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcademiesList().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable academiesTable;
    private javax.swing.JButton createAcademyBtn;
    private javax.swing.JButton deleteAcademyBtn;
    private javax.swing.JButton editAcademyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
