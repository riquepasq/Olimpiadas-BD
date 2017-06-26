/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import database.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Henrique
 */
public class AlterarRotina extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarPreparador
     */
    
    public AlterarRotina() throws SQLException {
        initComponents();
        populatePreps();
        //populateRotinas();
    }
    RotinaDAO rDAO = new RotinaDAO();
    PreparadorDAO pDAO = new PreparadorDAO();
    AtletaDAO aDAO = new AtletaDAO();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar Rotina");
        setName("Alterar Rotina"); // NOI18N

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Selecione o Preparador:");

        jLabel7.setText("campo obrigatório*");

        jLabel8.setText("Selecione o dia da Semana:");

        jLabel9.setText("Descrição*");

        jLabel11.setText("Atletas:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Tempo de repetição (dias)*");

        jComboBox3.setToolTipText("");
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextArea3.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jMenu1.setText("Gerenciamento");

        jMenuItem1.setText("Cadastrar Rotina");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Alterar Rotina");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem6.setText("Deletar Rotina");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Listar Rotinas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatorios");

        jMenuItem3.setText("Listar Atletas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Listar Médicos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Listar Preparadores com Atletas Irregulares");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(jLabel9)
                                    .addGap(20, 20, 20))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addComponent(jLabel7))
                                        .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel8)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 105, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(181, 181, 181)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jButton1))
                    .addContainerGap(246, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addGap(63, 63, 63)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addGap(3, 3, 3)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //System.out.println(jTextArea2.getText());
        List<Participante> alist = null;
        try{
            alist = aDAO.getAtletas(jComboBox3.getSelectedItem().toString());
            int i = 0;
            String atleta = null;
            while (i < alist.size()) {
                atleta = alist.get(i).getId();
                if (rDAO.alterarRotina(jComboBox3.getModel().getSelectedItem().toString(), 
                                              jComboBox2.getModel().getSelectedItem().toString(), 
                                              jTextField2.getText(), 
                                              jTextArea2.getText(),
                                              atleta))
                    jLabel5.setText("Alteracao efetuada com sucesso!");
                else{
                     jLabel5.setText("Falha ao alterar");
                }
                i++;
            }
            populateDays(jComboBox3.getSelectedItem().toString());
            jTextField2.setText("");
            jTextArea2.setText("");;
        }catch(Exception ex){
            jLabel5.setText("Erro: Falha ao alterar");
            System.out.println("Erro");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            rDAO.closeConn();
            pDAO.closeConn();
            aDAO.closeConn();
            new CadastrarRotina().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AlterarRotina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            rDAO.closeConn();
            pDAO.closeConn();
            aDAO.closeConn();
            new AlterarRotina().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AlterarRotina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            rDAO.closeConn();
            pDAO.closeConn();
            aDAO.closeConn();
            new DeletarRotina1().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DeletarRotina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            rDAO.closeConn();
            pDAO.closeConn();
            aDAO.closeConn();
            new ListarRotinas().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DeletarRotina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        updateNamePrep();        
        //jComboBox1.removeAllItems();
        populateAtletas(jComboBox3.getSelectedItem().toString());
        try {
            populateDays(jComboBox3.getSelectedItem().toString());
            //selectDia(jComboBox2.getSelectedItem().toString());
        } catch (SQLException ex) {
            Logger.getLogger(AlterarRotina.class.getName()).log(Level.SEVERE, null, ex);
        }
        //selectDays(jComboBox3.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        //try {
            // TODO add your handling code here:
            //selectDia(jComboBox2.getSelectedItem().toString());
        //} catch (SQLException ex) {
        //    Logger.getLogger(AlterarRotina.class.getName()).log(Level.SEVERE, null, ex);
        //}      
      
    }//GEN-LAST:event_jComboBox2ActionPerformed
    public synchronized void populateRotinas() throws SQLException {
        List<Rotina> list = null;
        try {
            list = rDAO.getRotinas();
            int i = 0;
            //System.out.println("List size: " + list.size());
            while (i < list.size()) {
                //jComboBox4.addItem(list.get(i).getId());
                i++;
            }
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }
    }
    public synchronized void selectDia(String dia) throws SQLException {
        List<Rotina> list = null;
        try {
            list = rDAO.getRotinas();
            int i = 0;
            while (i < list.size()) {
                if (list.get(i).getdiaSemana().equals(dia)) {
                    jTextField2.setText(Integer.toString((list.get(i).getRepeticao())));
                    jTextArea2.setText(list.get(i).getDescricao());
                }
                i++;
            }
            //System.out.println("List size: " + list.size());
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }
    }
    public synchronized void populateDays(String prep) throws SQLException {
        List<Rotina> list = null;
        //String prep = jComboBox3.getSelectedItem().toString();
        //String atleta = jComboBox1.getSelectedItem().toString();
        //List<String> allDays = Arrays.asList("Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado");
        jComboBox2.removeAllItems();

        try {
            list = rDAO.getRotinas();
            int i = 0;
            Set<String> days = new HashSet<>();
            //System.out.println("List size: " + list.size());
            while (i < list.size()) {
                if (list.get(i).getPreparador().equals(prep)) {
                    //jComboBox2.addItem(list.get(i).getdiaSemana());
                    days.add(list.get(i).getdiaSemana());
                }
                i++;
            }
            days.forEach((str) -> {
                jComboBox2.addItem(str);
            });      
        }catch(SQLException ex){
            System.out.println("Erro");
        }
    }
    public synchronized void populatePreps() throws SQLException {
        List<Participante> list = null;

        try {
            list = pDAO.getAllPreparador();
            int i = 0;
            //System.out.println("List size: " + list.size());
            while (i < list.size()) {
                jComboBox3.addItem(list.get(i).getId());
                i++;
            }
            jLabel2.setText(list.get(0).getNome());
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }
    }
    public synchronized void updateNamePrep() {
        List<Participante> list = null;

        try {   
            list = pDAO.getAllPreparador();
            int i = 0;
            //System.out.println("Update: List size: " + list.size());
            while (i < list.size()) {
                if (jComboBox3.getSelectedItem().toString().equals(list.get(i).getId()))
                    jLabel2.setText(list.get(i).getNome());
                i++;
            }
            
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }
    }
    public synchronized void updateNameAtleta(String preparador) {
        List<Participante> list = null; 
        try {
            list = aDAO.getAtletas(preparador);
            int i = 0;
            //System.out.println("HERE: List size: " + list.size());
            while (i < list.size()) {
                //if (jComboBox1.getSelectedItem().toString().equals(list.get(i).getId()))
                //    jLabel3.setText(list.get(i).getNome());
                //i++;
            }
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }    
    }
    public synchronized void populateAtletas(String preparador) {
        List<Participante> list = null;
        StringBuilder atletas = new StringBuilder();
        jTextArea3.setEditable(false);
        jTextArea3.setText("");
        try {
            list = aDAO.getAtletas(preparador);
            int i = 0;
            while (i < list.size()) {
                    atletas.append(list.get(i).getNome() + "\n");
                    //jComboBox1.addItem(list.get(i).getId());
                i++;
            }
            jTextArea3.append(atletas.toString());
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(AlterarRotina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarRotina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarRotina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarRotina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new AlterarRotina().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AlterarRotina.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
