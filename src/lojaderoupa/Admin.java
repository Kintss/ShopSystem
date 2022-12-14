/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lojaderoupa;

import produtos.Bermuda;
import produtos.Calca;
import produtos.Camisa;
import produtos.Casaco;
import produtos.Roupa;
import static produtos.Roupa.setId;
import static sistemas.Sistema.clearArquivo;
import static sistemas.Sistema.loadTabela;
import static sistemas.Sistema.saveTabela;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static produtos.Roupa.getId;

/**
 *
 * @author igorq
 */
public class Admin extends javax.swing.JFrame {

    ArrayList<Roupa> roupaLista = new ArrayList();
    ArrayList<Camisa> camisaLista = new ArrayList();
    ArrayList<Bermuda> bermudaLista = new ArrayList();
    ArrayList<Casaco> casacoLista = new ArrayList();
    ArrayList<Calca> calcaLista = new ArrayList();

    public Admin() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        produtoNome = new javax.swing.JTextField();
        produtoPreco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        produtoCate = new javax.swing.JComboBox<>();
        adicionarBtn = new javax.swing.JButton();
        editarBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        limparBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtoTabela = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        statusLb = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        produtoTam = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        entregasTabela = new javax.swing.JTable();
        verEntregasBtn = new javax.swing.JButton();
        excluirBtn1 = new javax.swing.JButton();
        carregaTabelaBtn = new javax.swing.JButton();
        salvaTabelaBtn = new javax.swing.JButton();
        statusLb2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fecharBtn = new javax.swing.JButton();
        statusLb3 = new javax.swing.JLabel();
        deslogarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 102));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(51, 0, 102));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("GERENCIAMENTO DE PRODUTOS");

        jLabel4.setBackground(new java.awt.Color(51, 0, 102));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("NOME");

        produtoNome.setBackground(new java.awt.Color(255, 255, 255));
        produtoNome.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        produtoNome.setForeground(new java.awt.Color(51, 0, 102));
        produtoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoNomeActionPerformed(evt);
            }
        });

        produtoPreco.setBackground(new java.awt.Color(255, 255, 255));
        produtoPreco.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        produtoPreco.setForeground(new java.awt.Color(51, 0, 102));
        produtoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoPrecoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 0, 102));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("PREÇO");

        jLabel8.setBackground(new java.awt.Color(51, 0, 102));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("CATEGORIA");

        produtoCate.setBackground(new java.awt.Color(255, 255, 255));
        produtoCate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        produtoCate.setForeground(new java.awt.Color(0, 0, 0));
        produtoCate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camisa", "Casaco", "Bermuda", "Calça" }));
        produtoCate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        produtoCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoCateActionPerformed(evt);
            }
        });

        adicionarBtn.setBackground(new java.awt.Color(51, 0, 102));
        adicionarBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        adicionarBtn.setForeground(new java.awt.Color(255, 255, 255));
        adicionarBtn.setText("Adicionar");
        adicionarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarBtnActionPerformed(evt);
            }
        });

        editarBtn.setBackground(new java.awt.Color(51, 0, 102));
        editarBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        editarBtn.setForeground(new java.awt.Color(255, 255, 255));
        editarBtn.setText("Editar");
        editarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

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

        limparBtn.setBackground(new java.awt.Color(51, 0, 102));
        limparBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        limparBtn.setForeground(new java.awt.Color(255, 255, 255));
        limparBtn.setText("Limpar");
        limparBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBtnActionPerformed(evt);
            }
        });

        produtoTabela.setAutoCreateRowSorter(true);
        produtoTabela.setBackground(new java.awt.Color(255, 255, 255));
        produtoTabela.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        produtoTabela.setForeground(new java.awt.Color(0, 0, 0));
        produtoTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "PREÇO", "CATEGORIA", "TAMANHO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtoTabela.setGridColor(new java.awt.Color(0, 0, 0));
        produtoTabela.setRowHeight(25);
        produtoTabela.setSelectionBackground(new java.awt.Color(51, 0, 102));
        produtoTabela.setSelectionForeground(new java.awt.Color(255, 255, 255));
        produtoTabela.setShowGrid(true);
        jScrollPane1.setViewportView(produtoTabela);

        jLabel9.setBackground(new java.awt.Color(51, 0, 102));
        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 102));
        jLabel9.setText("LISTA DE PRODUTOS");

        statusLb.setBackground(new java.awt.Color(255, 0, 0));
        statusLb.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        statusLb.setForeground(new java.awt.Color(255, 0, 0));
        statusLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setBackground(new java.awt.Color(51, 0, 102));
        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("TAMANHO");

        produtoTam.setBackground(new java.awt.Color(255, 255, 255));
        produtoTam.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        produtoTam.setForeground(new java.awt.Color(0, 0, 0));
        produtoTam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PP", "P", "M", "G", "GG" }));
        produtoTam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        produtoTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoTamActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(51, 0, 102));
        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 102));
        jLabel11.setText("PRODUTOS PARA ENTREGAR");

        entregasTabela.setBackground(new java.awt.Color(255, 255, 255));
        entregasTabela.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        entregasTabela.setForeground(new java.awt.Color(0, 0, 0));
        entregasTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CIDADE", "RUA", "BAIRRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        entregasTabela.setGridColor(new java.awt.Color(0, 0, 0));
        entregasTabela.setRowHeight(25);
        entregasTabela.setSelectionBackground(new java.awt.Color(51, 0, 102));
        entregasTabela.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(entregasTabela);

        verEntregasBtn.setBackground(new java.awt.Color(51, 0, 102));
        verEntregasBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        verEntregasBtn.setForeground(new java.awt.Color(255, 255, 255));
        verEntregasBtn.setText("Ver Entregas");
        verEntregasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verEntregasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEntregasBtnActionPerformed(evt);
            }
        });

        excluirBtn1.setBackground(new java.awt.Color(51, 0, 102));
        excluirBtn1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        excluirBtn1.setForeground(new java.awt.Color(255, 255, 255));
        excluirBtn1.setText("Excluir");
        excluirBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluirBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(207, 207, 207))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(adicionarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(excluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(limparBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(statusLb, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(205, 205, 205))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(produtoCate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(produtoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produtoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produtoTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(verEntregasBtn)
                        .addGap(18, 18, 18)
                        .addComponent(excluirBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(produtoCate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(produtoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(produtoTam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produtoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limparBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statusLb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verEntregasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        carregaTabelaBtn.setBackground(new java.awt.Color(255, 255, 255));
        carregaTabelaBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        carregaTabelaBtn.setForeground(new java.awt.Color(51, 0, 102));
        carregaTabelaBtn.setText("Carregar Tabela");
        carregaTabelaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        carregaTabelaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregaTabelaBtnActionPerformed(evt);
            }
        });

        salvaTabelaBtn.setBackground(new java.awt.Color(255, 255, 255));
        salvaTabelaBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        salvaTabelaBtn.setForeground(new java.awt.Color(51, 0, 102));
        salvaTabelaBtn.setText("Salvar Tabela");
        salvaTabelaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salvaTabelaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaTabelaBtnActionPerformed(evt);
            }
        });

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
        jLabel15.setText("Qualidade é aqui");

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

        statusLb3.setBackground(new java.awt.Color(255, 0, 0));
        statusLb3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        statusLb3.setForeground(new java.awt.Color(255, 0, 0));
        statusLb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(statusLb2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(carregaTabelaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(salvaTabelaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(fecharBtn)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(deslogarBtn))
                                        .addComponent(statusLb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecharBtn)
                            .addComponent(deslogarBtn))
                        .addGap(50, 50, 50)
                        .addComponent(statusLb2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(carregaTabelaBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salvaTabelaBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLb3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void produtoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoNomeActionPerformed
        //vazio
    }//GEN-LAST:event_produtoNomeActionPerformed

    private void produtoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoPrecoActionPerformed
        //vazio
    }//GEN-LAST:event_produtoPrecoActionPerformed

    private void produtoCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoCateActionPerformed
        //vazio
    }//GEN-LAST:event_produtoCateActionPerformed

    private void adicionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarBtnActionPerformed
        
        String nome = produtoNome.getText();
        Float preco = Float.valueOf(produtoPreco.getText());
        String categoria = (String) produtoCate.getSelectedItem();
        String tamanho = (String) produtoTam.getSelectedItem();
        
        try{
            DefaultTableModel tabelaProduto = (DefaultTableModel) produtoTabela.getModel();
                      
            switch (categoria){
                case "Camisa" -> {
                    Camisa camisa = new Camisa(nome, preco, categoria, tamanho);

                    Object[] novoProduto = new Object[]{
                        getId(), camisa.getNome(), camisa.getPreco(), camisa.getCategoria(), camisa.getTamanho()
                    };
                    roupaLista.add(camisa);
                    camisaLista.add(camisa);
                    tabelaProduto.addRow(novoProduto); 
                    break;
                }
                case "Bermuda" ->{
                    Bermuda bermuda= new Bermuda(nome, preco, categoria, tamanho);

                    Object[] novoProduto = new Object[]{
                        bermuda.getId(), bermuda.getNome(), bermuda.getPreco(), bermuda.getCategoria(), bermuda.getTamanho()
                    };
                    roupaLista.add(bermuda);
                    bermudaLista.add(bermuda);
                    tabelaProduto.addRow(novoProduto); 
                    break;
                }
                case "Casaco" ->{
                    Casaco casaco = new Casaco(nome, preco, categoria, tamanho);

                    Object[] novoProduto = new Object[]{
                        getId(), casaco.getNome(), casaco.getPreco(), casaco.getCategoria(), casaco.getTamanho()
                    };
                    roupaLista.add(casaco);
                    casacoLista.add(casaco);
                    tabelaProduto.addRow(novoProduto); 
                    break;
                    
                }
                case "Calça" ->{
                    Calca calca = new Calca(nome, preco, categoria, tamanho);

                    Object[] novoProduto = new Object[]{
                        getId(), calca.getNome(), calca.getPreco(), calca.getCategoria(), calca.getTamanho()
                    };
                    roupaLista.add(calca);
                    calcaLista.add(calca);
                    tabelaProduto.addRow(novoProduto); 
                    break;
                }
            }
            statusLb.setText("Adicionado com sucesso!");
            
            // seta o id após editar algum produto
            setId(tabelaProduto.getRowCount());

        }catch(NumberFormatException e){
            statusLb.setText("Erro ao adicionar!");
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            //limpar campos
            produtoNome.setText("");
            produtoPreco.setText("");
        }
    }//GEN-LAST:event_adicionarBtnActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
        
        try{
       
        String nome = JOptionPane.showInputDialog(null,"Digite o nome:", "Editar",JOptionPane.PLAIN_MESSAGE);
        if(nome != null){
            Float preco = Float.valueOf(JOptionPane.showInputDialog(null,"Digite o preço:", "Editar",JOptionPane.PLAIN_MESSAGE));       
        produtoTabela.getModel().setValueAt(nome, produtoTabela.getSelectedRow(),1);
        produtoTabela.getModel().setValueAt(preco, produtoTabela.getSelectedRow(),2);
        }

        }catch(HeadlessException | NumberFormatException e){
           
        }
    }//GEN-LAST:event_editarBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed

        int selecionado = produtoTabela.getSelectedRow(); 
        
        setId(selecionado);        
        ((DefaultTableModel)produtoTabela.getModel()).removeRow(selecionado);
        roupaLista.remove(selecionado);
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void limparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBtnActionPerformed
        ((DefaultTableModel) produtoTabela.getModel()).setRowCount(0);
        setId(produtoTabela.getRowCount());
        try {
            clearArquivo();
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_limparBtnActionPerformed

    private void produtoTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoTamActionPerformed
        // vazio
    }//GEN-LAST:event_produtoTamActionPerformed

    private void carregaTabelaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregaTabelaBtnActionPerformed
        try{
            loadTabela(produtoTabela,"src\\sistemas\\dados\\Data.csv");
            setId(produtoTabela.getRowCount());
            statusLb2.setText("Sucesso!");
        }catch(Exception e){
            statusLb2.setText("Erro!");
        }      
    }//GEN-LAST:event_carregaTabelaBtnActionPerformed

    private void salvaTabelaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaTabelaBtnActionPerformed
        try{
            saveTabela(produtoTabela,"src\\sistemas\\dados\\Data.csv");
            statusLb3.setText("Sucesso!");
        }catch(Exception e){
            statusLb3.setText("Erro!");
        }    
        saveTabela(produtoTabela,"src\\Sistema\\Data.csv");
    }//GEN-LAST:event_salvaTabelaBtnActionPerformed

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void verEntregasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEntregasBtnActionPerformed
      
        try{
            loadTabela(entregasTabela,"src\\sistemas\\dados\\Entregas.csv");

        }catch(Exception e){
        }  
    }//GEN-LAST:event_verEntregasBtnActionPerformed

    private void excluirBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtn1ActionPerformed
        int selecionado = entregasTabela.getSelectedRow(); 
     
        ((DefaultTableModel)entregasTabela.getModel()).removeRow(selecionado);
    }//GEN-LAST:event_excluirBtn1ActionPerformed

    private void deslogarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslogarBtnActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deslogarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarBtn;
    private javax.swing.JButton carregaTabelaBtn;
    private javax.swing.JButton deslogarBtn;
    private javax.swing.JButton editarBtn;
    private javax.swing.JTable entregasTabela;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JButton excluirBtn1;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limparBtn;
    private javax.swing.JComboBox<String> produtoCate;
    private javax.swing.JTextField produtoNome;
    private javax.swing.JTextField produtoPreco;
    private javax.swing.JTable produtoTabela;
    private javax.swing.JComboBox<String> produtoTam;
    private javax.swing.JButton salvaTabelaBtn;
    private javax.swing.JLabel statusLb;
    private javax.swing.JLabel statusLb2;
    private javax.swing.JLabel statusLb3;
    private javax.swing.JButton verEntregasBtn;
    // End of variables declaration//GEN-END:variables
}
