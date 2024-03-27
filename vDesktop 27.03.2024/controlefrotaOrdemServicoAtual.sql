-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21/03/2024 às 18:35
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
  `box` int(11) DEFAULT NULL,
  `OSPreventiva` int(11) DEFAULT NULL,
  `OSCorretiva` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `agenda`
--

INSERT INTO `agenda` (`id`, `data`, `horario`, `placa`, `status`, `box`, `OSPreventiva`, `OSCorretiva`) VALUES
(148, '2024-02-08', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(149, '2024-02-08', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(150, '2024-02-08', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(151, '2024-02-08', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(152, '2024-02-08', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(153, '2024-02-11', '08:00', 'DRG45798', 'agendado', 1, NULL, NULL),
(154, '2024-02-11', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(155, '2024-02-11', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(156, '2024-02-11', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(157, '2024-02-11', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(158, '2024-02-11', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(159, '2024-02-11', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(160, '2024-02-11', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(161, '2024-02-11', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(162, '2024-02-11', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(163, '2024-02-11', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(164, '2024-02-11', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(165, '2024-02-11', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(166, '2024-02-11', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(167, '2024-02-11', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(168, '2024-02-13', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(169, '2024-02-13', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(170, '2024-02-13', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(171, '2024-02-13', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(172, '2024-02-13', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(173, '2024-02-13', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(174, '2024-02-13', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(175, '2024-02-13', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(176, '2024-02-13', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(177, '2024-02-13', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(178, '2024-02-13', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(179, '2024-02-13', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(180, '2024-02-13', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(181, '2024-02-13', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(182, '2024-02-13', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(183, '2024-02-14', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(184, '2024-02-14', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(185, '2024-02-14', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(186, '2024-02-14', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(187, '2024-02-14', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(188, '2024-02-14', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(189, '2024-02-14', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(190, '2024-02-14', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(191, '2024-02-14', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(192, '2024-02-14', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(193, '2024-02-14', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(194, '2024-02-14', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(195, '2024-02-14', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(196, '2024-02-14', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(197, '2024-02-14', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(198, '2024-02-15', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(199, '2024-02-15', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(200, '2024-02-15', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(201, '2024-02-15', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(202, '2024-02-15', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(203, '2024-02-15', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(204, '2024-02-15', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(205, '2024-02-15', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(206, '2024-02-15', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(207, '2024-02-15', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(208, '2024-02-15', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(209, '2024-02-15', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(210, '2024-02-15', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(211, '2024-02-15', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(212, '2024-02-15', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(213, '2024-02-16', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(214, '2024-02-16', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(215, '2024-02-16', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(216, '2024-02-16', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(217, '2024-02-16', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(218, '2024-02-16', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(219, '2024-02-16', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(220, '2024-02-16', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(221, '2024-02-16', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(222, '2024-02-16', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(223, '2024-02-16', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(224, '2024-02-16', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(225, '2024-02-16', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(226, '2024-02-16', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(227, '2024-02-16', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(228, '2024-02-18', '08:00', 'DRG45798', 'agendado', 1, NULL, NULL),
(229, '2024-02-18', '08:00', 'DRG45798', 'agendado', 2, NULL, NULL),
(230, '2024-02-18', '08:00', 'DRG45798', 'agendado', 3, NULL, NULL),
(231, '2024-02-18', '08:00', 'DRG45798', 'agendado', 4, NULL, NULL),
(232, '2024-02-18', '08:00', 'DRG45798', 'agendado', 5, NULL, NULL),
(233, '2024-02-18', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(234, '2024-02-18', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(235, '2024-02-18', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(236, '2024-02-18', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(237, '2024-02-18', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(238, '2024-02-18', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(239, '2024-02-18', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(240, '2024-02-18', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(241, '2024-02-18', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(242, '2024-02-18', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(243, '2024-02-19', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(244, '2024-02-19', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(245, '2024-02-19', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(246, '2024-02-19', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(247, '2024-02-19', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(248, '2024-02-19', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(249, '2024-02-19', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(250, '2024-02-19', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(251, '2024-02-19', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(252, '2024-02-19', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(253, '2024-02-19', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(254, '2024-02-19', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(255, '2024-02-19', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(256, '2024-02-19', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(257, '2024-02-19', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(258, '2024-02-20', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(259, '2024-02-20', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(260, '2024-02-20', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(261, '2024-02-20', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(262, '2024-02-20', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(263, '2024-02-20', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(264, '2024-02-20', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(265, '2024-02-20', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(266, '2024-02-20', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(267, '2024-02-20', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(268, '2024-02-20', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(269, '2024-02-20', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(270, '2024-02-20', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(271, '2024-02-20', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(272, '2024-02-20', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(273, '2024-02-21', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(274, '2024-02-21', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(275, '2024-02-21', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(276, '2024-02-21', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(277, '2024-02-21', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(278, '2024-02-21', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(279, '2024-02-21', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(280, '2024-02-21', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(281, '2024-02-21', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(282, '2024-02-21', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(283, '2024-02-21', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(284, '2024-02-21', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(285, '2024-02-21', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(286, '2024-02-21', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(287, '2024-02-21', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(288, '2024-02-22', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(289, '2024-02-22', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(290, '2024-02-22', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(291, '2024-02-22', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(292, '2024-02-22', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(293, '2024-02-22', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(294, '2024-02-22', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(295, '2024-02-22', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(296, '2024-02-22', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(297, '2024-02-22', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(298, '2024-02-22', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(299, '2024-02-22', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(300, '2024-02-22', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(301, '2024-02-22', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(302, '2024-02-22', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(303, '2024-02-23', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(304, '2024-02-23', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(305, '2024-02-23', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(306, '2024-02-23', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(307, '2024-02-23', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(308, '2024-02-23', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(309, '2024-02-23', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(310, '2024-02-23', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(311, '2024-02-23', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(312, '2024-02-23', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(313, '2024-02-23', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(314, '2024-02-23', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(315, '2024-02-23', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(316, '2024-02-23', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(317, '2024-02-23', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(318, '2024-02-27', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(319, '2024-02-27', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(320, '2024-02-27', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(321, '2024-02-27', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(322, '2024-02-27', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(323, '2024-02-27', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(324, '2024-02-27', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(325, '2024-02-27', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(326, '2024-02-27', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(327, '2024-02-27', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(328, '2024-02-27', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(329, '2024-02-27', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(330, '2024-02-27', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(331, '2024-02-27', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(332, '2024-02-27', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(333, '2024-02-28', '08:00', NULL, 'cancelado', 1, NULL, NULL),
(334, '2024-02-28', '08:00', NULL, 'cancelado', 2, NULL, NULL),
(335, '2024-02-28', '08:00', NULL, 'cancelado', 3, NULL, NULL),
(336, '2024-02-28', '08:00', NULL, 'cancelado', 4, NULL, NULL),
(337, '2024-02-28', '08:00', NULL, 'cancelado', 5, NULL, NULL),
(338, '2024-02-28', '11:00', NULL, 'cancelado', 1, NULL, NULL),
(339, '2024-02-28', '11:00', NULL, 'cancelado', 2, NULL, NULL),
(340, '2024-02-28', '11:00', NULL, 'cancelado', 3, NULL, NULL),
(341, '2024-02-28', '11:00', NULL, 'cancelado', 4, NULL, NULL),
(342, '2024-02-28', '11:00', NULL, 'cancelado', 5, NULL, NULL),
(343, '2024-02-28', '14:00', NULL, 'cancelado', 1, NULL, NULL),
(344, '2024-02-28', '14:00', NULL, 'cancelado', 2, NULL, NULL),
(345, '2024-02-28', '14:00', NULL, 'cancelado', 3, NULL, NULL),
(346, '2024-02-28', '14:00', NULL, 'cancelado', 4, NULL, NULL),
(347, '2024-02-28', '14:00', NULL, 'cancelado', 5, NULL, NULL),
(348, '2024-02-29', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(349, '2024-02-29', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(350, '2024-02-29', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(351, '2024-02-29', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(352, '2024-02-29', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(353, '2024-02-29', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(354, '2024-02-29', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(355, '2024-02-29', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(356, '2024-02-29', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(357, '2024-02-29', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(358, '2024-02-29', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(359, '2024-02-29', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(360, '2024-02-29', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(361, '2024-02-29', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(362, '2024-02-29', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(363, '2024-02-28', '08:00', NULL, 'cancelado', 1, NULL, NULL),
(364, '2024-02-28', '08:00', NULL, 'cancelado', 2, NULL, NULL),
(365, '2024-02-28', '08:00', NULL, 'cancelado', 3, NULL, NULL),
(366, '2024-02-28', '08:00', NULL, 'cancelado', 4, NULL, NULL),
(367, '2024-02-28', '08:00', NULL, 'cancelado', 5, NULL, NULL),
(368, '2024-02-28', '11:00', NULL, 'cancelado', 1, NULL, NULL),
(369, '2024-02-28', '11:00', NULL, 'cancelado', 2, NULL, NULL),
(370, '2024-02-28', '11:00', NULL, 'cancelado', 3, NULL, NULL),
(371, '2024-02-28', '11:00', NULL, 'cancelado', 4, NULL, NULL),
(372, '2024-02-28', '11:00', NULL, 'cancelado', 5, NULL, NULL),
(373, '2024-02-28', '14:00', NULL, 'cancelado', 1, NULL, NULL),
(374, '2024-02-28', '14:00', NULL, 'cancelado', 2, NULL, NULL),
(375, '2024-02-28', '14:00', NULL, 'cancelado', 3, NULL, NULL),
(376, '2024-02-28', '14:00', NULL, 'cancelado', 4, NULL, NULL),
(377, '2024-02-28', '14:00', NULL, 'cancelado', 5, NULL, NULL),
(378, '2024-03-08', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(379, '2024-03-08', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(380, '2024-03-08', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(381, '2024-03-08', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(382, '2024-03-08', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(383, '2024-03-08', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(384, '2024-03-08', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(385, '2024-03-08', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(386, '2024-03-08', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(387, '2024-03-08', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(388, '2024-03-08', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(389, '2024-03-08', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(390, '2024-03-08', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(391, '2024-03-08', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(392, '2024-03-08', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(393, '2024-03-09', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(394, '2024-03-09', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(395, '2024-03-09', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(396, '2024-03-09', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(397, '2024-03-09', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(398, '2024-03-09', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(399, '2024-03-09', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(400, '2024-03-09', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(401, '2024-03-09', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(402, '2024-03-09', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(403, '2024-03-09', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(404, '2024-03-09', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(405, '2024-03-09', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(406, '2024-03-09', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(407, '2024-03-09', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(408, '2024-03-17', '08:00', NULL, 'cancelado', 1, NULL, NULL),
(409, '2024-03-17', '08:00', NULL, 'cancelado', 2, NULL, NULL),
(410, '2024-03-17', '08:00', NULL, 'cancelado', 3, NULL, NULL),
(411, '2024-03-17', '08:00', NULL, 'cancelado', 4, NULL, NULL),
(412, '2024-03-17', '08:00', NULL, 'cancelado', 5, NULL, NULL),
(413, '2024-03-17', '11:00', NULL, 'cancelado', 1, NULL, NULL),
(414, '2024-03-17', '11:00', NULL, 'cancelado', 2, NULL, NULL),
(415, '2024-03-17', '11:00', NULL, 'cancelado', 3, NULL, NULL),
(416, '2024-03-17', '11:00', NULL, 'cancelado', 4, NULL, NULL),
(417, '2024-03-17', '11:00', NULL, 'cancelado', 5, NULL, NULL),
(418, '2024-03-17', '14:00', NULL, 'cancelado', 1, NULL, NULL),
(419, '2024-03-17', '14:00', NULL, 'cancelado', 2, NULL, NULL),
(420, '2024-03-17', '14:00', NULL, 'cancelado', 3, NULL, NULL),
(421, '2024-03-17', '14:00', NULL, 'cancelado', 4, NULL, NULL),
(422, '2024-03-17', '14:00', NULL, 'cancelado', 5, NULL, NULL),
(423, '2024-03-18', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(424, '2024-03-18', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(425, '2024-03-18', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(426, '2024-03-18', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(427, '2024-03-18', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(428, '2024-03-18', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(429, '2024-03-18', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(430, '2024-03-18', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(431, '2024-03-18', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(432, '2024-03-18', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(433, '2024-03-18', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(434, '2024-03-18', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(435, '2024-03-18', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(436, '2024-03-18', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(437, '2024-03-18', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(438, '2024-03-19', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(439, '2024-03-19', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(440, '2024-03-19', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(441, '2024-03-19', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(442, '2024-03-19', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(443, '2024-03-19', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(444, '2024-03-19', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(445, '2024-03-19', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(446, '2024-03-19', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(447, '2024-03-19', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(448, '2024-03-19', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(449, '2024-03-19', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(450, '2024-03-19', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(451, '2024-03-19', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(452, '2024-03-19', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(453, '2024-03-20', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(454, '2024-03-20', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(455, '2024-03-20', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(456, '2024-03-20', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(457, '2024-03-20', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(458, '2024-03-20', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(459, '2024-03-20', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(460, '2024-03-20', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(461, '2024-03-20', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(462, '2024-03-20', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(463, '2024-03-20', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(464, '2024-03-20', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(465, '2024-03-20', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(466, '2024-03-20', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(467, '2024-03-20', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(468, '2024-03-21', '08:00', 'GHR157589 ', 'agendado', 1, 116, NULL),
(469, '2024-03-21', '08:00', 'GHR157589 ', 'agendado', 2, NULL, 117),
(470, '2024-03-21', '08:00', NULL, 'disponivel', 3, 0, 0),
(471, '2024-03-21', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(472, '2024-03-21', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(473, '2024-03-21', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(474, '2024-03-21', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(475, '2024-03-21', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(476, '2024-03-21', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(477, '2024-03-21', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(478, '2024-03-21', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(479, '2024-03-21', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(480, '2024-03-21', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(481, '2024-03-21', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(482, '2024-03-21', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(483, '2024-03-22', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(484, '2024-03-22', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(485, '2024-03-22', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(486, '2024-03-22', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(487, '2024-03-22', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(488, '2024-03-22', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(489, '2024-03-22', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(490, '2024-03-22', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(491, '2024-03-22', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(492, '2024-03-22', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(493, '2024-03-22', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(494, '2024-03-22', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(495, '2024-03-22', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(496, '2024-03-22', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(497, '2024-03-22', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(498, '2024-03-21', '08:00', 'GHR157589 ', 'agendado', 1, 116, NULL),
(499, '2024-03-21', '08:00', 'GHR157589 ', 'agendado', 2, NULL, 117),
(500, '2024-03-21', '08:00', NULL, 'disponivel', 3, 0, 0),
(501, '2024-03-21', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(502, '2024-03-21', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(503, '2024-03-21', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(504, '2024-03-21', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(505, '2024-03-21', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(506, '2024-03-21', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(507, '2024-03-21', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(508, '2024-03-21', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(509, '2024-03-21', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(510, '2024-03-21', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(511, '2024-03-21', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(512, '2024-03-21', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(513, '2024-03-24', '08:00', 'GHR157589 ', 'agendado', 1, 116, 117),
(514, '2024-03-24', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(515, '2024-03-24', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(516, '2024-03-24', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(517, '2024-03-24', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(518, '2024-03-24', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(519, '2024-03-24', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(520, '2024-03-24', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(521, '2024-03-24', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(522, '2024-03-24', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(523, '2024-03-24', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(524, '2024-03-24', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(525, '2024-03-24', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(526, '2024-03-24', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(527, '2024-03-24', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(528, '2024-03-25', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(529, '2024-03-25', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(530, '2024-03-25', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(531, '2024-03-25', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(532, '2024-03-25', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(533, '2024-03-25', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(534, '2024-03-25', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(535, '2024-03-25', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(536, '2024-03-25', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(537, '2024-03-25', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(538, '2024-03-25', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(539, '2024-03-25', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(540, '2024-03-25', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(541, '2024-03-25', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(542, '2024-03-25', '14:00', NULL, 'disponivel', 5, NULL, NULL),
(543, '2024-03-26', '08:00', NULL, 'cancelado', 1, NULL, NULL),
(544, '2024-03-26', '08:00', NULL, 'cancelado', 2, NULL, NULL),
(545, '2024-03-26', '08:00', NULL, 'cancelado', 3, NULL, NULL),
(546, '2024-03-26', '08:00', NULL, 'cancelado', 4, NULL, NULL),
(547, '2024-03-26', '08:00', NULL, 'cancelado', 5, NULL, NULL),
(548, '2024-03-26', '11:00', NULL, 'cancelado', 1, NULL, NULL),
(549, '2024-03-26', '11:00', NULL, 'cancelado', 2, NULL, NULL),
(550, '2024-03-26', '11:00', NULL, 'cancelado', 3, NULL, NULL),
(551, '2024-03-26', '11:00', NULL, 'cancelado', 4, NULL, NULL),
(552, '2024-03-26', '11:00', NULL, 'cancelado', 5, NULL, NULL),
(553, '2024-03-26', '14:00', NULL, 'cancelado', 1, NULL, NULL),
(554, '2024-03-26', '14:00', NULL, 'cancelado', 2, NULL, NULL),
(555, '2024-03-26', '14:00', NULL, 'cancelado', 3, NULL, NULL),
(556, '2024-03-26', '14:00', NULL, 'cancelado', 4, NULL, NULL),
(557, '2024-03-26', '14:00', NULL, 'cancelado', 5, NULL, NULL),
(558, '2024-03-26', '08:00', NULL, 'disponivel', 1, NULL, NULL),
(559, '2024-03-26', '08:00', NULL, 'disponivel', 2, NULL, NULL),
(560, '2024-03-26', '08:00', NULL, 'disponivel', 3, NULL, NULL),
(561, '2024-03-26', '08:00', NULL, 'disponivel', 4, NULL, NULL),
(562, '2024-03-26', '08:00', NULL, 'disponivel', 5, NULL, NULL),
(563, '2024-03-26', '11:00', NULL, 'disponivel', 1, NULL, NULL),
(564, '2024-03-26', '11:00', NULL, 'disponivel', 2, NULL, NULL),
(565, '2024-03-26', '11:00', NULL, 'disponivel', 3, NULL, NULL),
(566, '2024-03-26', '11:00', NULL, 'disponivel', 4, NULL, NULL),
(567, '2024-03-26', '11:00', NULL, 'disponivel', 5, NULL, NULL),
(568, '2024-03-26', '14:00', NULL, 'disponivel', 1, NULL, NULL),
(569, '2024-03-26', '14:00', NULL, 'disponivel', 2, NULL, NULL),
(570, '2024-03-26', '14:00', NULL, 'disponivel', 3, NULL, NULL),
(571, '2024-03-26', '14:00', NULL, 'disponivel', 4, NULL, NULL),
(572, '2024-03-26', '14:00', NULL, 'disponivel', 5, NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `cadastro_item`
--

CREATE TABLE `cadastro_item` (
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
-- Despejando dados para a tabela `cadastro_item`
--

INSERT INTO `cadastro_item` (`idCodigo`, `marca`, `modelo`, `cor`, `anoFabricacao`, `anoModelo`, `descricaoItem`, `valorUnitario`, `pecaUniversal`) VALUES
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
  `placa` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `ordemservico`
--

INSERT INTO `ordemservico` (`Id`, `dataCheck`, `tipoManutencao`, `kmPreventiva`, `produtoCorretiva`, `statusOrdem`, `data`, `valorTotal`, `placa`) VALUES
(116, '2024-03-17', 'Preventiva', '10000,20000,30000', NULL, 'Aberto', NULL, NULL, 'GHR157589'),
(117, '2024-03-17', 'Corretiva', NULL, '1000,1002,1003,', 'Aberto', NULL, NULL, 'GHR157589'),
(118, '2024-03-17', 'Preventiva', '', NULL, 'Fechado', NULL, NULL, 'GHR157589'),
(119, '2024-03-17', 'Corretiva', NULL, '', 'Fechado', NULL, NULL, 'GHR157589');

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
('Chevrolet', 'Celta', '1.0', 10000, 2023, 2023),
('Chevrolet', 'Celta', '1.0', 20000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 20000, 2023, 2023),
('Chevrolet', 'Celta', '1.0', 30000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 40000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 50000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 60000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 70000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 80000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 90000, 2022, 2023),
('Chevrolet', 'Celta', '1.0', 100000, 2022, 2023),
('Honda', 'Fit', '1.6', 10000, 2011, 2010),
('Honda', 'Fit', '1.6', 20000, 2011, 2010),
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
('Fit', '1.6', 10000, 2011, 2010, 1005),
('Fit', '1.6', 20000, 2011, 2010, 1005);

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
-- Índices de tabela `cadastro_item`
--
ALTER TABLE `cadastro_item`
  ADD PRIMARY KEY (`idCodigo`);

--
-- Índices de tabela `ordemservico`
--
ALTER TABLE `ordemservico`
  ADD PRIMARY KEY (`Id`);

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
  ADD KEY `fk_codigo` (`codigo_Item`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=573;

--
-- AUTO_INCREMENT de tabela `cadastro_item`
--
ALTER TABLE `cadastro_item`
  MODIFY `idCodigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1010;

--
-- AUTO_INCREMENT de tabela `ordemservico`
--
ALTER TABLE `ordemservico`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=120;

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
