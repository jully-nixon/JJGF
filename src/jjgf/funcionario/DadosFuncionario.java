/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.funcionario;

import JJGF.ConexaoSql.ConexaoComOBanco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jadil
 */
public class DadosFuncionario extends ConexaoComOBanco {
    
    public void cadastrarFuncionario(Funcionario f) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO funcionario  (cpf,nome_funcionario,rg,habilitacao,cargo,celular,email_funcionario,endereco,salario,data_nascimento,sexo) ";
        sql += " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
      
        preparedStatement.setString(1, f.getCpf());
        preparedStatement.setString(2, f.getNome());
        preparedStatement.setString(3, f.getRg());
        preparedStatement.setString(4, f.getHabilitacao());
        preparedStatement.setString(5, f.getCargo());
        preparedStatement.setString(6, f.getCelular());
        preparedStatement.setString(7, f.getEmail());
        preparedStatement.setString(8, f.getEndereco());
        preparedStatement.setDouble(9, f.getSalario());
        preparedStatement.setDate(10, f.getDataNacimento());
        preparedStatement.setString(11, f.getSexo());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    
    public void removerFuncionario(Funcionario f) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "DELETE FROM funcionario WHERE id_funcionario = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, f.getIdFuncionario());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    
    public void atualizarFuncionario(Funcionario f) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE funcionario SET cpf = ?,nome_funcionario = ?,rg = ?,habilitacao = ?,cargo = ?,celular = ?,email_funcionario = ?,endereco = ?,salario = ?,data_nascimento = ?,sexo = ? WHERE id_funcionario = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
         preparedStatement.setString(1, f.getCpf());
        preparedStatement.setString(2, f.getNome());
        preparedStatement.setString(3, f.getRg());
        preparedStatement.setString(4, f.getHabilitacao());
        preparedStatement.setString(5, f.getCargo());
        preparedStatement.setString(6, f.getCelular());
        preparedStatement.setString(7, f.getEmail());
        preparedStatement.setString(8, f.getEndereco());
        preparedStatement.setDouble(9, f.getSalario());
        preparedStatement.setDate(10, f.getDataNacimento());
        preparedStatement.setString(11, f.getSexo());
        preparedStatement.setInt(12, f.getIdFuncionario());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    
     public ArrayList<Funcionario> listar(Funcionario filtro) throws Exception {
        ArrayList<Funcionario> retorno = new ArrayList<>();

        //instrução sql correspondente a inserção do aluno
        String sql = " select f.id_funcionario,f.cpf,f.nome_funcionario,f.rg,f.habilitacao,f.cargo,f.celular,f.email_funcionario,f.endereco,f.salario,f.data_nascimento,f.sexo  ";
        sql += " from funcionario as f ";
        sql += " where f.id_funcionario > 0 ";
        if (filtro.getIdFuncionario()> 0) {
            sql += " and f.id_funcionario = ? ";
        }
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

        if (filtro.getIdFuncionario()> 0) {
            preparedStatement.setInt(1, filtro.getIdFuncionario());
        }
        //executando a instrução sql
        ResultSet leitor = preparedStatement.executeQuery();
        //lendo os resultados
        while (leitor.next()) {
            Funcionario f = new Funcionario();
            f.setIdFuncionario(leitor.getInt("id_funcionario"));
            f.setCpf(leitor.getString("cpf"));
            f.setNome(leitor.getString("nome_funcionario"));
            f.setRg(leitor.getString("rg"));
            f.setHabilitacao(leitor.getString("habilitacao"));
            f.setCargo(leitor.getString("cargo"));
            f.setCelular(leitor.getString("celular"));
            f.setEmail(leitor.getString("email_funcionario"));
            f.setEndereco(leitor.getString("endereco"));
            f.setSalario(leitor.getDouble("salario"));
            f.setDataNacimento(leitor.getDate("data_nascimento"));
            f.setSexo(leitor.getString("sexo"));
            retorno.add(f);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }
    
    
    
    
    
}

