/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Charlie
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public String userLogado;
    public FrmMenu() {
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/clinicam.png"));
        Image image = icon.getImage();
        painel_desktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(), getHeight(),this);
            }
        }
        ;
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogadojLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuClientesjMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuFuncionariosjMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuFornecedoresjMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuEstoquejMenuItem4 = new javax.swing.JMenuItem();
        cadastroProdutosjMenuItem1 = new javax.swing.JMenuItem();
        consultaProdutosjMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuPDVjMenuItem6 = new javax.swing.JMenuItem();
        posicaoDiajMenuItem7 = new javax.swing.JMenuItem();
        histoticoVendasjMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuTrocarUsuariojMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menuSairjMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu principal - Clínica médica de Dolcinópolis -SP");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Logado por:");

        lblLogadojLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblLogadojLabel2.setText("Charliston");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogadojLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(658, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogadojLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        painel_desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painel_desktopLayout = new javax.swing.GroupLayout(painel_desktop);
        painel_desktop.setLayout(painel_desktopLayout);
        painel_desktopLayout.setHorizontalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painel_desktopLayout.setVerticalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_desktopLayout.createSequentialGroup()
                .addGap(0, 352, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacient.png"))); // NOI18N
        jMenu1.setText("Pacientes");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menuClientesjMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuClientesjMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuClientesjMenuItem1.setText("Controle de Pacientes");
        menuClientesjMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesjMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(menuClientesjMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/employee.png"))); // NOI18N
        jMenu2.setText("Funcionários");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menuFuncionariosjMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        menuFuncionariosjMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuFuncionariosjMenuItem2.setText("Controle de funcionários");
        menuFuncionariosjMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionariosjMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(menuFuncionariosjMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/emergency.png"))); // NOI18N
        jMenu3.setText("Fornecedores");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menuFornecedoresjMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuFornecedoresjMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuFornecedoresjMenuItem3.setText("Controle de fornecedores");
        menuFornecedoresjMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFornecedoresjMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(menuFornecedoresjMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/medical services.png"))); // NOI18N
        jMenu6.setText("Serviços");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menuEstoquejMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuEstoquejMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuEstoquejMenuItem4.setText("Controle de Estoque");
        menuEstoquejMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEstoquejMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(menuEstoquejMenuItem4);

        cadastroProdutosjMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        cadastroProdutosjMenuItem1.setText("Cadastro de Produtos");
        cadastroProdutosjMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProdutosjMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(cadastroProdutosjMenuItem1);

        consultaProdutosjMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        consultaProdutosjMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consultaProdutosjMenuItem5.setText("Consulta de produtos");
        consultaProdutosjMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProdutosjMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(consultaProdutosjMenuItem5);

        jMenuBar1.add(jMenu6);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/medical.png"))); // NOI18N
        jMenu4.setText("Consultas");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menuPDVjMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuPDVjMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuPDVjMenuItem6.setText("Iniciar consulta médica");
        menuPDVjMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPDVjMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(menuPDVjMenuItem6);

        posicaoDiajMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        posicaoDiajMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        posicaoDiajMenuItem7.setText("Posição financeira do dia");
        posicaoDiajMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicaoDiajMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(posicaoDiajMenuItem7);

        histoticoVendasjMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        histoticoVendasjMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        histoticoVendasjMenuItem8.setText("Histórico de consultas");
        histoticoVendasjMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histoticoVendasjMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(histoticoVendasjMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/settings.png"))); // NOI18N
        jMenu5.setText("Configurações");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });

        menuTrocarUsuariojMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuTrocarUsuariojMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuTrocarUsuariojMenuItem9.setText("Trocar usuários");
        menuTrocarUsuariojMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTrocarUsuariojMenuItem9MouseClicked(evt);
            }
        });
        menuTrocarUsuariojMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrocarUsuariojMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(menuTrocarUsuariojMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/to swich of.png"))); // NOI18N
        jMenu7.setText("Sair");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menuSairjMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuSairjMenuItem10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuSairjMenuItem10.setText("Sair do sistema");
        menuSairjMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairjMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(menuSairjMenuItem10);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.setExtendedState(this.MAXIMIZED_BOTH);
        lblLogadojLabel2.setText(userLogado);
        this.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void posicaoDiajMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicaoDiajMenuItem7ActionPerformed
        // TODO add your handling code here:
        FormTotalVenda formTotalVenda  = new FormTotalVenda();
        formTotalVenda.setVisible(true);
    }//GEN-LAST:event_posicaoDiajMenuItem7ActionPerformed

    private void menuTrocarUsuariojMenuItem9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTrocarUsuariojMenuItem9MouseClicked
          
    }//GEN-LAST:event_menuTrocarUsuariojMenuItem9MouseClicked

    private void menuTrocarUsuariojMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrocarUsuariojMenuItem9ActionPerformed
        // logOut
        FrmLogin login = new FrmLogin();
        this.dispose();
        login.setVisible(true);     
    }//GEN-LAST:event_menuTrocarUsuariojMenuItem9ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
       
    }//GEN-LAST:event_jMenu5MouseClicked

    private void menuSairjMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairjMenuItem10ActionPerformed
        // nemu sair
        int op = JOptionPane.showConfirmDialog(null, "tem certeza que deseja sair?");
        if(op==0){
        System.exit(0);
        }else if(op==2){
        JOptionPane.showMessageDialog(null, "cancelando...");
        }
    }//GEN-LAST:event_menuSairjMenuItem10ActionPerformed

    private void consultaProdutosjMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProdutosjMenuItem5ActionPerformed
        // consulta de produtos
        frmProdutos consultaProd = new frmProdutos();
        consultaProd.painelDeGuiasjTabbedPane4.setSelectedIndex(1);
        consultaProd.setVisible(true);
    }//GEN-LAST:event_consultaProdutosjMenuItem5ActionPerformed

    private void menuClientesjMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesjMenuItem1ActionPerformed
        // TODO add your handling code here:
        frmCliente cliente = new frmCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_menuClientesjMenuItem1ActionPerformed

    private void menuFuncionariosjMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionariosjMenuItem2ActionPerformed
        // TODO add your handling code here:
        frmFuncionario funcionario = new frmFuncionario();
        funcionario.setVisible(true);
    }//GEN-LAST:event_menuFuncionariosjMenuItem2ActionPerformed

    private void menuFornecedoresjMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFornecedoresjMenuItem3ActionPerformed
        // TODO add your handling code here:
        frmFornecedor fornecedor = new frmFornecedor();
        fornecedor.setVisible(true);
    }//GEN-LAST:event_menuFornecedoresjMenuItem3ActionPerformed

    private void menuPDVjMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPDVjMenuItem6ActionPerformed
        // TODO add your handling code here:
        FormVendas formVendas = new FormVendas();
        formVendas.setVisible(true);
    }//GEN-LAST:event_menuPDVjMenuItem6ActionPerformed

    private void histoticoVendasjMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histoticoVendasjMenuItem8ActionPerformed
        // TODO add your handling code here:
        FormHistorico formHistorico = new FormHistorico();
        formHistorico.setVisible(true);
    }//GEN-LAST:event_histoticoVendasjMenuItem8ActionPerformed

    private void menuEstoquejMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEstoquejMenuItem4ActionPerformed
        // TODO add your handling code here:
        FormEstoque estoque = new FormEstoque();
        estoque.setVisible(true);
        
    }//GEN-LAST:event_menuEstoquejMenuItem4ActionPerformed

    private void cadastroProdutosjMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProdutosjMenuItem1ActionPerformed
        // TODO add your handling code here:
         frmProdutos consultaProd = new frmProdutos();
        consultaProd.painelDeGuiasjTabbedPane4.setSelectedIndex(0);
        consultaProd.setVisible(true);
    }//GEN-LAST:event_cadastroProdutosjMenuItem1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroProdutosjMenuItem1;
    private javax.swing.JMenuItem consultaProdutosjMenuItem5;
    public javax.swing.JMenuItem histoticoVendasjMenuItem8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogadojLabel2;
    private javax.swing.JMenuItem menuClientesjMenuItem1;
    private javax.swing.JMenuItem menuEstoquejMenuItem4;
    private javax.swing.JMenuItem menuFornecedoresjMenuItem3;
    public javax.swing.JMenuItem menuFuncionariosjMenuItem2;
    private javax.swing.JMenuItem menuPDVjMenuItem6;
    private javax.swing.JMenuItem menuSairjMenuItem10;
    private javax.swing.JMenuItem menuTrocarUsuariojMenuItem9;
    private javax.swing.JDesktopPane painel_desktop;
    public javax.swing.JMenuItem posicaoDiajMenuItem7;
    // End of variables declaration//GEN-END:variables
}
