/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.cardapio;

import JJGF.ConexaoSql.ConexaoComOBanco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jadil
 */
public class DadosCardapio extends ConexaoComOBanco {
    
    
     public void cadastrarCardapio(Cardapio c) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO cardapio (id_cardapio,dia_semana,prato,descricao,valor) ";
        sql += " VALUES (?,?,?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, c.getId_cardapio());
        preparedStatement.setString(2, c.getDia_semana());
        preparedStatement.setString(3, c.getPrato());
        preparedStatement.setString(4, c.getDescricao());
        preparedStatement.setDouble(5, c.getValor());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
     
     public void removerCardapio(Cardapio c) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "DELETE FROM cardapio WHERE id_cardapio = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, c.getId_cardapio());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
     
      public void atualizarCardapio(Cardapio c) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE cardapio SET dia_semana = ?, prato =?, descricao = ?, valor = ? WHERE id_cardapio = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
         preparedStatement.setString(1, c.getDia_semana());
        preparedStatement.setString(2, c.getPrato());
        preparedStatement.setString(3, c.getDescricao());
        preparedStatement.setDouble(4, c.getValor());
        preparedStatement.setInt(5, c.getId_cardapio());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
     public ArrayList<Cardapio> listar(Cardapio filtro) throws Exception {
        ArrayList<Cardapio> retorno = new ArrayList<>();

        //instrução sql correspondente a inserção do aluno
        String sql = " select c.id_cardapio,c.dia_semana,c.prato,c.descricao,c.valor  ";
        sql += " from cardapio as c ";
        sql += " where c.id_cardapio > 0 ";
        if (filtro.getId_cardapio()> 0) {
            sql += " and c.id_cardapio = ? ";
        }
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

        if (filtro.getId_cardapio()> 0) {
            preparedStatement.setInt(1, filtro.getId_cardapio());
        }
        //executando a instrução sql
        ResultSet leitor = preparedStatement.executeQuery();
        //lendo os resultados
        while (leitor.next()) {
            Cardapio c = new Cardapio();
            c.setId_cardapio(leitor.getInt("id_cardapio"));
            c.setDia_semana(leitor.getString("dia_semana"));
            c.setPrato(leitor.getString("prato"));
            c.setDescricao(leitor.getString("descricao"));
            c.setValor(leitor.getDouble("valor"));
            retorno.add(c);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }
     
     public ArrayList<Cardapio> buscar(Cardapio filtro) throws Exception {
        ArrayList<Cardapio> retorno = new ArrayList<>();
      
     String sql = " select c.id_cardapio,c.dia_semana,c.prato,c.descricao,c.valor  ";
        sql += " from cardapio as c ";
        sql += " where c.id_cardapio  = c.id_cardapio ";
        
        if (filtro.getId_cardapio() > 0) {
            sql += " and c.id_cardapio = ? ";
        }
       PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

    
        //executando a instrução sql
        ResultSet leitor = preparedStatement.executeQuery();
        //lendo os resultados
        while (leitor.next()) {
            Cardapio c = new Cardapio();
            c.setId_cardapio(leitor.getInt("id_cardapio"));
            c.setDia_semana(leitor.getString("dia_semana"));
            c.setPrato(leitor.getString("prato"));
            c.setDescricao(leitor.getString("descricao"));
            c.setValor(leitor.getDouble("valor"));
            retorno.add(c);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
      //c.id_cardapio,c.dia_semana,c.prato,c.descricao,c.valor

     
    
     }
}
