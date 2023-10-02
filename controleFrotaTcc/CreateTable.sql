create table Usuario
(Id          number(5) not null primary key, 
 Nome               varchar2(80) not null,
 RE                varchar2(12) not null, 
 CPF                varchar2(12) not null,
 Endereco           varchar2(80) not null,
 Email              varchar2(60),
 Telefone           varchar2(20),
 Senha              varchar2(20),
 InativarUsuario    number(1));

create table Veiculo
(CodVeiculo          number(5) not null primary key,
Placa                varchar2(60),
Marca                varchar2(60),
DataCadastro         date,
TipoVeiculo          varchar2(60),
AnoFabricacao        number(5),
Modelo               varchar2(60),
DataCompra           date,
Chassi              varchar2(60),
AnoModelo           number(5), 
Cor                 varchar2(60),
KmInicial           number(10),
KmAtual             number(10),
Motor               varchar2(60),
Crv                 varchar2(60),
Renavam             varchar2(60),
Combustivel         varchar2(60),
VencimentoGarantia  number(5),
InativarVeiculo     number(1));