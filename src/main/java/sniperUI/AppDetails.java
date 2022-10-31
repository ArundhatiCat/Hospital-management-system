/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sniperUI;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sniperModel.Encounter;
import sniperModel.EncounterDirectory;
import sniperModel.Patient;
import sniperModel.PatientDirectory;
import sniperModel.VitalSigns;

/**
 *
 * @author ganes
 */
public class AppDetails extends javax.swing.JPanel {

    /**
     * Creates new form AppDetails
     */
    PatientDirectory patDir;
    EncounterDirectory enDir;
    String hosn = null;
    int id,age,height,bp,temp,hrate,eid;
    String name, date, hos;
    Double weight;
    
    public AppDetails(PatientDirectory p, EncounterDirectory e, String h) {
        initComponents();
        this.patDir = p;
        this.enDir = e;
        this.hosn = h;
        displayAppointments(this.patDir,this.hosn);
    }
    
    public boolean isPatientExist(int id){
        for(Encounter e : enDir.getPatientHistory()){
            if(e.getPatientID() == id)
                return true;
        }
        return false;
    }
    
    public void displayAppointments(PatientDirectory p, String hn){
         try{
        if(p.isEmpty()){
            JOptionPane.showMessageDialog(this, "Their is no Appointment Today.");
        }
        else{
            DefaultTableModel pat = (DefaultTableModel) AppTable.getModel();
            
            int rc = pat.getRowCount();
            for(int i = 0; i<rc; i++)
                pat.removeRow(0);
            
            Map<Integer,Patient> pm = p.getPatDir();
            Set<Map.Entry<Integer,Patient>> patList = pm.entrySet();
        
            for(Map.Entry<Integer,Patient> e : patList){
                Patient p1 = e.getValue();
                if(p1.getHospital().equalsIgnoreCase(hosn)){
                    
                    Object[] sd = new Object[7];  
                
                    sd[0] = (int) e.getKey();
                    sd[1] = p1.getPersonName();
                    sd[2] = p1.getAge();
                    sd[3] = p1.getHeight();
                    sd[4] = p1.getWeight();
                    sd[5] = p1.getDate();
                    sd[6] = p1.getHospital();
                    pat.addRow(sd);  
                }                              
            }
        }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Something went wrong. Please try again");
        }
    }
//    
//    public void displayAppointments(Map<Integer,Patient> p){
//         try{
//        if(p.isEmpty()){
//            JOptionPane.showMessageDialog(this, "Their is no Appointment.");
//        }
//        else{
//            System.out.println("Code 1");
//            DefaultTableModel pat = (DefaultTableModel) AppTable.getModel();
//            
//            int rc = pat.getRowCount();
//            for(int i = 0; i<rc; i++)
//                pat.removeRow(0);
//            
//            Set<Map.Entry<Integer,Patient>> patList = p.entrySet();
//        
//            for(Map.Entry<Integer,Patient> e : patList){
//                
//                Object[] sd = new Object[7];  
//                Patient p1 = e.getValue();
//                sd[0] = (int) e.getKey();
//                sd[1] = p1.getPersonName();
//                sd[2] = p1.getAge();
//                sd[3] = p1.getHeight();
//                sd[4] = p1.getWeight();
//                sd[5] = p1.getDate();
//                sd[6] = p1.getHospital();
//                pat.addRow(sd);                                
//            }
//        }
//        } catch(Exception e){
//            JOptionPane.showMessageDialog(this, "Something went wrong while Deleting. Please try again");
//        }
//    }
    
