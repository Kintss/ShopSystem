/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lojaderoupa;

import sistemas.Endereco;
import static sistemas.Sistema.geraTabelaEntregas;
import static sistemas.Sistema.preencheTabelaLoja;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author igorq
 */
public class Loja extends javax.swing.JFrame {
    
    

    /**
     * Creates new form Loja
     */
    public Loja() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lojaTabela = new javax.swing.JTable();
        statusLb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pesquisarBtn = new javax.swing.JButton();
        OrdenaCb = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        lojaCarrinho = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        addCarrinhoBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        totalBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cidadeEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ruaEndereco = new javax.swing.JTextField();
        bairroEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comprarBtn = new javax.swing.JButton();
        statusLb3 = new javax.swing.JLabel();
        statusLb4 = new javax.swing.JLabel();
        excluirBtn = new javax.swing.JButton();
        statusLb2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fecharBtn = new javax.swing.JButton();
        verProdBtn = new javax.swing.JButton();
        deslogarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 516));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(918, 249));

        jLabel2.setBackground(new java.awt.Color(51, 0, 102));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("LOJA");

        lojaTabela.setBackground(new java.awt.Color(255, 255, 255));
        lojaTabela.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        lojaTabela.setForeground(new java.awt.Color(0, 0, 0));
        lojaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "PRE??O", "CATEGORIA", "TAMANHO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lojaTabela.setGridColor(new java.awt.Color(0, 0, 0));
        lojaTabela.setRowHeight(25);
        lojaTabela.setSelectionBackground(new java.awt.Color(51, 0, 102));
        lojaTabela.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(lojaTabela);

        statusLb.setBackground(new java.awt.Color(255, 0, 0));
        statusLb.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        statusLb.setForeground(new java.awt.Color(255, 0, 0));
        statusLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setBackground(new java.awt.Color(51, 0, 102));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("PRODUTOS");

        pesquisarBtn.setBackground(new java.awt.Color(51, 0, 102));
        pesquisarBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        pesquisarBtn.setForeground(new java.awt.Color(255, 255, 255));
        pesquisarBtn.setText("Pesquisar");
        pesquisarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesquisarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBtnActionPerformed(evt);
            }
        });

        OrdenaCb.setText("Ordena????o");
        OrdenaCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenaCbActionPerformed(evt);
            }
        });

        lojaCarrinho.setBackground(new java.awt.Color(255, 255, 255));
        lojaCarrinho.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        lojaCarrinho.setForeground(new java.awt.Color(0, 0, 0));
        lojaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "PRE??O", "CATEGORIA", "TAMANHO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lojaCarrinho.setGridColor(new java.awt.Color(0, 0, 0));
        lojaCarrinho.setRowHeight(25);
        lojaCarrinho.setSelectionBackground(new java.awt.Color(51, 0, 102));
        lojaCarrinho.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(lojaCarrinho);

        jLabel4.setBackground(new java.awt.Color(51, 0, 102));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("CARRINHO");

        addCarrinhoBtn.setBackground(new java.awt.Color(51, 0, 102));
        addCarrinhoBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        addCarrinhoBtn.setForeground(new java.awt.Color(255, 255, 255));
        addCarrinhoBtn.setText("Adicionar ao carrinho");
        addCarrinhoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCarrinhoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarrinhoBtnActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(51, 0, 102));
        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 102));

        totalBtn.setBackground(new java.awt.Color(51, 0, 102));
        totalBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        totalBtn.setForeground(new java.awt.Color(255, 255, 255));
        totalBtn.setText("Total");
        totalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(51, 0, 102));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 102));
        jLabel5.setText("ENDERE??O");

        jLabel8.setBackground(new java.awt.Color(51, 0, 102));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("RUA e N??");

        cidadeEndereco.setBackground(new java.awt.Color(255, 255, 255));
        cidadeEndereco.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        cidadeEndereco.setForeground(new java.awt.Color(51, 0, 102));
        cidadeEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeEnderecoActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(51, 0, 102));
        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 102));
        jLabel9.setText("BAIRRO");

        ruaEndereco.setBackground(new java.awt.Color(255, 255, 255));
        ruaEndereco.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        ruaEndereco.setForeground(new java.awt.Color(51, 0, 102));

        bairroEndereco.setBackground(new java.awt.Color(255, 255, 255));
        bairroEndereco.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        bairroEndereco.setForeground(new java.awt.Color(51, 0, 102));

        jLabel7.setBackground(new java.awt.Color(51, 0, 102));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("CIDADE");

        comprarBtn.setBackground(new java.awt.Color(51, 0, 102));
        comprarBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        comprarBtn.setForeground(new java.awt.Color(255, 255, 255));
        comprarBtn.setText("Comprar");
        comprarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarBtnActionPerformed(evt);
            }
        });

        statusLb3.setBackground(new java.awt.Color(255, 0, 0));
        statusLb3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        statusLb3.setForeground(new java.awt.Color(255, 0, 0));
        statusLb3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        statusLb4.setBackground(new java.awt.Color(255, 0, 0));
        statusLb4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        statusLb4.setForeground(new java.awt.Color(0, 0, 0));
        statusLb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLb4.setText("Pagamento s??mente em pix para o n??mero: (xx) (xxxxx-xxxx)");

        excluirBtn.setBackground(new java.awt.Color(51, 0, 102));
        excluirBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        excluirBtn.setForeground(new java.awt.Color(255, 255, 255));
        excluirBtn.setText("Excluir");
        excluirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(statusLb3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comprarBtn))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(cidadeEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel8))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(ruaEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                                    .addComponent(bairroEndereco)))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(statusLb, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pesquisarBtn)
                                            .addComponent(addCarrinhoBtn)
                                            .addComponent(OrdenaCb)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(totalBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(statusLb4)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(excluirBtn)
                                                .addGap(82, 82, 82)))))
                                .addGap(2, 2, 2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel3)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(367, 367, 367))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(OrdenaCb)
                                .addGap(18, 18, 18)
                                .addComponent(pesquisarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addCarrinhoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusLb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cidadeEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ruaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(bairroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comprarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(excluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(totalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(statusLb3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addComponent(statusLb4)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        statusLb2.setBackground(new java.awt.Color(255, 0, 0));
        statusLb2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        statusLb2.setForeground(new java.awt.Color(255, 0, 0));
        statusLb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N

        jLabel14.setBackground(new java.awt.Color(51, 0, 102));
        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Loja de Roupa");

        jLabel15.setBackground(new java.awt.Color(51, 0, 102));
        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Qualidade ?? aqui");

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

        verProdBtn.setBackground(new java.awt.Color(255, 255, 255));
        verProdBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        verProdBtn.setForeground(new java.awt.Color(51, 0, 102));
        verProdBtn.setText("Ver produtos");
        verProdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verProdBtnActionPerformed(evt);
            }
        });

        deslogarBtn.setBackground(new java.awt.Color(255, 255, 255));
        deslogarBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        deslogarBtn.setForeground(new java.awt.Color(51, 0, 102));
        deslogarBtn.setText("Deslogar");
        deslogarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deslogarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deslogarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deslogarBtn))
                    .addComponent(verProdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(statusLb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(fecharBtn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel15)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(31, 31, 31))))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecharBtn)
                    .addComponent(deslogarBtn))
                .addGap(39, 39, 39)
                .addComponent(verProdBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLb2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void pesquisarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarBtnActionPerformed
        
        String pesquisaNome = JOptionPane.showInputDialog(null,"Digite um nome para pesquisar","Busca",JOptionPane.PLAIN_MESSAGE);
        
        if(pesquisaNome != null){
            for (int i = 0; i < lojaTabela.getRowCount(); i++){
                if(pesquisaNome.equals(lojaTabela.getValueAt(i,1))){;
                    lojaTabela.addRowSelectionInterval(i,i);
                }
            }
        }
     
    }//GEN-LAST:event_pesquisarBtnActionPerformed

    private void verProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProdBtnActionPerformed
        preencheTabelaLoja(lojaTabela);
 
    }//GEN-LAST:event_verProdBtnActionPerformed

    private void OrdenaCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenaCbActionPerformed
        lojaTabela.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_OrdenaCbActionPerformed

    private void addCarrinhoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarrinhoBtnActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) lojaCarrinho.getModel();
        
        int linha = lojaTabela.getSelectedRow();
        String[] carrinho = new String[50];
        for(int i = 0; i < lojaTabela.getColumnCount(); i++){
            String produto = lojaTabela.getModel().getValueAt(linha, i ).toString();
            carrinho[i] = produto;
        }
            tabela.addRow(carrinho);
    }//GEN-LAST:event_addCarrinhoBtnActionPerformed

    private void totalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBtnActionPerformed
    
        Float somaTotal = 0.0f;

        for(int i = 0; i < lojaCarrinho.getRowCount(); i++){
            somaTotal += Float.valueOf(lojaCarrinho.getValueAt(i, 2).toString());
        }
        jLabel6.setText(somaTotal + " Reais");

            
    }//GEN-LAST:event_totalBtnActionPerformed

    private void cidadeEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeEnderecoActionPerformed

    private void comprarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarBtnActionPerformed
        if(cidadeEndereco.getText()!= null && ruaEndereco.getText() != null && bairroEndereco.getText() != null){
            Endereco endereco = new Endereco(cidadeEndereco.getText(), ruaEndereco.getText(), bairroEndereco.getText());

            
            ArrayList<String> ids = new ArrayList();
            for (int i = 0; i < lojaCarrinho.getRowCount(); i++){
                ids.add(lojaTabela.getValueAt(i,0).toString());
                
            }

            geraTabelaEntregas(ids, "src\\sistemas\\dados\\Entregas.csv",endereco);

            statusLb3.setText("Compra Realizada!");
            
        }
        
    }//GEN-LAST:event_comprarBtnActionPerformed

    private void deslogarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslogarBtnActionPerformed
                    
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deslogarBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        
        int selecionado = lojaCarrinho.getSelectedRow();      
        ((DefaultTableModel)lojaCarrinho.getModel()).removeRow(selecionado);
    }//GEN-LAST:event_excluirBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox OrdenaCb;
    private javax.swing.JButton addCarrinhoBtn;
    private javax.swing.JTextField bairroEndereco;
    private javax.swing.JTextField cidadeEndereco;
    private javax.swing.JButton comprarBtn;
    private javax.swing.JButton deslogarBtn;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lojaCarrinho;
    private javax.swing.JTable lojaTabela;
    private javax.swing.JButton pesquisarBtn;
    private javax.swing.JTextField ruaEndereco;
    private javax.swing.JLabel statusLb;
    private javax.swing.JLabel statusLb2;
    private javax.swing.JLabel statusLb3;
    private javax.swing.JLabel statusLb4;
    private javax.swing.JButton totalBtn;
    private javax.swing.JButton verProdBtn;
    // End of variables declaration//GEN-END:variables
        

}

