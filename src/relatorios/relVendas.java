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

public class relVendas {

    
    ConexaoBanco con = new ConexaoBanco();


public  relVendas() {
  try 
  {
      con.conecta();
      con.executeSQL("SELECT i.id, i.venda_id, p.descricao,p.preco, i.qtd, i.subtotal FROM tb_itensvendas AS i inner join tb_produtos as p on(i.produto_id=p.id) WHERE venda_id = (SELECT MAX(id) FROM tb_vendas)");
      JRResultSetDataSource jrRS = new  JRResultSetDataSource(con.resultSet);
      JasperPrint jasperPrint = JasperFillManager.fillReport(
      "C:/Users/deskw/Documents/NetBeansProjects/projeto vendas curso/src/relatorios/relVendas.jasper", new HashMap(), jrRS);
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


