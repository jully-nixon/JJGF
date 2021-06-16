CREATE DATABASE JJGF1;


USE JJGF1;

CREATE TABLE cliente
(
  id_cliente INT PRIMARY KEY IDENTITY NOT NULL,
  celular VARCHAR (15)  NOT NULL,
  nome_cliente VARCHAR (100)NOT NULL,
  email VARCHAR (50)  NULL,

)

Select * from cliente


CREATE TABLE funcionario
(
  id_funcionario INT PRIMARY KEY IDENTITY NOT NULL,
  cpf VARCHAR (20) NOT NULL,
  nome_funcionario VARCHAR (100) NOT NULL,
  rg  VARCHAR (15) NOT NULL,
  habilitacao VARCHAR (2) NULL,
  cargo VARCHAR (50) NOT NULL,
  celular VARCHAR (15) NOT NULL,
  email_funcionario VARCHAR (50) NULL,
  endereco VARCHAR(100) NOT NULL,
  salario MONEY NOT NULL,
  data_nascimento DATE NOT NULL,
  sexo VARCHAR (1) NOT NULL,

)

 


CREATE TABLE cardapio
(
  id_cardapio INT PRIMARY KEY NOT NULL,
  dia_semana VARCHAR (25) NOT NULL,
  prato VARCHAR (20) NOT NULL,
  descricao VARCHAR (150) NOT NULL,
  valor MONEY NOT NULL

)



CREATE TABLE pedido
(
  id_pedido INT PRIMARY KEY IDENTITY NOT NULL,
  id_cliente INT  FOREIGN KEY REFERENCES cliente(id_cliente) on delete cascade,
  id_funcionario INT FOREIGN KEY REFERENCES funcionario (id_funcionario),
  id_cardapio INT FOREIGN KEY REFERENCES cardapio(id_cardapio),
  data_pedido DATETIME NOT NULL,
  local_entrega VARCHAR (250) NOT NULL,
  pontoReferencia VARCHAR (MAX) NULL,
  forma_pagamento VARCHAR (50) NOT NULL,
  statos_pedido VARCHAR(50) NULL,
  observacao VARCHAR(MAX) NULL,

)

select *from pedido




INSERT INTO cliente ( celular,nome_cliente,email)
VALUES ( '98831-8291','Jadilson Domingos','jadilsondomingos86@gmail.com'),
       ( '98642-0927','Romlo Bezerra','romulobezerra@bol.com.br'),
	   ( '96675-7285','Mayara dominguis','mayaradominguis@gmail,com'),
	   ( '95567-7654','Miguel Pereira','miguel@bol.com.br')




INSERT INTO cardapio ( id_cardapio,dia_semana,prato,descricao,valor)
VALUES  ( 02,'segunda-feira','ala-camberet', ' talharim com camarões e tomates secos ', 25),
        ( 03,'terça-feira','virado a paulista', ' feijão verde com arros, queijo, ovos fritos, bacom e bife ', 20),
		( 04,'quarta-feira','Bife a cavalo', ' feijão carioca, arros refolgado, bife e ovos fritos ', 19),
		( 05,'quinta-feira','tomate queijado', ' tomates estufados com queijo com arroz a grega ', 15),
		( 06,'sexta-feira','fejuada', ' fejuada tradicional com arroz branco, couver, e uma dose de caipirinha ', 25),
		( 07,'sabado',' falafel ', ' bolinhos de grão de bico com vinagrete e pão harábe ', 30)


		


INSERT INTO funcionario ( cpf,nome_funcionario,rg,cargo ,celular,email_funcionario,endereco,salario,data_nascimento,sexo)
VALUES   ('667788990','Maria silva','99887766' ,'entregador','96547-8789','Maria@bol.com.br','R Carminha N 87 B bela vista',1.200,'1989-08-15','f'),
         ('998899889','Jerfeson Campos','77665544','entregador','98765-9087','Jerfeson@bol.com.br','R caramuru N 876 B Kemel2',1.700,'1999-08-15','M')


		 ---------SCSA-D-S-DS-D-SD-S-D-S--S-F-EW-E--E--EWT-EW-T-E-T-RT-ER----

		 select * FROM funcionario
        








INSERT INTO pedido (id_cliente,id_funcionario, id_cardapio,data_pedido,local_entrega,pontoReferencia,forma_pagamento,statos_pedido)
VALUES    (2,1,03,GETDATE(),'Rº Pessoa Gadelho Nº657 B Cohabe','em frente ao posto ipiranga','DINHEIRO','ENTREGUI'),
          (2,2,05,GETDATE(),'Rº Mario De souza  Nº876 B vertical','Proximo ao Cemiterio','CARTAO DEBITO','A CAMINHO'),
		  (4,4,04,GETDATE(),'Rº jose inacio Nº997  B mangueira do b' ,' proximo a igreja central','VALE REFEIÇÃO','ENTRGUE')

SELECT * FROM pedido







-- CRIANDO UMA PROCEDURE COMPLETA

CREATE PROCEDURE uspManterCliente

        @acao INT, -- 0 = EXCLUIR  1= INSERIR  2= ALTERAR
		@id_cliente INT = NULL,
		@celular VARCHAR(15) = NULL,
		@nome VARCHAR(100) = NULL,
		@email VARCHAR(50) = NULL

