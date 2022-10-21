-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:3306
-- Généré le : ven. 23 sep. 2022 à 13:11
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `projetsoa`
--

-- --------------------------------------------------------

--
-- Structure de la table `bacheliers`
--

CREATE TABLE `bacheliers` (
  `id` int(11) NOT NULL,
  `cin` varchar(200) NOT NULL,
  `numetud` varchar(200) NOT NULL,
  `notemath` double NOT NULL,
  `notephys` double NOT NULL,
  `notearabe` double NOT NULL,
  `noteanglais` double NOT NULL,
  `nomprenom` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bacheliers`
--

INSERT INTO `bacheliers` (`id`, `cin`, `numetud`, `notemath`, `notephys`, `notearabe`, `noteanglais`, `nomprenom`) VALUES
(1, 'sh2222', 'b2222', 12, 12, 14, 16, 'fatima'),
(2, 'sh4444', 'b4444', 14, 16, 17, 16, 'wijdane'),
(3, 'sh1111', 'b1111', 19, 16, 17, 19, 'mustapha'),
(4, 'sh7777', 'b7777', 15, 16, 17, 14, 'ilyas');

-- --------------------------------------------------------

--
-- Structure de la table `resultat`
--

CREATE TABLE `resultat` (
  `id` int(11) NOT NULL,
  `cin` varchar(250) NOT NULL,
  `cne` varchar(200) NOT NULL,
  `nomprenom` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `resultat`
--

INSERT INTO `resultat` (`id`, `cin`, `cne`, `nomprenom`) VALUES
(8, 'sh4444', 'b4444', 'wijdane'),
(9, 'sh4444', 'b4444', 'wijdane'),
(10, 'sh4444', 'b4444', 'wijdane'),
(11, 'sh1111', 'b1111', 'mustapha'),
(12, 'sh4444', 'b4444', 'wijdane'),
(13, 'sh4444', 'b4444', 'wijdane');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `bacheliers`
--
ALTER TABLE `bacheliers`
  ADD PRIMARY KEY (`id`,`cin`,`numetud`);

--
-- Index pour la table `resultat`
--
ALTER TABLE `resultat`
  ADD PRIMARY KEY (`id`,`cin`,`cne`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `bacheliers`
--
ALTER TABLE `bacheliers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `resultat`
--
ALTER TABLE `resultat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
