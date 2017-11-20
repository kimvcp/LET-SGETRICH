/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIProject;

/**
 *
 * @author HP
 */
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class question1 extends javax.swing.JFrame {

    int callquestion;
    /**
     * Creates new form question1
     */
    public void init(){
    callquestion=0;
}
    public question1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    int count=0;
    String[] imagenames={"starter.png"};
    int money0=0;
    String[]immoney0={"money1.jpg"};
    int money1=0;
    String[]immoney1={"money2.png"};
    int money2=0;
    String[]immoney2={"money3.png"};
    int money3=0;
    String[]immoney3={"money4.png"};
    int money4=0;
    String[]immoney4={"money5.png"};
    int money5=0;
    String[]immoney5={"money6.png"};
    int money6=0;
    String[]immoney6={"money7.png"};
    int money7=0;
    String[]immoney7={"money8.png"};
        int money8=0;
    String[]immoney8={"money9.png"};
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Nextbutton = new javax.swing.JButton();
        Helpbutton = new javax.swing.JButton();
        Question = new javax.swing.JTextField();
        ans2 = new javax.swing.JTextField();
        ans4 = new javax.swing.JTextField();
        ans3 = new javax.swing.JTextField();
        ans1 = new javax.swing.JTextField();
        GIFBackground = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(255, 255, 102));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nextbutton.setBackground(new java.awt.Color(0, 0, 0));
        Nextbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        Nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextbuttonActionPerformed(evt);
            }
        });
        Background.add(Nextbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 170, 80));

        Helpbutton.setBackground(new java.awt.Color(0, 0, 0));
        Helpbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        Helpbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpbuttonMouseClicked(evt);
            }
        });
        Helpbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpbuttonActionPerformed(evt);
            }
        });
        Background.add(Helpbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 170, 80));

        Question.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Question.setText("Questions");
        Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionActionPerformed(evt);
            }
        });
        Background.add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 400, 130));

        ans2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ans2.setText("ans2");
        ans2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ans2MouseClicked(evt);
            }
        });
        ans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans2ActionPerformed(evt);
            }
        });
        Background.add(ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 170, 50));

        ans4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ans4.setText("ans4");
        ans4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ans4MouseClicked(evt);
            }
        });
        ans4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans4ActionPerformed(evt);
            }
        });
        Background.add(ans4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 170, 50));

        ans3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ans3.setText("ans3");
        ans3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ans3MouseClicked(evt);
            }
        });
        Background.add(ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 170, 50));

        ans1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ans1.setText("ans1");
        ans1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ans1MouseClicked(evt);
            }
        });
        ans1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans1ActionPerformed(evt);
            }
        });
        Background.add(ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 170, 50));
        Background.add(GIFBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/starter.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 260, -1));
        jLabel1.getAccessibleContext().setAccessibleName("");
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans1ActionPerformed

    private void ans1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans1MouseClicked
       
    }//GEN-LAST:event_ans1MouseClicked

    private void ans3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans3MouseClicked
    
    }//GEN-LAST:event_ans3MouseClicked

    private void ans4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans4ActionPerformed

    private void ans4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans4MouseClicked
       
    }//GEN-LAST:event_ans4MouseClicked

    private void ans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans2ActionPerformed

    private void ans2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans2MouseClicked
     
    }//GEN-LAST:event_ans2MouseClicked

    private void QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionActionPerformed

    private void HelpbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HelpbuttonActionPerformed

    private void NextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextbuttonActionPerformed

    @SuppressWarnings("empty-statement")
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Question.setText("");
       ans1.setText("");
       ans2.setText("");
       ans3.setText("");
       ans4.setText("");

    }//GEN-LAST:event_formWindowActivated

    private void HelpbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpbuttonMouseClicked
 callquestion=callquestion+1;
 if(callquestion==1){
     Question.setText("1)What are two types of Network?");
     ans1.setText("WAN and LAN ");
     ans2.setText("CAN and TAN");
     ans3.setText("WLAN and CAN");
     ans4.setText("PAN and DAN");
 }
if(callquestion==2){
     Question.setText("2)What is the brain of any computer system?");
     ans1.setText("Memory");
     ans2.setText("ALU");
     ans3.setText("CPU");
     ans4.setText("Control unit");
 }
if(callquestion==3){
     Question.setText("3)Which team won EURO 2016");
     ans1.setText("Spain ");
     ans2.setText("Portugal");
     ans3.setText("France");
     ans4.setText("Germany");
 }
if(callquestion==4){
     Question.setText("4)Which country have the most World cup titles?");
     ans1.setText("Argentina");
     ans2.setText("Germany");
     ans3.setText("Brazil");
     ans4.setText("Spain");
 }
if(callquestion==5){
     Question.setText("5)Which movie won the best picture award of Oscar 2017?");
     ans1.setText("La La Land");
     ans2.setText("Moonlight");
     ans3.setText("Manchester by the Sea");
     ans4.setText("Zootopia");
 }
    }//GEN-LAST:event_HelpbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new question1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel GIFBackground;
    private javax.swing.JButton Helpbutton;
    private javax.swing.JButton Nextbutton;
    private javax.swing.JTextField Question;
    private javax.swing.JTextField ans1;
    private javax.swing.JTextField ans2;
    private javax.swing.JTextField ans3;
    private javax.swing.JTextField ans4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