    public void clear(){
        Tid.setText("");
        Tname.setText("");
        Tdt.setText("");
        Thos.setText("");
        Tage.setText("");
        Tht.setText("");
        Twt.setText("");
        Tdt.setText("");
        Tbp.setText("");
        Ttem.setText("");
        Thr.setText("");
        
        DefaultTableModel phis = (DefaultTableModel) HisTable.getModel();
        int rc =phis.getRowCount();
        for(int i =0; i<rc ; i++)
            phis.removeRow(0);
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
        AppTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Tage = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Tid = new javax.swing.JTextField();
        Tname = new javax.swing.JTextField();
        Tdt = new javax.swing.JTextField();
        Thos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tht = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Twt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Tbp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Ttem = new javax.swing.JTextField();
        Thr = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        AddVitals = new javax.swing.JButton();
        DeleteApp = new javax.swing.JButton();
        PatHistory = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        HisTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 153));

        jScrollPane1.setBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        AppTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Height", "Weight", "Date", "Hospital"
            }
        ));
        AppTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AppTable);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel12.setText("Age");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setText("Height (in cms)");

        Tage.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel10.setText("Weight (in kgs)");

        Tid.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        Tname.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        Tdt.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        Thos.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("ID");

        Tht.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("Patient Name");

        Twt.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setText("Date");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("Hospital");

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel15.setText("Heart Rate");

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel13.setText("Blood Pressure");

        Tbp.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel14.setText("Temperature");

        Ttem.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        Thr.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tbp, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ttem, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Thr, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Tbp, Thr, Ttem, jLabel13, jLabel14});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(Tbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Ttem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tdt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tage, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tht, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Twt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Thos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel12, jLabel9});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel12)
                        .addComponent(Tage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(Tht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(Tdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(Twt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Thos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel12, jLabel9});

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        AddVitals.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        AddVitals.setText("Add Vitals");
        AddVitals.setToolTipText("");
        AddVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVitalsActionPerformed(evt);
            }
        });

        DeleteApp.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        DeleteApp.setText("Delete Appointment");
        DeleteApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAppActionPerformed(evt);
            }
        });

        PatHistory.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        PatHistory.setText("View Patient History");
        PatHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteApp, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(AddVitals)
                .addGap(44, 44, 44)
                .addComponent(DeleteApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PatHistory)
                .addGap(39, 39, 39))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DeleteApp, PatHistory});

        jScrollPane2.setBackground(new java.awt.Color(0, 204, 204));

        HisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Encounter ID", "Date", "Blood Pressure", "Temperature", "Heart Rate"
            }
        ));
        jScrollPane2.setViewportView(HisTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void AppTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel pat = (DefaultTableModel) AppTable.getModel();
        
        id = Integer.parseInt(pat.getValueAt(AppTable.getSelectedRow(), 0).toString());
        name = pat.getValueAt(AppTable.getSelectedRow(), 1).toString();
        age = Integer.parseInt(pat.getValueAt(AppTable.getSelectedRow(), 2).toString());
        height = Integer.parseInt(pat.getValueAt(AppTable.getSelectedRow(), 3).toString());
        weight = Double.valueOf(pat.getValueAt(AppTable.getSelectedRow(), 4).toString());
        date = pat.getValueAt(AppTable.getSelectedRow(), 5).toString();
        hos = pat.getValueAt(AppTable.getSelectedRow(), 6).toString();
        
        Tid.setText(""+id);
        Tname.setText(name);
        Tage.setText(""+age);
        Tht.setText(""+height);
        Twt.setText(""+weight);
        Tdt.setText(date);
        Thos.setText(hos);
        
        Tid.setEditable(false);
        Tname.setEditable(false);
        Tdt.setEditable(false);
        Thos.setEditable(false);
        Tage.setEditable(false);
        Tht.setEditable(false);
        Twt.setEditable(false);
        
        DefaultTableModel his = (DefaultTableModel) HisTable.getModel();
        int rc = his.getRowCount();
        for(int i=0; i<rc;i++)
            his.removeRow(0);
        
        Tbp.setText("");
        Ttem.setText("");
        Thr.setText("");
    }//GEN-LAST:event_AppTableMouseClicked

    private void AddVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVitalsActionPerformed
        // TODO add your handling code here:
        // Blood Pressure Validation
         if(Tbp.getText().isEmpty()) 
                {
                    JOptionPane.showMessageDialog(AddVitals, "Blood Pressure is required");
                    return;
                }
                else 
                {
                    String nameRegex = "^\\d+$";
                    Pattern namePattern = Pattern.compile(nameRegex);
                    Matcher nameMatcher = namePattern.matcher(Tbp.getText());

                    if(!nameMatcher.matches()){
                        JOptionPane.showMessageDialog(AddVitals, "Please enter valid Blood Pressure");
                        return;
                    }
                }
         //Temperature Validation
         if(Ttem.getText().isEmpty()) 
                {
                    JOptionPane.showMessageDialog(AddVitals, "Temperature is required");
                    return;
                }
                else 
                {
                    String nameRegex = "^\\d+$";
                    Pattern namePattern = Pattern.compile(nameRegex);
                    Matcher nameMatcher = namePattern.matcher(Ttem.getText());

                    if(!nameMatcher.matches()){
                        JOptionPane.showMessageDialog(AddVitals, "Please enter valid Temperature");
                        return;
                    }
                }
         //Heart Rate Validation
         if(Thr.getText().isEmpty()) 
                {
                    JOptionPane.showMessageDialog(AddVitals, "Heart Rate is required");
                    return;
                }
                else 
                {
                    String nameRegex = "^\\d+$";
                    Pattern namePattern = Pattern.compile(nameRegex);
                    Matcher nameMatcher = namePattern.matcher(Thr.getText());

                    if(!nameMatcher.matches()){
                        JOptionPane.showMessageDialog(AddVitals, "Please enter valid Heart Rate");
                        return;
                    }
                }
         
        try{
        Encounter en = new Encounter();
        if(this.enDir.isEmpty()){
            eid = 1;
        }
        else{
            eid = this.enDir.size()+1;
        }
        id = Integer.parseInt(Tid.getText());
        bp = Integer.parseInt(Tbp.getText());
        hrate = Integer.parseInt(Thr.getText());
        temp = Integer.parseInt(Ttem.getText());
        date = Tdt.getText();
        
        VitalSigns vs = new VitalSigns();
        vs.setBloodPressure(bp);
        vs.setDate(date);
        vs.setHeartRate(hrate);
        vs.setTemp(temp);
        
        if(isPatientExist(id)){
           en = this.enDir.getEncounter(id);
           // adding vital in encounter
           en.addVital(vs);
           System.out.print(en.displayEncoutner());
           //adding encoutner in encoutner history
           boolean rem = this.enDir.removeEncounter(en);
           System.out.println(rem);
           this.enDir.addEncounter(en);
        }
        else{
            en.setEncounterID(eid);
            en.setPatientID(id);
            en.addVital(vs);
            System.out.print(en.displayEncoutner());
            this.enDir.addEncounter(en);
        }
        Tbp.setText("");
        Ttem.setText("");
        Thr.setText("");
        JOptionPane.showMessageDialog(this, "Vital added Successfully");
        
        } catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Something went wrong. Please try again!!");
        }
        
    }//GEN-LAST:event_AddVitalsActionPerformed

    private void PatHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatHistoryActionPerformed
        // TODO add your handling code here:
        
        try{
            DefaultTableModel phis = (DefaultTableModel) HisTable.getModel();
            int rc = phis.getRowCount();
            for(int i =0; i<rc;i++)
                phis.removeRow(0);
            
            id = Integer.parseInt(Tid.getText());
            if(isPatientExist(id)){
                Encounter en = this.enDir.getEncounter(id);
                int i =0;
                for(VitalSigns s : en.getVitalSignList()){
                    Object[] ob = new Object[5];
                     ob[0] = ++i;
                     ob[1] = s.getDate();
                     ob[2] = s.getBloodPressure();
                     ob[3] = s.getTemp();
                     ob[4] = s.getHeartRate();
                     
                     phis.addRow(ob);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "New Patient. Patient history is not present!!");
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Something went wrong. Please try again!!");
        }
    }//GEN-LAST:event_PatHistoryActionPerformed

    private void DeleteAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAppActionPerformed
        // TODO add your handling code here:
        id = Integer.parseInt(Tid.getText());
        Map<Integer,Patient> en = this.patDir.getPatDir();
        en.remove(id);
        this.patDir.setPatDir(en);
        clear();
        displayAppointments(this.patDir,this.hosn);
    }//GEN-LAST:event_DeleteAppActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVitals;
    private javax.swing.JTable AppTable;
    private javax.swing.JButton DeleteApp;
    private javax.swing.JTable HisTable;
    private javax.swing.JButton PatHistory;
    private javax.swing.JTextField Tage;
    private javax.swing.JTextField Tbp;
    private javax.swing.JTextField Tdt;
    private javax.swing.JTextField Thos;
    private javax.swing.JTextField Thr;
    private javax.swing.JTextField Tht;
    private javax.swing.JTextField Tid;
    private javax.swing.JTextField Tname;
    private javax.swing.JTextField Ttem;
    private javax.swing.JTextField Twt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
