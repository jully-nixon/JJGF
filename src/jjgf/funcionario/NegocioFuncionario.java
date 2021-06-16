/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.funcionario;

/**
 *
 * @author jadil
 */
public class NegocioFuncionario {
    
    public void cadastrarFuncionario(Funcionario f) throws  Exception{
          if (f == null) {
            throw new Exception("Informar os dados deste funcionario");
        }
        if (f.getNome().trim().equals("")== true) {
            throw new Exception("Você precisa informar o nome desse funcionario.");
        }
         if (f.getNome().trim().length() > 100) {
            throw new Exception("O nome do funcionario não teverá alcançar mais de 100 caracteres");             
         }
         if (f.getNome().trim().length() < 10) {
            throw new Exception("deve digitar o nome completo");              
        }
         if (f.getCelular()==null) {
             throw new Exception("Favor preencher o numero do celular.");
         }
         if (f.getCelular().trim().equals("")==true) {
             throw new Exception("Deverá digitar um email válido.");             
         }
         if (f.getCelular().trim().length() < 10 ) {
         throw new Exception("Digite o numero completo no formato '(81)90000-0000");
         }
         if (f.getEmail()== null) {
             throw new Exception("e-mail obrigatorio.");
         }
         if (f.getEmail().trim().equals("")==true) {
             throw new Exception("Deverá digitar um email válido.");             
         }
         if (f.getEmail().trim().length() < 15) {
             throw new Exception("Digite um email valido.");
         }
         //***
         if (f.getCpf()==null) {
             throw new Exception("digite o cpf.");
         }
        if (f.getCpf().trim().equals("")== true) {
            throw new Exception("Você precisa informar o cpf desse funcionario.");
        }
         if (f.getCpf().trim().length() > 100) {
            throw new Exception("O cpf do funcionario não teverá alcançar mais de 100 caracteres");             
         }
         if (f.getCpf().trim().length() < 10) {
            throw new Exception("O cpf deve ser completo");              
        }
          
         if (f.getCargo()==null) {
             throw new Exception("informe o cargo.");
         }
        if (f.getCargo().trim().equals("")== true) {
            throw new Exception("Você precisa informar o carco do funcionario.");
        }

         //**
             if (f.getDataNacimento()==null) {
             throw new Exception("informe a data de nascimento.");
         }
        if (f.getDataNacimento().equals("")== true) {
            throw new Exception("Você precisa informar a data de nascimento sem espaços.");
        }
        //*
         if (f.getEndereco()==null) {
             throw new Exception("informe o endereço.");
         }
        if (f.getEndereco().trim().equals("")== true) {
            throw new Exception("Você precisa informar o endereço.");
        }
         if (f.getEndereco().trim().length() > 200) {
            throw new Exception("o endereço alcançou o limite maximo");             
         }
         if (f.getEndereco().trim().length() < 10) {
            throw new Exception("deve ser o endereço completo");              
        }
         //** 
          if (f.getRg()==null) {
             throw new Exception("Rg obrigatorio.");
         }
        if (f.getRg().trim().equals("")== true) {
            throw new Exception("Você precisa informar o rg.");
        }
         //**
          if (f.getHabilitacao()==null) {
             throw new Exception("Habilitação obrigatorio.");
         }
        if (f.getHabilitacao().trim().equals("")== true) {
            throw new Exception("Você precisa informar qual a Habilitação.");              
        }
         //**
         if (f.getSalario()==0) {
             throw new Exception("defina um valor salarial.");
        }
         //**
          if (f.getSexo()==null) {
             throw new Exception("Rg obrigatorio.");
         }
        if (f.getSexo().trim().equals("")== true) {
            throw new Exception("Você precisa informar o sexo.");
                      
        }
        DadosFuncionario dados = new DadosFuncionario();
        dados.cadastrarFuncionario(f);
     }
     public void atualizarFuncionario(Funcionario f) throws Exception{
         if (f == null) {
            throw new Exception("Informar os dados deste funcionario");
        }
        if (f.getNome().trim().equals("")== true) {
            throw new Exception("Você precisa informar o nome desse funcionario.");
        }
         if (f.getNome().trim().length() > 100) {
            throw new Exception("O nome do funcionario não teverá alcançar mais de 100 caracteres");             
         }
         if (f.getNome().trim().length() < 10) {
            throw new Exception("deve digitar o nome completo");              
        }
         if (f.getCelular()==null) {
             throw new Exception("Favor preencher o numero do celular.");
         }
         if (f.getCelular().trim().equals("")==true) {
             throw new Exception("Deverá digitar um email válido.");             
         }
         if (f.getCelular().trim().length() < 10) {
         throw new Exception("Digite o numero completo no formato '(81)90000-0000");
         }
         if (f.getEmail()== null) {
             throw new Exception("e-mail obrigatorio.");
         }
         if (f.getEmail().trim().equals("")==true) {
             throw new Exception("Deverá digitar um email válido.");             
         }
         if (f.getEmail().trim().length() < 15) {
             throw new Exception("Digite um email valido.");
         }
         //***
         if (f.getCpf()==null) {
             throw new Exception("digite o cpf.");
         }
        if (f.getCpf().trim().equals("")== true) {
            throw new Exception("Você precisa informar o cpf desse funcionario.");
        }
         if (f.getCpf().trim().length() > 100) {
            throw new Exception("O cpf do funcionario não teverá alcançar mais de 100 caracteres");             
         }
         if (f.getCpf().trim().length() < 10) {
            throw new Exception("O cpf deve ser completo");              
        }
         if (f.getCargo()==null) {
             throw new Exception("informe o cargo.");
         }
        if (f.getCargo().trim().equals("")== true) {
            throw new Exception("Você precisa informar o carco do funcionario.");
        }

         //**
             if (f.getDataNacimento()==null) {
             throw new Exception("informe a data de nascimento.");
         }
        if (f.getDataNacimento().equals("")== true) {
            throw new Exception("Você precisa informar a data de nascimento sem espaços.");
        }
        //*
         if (f.getEndereco()==null) {
             throw new Exception("informe o endereço.");
         }
        if (f.getEndereco().trim().equals("")== true) {
            throw new Exception("Você precisa informar o endereço.");
        }
         if (f.getEndereco().trim().length() > 200) {
            throw new Exception("o endereço alcançou o limite maximo");             
         }
         if (f.getEndereco().trim().length() < 10) {
            throw new Exception("deve ser o endereço completo");              
        }
         //** 
          if (f.getRg()==null) {
             throw new Exception("Rg obrigatorio.");
         }
        if (f.getRg().trim().equals("")== true) {
            throw new Exception("Você precisa informar o rg.");
        }
        
          if (f.getHabilitacao()==null) {
             throw new Exception("Habilitação obrigatorio.");
         }
        if (f.getHabilitacao().trim().equals("")== true) {
            throw new Exception("Você precisa informar qual a Habilitação.");              
        }
         //**
         if (f.getSalario()== 0) {
             throw new Exception("defina um valor salarial.");
        }
         //**
          if (f.getSexo()==null) {
             throw new Exception("Rg obrigatorio.");
         }
        if (f.getSexo().trim().equals("")== true) {
            throw new Exception("Você precisa informar o sexo.");
                      
        }
        
        DadosFuncionario dados = new DadosFuncionario();
        dados.atualizarFuncionario(f);
     
     }
     public void removerFuncionario(Funcionario f)throws Exception{
         if (f == null) {
            throw new Exception("Informar os dados deste funcionario");
        }
        if (f.getNome().trim().equals("")== true) {
            throw new Exception("Você precisa informar o nome desse funcionario.");
        }
         if (f.getNome().trim().length() > 100) {
            throw new Exception("O nome do funcionario não teverá alcançar mais de 100 caracteres");             
         }
         if (f.getNome().trim().length() < 10) {
            throw new Exception("deve digitar o nome completo");              
        }
         if (f.getCelular()==null) {
             throw new Exception("Favor preencher o numero do celular.");
         }
         if (f.getCelular().trim().equals("")==true) {
             throw new Exception("Deverá digitar um email válido.");             
         }
         if (f.getEmail()== null) {
             throw new Exception("e-mail obrigatorio.");
         }
         if (f.getEmail().trim().equals("")==true) {
             throw new Exception("Deverá digitar um email válido.");             
         }
         if (f.getEmail().trim().length() < 15) {
             throw new Exception("Digite um email valido.");
         }
         //***
         if (f.getCpf()==null) {
             throw new Exception("digite o cpf.");
         }
        if (f.getCpf().trim().equals("")== true) {
            throw new Exception("Você precisa informar o cpf desse funcionario.");
        }
         if (f.getCpf().trim().length() > 100) {
            throw new Exception("O cpf do funcionario não teverá alcançar mais de 100 caracteres");             
         }
         if (f.getCpf().trim().length() < 10) {
            throw new Exception("O cpf deve ser completo");              
        }
         //**
         if (f.getCargo()==null) {
             throw new Exception("informe o cargo.");
         }
        if (f.getCargo().trim().equals("")== true) {
            throw new Exception("Você precisa informar o carco do funcionario.");
        }

         //**
             if (f.getDataNacimento()==null) {
             throw new Exception("informe a data de nascimento.");
         }
        if (f.getDataNacimento().equals("")== true) {
            throw new Exception("Você precisa informar a data de nascimento sem espaços.");
        }
        //*
         if (f.getEndereco()==null) {
             throw new Exception("informe o endereço.");
         }
        if (f.getEndereco().trim().equals("")== true) {
            throw new Exception("Você precisa informar o endereço.");
        }
         if (f.getEndereco().trim().length() > 200) {
            throw new Exception("o endereço alcançou o limite maximo");             
         }
         if (f.getEndereco().trim().length() < 10) {
            throw new Exception("deve ser o endereço completo");              
        }
         //** 
          
          if (f.getHabilitacao()==null) {
             throw new Exception("Habilitação obrigatorio.");
         }
        if (f.getHabilitacao().trim().equals("")== true) {
            throw new Exception("Você precisa informar qual a Habilitação.");              
        }
         //**
         if (f.getSalario()== 0) {
             throw new Exception("defina um valor salarial.");
        }
         //**
          if (f.getSexo()==null) {
             throw new Exception("Rg obrigatorio.");
         }
        if (f.getSexo().trim().equals("")== true) {
            throw new Exception("Você precisa informar o sexo.");
                      
        }
        if (f.getRg()==null) {
             throw new Exception("Rg obrigatorio.");
         }
        if (f.getRg().trim().equals("")== true) {
            throw new Exception("Você precisa informar o rg.");
        }
         
         DadosFuncionario dados= new DadosFuncionario();
         dados.removerFuncionario(f);
     }
    
}
