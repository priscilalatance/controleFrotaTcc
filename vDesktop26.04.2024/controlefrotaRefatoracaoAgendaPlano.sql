-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 27/04/2024 às 03:59
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

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
-- Estrutura para tabela `agenda`
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
-- Despejando dados para a tabela `agenda`
--

INSERT INTO `agenda` (`id`, `data`, `horario`, `placa`, `status`, `box`) VALUES
(148, '2024-02-08', '14:00', NULL, 'disponivel', 1),
(149, '2024-02-08', '14:00', NULL, 'disponivel', 2),
(150, '2024-02-08', '14:00', NULL, 'disponivel', 3),
(151, '2024-02-08', '14:00', NULL, 'disponivel', 4),
(152, '2024-02-08', '14:00', NULL, 'disponivel', 5),
(153, '2024-02-11', '08:00', 'DRG45798', 'agendado', 1),
(154, '2024-02-11', '08:00', NULL, 'disponivel', 2),
(155, '2024-02-11', '08:00', NULL, 'disponivel', 3),
(156, '2024-02-11', '08:00', NULL, 'disponivel', 4),
(157, '2024-02-11', '08:00', NULL, 'disponivel', 5),
(158, '2024-02-11', '11:00', NULL, 'disponivel', 1),
(159, '2024-02-11', '11:00', NULL, 'disponivel', 2),
(160, '2024-02-11', '11:00', NULL, 'disponivel', 3),
(161, '2024-02-11', '11:00', NULL, 'disponivel', 4),
(162, '2024-02-11', '11:00', NULL, 'disponivel', 5),
(163, '2024-02-11', '14:00', NULL, 'disponivel', 1),
(164, '2024-02-11', '14:00', NULL, 'disponivel', 2),
(165, '2024-02-11', '14:00', NULL, 'disponivel', 3),
(166, '2024-02-11', '14:00', NULL, 'disponivel', 4),
(167, '2024-02-11', '14:00', NULL, 'disponivel', 5),
(168, '2024-02-13', '08:00', NULL, 'disponivel', 1),
(169, '2024-02-13', '08:00', NULL, 'disponivel', 2),
(170, '2024-02-13', '08:00', NULL, 'disponivel', 3),
(171, '2024-02-13', '08:00', NULL, 'disponivel', 4),
(172, '2024-02-13', '08:00', NULL, 'disponivel', 5),
(173, '2024-02-13', '11:00', NULL, 'disponivel', 1),
(174, '2024-02-13', '11:00', NULL, 'disponivel', 2),
(175, '2024-02-13', '11:00', NULL, 'disponivel', 3),
(176, '2024-02-13', '11:00', NULL, 'disponivel', 4),
(177, '2024-02-13', '11:00', NULL, 'disponivel', 5),
(178, '2024-02-13', '14:00', NULL, 'disponivel', 1),
(179, '2024-02-13', '14:00', NULL, 'disponivel', 2),
(180, '2024-02-13', '14:00', NULL, 'disponivel', 3),
(181, '2024-02-13', '14:00', NULL, 'disponivel', 4),
(182, '2024-02-13', '14:00', NULL, 'disponivel', 5),
(183, '2024-02-14', '08:00', NULL, 'disponivel', 1),
(184, '2024-02-14', '08:00', NULL, 'disponivel', 2),
(185, '2024-02-14', '08:00', NULL, 'disponivel', 3),
(186, '2024-02-14', '08:00', NULL, 'disponivel', 4),
(187, '2024-02-14', '08:00', NULL, 'disponivel', 5),
(188, '2024-02-14', '11:00', NULL, 'disponivel', 1),
(189, '2024-02-14', '11:00', NULL, 'disponivel', 2),
(190, '2024-02-14', '11:00', NULL, 'disponivel', 3),
(191, '2024-02-14', '11:00', NULL, 'disponivel', 4),
(192, '2024-02-14', '11:00', NULL, 'disponivel', 5),
(193, '2024-02-14', '14:00', NULL, 'disponivel', 1),
(194, '2024-02-14', '14:00', NULL, 'disponivel', 2),
(195, '2024-02-14', '14:00', NULL, 'disponivel', 3),
(196, '2024-02-14', '14:00', NULL, 'disponivel', 4),
(197, '2024-02-14', '14:00', NULL, 'disponivel', 5),
(198, '2024-02-15', '08:00', NULL, 'disponivel', 1),
(199, '2024-02-15', '08:00', NULL, 'disponivel', 2),
(200, '2024-02-15', '08:00', NULL, 'disponivel', 3),
(201, '2024-02-15', '08:00', NULL, 'disponivel', 4),
(202, '2024-02-15', '08:00', NULL, 'disponivel', 5),
(203, '2024-02-15', '11:00', NULL, 'disponivel', 1),
(204, '2024-02-15', '11:00', NULL, 'disponivel', 2),
(205, '2024-02-15', '11:00', NULL, 'disponivel', 3),
(206, '2024-02-15', '11:00', NULL, 'disponivel', 4),
(207, '2024-02-15', '11:00', NULL, 'disponivel', 5),
(208, '2024-02-15', '14:00', NULL, 'disponivel', 1),
(209, '2024-02-15', '14:00', NULL, 'disponivel', 2),
(210, '2024-02-15', '14:00', NULL, 'disponivel', 3),
(211, '2024-02-15', '14:00', NULL, 'disponivel', 4),
(212, '2024-02-15', '14:00', NULL, 'disponivel', 5),
(213, '2024-02-16', '08:00', NULL, 'disponivel', 1),
(214, '2024-02-16', '08:00', NULL, 'disponivel', 2),
(215, '2024-02-16', '08:00', NULL, 'disponivel', 3),
(216, '2024-02-16', '08:00', NULL, 'disponivel', 4),
(217, '2024-02-16', '08:00', NULL, 'disponivel', 5),
(218, '2024-02-16', '11:00', NULL, 'disponivel', 1),
(219, '2024-02-16', '11:00', NULL, 'disponivel', 2),
(220, '2024-02-16', '11:00', NULL, 'disponivel', 3),
(221, '2024-02-16', '11:00', NULL, 'disponivel', 4),
(222, '2024-02-16', '11:00', NULL, 'disponivel', 5),
(223, '2024-02-16', '14:00', NULL, 'disponivel', 1),
(224, '2024-02-16', '14:00', NULL, 'disponivel', 2),
(225, '2024-02-16', '14:00', NULL, 'disponivel', 3),
(226, '2024-02-16', '14:00', NULL, 'disponivel', 4),
(227, '2024-02-16', '14:00', NULL, 'disponivel', 5),
(228, '2024-02-18', '08:00', 'DRG45798', 'agendado', 1),
(229, '2024-02-18', '08:00', 'DRG45798', 'agendado', 2),
(230, '2024-02-18', '08:00', 'DRG45798', 'agendado', 3),
(231, '2024-02-18', '08:00', 'DRG45798', 'agendado', 4),
(232, '2024-02-18', '08:00', 'DRG45798', 'agendado', 5),
(233, '2024-02-18', '11:00', NULL, 'disponivel', 1),
(234, '2024-02-18', '11:00', NULL, 'disponivel', 2),
(235, '2024-02-18', '11:00', NULL, 'disponivel', 3),
(236, '2024-02-18', '11:00', NULL, 'disponivel', 4),
(237, '2024-02-18', '11:00', NULL, 'disponivel', 5),
(238, '2024-02-18', '14:00', NULL, 'disponivel', 1),
(239, '2024-02-18', '14:00', NULL, 'disponivel', 2),
(240, '2024-02-18', '14:00', NULL, 'disponivel', 3),
(241, '2024-02-18', '14:00', NULL, 'disponivel', 4),
(242, '2024-02-18', '14:00', NULL, 'disponivel', 5),
(243, '2024-02-19', '08:00', NULL, 'disponivel', 1),
(244, '2024-02-19', '08:00', NULL, 'disponivel', 2),
(245, '2024-02-19', '08:00', NULL, 'disponivel', 3),
(246, '2024-02-19', '08:00', NULL, 'disponivel', 4),
(247, '2024-02-19', '08:00', NULL, 'disponivel', 5),
(248, '2024-02-19', '11:00', NULL, 'disponivel', 1),
(249, '2024-02-19', '11:00', NULL, 'disponivel', 2),
(250, '2024-02-19', '11:00', NULL, 'disponivel', 3),
(251, '2024-02-19', '11:00', NULL, 'disponivel', 4),
(252, '2024-02-19', '11:00', NULL, 'disponivel', 5),
(253, '2024-02-19', '14:00', NULL, 'disponivel', 1),
(254, '2024-02-19', '14:00', NULL, 'disponivel', 2),
(255, '2024-02-19', '14:00', NULL, 'disponivel', 3),
(256, '2024-02-19', '14:00', NULL, 'disponivel', 4),
(257, '2024-02-19', '14:00', NULL, 'disponivel', 5),
(258, '2024-02-20', '08:00', NULL, 'disponivel', 1),
(259, '2024-02-20', '08:00', NULL, 'disponivel', 2),
(260, '2024-02-20', '08:00', NULL, 'disponivel', 3),
(261, '2024-02-20', '08:00', NULL, 'disponivel', 4),
(262, '2024-02-20', '08:00', NULL, 'disponivel', 5),
(263, '2024-02-20', '11:00', NULL, 'disponivel', 1),
(264, '2024-02-20', '11:00', NULL, 'disponivel', 2),
(265, '2024-02-20', '11:00', NULL, 'disponivel', 3),
(266, '2024-02-20', '11:00', NULL, 'disponivel', 4),
(267, '2024-02-20', '11:00', NULL, 'disponivel', 5),
(268, '2024-02-20', '14:00', NULL, 'disponivel', 1),
(269, '2024-02-20', '14:00', NULL, 'disponivel', 2),
(270, '2024-02-20', '14:00', NULL, 'disponivel', 3),
(271, '2024-02-20', '14:00', NULL, 'disponivel', 4),
(272, '2024-02-20', '14:00', NULL, 'disponivel', 5),
(273, '2024-02-21', '08:00', NULL, 'disponivel', 1),
(274, '2024-02-21', '08:00', NULL, 'disponivel', 2),
(275, '2024-02-21', '08:00', NULL, 'disponivel', 3),
(276, '2024-02-21', '08:00', NULL, 'disponivel', 4),
(277, '2024-02-21', '08:00', NULL, 'disponivel', 5),
(278, '2024-02-21', '11:00', NULL, 'disponivel', 1),
(279, '2024-02-21', '11:00', NULL, 'disponivel', 2),
(280, '2024-02-21', '11:00', NULL, 'disponivel', 3),
(281, '2024-02-21', '11:00', NULL, 'disponivel', 4),
(282, '2024-02-21', '11:00', NULL, 'disponivel', 5),
(283, '2024-02-21', '14:00', NULL, 'disponivel', 1),
(284, '2024-02-21', '14:00', NULL, 'disponivel', 2),
(285, '2024-02-21', '14:00', NULL, 'disponivel', 3),
(286, '2024-02-21', '14:00', NULL, 'disponivel', 4),
(287, '2024-02-21', '14:00', NULL, 'disponivel', 5),
(288, '2024-02-22', '08:00', NULL, 'disponivel', 1),
(289, '2024-02-22', '08:00', NULL, 'disponivel', 2),
(290, '2024-02-22', '08:00', NULL, 'disponivel', 3),
(291, '2024-02-22', '08:00', NULL, 'disponivel', 4),
(292, '2024-02-22', '08:00', NULL, 'disponivel', 5),
(293, '2024-02-22', '11:00', NULL, 'disponivel', 1),
(294, '2024-02-22', '11:00', NULL, 'disponivel', 2),
(295, '2024-02-22', '11:00', NULL, 'disponivel', 3),
(296, '2024-02-22', '11:00', NULL, 'disponivel', 4),
(297, '2024-02-22', '11:00', NULL, 'disponivel', 5),
(298, '2024-02-22', '14:00', NULL, 'disponivel', 1),
(299, '2024-02-22', '14:00', NULL, 'disponivel', 2),
(300, '2024-02-22', '14:00', NULL, 'disponivel', 3),
(301, '2024-02-22', '14:00', NULL, 'disponivel', 4),
(302, '2024-02-22', '14:00', NULL, 'disponivel', 5),
(303, '2024-02-23', '08:00', NULL, 'disponivel', 1),
(304, '2024-02-23', '08:00', NULL, 'disponivel', 2),
(305, '2024-02-23', '08:00', NULL, 'disponivel', 3),
(306, '2024-02-23', '08:00', NULL, 'disponivel', 4),
(307, '2024-02-23', '08:00', NULL, 'disponivel', 5),
(308, '2024-02-23', '11:00', NULL, 'disponivel', 1),
(309, '2024-02-23', '11:00', NULL, 'disponivel', 2),
(310, '2024-02-23', '11:00', NULL, 'disponivel', 3),
(311, '2024-02-23', '11:00', NULL, 'disponivel', 4),
(312, '2024-02-23', '11:00', NULL, 'disponivel', 5),
(313, '2024-02-23', '14:00', NULL, 'disponivel', 1),
(314, '2024-02-23', '14:00', NULL, 'disponivel', 2),
(315, '2024-02-23', '14:00', NULL, 'disponivel', 3),
(316, '2024-02-23', '14:00', NULL, 'disponivel', 4),
(317, '2024-02-23', '14:00', NULL, 'disponivel', 5),
(318, '2024-02-27', '08:00', NULL, 'disponivel', 1),
(319, '2024-02-27', '08:00', NULL, 'disponivel', 2),
(320, '2024-02-27', '08:00', NULL, 'disponivel', 3),
(321, '2024-02-27', '08:00', NULL, 'disponivel', 4),
(322, '2024-02-27', '08:00', NULL, 'disponivel', 5),
(323, '2024-02-27', '11:00', NULL, 'disponivel', 1),
(324, '2024-02-27', '11:00', NULL, 'disponivel', 2),
(325, '2024-02-27', '11:00', NULL, 'disponivel', 3),
(326, '2024-02-27', '11:00', NULL, 'disponivel', 4),
(327, '2024-02-27', '11:00', NULL, 'disponivel', 5),
(328, '2024-02-27', '14:00', NULL, 'disponivel', 1),
(329, '2024-02-27', '14:00', NULL, 'disponivel', 2),
(330, '2024-02-27', '14:00', NULL, 'disponivel', 3),
(331, '2024-02-27', '14:00', NULL, 'disponivel', 4),
(332, '2024-02-27', '14:00', NULL, 'disponivel', 5),
(333, '2024-02-28', '08:00', NULL, 'cancelado', 1),
(334, '2024-02-28', '08:00', NULL, 'cancelado', 2),
(335, '2024-02-28', '08:00', NULL, 'cancelado', 3),
(336, '2024-02-28', '08:00', NULL, 'cancelado', 4),
(337, '2024-02-28', '08:00', NULL, 'cancelado', 5),
(338, '2024-02-28', '11:00', NULL, 'cancelado', 1),
(339, '2024-02-28', '11:00', NULL, 'cancelado', 2),
(340, '2024-02-28', '11:00', NULL, 'cancelado', 3),
(341, '2024-02-28', '11:00', NULL, 'cancelado', 4),
(342, '2024-02-28', '11:00', NULL, 'cancelado', 5),
(343, '2024-02-28', '14:00', NULL, 'cancelado', 1),
(344, '2024-02-28', '14:00', NULL, 'cancelado', 2),
(345, '2024-02-28', '14:00', NULL, 'cancelado', 3),
(346, '2024-02-28', '14:00', NULL, 'cancelado', 4),
(347, '2024-02-28', '14:00', NULL, 'cancelado', 5),
(348, '2024-02-29', '08:00', NULL, 'disponivel', 1),
(349, '2024-02-29', '08:00', NULL, 'disponivel', 2),
(350, '2024-02-29', '08:00', NULL, 'disponivel', 3),
(351, '2024-02-29', '08:00', NULL, 'disponivel', 4),
(352, '2024-02-29', '08:00', NULL, 'disponivel', 5),
(353, '2024-02-29', '11:00', NULL, 'disponivel', 1),
(354, '2024-02-29', '11:00', NULL, 'disponivel', 2),
(355, '2024-02-29', '11:00', NULL, 'disponivel', 3),
(356, '2024-02-29', '11:00', NULL, 'disponivel', 4),
(357, '2024-02-29', '11:00', NULL, 'disponivel', 5),
(358, '2024-02-29', '14:00', NULL, 'disponivel', 1),
(359, '2024-02-29', '14:00', NULL, 'disponivel', 2),
(360, '2024-02-29', '14:00', NULL, 'disponivel', 3),
(361, '2024-02-29', '14:00', NULL, 'disponivel', 4),
(362, '2024-02-29', '14:00', NULL, 'disponivel', 5),
(363, '2024-02-28', '08:00', NULL, 'cancelado', 1),
(364, '2024-02-28', '08:00', NULL, 'cancelado', 2),
(365, '2024-02-28', '08:00', NULL, 'cancelado', 3),
(366, '2024-02-28', '08:00', NULL, 'cancelado', 4),
(367, '2024-02-28', '08:00', NULL, 'cancelado', 5),
(368, '2024-02-28', '11:00', NULL, 'cancelado', 1),
(369, '2024-02-28', '11:00', NULL, 'cancelado', 2),
(370, '2024-02-28', '11:00', NULL, 'cancelado', 3),
(371, '2024-02-28', '11:00', NULL, 'cancelado', 4),
(372, '2024-02-28', '11:00', NULL, 'cancelado', 5),
(373, '2024-02-28', '14:00', NULL, 'cancelado', 1),
(374, '2024-02-28', '14:00', NULL, 'cancelado', 2),
(375, '2024-02-28', '14:00', NULL, 'cancelado', 3),
(376, '2024-02-28', '14:00', NULL, 'cancelado', 4),
(377, '2024-02-28', '14:00', NULL, 'cancelado', 5);

