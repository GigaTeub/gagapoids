-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 06 jan. 2020 à 12:51
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `bdpoids2`
--
CREATE DATABASE IF NOT EXISTS `bdpoids2` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `bdpoids2`;

-- --------------------------------------------------------

--
-- Structure de la table `liant`
--

DROP TABLE IF EXISTS `liant`;
CREATE TABLE IF NOT EXISTS `liant` (
  `idRecap_hebdo` int(11) NOT NULL,
  `idRecap_jour` int(11) NOT NULL,
  PRIMARY KEY (`idRecap_hebdo`,`idRecap_jour`),
  KEY `fk_Recap_hebdo_has_Recap_jour_Recap_jour1_idx` (`idRecap_jour`),
  KEY `fk_Recap_hebdo_has_Recap_jour_Recap_hebdo_idx` (`idRecap_hebdo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `recap_hebdo`
--

DROP TABLE IF EXISTS `recap_hebdo`;
CREATE TABLE IF NOT EXISTS `recap_hebdo` (
  `idRecap_hebdo` int(11) NOT NULL AUTO_INCREMENT,
  `intitule` varchar(200) NOT NULL,
  `reussite` tinyint(4) NOT NULL,
  `semaine` date NOT NULL,
  `idUser` int(11) NOT NULL,
  PRIMARY KEY (`idRecap_hebdo`),
  KEY `fk_User_Recap_hebdo1_idx` (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `recap_jour`
--

DROP TABLE IF EXISTS `recap_jour`;
CREATE TABLE IF NOT EXISTS `recap_jour` (
  `idRecap_jour` int(11) NOT NULL AUTO_INCREMENT,
  `objectif` varchar(200) NOT NULL,
  `reussite` tinyint(4) NOT NULL,
  `temps_exercice` time NOT NULL,
  `idUser` int(11) NOT NULL,
  PRIMARY KEY (`idRecap_jour`),
  KEY `fk_User_Recap_jour1_idx` (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `mdp` varchar(45) NOT NULL,
  `age` int(11) NOT NULL DEFAULT '0',
  `poids` decimal(10,0) NOT NULL DEFAULT '0',
  `taille` decimal(10,0) NOT NULL DEFAULT '0',
  `sexe` varchar(10) NOT NULL DEFAULT 'non',
  `deconnexion` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`idUser`, `nom`, `prenom`, `mail`, `mdp`, `age`, `poids`, `taille`, `sexe`, `deconnexion`) VALUES
(1, 'test1', 'test1', 'test1', 'test1', 0, '0', '0', 'non', '2020-01-06 13:50:55'),
(2, 'test2', 'test2', 'test2', 'test2', 2, '2', '2', 'oui', '2020-01-06 13:50:55');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `liant`
--
ALTER TABLE `liant`
  ADD CONSTRAINT `fk_Recap_hebdo_has_Recap_jour_Recap_hebdo` FOREIGN KEY (`idRecap_hebdo`) REFERENCES `recap_hebdo` (`idRecap_hebdo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Recap_hebdo_has_Recap_jour_Recap_jour1` FOREIGN KEY (`idRecap_jour`) REFERENCES `recap_jour` (`idRecap_jour`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `recap_hebdo`
--
ALTER TABLE `recap_hebdo`
  ADD CONSTRAINT `fk_User_Recap_hebdo1` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `recap_jour`
--
ALTER TABLE `recap_jour`
  ADD CONSTRAINT `fk_User_Recap_jour1` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
