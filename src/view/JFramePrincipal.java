/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

/**
 *
 * @author Anderson
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    //Eu to criando esse objetos aqui pq quando o programa for iniciado
    //so vai ter 1 objeto do tipo Cadastro e 1 objeto do tipo Solicitaçoes
    //com isso todo mundo q eu quero cadastrar fica somente em um objeto do tipo Cadastro
    //e todas as solicitacoes ficam somente um um objeto do tipo Solicitacoes

    JFramePrincipalController controller = new JFramePrincipalController(this);

    public JFramePrincipal() {
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

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemEstudante = new javax.swing.JMenuItem();
        jMenuItemProfessor = new javax.swing.JMenuItem();
        jMenuItemEquipamento = new javax.swing.JMenuItem();
        jMenuItemSala = new javax.swing.JMenuItem();
        jMenuItemAutomovel = new javax.swing.JMenuItem();
        jMenuSolicitar = new javax.swing.JMenu();
        jMenuItemReservar = new javax.swing.JMenuItem();
        jMenuItemDevolucao = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemObjetosCadastrados = new javax.swing.JMenuItem();
        jMenuItemReservados = new javax.swing.JMenuItem();
        jMenuItemPessoasCadastradas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        jMenuCadastrar.setText("Cadastar");
        jMenuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarActionPerformed(evt);
            }
        });

        jMenuItemEstudante.setText("Estudante");
        jMenuItemEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstudanteActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemEstudante);

        jMenuItemProfessor.setText("Professor");
        jMenuItemProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProfessorActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemProfessor);

        jMenuItemEquipamento.setText("Equipamento");
        jMenuItemEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEquipamentoActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemEquipamento);

        jMenuItemSala.setText("Sala");
        jMenuItemSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalaActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemSala);

        jMenuItemAutomovel.setText("Automovel");
        jMenuItemAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAutomovelActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemAutomovel);

        jMenuBar1.add(jMenuCadastrar);

        jMenuSolicitar.setText("Solicitar");

        jMenuItemReservar.setText("Reserva");
        jMenuItemReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReservarActionPerformed(evt);
            }
        });
        jMenuSolicitar.add(jMenuItemReservar);

        jMenuItemDevolucao.setText("Devolução");
        jMenuItemDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDevolucaoActionPerformed(evt);
            }
        });
        jMenuSolicitar.add(jMenuItemDevolucao);

        jMenuBar1.add(jMenuSolicitar);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemObjetosCadastrados.setText("Objetos Cadastrados");
        jMenuItemObjetosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemObjetosCadastradosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemObjetosCadastrados);

        jMenuItemReservados.setText("Reservas");
        jMenuItemReservados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReservadosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemReservados);

        jMenuItemPessoasCadastradas.setText("Pessoas Cadastradas");
        jMenuItemPessoasCadastradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPessoasCadastradasActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemPessoasCadastradas);

        jMenuBar1.add(jMenuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setBounds(0, 0, 685, 452);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastrarActionPerformed

    private void jMenuItemEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstudanteActionPerformed
        //Clicou naquele menuzinho cadastar e escolheu o submenu estudante

        //criou uma view do tipo JIFCadastrarEstudante
        //JIFCadastrarEstudante obj = new JIFCadastrarEstudante(cadastro);
        //adicionou ela a area de trabalho do programa
        //jdpPrincipal.add(obj);
        //e deixou ela visivel
        //obj.setVisible(true);
        //A MSM COISA PROS EVENTOS ABAIXO
        //É A MSM LOGICA
        controller.getEvent(evt);
    }//GEN-LAST:event_jMenuItemEstudanteActionPerformed

    private void jMenuItemPessoasCadastradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPessoasCadastradasActionPerformed
        //JIFPessoasCadastradas obj = new JIFPessoasCadastradas(cadastro);
        //jdpPrincipal.add(obj);
        //obj.setVisible(true);
        
        controller.getEvent(evt);

    }//GEN-LAST:event_jMenuItemPessoasCadastradasActionPerformed

    private void jMenuItemProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProfessorActionPerformed
        //JIFCadastrarProfessor obj = new JIFCadastrarProfessor(cadastro);
        //jdpPrincipal.add(obj);
        //obj.setVisible(true);
        
        controller.getEvent(evt);
    }//GEN-LAST:event_jMenuItemProfessorActionPerformed

    private void jMenuItemEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEquipamentoActionPerformed
        //JIFCadastrarEquipamento obj = new JIFCadastrarEquipamento(cadastro);
        //jdpPrincipal.add(obj);
        //obj.setVisible(true);
        
        controller.getEvent(evt);
    }//GEN-LAST:event_jMenuItemEquipamentoActionPerformed

    private void jMenuItemSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalaActionPerformed
        //JIFCadastrarSala obj = new JIFCadastrarSala(cadastro);
        //jdpPrincipal.add(obj);
        //obj.setVisible(true);
        
        controller.getEvent(evt);
    }//GEN-LAST:event_jMenuItemSalaActionPerformed

    private void jMenuItemAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAutomovelActionPerformed
        //JIFCadastrarAutomovel obj = new JIFCadastrarAutomovel(cadastro);
        //jdpPrincipal.add(obj);
        //obj.setVisible(true);
        
        controller.getEvent(evt);
    }//GEN-LAST:event_jMenuItemAutomovelActionPerformed

    private void jMenuItemReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReservarActionPerformed
        //JIFSolicitarReserva obj = new JIFSolicitarReserva(solicitacao, cadastro);
        //jdpPrincipal.add(obj);
        //obj.setVisible(true);
        
        controller.getEvent(evt);
    }//GEN-LAST:event_jMenuItemReservarActionPerformed

    private void jMenuItemDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDevolucaoActionPerformed
        //JIFSolicitarDevolucao obj = new JIFSolicitarDevolucao(cadastro, solicitacao);
        //jdpPrincipal.add(obj);
        //obj.setVisible(true);
        
        controller.getEvent(evt);
    }//GEN-LAST:event_jMenuItemDevolucaoActionPerformed

    private void jMenuItemReservadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReservadosActionPerformed
        controller.getEvent(evt);
    }//GEN-LAST:event_jMenuItemReservadosActionPerformed

    private void jMenuItemObjetosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemObjetosCadastradosActionPerformed
        controller.getEvent(evt);
    }//GEN-LAST:event_jMenuItemObjetosCadastradosActionPerformed

    
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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemAutomovel;
    private javax.swing.JMenuItem jMenuItemDevolucao;
    private javax.swing.JMenuItem jMenuItemEquipamento;
    private javax.swing.JMenuItem jMenuItemEstudante;
    private javax.swing.JMenuItem jMenuItemObjetosCadastrados;
    private javax.swing.JMenuItem jMenuItemPessoasCadastradas;
    private javax.swing.JMenuItem jMenuItemProfessor;
    private javax.swing.JMenuItem jMenuItemReservados;
    private javax.swing.JMenuItem jMenuItemReservar;
    private javax.swing.JMenuItem jMenuItemSala;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSolicitar;
    private javax.swing.JDesktopPane jdpPrincipal;
    // End of variables declaration//GEN-END:variables

    public JMenuItem getjMenuItemEstudante() {
        return jMenuItemEstudante;
    }

    public JMenuItem getjMenuItemAutomovel() {
        return jMenuItemAutomovel;
    }

    public JMenuItem getjMenuItemDevolucao() {
        return jMenuItemDevolucao;
    }

    public JMenuItem getjMenuItemDisponibilidade() {
        return jMenuItemObjetosCadastrados;
    }

    public JMenuItem getjMenuItemEquipamento() {
        return jMenuItemEquipamento;
    }

    public JMenuItem getjMenuItemPessoasCadastradas() {
        return jMenuItemPessoasCadastradas;
    }

    public JMenuItem getjMenuItemProfessor() {
        return jMenuItemProfessor;
    }

    public JMenuItem getjMenuItemReserva() {
        return jMenuItemReservar;
    }

    public JMenuItem getjMenuItemSala() {
        return jMenuItemSala;
    }

    public JMenuItem getjMenuItemReservados() {
        return jMenuItemReservados;
    }
    
    

    public JDesktopPane getJdpPrincipal() {
        return jdpPrincipal;
    }

}