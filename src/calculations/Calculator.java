/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculations;

/**
 *
 * @author adels
 */
public class Calculator extends javax.swing.JFrame {
    MyCalc  Casio;
    public Calculator() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        TextArea = new javax.swing.JTextField();
        Number_0 = new javax.swing.JButton();
        Number_1 = new javax.swing.JButton();
        Number_2 = new javax.swing.JButton();
        Number_3 = new javax.swing.JButton();
        Number_4 = new javax.swing.JButton();
        Number_5 = new javax.swing.JButton();
        Number_8 = new javax.swing.JButton();
        Number_6 = new javax.swing.JButton();
        Number_9 = new javax.swing.JButton();
        Number_7 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Operation_Multiply = new javax.swing.JButton();
        Operation_Minus = new javax.swing.JButton();
        Operation_Plus = new javax.swing.JButton();
        Operation_Divide = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        Operation_Equal = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Operation_Power = new javax.swing.JButton();
        Operation_Factorial = new javax.swing.JButton();

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("1");
        jButton2.setName("1"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextArea.setName("textField"); // NOI18N

        Number_0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Number_0.setText("0");
        Number_0.setName("0"); // NOI18N
        Number_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_0ActionPerformed(evt);
            }
        });

        Number_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Number_1.setText("1");
        Number_1.setName("1"); // NOI18N
        Number_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_1ActionPerformed(evt);
            }
        });

        Number_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Number_2.setText("2");
        Number_2.setName("2"); // NOI18N
        Number_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_2ActionPerformed(evt);
            }
        });

        Number_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Number_3.setText("3");
        Number_3.setName("3"); // NOI18N
        Number_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_3ActionPerformed(evt);
            }
        });

        Number_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Number_4.setText("4");
        Number_4.setName("4"); // NOI18N
        Number_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_4ActionPerformed(evt);
            }
        });

        Number_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Number_5.setText("5");
        Number_5.setToolTipText("");
        Number_5.setName("5"); // NOI18N
        Number_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_5ActionPerformed(evt);
            }
        });

        Number_8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Number_8.setText("8");
        Number_8.setName("8"); // NOI18N
        Number_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_8ActionPerformed(evt);
            }
        });

        Number_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Number_6.setText("6");
        Number_6.setName("6"); // NOI18N
        Number_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_6ActionPerformed(evt);
            }
        });

        Number_9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Number_9.setText("9");
        Number_9.setName("9"); // NOI18N
        Number_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_9ActionPerformed(evt);
            }
        });

        Number_7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Number_7.setText("7");
        Number_7.setName("7"); // NOI18N
        Number_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_7ActionPerformed(evt);
            }
        });

        Operation_Multiply.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Operation_Multiply.setText("*");
        Operation_Multiply.setToolTipText("");
        Operation_Multiply.setName("*"); // NOI18N
        Operation_Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operation_MultiplyActionPerformed(evt);
            }
        });

        Operation_Minus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Operation_Minus.setText("-");
        Operation_Minus.setName("-"); // NOI18N
        Operation_Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operation_MinusActionPerformed(evt);
            }
        });

        Operation_Plus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Operation_Plus.setText("+");
        Operation_Plus.setName("+"); // NOI18N
        Operation_Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operation_PlusActionPerformed(evt);
            }
        });

        Operation_Divide.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Operation_Divide.setText("/");
        Operation_Divide.setName("/"); // NOI18N
        Operation_Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operation_DivideActionPerformed(evt);
            }
        });

        dot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot.setText(".");
        dot.setName("."); // NOI18N
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        Operation_Equal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Operation_Equal.setText("=");
        Operation_Equal.setName("="); // NOI18N
        Operation_Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operation_EqualActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Clear.setText("C");
        Clear.setName("C"); // NOI18N
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Operation_Power.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Operation_Power.setText("^");
        Operation_Power.setName("^"); // NOI18N
        Operation_Power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operation_PowerActionPerformed(evt);
            }
        });

        Operation_Factorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Operation_Factorial.setLabel("!");
        Operation_Factorial.setName("^"); // NOI18N
        Operation_Factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operation_FactorialActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSeparator1)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(TextArea)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(Number_5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(Number_6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(Number_7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(Number_8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(Number_9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(Number_0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(Number_1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(Number_2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(Number_3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(Number_4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(Operation_Equal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(Clear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(dot, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(36, 36, 36)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Operation_Plus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Operation_Power, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Operation_Minus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Operation_Factorial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(Operation_Multiply, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(Operation_Divide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(TextArea, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Number_0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Number_1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Number_2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Number_3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Number_4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Clear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(dot, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Number_8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Number_7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Number_9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Number_6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Number_5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Operation_Equal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Operation_Plus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Operation_Minus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Operation_Multiply, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Operation_Divide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Operation_Power, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Operation_Factorial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        Operation_Factorial.getAccessibleContext().setAccessibleName("!");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Operation_MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operation_MultiplyActionPerformed
       Casio = new MyCalc(Double.parseDouble(TextArea.getText()),'*');
    }//GEN-LAST:event_Operation_MultiplyActionPerformed

    private void Operation_MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operation_MinusActionPerformed
       Casio = new MyCalc(Double.parseDouble(TextArea.getText()),'-');
    }//GEN-LAST:event_Operation_MinusActionPerformed

    private void Operation_PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operation_PlusActionPerformed
       Casio = new MyCalc(Double.parseDouble(TextArea.getText()),'+');
    }//GEN-LAST:event_Operation_PlusActionPerformed

    private void Operation_DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operation_DivideActionPerformed
               Casio = new MyCalc(Double.parseDouble(TextArea.getText()),'/');
    }//GEN-LAST:event_Operation_DivideActionPerformed

    private void Number_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_0ActionPerformed
        String enteredNumber = TextArea.getText()+Number_0.getText();
        TextArea.setText(enteredNumber);
    }//GEN-LAST:event_Number_0ActionPerformed

    private void Number_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_1ActionPerformed
        String enteredNumber = TextArea.getText()+Number_1.getText();
            TextArea.setText(enteredNumber);        
    }//GEN-LAST:event_Number_1ActionPerformed

    private void Number_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_2ActionPerformed
        String enteredNumber = TextArea.getText()+Number_2.getText();
        TextArea.setText(enteredNumber);
    }//GEN-LAST:event_Number_2ActionPerformed

    private void Number_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_3ActionPerformed
         String enteredNumber = TextArea.getText()+Number_3.getText();
        TextArea.setText(enteredNumber);     
    }//GEN-LAST:event_Number_3ActionPerformed

    private void Number_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_4ActionPerformed
        String enteredNumber = TextArea.getText()+Number_4.getText();
        TextArea.setText(enteredNumber);     
    }//GEN-LAST:event_Number_4ActionPerformed

    private void Number_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_5ActionPerformed
        String enteredNumber = TextArea.getText()+Number_5.getText();
        TextArea.setText(enteredNumber);
    }//GEN-LAST:event_Number_5ActionPerformed

    private void Number_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_6ActionPerformed
            String enteredNumber = TextArea.getText()+Number_6.getText();
           TextArea.setText(enteredNumber);
    }//GEN-LAST:event_Number_6ActionPerformed

    private void Number_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_7ActionPerformed
        String enteredNumber = TextArea.getText()+Number_0.getText();
        TextArea.setText(enteredNumber);      
    }//GEN-LAST:event_Number_7ActionPerformed

    private void Number_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_8ActionPerformed
        String enteredNumber = TextArea.getText()+Number_0.getText();
        TextArea.setText(enteredNumber);        
    }//GEN-LAST:event_Number_8ActionPerformed

    private void Number_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_9ActionPerformed
        String enteredNumber = TextArea.getText()+Number_0.getText();
        TextArea.setText(enteredNumber);        
    }//GEN-LAST:event_Number_9ActionPerformed

    private void Operation_EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operation_EqualActionPerformed
         String answer = "0";
        Casio.secondNumber= Double.parseDouble(TextArea.getText());
        if (Casio.Operation == '+')
        {
            answer = String.format("%.00f",Casio.Add());
        }
        else if (Casio.Operation == '-')
        {
            answer = String.format("%.00f",Casio.Subtract());
        }
        else if (Casio.Operation == '*')
        {
            answer = String.format("%.00f",Casio.Multiply());
        }
        else if (Casio.Operation == '/')
        {  
            answer = String.format("%.00f",Casio.Division());
        }
        else if (Casio.Operation == '^')
        {  
            answer = String.format("%.00f",Casio.Power());
        }
        else if (Casio.Operation == '!')
        {  
            answer = String.format("%.00f",Casio.Factorial());
        }
        
           TextArea.setText(answer);
    }//GEN-LAST:event_Operation_EqualActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
          String enteredNumber = TextArea.getText()+dot.getText();
        TextArea.setText(enteredNumber); 
    }//GEN-LAST:event_dotActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        TextArea.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void Operation_PowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operation_PowerActionPerformed
        Casio = new MyCalc(Double.parseDouble(TextArea.getText()),'^');
    }//GEN-LAST:event_Operation_PowerActionPerformed

    private void Operation_FactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operation_FactorialActionPerformed
      Casio = new MyCalc(Double.parseDouble(TextArea.getText()),'!');
    }//GEN-LAST:event_Operation_FactorialActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Number_0;
    private javax.swing.JButton Number_1;
    private javax.swing.JButton Number_2;
    private javax.swing.JButton Number_3;
    private javax.swing.JButton Number_4;
    private javax.swing.JButton Number_5;
    private javax.swing.JButton Number_6;
    private javax.swing.JButton Number_7;
    private javax.swing.JButton Number_8;
    private javax.swing.JButton Number_9;
    private javax.swing.JButton Operation_Divide;
    private javax.swing.JButton Operation_Equal;
    private javax.swing.JButton Operation_Factorial;
    private javax.swing.JButton Operation_Minus;
    private javax.swing.JButton Operation_Multiply;
    private javax.swing.JButton Operation_Plus;
    private javax.swing.JButton Operation_Power;
    private javax.swing.JTextField TextArea;
    private javax.swing.JButton dot;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
