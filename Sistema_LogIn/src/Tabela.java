
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dbugalho
 */
public class Tabela extends javax.swing.JFrame {

    /**
     * Creates new form Tabela
     */
    public Tabela() {
        initComponents();
        preencherTabela ();
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
        jTable1 = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        ctxSair = new javax.swing.JButton();
        Editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Email", "Morada", "Telefone", "N.I.F", "Login", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        delete.setBackground(new java.awt.Color(204, 0, 255));
        delete.setText("Apagar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        ctxSair.setBackground(new java.awt.Color(255, 0, 51));
        ctxSair.setText("SAIR");
        ctxSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxSairActionPerformed(evt);
            }
        });

        Editar.setBackground(new java.awt.Color(51, 0, 255));
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ctxSair, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(Editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delete)
                        .addComponent(Editar))
                    .addComponent(ctxSair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
                                             
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
    
            int i =JOptionPane.showConfirmDialog(null,"Pretende Remover", "Tem a Certeza?", JOptionPane.YES_NO_OPTION);
            if(i==JOptionPane.YES_OPTION){
            	int p = (int)jTable1.getValueAt(jTable1.getSelectedRow(),0);
        	LigaBD.remove(p);
            }    
        
                                  
        
    }//GEN-LAST:event_deleteActionPerformed

    private void ctxSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxSairActionPerformed
        MenuOpcoes log = new MenuOpcoes ();
        this.dispose();
        log.setVisible(true);
    }//GEN-LAST:event_ctxSairActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        LigaBD.ligacao();
        Editar_Registo fr = null;
        try {
            fr = new Editar_Registo ();
        } catch (IOException ex) {
            Logger.getLogger(MenuOpcoes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuOpcoes.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setVisible(false);
       fr.setVisible(true);
    }//GEN-LAST:event_EditarActionPerformed

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
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela().setVisible(true);
            }
        });
    }
    public void preencherTabela () {
    
       // Codigo da Iza
    try{
          PreparedStatement ps=null;
        ResultSet rs=null;
        int contador=0;
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        Connection conexao = LigaBD.ligacao();
        ps = conexao.prepareStatement("Select * from utilizador");
        rs= ps.executeQuery();
        rs.first();
       
     int rowCount=dtm.getRowCount();
     for (int i = rowCount - 1; i>=0; i--){
         dtm.removeRow(i);
    }
     do{
         dtm.addRow(new Object []{rs.getInt("idUtilizador"),rs.getString("nome"),rs.getString("email"),rs.getString("morada"),rs.getInt("telefone"),rs.getString("nif"),rs.getString("login"),rs.getString("password")});
     }while(rs.next());
    }catch(Exception e){
    e.printStackTrace();
}
        
        
     
//     try {
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        int contador = 0;
//        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
//         Class.forName("com.mysql.cj.jbdc.Driver").newInstance();
//         //string ligação DB
//         conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/rhcencal?useSSL=false&serverTimezone=UTC");
//         
//         ps = conexao.prepareStatement("Select * from utilizador");
//         rs=ps.executeQuery();
//         rs.first();
//         
//     int rowCount = modelo.getRowCount();
//     //remove linhas uma por uma, no final da tabela:
//     for (int i = rowCount - 1; i > 0; i--) {
//         modelo.removeRow(i);
//     }
//     do{
//         //adicionar elementos as colunas
//         modelo.addRow(new Object[]{rs.getInt("id"),rs.getString("Nome"),rs.getString("Email"), rs.getString("Morada"), rs.getInt("Telefone"), rs.getInt ("N.I.F"), rs.getString("Login"), rs.getString ("Password")});
//     }while(rs.next());
//     }catch(Exception e){
//         e.printStackTrace();
//     }
//    
    
}
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JButton ctxSair;
    private javax.swing.JButton delete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
