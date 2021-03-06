/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisplanperguntas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import sun.applet.Main;

/**
 *
 * @author Suporte
 */
public class TelaRanking extends javax.swing.JFrame {

    /**
     * Creates new form TelaRanking
     */
    public TelaRanking() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        setTitle("Gamification    Ranking");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRanking = new javax.swing.JTable();
        incluir = new javax.swing.JButton();
        altera = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        imprime = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ranking", "Nome", "Qtde_Perguntas", "Tempo_Total", "Tempo_Medio", "Acertos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableRanking);

        incluir.setText("Incluir");
        incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirActionPerformed(evt);
            }
        });

        altera.setText("Alterar");
        altera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteraActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        imprime.setText("Imprimir");
        imprime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(altera, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imprime, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(incluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(altera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(consultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(imprime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirActionPerformed
        TelaInclusaoRanking ranking = new TelaInclusaoRanking();
        ranking.TelaRanking(this);
        ranking.setVisible(true);
        ranking.setLocationRelativeTo(this);
    }//GEN-LAST:event_incluirActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        Connection connection = null;
        Statement statement = null;
        int linha = 0;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM RANKING;");

           //Zera limpa a tabela grid
            DefaultTableModel mode = (DefaultTableModel) jTableRanking.getModel();
            mode.setRowCount(0);
            
            while (resultSet.next()) {
                int numero = resultSet.getInt("NUMERO");
                String nome = resultSet.getString("NOME");
                int qtde_perguntas_realizadas = resultSet.getInt("QTDE_PERGUNTAS_REALIZADAS");
                String tempo_total = resultSet.getString("TEMPO_TOTAL");
                String tempo_medio = resultSet.getString("TEMPO_MEDIO");
                int qtde_acertos = resultSet.getInt("QTDE_ACERTOS");
                
                //Lista os clientes na tabela (Grid)
                DefaultTableModel model = (DefaultTableModel) jTableRanking.getModel();
                model.addRow(new Object[]{numero, nome, qtde_perguntas_realizadas, tempo_total, tempo_medio, qtde_acertos});
                
                linha++;
                
            }
            resultSet.close();
            statement.close();            
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + "erro na consulta de perguntas tela RelCadPergunta botão consultar " + e.getMessage());
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_fecharActionPerformed

    private void alteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alteraActionPerformed
        int linhaSelecionada =               jTableRanking.getSelectedRow();
        int ranking          =  (int)        jTableRanking.getValueAt(linhaSelecionada, 0);
        String nome          =  (String)     jTableRanking.getValueAt(linhaSelecionada, 1);
        int qtde_perguntas   =  (int)        jTableRanking.getValueAt(linhaSelecionada, 3);
        String tempo_total   =  (String)     jTableRanking.getValueAt(linhaSelecionada, 4);
        String tempo_medio   =  (String)     jTableRanking.getValueAt(linhaSelecionada, 5);
        int acertos           =  (int)        jTableRanking.getValueAt(linhaSelecionada, 6);
        
        TelaInclusaoRanking raking = new TelaInclusaoRanking();
        raking.TelaRanking(this);
        raking.recebera(ranking,nome,qtde_perguntas,tempo_total,tempo_medio,acertos);
        raking.setVisible(true);
        raking.setLocationRelativeTo(this);
        
    }//GEN-LAST:event_alteraActionPerformed

    private void imprimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimeActionPerformed
        FileOutputStream fos = null;
        PrintStream p = new PrintStream(fos);
        p.println("Ranking                  |Nome                   |Qtde     |Tempo Total   |Tempo Médio    |Qtde Acertos   ");
        
        for (int i = 0;i < jTableRanking.getRowCount();i ++){
              
              String ranking            = (String)  jTableRanking.getValueAt(i, 0);
              String nome               = (String)  jTableRanking.getValueAt(i, 1);
              int qtde_perguntas        = (Integer) jTableRanking.getValueAt(i, 2);
              String tempo_total        = (String)  jTableRanking.getValueAt(i, 3);
              String tempo_medio        = (String)  jTableRanking.getValueAt(i, 4);
              int acertos               = (Integer)  jTableRanking.getValueAt(i, 5);
            
         
        Properties config = new Properties();
        String arquivo = "SisplanPerguntas.ini";
        
        boolean success = (new File(config.getProperty("Ranking")+ new SimpleDateFormat("dd-MM-yyyy").format(new Date(System.currentTimeMillis())) +".doc")).delete();
        
        
        try {
            config.load(new FileInputStream(arquivo));
            
            fos = new FileOutputStream(config.getProperty("Ranking")+ new SimpleDateFormat("dd-MM-yyyy").format(new Date(System.currentTimeMillis())) +".doc", true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RelRespostaPerg.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Verifique o Caminho do Relatorio Perguntas no arquivo SisplanPerguntas.ini\n"
                    +""+ ex);
        }
        catch (IOException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, ex);
      }
         PrintStream ps = new PrintStream(fos);  
         
         
        
        
         ps.println(ranking +"                  |"+nome+"                   |"+qtde_perguntas+"     |"+tempo_total+"   |"+tempo_medio+"    |"+acertos+"   ");
         
        }
            
         
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Times New Roman", Font.PLAIN, 20)));//fonte da mensagem
        UIManager.put("OptionPane.messageForeground", Color.BLACK);//cor da fonte da mensagem
        JOptionPane.showMessageDialog(null, "Arquivo Gerado com Sucesso!");
        
        Properties config = new Properties();
        String arquivo = "SisplanPerguntas.ini";
        
         try {
            config.load(new FileInputStream(arquivo));
            
                java.awt.Desktop.getDesktop().open(new File(config.getProperty("Ranking")+ new SimpleDateFormat("dd-MM-yyyy").format(new Date(System.currentTimeMillis())) +".doc"));
                
                
            } catch (IOException ex) {
                Logger.getLogger(RelRespostaPerg.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_imprimeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRanking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altera;
    private javax.swing.JButton consultar;
    private javax.swing.JButton fechar;
    private javax.swing.JButton imprime;
    private javax.swing.JButton incluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRanking;
    // End of variables declaration//GEN-END:variables

    void recebera(String ranking, String nome, int qtde_perguntas, String tempo_total, String tempo_medio, int qtde_acertos) {
        
        DefaultTableModel model = (DefaultTableModel) jTableRanking.getModel();
        model.addRow(new Object[]{ranking, nome, qtde_perguntas, tempo_total, tempo_medio, qtde_acertos});        
                
    }
}
