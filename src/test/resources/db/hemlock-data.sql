-- MySQL dump 10.14  Distrib 5.5.33a-MariaDB, for Win64 (x86)
--
-- Host: localhost    Database: hemlock
-- ------------------------------------------------------
-- Server version	5.5.33a-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `hemlock_role`
--

LOCK TABLES `hemlock_role` WRITE;
/*!40000 ALTER TABLE `hemlock_role` DISABLE KEYS */;
INSERT INTO `hemlock_role` (`role_name`, `role_description`) VALUES ('ROLE_ADMIN','Administrator');
INSERT INTO `hemlock_role` (`role_name`, `role_description`) VALUES ('ROLE_USER','User');
/*!40000 ALTER TABLE `hemlock_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `hemlock_user`
--

LOCK TABLES `hemlock_user` WRITE;
/*!40000 ALTER TABLE `hemlock_user` DISABLE KEYS */;
INSERT INTO `hemlock_user` (`username`, `password`, `name`) VALUES ('admin','$2a$10$DCD3My32T23h0lLSXHRzA.RG4/TrIEUfBHKF6hBQfUmXJaiZxDQby','Administrator');
INSERT INTO `hemlock_user` (`username`, `password`, `name`) VALUES ('user01','$2a$10$cLDgv.Sis/mmHQz1.fv6cOVAkmqe3i14J5bP7O8OCJhjCOKKCmtNG','User 01');
/*!40000 ALTER TABLE `hemlock_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `hemlock_user_role`
--

LOCK TABLES `hemlock_user_role` WRITE;
/*!40000 ALTER TABLE `hemlock_user_role` DISABLE KEYS */;
INSERT INTO `hemlock_user_role` (`id`, `role_name`, `username`) VALUES (1,'ROLE_ADMIN','admin');
INSERT INTO `hemlock_user_role` (`id`, `role_name`, `username`) VALUES (2,'ROLE_USER','user01');
/*!40000 ALTER TABLE `hemlock_user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

