
package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

   
 
public class ConexaoBanco {
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost:3306/bdvendas";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultSet;

    
    
    
public Connection PegarConexao(){
    try {
        return DriverManager.getConnection("jdbc:mysql://localhost/bdvendas","root","");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"erro ao conectar com a data base"+ e);
    }
return null;
}
    public boolean conecta() {
        boolean result = true;

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario,senha);
            //JOptionPane.showMessageDialog(null, "conectado com sucesso no banco de dados!");
        } catch (ClassNotFoundException driver) {
            JOptionPane.showMessageDialog(null, "Driver nao encontrado " + driver);
            result = false;
        } catch (SQLException fonte) {
            JOptionPane.showMessageDialog(null, "deu erro na conexao com a fonte de dados " + fonte);
            result = false;

        }
        return result;
    }
    public void desconecta(){
    boolean result = true;
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null,"banco fechado" );
        } catch (Exception erroSql) {
            JOptionPane.showMessageDialog(null, "nao foi possivel fecha ro banco de dados "+erroSql.getMessage());
            result = false;
        }
    
    }
    public void executeSQL(String sql){
        try {
             statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
          resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
              
  
}
}