AS
BEGIN


       IF(@acao = 0)
	   BEGIN
	    DELETE FROM cliente
		WHERE id_cliente = @id_cliente

		SELECT @id_cliente AS RETORNO


	   END
         ELSE IF (@acao = 1)
	   BEGIN

	    INSERT INTO cliente(celular,nome_cliente,email)
		VALUES (@celular,@nome,@email)

		SELECT @@IDENTITY AS RETORNO



	   END
	     ELSE IF (@acao = 2)
	    BEGIN
		  UPDATE cliente
		  SET  celular=@celular,nome_cliente=@nome,email=@email
		  WHERE id_cliente=@id_cliente

		  SELECT @id_cliente AS RETORNO

		END

		ELSE
        BEGIN
	       RAISERROR ('AÇAÕ NAO REALIZADA',14,1);
	   END



END

 ----- FIMM DA PRIMEIRA PROCEDURE ----

 SELECT * FROM cliente

 --INSERIR NA PROCEDURE--
 EXEC uspManterCliente 1,'67567876','Andre','Andre@gamil'

 -- ALTERAR NA PROCEDURE--
 EXEC uspManterCliente 2,'67567876','ondre'

 -- EXCLUIR NA PROCEDURE --
 EXEC uspManterCliente 0,'4'

 SELECT * FROM cliente

 EXEC uspManterCliente 4


 -- FIM TESTE PROCEDURE CLIENTE COMPLETA--

 --  PROCEDURE COMPLETA FUNCIONARIO--
 CREATE PROCEDURE uspManterFuncionario

     @acao INT,
	 @id_funcionario INT = NULL,
	 @cpf VARCHAR(15) = NULL,
	 @nome VARCHAR(100) = NULL,
	 @rg VARCHAR (15) = NULL,
	 @habilitacao VARCHAR(2) = NULL,
	 @cargo VARCHAR(50) = NULL,
	 @celular VARCHAR(15) = NULL,
	 @email VARCHAR(50) = NULL,
	 @endereco VARCHAR(100) = NULL,
	 @salario MONEY = NULL,
	 @dataNacinento DATE = NULL,
	 @sexo VARCHAR(1) = NULL

AS
BEGIN


       IF(@acao = 0)
	   BEGIN
	    DELETE FROM funcionario
		WHERE id_funcionario = @id_funcionario

		SELECT @id_funcionario AS RETORNO


	   END
         ELSE IF (@acao = 1)
	   BEGIN

	    INSERT INTO funcionario(cpf,nome_funcionario,rg,habilitacao,cargo,celular,email_funcionario,endereco,salario,data_nascimento,sexo)
		VALUES (@cpf,@nome,@rg,@habilitacao,@cargo,@celular,@email,@endereco,@salario,@dataNacinento,@sexo)

		SELECT @@IDENTITY AS RETORNO



	   END
	     ELSE IF (@acao = 2)
	    BEGIN
		  UPDATE funcionario
		  SET cpf=@cpf,nome_funcionario=@nome,rg=@rg,habilitacao=@habilitacao,cargo=@cargo,celular=@celular,email_funcionario=@email,endereco=@endereco,salario=@salario,data_nascimento=@dataNacinento,sexo=@sexo
		  WHERE id_funcionario =@id_funcionario

		  SELECT @id_funcionario AS RETORNO

		END

		ELSE
        BEGIN
	       RAISERROR ('AÇAÕ NAO REALIZADA',14,1);
	   END



END

--- FIM PROCEDURE FUNCIONARIO --

 EXEC uspManterFuncionario 1,'866898696','ROMILDO MOURA','56756535','B','ENTREGADOR','98876-8766','ROMILDO@GMAIL','rº DA VARZIA Nº876 BOA VISTA',1600,'1989-02-15','M'

 -- ALTERAR NA PROCEDURE--
 EXEC uspManterFuncionario 2,'866898696','marcio MOURA','56756535','B','ENTREGADOR','98876-8766','ROMILDO@GMAIL','rº DA VARZIA Nº876 BOA VISTA',1900,'1989-02-15','M'


 -- EXCLUIR NA PROCEDURE --
 EXEC uspManterFuncionario 0,3

 SELECT * FROM funcionario

 ----   FIMMM ------ DOS COMANDOOS --

 -- criando uma view ---
 CREATE VIEW uvwFucionarioentrgador
 AS

     SELECT
	     cpf,
		 nome_funcionario,
		 habilitacao,
		 celular,
		 cargo
		 

		 FROM
		   funcionario

		WHERE
		  cargo = 'entregador'

SELECT * FROM uvwFucionarioentrgador

--- fim da view onde a O Cargo é igual a entregador ----


--- CRIANDO OS INNIER JOIN -----

SELECT * FROM


------------------------GFHGFHSGHGFHGH-------------------


SELECT P.id_pedido, P.data_pedido,CL.nome_cliente,P.data_pedido,c.prato,C.descricao,C.valor,F.nome_funcionario

 FROM pedido p INNER JOIN  cliente cl

ON P.id_cliente = cl.id_cliente
INNER JOIN  funcionario F ON F.id_funcionario = P.id_funcionario
INNER JOIN   cardapio C ON C.id_cardapio = p.id_cardapio