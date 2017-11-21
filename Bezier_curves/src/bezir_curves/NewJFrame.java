/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bezir_curves;

import java.awt.Point;

/**
 *
 * @author DH00049
 */
public class NewJFrame extends javax.swing.JFrame {

    MyCanvas canvas;
    Point[] points = new Point[99];
        int point_count = 0;
        
    public NewJFrame() {
        initComponents();
        canvas = new MyCanvas(this.jPanel1);
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
        txtNum1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldX = new javax.swing.JTextField();
        jTextFieldY = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        txtNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum1ActionPerformed(evt);
            }
        });

        jButton1.setText("Rotate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Scale");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Move");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextFieldX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldXActionPerformed(evt);
            }
        });

        jTextFieldY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldX, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNum1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jTextFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        points[point_count] = new Point();
        points[point_count].x = evt.getX() - canvas.offsetX;
        points[point_count].y = canvas.offsetY - evt.getY();
        point_count++;
        showScene();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        float alpha;
        alpha = (float) Math.toRadians(Float.parseFloat(this.txtNum1.getText()));
        
        for (int i = 0; i < point_count; i++) {
            int xk = (int) Math.round(points[i].x*Math.cos(alpha)
                    - points[i].y*Math.sin(alpha));
            int yk = (int) Math.round(points[i].x*Math.sin(alpha)
            + points[i].y*Math.cos(alpha));
            
            points[i].x = xk;
            points[i].y = yk;
            
        }
        this.showScene();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        float xkoef;
        xkoef = (float) Math.toRadians(Float.parseFloat(this.jTextFieldX.getText()));
        float ykoef;
        ykoef = (float) Math.toRadians(Float.parseFloat(this.jTextFieldY.getText()));
        
        for (int i = 0; i < point_count; i++) {
            int xk = (int) Math.round(points[i].x*Math.cos(xkoef)
                    - points[i].y*Math.sin(ykoef));
            int yk = (int) Math.round(points[i].x*Math.sin(xkoef)
            + points[i].y*Math.cos(ykoef));
            
            points[i].x = xk;
            points[i].y = yk;
            
        }
        this.showScene();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldXActionPerformed

    private void jTextFieldYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldYActionPerformed

    private void txtNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int xk, yk;
        float alpha;
        alpha = 1.5f;
        
        for (int i = 0; i < point_count; i++) {
            xk = (int) Math.round(points[i].x+alpha);
            yk = (int) Math.round(points[i].y+alpha);
            
            points[i].x = xk;
            points[i].y = yk;
        }
        this.showScene();
    }//GEN-LAST:event_jButton3ActionPerformed
    public void getCurvePixel(float t){
        float b_poly[] = new float[point_count];
        for(int i = 0; i < point_count; i++){
        b_poly[i] = (float) bernstein(t, point_count, i+1);
    }
        
//        switch(point_count){
//            case 1:
//                b_poly[0] = 1;
//                break;
//            case 2:
//                b_poly[0] = (1-t);
//                b_poly[1] = t;
//                break; 
//            case 3:
//                b_poly[0] = (1-t)*(1-t);
//                b_poly[1] = 2*(1-t)*t;
//                b_poly[2] = t*t;
//                break;
//            case 4:
//                b_poly[0] = (1-t)*(1-t)*(1-t);
//                b_poly[1] = 3*(1-t)*(1-t)*t;
//                b_poly[2] = 3*(1-t) * t*t;
//                b_poly[3] = t*t*t;
//                break;
//            case 5:
//                b_poly[0] = (1-t)*(1-t)*(1-t)*(1-t);
//                b_poly[1] = 4* (1-t)*(1-t)*(1-t)*t;
//                b_poly[2] = 6*(1-t)*(1-t)*t*t;
//                b_poly[3] = 4*(1-t)*t*t*t;
//                b_poly[4] = t*t*t*t;
//                break;
//            default:
//                break;
//            
//        }
        float sumX = 0;
        float sumY = 0;
        
        for (int i = 0; i < point_count; i++) {
            sumX +=b_poly[i]*points[i].x;
            sumY +=b_poly[i]*points[i].y;
        }
        
        int x = (int) Math.round(sumX);
        int y  = (int) Math.round(sumY);
        canvas.showPixel(x, y);
    }
    public void showScene()
    {
        canvas.clear();
        canvas.showCoordinate();
        for (int i = 0; i < point_count; i++) {
            canvas.showPointWithText(
                    points[i].x, points[i].y,
                    String.valueOf(i)
                    
            );
        }
        float t =0;
        
        while(t<=1){
            this.getCurvePixel(t);
            t+= 0.001;
        }
    }
    //Factorial
    private static int fact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
//Bernstein polynomial
    private static double bernstein(float t, int n, int i){

   return (fact(n) / (fact(i) * fact(n-i))) * Math.pow(1-t, n-i) * Math.pow(t, i);
}
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldX;
    private javax.swing.JTextField jTextFieldY;
    private javax.swing.JTextField txtNum1;
    // End of variables declaration//GEN-END:variables
}
