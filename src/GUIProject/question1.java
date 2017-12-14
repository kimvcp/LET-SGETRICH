/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIProject;

/**
 * This is the class for playing the game so all the other classes are linked to
 * this class.
 *
 * @author Vichaphol Thamsuthikul and Chawanant Kerdchuen
 */
import static java.awt.Color.WHITE;
import java.io.InputStream;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class question1 extends javax.swing.JFrame {

    /**
     * Creates new form question1
     */
    public static int clickCount = 1;
    static int questionAmount = 1;
    static int questionCount = 0;
    static int winCount = 0;
    boolean[] askRandom = new boolean[21];
    Random randomNumber = new Random();
    WAFQ w = new WAFQ();
    static int callquestion;
    public static int helpCount = 3;
    static int saveQuestion = 0;

    public void setRandom() {
        for (int i = 0; i < askRandom.length; i++) {
            askRandom[i] = true;
        }
    }

    public void setCount() {
        count.setText(String.format("%d", helpCount));
    }

    public question1() {
        initComponents();
        setRandom();
        congrat.setVisible(false);
        this.clickCount = 0;
        Question.setText("Please click the next button");
        setCount();
        ans1.setText("");
        ans2.setText("");
        ans3.setText("");
        ans4.setText("");
        init("GUIProject/QandA/question.TXT", Questions);
        init("GUIProject/QandA/ans1.TXT", Ans1);
        init("GUIProject/QandA/ans2.TXT", Ans2);
        init("GUIProject/QandA/ans3.TXT", Ans3);
        init("GUIProject/QandA/ans4.TXT", Ans4);
        init("GUIProject/QandA/Answer.TXT", Answer);
    }

    public List<String> Questions = new ArrayList<>();
    public List<String> Ans1 = new ArrayList<>();
    public List<String> Ans2 = new ArrayList<>();
    public List<String> Ans3 = new ArrayList<>();
    public List<String> Ans4 = new ArrayList<>();
    public List<String> Answer = new ArrayList<>();

    public void init(String filename, List a) {
        ClassLoader loader = question1.class.getClassLoader();
        InputStream in = loader.getResourceAsStream(filename);
        if (in == null) {
            System.out.println("Could not access file " + filename);
            return;
        } else {
            Scanner reader = new Scanner(in);
            while (reader.hasNextLine()) {
                a.add(reader.nextLine());
            }
        }
    }

    @SuppressWarnings("unchecked")

    public String returnSetImage(int what) {
        if (what == 0) {
            return "starter.png";
        } else if (what == 1) {
            return "money1.jpg";
        } else if (what == 2) {
            return "money2.png";
        } else if (what == 3) {
            return "money3.png";
        } else if (what == 4) {
            return "money4.png";
        } else if (what == 5) {
            return "money5.png";
        } else if (what == 6) {
            return "money6.png";
        } else if (what == 7) {
            return "money7.png";
        } else if (what == 8) {
            return "money8.png";
        } else if (what == 9) {
            return "money9.png";
        } else {
            return null;
        }
    }

    public void setImagePrice() {
        Price.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/" + returnSetImage(winCount))));
    }

    public void setMoney(int what) {
        if (what == 9) {
            congrat.setText("Congratuation! you won the game");
            congrat.setVisible(true);
        } else if (what == 8) {
            congrat.setText("Congratuation! you got 700,000 Baht");
            congrat.setVisible(true);
        } else if (what == 7) {
            congrat.setText("Congratuation! you got 500,000 Baht");
            congrat.setVisible(true);
        } else if (what == 6) {
            congrat.setText("Congratuation! you got 300,000 Baht");
            congrat.setVisible(true);
        } else if (what == 5) {
            congrat.setText("Congratuation! you got 150,000 Baht");
            congrat.setVisible(true);
        } else if (what == 4) {
            congrat.setText("Congratuation! you got 100,000 Baht");
            congrat.setVisible(true);
        } else if (what == 3) {
            congrat.setText("Congratuation! you got 50,000 Baht");
            congrat.setVisible(true);
        } else if (what == 2) {
            congrat.setText("Congratuation! you got 25,000 Baht");
            congrat.setVisible(true);
        } else if (what == 1) {
            congrat.setText("Congratuation! you got 10,000 Baht");
            congrat.setVisible(true);
        }

    }

    public void setSaveQuestion() {
        Question.setText(Questions.get(saveQuestion));
        ans1.setText(Ans1.get(saveQuestion));
        ans2.setText(Ans2.get(saveQuestion));
        ans3.setText(Ans3.get(saveQuestion));
        ans4.setText(Ans4.get(saveQuestion));
    }

    public void runNextButt() {
        clickCount = 1;
        ans1.setBackground(WHITE);
        ans2.setBackground(WHITE);
        ans3.setBackground(WHITE);
        ans4.setBackground(WHITE);

        while (true) {
            if (questionCount >= 9) {
                break;
            }

            callquestion = randomNumber.nextInt(20);
            if (askRandom[callquestion]) {
                askRandom[callquestion] = false;
                questionCount++;
                break;
            }
        }
        Question.setText(Questions.get(callquestion));
        ans1.setText(Ans1.get(callquestion));
        ans2.setText(Ans2.get(callquestion));
        ans3.setText(Ans3.get(callquestion));
        ans4.setText(Ans4.get(callquestion));

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        congrat = new javax.swing.JTextField();
        Nextbutton = new javax.swing.JButton();
        Helpbutton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        Question = new javax.swing.JTextField();
        ans1 = new javax.swing.JTextField();
        ans2 = new javax.swing.JTextField();
        ans4 = new javax.swing.JTextField();
        ans3 = new javax.swing.JTextField();
        Price = new javax.swing.JLabel();
        SandTime = new javax.swing.JLabel();
        count = new javax.swing.JTextField();
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

        congrat.setBackground(new java.awt.Color(255, 255, 0));
        congrat.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        congrat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        congrat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 7));
        congrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congratActionPerformed(evt);
            }
        });
        Background.add(congrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 380));

        Nextbutton.setBackground(new java.awt.Color(0, 0, 0));
        Nextbutton.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        Nextbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/240_F_32348946_6LyWrw8sTY2hwuIRC85khoCh4nva4ir1.png"))); // NOI18N
        Nextbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        Nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextbuttonActionPerformed(evt);
            }
        });
        Background.add(Nextbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 170, 80));

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
        Question.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Question.setText("Questions");
        Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionActionPerformed(evt);
            }
        });
        Background.add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 520, 70));

        ans1.setEditable(false);
        ans1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
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
        Background.add(ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 240, 50));

        ans2.setEditable(false);
        ans2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
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
        Background.add(ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 240, 50));

        ans4.setEditable(false);
        ans4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
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
        Background.add(ans4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 240, 50));

        ans3.setEditable(false);
        ans3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
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
        Background.add(ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 50));

        Price.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/starter.png"))); // NOI18N
        Price.setText("jLabel1");
        Price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 5));
        Background.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 260, 390));
        Price.getAccessibleContext().setAccessibleName("");
        Price.getAccessibleContext().setAccessibleDescription("");

        SandTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/sandtime.png"))); // NOI18N
        SandTime.setText("jLabel1");
        Background.add(SandTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 160, 180));

        count.setEditable(false);
        count.setFont(new java.awt.Font("Orator Std", 1, 18)); // NOI18N
        count.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        count.setText("count");
        Background.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 30, -1));

        GIFBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/f43d23e7d0d90607f2e3d473fb15a261.gif"))); // NOI18N
        Background.add(GIFBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        setBounds(530, 180, 818, 647);
    }// </editor-fold>//GEN-END:initComponents

    private void ans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans1ActionPerformed
    /**
     *
     */
    private void ans1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans1MouseClicked
        if (clickCount == 1) {
            if (Ans1.get(callquestion).equals(Answer.get(callquestion))) {
                winCount++;
                ans1.setOpaque(true);
                ans1.setBackground(Color.green);

            } else {
                ans1.setOpaque(true);
                ans1.setBackground(Color.red);
                if (winCount <= 0) {
                    w.setVisible(true);
                    this.setVisible(false);
                    clickCount = 1;
                } else {
                    winCount--;
                }
            }
            clickCount = 0;
            if (winCount > 9) {

            }
            setImagePrice();
        }

    }//GEN-LAST:event_ans1MouseClicked
    /**
     *
     */
    private void ans3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans3MouseClicked
        if (clickCount == 1) {
            if (Ans3.get(callquestion).equals(Answer.get(callquestion))) {
                ans3.setOpaque(true);
                ans3.setBackground(Color.green);
                winCount++;
            } else {
                ans3.setOpaque(true);
                ans3.setBackground(Color.red);
                if (winCount <= 0) {
                    w.setVisible(true);
                    this.setVisible(false);
                    clickCount = 1;
                } else {
                    winCount--;
                }
            }
            clickCount = 0;
            setImagePrice();
        }
    }//GEN-LAST:event_ans3MouseClicked

    private void ans4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans4ActionPerformed
    /**
     *
     */
    private void ans4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans4MouseClicked
        if (clickCount == 1) {
            if (Ans4.get(callquestion).equals(Answer.get(callquestion))) {
                ans4.setOpaque(true);
                ans4.setBackground(Color.green);
                winCount++;
            } else {
                ans4.setOpaque(true);
                ans4.setBackground(Color.red);
                if (winCount <= 0) {
                    w.setVisible(true);
                    this.setVisible(false);
                    clickCount = 1;
                } else {
                    winCount--;
                }
            }
            clickCount = 0;
            setImagePrice();
        }
    }//GEN-LAST:event_ans4MouseClicked

    private void ans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans2ActionPerformed
    /**
     *
     */
    private void ans2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans2MouseClicked
        if (clickCount == 1) {
            if (Ans2.get(callquestion).equals(Answer.get(callquestion))) {
                ans2.setOpaque(true);
                ans2.setBackground(Color.green);
                winCount++;
            } else {
                ans2.setOpaque(true);
                ans2.setBackground(Color.red);
                if (winCount <= 0) {
                    w.setVisible(true);
                    this.setVisible(false);
                    clickCount = 1;
                } else {
                    winCount--;
                }
            }
            clickCount = 0;
            setImagePrice();
        }
    }//GEN-LAST:event_ans2MouseClicked

    private void QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionActionPerformed
    /**
     *
     */
    private void HelpbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpbuttonActionPerformed

        if (clickCount == 1) {
            if (helpCount == 3 || helpCount == 2 || helpCount == 1) {
                helpCount--;
                Help h = new Help(this);
                h.setVisible(true);
                this.setVisible(false);

            }
            clickCount = 0;
            questionCount = 0;
        }
        if (helpCount == 0) {
            Helpbutton.setEnabled(false);
            clickCount = 1;
        }

        saveQuestion = callquestion;
    }//GEN-LAST:event_HelpbuttonActionPerformed
    /**
     *
     */
    private void NextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextbuttonActionPerformed

        if (clickCount == 0) {
            runNextButt();
            questionAmount++;
        }
        if (questionAmount > 10) {
            setMoney(winCount);
        }
    }//GEN-LAST:event_NextbuttonActionPerformed

    @SuppressWarnings("empty-statement")
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void HelpbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpbuttonMouseClicked

    }//GEN-LAST:event_HelpbuttonMouseClicked

    private void ans3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans3ActionPerformed
    /**
     *
     */
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        this.setVisible(false);
        background b = new background();
        b.setVisible(true);
        winCount = 0;
        questionAmount = 1;
        helpCount = 3;
    }//GEN-LAST:event_BackButtonActionPerformed

    private void congratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_congratActionPerformed

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

    @Override
    public int getComponentZOrder(Component comp) {
        return super.getComponentZOrder(comp); //To change body of generated methods, choose Tools | Templates.
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel GIFBackground;
    private javax.swing.JButton Helpbutton;
    private javax.swing.JButton Nextbutton;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField Question;
    private javax.swing.JLabel SandTime;
    private javax.swing.JTextField ans1;
    private javax.swing.JTextField ans2;
    private javax.swing.JTextField ans3;
    private javax.swing.JTextField ans4;
    private javax.swing.JTextField congrat;
    private javax.swing.JTextField count;
    // End of variables declaration//GEN-END:variables
}
