/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGFjava;

import JJGF.ConexaoSql.ConexaoComOBanco;
import javax.swing.JOptionPane;
/**
 *
 * @author jadil
 */
public class JjgfJava {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        // TODO code application logic here
        try {
            ConexaoComOBanco con = new ConexaoComOBanco();
            con.conectar();
            JOptionPane.showMessageDialog(null, "Conectou");
            con.desconectar();
            JOptionPane.showMessageDialog(null, "desconectou");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
