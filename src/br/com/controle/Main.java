/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.dao.ClienteDAO;
import br.com.vo.Cliente;

/**
 *
 * @author Laryssa
 */
public class Main {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
      Cliente c = new Cliente();
      c.setCodigo(4);
      c.setNome("Welton");
      c.setEmail("welton@m.com.br");
      c.setNascimento("12/12/1969");
    
      ClienteDAO cDAO = new ClienteDAO();
      System.out.println(cDAO.update(c));
      
    }
    
}
