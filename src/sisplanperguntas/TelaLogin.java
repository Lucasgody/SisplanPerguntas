/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisplanperguntas;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Win8
 */
public class TelaLogin extends javax.swing.JFrame {
    private TelaPerguntas acesso;
    private TelaPerguntas acesso2;
    private TelaPerguntas acesso6;
    private TelaPerguntas acesso7;

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Gamification  Acesso Administrativo");
       
        
        
    }
    String form;
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        fecha = new javax.swing.JButton();
        progresso_login = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Senha:");

        senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaKeyPressed(evt);
            }
        });

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
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
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(senha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
            .addComponent(progresso_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(progresso_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
                   
        
        this.setVisible(false);
    }//GEN-LAST:event_fechaActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
         String campo_senha = new String(senha.getPassword());
         String usuarios = usuario.getText().trim().toUpperCase();
         
        if (usuario.getText().equals("adm") && campo_senha.equals("123456")){
            
            int i =0;
        
                        
        
                        for(i = 0;i <= 100;i ++){
                            int novo_valor = i;
                            progresso_login.setBounds(20, 20, 100, 20);
                            progresso_login.setMinimum(0);
                            progresso_login.setMaximum(100);
                            progresso_login.setValue(novo_valor);
                            progresso_login.setStringPainted(true);
                            
                        
                                if(i == 100){
                                    if (form.equals("Random")){
                                        CadRandom random = new CadRandom();
                                        random.setVisible(true);
                                        random.setLocationRelativeTo(this);
                                    }
                                    if (form.equals("Perguntas")){
                                        CadPerguntas cadastroperguntas = new CadPerguntas();
                                        cadastroperguntas.setVisible(true);
                                    }
                                    if (form.equals("Relatorio")){
                                        RelRespostaPerg relatorio = new RelRespostaPerg();
                                        relatorio.setVisible(true);
                                    }
                                    if (form.equals("Grupo")){
                                        CadGrupos grupo = new CadGrupos();
                                        grupo.setVisible(true);
                                    }
                                    if (form.equals("RelPerguntas")){
                                        RelCadPergunta perguntas = new RelCadPergunta();
                                        perguntas.setVisible(true);
                                    }
                                    if (form.equals("Ranking")){
                                        TelaRanking ranking = new TelaRanking();
                                        ranking.setVisible(true);
                                        ranking.setLocationRelativeTo(this);
                                    }
                                    //String acessos = "Permitido";
                                    
                                    //acesso.acesso_adm(acessos);
                                    //acesso2.acesso_adm2(acessos);
                                    
                                    this.setVisible(false);
                                    
                                    
                                     }else{
                                         progresso_login.isIndeterminate();
                                    }
                        }
            }else{
                JOptionPane.showMessageDialog(null, "Usuario ou Senha não confere, Verifique e tente novamente!");
                usuario.setText("");
                senha.setText("");
                usuario.grabFocus();
            }
        
        
        
        
    }//GEN-LAST:event_loginActionPerformed

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
        int entrar = evt.getKeyCode();
                if(entrar == KeyEvent.VK_ENTER){
                String campo_senha = new String(senha.getPassword());
         String usuarios = usuario.getText().trim().toUpperCase();
         
        if (usuario.getText().equals("adm") && campo_senha.equals("123456")){
            
            int i =0;
        
                        
        
                        for(i = 0;i <= 100;i ++){
                            int novo_valor = i;
                            progresso_login.setBounds(20, 20, 100, 20);
                            progresso_login.setMinimum(0);
                            progresso_login.setMaximum(100);
                            progresso_login.setValue(novo_valor);
                            progresso_login.setStringPainted(true);
                            
                        
                                if(i == 100){
                                    if (form.equals("Random")){
                                        CadRandom random = new CadRandom();
                                        random.setVisible(true);
                                        random.setLocationRelativeTo(this);
                                    }
                                    if (form.equals("Perguntas")){
                                        CadPerguntas cadastroperguntas = new CadPerguntas();
                                        cadastroperguntas.setVisible(true);
                                    }
                                    if (form.equals("Relatorio")){
                                        RelRespostaPerg relatorio = new RelRespostaPerg();
                                        relatorio.setVisible(true);
                                    }
                                    if (form.equals("Grupo")){
                                        CadGrupos grupo = new CadGrupos();
                                        grupo.setVisible(true);
                                    }
                                    if (form.equals("RelPerguntas")){
                                        RelCadPergunta perguntas = new RelCadPergunta();
                                        perguntas.setVisible(true);
                                    }
                                    if (form.equals("Ranking")){
                                        TelaRanking ranking = new TelaRanking();
                                        ranking.setVisible(true);
                                        ranking.setLocationRelativeTo(this);
                                    }
                                    //String acessos = "Permitido";
                                    
                                    //acesso.acesso_adm(acessos);
                                    //acesso2.acesso_adm2(acessos);
                                    
                                    this.setVisible(false);
                                    
                                    
                                     }else{
                                         progresso_login.isIndeterminate();
                                    }
                        }
            }else{
                JOptionPane.showMessageDialog(null, "Usuario ou Senha não confere, Verifique e tente novamente!");
                usuario.setText("");
                senha.setText("");
                usuario.grabFocus();
            }
        
                }
            
    }//GEN-LAST:event_loginKeyPressed

    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed
        int tecla_enter = evt.getKeyCode();
        if(tecla_enter == KeyEvent.VK_ENTER){
            senha.grabFocus();
        }
    }//GEN-LAST:event_usuarioKeyPressed

    private void senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaKeyPressed
        int tecla_enter = evt.getKeyCode();
        if(tecla_enter == KeyEvent.VK_ENTER){
            login.grabFocus();
        }
    }//GEN-LAST:event_senhaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login;
    private javax.swing.JProgressBar progresso_login;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    void acesso(TelaPerguntas aThis) {
        acesso = aThis;
    }

    void acesso2(TelaPerguntas aThis) {
        acesso2 = aThis;
    }

    void recebeTela(String tela) {
        form = tela;
    }

    void recebetela2(String tela) {
        form = tela;
    }

    void acesso6(TelaPerguntas aThis) {
        acesso6 = aThis;
    }

    void recebeTela2(String tela) {
        form = tela;
    }

    void acesso7(TelaPerguntas aThis) {
        acesso7 = aThis;
    }

    void recebeTela3(String tela) {
        form = tela;
    }

   
}
