/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareAccountantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EntHealthServices;
import Business.Org.OrgAccountant;
import Business.Patient.Patient;
import Business.SystemUserAccount.SystemUsers;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


/**
 *
 * @author Parth
 */
public class AccountantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel JPanel;
    private SystemUsers usrAcnt;
    private OrgAccountant acntOrg;
    private Enterprise entrpz;
    private EcoSystem ecoSystem;

    /**
     * Creates new form AccountantWorkAreaJPanel
     */
    public AccountantWorkAreaJPanel(JPanel userProcessContainer, SystemUsers account, OrgAccountant accountantOrganization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.JPanel = userProcessContainer;
        this.acntOrg = accountantOrganization;
        this.usrAcnt = account;
        this.entrpz = enterprise;
        this.ecoSystem = ecosystem;

        pplAllPtntsTbl();

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
        btnCrtApptmt = new javax.swing.JButton();
        btnPrcsMdclBll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPtn = new javax.swing.JTable();
        btnShwPtntRprt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hospital reception.jpg"))); // NOI18N
        jLabel1.setText("Patient Details");

        btnCrtApptmt.setBackground(new java.awt.Color(0, 102, 102));
        btnCrtApptmt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCrtApptmt.setForeground(new java.awt.Color(255, 255, 255));
        btnCrtApptmt.setText("Create Appointment");
        btnCrtApptmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrtApptmtActionPerformed(evt);
            }
        });

        btnPrcsMdclBll.setBackground(new java.awt.Color(0, 102, 102));
        btnPrcsMdclBll.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPrcsMdclBll.setForeground(new java.awt.Color(255, 255, 255));
        btnPrcsMdclBll.setText("Process Medical Billings");
        btnPrcsMdclBll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrcsMdclBllActionPerformed(evt);
            }
        });

        tblPtn.setBackground(new java.awt.Color(204, 204, 204));
        tblPtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblPtn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Patient Name", "Phone Number", "Address", "Treatment Status", "Appointment Date", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPtn);

        btnShwPtntRprt.setBackground(new java.awt.Color(0, 102, 102));
        btnShwPtntRprt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnShwPtntRprt.setForeground(new java.awt.Color(255, 255, 255));
        btnShwPtntRprt.setText("Show Patient Report");
        btnShwPtntRprt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShwPtntRprtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Receptionist Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrtApptmt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(btnShwPtntRprt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPrcsMdclBll))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShwPtntRprt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrcsMdclBll, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrtApptmt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrtApptmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrtApptmtActionPerformed

        String patientId = UUID.randomUUID().toString().substring(0, 7);
        CardLayout layout = (CardLayout) JPanel.getLayout();
        JPanel.add("CreateAppointmentJPanel", new CreateAppointmentJPanel(JPanel, usrAcnt, entrpz, ecoSystem, patientId));
        layout.next(JPanel);
    }//GEN-LAST:event_btnCrtApptmtActionPerformed

    private void btnPrcsMdclBllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrcsMdclBllActionPerformed
        CardLayout layout = (CardLayout) JPanel.getLayout();
        JPanel.add("ProcessMedicalBillingsJPanel", new ProcessMedicalBillingsJPanel(JPanel, usrAcnt, entrpz, acntOrg, ecoSystem));
        layout.next(JPanel);
    }//GEN-LAST:event_btnPrcsMdclBllActionPerformed

    private void btnShwPtntRprtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShwPtntRprtActionPerformed
        List<Patient> underTreatmentPatients = new ArrayList<>();
        List<Patient> treatedPatients = new ArrayList<>();
        DefaultPieDataset defaultPieDataset = new DefaultPieDataset();
        List<Patient> patients = ((EntHealthServices) entrpz).getPatientDirectory().getPatients();
        for (Patient patient : patients) {
            if (patient.isIsTrtmntdone()) {
                treatedPatients.add(patient);
            } else {
                underTreatmentPatients.add(patient);
            }
        }
        defaultPieDataset.setValue("Patient still under treatment", underTreatmentPatients.size());
        defaultPieDataset.setValue("Patient Treated Successfully", treatedPatients.size());
        JFreeChart chart = ChartFactory.createPieChart("Patient Status Pie Chart", defaultPieDataset, true, true, true);
        PiePlot piePlot =(PiePlot) chart.getPlot();
        ChartFrame frame = new ChartFrame("Patient Status Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(500,500);
    }//GEN-LAST:event_btnShwPtntRprtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrtApptmt;
    private javax.swing.JButton btnPrcsMdclBll;
    private javax.swing.JButton btnShwPtntRprt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPtn;
    // End of variables declaration//GEN-END:variables

    public void pplAllPtntsTbl() {
        List<Patient> patients = ((EntHealthServices) entrpz).getPatientDirectory().getPatients();
        DefaultTableModel dtm = (DefaultTableModel) tblPtn.getModel();
        dtm.setRowCount(0);
        for (Patient ptnt : patients) {
            Object[] row = new Object[7];

            row[0] = ptnt;
            row[1] = ptnt.getPatFrstNm() + " " + ptnt.getPatLstNm();
            row[2] = ptnt.getCntctNo();
            row[3] = ptnt.getAddress();
            row[4] = ptnt.isIsTrtmntdone() ? "Treatment Complete" : "Treatment In Progress";
            row[5] = ptnt.getAptDt();
            row[6] = ptnt.getDocType();
            dtm.addRow(row);
        }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dtm);
        tblPtn.setRowSorter(sorter);
    }
}
