/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daf.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import org.daf.consulta.ControllerDependente;
import org.daf.consulta.ControllerPessoa;
import org.daf.entidade.Dependente;
import org.daf.entidade.Pessoa;

/**
 *
 * @author leandro
 */
public class TelaPessoaConsultar extends javax.swing.JFrame {

    /**
     * Creates new form TelaPessoaConsultar
     */
    public TelaPessoaConsultar() {
        initComponents();
        atualizarBoxPessoas();
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dependentes"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableView = new javax.swing.JTable();
        cbPessoas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btPessoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        foiText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(java.awt.Color.red);
        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 40)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAR PESSOA E SEUS DEPENDENTES:");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 100, 1050, 50);

        jLabel2.setText("Pessoas:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 150, 110, 20);

        tableView.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Contato"
            }
        ));
        tableView.setRowHeight(30);
        tableView.setShowHorizontalLines(false);
        tableView.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tableView);
        if (tableView.getColumnModel().getColumnCount() > 0) {
            tableView.getColumnModel().getColumn(0).setMinWidth(60);
            tableView.getColumnModel().getColumn(0).setPreferredWidth(60);
            tableView.getColumnModel().getColumn(0).setMaxWidth(60);
            tableView.getColumnModel().getColumn(1).setMinWidth(300);
            tableView.getColumnModel().getColumn(1).setPreferredWidth(300);
            tableView.getColumnModel().getColumn(1).setMaxWidth(300);
            tableView.getColumnModel().getColumn(2).setMinWidth(200);
            tableView.getColumnModel().getColumn(2).setPreferredWidth(200);
            tableView.getColumnModel().getColumn(2).setMaxWidth(200);
            tableView.getColumnModel().getColumn(3).setMinWidth(200);
            tableView.getColumnModel().getColumn(3).setPreferredWidth(200);
            tableView.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 200, 1030, 190);

        cbPessoas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPessoasActionPerformed(evt);
            }
        });
        getContentPane().add(cbPessoas);
        cbPessoas.setBounds(0, 170, 450, 27);

        jButton1.setText("Novo Dependente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(700, 170, 180, 29);

        btPessoa.setText("Exibir dependentes");
        btPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPessoaActionPerformed(evt);
            }
        });
        getContentPane().add(btPessoa);
        btPessoa.setBounds(450, 170, 240, 29);

        jPanel2.setBackground(java.awt.Color.black);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1050, 100);

        foiText.setBackground(new java.awt.Color(21, 79, 243));
        foiText.setFont(new java.awt.Font("Bitstream Charter", 1, 48)); // NOI18N
        foiText.setForeground(java.awt.Color.white);
        foiText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foiText.setText("FUNERÁRIA JESUS DE AMA");
        foiText.setOpaque(true);
        getContentPane().add(foiText);
        foiText.setBounds(50, 400, 870, 80);

        setSize(new java.awt.Dimension(1063, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPessoasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPessoasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        FormDependentes.carregarForm((Pessoa) cbPessoas.getSelectedItem());

    }//GEN-LAST:event_jButton1ActionPerformed
    static ControllerPessoa cp = ControllerPessoa.instanceOF();
    static ControllerDependente cd = ControllerDependente.instanceOF();
    List<Dependente> todos = new ArrayList<>();
    private void btPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPessoaActionPerformed
        // TODO add your handling code here:
        Pessoa pessoa = null;
        try {
            pessoa = new Pessoa();
            pessoa.setNome("Katia Moveis de Souza");
            pessoa.setEmail("diocesse@gmail.com");

            Dependente dp = new Dependente();
            dp.setNome("Tania Souza");
            dp.setEmail("day@gmail.com");
            dp.setContato("(72) 93305-5996");
            dp.setPessoa(pessoa);
            todos.add(dp);

            Dependente dp2 = new Dependente();
            dp2.setNome("Juthia Fraga Souza");
            dp2.setEmail("day2@gmail.com");
            dp2.setContato("(72) 93105-5996");
            dp2.setPessoa(pessoa);
            todos.add(dp2);

            Dependente dp3 = new Dependente();
            dp3.setNome("Kuthia Reis Souza");
            dp3.setEmail("day3@gmail.com");
            dp3.setContato("(72) 93065-5996");
            dp3.setPessoa(pessoa);
            todos.add(dp3);

            pessoa.setDependentes(todos);
            cp.save(pessoa);

            atualizarBoxPessoas();
            atualizarTableView(pessoa.getIdPessoa());

        } catch (Exception e) {

            atualizarBoxPessoas();
            pessoa = (Pessoa) cbPessoas.getSelectedItem();
            atualizarTableView(pessoa.getIdPessoa());
        }


    }//GEN-LAST:event_btPessoaActionPerformed
    static int count = 0;
    static  String[][] allDependentes;
    public static void atualizarTableView(Long id) {

        try {

             allDependentes = new String[cd.todasDependentesDaPessoa(id).size()][0];
            cd.todasDependentesDaPessoa(id).forEach((d) -> {
                String[] l = {String.valueOf(d.getIdDependente()), d.getNome(), d.getEmail(), d.getContato()};
                allDependentes[count++] = l;
            });

            tableView.setModel(new javax.swing.table.DefaultTableModel(
                    allDependentes,
                    new String[]{
                        "Id", "Nome", "Email", "Contato"
                    }
            ));
            tableView.setRowHeight(30);
            if (tableView.getColumnModel().getColumnCount() > 0) {
                tableView.getColumnModel().getColumn(0).setMinWidth(60);
                tableView.getColumnModel().getColumn(0).setPreferredWidth(60);
                tableView.getColumnModel().getColumn(0).setMaxWidth(60);
                tableView.getColumnModel().getColumn(1).setMinWidth(300);
                tableView.getColumnModel().getColumn(1).setPreferredWidth(300);
                tableView.getColumnModel().getColumn(1).setMaxWidth(300);
                tableView.getColumnModel().getColumn(2).setMinWidth(200);
                tableView.getColumnModel().getColumn(2).setPreferredWidth(200);
                tableView.getColumnModel().getColumn(2).setMaxWidth(200);
                tableView.getColumnModel().getColumn(3).setMinWidth(200);
                tableView.getColumnModel().getColumn(3).setPreferredWidth(200);
                tableView.getColumnModel().getColumn(3).setMaxWidth(200);
            }

        } catch (Exception e) {
        }
    }

    public void atualizarBoxPessoas() {
        ComboBoxModel model = new DefaultComboBoxModel();
        List<Pessoa> all = cp.listaGenerica(Pessoa.class);
        all.forEach((p) -> {
            model.setSelectedItem(p);
        });

        cbPessoas.setModel(model);
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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPessoaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPessoaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPessoaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPessoaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPessoaConsultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPessoa;
    private javax.swing.JComboBox<String> cbPessoas;
    private javax.swing.JLabel foiText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tableView;
    // End of variables declaration//GEN-END:variables
}
