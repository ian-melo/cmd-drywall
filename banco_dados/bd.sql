/*CRIAÇÃO DO BANCO*/
CREATE DATABASE drywall;
USE drywall;

/*ENDERECO*/
CREATE TABLE Endereco(
	CodEndereco INT(11) AUTO_INCREMENT,
	Logradouro VARCHAR(50),
	Numero VARCHAR(10),
	Complemento VARCHAR(20),
	Cep VARCHAR(9),
	Bairro VARCHAR(30),
	Cidade VARCHAR(50),
	Uf VARCHAR(2),
	XDEAD BOOLEAN DEFAULT FALSE,
/*PK*/
	PRIMARY KEY(CodEndereco)
);
/*CLIENTE (--> Endereco)*/
CREATE TABLE Cliente(
	CodCliente INT(11) AUTO_INCREMENT,
	DataInscricao DATE,
	CodEndereco INT(11),
	XDEAD BOOLEAN DEFAULT FALSE,
/*FK*/
	FOREIGN KEY(CodEndereco) REFERENCES Endereco(CodEndereco),
/*PK*/
	PRIMARY KEY(CodCliente)
);
/*TELEFONE (--> Cliente)*/
CREATE TABLE Telefone(
	CodCliente INT(11),
	Numero VARCHAR(15),
	XDEAD BOOLEAN DEFAULT FALSE,
/*FK*/
	FOREIGN KEY(CodCliente) REFERENCES Cliente(CodCliente),
/*PK*/
	PRIMARY KEY(CodCliente, Numero)
);
/*PESSOAJURIDICA (--> Cliente)*/
CREATE TABLE PessoaJuridica(
	CodCliente INT(11),
	Cnpj VARCHAR(20),
	RazaoSocial VARCHAR(50),
	RamoAtuacao VARCHAR(30),
	DataFundacao DATE,
	XDEAD BOOLEAN DEFAULT FALSE,
/*FK*/
	FOREIGN KEY(CodCliente) REFERENCES Cliente(CodCliente),
/*PK*/
	PRIMARY KEY(CodCliente)
);
/*PESSOAFISICA (--> Cliente)*/
CREATE TABLE PessoaFisica(
	CodCliente INT(11),
	Cpf VARCHAR(20),
	Nome VARCHAR(50),
	DataNascimento DATE,
	XDEAD BOOLEAN DEFAULT FALSE,
/*FK*/
	FOREIGN KEY(CodCliente) REFERENCES Cliente(CodCliente),
/*PK*/
	PRIMARY KEY(CodCliente)
);

/*CONSTRUCAO*/
CREATE TABLE Construcao(
	CodConstrucao INT(11) AUTO_INCREMENT,
	Descricao VARCHAR(50),
	Detalhes VARCHAR(100),
	Qualidade INT(3),
	XDEAD BOOLEAN DEFAULT FALSE,
/*PK*/
	PRIMARY KEY(CodConstrucao)
);
/*PAREDE (--> Construcao)*/
CREATE TABLE Parede(
	CodConstrucao INT(11),
	Montante DECIMAL(10,5),
	AlturaLimite DECIMAL(10,5),
	EhSt BOOLEAN,
	EhRu BOOLEAN,
	EhRf BOOLEAN,
	XDEAD BOOLEAN DEFAULT FALSE,
/*FK*/
	FOREIGN KEY(CodConstrucao) REFERENCES Construcao(CodConstrucao),
/*PK*/
	PRIMARY KEY(CodConstrucao)
);
/*FORRO (--> Construcao)*/
CREATE TABLE Forro(
	CodConstrucao INT(11),
	EhSt BOOLEAN,
	EhRu BOOLEAN,
	EhRf BOOLEAN,
	XDEAD BOOLEAN DEFAULT FALSE,
/*FK*/
	FOREIGN KEY(CodConstrucao) REFERENCES Construcao(CodConstrucao),
/*PK*/
	PRIMARY KEY(CodConstrucao)
);
/*MATERIAL (--> Construcao)*/
CREATE TABLE Material(
	CodMaterial INT(11) AUTO_INCREMENT,
	Descricao VARCHAR(50),
	NomeUnidade VARCHAR(10),
	ConstanteMetro DECIMAL(10,5),
	PrecoUnitario DECIMAL(8,2),
	EhOpcional BOOLEAN,
	Qualidade INT(3),
	Tipo VARCHAR(20),
	QuantidadeMinima INT(6),
	CodConstrucao INT(11),
	XDEAD BOOLEAN DEFAULT FALSE,
/*FK*/
	FOREIGN KEY(CodConstrucao) REFERENCES Construcao(CodConstrucao),
/*PK*/
	PRIMARY KEY(CodMaterial)
);

