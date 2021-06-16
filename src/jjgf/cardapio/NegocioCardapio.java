/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.cardapio;

/**
 *
 * @author jadil
 */
public class NegocioCardapio {
    
    public void cadastrarCardapio(Cardapio c) throws Exception{
         if (c == null) {
            throw new Exception("Informar os dados necessarios para o cardapio");
        }
         if (c.getDescricao()==null) {
              throw new Exception("Você precisa informar a descrição desse cardapio.");
         }
        if (c.getDescricao().trim().equals("")== true) {
            throw new Exception("Não é permitido espaços vazios na descrição.");
        }
         if (c.getDescricao().trim().length() > 100) {
            throw new Exception("A descrição não pode passar dos 100 caracteres");             
         }
         if (c.getDescricao().trim().length() < 7) {
            throw new Exception("seja mais expecifico na descriçaõ do cardapio");              
        }
         //**
         if (c.getDia_semana()==null) {
              throw new Exception("Você precisa informar a descrição desse cardapio.");
         }
        if (c.getDia_semana().trim().equals("")== true) {
            throw new Exception("Não é permitido espaços vazios.");
        }
         //**
          if (c.getPrato()==null) {
              throw new Exception("Qual o prato?.");
         }
        if (c.getPrato().trim().equals("")== true) {
            throw new Exception("Não é permitido espaços vazios. defina o prato");
        }
         if (c.getPrato().trim().length() > 100) {
            throw new Exception("o prato não pode passar dos 100 caracteres");             
         }
         if (c.getDescricao().trim().length() < 4) {
            throw new Exception("seja mais expecifico na descriçaõ desse prato");              
        }
        //**
        if (c.getId_cardapio()==0) {
              throw new Exception("Informe o codigo.");
         }
        //**
        if (c.getValor()==0) {
              throw new Exception("Qual o Valor?.");
         }
        DadosCardapio dados = new DadosCardapio();
        dados.cadastrarCardapio(c);
     }
      public void atualizarCardapio(Cardapio c) throws Exception{
          if (c == null) {
            throw new Exception("Informar os dados necessarios para o cardapio");
        }
         if (c.getDescricao()==null) {
              throw new Exception("Você precisa informar a descrição desse cardapio.");
         }
        if (c.getDescricao().trim().equals("")== true) {
            throw new Exception("Não é permitido espaços vazios.");
        }
         if (c.getDescricao().trim().length() > 100) {
            throw new Exception("A descrição não pode passar dos 100 caracteres");             
         }
         if (c.getDescricao().trim().length() < 7) {
            throw new Exception("seja mais expecifico na descriçaõ do cardapio");              
        }
         //**
         if (c.getDia_semana()==null) {
              throw new Exception("Você precisa informar a descrição desse cardapio.");
         }
        if (c.getDia_semana().trim().equals("")== true) {
            throw new Exception("Não é permitido espaços vazios.");
        }
         //**
          if (c.getPrato()==null) {
              throw new Exception("Qual o prato?.");
         }
        if (c.getPrato().trim().equals("")== true) {
            throw new Exception("Não é permitido espaços vazios. defina o prato");
        }
         if (c.getPrato().trim().length() > 100) {
            throw new Exception("o prato não pode passar dos 100 caracteres");             
         }
         if (c.getDescricao().trim().length() < 4) {
            throw new Exception("seja mais expecifico na descriçaõ desse prato");              
        }
        //**
        if (c.getId_cardapio()==0) {
              throw new Exception("Informe o codigo.");
         }
        //**
        if (c.getValor()==0) {
              throw new Exception("Qual o Valor?.");
         }
        DadosCardapio dados = new DadosCardapio();
        dados.atualizarCardapio(c);    
      }
       public void removerCardapio(Cardapio c) throws Exception {
           if (c == null) {
            throw new Exception("Informar os dados necessarios para o cardapio");
        }
         if (c.getDescricao()==null) {
              throw new Exception("Você precisa informar a descrição desse cardapio.");
         }
        if (c.getDescricao().trim().equals("")== true) {
            throw new Exception("Não é permitido espaços vazios.");
        }
         if (c.getDescricao().trim().length() > 100) {
            throw new Exception("A descrição não pode passar dos 100 caracteres");             
         }
         if (c.getDescricao().trim().length() < 7) {
            throw new Exception("seja mais expecifico na descriçaõ do cardapio");              
        }
         //**
         if (c.getDia_semana()==null) {
              throw new Exception("Você precisa informar a descrição desse cardapio.");
         }
        if (c.getDia_semana().trim().equals("")== true) {
            throw new Exception("Não é permitido espaços vazios.");
        }
         //**
          if (c.getPrato()==null) {
              throw new Exception("Qual o prato?.");
         }
        if (c.getPrato().trim().equals("")== true) {
            throw new Exception("Não é permitido espaços vazios. defina o prato");
        }
         if (c.getPrato().trim().length() > 100) {
            throw new Exception("o prato não pode passar dos 100 caracteres");             
         }
         if (c.getDescricao().trim().length() < 4) {
            throw new Exception("seja mais expecifico na descriçaõ desse prato");              
        }
        //**
        if (c.getId_cardapio()==0) {
              throw new Exception("Informe o codigo.");
         }
        //**
        if (c.getValor()==0) {
              throw new Exception("Qual o Valor?.");
         }
        DadosCardapio dados = new DadosCardapio();
        dados.removerCardapio(c);    
      
       }
}
