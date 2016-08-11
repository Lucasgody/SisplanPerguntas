/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisplanperguntas;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suporte
 */
public class CadGrupos extends javax.swing.JFrame {

    /**
     * Creates new form CadGrupos
     */
    public CadGrupos() {
        initComponents();
         setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        Insets in = Toolkit.getDefaultToolkit().getScreenInsets(this.getGraphicsConfiguration()); 

         Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); 

          int width = d.width-(in.left + in.top); 
          int height = d.height-(in.top + in.bottom); 
          setSize(width,height); 
          setLocation(in.left,in.top);
          
          setTitle("Gamification    Cadastro de Grupos");
          
          jTCodGrupo.setEnabled(false);
          
          Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CADGRUPOS;");

           
            while (resultSet.next()) {
                int codigo = resultSet.getInt("CODIGO");
                
                jTCodGrupo.setText(Integer.toString(codigo + 1));
                
            }
            resultSet.close();
            statement.close();            
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + "erro na consulta de pacientes botão consultar " + e.getMessage());
            System.exit(0);
        }
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
        jTCodGrupo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTDescGrupo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsulGrupo = new javax.swing.JTable();
        grava = new javax.swing.JButton();
        consulta = new javax.swing.JButton();
        fecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descrição");

        jTConsulGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descricao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTConsulGrupo);

        grava.setText("Gravar");
        grava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravaActionPerformed(evt);
            }
        });

        consulta.setText("Consulta");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });

        fecha.setText("Fechar");
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTDescGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTCodGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grava, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTCodGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTDescGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(grava, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_fechaActionPerformed

    private void gravaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaActionPerformed
        String descricao = jTDescGrupo.getText();
        
        CadGrupo novoCadGrupo;
        novoCadGrupo = new CadGrupo(descricao);
        CadastroCadGrupo.Cadastrar(descricao);
        
        jTCodGrupo.setText("");
        jTDescGrupo.setText("");
        
        JOptionPane.showMessageDialog(null, "Dados Gravado com Sucesso!");
        
        jTDescGrupo.grabFocus();
        
         Connection connection = null;
        Statement statement = null;
        int linha = 0;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CADGRUPOS;");

           //Zera limpa a tabela grid
            DefaultTableModel mode = (DefaultTableModel) jTConsulGrupo.getModel();
            mode.setRowCount(0);
            
            while (resultSet.next()) {
                int codigo = resultSet.getInt("CODIGO");
                String desc = resultSet.getString("DESCRICAO");
                
                //Lista os clientes na tabela (Grid)
                DefaultTableModel model = (DefaultTableModel) jTConsulGrupo.getModel();
                model.addRow(new Object[]{codigo, desc});
                
                jTCodGrupo.setText(Integer.toString(codigo + 1));
                        
                linha++;
                
            }
            resultSet.close();
            statement.close();            
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + "erro na consulta de pacientes botão consultar " + e.getMessage());
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_gravaActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
        Connection connection = null;
        Statement statement = null;
        int linha = 0;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CADGRUPOS;");

           //Zera limpa a tabela grid
            DefaultTableModel mode = (DefaultTableModel) jTConsulGrupo.getModel();
            mode.setRowCount(0);
            
            while (resultSet.next()) {
                int codigo = resultSet.getInt("CODIGO");
                String desc = resultSet.getString("DESCRICAO");
                
                //Lista os clientes na tabela (Grid)
                DefaultTableModel model = (DefaultTableModel) jTConsulGrupo.getModel();
                model.addRow(new Object[]{codigo, desc});
                
                linha++;
                
            }
            resultSet.close();
            statement.close();            
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + "erro na consulta de pacientes botão consultar " + e.getMessage());
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_consultaActionPerformed

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
            java.util.logging.Logger.getLogger(CadGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadGrupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consulta;
    private javax.swing.JButton fecha;
    private javax.swing.JButton grava;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodGrupo;
    private javax.swing.JTable jTConsulGrupo;
    private javax.swing.JTextField jTDescGrupo;
    // End of variables declaration//GEN-END:variables
}
