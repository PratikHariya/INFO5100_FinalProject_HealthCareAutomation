/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.SystemUserAccount.SystemUsers;
import Business.WorkQueue.PatientTreatmentReq;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Parth
 */
public class ViewPatientJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private SystemUsers userAccount;
    private Enterprise enterprise;
    private PatientTreatmentReq request;

    /**
     * Creates new form ViewPatientJPanel
     */

    ViewPatientJPanel(JPanel userProcessContainer, SystemUsers userAccount, Enterprise enterprise, PatientTreatmentReq workRequest) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.request = workRequest;
        
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHmPhnNo = new javax.swing.JTextField();
        lblPtntInfo = new javax.swing.JLabel();
        lblHmPhnNo = new javax.swing.JLabel();
        txtFrstNm = new javax.swing.JTextField();
        lblFrstNm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddr = new javax.swing.JTextArea();
        lblAddr = new javax.swing.JLabel();
        lblPtntDtls = new javax.swing.JLabel();
        lblLstNm = new javax.swing.JLabel();
        txtLstNm = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblPtntMdclCndtn = new javax.swing.JLabel();
        lblPrscrptn = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrscrptn = new javax.swing.JTextArea();
        txtPtntId = new javax.swing.JTextField();
        lblPtntId = new javax.swing.JLabel();
        txtPtntMdclCndtn = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        imgViewPtnt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        txtHmPhnNo.setEditable(false);
        txtHmPhnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHmPhnNoActionPerformed(evt);
            }
        });

        lblPtntInfo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPtntInfo.setText("PATIENT INFORMATION");

        lblHmPhnNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHmPhnNo.setText("Home phone No :");

        txtFrstNm.setEditable(false);

        lblFrstNm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblFrstNm.setText("First Name :");

        jScrollPane1.setEnabled(false);

        txtAddr.setEditable(false);
        txtAddr.setColumns(20);
        txtAddr.setRows(5);
        jScrollPane1.setViewportView(txtAddr);

        lblAddr.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAddr.setText("Address :");

        lblPtntDtls.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPtntDtls.setText("PATIENT DETAILS");

        lblLstNm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLstNm.setText("Last Name :");

        txtLstNm.setEditable(false);

        txtAge.setEditable(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAge.setText("Age :");

        lblPtntMdclCndtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPtntMdclCndtn.setText("Patient Medical Condition");

        lblPrscrptn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPrscrptn.setText("Prescription :");

        txtPrscrptn.setEditable(false);
        txtPrscrptn.setColumns(20);
        txtPrscrptn.setRows(5);
        jScrollPane2.setViewportView(txtPrscrptn);

        txtPtntId.setEditable(false);

        lblPtntId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPtntId.setText("Patient ID :");

        txtPtntMdclCndtn.setEditable(false);

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        imgViewPtnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/patient.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblPrscrptn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(btnBack)
                            .addGap(144, 144, 144)
                            .addComponent(lblPtntDtls))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(137, 137, 137)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAddr)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPtntMdclCndtn)
                                            .addGap(35, 35, 35)
                                            .addComponent(txtPtntMdclCndtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtHmPhnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblPtntId)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPtntId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblFrstNm)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFrstNm))))
                                    .addGap(53, 53, 53)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblLstNm)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtLstNm, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addComponent(lblAge)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtAge))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addComponent(lblHmPhnNo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(lblPtntInfo)))
                .addGap(18, 18, 18)
                .addComponent(imgViewPtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPtntDtls)
                    .addComponent(btnBack))
                .addGap(23, 23, 23)
                .addComponent(lblPtntInfo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFrstNm)
                    .addComponent(txtFrstNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLstNm)
                    .addComponent(txtLstNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPtntId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPtntId)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHmPhnNo)
                    .addComponent(txtHmPhnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddr)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPtntMdclCndtn)
                    .addComponent(txtPtntMdclCndtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblPrscrptn)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgViewPtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHmPhnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHmPhnNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHmPhnNoActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        jPanel.remove(this);
        CardLayout layout = (CardLayout)jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel imgViewPtnt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddr;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFrstNm;
    private javax.swing.JLabel lblHmPhnNo;
    private javax.swing.JLabel lblLstNm;
    private javax.swing.JLabel lblPrscrptn;
    private javax.swing.JLabel lblPtntDtls;
    private javax.swing.JLabel lblPtntId;
    private javax.swing.JLabel lblPtntInfo;
    private javax.swing.JLabel lblPtntMdclCndtn;
    private javax.swing.JTextArea txtAddr;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFrstNm;
    private javax.swing.JTextField txtHmPhnNo;
    private javax.swing.JTextField txtLstNm;
    private javax.swing.JTextArea txtPrscrptn;
    private javax.swing.JTextField txtPtntId;
    private javax.swing.JTextField txtPtntMdclCndtn;
    // End of variables declaration//GEN-END:variables

    private void populate() {


        txtFrstNm.setText(request.getPatient().getPatFrstNm());
        txtLstNm.setText(request.getPatient().getPatLstNm());
        txtPtntId.setText(String.valueOf(request.getPatient().getPatId()));
        txtAddr.setText(request.getPatient().getAddress());
        txtHmPhnNo.setText(request.getPatient().getCntctNo());
        txtAge.setText(String.valueOf(request.getPatient().getPatAge()));

        txtPtntMdclCndtn.setText(request.getVisitReason());
        txtPrscrptn.setText(request.getDrNote());
    }
}
