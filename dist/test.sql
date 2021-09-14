-- MySQL dump 10.13  Distrib 5.1.33, for Win32 (ia32)
--
-- Host: 127.0.0.1    Database: payroll
-- ------------------------------------------------------
-- Server version	5.1.33-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `addition`
--

DROP TABLE IF EXISTS `addition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `addition` (
  `id` char(20) NOT NULL DEFAULT '',
  `fname` char(20) DEFAULT NULL,
  `lname` char(20) DEFAULT NULL,
  `gender` char(20) DEFAULT NULL,
  `email` char(50) DEFAULT NULL,
  `contact` char(15) DEFAULT NULL,
  `doj` date DEFAULT NULL,
  `designation` char(20) DEFAULT NULL,
  `salary` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addition`
--

LOCK TABLES `addition` WRITE;
/*!40000 ALTER TABLE `addition` DISABLE KEYS */;
INSERT INTO `addition` VALUES ('A_26','Amit','Singh','Male',' 00001234567890@GMAIL.COM','9199778402','2018-06-23','Peo',3000),('R_117','Ravi','Singh','Male',' rokravi117@gmail.com','9199778402','2018-05-26','Head Manager',700000);
/*!40000 ALTER TABLE `addition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `allowance`
--

DROP TABLE IF EXISTS `allowance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `allowance` (
  `id` varchar(20) DEFAULT NULL,
  `dates` char(50) DEFAULT NULL,
  `overtime` char(50) DEFAULT NULL,
  `medical` char(50) DEFAULT NULL,
  `lunch` char(50) DEFAULT NULL,
  `bonus` char(50) DEFAULT NULL,
  `total` char(50) DEFAULT NULL,
  KEY `id` (`id`),
  CONSTRAINT `allowance_ibfk_1` FOREIGN KEY (`id`) REFERENCES `addition` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `allowance`
--

LOCK TABLES `allowance` WRITE;
/*!40000 ALTER TABLE `allowance` DISABLE KEYS */;
/*!40000 ALTER TABLE `allowance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `UserName` char(50) DEFAULT NULL,
  `Password` char(50) DEFAULT NULL,
  `Question` char(100) DEFAULT NULL,
  `Question_Pass` char(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('rokravi','ravi117','favorite_game','cricket');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `updatesalary`
--

DROP TABLE IF EXISTS `updatesalary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `updatesalary` (
  `current_salary` char(20) DEFAULT NULL,
  `new_salary` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `updatesalary`
--

LOCK TABLES `updatesalary` WRITE;
/*!40000 ALTER TABLE `updatesalary` DISABLE KEYS */;
/*!40000 ALTER TABLE `updatesalary` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-19  8:19:10
