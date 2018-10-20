/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import lk.ijse.email.observer.Observer;

/**
 *
 * @author Chamini
 */
public class MailForm extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form MailForm
     */
    public MailForm() {
        initComponents();
         run();
        setFullSreen();
           panalAllMailQueue.removeAll();
        panalAllMailQueue.repaint();
        panalAllMailQueue.revalidate();
        InboxForm IF=new InboxForm();
             IF.setSize(panalAllMailQueue.getSize());
       panalAllMailQueue.add(IF);
        panalAllMailQueue.repaint();
        panalAllMailQueue.revalidate();
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        clock = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jXSearchField1 = new org.jdesktop.swingx.JXSearchField();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSentCount = new javax.swing.JLabel();
        lblSentMail = new javax.swing.JLabel();
        lblInbox = new javax.swing.JLabel();
        lblInboxCount = new javax.swing.JLabel();
        lblDeleteCount = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        lblDraft = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDeleteMails = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblLog = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panalAllMailQueue = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        panalLoad = new javax.swing.JPanel();
        lblmailimg = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panalContactList = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(null);

        clock.setBackground(new java.awt.Color(9, 84, 84));
        clock.setForeground(new java.awt.Color(255, 255, 255));
        clock.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        clock.setOpaque(false);

        javax.swing.GroupLayout clockLayout = new javax.swing.GroupLayout(clock);
        clock.setLayout(clockLayout);
        clockLayout.setHorizontalGroup(
            clockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        clockLayout.setVerticalGroup(
            clockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel2.add(clock);
        clock.setBounds(0, 0, 160, 80);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/settings.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11);
        jLabel11.setBounds(1310, 0, 30, 30);

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/power.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10);
        jLabel10.setBounds(1340, 0, 30, 30);

        jLabel1.setBackground(new java.awt.Color(37, 97, 97));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 80);

        jXSearchField1.setForeground(new java.awt.Color(51, 51, 51));
        jXSearchField1.setText("  Search by Name or Mail");
        jXSearchField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jXSearchField1.setPrompt("Search by Name or Mail"); // NOI18N
        jXSearchField1.setPromptBackround(java.awt.Color.white);
        jXSearchField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXSearchField1MouseClicked(evt);
            }
        });
        jXSearchField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXSearchField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jXSearchField1);
        jXSearchField1.setBounds(10, 100, 250, 30);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jPanel2.add(jLabel24);
        jLabel24.setBounds(290, 100, 20, 20);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setText("       New |");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel23);
        jLabel23.setBounds(280, 90, 90, 40);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Entypo_e729(0)_32_1.png"))); // NOI18N
        jPanel2.add(jLabel26);
        jLabel26.setBounds(380, 100, 20, 23);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setText("       Delete |");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(370, 80, 110, 50);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Entypo_d83d(0)_48j.png"))); // NOI18N
        jPanel2.add(jLabel28);
        jLabel28.setBounds(1330, 100, 30, 25);

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setText("UseName");
        lblName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNameMouseClicked(evt);
            }
        });
        jPanel2.add(lblName);
        lblName.setBounds(1250, 90, 120, 50);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Entypo_27a6(0)_32.png"))); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(490, 100, 24, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("        Forword |");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14);
        jLabel14.setBounds(480, 90, 130, 40);

        jLabel3.setBackground(new java.awt.Color(59, 137, 137));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 1370, 140);

        lblSentCount.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel2.add(lblSentCount);
        lblSentCount.setBounds(120, 180, 60, 30);

        lblSentMail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSentMail.setText("Sent Items");
        lblSentMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSentMailMouseClicked(evt);
            }
        });
        jPanel2.add(lblSentMail);
        lblSentMail.setBounds(40, 240, 70, 30);

        lblInbox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblInbox.setText("Inbox");
        lblInbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInboxMouseClicked(evt);
            }
        });
        jPanel2.add(lblInbox);
        lblInbox.setBounds(40, 270, 100, 30);

        lblInboxCount.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel2.add(lblInboxCount);
        lblInboxCount.setBounds(110, 210, 60, 30);

        lblDeleteCount.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel2.add(lblDeleteCount);
        lblDeleteCount.setBounds(140, 264, 0, 30);

        lblImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblImg);
        lblImg.setBounds(20, 480, 120, 70);

        lblDraft.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDraft.setText("Drafts");
        lblDraft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDraftMouseClicked(evt);
            }
        });
        jPanel2.add(lblDraft);
        lblDraft.setBounds(40, 300, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("> Favorites");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 210, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel8.setText("Folders");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 170, 130, 30);

        lblDeleteMails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDeleteMails.setText("Deleted Items");
        lblDeleteMails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteMailsMouseClicked(evt);
            }
        });
        jPanel2.add(lblDeleteMails);
        lblDeleteMails.setBounds(40, 330, 90, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("> User Name");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 370, 120, 30);

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEmail.setText("e-Mail");
        jPanel2.add(lblEmail);
        lblEmail.setBounds(20, 420, 140, 20);
        lblEmail.getAccessibleContext().setAccessibleDescription("email address");

        lblLog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLog.setText("login");
        jPanel2.add(lblLog);
        lblLog.setBounds(20, 450, 140, 20);

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 400, 160, 160);

        javax.swing.GroupLayout panalAllMailQueueLayout = new javax.swing.GroupLayout(panalAllMailQueue);
        panalAllMailQueue.setLayout(panalAllMailQueueLayout);
        panalAllMailQueueLayout.setHorizontalGroup(
            panalAllMailQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        panalAllMailQueueLayout.setVerticalGroup(
            panalAllMailQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jPanel2.add(panalAllMailQueue);
        panalAllMailQueue.setBounds(200, 140, 260, 630);

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setOpaque(true);
        jPanel2.add(jLabel18);
        jLabel18.setBounds(190, 140, 10, 630);

        panalLoad.setBackground(new java.awt.Color(193, 192, 192));
        panalLoad.setAutoscrolls(true);

        lblmailimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aa.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel21.setText("Select an Item to read");

        javax.swing.GroupLayout panalLoadLayout = new javax.swing.GroupLayout(panalLoad);
        panalLoad.setLayout(panalLoadLayout);
        panalLoadLayout.setHorizontalGroup(
            panalLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panalLoadLayout.createSequentialGroup()
                .addContainerGap(378, Short.MAX_VALUE)
                .addGroup(panalLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmailimg)
                    .addGroup(panalLoadLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(298, 298, 298))
        );
        panalLoadLayout.setVerticalGroup(
            panalLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panalLoadLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(lblmailimg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        jPanel2.add(panalLoad);
        panalLoad.setBounds(470, 140, 900, 630);

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setOpaque(true);
        jPanel2.add(jLabel19);
        jLabel19.setBounds(460, 140, 10, 630);

        panalContactList.setBackground(new java.awt.Color(206, 213, 213));
        jPanel2.add(panalContactList);
        panalContactList.setBounds(10, 570, 170, 190);

        jLabel2.setBackground(new java.awt.Color(206, 213, 213));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 140, 1370, 630);

        jLabel22.setText("jLabel22");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(320, 50, 40, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
   new SettingForm(this, true).setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
         panalLoad.removeAll();
        panalLoad.repaint();
        panalLoad.revalidate();
        NewForm SF=new NewForm();
        SF.setSize(panalLoad.getSize());
        panalLoad.add(SF);
        panalLoad.repaint();
        panalLoad.revalidate();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void lblSentMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSentMailMouseClicked
        // TODO add your handling code here:
             panalAllMailQueue.removeAll();
        panalAllMailQueue.repaint();
        panalAllMailQueue.revalidate();
        SentForm SF=new SentForm();
       SF.setSize(panalAllMailQueue.getSize());
        panalAllMailQueue.add(SF);
        panalAllMailQueue.repaint();
        panalAllMailQueue.revalidate();
        
          panalLoad.removeAll();
        panalLoad.repaint();
        panalLoad.revalidate();
        panalLoad.getSize();
        lblmailimg.setVisible(true);
         panalAllMailQueue.repaint();
        panalAllMailQueue.revalidate();
         
    }//GEN-LAST:event_lblSentMailMouseClicked

    private void lblInboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInboxMouseClicked
        // TODO add your handling code here:
        panalAllMailQueue.removeAll();
        panalAllMailQueue.repaint();
        panalAllMailQueue.revalidate();
        InboxForm IF=new InboxForm();
             IF.setSize(panalAllMailQueue.getSize());
       panalAllMailQueue.add(IF);
        panalAllMailQueue.repaint();
        panalAllMailQueue.revalidate();
        
          panalLoad.removeAll();
        panalLoad.repaint();
        panalLoad.revalidate();
        panalLoad.getSize();
        lblmailimg.setVisible(true);
         panalAllMailQueue.repaint();
        panalAllMailQueue.revalidate();
    }//GEN-LAST:event_lblInboxMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
          panalLoad.removeAll();
        panalLoad.repaint();
        panalLoad.revalidate();
        NewForm SF=new NewForm();
        SF.setSize(panalLoad.getSize());
        panalLoad.add(SF);
        panalLoad.repaint();
        panalLoad.revalidate();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void lblNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameMouseClicked
        // TODO add your handling code here:
      new UserDetailsForm(this, true).setVisible(true);
    }//GEN-LAST:event_lblNameMouseClicked

    private void jXSearchField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXSearchField1ActionPerformed
        
    }//GEN-LAST:event_jXSearchField1ActionPerformed

    private void jXSearchField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXSearchField1MouseClicked
        jXSearchField1.selectAll();
    }//GEN-LAST:event_jXSearchField1MouseClicked

    private void lblDraftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDraftMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDraftMouseClicked

    private void lblDeleteMailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMailsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDeleteMailsMouseClicked

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
            java.util.logging.Logger.getLogger(MailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MailForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel clock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private org.jdesktop.swingx.JXSearchField jXSearchField1;
    private javax.swing.JLabel lblDeleteCount;
    private javax.swing.JLabel lblDeleteMails;
    private javax.swing.JLabel lblDraft;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblInbox;
    private javax.swing.JLabel lblInboxCount;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSentCount;
    private javax.swing.JLabel lblSentMail;
    private javax.swing.JLabel lblmailimg;
    private javax.swing.JPanel panalAllMailQueue;
    private javax.swing.JScrollPane panalContactList;
    private javax.swing.JPanel panalLoad;
    // End of variables declaration//GEN-END:variables

    private void setFullSreen() {
       Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        this.setSize(d);
    }
     private void run() {
        clock.setLayout(new FlowLayout(FlowLayout.CENTER));
        Clock l1=new Clock("second");
        Clock l3=new Clock("date");
        Clock l2=new Clock("day");
        clock.add(l1);
        clock.add(l2);
        clock.add(l3); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateObsrver() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}