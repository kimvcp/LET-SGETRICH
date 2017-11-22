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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class question1 extends javax.swing.JFrame {

    /**
     * Creates new form question1
     */  
    boolean [] ard = new boolean[15];
    Random rd = new Random();
    static int count=0;
    
    public void setRandom(){
    for(int i=0; i< ard.length;i++){
        ard[i] = true;
    }
    }
    public question1() {
        initComponents();
        setRandom();
    }
    public List <String> Questions = new ArrayList<>();
    public List <String> Ans1 = new ArrayList<>();
    public List <String> Ans2 = new ArrayList<>();
    public List <String> Ans3 = new ArrayList<>();
    public List <String> Ans4 = new ArrayList<>();
     
    public void init(String filename , List a) {
		File file = new File(filename);
		if (file == null) {
			System.out.println("Could not access file " + file);
			return;
		}else{
                    try {
                      Scanner   reader = new Scanner(file);
                        while (reader.hasNextLine()) {
			a.add(reader.nextLine());
                        
		}
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(question1.class.getName()).log(Level.SEVERE, null, ex);
                    }
		
                }
	}

     @SuppressWarnings("unchecked")

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
    String[]immoney5={"money5.png"};
    int money6=0;
    String[]immoney6={"money6.png"};
    int money7=0;
    String[]immoney7={"money7.png"};
    int money8=0;
    String[]immoney8={"money8.png"};
    int money9=0;
    String[]immoney9={"money9.png"};
    
    
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
        SandTime = new javax.swing.JLabel();
        Jackpot = new javax.swing.JLabel();
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
        Question.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Question.setText("Questions");
        Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionActionPerformed(evt);
            }
        });
        Background.add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 480, 70));

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
        Background.add(ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, 50));

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
        Background.add(ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 210, 50));

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
        Background.add(ans4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 210, 50));

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
        Background.add(ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 210, 50));

        Price.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/starter.png"))); // NOI18N
        Price.setText("jLabel1");
        Price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 5));
        Background.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 260, 390));
        Price.getAccessibleContext().setAccessibleName("");
        Price.getAccessibleContext().setAccessibleDescription("");

        SandTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIProject/image/sandtime.png"))); // NOI18N
        SandTime.setText("jLabel1");
        Background.add(SandTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 160, 180));
        Background.add(Jackpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 220, 70));

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
        if(callquestion==2){
        ans1.setOpaque(true);
        ans1.setBackground(Color.red);
          }
        if(callquestion==3 ){
         ans1.setOpaque(true);
        ans1.setBackground(Color.red); 
        }
        if(callquestion==4){
        ans1.setOpaque(true);
        ans1.setBackground(Color.red);
        }
        if(callquestion==5){
        ans1.setOpaque(true);
        ans1.setBackground(Color.red);
        } 
        if(callquestion==6){
        ans1.setOpaque(true);
        ans1.setBackground(Color.red);
        }  
        if(callquestion==7 && ans1.isFocusable()){
        ans1.setOpaque(true);
        ans1.setBackground(Color.green);
        
        ImageIcon[] imagelist1=new ImageIcon[1];
           for (int i = 0; i < imagelist1.length; i++) {
         imagelist1[i]=new ImageIcon(getClass().getResource("/GUIProject/image/"+immoney7[i]));
                
           }
           if(money7<0)money7=1;
           if(money7>=0 && money7< immoney7.length){
               Price.setIcon(imagelist1[money7]);
          money7++;
           }}   
         
        if(callquestion==8){
        ans1.setOpaque(true);
        ans1.setBackground(Color.red);}
         if(callquestion==9){
        ans1.setOpaque(true);
        ans1.setBackground(Color.red);
    
    }                                 
           
           
    }//GEN-LAST:event_ans1MouseClicked

    private void ans3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans3MouseClicked

        if(callquestion==1 && ans3.isFocusable()){
        ans3.setOpaque(true);
        ans3.setBackground(Color.red);
        WAFQ w = new WAFQ();
        w.setVisible(true);
         }
        if(callquestion==2 && ans3.isFocusable()){
        ans3.setOpaque(true);
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
        if(callquestion==3){
        ans3.setOpaque(true);
        ans3.setBackground(Color.red);
        }
         if(callquestion==4 && ans3.isFocusable()){
        ans3.setOpaque(true);
        ans3.setBackground(Color.green);
        
        ImageIcon[] imagelist1=new ImageIcon[1];
           for (int i = 0; i < imagelist1.length; i++) {
         imagelist1[i]=new ImageIcon(getClass().getResource("/GUIProject/image/"+immoney4[i]));     
           }
           if(money4<0)money4=1;
           if(money4>=0 && money4< immoney4.length){
               Price.setIcon(imagelist1[money4]);
          money4++;
           }       
        }
         
        
        if(callquestion==5){
        ans3.setOpaque(true);
        ans3.setBackground(Color.red);
        }
        if(callquestion==6){
        ans3.setOpaque(true);
        ans3.setBackground(Color.red);
        }
       if(callquestion==7){
        ans3.setOpaque(true);
        ans3.setBackground(Color.red);
      }
       if(callquestion==8){
        ans3.setOpaque(true);
        ans3.setBackground(Color.red);
      }
       
       if(callquestion==9 && ans3.isFocusable()){
        ans3.setOpaque(true);
        ans3.setBackground(Color.green);
        
        ImageIcon[] imagelist1=new ImageIcon[1];
           for (int i = 0; i < imagelist1.length; i++) {
         imagelist1[i]=new ImageIcon(getClass().getResource("/GUIProject/image/"+immoney9[i]));
                
           }
           if(money9<0)money9=1;
           if(money9>=0 && money9< immoney9.length){
               Price.setIcon(imagelist1[money9]);
          money9++;
           }       }

    
    }//GEN-LAST:event_ans3MouseClicked

    private void ans4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans4ActionPerformed

    private void ans4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans4MouseClicked

        if(callquestion==1 && ans4.isFocusable()){
        ans4.setOpaque(true);
        ans4.setBackground(Color.red);
        WAFQ w = new WAFQ();
        w.setVisible(true);
         }
        if(callquestion==2){
        ans4.setOpaque(true);
        ans4.setBackground(Color.red);
         }
        if(callquestion==3){
        ans4.setOpaque(true);
        ans4.setBackground(Color.red);
         }
        if(callquestion==4){
        ans4.setOpaque(true);
        ans4.setBackground(Color.red);
         }
        if(callquestion==5 && ans4.isFocusable()){
        ans4.setOpaque(true);
        ans4.setBackground(Color.green);
        
        ImageIcon[] imagelist1=new ImageIcon[1];
           for (int i = 0; i < imagelist1.length; i++) {
         imagelist1[i]=new ImageIcon(getClass().getResource("/GUIProject/image/"+immoney5[i]));    
           }
           if(money5<0)money5=1;
           if(money5>=0 && money5< immoney5.length){
               Price.setIcon(imagelist1[money5]);
          money5++;
           }       
         
         }
        
        if(callquestion==6){
        ans4.setOpaque(true);
        ans4.setBackground(Color.red);}
        if(callquestion==7){
        ans4.setOpaque(true);
        ans4.setBackground(Color.red);}
        if(callquestion==8){
        ans4.setOpaque(true);
        ans4.setBackground(Color.red);}
        if(callquestion==9){
        ans4.setOpaque(true);
        ans4.setBackground(Color.red);}
         
         
    }//GEN-LAST:event_ans4MouseClicked

    private void ans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans2ActionPerformed

    private void ans2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ans2MouseClicked
         
        if(callquestion==1 && ans2.isFocusable()){
        ans2.setOpaque(true);
        ans2.setBackground(Color.red);
        WAFQ w = new WAFQ();
        w.setVisible(true);
        }
        if(callquestion==2){
        ans2.setOpaque(true);
        ans2.setBackground(Color.red);}
        if(callquestion==3 && ans2.isFocusable()){
        ans2.setOpaque(true);
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
        if(callquestion==4){
        ans2.setOpaque(true);
        ans2.setBackground(Color.red);}
        if(callquestion==5){
        ans2.setOpaque(true);
        ans2.setBackground(Color.red);}
        if(callquestion==6 && ans2.isFocusable()){
        ans2.setOpaque(true);
        ans2.setBackground(Color.green);
         ImageIcon[] imagelist1=new ImageIcon[1];
           for (int i = 0; i < imagelist1.length; i++) {
         imagelist1[i]=new ImageIcon(getClass().getResource("/GUIProject/image/"+immoney6[i]));
                
           }
           if(money6<0)money6=1;
           if(money6>=0 && money6< immoney6.length){
            Price.setIcon(imagelist1[money6]);
          money6++;
           }       
         }
        if(callquestion==7){
        ans2.setOpaque(true);
        ans2.setBackground(Color.red);}
        
       if(callquestion==8 && ans2.isFocusable()){
        ans2.setOpaque(true);
        ans2.setBackground(Color.green);
        
        ImageIcon[] imagelist1=new ImageIcon[1];
           for (int i = 0; i < imagelist1.length; i++) {
         imagelist1[i]=new ImageIcon(getClass().getResource("/GUIProject/image/"+immoney8[i]));
                
           }
           if(money8<0)money8=1;
           if(money8>=0 && money8< immoney8.length){
               Price.setIcon(imagelist1[money8]);
          money8++;
           }   }
      
        if(callquestion==9){
        ans2.setOpaque(true);
        ans2.setBackground(Color.red);}
        
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
    
        ans1.setBackground(WHITE);
        ans2.setBackground(WHITE);
        ans3.setBackground(WHITE);
        ans4.setBackground(WHITE);
        
    init("src\\GUIProject\\QandA/question.TXT",Questions);
    init("src\\GUIProject\\QandA/ans1.TXT",Ans1);
    init("src\\GUIProject\\QandA/ans2.TXT",Ans2);
    init("src\\GUIProject\\QandA/ans3.TXT",Ans3);
    init("src\\GUIProject\\QandA/ans4.TXT",Ans4);
   
    int callquestion = 0;
    
    while (true){
    if(count >= 15)
         break;
    
    callquestion = rd.nextInt(15)+1;
     if(!ard[callquestion-1]==false){
           ard[callquestion-1] = false;
           count++;
           System.out.println(count);
           break;
      }
     
    }
 if(callquestion == 1){
     Question.setText(Questions.get(0));
     ans1.setText(Ans1.get(0));
     ans2.setText(Ans2.get(0));
     ans3.setText(Ans3.get(0));
     ans4.setText(Ans4.get(0));
 }
if(callquestion==2){
     Question.setText(Questions.get(1));
     ans1.setText(Ans1.get(1));
     ans2.setText(Ans2.get(1));
     ans3.setText(Ans3.get(1));
     ans4.setText(Ans4.get(1));
 }
if(callquestion==3){
     Question.setText(Questions.get(2));
     ans1.setText(Ans1.get(2));
     ans2.setText(Ans2.get(2));
     ans3.setText(Ans3.get(2));
     ans4.setText(Ans4.get(2));
 }
if(callquestion==4){
     Question.setText(Questions.get(3));
     ans1.setText(Ans1.get(3));
     ans2.setText(Ans2.get(3));
     ans3.setText(Ans3.get(3));
     ans4.setText(Ans4.get(3));
 }
if(callquestion==5){
     Question.setText(Questions.get(4));
     ans1.setText(Ans1.get(4));
     ans2.setText(Ans2.get(4));
     ans3.setText(Ans3.get(4));
     ans4.setText(Ans4.get(4));
 }
if(callquestion==6){
     Question.setText(Questions.get(5));
     ans1.setText(Ans1.get(5));
     ans2.setText(Ans2.get(5));
     ans3.setText(Ans3.get(5));
     ans4.setText(Ans4.get(5));
 }
if(callquestion==7){
     Question.setText(Questions.get(6));
     ans1.setText(Ans1.get(6));
     ans2.setText(Ans2.get(6));
     ans3.setText(Ans3.get(6));
     ans4.setText(Ans4.get(6));
 }
if(callquestion==8){
     Question.setText(Questions.get(7));
     ans1.setText(Ans1.get(7));
     ans2.setText(Ans2.get(7));
     ans3.setText(Ans3.get(7));
     ans4.setText(Ans4.get(7));
 
 }
if(callquestion==9){
     Question.setText(Questions.get(8));
     ans1.setText(Ans1.get(8));
     ans2.setText(Ans2.get(8));
     ans3.setText(Ans3.get(8));
     ans4.setText(Ans4.get(8));
 }if(callquestion==10){
     Question.setText(Questions.get(9));
     ans1.setText(Ans1.get(9));
     ans2.setText(Ans2.get(9));
     ans3.setText(Ans3.get(9));
     ans4.setText(Ans4.get(9));
 }
if(callquestion==11){
     Question.setText(Questions.get(10));
     ans1.setText(Ans1.get(10));
     ans2.setText(Ans2.get(10));
     ans3.setText(Ans3.get(10));
     ans4.setText(Ans4.get(10));
 }
if(callquestion==12){
     Question.setText("");
     ans1.setText("A). ");
     ans2.setText("B). ");
     ans3.setText("C). ");
     ans4.setText("D). ");
 }
if(callquestion==13){
     Question.setText("");
     ans1.setText("A). ");
     ans2.setText("B). ");
     ans3.setText("C). ");
     ans4.setText("D). ");
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
    private javax.swing.JLabel Jackpot;
    private javax.swing.JButton Nextbutton;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField Question;
    private javax.swing.JLabel SandTime;
    private javax.swing.JTextField ans1;
    private javax.swing.JTextField ans2;
    private javax.swing.JTextField ans3;
    private javax.swing.JTextField ans4;
    // End of variables declaration//GEN-END:variables
}
