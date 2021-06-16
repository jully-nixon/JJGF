/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.pedido;

import java.sql.Date;
import JJGF.ConexaoSql.ConexaoComOBanco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author jadil
 */
public class DadosPedido extends ConexaoComOBanco {
    
     public void cadastrarPedido(Pedido p) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO pedido  (id_cliente, id_funcionario, id_cardapio, data_pedido, local_entrega, pontoReferencia, forma_pagamento, statos_pedido, observacao) ";
        sql += " VALUES (?,?,?,?,?,?,?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, p.getCliente().getIdCliente());
        preparedStatement.setInt(2, p.getFuncionario().getIdFuncionario());
        preparedStatement.setInt(3, p.getCardapio().getId_cardapio());
        preparedStatement.setDate(4, (Date) p.getData_pedido());
        preparedStatement.setString(5, p.getLocal_entrega());
        preparedStatement.setString(6, p.getPontoReferencia());
        preparedStatement.setString(7, p.getForma_pagamento());
        preparedStatement.setString(8, p.getStatos_pedido());
        preparedStatement.setString(9, p.getObservacao());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    
     public void removerPedido(Pedido p) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "DELETE FROM pedido WHERE id_pedido = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, p.getId_pedido());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
     
     public void atualizarPedido(Pedido p) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE pedido SET id_cliente = ?, id_funcionario = ?, id_cardapio = ?, data_pedido = ?, local_entrega = ?, pontoReferencia = ?, forma_pagamento = ?, statos_pedido = ?, observacao = ?  WHERE id_pedido = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, p.getCliente().getIdCliente());
        preparedStatement.setInt(2, p.getFuncionario().getIdFuncionario());
        preparedStatement.setInt(3, p.getCardapio().getId_cardapio());
        preparedStatement.setDate(4, (Date) p.getData_pedido());
        preparedStatement.setString(5, p.getLocal_entrega());
        preparedStatement.setString(6, p.getPontoReferencia());
        preparedStatement.setString(7, p.getForma_pagamento());
        preparedStatement.setString(8, p.getStatos_pedido());
        preparedStatement.setString(9, p.getObservacao());
        preparedStatement.setInt(10, p.getId_pedido());
        
        
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
     public ArrayList<Pedido> listar(Pedido filtro) throws Exception {
        ArrayList<Pedido> retorno = new ArrayList<>();

        //instrução sql correspondente a inserção do aluno
        String sql = " select p.id_Pedido, p.id_cliente, p.id_funcionario, p.id_cardapio, p.data_pedido, p.local_entrega, p.pontoReferencia, p.forma_pagamento, p.statos_pedido, p.observacao ";
        sql += " from pedido as p ";
        sql += " where p.id_pedido > 0 ";
        if (filtro.getId_pedido()> 0) {
            sql += " and p.id_pedido = ? ";
        }
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

        if (filtro.getId_pedido()> 0) {
            preparedStatement.setInt(1, filtro.getId_pedido());
        }
        //executando a instrução sql
        ResultSet leitor = preparedStatement.executeQuery();
        //lendo os resultados
        while (leitor.next()) {
            Pedido p = new Pedido();
            
            p.setId_pedido(leitor.getInt("id_pedido"));
            p.getCliente().setIdCliente(leitor.getInt("id_cliente"));
            p.getCardapio().setId_cardapio(leitor.getInt("id_cardapio"));
            p.getFuncionario().setIdFuncionario(leitor.getInt("id_funcionario"));
            p.setData_pedido(leitor.getDate("data_pedido"));
            p.setLocal_entrega(leitor.getString("local_entrega"));
            p.setPontoReferencia(leitor.getString("pontoReferencia"));
            p.setForma_pagamento(leitor.getString("forma_pagamento"));
            p.setStatos_pedido(leitor.getString("statos_pedido"));
            p.setObservacao(leitor.getString("observacao"));
    
           
            retorno.add(p);
        }
         super.desconectar();
        return retorno;
        
    }
     
    
}

