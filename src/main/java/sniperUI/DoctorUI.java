/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sniperUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sniperModel.Doctor;
import sniperModel.DoctorDirectory;
import sniperModel.HospitalDirectory;

/**
 *
 * @author ganes
 */

public class DoctorUI extends javax.swing.JPanel {

    /**
     * Creates new form DoctorUI
     */
    DoctorDirectory dDir;
    HospitalDirectory hDir;
    int id = 0 ;
    String fName ,lName , dmail = null, dmob = null ,dh = null, un = null, pass = null;
    Map<Integer,Doctor> dD = new HashMap();
    ArrayList<String> hl;
    
    public DoctorUI(DoctorDirectory d,HospitalDirectory c) {
        initComponents();
        this.dDir = d;
        if(c.isEmpty()){
            JOptionPane.showMessageDialog(this, "Hospital Directory is empty. Please add hospital before doctor.");
        }
        this.hDir = c;
        dD = this.dDir.getDdir();
        hl = this.hDir.getHospitalList();
        displayHospitalList();
        Tun.setEditable(false);
    }
    
    public void displayHospitalList(){
        Hlist.removeAllItems();
        Hlist.setSelectedItem(null);
            for(String s : hl){
                Hlist.addItem(s);
             }
    }
    
    public int getIndexOf(String hn){
        int i = 0;
        for(String s : hl){
                if(s.equals(hn))
                    return i;
                i++;
            }
        return -1;
    }
    
