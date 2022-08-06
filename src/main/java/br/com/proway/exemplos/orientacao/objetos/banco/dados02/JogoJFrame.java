/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 71398
 */
public class JogoJFrame extends javax.swing.JFrame {
    private int codigoEditar = -1;
    /**
     * Creates new form JogoJFrame
     */
    public JogoJFrame() {
        initComponents();
        listarJogos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelJogos = new javax.swing.JLabel();
        jButtonApagar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableJogos = new javax.swing.JTable();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelJogos.setText("Jogos");

        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jTableJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableJogos);
        if (jTableJogos.getColumnModel().getColumnCount() > 0) {
            jTableJogos.getColumnModel().getColumn(0).setResizable(false);
            jTableJogos.getColumnModel().getColumn(1).setResizable(false);
            jTableJogos.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabelNome.setText("Nome");

        jLabelTipo.setText("Tipo");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estratégia", "FPS", "RPG", " " }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxTipo, 0, 126, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jLabelTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJogos)
                    .addComponent(jButtonApagar)
                    .addComponent(jButtonEditar)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonSalvar)
                        .addGap(213, 213, 213))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/lojaBd", "root", "admin");

            Statement executor = conexao.createStatement();

            String nome = jTextFieldNome.getText();
            String tipo = jComboBoxTipo.getSelectedItem().toString();

            if (codigoEditar == -1){
            executor.execute("INSERT INTO jogos (nome, tipo) VALUES ('" + nome + "', '" + tipo + "')");
                JOptionPane.showMessageDialog(this, "Jogo atualizado com sucesso");
            }else{
                executor.execute("UPDATE jogos SET nome = '" + nome + "', tipo = '" + tipo + "' WHERE id = " + codigoEditar);
                
            }
            limparCampos();
            listarJogos();
            
            JOptionPane.showMessageDialog(this, "Jogo cadastrado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível realizar a operação");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed

        try {
            //Descobrir o código do registroque deseja apagar
            DefaultTableModel modelo = (DefaultTableModel) jTableJogos.getModel();

            int indiceLinhaSelecionada = jTableJogos.getSelectedRow();

            // Obter o código da coluna 0 que é a coluna do código no JTable
            int codigo = Integer.parseInt(modelo.getValueAt(indiceLinhaSelecionada, 0).toString());

            // Conectar no banco de dados
            var conexao = DriverManager.getConnection("jdbc:mysql://localhost/lojaBd", "root", "admin");

            //Executar o comando para apagar o registro da tabela de jogos
            var executor = conexao.createStatement();
            executor.execute("DELETE FROM jogos WHERE id = " + codigo);

            //Fechar a conexão do banco de dados
            conexao.close();

            //Listar os jogos
            listarJogos();

            //Apresentar feedback de que o registrofoi apagado
            JOptionPane.showMessageDialog(this, "Registro apagado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível ");
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        try {
            //Descobrir o código do registro que deseja alterar
            DefaultTableModel modelo = (DefaultTableModel) jTableJogos.getModel();
            int indiceLinhaSelecionada = jTableJogos.getSelectedRow();
            //Obter o código da coluna 0 que contém o código do jogo selecionado
            codigoEditar = Integer.parseInt(modelo.getValueAt(indiceLinhaSelecionada, 0).toString());
            //Abrir conexão com o banco de dados
            var conexao = DriverManager.getConnection("jdbc:mysql://localhost/lojaBd", "root", "admin");
            // Executar comando para xonsultar os dados da tabela de jogos
            var executor = conexao.createStatement();
            executor.execute("SELECT nome, tipo FROM jogos WHERE id = " + codigoEditar);
            // Obter os dados da consulta
            ResultSet registros = executor.getResultSet();
            //Verifica se encontrou algum registro
            if(registros.next()){
                //Obtém os dados da consulta
                var nome = registros.getString("nome");
                var tipo = registros.getString("tipo");
                //Preenche os campos com os dados da consulta
                jTextFieldNome.setText(nome);
                jComboBoxTipo.setSelectedItem(tipo);                
            }else{
                //Apresenta mensagem informando que não encontrou nenhum registro com id escolhido
                JOptionPane.showMessageDialog(this, "Não foi possível encontrar o registro");
            }
        }catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Não foi possível executar o comando");
        
        }
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void limparCampos(){
        jTextFieldNome.setText("");
        jComboBoxTipo.setSelectedIndex(-1);
        //Retornar para modo de cadastro, o que permitirá o usuário cadastrar novamente.
        codigoEditar = -1;
    }

    private void listarJogos() {
        try {
            Connection conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost/lojaBd", "root", "admin");
            Statement executor = conexao.createStatement();
            executor.execute("SELECT id, nome, tipo FROM jogos");

            ResultSet registros = executor.getResultSet();
            DefaultTableModel modeloTabela
                    = (DefaultTableModel) jTableJogos.getModel();
            modeloTabela.setRowCount(0);//limpar tabela
            while (registros.next()) {
                int id = Integer.parseInt(registros.getString("id"));
                String nome = registros.getString("nome");
                String tipo = registros.getString("tipo");
                modeloTabela.addRow(new Object[]{id, nome, tipo});
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Não foi possível carregar os jogos");
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
            java.util.logging.Logger.getLogger(JogoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelJogos;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableJogos;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
