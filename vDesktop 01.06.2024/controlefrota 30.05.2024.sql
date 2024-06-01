-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 26-Maio-2024 às 20:08
-- Versão do servidor: 10.4.28-MariaDB
-- versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `controlefrota`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `agenda`
--

CREATE TABLE `agenda` (
  `id` int(11) NOT NULL,
  `data` date DEFAULT NULL,
  `horario` varchar(20) DEFAULT NULL,
  `placa` varchar(20) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `box` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `agenda`
--

INSERT INTO `agenda` (`id`, `data`, `horario`, `placa`, `status`, `box`) VALUES
(229, '2024-02-18', '08:00', 'GHR157589 ', 'Encerrado', 2),
(379, '2024-05-25', '08:00', 'GHR157589 ', 'Encerrado', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `agenda_servico`
--

CREATE TABLE `agenda_servico` (
  `idAgendaServico` int(11) NOT NULL,
  `fk_idOrdem` int(11) NOT NULL,
  `fk_idAgenda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `agenda_servico`
--

INSERT INTO `agenda_servico` (`idAgendaServico`, `fk_idOrdem`, `fk_idAgenda`) VALUES
(6, 161, 379),
(7, 162, 379);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro_produto`
--

CREATE TABLE `cadastro_produto` (
  `idCodigo` int(10) NOT NULL,
  `marca` varchar(30) DEFAULT NULL,
  `modelo` varchar(30) DEFAULT NULL,
  `cor` varchar(30) DEFAULT NULL,
  `anoFabricacao` int(11) DEFAULT NULL,
  `anoModelo` int(11) DEFAULT NULL,
  `descricaoItem` varchar(80) DEFAULT NULL,
  `valorUnitario` double(10,2) DEFAULT NULL,
  `pecaUniversal` tinyint(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `cadastro_produto`
--

INSERT INTO `cadastro_produto` (`idCodigo`, `marca`, `modelo`, `cor`, `anoFabricacao`, `anoModelo`, `descricaoItem`, `valorUnitario`, `pecaUniversal`) VALUES
(1000, '', '', '', 0, 0, 'PNEU PIRELLI 195/60 R15', 270.00, 1),
(1001, '', '', '', 0, 0, 'PNEU PIRELLI 185/65 R14', 279.00, 1),
(1002, '', '', '', 0, 0, 'PNEU PIRELLI 175/70 R13', 230.25, 1),
(1003, '', '', '', 0, 0, 'PNEU MICHELIN 205/55 R16', 399.99, 1),
(1004, '', '', '', 0, 0, 'ZXCV', 234.98, 0),
(1005, 'HONDA', 'FIT', 'PRETO', 2013, 2013, 'JOGO DE VELAS', 149.99, 0),
(1006, 'HONDA', 'FIT', 'PRATA', 2012, 2013, 'KIT PASTILHA E DISCO DE FREIO ORIGINAL VARGA', 1800.99, 0),
(1007, '', '', '', 0, 0, ' FLUIDO ÓLEO DE FREIO DOT 4 TRW VARGA 500M', 38.91, 1),
(1008, 'HONDA', 'FIT', 'PRETO', 2010, 2013, ' PASTILHAS DE FREIO DIANTEIRA', 139.41, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `ordemservico`
--

CREATE TABLE `ordemservico` (
  `Id` int(11) NOT NULL,
  `dataCheck` date NOT NULL,
  `tipoManutencao` varchar(15) DEFAULT NULL,
  `statusOrdem` varchar(15) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `valorTotal` double(10,2) DEFAULT NULL,
  `placa` varchar(10) NOT NULL,
  `re` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `ordemservico`
--

INSERT INTO `ordemservico` (`Id`, `dataCheck`, `tipoManutencao`, `statusOrdem`, `data`, `valorTotal`, `placa`, `re`) VALUES
(2, '0000-00-00', 'Corretiva', NULL, NULL, NULL, 'GHR157589', ''),
(3, '0000-00-00', 'Corretiva', NULL, NULL, NULL, 'GHR157589', ''),
(4, '0000-00-00', 'Corretiva', NULL, NULL, NULL, 'GHR157589', ''),
(5, '0000-00-00', 'Corretiva', NULL, NULL, NULL, 'GHR157589', ''),
(6, '0000-00-00', 'Corretiva', NULL, NULL, NULL, 'GHR157589', ''),
(7, '2024-03-10', 'Corretiva', NULL, NULL, NULL, 'GHR157589', ''),
(10, '0000-00-00', 'Corretiva', 'Fechado', NULL, NULL, 'GHR157589', ''),
(11, '0000-00-00', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(12, '2024-03-10', 'Corretiva', 'Fechado', NULL, NULL, 'GHR157589', ''),
(13, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(14, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(15, '2024-03-10', 'Preventiva', 'Fechado', NULL, NULL, '', ''),
(16, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(17, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(18, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(19, '2024-03-10', 'Preventiva', 'Fechado', NULL, NULL, '', ''),
(20, '2024-03-10', 'Preventiva', 'Fechado', NULL, NULL, '', ''),
(21, '2024-03-10', 'Preventiva', 'Fechado', NULL, NULL, '', ''),
(22, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(23, '2024-03-10', 'Preventiva', 'Fechado', NULL, NULL, '', ''),
(24, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(25, '2024-03-10', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(26, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(27, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(28, '2024-03-10', 'Preventiva', 'Fechado', NULL, NULL, '', ''),
(29, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(30, '2024-03-10', 'Preventiva', 'Aberto', NULL, NULL, '', ''),
(31, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(32, '2024-03-10', 'Preventiva', 'Aberto', NULL, NULL, '', ''),
(33, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(34, '2024-03-10', 'Preventiva', 'Aberto', NULL, NULL, '', ''),
(35, '2024-03-10', 'Preventiva', 'Aberto', NULL, NULL, '', ''),
(36, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(37, '2024-03-10', 'Preventiva', 'Aberto', NULL, NULL, '', ''),
(38, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(39, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(40, '2024-03-10', 'Preventiva', 'Aberto', NULL, NULL, '', ''),
(41, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(42, '2024-03-10', 'Preventiva', 'Aberto', NULL, NULL, '', ''),
(43, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(44, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(45, '2024-03-10', 'Preventiva', 'Aberto', NULL, NULL, '', ''),
(46, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(47, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(48, '2024-03-10', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(49, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, '', ''),
(50, '2024-03-16', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(51, '2024-03-15', 'Preventiva', 'Aberto', NULL, NULL, '', ''),
(52, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(53, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(54, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(55, '2024-03-15', 'Corretiva', 'Fechado', NULL, NULL, 'GHR157589', ''),
(56, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(57, '2024-03-15', 'Corretiva', 'Fechado', NULL, NULL, 'GHR157589', ''),
(58, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(59, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(60, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(61, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(62, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(63, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(64, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(65, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(66, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(67, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(68, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(69, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(70, '2024-03-15', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(71, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(72, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(73, '2024-03-15', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(74, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(75, '2024-03-15', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(76, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(77, '2024-03-15', 'Preventiva', 'Fechado', NULL, NULL, 'GHR157589', ''),
(78, '2024-03-15', 'Corretiva', 'Fechado', NULL, NULL, 'GHR157589', ''),
(79, '2024-03-15', 'Preventiva', 'Fechado', NULL, NULL, 'GHR157589', ''),
(80, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(81, '2024-03-15', 'Preventiva', 'Fechado', NULL, NULL, 'GHR157589', ''),
(82, '2024-03-15', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(83, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(84, '2024-03-15', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(85, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(86, '2024-03-15', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(87, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(88, '2024-03-15', 'Preventiva', 'Finalizado', NULL, NULL, 'GHR157589', ''),
(89, '2024-03-15', 'Corretiva', 'Finalizado', NULL, NULL, 'GHR157589', ''),
(90, '2024-03-15', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(91, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(92, '2024-03-15', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(93, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(94, '2024-03-15', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(95, '2024-03-15', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(96, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(97, '2024-03-16', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(98, '2024-03-16', 'Preventiva', 'Finalizado', NULL, NULL, 'GHR157589', ''),
(99, '2024-03-16', 'Corretiva', 'Finalizado', NULL, NULL, 'GHR157589', ''),
(100, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(101, '2024-03-16', 'Corretiva', 'Finalizado', NULL, NULL, 'GHR157589', ''),
(102, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(103, '2024-03-16', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(104, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(105, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(106, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(107, '2024-03-16', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(108, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(109, '2024-03-16', 'Preventiva', 'Finalizado', NULL, NULL, 'GHR157589', ''),
(110, '2024-03-16', 'Corretiva', 'Finalizado', NULL, NULL, 'GHR157589', ''),
(111, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(112, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(113, '2024-03-16', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(114, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(115, '2024-03-16', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(116, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(117, '2024-04-13', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(118, '0000-00-00', 'Corretiva', 'ABERTO', NULL, NULL, 'GHR157589', '0123'),
(119, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(120, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(121, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(122, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', NULL),
(123, '2024-04-13', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(124, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', NULL),
(125, '2024-04-13', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', ''),
(126, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', NULL),
(127, '2024-04-13', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(128, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(129, '2024-04-13', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(130, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(131, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(132, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(133, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(134, '2024-04-13', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(135, '2024-04-13', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(136, '2024-04-13', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(137, '2024-04-18', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(138, '2024-04-18', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(139, '2024-04-18', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(140, '2024-04-18', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(141, '2024-04-18', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(142, '2024-04-18', 'Preventiva', 'Fechado', NULL, NULL, '', '3316'),
(143, '2024-04-18', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(144, '2024-04-18', 'Corretiva', 'Aberto', NULL, NULL, '', '3316'),
(145, '2024-04-18', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(146, '2024-04-18', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(147, '2024-04-18', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(148, '2024-04-18', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(149, '2024-04-18', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(150, '2024-04-18', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(151, '2024-04-19', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(152, '2024-04-19', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(153, '2024-04-21', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(154, '2024-04-21', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(155, '2024-04-21', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(156, '2024-04-21', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(157, '2024-04-21', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(158, '2024-04-21', 'Corretiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(159, '2024-04-21', 'Preventiva', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(160, '2024-04-21', 'Preventiva', 'Fechado', NULL, NULL, 'GHR157589', '3316'),
(161, '2024-04-21', 'Preventiva', 'Encerrado', '2024-05-26', 339.80, 'GHR157589', '3316'),
(162, '2024-04-21', 'Corretiva', 'Encerrado', '2024-05-26', 1258.64, 'GHR157589', '3316');

-- --------------------------------------------------------

--
-- Estrutura da tabela `ordem_plano`
--

CREATE TABLE `ordem_plano` (
  `fk_idPlano` int(11) NOT NULL,
  `fk_idOrdem` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `ordem_plano`
--

INSERT INTO `ordem_plano` (`fk_idPlano`, `fk_idOrdem`) VALUES
(2, 147),
(2, 149),
(2, 151),
(2, 155),
(2, 157),
(2, 159),
(2, 161),
(4, 147),
(4, 149),
(4, 151),
(4, 157),
(4, 159),
(4, 161),
(6, 147),
(6, 149),
(6, 151);

-- --------------------------------------------------------

--
-- Estrutura da tabela `ordem_produto`
--

CREATE TABLE `ordem_produto` (
  `fk_IdOrdem` int(11) NOT NULL,
  `fk_IdCodigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `ordem_produto`
--

INSERT INTO `ordem_produto` (`fk_IdOrdem`, `fk_IdCodigo`) VALUES
(2, 1001),
(2, 1002),
(2, 1003),
(136, 1003),
(138, 1003),
(138, 1007),
(140, 1001),
(144, 1003),
(146, 1001),
(146, 1002),
(148, 1000),
(148, 1001),
(150, 1001),
(150, 1002),
(150, 1007),
(152, 1000),
(152, 1001),
(154, 1001),
(154, 1002),
(156, 1002),
(158, 1000),
(158, 1001),
(162, 1001),
(162, 1002),
(162, 1003),
(162, 1004);

-- --------------------------------------------------------

--
-- Estrutura da tabela `planomanutencao`
--

CREATE TABLE `planomanutencao` (
  `idPlano` int(11) NOT NULL,
  `marca` varchar(100) NOT NULL,
  `modelo` varchar(100) NOT NULL,
  `motor` varchar(100) NOT NULL,
  `kmManutencao` int(11) NOT NULL,
  `anoModelo` int(11) NOT NULL,
  `anoFabricacao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `planomanutencao`
--

INSERT INTO `planomanutencao` (`idPlano`, `marca`, `modelo`, `motor`, `kmManutencao`, `anoModelo`, `anoFabricacao`) VALUES
(1, 'Chevrolet', 'Celta', '1.0', 10000, 2022, 2023),
(2, 'Chevrolet', 'Celta', '1.0', 10000, 2023, 2023),
(3, 'Chevrolet', 'Celta', '1.0', 20000, 2022, 2023),
(4, 'Chevrolet', 'Celta', '1.0', 20000, 2023, 2023),
(5, 'Chevrolet', 'Celta', '1.0', 30000, 2022, 2023),
(6, 'Chevrolet', 'Celta', '1.0', 30000, 2023, 2023),
(7, 'Chevrolet', 'Celta', '1.0', 40000, 2022, 2023),
(8, 'Chevrolet', 'Celta', '1.0', 50000, 2022, 2023),
(9, 'Chevrolet', 'Celta', '1.0', 60000, 2022, 2023),
(10, 'Chevrolet', 'Celta', '1.0', 70000, 2022, 2023),
(11, 'Chevrolet', 'Celta', '1.0', 80000, 2022, 2023),
(12, 'Chevrolet', 'Celta', '1.0', 90000, 2022, 2023),
(13, 'Chevrolet', 'Celta', '1.0', 100000, 2022, 2023),
(14, 'Honda', 'Fit', '1.6', 10000, 2011, 2010),
(15, 'Honda', 'Fit', '1.6', 20000, 2011, 2010),
(16, 'Hyundai', 'HB20', '1.6', 10000, 2023, 2023),
(17, 'Hyundai', 'HB20', '1.6', 20000, 2023, 2023),
(18, 'Renault', 'KWID', '1.0', 10000, 2023, 2023),
(19, 'Renault', 'KWID', '1.0', 20000, 2023, 2023),
(20, 'Renault', 'KWID', '1.0', 30000, 2023, 2023),
(21, 'Renault', 'KWID', '1.0', 40000, 2023, 2023),
(22, 'Renault', 'KWID', '1.0', 50000, 2023, 2023),
(23, 'Renault', 'KWID', '1.0', 60000, 2023, 2023),
(24, 'Renault', 'KWID', '1.0', 70000, 2023, 2023),
(25, 'Renault', 'KWID', '1.0', 80000, 2023, 2023),
(26, 'Renault', 'KWID', '1.0', 90000, 2023, 2023),
(27, 'Renault', 'KWID', '1.0', 100000, 2023, 2023);

-- --------------------------------------------------------

--
-- Estrutura da tabela `plano_produto`
--

CREATE TABLE `plano_produto` (
  `fk_idPlano` int(11) NOT NULL,
  `fk_idCodigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `plano_produto`
--

INSERT INTO `plano_produto` (`fk_idPlano`, `fk_idCodigo`) VALUES
(2, 1000),
(2, 1007);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `re` varchar(50) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(200) DEFAULT NULL,
  `estado` varchar(100) DEFAULT NULL,
  `cep` varchar(50) DEFAULT NULL,
  `perfil` varchar(100) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `inativarUsuario` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`re`, `nome`, `endereco`, `numero`, `bairro`, `cidade`, `estado`, `cep`, `perfil`, `email`, `telefone`, `cpf`, `senha`, `inativarUsuario`) VALUES
('0123456789', 'Vinicius Costa', 'Rua André Menck', NULL, NULL, NULL, '', '', '', 'vinicius.hque@gmail.com', '15998322750', '90090060021', 'casablanca', 0),
('101021', 'Vinicios Lemos ', 'Rua Caracas 120', NULL, NULL, NULL, '', '', '', 'vinicios_lemos@gmail.com', '30125859', '3852963147', '159159', 0),
('101035', 'TesteAtualizar', 'DFBGFDS', NULL, NULL, NULL, '', '', '', 'DFGBDFG@HOTMAIL.COM', 'DFBGFD', '3214567', '101035', 1),
('101040', 'Francine Garbimn', 'Av Afonso vergueiro 1235', NULL, NULL, NULL, '', '', '', 'fr_Garbim@hotmail.com', '3229147', '32229478', '101040', 0),
('101050', 'Fabiola', 'Rua Jose Paes motta n237', NULL, NULL, NULL, '', '', '', 'fabi_fabi@gmail.com', '32229147', '123456789', '101050', 0),
('1020', 'Francisco Mariano de Carvalho Neto', 'Rua São Paulo N952', 126, 'Centro', 'Sorocaba', 'SP', '18045310', 'Administrador', 'mariano_neto@hotmail.com', '998152040', '34994352040', '101010', 0),
('102020', 'Priscila Latance', 'Rua Caracas 120', NULL, NULL, NULL, '', '', '', 'priscila.dev@hotmail.com', '998745689', '15145896733', 'hfdh', 0),
('1021', 'FRANCINE GARBIM', 'RUA DR. AMÉRICO FIGUEIREDO,7401 ', NULL, NULL, NULL, '', '', '', 'GARBIMSP@HOTMAIL.COM', '15988097980', '36129322844', '061286', 0),
('174596', 'Jenifer Ramos', 'Alameda Lirio', 78, 'Centro', 'Sorocaba', 'SP', '18759-140', 'Administrador', 'jenifer.ramos@gmail.com', '32147786', '7859', '7896', 0),
('3316', 'Mariana Xavier dos Santos Galindo', 'Davino Nogueira dos Santos, 160', NULL, NULL, NULL, '', '', '', 'mariana.xsg@hotmail.com', '(15)3292-2013', '36839451888', '150150', 0),
('teste', 'teste', ' teste', 12344, 'teste', 'teste', 'sp', '', 'Administrador', 'teste', '', '12314342525346', 'teste', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `placa` varchar(50) NOT NULL,
  `marca` varchar(100) DEFAULT NULL,
  `modelo` varchar(100) DEFAULT NULL,
  `cor` varchar(100) DEFAULT NULL,
  `combustivel` varchar(50) NOT NULL,
  `tipoVeiculo` varchar(100) NOT NULL,
  `anoFabricacao` int(11) NOT NULL,
  `anoModelo` int(11) NOT NULL,
  `kmAtual` int(11) NOT NULL,
  `crv` varchar(100) NOT NULL,
  `renavam` varchar(100) NOT NULL,
  `chassi` varchar(100) NOT NULL,
  `motor` varchar(100) NOT NULL,
  `inativarVeiculo` tinyint(1) DEFAULT NULL,
  `dataCadastro` date DEFAULT NULL,
  `dataCompra` date DEFAULT NULL,
  `vencimentoGarantia` date DEFAULT NULL,
  `KmManutRealizado` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `veiculo`
--

INSERT INTO `veiculo` (`placa`, `marca`, `modelo`, `cor`, `combustivel`, `tipoVeiculo`, `anoFabricacao`, `anoModelo`, `kmAtual`, `crv`, `renavam`, `chassi`, `motor`, `inativarVeiculo`, `dataCadastro`, `dataCompra`, `vencimentoGarantia`, `KmManutRealizado`) VALUES
('DRE1678', 'Honda', 'Fit', 'Preto', 'Gasolina', '2 portas', 2010, 2011, 0, '1354536843', '54326356', '232103102', '1.6', 0, '2024-02-10', '2024-01-10', '2026-01-10', 0),
('DRG45798', 'Renault', 'Kwid', 'Branco ', 'Flex', '2 portas', 2023, 2023, 5000, '123113164', '15894611941', '6511961619', '1.0', 0, '2023-12-10', '2022-12-10', '2025-12-10', NULL),
('EGY15616', 'Hyundai', 'HB20', 'Prata', 'Flex', '4 portas', 2023, 2023, 10000, '131616606', '1231166494', '1316416916', '1.6', 0, '2023-06-12', '2023-06-10', '2025-06-12', NULL),
('FAZG765', 'HONDA', 'LXL', 'PRETO', 'GASOLINA', '2 portas', 2022, 2023, 110, 'KJHBASDV', '1234234234', 'BWQFE7QD8723U867TAVG', '1.4', 0, '2024-01-21', '2024-01-21', '2025-01-21', NULL),
('FRD15789', 'Chevrolet', 'Celta', 'Prata', 'Flex', '4 portas', 2022, 2023, 0, '758964532', '15946216494', '156161641FD', '1.0', 0, '2024-01-13', '2024-01-10', '2026-01-13', NULL),
('GHR157589 ', 'Chevrolet', 'Celta', 'Prata', 'Flex', '2 portas', 2023, 2023, 10000, '1256461', '16161063', '2316916196', '1.0', 0, '2023-08-20', '2023-08-10', '2025-08-20', 0),
('SDE15426', 'Renault', 'KWID', 'Preto', 'flex', '4 portas', 2023, 2024, 0, '131616216', '161916061', '131641916', '1.0', 0, '2024-02-10', '2023-12-10', '2026-02-10', 0),
('SED15789', 'Hyundai', 'HB20', 'Prata', 'Flex', '4 portas', 2022, 2022, 5000, '47525498459', '15866199', '1516164644', '1.4', 0, '2023-01-10', '2022-12-20', '2025-01-10', NULL);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `agenda`
--
ALTER TABLE `agenda`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_placa` (`placa`);

--
-- Índices para tabela `agenda_servico`
--
ALTER TABLE `agenda_servico`
  ADD PRIMARY KEY (`idAgendaServico`),
  ADD KEY `Ordem` (`fk_idOrdem`),
  ADD KEY `Agenda` (`fk_idAgenda`);

--
-- Índices para tabela `cadastro_produto`
--
ALTER TABLE `cadastro_produto`
  ADD PRIMARY KEY (`idCodigo`);

--
-- Índices para tabela `ordemservico`
--
ALTER TABLE `ordemservico`
  ADD PRIMARY KEY (`Id`);

--
-- Índices para tabela `ordem_plano`
--
ALTER TABLE `ordem_plano`
  ADD PRIMARY KEY (`fk_idPlano`,`fk_idOrdem`),
  ADD KEY `ordem_Servico_Id` (`fk_idOrdem`),
  ADD KEY `plano_manutencao_idPlano` (`fk_idPlano`);

--
-- Índices para tabela `ordem_produto`
--
ALTER TABLE `ordem_produto`
  ADD PRIMARY KEY (`fk_IdOrdem`,`fk_IdCodigo`),
  ADD KEY `ordem_Servico_Id` (`fk_IdOrdem`),
  ADD KEY `cadastro_Item_IdCodigo` (`fk_IdCodigo`);

--
-- Índices para tabela `planomanutencao`
--
ALTER TABLE `planomanutencao`
  ADD PRIMARY KEY (`idPlano`),
  ADD UNIQUE KEY `uniquePadrao` (`modelo`,`motor`,`kmManutencao`,`anoModelo`,`anoFabricacao`) USING BTREE;

--
-- Índices para tabela `plano_produto`
--
ALTER TABLE `plano_produto`
  ADD PRIMARY KEY (`fk_idPlano`,`fk_idCodigo`),
  ADD KEY `fk_idCodigo` (`fk_idCodigo`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`re`);

--
-- Índices para tabela `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`placa`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `agenda`
--
ALTER TABLE `agenda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=423;

--
-- AUTO_INCREMENT de tabela `agenda_servico`
--
ALTER TABLE `agenda_servico`
  MODIFY `idAgendaServico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `cadastro_produto`
--
ALTER TABLE `cadastro_produto`
  MODIFY `idCodigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1010;

--
-- AUTO_INCREMENT de tabela `ordemservico`
--
ALTER TABLE `ordemservico`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=163;

--
-- AUTO_INCREMENT de tabela `planomanutencao`
--
ALTER TABLE `planomanutencao`
  MODIFY `idPlano` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `agenda`
--
ALTER TABLE `agenda`
  ADD CONSTRAINT `fk_placa` FOREIGN KEY (`placa`) REFERENCES `veiculo` (`placa`);

--
-- Limitadores para a tabela `agenda_servico`
--
ALTER TABLE `agenda_servico`
  ADD CONSTRAINT `Agenda` FOREIGN KEY (`fk_idAgenda`) REFERENCES `agenda` (`id`),
  ADD CONSTRAINT `Ordem` FOREIGN KEY (`fk_idOrdem`) REFERENCES `ordemservico` (`Id`);

--
-- Limitadores para a tabela `ordem_plano`
--
ALTER TABLE `ordem_plano`
  ADD CONSTRAINT `ordem_plano_ibfk_1` FOREIGN KEY (`fk_idPlano`) REFERENCES `planomanutencao` (`idPlano`),
  ADD CONSTRAINT `ordem_plano_ibfk_2` FOREIGN KEY (`fk_idOrdem`) REFERENCES `ordemservico` (`Id`);

--
-- Limitadores para a tabela `ordem_produto`
--
ALTER TABLE `ordem_produto`
  ADD CONSTRAINT `ordem_produto_ibfk_1` FOREIGN KEY (`fk_IdOrdem`) REFERENCES `ordemservico` (`Id`),
  ADD CONSTRAINT `ordem_produto_ibfk_2` FOREIGN KEY (`fk_IdCodigo`) REFERENCES `cadastro_produto` (`idCodigo`);

--
-- Limitadores para a tabela `plano_produto`
--
ALTER TABLE `plano_produto`
  ADD CONSTRAINT `plano_produto_ibfk_1` FOREIGN KEY (`fk_idPlano`) REFERENCES `planomanutencao` (`idPlano`),
  ADD CONSTRAINT `plano_produto_ibfk_2` FOREIGN KEY (`fk_idCodigo`) REFERENCES `cadastro_produto` (`idCodigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
