/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lemuel
 */
public class MoreScrollPane extends javax.swing.JFrame {

    /**
     * Creates new form MoreScrollPane
     */
    public MoreScrollPane() {
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

        coffeepanel4 = new javax.swing.JPanel();
        coffeepanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        coffeeNames4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        ratings1 = new javax.swing.JLabel();
        seemore4 = new javax.swing.JButton();
        addtocart1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coffeepanel1.setBackground(new java.awt.Color(204, 204, 204));
        coffeepanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(270, 270));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 153, 153,80));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Php 190.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 40));

        image1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\nitrocoldbrew.png")); // NOI18N
        jPanel6.add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 252));

        coffeepanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 270, 250));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        coffeeNames4.setBackground(new java.awt.Color(255, 255, 255, 80));
        coffeeNames4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        coffeeNames4.setText("Nitro Cold Brew");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(coffeeNames4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(coffeeNames4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        coffeepanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 300, 50));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        ratings1.setBackground(new java.awt.Color(204, 204, 204));
        ratings1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\OneDrive\\Pictures\\4.5ratefinal.png")); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(ratings1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(ratings1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        coffeepanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 330, -1, 60));

        seemore4.setBackground(new java.awt.Color(204, 204, 204));
        seemore4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        seemore4.setText("See more...");
        seemore4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        seemore4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seemore4ActionPerformed(evt);
            }
        });
        coffeepanel1.add(seemore4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 90, 30));

        addtocart1.setBackground(new java.awt.Color(204, 204, 204));
        addtocart1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        addtocart1.setText("Add to Cart");
        addtocart1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        addtocart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocart1ActionPerformed(evt);
            }
        });
        coffeepanel1.add(addtocart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 90, 30));

        javax.swing.GroupLayout coffeepanel4Layout = new javax.swing.GroupLayout(coffeepanel4);
        coffeepanel4.setLayout(coffeepanel4Layout);
        coffeepanel4Layout.setHorizontalGroup(
            coffeepanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coffeepanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        coffeepanel4Layout.setVerticalGroup(
            coffeepanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coffeepanel4Layout.createSequentialGroup()
                .addComponent(coffeepanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(coffeepanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 340, 460));

        setSize(new java.awt.Dimension(1317, 1470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void seemore4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seemore4ActionPerformed
        Seemore4 more = new Seemore4();
        more.setLocationRelativeTo(this); // Center the new window relative to DiscoverPage
        more.setVisible(true);
    }//GEN-LAST:event_seemore4ActionPerformed

    private void addtocart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocart1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addtocart1ActionPerformed

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
            java.util.logging.Logger.getLogger(MoreScrollPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoreScrollPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoreScrollPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoreScrollPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoreScrollPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtocart1;
    private javax.swing.JLabel coffeeNames4;
    private javax.swing.JPanel coffeepanel1;
    private javax.swing.JPanel coffeepanel4;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel ratings1;
    private javax.swing.JButton seemore4;
    // End of variables declaration//GEN-END:variables
}
