/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.view;

/**
 *
 * @author Chamini
 */
public class LoadMailForm extends javax.swing.JPanel {

    /**
     * Creates new form LoadMailForm
     */
    public LoadMailForm() {
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

        PanalReply = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jXTextField1 = new org.jdesktop.swingx.JXTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jXTextArea1 = new org.jdesktop.swingx.JXTextArea();
        lblImg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblReply = new javax.swing.JLabel();

        PanalReply.setBackground(new java.awt.Color(204, 204, 204));
        PanalReply.setLayout(null);

        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        PanalReply.add(jTextField2);
        jTextField2.setBounds(115, 85, 731, 28);

        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        PanalReply.add(jTextField1);
        jTextField1.setBounds(115, 124, 731, 28);

        jXTextField1.setToolTipText("");
        jXTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXTextField1.setOpaque(false);
        jXTextField1.setPrompt("");
        PanalReply.add(jXTextField1);
        jXTextField1.setBounds(10, 11, 649, 48);

        jXTextArea1.setColumns(20);
        jXTextArea1.setRows(50);
        jXTextArea1.setToolTipText("");
        jXTextArea1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jXTextArea1.setPrompt("");
        jScrollPane2.setViewportView(jXTextArea1);

        PanalReply.add(jScrollPane2);
        jScrollPane2.setBounds(10, 170, 836, 453);

        lblImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanalReply.add(lblImg);
        lblImg.setBounds(10, 70, 85, 82);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Typicons_e005(0)_64.png"))); // NOI18N
        PanalReply.add(jLabel2);
        jLabel2.setBounds(800, 20, 30, 30);

        lblReply.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReply.setText("         Reply");
        lblReply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReplyMouseClicked(evt);
            }
        });
        PanalReply.add(lblReply);
        lblReply.setBounds(800, 20, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanalReply, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanalReply, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblReplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReplyMouseClicked
        // TODO add your handling code here:
          PanalReply.removeAll();
        PanalReply.repaint();
        PanalReply.revalidate();
        NewForm SF=new NewForm();
        SF.setSize(PanalReply.getSize());
        PanalReply.add(SF);
        PanalReply.repaint();
        PanalReply.revalidate();
    }//GEN-LAST:event_lblReplyMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanalReply;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.swingx.JXTextArea jXTextArea1;
    private org.jdesktop.swingx.JXTextField jXTextField1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblReply;
    // End of variables declaration//GEN-END:variables
}
