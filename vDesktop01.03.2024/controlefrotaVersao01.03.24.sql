-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01/03/2024 às 16:16
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
-- Estrutura para tabela `cadastro_item`
--

CREATE TABLE `cadastro_item` (
  `idCodigo` int(10) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `cor` varchar(30) NOT NULL,
  `anoFabricacao` int(11) DEFAULT NULL,
  `anoModelo` int(11) DEFAULT NULL,
  `descricaoItem` varchar(80) NOT NULL,
  `valorUnitario` double(10,2) NOT NULL,
  `pecaUniversal` tinyint(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cadastro_item`
--

INSERT INTO `cadastro_item` (`idCodigo`, `marca`, `modelo`, `cor`, `anoFabricacao`, `anoModelo`, `descricaoItem`, `valorUnitario`, `pecaUniversal`) VALUES
(1, '', '', '', 0, 0, 'PNEU PIRELLI 195/60 R15', 350.50, 1),
(2, '', '', '', 0, 0, 'PNEU PIRELLI 185/65 R14', 270.99, 1),
(3, '', '', '', 0, 0, 'PNEU PIRELLI 175/70 R13', 230.25, 1),
(4, '', '', '', 0, 0, 'PNEU MICHELIN 205/55 R16', 399.99, 1),
(6, '', '', '', 0, 0, 'ZXCV', 234.98, 0),
(7, 'HONDA', 'FIT', 'PRETO', 2013, 2013, 'JODE DE VELAS', 149.99, 0),
(8, 'HONDA', 'FIT', 'PRATA', 2012, 2013, 'KIT PASTILHA E DISCO DE FREIO HONDA FIT 2013 ORIGINAL VARGA HONDA FIT ', 1800.99, 0),
(9, '', '', '', 0, 0, ' FLUIDO ÓLEO DE FREIO DOT 4 TRW VARGA 500M', 38.91, 1),
(10, 'HONDA', 'FIT', 'PRETO', 2010, 2013, ' PASTILHAS DE FREIO DIANTEIRA HONDA FIT ', 139.41, 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `planomanutencao`
--

CREATE TABLE `planomanutencao` (
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

INSERT INTO `planomanutencao` (`marca`, `modelo`, `motor`, `kmManutencao`, `anoModelo`, `anoFabricacao`) VALUES
('Chevrolet', 'Celta', '1.0', 10000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 20000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 30000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 40000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 50000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 60000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 70000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 80000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 90000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 100000, 2022, 2023),
('Hyundai', 'HB20', '1.6', 10000, 2023, 2023),
('Hyundai', 'HB20', '1.6', 20000, 2023, 2023),
('Renault', 'KWID', '1.0', 10000, 2023, 2023),
('Renault', 'KWID', '1.0', 20000, 2023, 2023),
('Renault', 'KWID', '1.0', 30000, 2023, 2023),
('Renault', 'KWID', '1.0', 40000, 2023, 2023),
('Renault', 'KWID', '1.0', 50000, 2023, 2023),
('Renault', 'KWID', '1.0', 60000, 2023, 2023),
('Renault', 'KWID', '1.0', 70000, 2023, 2023),
('Renault', 'KWID', '1.0', 80000, 2023, 2023),
('Renault', 'KWID', '1.0', 90000, 2023, 2023),
('Renault', 'KWID', '1.0', 100000, 2023, 2023);

-- --------------------------------------------------------

--
-- Estrutura para tabela `plano_item`
--

CREATE TABLE `plano_item` (
  `modelo_kit` varchar(100) NOT NULL,
  `motor_kit` varchar(100) NOT NULL,
  `km_kit` int(11) NOT NULL,
  `anoModelo_kit` int(11) NOT NULL,
  `anoFabricacao_kit` int(11) NOT NULL,
  `codigo_Item` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `plano_item`
--

INSERT INTO `plano_item` (`modelo_kit`, `motor_kit`, `km_kit`, `anoModelo_kit`, `anoFabricacao_kit`, `codigo_Item`) VALUES
('Celta', '1.0', 10000, 2022, 2023, 1),
('Celta', '1.0', 10000, 2022, 2023, 2),
('Celta', '1.0', 10000, 2022, 2023, 3);

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
('DRE1678', 'Honda', '1.6', 'Preto', 'Gasolina', '2 portas', 2010, 2011, 0, '1354536843', '54326356', '232103102', '1.6', 0, '2024-02-10', '2024-01-10', '2026-01-10', 0),
('DRG45798', 'Renault', '1.0', 'Branco ', 'Flex', '2 portas', 2023, 2023, 5000, '123113164', '15894611941', '6511961619', '1.0', 0, '2023-12-10', '2022-12-10', '2025-12-10', NULL),
('EGY15616', 'Hyundai', 'HB20', 'Prata', 'Flex', '4 portas', 2023, 2023, 10000, '131616606', '1231166494', '1316416916', '1.6', 0, '2023-06-12', '2023-06-10', '2025-06-12', NULL),
('FAZG765', 'HONDA', 'LXL', 'PRETO', 'GASOLINA', '2 portas', 2022, 2023, 110, 'KJHBASDV', '1234234234', 'BWQFE7QD8723U867TAVG', '1.4', 0, '2024-01-21', '2024-01-21', '2025-01-21', NULL),
('FRD15789', 'Chevrolet', 'Celta', 'Prata', 'Flex', '4 portas', 2022, 2023, 0, '758964532', '15946216494', '156161641FD', '1.0', 0, '2024-01-13', '2024-01-10', '2026-01-13', NULL),
('GHR157589 ', 'Chevrolet', 'Celta', 'Prata', 'Flex', '2 portas', 2023, 2023, 10000, '1256461', '16161063', '2316916196', '1.0', 0, '2023-08-20', '2023-08-10', '2025-08-20', NULL),
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
-- Índices de tabela `cadastro_item`
--
ALTER TABLE `cadastro_item`
  ADD PRIMARY KEY (`idCodigo`);

--
-- Índices de tabela `planomanutencao`
--
ALTER TABLE `planomanutencao`
  ADD PRIMARY KEY (`modelo`,`motor`,`kmManutencao`,`anoModelo`,`anoFabricacao`);

--
-- Índices de tabela `plano_item`
--
ALTER TABLE `plano_item`
  ADD PRIMARY KEY (`modelo_kit`,`motor_kit`,`km_kit`,`anoModelo_kit`,`anoFabricacao_kit`,`codigo_Item`),
  ADD UNIQUE KEY `fk` (`modelo_kit`,`motor_kit`,`km_kit`,`anoModelo_kit`,`anoFabricacao_kit`,`codigo_Item`),
  ADD KEY `codigo_Item` (`codigo_Item`);

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
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `agenda`
--
ALTER TABLE `agenda`
  ADD CONSTRAINT `fk_placa` FOREIGN KEY (`placa`) REFERENCES `veiculo` (`placa`);

--
-- Restrições para tabelas `plano_item`
--
ALTER TABLE `plano_item`
  ADD CONSTRAINT `fk_codigo` FOREIGN KEY (`codigo_Item`) REFERENCES `cadastro_item` (`idCodigo`),
  ADD CONSTRAINT `fk_modelo` FOREIGN KEY (`modelo_kit`) REFERENCES `planomanutencao` (`modelo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
