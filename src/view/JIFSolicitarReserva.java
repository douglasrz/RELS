/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JTextField;
import model.Cadastrar;
import model.Solicitacoes;

/**
 *
 * @author Anderson
 */
public class JIFSolicitarReserva extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFSolicitarReserva
     */
    private JIFReservasFeitasController controllerDaTabela;
    
    private JIFSolicitarReservaController controller;
    private Solicitacoes solicitacao;
    private Cadastrar cadastro;
    
    public JIFSolicitarReserva(JIFReservasFeitasController controllerDaTabela, Solicitacoes solicitacao, Cadastrar cadastro) {
        initComponents();
        this.solicitacao = solicitacao;
        this.cadastro = cadastro;
        controller = new JIFSolicitarReservaController(controllerDaTabela ,this, solicitacao, cadastro);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        horarios = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jComboBoxSolicitavel = new javax.swing.JComboBox();
        jButtonSolicitar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxDiaDoInicialDoEmprestimo = new javax.swing.JComboBox();
        jComboBoxMesDoInicialDoEmprestimo = new javax.swing.JComboBox();
        jComboBoxAnoDoInicialDoEmprestimo = new javax.swing.JComboBox();
        jRadioButton8as10 = new javax.swing.JRadioButton();
        jRadioButton10as12 = new javax.swing.JRadioButton();
        jRadioButton14as16 = new javax.swing.JRadioButton();
        jRadioButton16as18 = new javax.swing.JRadioButton();
        jComboBoxDiaDaEntraga = new javax.swing.JComboBox();
        jComboBoxMesDaEntraga = new javax.swing.JComboBox();
        jComboBoxAnoDaEntraga = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Solicitar Reserva");
        setName(""); // NOI18N

        jLabel1.setText("Mátricula:");

        jComboBoxSolicitavel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sala de Aula", "Laboratório de Química", "Laboratório de Física", "Laboratório de Informática", "Auditório", "Carro", "Ônibus", "Datashow", "Notebook" }));

        jButtonSolicitar.setText("Solicitar");
        jButtonSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolicitarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");

        jLabel2.setText("Data do inicio do empretimo");

        jLabel3.setText("Data final do emprestrimo");

        jComboBoxDiaDoInicialDoEmprestimo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBoxMesDoInicialDoEmprestimo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBoxAnoDoInicialDoEmprestimo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));

        horarios.add(jRadioButton8as10);
        jRadioButton8as10.setSelected(true);
        jRadioButton8as10.setText("8 as 10");

        horarios.add(jRadioButton10as12);
        jRadioButton10as12.setText("10 as 12");

        horarios.add(jRadioButton14as16);
        jRadioButton14as16.setText("14 as 16");

        horarios.add(jRadioButton16as18);
        jRadioButton16as18.setText("16 as 18");

        jComboBoxDiaDaEntraga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxDiaDaEntraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaDaEntragaActionPerformed(evt);
            }
        });

        jComboBoxMesDaEntraga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBoxAnoDaEntraga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton8as10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton10as12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton14as16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton16as18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxDiaDoInicialDoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxMesDoInicialDoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAnoDoInicialDoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxSolicitavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxDiaDaEntraga, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMesDaEntraga, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxAnoDaEntraga, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSolicitar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jComboBoxSolicitavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDiaDoInicialDoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMesDoInicialDoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAnoDoInicialDoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton8as10)
                    .addComponent(jRadioButton10as12)
                    .addComponent(jRadioButton14as16)
                    .addComponent(jRadioButton16as18))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDiaDaEntraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMesDaEntraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAnoDaEntraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSolicitar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitarActionPerformed
        controller.getEvent(evt);
    }//GEN-LAST:event_jButtonSolicitarActionPerformed

    private void jComboBoxDiaDaEntragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaDaEntragaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDiaDaEntragaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup horarios;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSolicitar;
    public javax.swing.JComboBox jComboBoxAnoDaEntraga;
    public javax.swing.JComboBox jComboBoxAnoDoInicialDoEmprestimo;
    public javax.swing.JComboBox jComboBoxDiaDaEntraga;
    public javax.swing.JComboBox jComboBoxDiaDoInicialDoEmprestimo;
    public javax.swing.JComboBox jComboBoxMesDaEntraga;
    public javax.swing.JComboBox jComboBoxMesDoInicialDoEmprestimo;
    public javax.swing.JComboBox jComboBoxSolicitavel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JRadioButton jRadioButton10as12;
    public javax.swing.JRadioButton jRadioButton14as16;
    public javax.swing.JRadioButton jRadioButton16as18;
    public javax.swing.JRadioButton jRadioButton8as10;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables

    public String getTxtMatricula() {
        return txtMatricula.getText();
    }

    public void setTxtMatricula(JTextField txtMatricula) {
        this.txtMatricula = txtMatricula;
    }

    
}
