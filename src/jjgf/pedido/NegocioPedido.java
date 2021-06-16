/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.pedido;

/**
 *
 * @author jadil
 */
public class NegocioPedido {
    
    public void cadastrarPedido(Pedido p) throws Exception{
     if (p == null) {
            throw new Exception("Informar os dados deste pedido");
        }
        if (p.getCliente()== null) {
            throw new Exception("Você precisa informar o cliente para realizar o pedido .");                   
         }
 
  if (p.getCardapio()== null) {
            throw new Exception("Informar o cardapio.");
        }
         
         if (p.getFuncionario()== null) {
            throw new Exception("Informar quem é o funcionario.");
        }
         
         if (p.getData_pedido()== null) {
            throw new Exception("Informar a data.");
        }
         
         if (p.getForma_pagamento()== null) {
            throw new Exception("defina qual a forma de pagamento.");
        }
         if (p.getForma_pagamento().trim().equals("")== true) {
            throw new Exception("defina a forma de pagamento");                               
        }
         if (p.getLocal_entrega()==null) {
             throw new Exception("Favor preencher o local da entrega.");
         }
         if (p.getLocal_entrega().trim().equals("")==true) {
             throw new Exception("Deverá digitar o local da entrega.");             
         }
         if (p.getLocal_entrega().trim().length() < 7 ) {
         throw new Exception("Digite o endereço completo.");
         }
        
         DadosPedido dados = new DadosPedido();
         dados.cadastrarPedido(p);
}
    public void atualizarPedido(Pedido p) throws Exception{
        if (p == null) {
            throw new Exception("Informar os dados deste pedido");
        }
        if (p.getCliente()== null) {
            throw new Exception("Você precisa informar o cliente para realizar o pedido .");                   
         }
 
  if (p.getCardapio()== null) {
            throw new Exception("Informar o cardapio.");
        }
         
         if (p.getFuncionario()== null) {
            throw new Exception("Informar quem é o funcionario.");
        }
         
         if (p.getData_pedido()== null) {
            throw new Exception("Informar a data.");
        }
         
         if (p.getForma_pagamento()== null) {
            throw new Exception("defina qual a forma de pagamento.");
        }
         if (p.getForma_pagamento().trim().equals("")== true) {
            throw new Exception("defina a forma de pagamento");             
         }
         
         if (p.getLocal_entrega()==null) {
             throw new Exception("Favor preencher o local da entrega.");
         }
         if (p.getLocal_entrega().trim().equals("")==true) {
             throw new Exception("Deverá digitar o local da entrega.");             
         }
         if (p.getLocal_entrega().trim().length() < 7 ) {
         throw new Exception("Digite o endereço completo.");
         }
        
         
        DadosPedido dados = new DadosPedido();
        dados.atualizarPedido(p);
    }

}