/*ORCAMENTO (--> Cliente, Endereco)*/
CREATE TABLE Orcamento(
	CodOrcamento INT(11) AUTO_INCREMENT,
	DataHora DATE,
	CodCliente INT(11),
	CodEndereco INT(11),
	XDEAD BOOLEAN DEFAULT FALSE,
/*FK*/
	FOREIGN KEY(CodCliente) REFERENCES Cliente(CodCliente),
	FOREIGN KEY(CodEndereco) REFERENCES Endereco(CodEndereco),
/*PK*/
	PRIMARY KEY(CodOrcamento)
);
/*ITEM (--> Construcao, Orcamento)*/
CREATE TABLE Item(
	CodItem INT(11) AUTO_INCREMENT,
	Altura DECIMAL(10,5),
	Largura DECIMAL(10,5),
	AreaPorta DECIMAL(10,5),
	AreaJanela DECIMAL(10,5),
	PrecoTotal DECIMAL(8,2),
	CodConstrucao INT(11),
	CodOrcamento INT(11),
	XDEAD BOOLEAN DEFAULT FALSE,
/*FK*/
	FOREIGN KEY(CodConstrucao) REFERENCES Construcao(CodConstrucao),
	FOREIGN KEY(CodOrcamento) REFERENCES Orcamento(CodOrcamento),
/*PK*/
	PRIMARY KEY(CodItem)
);
/*MATERIALITEM (--> Material, Item)*/
CREATE TABLE MaterialItem(
	CodMaterial INT(11),
	CodItem INT(11),
	Quantidade INT(6),
	PrecoUnitario DECIMAL(8,2),
	XDEAD BOOLEAN DEFAULT FALSE,
/*FK*/
	FOREIGN KEY(CodMaterial) REFERENCES Material(CodMaterial),
	FOREIGN KEY(CodItem) REFERENCES Item(CodItem),
/*PK*/
	PRIMARY KEY(CodMaterial, CodItem)
);

/*FUNCIONARIO*/
CREATE TABLE Funcionario(
	CodFuncionario INT(11) AUTO_INCREMENT,
	Login VARCHAR(30),
	Senha VARCHAR(40),
	XDEAD BOOLEAN DEFAULT FALSE,
/*PK*/
	PRIMARY KEY(CodFuncionario)
);
/*REGISTROATIVIDADE (--> Funcionario)*/
CREATE TABLE RegistroAtividade(
	CodRegistro INT(11) AUTO_INCREMENT,
	CodFuncionario INT(11),
	DataHora DATE,
/*FK*/
	FOREIGN KEY(CodFuncionario) REFERENCES Funcionario(CodFuncionario),
/*PK*/
	PRIMARY KEY(CodRegistro)
);
/*REGISTROCONSTRUCAO (--> RegistroAtividade)*/
CREATE TABLE RegistroConstrucao(
	CodRegistro INT(11),
	Atividade VARCHAR(30),
	Tabela VARCHAR(20),
	Detalhe VARCHAR(100),
/*FK*/
	FOREIGN KEY(CodRegistro) REFERENCES RegistroAtividade(CodRegistro),
/*PK*/
	PRIMARY KEY(CodRegistro)
);
/*REGISTROORCAMENTO (--> RegistroAtividade)*/
CREATE TABLE RegistroOrcamento(
	CodRegistro INT(11),
	Atividade VARCHAR(30),
	Tabela VARCHAR(20),
	Detalhe VARCHAR(100),
/*FK*/
	FOREIGN KEY(CodRegistro) REFERENCES RegistroAtividade(CodRegistro),
/*PK*/
	PRIMARY KEY(CodRegistro)
);
