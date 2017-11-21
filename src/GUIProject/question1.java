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
import static java.awt.Color.WHITE;
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
    int money=0;
    String[] immoney={"starter.png"};
    int money1=0;
    String[]immoney1={"money1.jpg"};
    int money2=0;
    String[]immoney2={"money2.png"};
    int money3=0;
    String[]immoney3={"money3.png"};
    int money4=0;
    String[]immoney4={"money4.png"};
    int money5=0;
    String[]immoney6={"money5.png"};
    int money7=0;
    String[]immoney7={"money6.png"};
    int money8=0;
    String[]immoney8={"money7.png"};
    int money9=0;
    String[]immoney9={"money8.png"};
    int money10=0;
    String[]immoney10={"money9.png"};
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Nextbutton = new javax.swing.JButton();
        Helpbutton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        Question = new javax.swing.JTextField();
        ans1 = new javax.swing.JTextField();
        ans2 = new javax.swing.JTextField();
        ans4 = new javax.swing.JTextField();
        ans3 = new javax.swing.JTextField();
        Price = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        GIFBackground = new javax.swing.JLabel();

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
        Nextbutton.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        Nextbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/240_F_32348946_6LyWrw8sTY2hwuIRC85khoCh4nva4ir1.png"))); // NOI18N
        Nextbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        Nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextbuttonActionPerformed(evt);
            }
        });
        Background.add(Nextbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 170, 80));

        Helpbutton.setBackground(new java.awt.Color(0, 0, 0));
        Helpbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/123240_F_23491219_chLIEgNXQ14097Th8BW1iLDdX9nfrFAJ.jpg"))); // NOI18N
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
        Background.add(Helpbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 170, 80));

        BackButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        BackButton.setText("BACK");
        BackButton.setToolTipText("");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        Background.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 60));

        Question.setEditable(false);
        Question.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Question.setForeground(new java.awt.Color(0, 0, 255));
        Question.setText("                                      Questions");
        Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionActionPerformed(evt);
            }
        });
        Background.add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 480, 80));

        ans1.setEditable(false);
        ans1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ans1.setForeground(new java.awt.Color(0, 153, 0));
        ans1.setText("                     ans1");
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
        Background.add(ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, 50));

        ans2.setEditable(false);
        ans2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ans2.setForeground(new java.awt.Color(255, 153, 0));
        ans2.setText("                     ans2");
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
        Background.add(ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 210, 50));

        ans4.setEditable(false);
        ans4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ans4.setForeground(new java.awt.Color(0, 204, 204));
        ans4.setText("                     ans4");
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
        Background.add(ans4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 210, 50));

        ans3.setEditable(false);
        ans3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ans3.setForeground(new java.awt.Color(153, 0, 153));
        ans3.setText("                     ans3");
        ans3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ans3MouseClicked(evt);
            }
        });
        ans3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans3ActionPerformed(evt);
            }
        });
        Background.add(ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 210, 50));

        Price.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/starter.png"))); // NOI18N
        Price.setText("jLabel1");
        Price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 5));
        Background.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 260, 390));
        Price.getAccessibleContext().setAccessibleName("");
        Price.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/sandtime.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 160, 180));

        GIFBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/f43d23e7d0d90607f2e3d473fb15a261.gif"))); // NOI18N
        Background.add(GIFBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans1ActionPerformed

    private void ans1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans1MouseClicked
       if(callquestion==1 && ans1.isFocusable()){
        ans1.setOpaque(true);
        ans1.setForeground(Color.BLACK);
        ans1.setBackground(Color.green);
        
        ImageIcon[] imagelist1=new ImageIcon[1];
           for (int i = 0; i < imagelist1.length; i++) {
         imagelist1[i]=new ImageIcon(getClass().getResource("/GUIProject/image/"+immoney1[i]));
                
           }
           if(money1<0)money1=1;
           if(money1>=0 && money1< immoney1.length){
               Price.setIcon(imagelist1[money1]);
          money1++;
           }       
    } 
    }//GEN-LAST:event_ans1MouseClicked

    private void ans3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans3MouseClicked
     if(callquestion==2 && ans3.isFocusable()){
        ans3.setOpaque(true);
        ans3.setForeground(Color.BLACK);
        ans3.setBackground(Color.green);
        
        ImageIcon[] imagelist1=new ImageIcon[1];
           for (int i = 0; i < imagelist1.length; i++) {
         imagelist1[i]=new ImageIcon(getClass().getResource("/GUIProject/image/"+immoney2[i]));
                
           }
           if(money2<0)money2=1;
           if(money2>=0 && money2< immoney2.length){
               Price.setIcon(imagelist1[money2]);
          money2++;
           }       
    }                    
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
     if(callquestion==3 && ans2.isFocusable()){
        ans2.setOpaque(true);
        ans2.setForeground(Color.BLACK);
        ans2.setBackground(Color.green);
        
        ImageIcon[] imagelist1=new ImageIcon[1];
           for (int i = 0; i < imagelist1.length; i++) {
         imagelist1[i]=new ImageIcon(getClass().getResource("/GUIProject/image/"+immoney3[i]));
                
           }
           if(money3<0)money3=1;
           if(money3>=0 && money3< immoney3.length){
               Price.setIcon(imagelist1[money3]);
          money3++;
           }       
    }                 
    }//GEN-LAST:event_ans2MouseClicked

    private void QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionActionPerformed

    private void HelpbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpbuttonActionPerformed
       Help h = new Help();
       h.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_HelpbuttonActionPerformed

    private void NextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextbuttonActionPerformed
    callquestion=callquestion+1;
        ans1.setBackground(WHITE);
        ans2.setBackground(WHITE);
        ans3.setBackground(WHITE);
        ans4.setBackground(WHITE);
 if(callquestion==1){
     Question.setText("What are two types of Network?");
     ans1.setText("A). WAN and LAN ");
     ans2.setText("B). CAN and TAN");
     ans3.setText("C). WLAN and CAN");
     ans4.setText("D). PAN and DAN");
 }
