/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import com.itextpdf.text.DocumentException;
import database.*;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;

import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pdf.PDFgenerator;

/**
 *
 * @author Henrique
 */
public class ListarAtletas extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarPreparador
     */
    private PDFgenerator pdf;
    private static final String reportPath = ".\\atletas.pdf";
    
    public ListarAtletas() throws SQLException {
        initComponents();
        populateModalidades();
        pdf = new PDFgenerator();
    }
    RotinaDAO rDAO = new RotinaDAO();
    ParticipanteDAO pDAO = new ParticipanteDAO();
    ModalidadeDAO mDAO = new ModalidadeDAO();
    AtletaDAO aDAO = new AtletaDAO();
    ConsultaDAO cDAO = new ConsultaDAO();
    NacaoDAO nDAO = new NacaoDAO();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        setTitle("Listar Atletas");
        setName("Listar Atletas"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Documento", "Nacionalidade", "Data Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel6.setText("Selecione o Preparador:");

        jComboBox3.setToolTipText("");
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Selecione a Modalidade:");

        jComboBox4.setToolTipText("");
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel8.setText("Selecione o Médico:");

        jComboBox5.setToolTipText("");
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jButton1.setText("Gerar PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            rDAO.closeConn();
            pDAO.closeConn();
            mDAO.closeConn();
            aDAO.closeConn();
            cDAO.closeConn();
            nDAO.closeConn();
            new CadastrarRotina().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ListarAtletas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            rDAO.closeConn();
            pDAO.closeConn();
            mDAO.closeConn();
            aDAO.closeConn();
            cDAO.closeConn();
            nDAO.closeConn();
            new AlterarRotina().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ListarAtletas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            rDAO.closeConn();
            pDAO.closeConn();
            mDAO.closeConn();
            aDAO.closeConn();
            cDAO.closeConn();
            nDAO.closeConn();
            new ListarAtletas().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DeletarRotina1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            mDAO.closeConn();
            aDAO.closeConn();
            cDAO.closeConn();
            nDAO.closeConn();
            new DeletarRotina1().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DeletarRotina1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            rDAO.closeConn();
            pDAO.closeConn();
            mDAO.closeConn();
            aDAO.closeConn();
            cDAO.closeConn();
            nDAO.closeConn();
            new ListarRotinas().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DeletarRotina1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
// TODO add your handling code here:
        
        try {
            addRowToTable();
            updateNamePrep();
        } catch (SQLException ex) {
            Logger.getLogger(ListarAtletas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        
        try {
            populatePreps();
            populateMeds();
            addRowToTable();
            updateNameMod();
        } catch (SQLException ex) {
            Logger.getLogger(ListarAtletas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
       
        try {
            addRowToTable();
            updateNameMed();
        } catch (SQLException ex) {
            Logger.getLogger(ListarAtletas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            pdf.newFile(reportPath);
            
            /* get system date */
            String schedule = new SimpleDateFormat("HH:mm:ss")
                    .format(Calendar.getInstance().getTime());
            String date = new SimpleDateFormat("dd/MM/yyyy")
                    .format(Calendar.getInstance().getTime());
            
            //pdf.insertParagraph(labelReportAtleta.getText() + ".");
            
            pdf.insertParagraph("Generated at " + schedule + " - " + date + ".");
            pdf.insertParagraph(" ");
            
            insertTable(jTable1);
            
            pdf.closeFile();
            
            pdf.readFile(reportPath);
            
        } catch(DocumentException | IOException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void insertTable(JTable table) throws DocumentException {
        String[] header = new String[table.getColumnCount()];
        
        for(int i = 0; i < table.getColumnCount(); i++) {
            header[i] = table.getColumnName(i);
        }
        
        pdf.newHeaderTable(header);
        
        String[] field;
        
        for(int i = 0; i < table.getRowCount(); i++) {
            field = new String[table.getColumnCount()];
            
            for(int j = 0; j < table.getColumnCount(); j++) {
                field[j] = table.getValueAt(i,j).toString();
            }
            
            pdf.newLineTable(field);
        }
        
        pdf.finishTable();
    }
    
    public void addRowToTable() throws SQLException {
        List<Atleta> alist = null;
        List<Consulta> clist = null;
        List<Participante> plist = null;
        List<Nacao> nlist = null;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object rowData[] = new Object[5];
        Set<String> row = new HashSet<>();
        try {
            clist = cDAO.getConsultas();
            alist = aDAO.getAtletas();
            plist = pDAO.getAllAtletas();
            nlist = nDAO.getNacao();
            for (int i = 0; i < alist.size() ; i++ ) {
                //A.Modalidade = x
                if (alist.get(i).getModalidade().equals(jComboBox4.getSelectedItem())) {
                    //A.Preparador = y
                    if (alist.get(i).getPreparador().equals(jComboBox3.getSelectedItem())) {
                        for (int j = 0; j < clist.size(); j++) {
                            //C.Atleta = A.NroAtleta
                            if (alist.get(i).getId().equals(clist.get(j).getAtleta())) {
                                //C.Medico = z
                                if (clist.get(j).getMedico().equals(jComboBox5.getSelectedItem())) {
                                     
                                    rowData[0] = alist.get(i).getId();
                                    
                                    for (int k = 0; k < plist.size(); k++) { 
                                        if (clist.get(j).getAtleta().equals(plist.get(k).getId()))
                                            rowData[1] = plist.get(k).getNome();
                                            
                                    } 
                                    rowData[2] = alist.get(i).getPassaporte();
                                    
                                    for (int k = 0; k < nlist.size(); k++) {
                                        if (alist.get(i).getNacao().equals(nlist.get(k).getId()))
                                            rowData[3] = nlist.get(i).getNome();
                                            
                                    }
                                    rowData[4] = alist.get(i).getData();
                                    
                                    model.addRow(rowData);
                                }
                            }
                        }
                    }
                } 
            }
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }
        //for (int i = 0; i < rlist.size(); i++) {
        //    alist = pDAO.getAtletas(rlist.get(i).getPreparador());
        //    rowData[0] = rlist.get(i).getId();
        //    for (int j = 0 ; j < plist.size() ; j++) {
        //        if (rlist.get(i).getPreparador().equals(plist.get(j).getId())) 
        //            rowData[1] = plist.get(j).getNome();
        //    }
        //    rowData[2] = rlist.get(i).getdiaSemana();
        //    for (int j = 0 ; j < alist.size() ; j++) {
        //        if (rlist.get(i).getAtleta().equals(alist.get(j).getId())) 
        //            rowData[3] = alist.get(j).getNome();
        //    }
        //    rowData[4] = rlist.get(i).getRepeticao();
         //   rowData[5] = rlist.get(i).getDescricao();
         //   model.addRow(rowData);
        //}
    }
    public synchronized void populateModalidades() throws SQLException {
        List<Modalidade> list = null;
        
        try {
            list = mDAO.getModalidades();
            int i = 0;
            //System.out.println("List size: " + list.size());
            while (i < list.size()) {
                jComboBox4.addItem(list.get(i).getId());
                i++;
            }
            jLabel1.setText(list.get(0).getNome());
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }
    }
    public synchronized void updateNameMod() {
        List<Modalidade> list = null;
        //PreparadorDAO pDAO = new PreparadorDAO();

        try {   
            list = mDAO.getModalidades();
            int i = 0;
            //System.out.println("Update: List size: " + list.size());
            while (i < list.size()) {
                if (jComboBox4.getSelectedItem().toString().equals(list.get(i).getId()))
                    jLabel1.setText(list.get(i).getNome());
                i++;
            }
            
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }
    }
    public synchronized void populateMeds() throws SQLException {
        List<Atleta> alist = null;
        List<Consulta> clist = null;
        jComboBox5.removeAllItems();
        try {
            Set<String> meds = new HashSet<>();
            clist = cDAO.getConsultas();
            alist = aDAO.getAtletas();
            int i = 0;
            while (i < alist.size()) {
                //System.out.println(alist.get(i).getModalidade() + " "+alist.get(i).getPreparador());
                    if (alist.get(i).getModalidade().equals(jComboBox4.getSelectedItem())) {
                        //jComboBox3.addItem(alist.get(i).getPreparador());
                        for (int j = 0; j < clist.size(); j++) { 
                            if (alist.get(i).getId().equals(clist.get(j).getAtleta())) {
                                //jComboBox5.addItem(clist.get(j).getMedico());
                                meds.add(clist.get(j).getMedico());
                            }
                        }
                    }       
                i++;
            }
            meds.forEach((str) -> {
                jComboBox5.addItem(str);
            }); 
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }
    }
    public synchronized void updateNameMed() {
        List<Participante> list = null;
        //PreparadorDAO pDAO = new PreparadorDAO();

        try {   
            list = pDAO.getAllMedicos();
            int i = 0;
            //System.out.println("Update: List size: " + list.size());
            while (i < list.size()) {
                if (jComboBox5.getSelectedItem().toString().equals(list.get(i).getId()))
                    jLabel3.setText(list.get(i).getNome());
                i++;
            }
            
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }
    }
    public synchronized void populatePreps() throws SQLException {
        List<Atleta> alist = null;
        jComboBox3.removeAllItems();
        try {
            alist = aDAO.getAtletas();
            int i = 0;
            Set<String> preps = new HashSet<>();
            while (i < alist.size()) {
                //System.out.println(alist.get(i).getModalidade() + " "+alist.get(i).getPreparador());
                    if (alist.get(i).getModalidade().equals(jComboBox4.getSelectedItem())) {
                        //jComboBox3.addItem(alist.get(i).getPreparador());
                        preps.add(alist.get(i).getPreparador());
                    }       
                i++;
            }
            preps.forEach((str) -> {
                jComboBox3.addItem(str);
            }); 
        }catch(Exception ex){
            System.out.println("Erro");
            ex.printStackTrace();
        }
    }
    public synchronized void updateNamePrep() {
        List<Participante> list = null;
        //PreparadorDAO pDAO = new PreparadorDAO();

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
            java.util.logging.Logger.getLogger(ListarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                    new ListarAtletas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ListarAtletas.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
