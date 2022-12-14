/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lojaderoupa;

import static sistemas.Sistema.cadastraUsuario;

import static sistemas.Sistema.verificaCadastro;
import static sistemas.Sistema.verificaLogin;
import sistemas.Usuario;
import javax.swing.JOptionPane;
/**
 *
 * @author igorq
 */
public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fecharBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        loginSenha = new javax.swing.JPasswordField();
        statusLb = new javax.swing.JLabel();
        cadastroBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(51, 0, 102));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Loja de Roupa");

        jLabel8.setBackground(new java.awt.Color(51, 0, 102));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qualidade é aqui");

        fecharBtn.setBackground(new java.awt.Color(255, 255, 255));
        fecharBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        fecharBtn.setForeground(new java.awt.Color(51, 0, 102));
        fecharBtn.setText("X");
        fecharBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fecharBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecharBtn)
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 0, 102));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("SENHA");

        loginUsuario.setBackground(new java.awt.Color(255, 255, 255));
        loginUsuario.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        loginUsuario.setForeground(new java.awt.Color(0, 0, 0));
        loginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 0, 102));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("LOGIN");

        jLabel3.setBackground(new java.awt.Color(51, 0, 102));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("USUÁRIO");

        loginBtn.setBackground(new java.awt.Color(51, 0, 102));
        loginBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        loginSenha.setBackground(new java.awt.Color(255, 255, 255));
        loginSenha.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        loginSenha.setForeground(new java.awt.Color(0, 0, 0));
        loginSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSenhaActionPerformed(evt);
            }
        });

        statusLb.setBackground(new java.awt.Color(255, 0, 0));
        statusLb.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        statusLb.setForeground(new java.awt.Color(255, 0, 0));
        statusLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cadastroBtn.setBackground(new java.awt.Color(255, 255, 255));
        cadastroBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        cadastroBtn.setForeground(new java.awt.Color(51, 0, 102));
        cadastroBtn.setText("Ainda não possui uma conta? Registre-se");
        cadastroBtn.setBorder(null);
        cadastroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusLb, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(statusLb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsuarioActionPerformed
        // vazio
    }//GEN-LAST:event_loginUsuarioActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        int verifica = verificaLogin(loginUsuario, loginSenha);
       
        if(verifica == 1){
            Usuario usuario = new Usuario(loginUsuario.getText(), loginSenha.getText());
            new Admin().setVisible(true);
            this.dispose();
        }
        if(verifica == 2){
            Usuario usuario = new Usuario(loginUsuario.getText(), loginSenha.getText());
            new Loja().setVisible(true);
            this.dispose();
            
        }else{
            statusLb.setText("Falha ao logar!");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSenhaActionPerformed
        // vazio
    }//GEN-LAST:event_loginSenhaActionPerformed

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fecharBtnActionPerformed
    
    private void cadastroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBtnActionPerformed
     
        String novoLogin = JOptionPane.showInputDialog(null,"Novo usuário:", "Cadastro",JOptionPane.PLAIN_MESSAGE);
        if(verificaCadastro(0,novoLogin) == false && novoLogin != null){
            String novaSenha = JOptionPane.showInputDialog(null,"Nova Senha", "Cadastro",JOptionPane.PLAIN_MESSAGE);
            
            if(verificaCadastro(1,novaSenha) == false && novaSenha != null){
                cadastraUsuario(novoLogin,novaSenha);
                JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!");
                
            }else
                JOptionPane.showMessageDialog(null,"Falha ao cadastrar senha!");
        
        }else{
            JOptionPane.showMessageDialog(null,"Falha ao cadastrar usuário!");
        }
       
    }//GEN-LAST:event_cadastroBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroBtn;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField loginSenha;
    private javax.swing.JTextField loginUsuario;
    private javax.swing.JLabel statusLb;
    // End of variables declaration//GEN-END:variables
}
