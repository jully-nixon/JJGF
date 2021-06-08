/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjgf.pedido;

import java.util.Date;
import jjgf.Cliente.Cliente;
import jjgf.fucionario.Funcionario;
import jjgf.cardapio.Cardapio;

/**
 *
 * @author jadil
 */
public class Pedido {
    
     private int id_pedido;
        private Date data_pedido;
        private String local_entrega;
        private String pontoReferencia;
        private String forma_pagamento;
        private String statos_pedido;
        private String observacao;
        private Funcionario funcionario;
        private Cliente cliente;
        private Cardapio cardapio;
  

    /**
     * @return the data_pedido
     */
    public Date getData_pedido() {
        return data_pedido;
    }

    /**
     * @param data_pedido the data_pedido to set
     */
    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    /**
     * @return the local_entrega
     */
    public String getLocal_entrega() {
        return local_entrega;
    }

    /**
     * @param local_entrega the local_entrega to set
     */
    public void setLocal_entrega(String local_entrega) {
        this.local_entrega = local_entrega;
    }

    /**
     * @return the pontoReferencia
     */
    public String getPontoReferencia() {
        return pontoReferencia;
    }

    /**
     * @param pontoReferencia the pontoReferencia to set
     */
    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    /**
     * @return the forma_pagamento
     */
    public String getForma_pagamento() {
        return forma_pagamento;
    }

    /**
     * @param forma_pagamento the forma_pagamento to set
     */
    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    /**
     * @return the statos_pedido
     */
    public String getStatos_pedido() {
        return statos_pedido;
    }

    /**
     * @param statos_pedido the statos_pedido to set
     */
    public void setStatos_pedido(String statos_pedido) {
        this.statos_pedido = statos_pedido;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the Funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the Funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the cardapio
     */
    public Cardapio getCardapio() {
        return cardapio;
    }

    /**
     * @param cardapio the cardapio to set
     */
    public void setCardapio(Cardapio cardapio) {
        this.cardapio = cardapio;
    }
    
    
     public Pedido()
        {
            this.cardapio = new Cardapio();
            this.cliente = new Cliente();
            this.funcionario = new Funcionario();
        }

    /**
     * @return the id_pedido
     */
    public int getId_pedido() {
        return id_pedido;
    }

    /**
     * @param id_pedido the id_pedido to set
     */
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * @return the id_pedido
     */
 
    
    
}