    public void clear(){
        
        fn.setText("");
        ln.setText("");
        mail.setText("");
        mob.setText("");
        Hlist.setSelectedIndex(0);
        did.setText("");
        Tun.setText("");
        Tp.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        did = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Tun = new javax.swing.JTextField();
        Tp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Hlist = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        createDoc = new javax.swing.JButton();
        updateDoc = new javax.swing.JButton();
        deleteDoc = new javax.swing.JButton();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        viewAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        docTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Apple LiSung", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Registration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setText("Mail ID");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("Mobile Number");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("Doctor ID");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setText("Hospital");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("User Name");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setText("Password");

        Hlist.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        Hlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HlistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tun, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)
                        .addComponent(did, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hlist, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(132, 132, 132))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(did, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Hlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        createDoc.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        createDoc.setText("Create");
        createDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDocActionPerformed(evt);
            }
        });

        updateDoc.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        updateDoc.setText("Update");
        updateDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDocActionPerformed(evt);
            }
        });

        deleteDoc.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        deleteDoc.setText("Delete");
        deleteDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDocActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        viewAll.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        viewAll.setText("View All");
        viewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(reset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addComponent(deleteDoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateDoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createDoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(createDoc)
                .addGap(18, 18, 18)
                .addComponent(updateDoc)
                .addGap(18, 18, 18)
                .addComponent(deleteDoc)
                .addGap(18, 18, 18)
                .addComponent(viewAll)
                .addGap(18, 18, 18)
                .addComponent(reset)
                .addGap(18, 18, 18)
                .addComponent(save)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createDoc, deleteDoc, reset, save, updateDoc, viewAll});

        docTable.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Mobile No.", "Hospital", "Username", "Password"
            }
        ));
        docTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(docTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDocActionPerformed
        // TODO add your handling code here:
        
        id = Integer.parseInt(did.getText());
        fName = fn.getText();
        lName = ln.getText();
        dmail = mail.getText();
        dmob = mob.getText();
        dh = Hlist.getSelectedItem().toString();
        pass = Tp.getText();
        un = id+fName+lName;
        Tun.setText(un);
        
        Object[] ob = new Object[8];
        
        ob[0] = id;
        ob[1] = fName;
        ob[2] = lName;
        ob[3] = dmail;
        ob[4] = dmob;
        ob[5] = dh;
        ob[6] = un;
        ob[7] = pass;
        
        DefaultTableModel doct = (DefaultTableModel) docTable.getModel();  
        doct.addRow(ob);
        
        Doctor d = new Doctor();
        
        d.setDocID(id);
        d.setfName(fName);
        d.setlName(lName);
        d.setDmail(dmail);
        d.setDmobile(dmob);
        d.setHospital(dh);
        d.setUserName(un);
        d.setPassword(pass);
        
        this.dD.put(id, d);
        
        clear();
        JOptionPane.showMessageDialog(this, "Record is Successfully Created");
    }//GEN-LAST:event_createDocActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
             clear();
             this.dDir.setDdir(dD);
             this.dDir.displayDoctorDir();
             JOptionPane.showMessageDialog(this, "Details Saved Successfully");
        
    }//GEN-LAST:event_saveActionPerformed

    private void deleteDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDocActionPerformed
        // TODO add your handling code here:
        try{
        DefaultTableModel doc = (DefaultTableModel) docTable.getModel();
        
        if(docTable.getSelectedRowCount() == 1){
            
            id = Integer.parseInt(did.getText());
            dD.remove(id);
            doc.removeRow(docTable.getSelectedRow());
            
            JOptionPane.showMessageDialog(this, "Record is Successfully Deleted");
            clear(); 
            did.setEditable(true);
        }
        else{
            if(docTable.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty. Please add data!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select single row to delete!");
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Problem occured while deleting. Please try again!!");
        }
    }//GEN-LAST:event_deleteDocActionPerformed

    private void updateDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDocActionPerformed
        // TODO add your handling code here:
        
        try{
        DefaultTableModel doc = (DefaultTableModel) docTable.getModel();
        
        if(docTable.getSelectedRowCount()==1){
            
            id = Integer.parseInt(did.getText());
            fName = fn.getText();
            lName = ln.getText();
            dmob = mob.getText();
            dmail = mail.getText();
            dh = Hlist.getSelectedItem().toString();
            un = id+fName+lName;
            pass = Tp.getText();            
                         
            Doctor d = new Doctor();
        
            d.setDocID(id);
            d.setfName(fName);
            d.setlName(lName);
            d.setDmail(dmail);
            d.setDmobile(dmob);
            d.setHospital(dh);
            d.setUserName(un);
            d.setHospital(pass);
            d.setPassword(pass);
            
            dD.put(id, d);
            
            doc.setValueAt(fName, docTable.getSelectedRow(), 1);
            doc.setValueAt(lName, docTable.getSelectedRow(), 2);
            doc.setValueAt(dmail, docTable.getSelectedRow(), 3);
            doc.setValueAt(dmob, docTable.getSelectedRow(), 4);
            doc.setValueAt(dh, docTable.getSelectedRow(), 5);
            doc.setValueAt(un, docTable.getSelectedRow(), 6);
            doc.setValueAt(pass, docTable.getSelectedRow(), 7);
            
            JOptionPane.showMessageDialog(this, "Record is Successfully Updated");
            clear();  
            did.setEditable(true);
        }
        else{
            if(docTable.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty. Please add data!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select single row to update!");
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Problem occured while updating. Please try again!!");
        }
        
    }//GEN-LAST:event_updateDocActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        clear();
        did.setEditable(true);
    }//GEN-LAST:event_resetActionPerformed

    private void docTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docTableMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel doc = (DefaultTableModel) docTable.getModel();
        
        id = Integer.parseInt(doc.getValueAt(docTable.getSelectedRow(), 0).toString());
        fName = doc.getValueAt(docTable.getSelectedRow(), 1).toString();
        lName = doc.getValueAt(docTable.getSelectedRow(), 2).toString();
        dmail = doc.getValueAt(docTable.getSelectedRow(), 3).toString();
        dmob = doc.getValueAt(docTable.getSelectedRow(), 4).toString();
        dh = doc.getValueAt(docTable.getSelectedRow(), 5).toString();
        un = doc.getValueAt(docTable.getSelectedRow(), 6).toString();
        pass = doc.getValueAt(docTable.getSelectedRow(), 7).toString();
        
        did.setText(""+id);
        fn.setText(fName);
        ln.setText(lName);
        mail.setText(dmail);
        mob.setText(dmob);
        int in = getIndexOf(dh);
        Hlist.setSelectedIndex(in);
        Tun.setText(un);
        Tp.setText(pass);
        did.setEditable(false);
    }//GEN-LAST:event_docTableMouseClicked

    private void viewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllActionPerformed
        // TODO add your handling code here:
        try{
        if(dDir.isEmpty()){
            JOptionPane.showMessageDialog(this, "Doctor Directory is empty. Please add Doctor data!!");
        }
        else{
            DefaultTableModel doc = (DefaultTableModel) docTable.getModel();
            int rc = doc.getRowCount();
            for(int i = 0; i<rc; i++)
                doc.removeRow(0);
            
            Map<Integer,Doctor> dd = dDir.getDdir();
            Set<Map.Entry<Integer,Doctor>> dList = dd.entrySet();
        
            for(Map.Entry<Integer,Doctor> e : dList){
                
                Object[] sd = new Object[8];                
                Doctor d = e.getValue();
                
                sd[0] = (int) e.getKey();
                sd[1] = d.getfName();
                sd[2] = d.getlName();
                sd[3] = d.getDmail();
                sd[4] = d.getDmobile();
                sd[5] = d.getHospital();
                sd[6] = d.getUserName();
                sd[7] = d.getPassword();
                doc.addRow(sd);                                
            }
            
        }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Something went wrong. Please try again");
        }
        clear();
    }//GEN-LAST:event_viewAllActionPerformed

    private void HlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HlistActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Hlist;
    private javax.swing.JTextField Tp;
    private javax.swing.JTextField Tun;
    private javax.swing.JButton createDoc;
    private javax.swing.JButton deleteDoc;
    private javax.swing.JTextField did;
    private javax.swing.JTable docTable;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField mob;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JButton updateDoc;
    private javax.swing.JButton viewAll;
    // End of variables declaration//GEN-END:variables
}
