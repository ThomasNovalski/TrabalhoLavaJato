/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lavajato;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author thoma
 */
public class NovoVeiculo extends javax.swing.JFrame {

       TelaLavaJato inicio; 
       NovoCliente cad_cliente;
       NovoVeiculo cad_veiculo;
       
       
       DefaultListModel model = new DefaultListModel();

    public NovoVeiculo() {
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

        Marca = new javax.swing.JLabel();
        Modelo = new javax.swing.JLabel();
        Ano = new javax.swing.JLabel();
        Cor = new javax.swing.JLabel();
        Placa = new javax.swing.JLabel();
        marcaCaixa = new javax.swing.JTextField();
        modeloCaixa = new javax.swing.JTextField();
        anoCaixa = new javax.swing.JTextField();
        corCaixa = new javax.swing.JTextField();
        placaCaixa = new javax.swing.JTextField();
        confirmarVeiculo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        planoBox = new javax.swing.JComboBox<>();
        lavagem1 =  new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        lavagem2 =  new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        lavagem4 =  new javax.swing.JFormattedTextField();
        lavagem3 =  new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cliente = new javax.swing.JMenu();
        Planos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Marca.setText("Marca:");

        Modelo.setText("Modelo:");

        Ano.setText("Ano:");

        Cor.setText("Cor:");

        Placa.setText("Placa:");

        marcaCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaCaixaActionPerformed(evt);
            }
        });

        confirmarVeiculo.setText("Cadastrar Veiculo");
        confirmarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarVeiculoActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Plano Basico\n\n• 4 lavagens p/mês\n\n• Somente lavagem\n   externa\n\n• Polimento com cera\n\n• Valor R$ 220,00");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Plano Master\n\n• 4 lavagens p/mês\n\n• Lavagem externa e interna\n\n• Tratammento com tecidos e couros\n   internos\n\n• Desodorização interna\n\n• Polimento com cera\n\n• Valor R$ 450,00");
        jScrollPane2.setViewportView(jTextArea2);

        planoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plano Basico", "Plano Master" }));
        planoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planoBoxActionPerformed(evt);
            }
        });

        try {
            lavagem1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("        ##    /    ##    /   ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        lavagem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lavagem1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Agendar 1ª Lavagem");

        try {
            lavagem2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("        ##    /    ##    /   ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        lavagem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lavagem2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Agendar 2ª Lavagem");

        try {
            lavagem4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("        ##    /    ##    /   ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        lavagem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lavagem4ActionPerformed(evt);
            }
        });

        try {
            lavagem3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("        ##    /    ##    /   ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        lavagem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lavagem3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Agendar 3ª Lavagem");

        jLabel4.setText("Agendar 4ª Lavagem");

        Cliente.setText("Cliente");
        jMenuBar1.add(Cliente);

        Planos.setText("Planos");
        jMenuBar1.add(Planos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modeloCaixa)
                                    .addComponent(anoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(corCaixa)
                                    .addComponent(placaCaixa))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Placa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(135, 135, 135))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(140, 140, 140))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Modelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(128, 128, 128))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marcaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(confirmarVeiculo)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(planoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lavagem1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lavagem2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lavagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lavagem4)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Marca)
                            .addComponent(marcaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(planoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Modelo)
                            .addComponent(modeloCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ano)
                            .addComponent(anoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cor)
                            .addComponent(corCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Placa)
                            .addComponent(placaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(7, 7, 7)
                                .addComponent(lavagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(7, 7, 7)
                                .addComponent(lavagem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lavagem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lavagem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(confirmarVeiculo)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marcaCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaCaixaActionPerformed

                                         
    private void confirmarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarVeiculoActionPerformed
        String marca = marcaCaixa.getText();
        String modelo = modeloCaixa.getText();
        int ano = Integer.parseInt(anoCaixa.getText());
        String cor = corCaixa.getText();
        String placa = placaCaixa.getText();
        String lavagemUm = lavagem1.getText();
        String lavagemDois = lavagem2.getText();
        String lavagemTres = lavagem3.getText();
        String lavagemQuatro = lavagem4.getText();
        String plano =(String) planoBox.getSelectedItem();
        Veiculo veiculo = new Veiculo(marca,modelo,ano,cor,placa,plano);
        veiculo.setLavagem1(lavagemUm);
        veiculo.setLavagem2(lavagemDois);
        veiculo.setLavagem3(lavagemTres);
        veiculo.setLavagem4(lavagemQuatro);
        this.dispose();
        this.inicio.gravarNovoVeiculo(veiculo);
         JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso dados salvos:"+"\n"+"Marca: "+ veiculo.getMarca()+"\n"+"Modelo: "+veiculo.getModelo()+"\n"+"Cor:  "+veiculo.getCor()+"\n"+"Placa:  "
                 +veiculo.getPlaca()+"\n"+"Ano: "+veiculo.getAno()+"\n"+"Data primeira lavagem: "+veiculo.getLavagem1()
                 +"\n"+"Data segunda lavagem: "+veiculo.getLavagem2()+"\n"+"Data terceira lavagem: "+veiculo.getLavagem3()
                 +"\n"+"Data quarta lavagem: "+veiculo.getLavagem4()+"\n"+"Plano Escolhido"+veiculo.getPlano());
    }//GEN-LAST:event_confirmarVeiculoActionPerformed

    private void planoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planoBoxActionPerformed

    private void lavagem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lavagem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lavagem1ActionPerformed

    private void lavagem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lavagem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lavagem2ActionPerformed

    private void lavagem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lavagem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lavagem4ActionPerformed

    private void lavagem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lavagem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lavagem3ActionPerformed

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
            java.util.logging.Logger.getLogger(NovoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ano;
    private javax.swing.JMenu Cliente;
    private javax.swing.JLabel Cor;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Modelo;
    private javax.swing.JLabel Placa;
    private javax.swing.JMenu Planos;
    private javax.swing.JTextField anoCaixa;
    private javax.swing.JButton confirmarVeiculo;
    private javax.swing.JTextField corCaixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JFormattedTextField lavagem1;
    private javax.swing.JFormattedTextField lavagem2;
    private javax.swing.JFormattedTextField lavagem3;
    private javax.swing.JFormattedTextField lavagem4;
    private javax.swing.JTextField marcaCaixa;
    private javax.swing.JTextField modeloCaixa;
    private javax.swing.JTextField placaCaixa;
    private javax.swing.JComboBox<String> planoBox;
    // End of variables declaration//GEN-END:variables
}
