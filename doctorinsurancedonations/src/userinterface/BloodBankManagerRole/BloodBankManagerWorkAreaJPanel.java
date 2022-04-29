/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BloodBankManagerRole;

import Business.EcoSystem;
import Business.Org.OrgBloodBankManager;
import Business.Org.OrgLab;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import Business.WorkQueue.BloodBankReq;
import Business.WorkQueue.PatientTreatmentReq;
import Business.WorkQueue.WorkReq;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ankitajha
 */
public class BloodBankManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private EcoSystem ecosystem;
    private SystemUsers usrAcnt;
    private OrgBloodBankManager bloodBankMngrOrg;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public BloodBankManagerWorkAreaJPanel(JPanel userProcessContainer, SystemUsers account, Organization organization, EcoSystem business) {
        initComponents();

        this.jPanel = userProcessContainer;
        this.usrAcnt = account;
        this.ecosystem = business;
        this.bloodBankMngrOrg = (OrgBloodBankManager) organization;

        pplTbl();
    }

    public void pplTbl() {
        DefaultTableModel model = (DefaultTableModel) tblBloodBank.getModel();

        model.setRowCount(0);


        for (WorkReq request : bloodBankMngrOrg.getWrkQ().getWrkReqs()) {

            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getSndr().getEmploye().getEmpName();
            row[2] = ((PatientTreatmentReq) request).getBloodBankManagement();
            row[3] = request.getReqStatus();
            row[4] = ((PatientTreatmentReq ) request).getPatient().getPatFrstNm() + " " + ((PatientTreatmentReq) request).getPatient().getPatLstNm();
            row[5] = ((PatientTreatmentReq) request).getPatient().getPatId();
            row[6]=((PatientTreatmentReq) request).getBloodUnits();
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblBloodBank.setRowSorter(sorter);
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
        tblBloodBank = new javax.swing.JTable();
        btnAssgnToMe = new javax.swing.JButton();
        btnPrcs = new javax.swing.JButton();
        imgBloodBank = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 51, 0));
        setLayout(null);

        tblBloodBank.setBackground(new java.awt.Color(204, 204, 204));
        tblBloodBank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Patient Name", "Patient Id", "Blood Units"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBloodBank);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 730, 90);

        btnAssgnToMe.setBackground(new java.awt.Color(102, 204, 0));
        btnAssgnToMe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAssgnToMe.setText("Assign to me");
        btnAssgnToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssgnToMeActionPerformed(evt);
            }
        });
        add(btnAssgnToMe);
        btnAssgnToMe.setBounds(190, 130, 140, 40);

        btnPrcs.setBackground(new java.awt.Color(0, 153, 255));
        btnPrcs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPrcs.setText("Process");
        btnPrcs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrcsActionPerformed(evt);
            }
        });
        add(btnPrcs);
        btnPrcs.setBounds(370, 130, 140, 40);

        imgBloodBank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blood bank request.gif"))); // NOI18N
        add(imgBloodBank);
        imgBloodBank.setBounds(100, 190, 630, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssgnToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssgnToMeActionPerformed

        int selectedRow = tblBloodBank.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }

        PatientTreatmentReq request = (PatientTreatmentReq) tblBloodBank.getValueAt(selectedRow, 0);
        if (request.getBloodBankManagement() == null) {
            if (request.getReqStatus().equalsIgnoreCase("SentToBloodBank")) {
                request.setBloodBankManagement(usrAcnt);
                request.setReqStatus("Pending on Blood Bank");
                //  request.setReceiver(userAccount);
                pplTbl();
                JOptionPane.showMessageDialog(null, "The request is assigned to You!");
            } else {
                JOptionPane.showMessageDialog(null, "Cannot assign this lab request as the current status is: " + request.getReqStatus());
            }
        }
        else
        {

            if(usrAcnt.equals(request.getLabAssitantEmployee()))

            {
                JOptionPane.showMessageDialog(null,"Request is already assigned to you");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Request is assigned to other Lab Assistant");
            }
        }

    }//GEN-LAST:event_btnAssgnToMeActionPerformed

    private void btnPrcsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrcsActionPerformed

        int selectedRow = tblBloodBank.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        PatientTreatmentReq request = (PatientTreatmentReq) tblBloodBank.getValueAt(selectedRow, 0);

       // request.setStatus("Processing");
        BloodProcessWorkRequestJPanel processWorkRequestJPanel = new BloodProcessWorkRequestJPanel(jPanel, request);
        if (request.getBloodBankManagement() != null) {
            if (usrAcnt.equals(request.getBloodBankManagement())) {
                if (request.getReqStatus().equalsIgnoreCase("Pending on Blood Bank")) {

                    jPanel.add("processWorkRequestJPanel", processWorkRequestJPanel);
                    CardLayout layout = (CardLayout) jPanel.getLayout();
                    layout.next(jPanel);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot process the request as the status is: " + request.getReqStatus());
                }

            } else {

                JOptionPane.showMessageDialog(null, "Not authorised to process the request");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please assign the request first");
        }
    }//GEN-LAST:event_btnPrcsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssgnToMe;
    private javax.swing.JButton btnPrcs;
    private javax.swing.JLabel imgBloodBank;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBloodBank;
    // End of variables declaration//GEN-END:variables
}