-- --------------------------------------------------------

--
-- Estrutura para tabela `agenda_servico`
--

CREATE TABLE `agenda_servico` (
  `idAgendaServico` int(11) NOT NULL,
  `fk_idOrdem` int(11) NOT NULL,
  `fk_idAgenda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `cadastro_produto`
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
-- Despejando dados para a tabela `cadastro_produto`
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
-- Estrutura para tabela `ordemservico`
--

CREATE TABLE `ordemservico` (
  `Id` int(11) NOT NULL,
  `dataCheck` date NOT NULL,
  `tipoManutencao` varchar(15) DEFAULT NULL,
  `kmPreventiva` varchar(500) DEFAULT NULL,
  `produtoCorretiva` varchar(1000) DEFAULT NULL,
  `statusOrdem` varchar(15) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `valorTotal` double(10,2) DEFAULT NULL,
  `placa` varchar(10) NOT NULL,
  `re` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `ordemservico`
--

INSERT INTO `ordemservico` (`Id`, `dataCheck`, `tipoManutencao`, `kmPreventiva`, `produtoCorretiva`, `statusOrdem`, `data`, `valorTotal`, `placa`, `re`) VALUES
(2, '0000-00-00', 'Corretiva', NULL, '1,2,3,', NULL, NULL, NULL, 'GHR157589', ''),
(3, '0000-00-00', 'Corretiva', NULL, '1,2,3,', NULL, NULL, NULL, 'GHR157589', ''),
(4, '0000-00-00', 'Corretiva', NULL, '1,2,3,4,9,12,', NULL, NULL, NULL, 'GHR157589', ''),
(5, '0000-00-00', 'Corretiva', NULL, '1,2,3,9,', NULL, NULL, NULL, 'GHR157589', ''),
(6, '0000-00-00', 'Corretiva', NULL, '1,2,4,12,', NULL, NULL, NULL, 'GHR157589', ''),
(7, '2024-03-10', 'Corretiva', NULL, '1,2,4,9,12,', NULL, NULL, NULL, 'GHR157589', ''),
(10, '0000-00-00', 'Corretiva', NULL, '', 'Fechado', NULL, NULL, 'GHR157589', ''),
(11, '0000-00-00', 'Corretiva', NULL, '1,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(12, '2024-03-10', 'Corretiva', NULL, '', 'Fechado', NULL, NULL, 'GHR157589', ''),
(13, '2024-03-10', 'Corretiva', NULL, '1,12,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(14, '2024-03-10', 'Corretiva', NULL, '1,12,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(15, '2024-03-10', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, '', ''),
(16, '2024-03-10', 'Corretiva', NULL, '1,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(17, '2024-03-10', 'Corretiva', NULL, '1,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(18, '2024-03-10', 'Corretiva', NULL, '1,3,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(19, '2024-03-10', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, '', ''),
(20, '2024-03-10', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, '', ''),
(21, '2024-03-10', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, '', ''),
(22, '2024-03-10', 'Corretiva', NULL, '1,3,9,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(23, '2024-03-10', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, '', ''),
(24, '2024-03-10', 'Corretiva', NULL, '1,3,9,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(25, '2024-03-10', 'Preventiva', '10000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(26, '2024-03-10', 'Corretiva', NULL, '1,3,9,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(27, '2024-03-10', 'Corretiva', NULL, '1,3,9,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(28, '2024-03-10', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, '', ''),
(29, '2024-03-10', 'Corretiva', NULL, '1,3,9,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(30, '2024-03-10', 'Preventiva', '', NULL, 'Aberto', NULL, NULL, '', ''),
(31, '2024-03-10', 'Corretiva', NULL, '1,3,4,9,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(32, '2024-03-10', 'Preventiva', '', NULL, 'Aberto', NULL, NULL, '', ''),
(33, '2024-03-10', 'Corretiva', NULL, '1,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(34, '2024-03-10', 'Preventiva', '', NULL, 'Aberto', NULL, NULL, '', ''),
(35, '2024-03-10', 'Preventiva', '', NULL, 'Aberto', NULL, NULL, '', ''),
(36, '2024-03-10', 'Corretiva', NULL, '4,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(37, '2024-03-10', 'Preventiva', '', NULL, 'Aberto', NULL, NULL, '', ''),
(38, '2024-03-10', 'Corretiva', NULL, '2,3,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(39, '2024-03-10', 'Corretiva', NULL, '2,3,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(40, '2024-03-10', 'Preventiva', '', NULL, 'Aberto', NULL, NULL, '', ''),
(41, '2024-03-10', 'Corretiva', NULL, '4,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(42, '2024-03-10', 'Preventiva', '', NULL, 'Aberto', NULL, NULL, '', ''),
(43, '2024-03-10', 'Corretiva', NULL, '1,2,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(44, '2024-03-10', 'Corretiva', NULL, '1,2,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(45, '2024-03-10', 'Preventiva', '', NULL, 'Aberto', NULL, NULL, '', ''),
(46, '2024-03-10', 'Corretiva', NULL, '1,2,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(47, '2024-03-10', 'Corretiva', NULL, '1,2,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(48, '2024-03-10', 'Corretiva', NULL, '1,2,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(49, '2024-03-16', 'Preventiva', '', NULL, 'Aberto', NULL, NULL, '', ''),
(50, '2024-03-16', 'Corretiva', NULL, '9,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(51, '2024-03-15', 'Preventiva', NULL, NULL, 'Aberto', NULL, NULL, '', ''),
(52, '2024-03-15', 'Corretiva', NULL, '1,2,3,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(53, '2024-03-15', 'Corretiva', NULL, '1,2,3,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(54, '2024-03-15', 'Corretiva', NULL, '1,2,3,4,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(55, '2024-03-15', 'Corretiva', NULL, '', 'Fechado', NULL, NULL, 'GHR157589', ''),
(56, '2024-03-15', 'Corretiva', NULL, '12,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(57, '2024-03-15', 'Corretiva', NULL, '', 'Fechado', NULL, NULL, 'GHR157589', ''),
(58, '2024-03-15', 'Corretiva', NULL, '1,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(59, '2024-03-15', 'Corretiva', NULL, '1,2,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(60, '2024-03-15', 'Corretiva', NULL, '1,2,3,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(61, '2024-03-16', 'Preventiva', '10000,2000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(62, '2024-03-15', 'Corretiva', NULL, '3,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(63, '2024-03-15', 'Corretiva', NULL, '1,3,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(64, '2024-03-15', 'Corretiva', NULL, '1,3,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(65, '2024-03-15', 'Corretiva', NULL, '1,3,4,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(66, '2024-03-16', 'Preventiva', '10000,20000,30000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(67, '2024-03-15', 'Corretiva', NULL, '1,12,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(68, '2024-03-15', 'Corretiva', NULL, '1,3,12,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(69, '2024-03-15', 'Corretiva', NULL, '1,3,12,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(70, '2024-03-15', 'Preventiva', '10000,20000,30000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(71, '2024-03-15', 'Corretiva', NULL, '1,3,4,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(72, '2024-03-15', 'Corretiva', NULL, '1,2,3,4,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(73, '2024-03-15', 'Preventiva', '10000,20000,30000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(74, '2024-03-15', 'Corretiva', NULL, '1,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(75, '2024-03-15', 'Preventiva', '', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(76, '2024-03-15', 'Corretiva', NULL, '4,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(77, '2024-03-15', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, 'GHR157589', ''),
(78, '2024-03-15', 'Corretiva', NULL, '', 'Fechado', NULL, NULL, 'GHR157589', ''),
(79, '2024-03-15', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, 'GHR157589', ''),
(80, '2024-03-15', 'Corretiva', NULL, '1,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(81, '2024-03-15', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, 'GHR157589', ''),
(82, '2024-03-15', 'Preventiva', '10000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(83, '2024-03-15', 'Corretiva', NULL, '2,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(84, '2024-03-15', 'Preventiva', '10000,20000,30000,40000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(85, '2024-03-15', 'Corretiva', NULL, '9,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(86, '2024-03-15', 'Preventiva', '10000,20000,30000,40000,50000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(87, '2024-03-15', 'Corretiva', NULL, '3,12,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(88, '2024-03-15', 'Preventiva', '', NULL, 'Finalizado', NULL, NULL, 'GHR157589', ''),
(89, '2024-03-15', 'Corretiva', NULL, '', 'Finalizado', NULL, NULL, 'GHR157589', ''),
(90, '2024-03-15', 'Preventiva', '10000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(91, '2024-03-15', 'Corretiva', NULL, '3,12,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(92, '2024-03-15', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(93, '2024-03-15', 'Corretiva', NULL, '1001,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(94, '2024-03-15', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(95, '2024-03-15', 'Corretiva', NULL, '1000,1001,1002,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(96, '2024-03-16', 'Preventiva', '10000,20000,30000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(97, '2024-03-16', 'Corretiva', NULL, '1000,1001,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(98, '2024-03-16', 'Preventiva', '', NULL, 'Finalizado', NULL, NULL, 'GHR157589', ''),
(99, '2024-03-16', 'Corretiva', NULL, '', 'Finalizado', NULL, NULL, 'GHR157589', ''),
(100, '2024-03-16', 'Preventiva', '10000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(101, '2024-03-16', 'Corretiva', NULL, '', 'Finalizado', NULL, NULL, 'GHR157589', ''),
(102, '2024-03-16', 'Preventiva', '10000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(103, '2024-03-16', 'Corretiva', NULL, '1003,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(104, '2024-03-16', 'Preventiva', '10000,20000,30000,40000,50000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(105, '2024-03-16', 'Preventiva', '10000,20000,30000,40000,50000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(106, '2024-03-16', 'Preventiva', '10000,20000,30000,40000,50000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(107, '2024-03-16', 'Corretiva', NULL, '1003,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(108, '2024-03-16', 'Preventiva', '10000,20000,30000,40000,50000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(109, '2024-03-16', 'Preventiva', '', NULL, 'Finalizado', NULL, NULL, 'GHR157589', ''),
(110, '2024-03-16', 'Corretiva', NULL, '', 'Finalizado', NULL, NULL, 'GHR157589', ''),
(111, '2024-03-16', 'Preventiva', '10000,20000,30000,40000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(112, '2024-03-16', 'Preventiva', '10000,20000,30000,40000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(113, '2024-03-16', 'Corretiva', NULL, '1003,1007,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(114, '2024-03-16', 'Preventiva', '10000,20000,30000,40000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(115, '2024-03-16', 'Preventiva', '10000,20000,30000,40000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(116, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(117, '2024-04-13', 'Corretiva', NULL, '1001,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(118, '0000-00-00', 'Corretiva', NULL, '1001', 'ABERTO', NULL, NULL, 'GHR157589', '0123'),
(119, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(120, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(121, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', ''),
(122, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', NULL),
(123, '2024-04-13', 'Corretiva', NULL, '1002,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(124, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', NULL),
(125, '2024-04-13', 'Corretiva', NULL, '1002,', 'Aberto', NULL, NULL, 'GHR157589', ''),
(126, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', NULL),
(127, '2024-04-13', 'Corretiva', NULL, '1002,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(128, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(129, '2024-04-13', 'Corretiva', NULL, '1002,1003,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(130, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(131, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(132, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(133, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(134, '2024-04-13', 'Corretiva', NULL, '1002,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(135, '2024-04-13', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(136, '2024-04-13', 'Corretiva', NULL, '1003,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(137, '2024-04-18', 'Preventiva', '10000,20000,30000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(138, '2024-04-18', 'Corretiva', NULL, '1003,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(139, '2024-04-18', 'Preventiva', '10000,20000,30000,40000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(140, '2024-04-18', 'Corretiva', NULL, '1003,1007,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(141, '2024-04-18', 'Preventiva', '10000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(142, '2024-04-18', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, '', '3316'),
(143, '2024-04-18', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(144, '2024-04-18', 'Corretiva', NULL, '1003,', 'Aberto', NULL, NULL, '', '3316'),
(145, '2024-04-18', 'Preventiva', '10000,20000,30000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(146, '2024-04-18', 'Corretiva', NULL, '1001,1002,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(147, '2024-04-18', 'Preventiva', '10000,20000,30000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(148, '2024-04-18', 'Corretiva', NULL, '1000,1001,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(149, '2024-04-18', 'Preventiva', '10000,20000,30000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(150, '2024-04-18', 'Corretiva', NULL, '1001,1002,1007,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(151, '2024-04-19', 'Preventiva', '10000,20000,30000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(152, '2024-04-19', 'Corretiva', NULL, '1000,1001,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(153, '2024-04-21', 'Preventiva', '10000,20000,30000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(154, '2024-04-21', 'Corretiva', NULL, '1001,1002,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(155, '2024-04-21', 'Preventiva', '10000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(156, '2024-04-21', 'Corretiva', NULL, '1002,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(157, '2024-04-21', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(158, '2024-04-21', 'Corretiva', NULL, '1000,1001,', 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(159, '2024-04-21', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(160, '2024-04-21', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, 'GHR157589', '3316'),
(161, '2024-04-21', 'Preventiva', '10000,20000', NULL, 'Aberto', NULL, NULL, 'GHR157589', '3316'),
(162, '2024-04-21', 'Corretiva', NULL, '1000,1001,1002,', 'Aberto', NULL, NULL, 'GHR157589', '3316');

-- --------------------------------------------------------

--
-- Estrutura para tabela `ordem_plano`
--

CREATE TABLE `ordem_plano` (
  `fk_idPlano` int(11) DEFAULT NULL,
  `fk_idOrdem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `ordem_plano`
--

INSERT INTO `ordem_plano` (`fk_idPlano`, `fk_idOrdem`) VALUES
(2, 147),
(4, 147),
(6, 147),
(2, 149),
(4, 149),
(6, 149),
(2, 151),
(4, 151),
(6, 151),
(2, 155),
(2, 157),
(4, 157),
(2, 159),
(4, 159),
(2, 161),
(4, 161);

-- --------------------------------------------------------

--
-- Estrutura para tabela `ordem_produto`
--

CREATE TABLE `ordem_produto` (
  `fk_IdOrdem` int(11) DEFAULT NULL,
  `fk_IdCodigo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `ordem_produto`
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
(162, 1000),
(162, 1001),
(162, 1002);

-- --------------------------------------------------------

--
-- Estrutura para tabela `planomanutencao`
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
-- Despejando dados para a tabela `planomanutencao`
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
-- Estrutura para tabela `plano_produto`
--

CREATE TABLE `plano_produto` (
  `fk_idPlano` int(11) NOT NULL,
  `fk_idCodigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `plano_produto`
--

INSERT INTO `plano_produto` (`fk_idPlano`, `fk_idCodigo`) VALUES
(2, 1000),
(2, 1007);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
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
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`re`, `nome`, `endereco`, `numero`, `bairro`, `cidade`, `estado`, `cep`, `perfil`, `email`, `telefone`, `cpf`, `senha`, `inativarUsuario`) VALUES
('0123456789', 'Vinicius Costa', 'Rua André Menck', NULL, NULL, NULL, '', '', '', 'vinicius.hque@gmail.com', '15998322750', '90090060021', 'casablanca', 0),
('101021', 'Vinicios Lemos ', 'Rua Caracas 120', NULL, NULL, NULL, '', '', '', 'vinicios_lemos@gmail.com', '30125859', '3852963147', '159159', 0),
('101035', 'TesteAtualizar', 'DFBGFDS', NULL, NULL, NULL, '', '', '', 'DFGBDFG@HOTMAIL.COM', 'DFBGFD', '3214567', '101035', 1),
('101040', 'Francine Garbimn', 'Av Afonso vergueiro 1235', NULL, NULL, NULL, '', '', '', 'fr_Garbim@hotmail.com', '3229147', '32229478', '101040', 0),
('101050', 'Fabiola', 'Rua Jose Paes motta n237', NULL, NULL, NULL, '', '', '', 'fabi_fabi@gmail.com', '32229147', '123456789', '101050', 0),
('1020', 'Francisco Mariano de Carvalho Neto', 'Rua São Paulo N952', NULL, NULL, NULL, '', '', '', 'mariano_neto@hotmail.com', '998152040', '34994352040', '101010', 0),
('102020', 'Priscila Latance', 'Rua Caracas 120', NULL, NULL, NULL, '', '', '', 'priscila.dev@hotmail.com', '998745689', '15145896733', 'hfdh', 0),
('1021', 'FRANCINE GARBIM', 'RUA DR. AMÉRICO FIGUEIREDO,7401 ', NULL, NULL, NULL, '', '', '', 'GARBIMSP@HOTMAIL.COM', '15988097980', '36129322844', '061286', 0),
('174596', 'Jenifer Ramos', 'Alameda Lirio', 78, 'Centro', 'Sorocaba', 'SP', '18759-140', 'Administrador', 'jenifer.ramos@gmail.com', '32147786', '7859', '7896', 0),
('3316', 'Mariana Xavier dos Santos Galindo', 'Davino Nogueira dos Santos, 160', NULL, NULL, NULL, '', '', '', 'mariana.xsg@hotmail.com', '(15)3292-2013', '36839451888', '150150', 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `veiculo`
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
-- Despejando dados para a tabela `veiculo`
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
-- Índices de tabela `agenda`
--
ALTER TABLE `agenda`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_placa` (`placa`);

--
-- Índices de tabela `agenda_servico`
--
ALTER TABLE `agenda_servico`
  ADD PRIMARY KEY (`idAgendaServico`),
  ADD KEY `Ordem` (`fk_idOrdem`),
  ADD KEY `Agenda` (`fk_idAgenda`);

--
-- Índices de tabela `cadastro_produto`
--
ALTER TABLE `cadastro_produto`
  ADD PRIMARY KEY (`idCodigo`);

--
-- Índices de tabela `ordemservico`
--
ALTER TABLE `ordemservico`
  ADD PRIMARY KEY (`Id`);

--
-- Índices de tabela `ordem_plano`
--
ALTER TABLE `ordem_plano`
  ADD KEY `ordem_Servico_Id` (`fk_idOrdem`),
  ADD KEY `plano_manutencao_idPlano` (`fk_idPlano`);

--
-- Índices de tabela `ordem_produto`
--
ALTER TABLE `ordem_produto`
  ADD KEY `ordem_Servico_Id` (`fk_IdOrdem`),
  ADD KEY `cadastro_Item_IdCodigo` (`fk_IdCodigo`);

--
-- Índices de tabela `planomanutencao`
--
ALTER TABLE `planomanutencao`
  ADD PRIMARY KEY (`idPlano`),
  ADD UNIQUE KEY `uniquePadrao` (`modelo`,`motor`,`kmManutencao`,`anoModelo`,`anoFabricacao`) USING BTREE;

--
-- Índices de tabela `plano_produto`
--
ALTER TABLE `plano_produto`
  ADD PRIMARY KEY (`fk_idPlano`,`fk_idCodigo`),
  ADD KEY `produto` (`fk_idCodigo`);

--
-- Índices de tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`re`);

--
-- Índices de tabela `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`placa`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `agenda`
--
ALTER TABLE `agenda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=378;

--
-- AUTO_INCREMENT de tabela `agenda_servico`
--
ALTER TABLE `agenda_servico`
  MODIFY `idAgendaServico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

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
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `agenda`
--
ALTER TABLE `agenda`
  ADD CONSTRAINT `fk_placa` FOREIGN KEY (`placa`) REFERENCES `veiculo` (`placa`);

--
-- Restrições para tabelas `agenda_servico`
--
ALTER TABLE `agenda_servico`
  ADD CONSTRAINT `Agenda` FOREIGN KEY (`fk_idAgenda`) REFERENCES `agenda` (`id`),
  ADD CONSTRAINT `Ordem` FOREIGN KEY (`fk_idOrdem`) REFERENCES `ordemservico` (`Id`);

--
-- Restrições para tabelas `ordem_plano`
--
ALTER TABLE `ordem_plano`
  ADD CONSTRAINT `ordem_plano_ibfk_1` FOREIGN KEY (`fk_idPlano`) REFERENCES `planomanutencao` (`idPlano`),
  ADD CONSTRAINT `ordem_plano_ibfk_2` FOREIGN KEY (`fk_idOrdem`) REFERENCES `ordemservico` (`Id`);

--
-- Restrições para tabelas `ordem_produto`
--
ALTER TABLE `ordem_produto`
  ADD CONSTRAINT `ordem_produto_ibfk_1` FOREIGN KEY (`fk_IdOrdem`) REFERENCES `ordemservico` (`Id`),
  ADD CONSTRAINT `ordem_produto_ibfk_2` FOREIGN KEY (`fk_IdCodigo`) REFERENCES `cadastro_produto` (`idCodigo`);

--
-- Restrições para tabelas `plano_produto`
--
ALTER TABLE `plano_produto`
  ADD CONSTRAINT `planomanut` FOREIGN KEY (`fk_idPlano`) REFERENCES `planomanutencao` (`idPlano`),
  ADD CONSTRAINT `produto` FOREIGN KEY (`fk_idCodigo`) REFERENCES `cadastro_produto` (`idCodigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