if(callquestion==2){
     Question.setText("What is the brain of any computer system?");
     ans1.setText("A). Memory");
     ans2.setText("B). ALU");
     ans3.setText("C). CPU");
     ans4.setText("D). Control unit");
 }
if(callquestion==3){
     Question.setText("Which team won EURO 2016?");
     ans1.setText("A). Spain ");
     ans2.setText("B). Portugal");
     ans3.setText("C). France");
     ans4.setText("D). Germany");
 }
if(callquestion==4){
     Question.setText("Which country have the most World cup titles?");
     ans1.setText("A). Argentina");
     ans2.setText("B). Germany");
     ans3.setText("C). Brazil");
     ans4.setText("D). Spain");
 }
if(callquestion==5){
     Question.setText("Which movie won the best picture award of Oscar 2017?");
     ans1.setText("A). La La Land");
     ans2.setText("B). Moonlight");
     ans3.setText("C). Manchester by the Sea");
     ans4.setText("D). Zootopia");
 }
    }//GEN-LAST:event_NextbuttonActionPerformed

    @SuppressWarnings("empty-statement")
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Question.setText("Are You Ready?");
       ans1.setText("");
       ans2.setText("");
       ans3.setText("");
       ans4.setText("");

    }//GEN-LAST:event_formWindowActivated

    private void HelpbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpbuttonMouseClicked
 
    }//GEN-LAST:event_HelpbuttonMouseClicked

    private void ans3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans3ActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        background b = new background();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

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
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel GIFBackground;
    private javax.swing.JButton Helpbutton;
    private javax.swing.JButton Nextbutton;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField Question;
    private javax.swing.JTextField ans1;
    private javax.swing.JTextField ans2;
    private javax.swing.JTextField ans3;
    private javax.swing.JTextField ans4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
