

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dbugalho
 */
public class Editar_Registo extends javax.swing.JFrame {

    /**
     * Creates new form Editar_Registo
     */
    public Editar_Registo() throws IOException, SQLException {
        initComponents();
        //preencheFormulario();
        preencheFormDb();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ctxPassE = new javax.swing.JPasswordField();
        ctxNomeE = new javax.swing.JTextField();
        ctxEmailE = new javax.swing.JTextField();
        ctxSair = new javax.swing.JButton();
        ctxMoradaE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ctxNifE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ctxTelefoneE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ctxLoginE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ctxRepassE = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Nome");

        ctxNomeE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxNomeEActionPerformed(evt);
            }
        });

        ctxSair.setBackground(new java.awt.Color(255, 0, 51));
        ctxSair.setText("SAIR");
        ctxSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Morada");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("REGISTO DE UTILIZADOR");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("NIF");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("PassWord");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Telefone");

        ctxLoginE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxLoginEActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Login");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("RePassWord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ctxRepassE, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ctxLoginE, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ctxSair, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addComponent(ctxPassE, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctxEmailE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctxMoradaE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctxNifE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctxTelefoneE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctxNomeE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ctxNomeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctxEmailE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctxLoginE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctxMoradaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctxNifE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ctxTelefoneE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctxPassE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctxRepassE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctxSair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void mensagemErro (String erro) {
        JOptionPane.showMessageDialog(null, erro, "Erro validação", JOptionPane.ERROR_MESSAGE);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = ctxNomeE.getText();
        String email = ctxEmailE.getText();
        String morada = ctxMoradaE.getText();
        String telefone = ctxTelefoneE.getText();
        String nif = ctxNifE.getText();
        String pass = ctxPassE.getText();
        String repass = ctxRepassE.getText();

        if (nome.equals("") || email.equals("") || morada.equals("") ||
            telefone.equals("") || nif.equals("") || pass.equals ("")
            || repass.equals ("")){
            mensagemErro("Não vai ser alterado o conteudo");
        }else{
            if(!validaCampoNumerico(telefone)){
                mensagemErro ("O campo telefone tem " + "de ser númerico e ter 9 digitos");
            }
            if(!validaCampoNumerico(nif)){
                mensagemErro ("O campo nif tem " + "de ser númerico e ter 9 digitos");
            }
            if(!validaCampoChar(nome)){
                mensagemErro ("O campo nome tem " + "de ser alfabetico e ter pelo menos 2 elementos");
            }
            if(!validaCampoMor(morada)){
                mensagemErro ("O campo morada tem " + "de ser alfabetico e ter pelo menos 5 elementos");
            }
            if(!validaCampoMail(email)){
                mensagemErro ("O campo Email tem " + "de ter  '@' e um '.' depois deste");
            }
            if(!validaCampoPass(pass)){
                mensagemErro ("O campo pass tem " + "de ter pelo menos 8 componentes, sendo uma letra Maiuscula,"
                    + "minuscula, numero e caracter especial");
            }
            if(!pass.equals (repass)){
                mensagemErro ("A password não coincide !!");
            }

            File ficheiro = new File(Login.login+".txt");
            try {
                if(!ficheiro.exists()){
                    ficheiro.createNewFile();
                }
                FileWriter fw = new FileWriter(ficheiro);
                BufferedWriter bw = new BufferedWriter (fw);
                System.out.println("Insira o conteudo");
                bw.write(nome); 
                bw.newLine(); 
                bw.write(email);
                bw.newLine(); 
                bw.write(morada); 
                bw.newLine(); 
                bw.write(telefone); 
                bw.newLine(); 
                bw.write(nif); 
                bw.newLine(); 
                bw.write(pass); 
                bw.newLine(); 
                bw.write(repass); 
                bw.newLine(); 
                bw.close(); 
                fw.close(); 
            } catch (IOException ex){
                ex.printStackTrace();
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void ctxNomeEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxNomeEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxNomeEActionPerformed

    private void ctxSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxSairActionPerformed
        MenuOpcoes log = new MenuOpcoes ();
        this.dispose();
        log.setVisible(true);
    }//GEN-LAST:event_ctxSairActionPerformed

    private void ctxLoginEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxLoginEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxLoginEActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_Registo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Registo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Registo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Registo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Editar_Registo().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Editar_Registo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Editar_Registo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctxEmailE;
    private javax.swing.JTextField ctxLoginE;
    private javax.swing.JTextField ctxMoradaE;
    private javax.swing.JTextField ctxNifE;
    private javax.swing.JTextField ctxNomeE;
    private javax.swing.JPasswordField ctxPassE;
    private javax.swing.JPasswordField ctxRepassE;
    private javax.swing.JButton ctxSair;
    private javax.swing.JTextField ctxTelefoneE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

 private boolean validaCampoNumerico(String valor) { //Valor Start
       
       int x, contador=0, t=valor.length();
       char c;
       if (t!=9)
           return false;
       else{
           for (x=0; x<t ; x++){
               c = valor.charAt(x);
               if(isDigit(c))
                   contador++;    
           }
           if(t!=contador)
               return false;
       }
       return true;
    } // Fim Valor
   
    
    private boolean validaCampoChar (String valor) { // Nome Start
       
       int x, contador=0, t=valor.length();
       char a;
       
       if (t < 2)
           return false;
       else{
           for (x=0; x<t ; x++){
               a = valor.charAt(x);
               if(isLetter(a))
                   contador++;    
           }
           if(t!=contador)
               return false;
       }
       return true;
    } // Fim Nome
    
    
    private boolean validaCampoMor (String valor) { // Morada start 
       
       int x, contador=0, t=valor.length();
       char m;
       if (t < 5)
           return false;
       else{
           for (x=0; x<t ; x++){
               m = valor.charAt(x);
               if(isLetter(m))
                   contador++;    
           }
           if(t!=contador)
               return false;
       }
       return true;
    }   // Fim Morada
    
    private boolean validaCampoMail (String valor) { // Mail start
    int a, b, t=valor.length();
    
    a = valor.indexOf('@');
    b = valor.indexOf('.');
    
    for (int x = 0 ;  x < t ; x ++) {
        if (a >= 1 ) {
            if ( b >= a+2)
                return true;
            if ( (a + b - t) >= 1 );
        }   
    }  
    return false;
    } // Fim mail
  
 private static boolean validaCampoPass (String valor) { // Pass Start
     int x = 0, t = valor.length();
     
    boolean MaxFlag = false;
    boolean MinFlag = false;
    boolean NumFlag = false;
    boolean SpcFlag = false;
    
     if (t < 8)
            return false;
     
     for ( x = 0; x < t; x++ ){
         
         char ch = valor.charAt(x);
         
         if (Character.isDigit(ch)){
             NumFlag = true;
         }
         else if (Character.isUpperCase(ch)){
             MaxFlag = true;
         }
         else if (Character.isLowerCase(ch)){
             MinFlag = true;
         }
         else if (((valor.contains("@") || valor.contains("#")
              || valor.contains("!") || valor.contains("~")
              || valor.contains("$") || valor.contains("%")
              || valor.contains("^") || valor.contains("&")
              || valor.contains("*") || valor.contains("(")
              || valor.contains(")") || valor.contains("-")
              || valor.contains("+") || valor.contains("/")
              || valor.contains(":") || valor.contains(".")
              || valor.contains(", ") || valor.contains("<")
              || valor.contains(">") || valor.contains("?")
              || valor .contains("|")))) {
             SpcFlag = true;
         }
    if (NumFlag && MaxFlag && MinFlag && SpcFlag)
        return true;
     }
     return false;
}   // Fim Pass

    private void preencheFormulario() throws FileNotFoundException, IOException, SQLException {
       int cont = 0;
       String[] lista = new String [7];
       FileReader fr = new FileReader (Login.login+".txt");
       BufferedReader br = new BufferedReader (fr);
       while (br.ready()){
           lista [cont] = br.readLine();
           cont ++;
           ctxNomeE.setText(lista[0]);
           ctxEmailE.setText(lista[1]);
           ctxMoradaE.setText(lista[2]);
           ctxTelefoneE.setText(lista[3]);
           ctxNifE.setText(lista[4]);
           ctxPassE.setText(lista[5]);
           ctxRepassE.setText(lista[6]);
           
       }
 
    }
        

    private void preencheFormDb() throws SQLException {
        Connection conn = LigaBD.ligacao(); 
        String sql = "SELECT * FROM utilizador WHERE login = '"+Login.login+"'"; 
        PreparedStatement ps = conn.prepareStatement(sql); 
        ResultSet rs = ps.executeQuery(); 
        
        
        while (rs.next()){
            
           ctxNomeE.setText(rs.getString(2));
           ctxEmailE.setText(rs.getString(3));
           ctxMoradaE.setText(rs.getString(4));
           ctxTelefoneE.setText(rs.getString(5));
           ctxNifE.setText(rs.getString(6));
           ctxLoginE.setText(rs.getString(7));
           ctxPassE.setText(rs.getString(8));
           ctxRepassE.setText(rs.getString(8));
           
        }
        
    }
    
    //


}

