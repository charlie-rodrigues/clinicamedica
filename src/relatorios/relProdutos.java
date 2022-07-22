package relatorios;



import groovy.ui.text.FindReplaceUtility;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import br.com.projeto.jdbc.ConexaoBanco;

public class relProdutos {

    
    ConexaoBanco con = new ConexaoBanco();


public  relProdutos() {
  try 
  {
      con.conecta();
      con.executeSQL("SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from tb_produtos as p inner join tb_fornecedores as f on(p.for_id=f.id)");
      JRResultSetDataSource jrRS = new JRResultSetDataSource(con.resultSet);
      JasperPrint jasperPrint = JasperFillManager.fillReport(
      "C:/Users/Charlie/Documents/NetBeansProjects/projeto vendas curso/src/relatorios/relProdutos.jasper", new HashMap(), jrRS);
      JasperViewer.viewReport(jasperPrint, false);
       
  } catch (Exception erro){
             JOptionPane.showMessageDialog(null,"deu erro ="+erro);
   }
}

  public static void main (String args[]) 
  {
   // new imprimir_cidade(); 
           
      
  }
  
}


