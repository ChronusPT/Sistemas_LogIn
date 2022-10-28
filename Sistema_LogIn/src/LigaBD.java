
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dbugalho
 */
public class LigaBD {
    
    public static Connection ligacao(){
        String url = "jdbc:mysql://localhost:3306/rhcencal?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "";
        Connection liga = null;

        try {
            liga = DriverManager.getConnection(url, user, password);
        }catch (SQLException ex){
            ex.printStackTrace();
            System.out.println("Erro na tentativa de ligação à base de dados");
        }
        return liga;
    }
    public static void registaUtilizador(String nome, String email, String morada, int telefone, 
            int nif, String login, String password ) throws SQLException{
        
        String  query = "Insert INTO utilizador" + "(nome,email,morada,telefone,nif,login,password)"
        + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        Connection liga = ligacao();   
        PreparedStatement ps = liga.prepareStatement(query); 
        ps.setString (1, nome);
        ps.setString (2, email);
        ps.setString (3, morada);
        ps.setInt (4, telefone);
        ps.setInt (5, nif);
        ps.setString (6, login);
        ps.setString (7, password);
        ps.execute();
          
    }

    
    public static void atualizaUtilizador(String nome, String email, String morada, 
            int telefone, int nif, String password) {
        
       Connection liga = ligacao();   
       
       String sql = "UPDATE utilizador SET nome=?, email=?, morada=?, telefone=?, nif=?, password=? WHERE login =?";
       PreparedStatement ps;
        try {
            ps = liga.prepareStatement(sql);
            ps.setString(1, nome);
       ps.setString (2, email);
       ps.setString (3, morada);
       ps.setInt (4, telefone);
       ps.setInt (5, nif);
       ps.setString (6, password);
       ps.setString (7, Login.login);
       
       
    //Executa a instrução
       int retorno = ps.executeUpdate();
       if(retorno > 0){
       System.out.printf("Novo registro alterado");
       }else{
       System.out.println("Não foi possível alterar os registros!");
       }
        } catch (SQLException ex) {
            Logger.getLogger(LigaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       
    }
       
    }
        
    
