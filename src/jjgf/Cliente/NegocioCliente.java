/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.cliente;

/**
 *
 * @author jadil
 */
public class NegocioCliente {
    
    public void cadastrarCliente(Cliente c) throws Exception{
          if (c == null) {
            throw new Exception("Informar os dados deste cliente");
        }
        if (c.getNomeCliente().trim().equals("")== true) {
            throw new Exception("Você precisa informar o nome do cliente.");
        }
         if (c.getNomeCliente().trim().length() > 100) {
            throw new Exception("O nome do cliente não teverá alcançar mais de 100 caracteres");             
         }
         if (c.getNomeCliente().trim().length() < 10) {
            throw new Exception("deve digitar o nome completo");              
        }
         if (c.getCelular()==null) {
             throw new Exception("Favor preencher o numero do celular.");
         }
         if (c.getCelular().trim().length() < 11 || c.getCelular().trim().length() < 0) {
         throw new Exception("Digite o numero completo no formato '(81)90000-0000");
         }
         if (c.getEmail()== null) {
             throw new Exception("e-mail obrigatorio.");
         }
         if (c.getEmail().trim().equals("")==true) {
             throw new Exception("Deverá digitar um email válido.");             
         }
         
         
        DadosCliente dados = new DadosCliente();
        dados.cadastrarCliente(c);
     }
     public void atualizarCLiente(Cliente c) throws Exception{
          if (c == null) {
            throw new Exception("Os dados nã podem estar vazios.");
        }
        if (c.getNomeCliente().trim().equals("")== true) {
            throw new Exception("Você precisa informar o nome do cliente.");
        }
         if (c.getNomeCliente().trim().length() > 100) {
            throw new Exception("O nome do cliente não teverá alcançar mais de 100 caracteres");             
         }
         if (c.getNomeCliente().trim().length() < 10) {
            throw new Exception("deve digitar o nome completo");              
        }
         if (c.getCelular()==null) {
             throw new Exception("Favor preencher o numero do celular.");
         }
         if (c.getCelular().trim().length() < 11 || c.getCelular().trim().length() < 0) {
         throw new Exception("Digite o numero completo no formato '(81)90000-0000");
         }
         if (c.getEmail()== null) {
             throw new Exception("e-mail obrigatorio.");
         }
         if (c.getEmail().trim().equals("")==true) {
             throw new Exception("Deverá digitar um email válido.");             
         }
         if (c.getEmail().trim().length() < 15) {
             throw new Exception("Digite um email valido.");
         }
         
        DadosCliente dados = new DadosCliente();
        dados.atualizarCLiente(c);    
     }
      public void removerCLiente(Cliente c) throws Exception{
          if (c.getIdCliente()== 0) {
              throw new Exception("Digite o codigo do cliente");
          }     
      }
    
}
