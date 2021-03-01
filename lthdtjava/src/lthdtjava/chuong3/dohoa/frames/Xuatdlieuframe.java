/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong3.dohoa.frames;

import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author Lợii
 */
public class Xuatdlieuframe extends javax.swing.JInternalFrame {

    /**
     * Creates new form Xuatdlieuframe
     */
    public Xuatdlieuframe() {
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

        pnpanel = new javax.swing.JPanel();
        btnve = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 0));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Vẽ dữ liệu mảng 1 chiều");

        pnpanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnpanelLayout = new javax.swing.GroupLayout(pnpanel);
        pnpanel.setLayout(pnpanelLayout);
        pnpanelLayout.setHorizontalGroup(
            pnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        pnpanelLayout.setVerticalGroup(
            pnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        btnve.setBackground(new java.awt.Color(255, 204, 0));
        btnve.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnve.setText("Vẽ");
        btnve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnve)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnve, pnpanel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnve)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnveActionPerformed
        // TODO add your handling code here:
        Graphics2D gr=(Graphics2D) pnpanel.getGraphics();
        int maxX=pnpanel.getWidth();
        int maxY=pnpanel.getHeight();
        int step=5;
        int n=maxX/step;
        int[]a=new int[n];
        Random rnd =new Random();
        for(int i=0;i<n;i++){
            a[i]=rnd.nextInt(maxY);
            
        }
        int beginX=0, beginY=0;
        gr.clearRect(n, n, maxX, maxY);
        for(int i=0;i<n;i++){
//            gr.drawRect(beginX, beginY, step, a[i]);
         gr.drawRect(beginX, maxY-a[i],step,a[i]);

            beginX+=step;
        }
    }//GEN-LAST:event_btnveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnve;
    private javax.swing.JPanel pnpanel;
    // End of variables declaration//GEN-END:variables
}
