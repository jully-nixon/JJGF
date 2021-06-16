/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.cliente;

import JJGF.ConexaoSql.ConexaoComOBanco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author jadil
 */
public class DadosCliente extends ConexaoComOBanco {
    
     public void cadastrarCliente(Cliente c) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO cliente (celular,nome_cliente,email) ";
        sql += " VALUES (?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
       
        preparedStatement.setString(1, c.getCelular());
        preparedStatement.setString(2, c.getNomeCliente());
        preparedStatement.setString(3, c.getEmail());
    
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    
    public void removerCLiente(Cliente c) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "DELETE FROM cliente WHERE id_cliente = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, c.getIdCliente());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    
    public void atualizarCLiente(Cliente c) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE cliente SET celular = ?, nome_cliente =?, email = ? WHERE id_cliente = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, c.getCelular());
        preparedStatement.setString(2, c.getNomeCliente());
        preparedStatement.setString(3, c.getEmail());
        preparedStatement.setInt(4, c.getIdCliente());
        
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    
    
     public ArrayList<Cliente> listar(Cliente filtro) throws Exception {
        ArrayList<Cliente> retorno = new ArrayList<>();

        //instrução sql correspondente a inserção do aluno
        String sql = " select c.id_cliente,c.celular,c.nome_cliente,c.email ";
        sql += " from cliente as c ";
        sql += " where c.id_cliente > 0 ";
        if (filtro.getIdCliente()> 0) {
            sql += " and c.id_cliente = ? ";
        }
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

        if (filtro.getIdCliente()> 0) {
            preparedStatement.setInt(1, filtro.getIdCliente());
        }
        //executando a instrução sql
        ResultSet leitor = preparedStatement.executeQuery();
        //lendo os resultados
        while (leitor.next()) {
            Cliente c = new Cliente();
            c.setIdCliente(leitor.getInt("id_cliente"));
            c.setCelular(leitor.getString("celular"));
            c.setNomeCliente(leitor.getString("nome_cliente"));
            c.setEmail(leitor.getString("email"));
           
            retorno.add(c);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }
      
    
}

