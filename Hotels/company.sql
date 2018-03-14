-- MySQL dump 10.13  Distrib 5.7.20, for Linux (x86_64)
--
-- Host: localhost    Database: company
-- ------------------------------------------------------
-- Server version	5.7.20-0ubuntu0.17.10.1

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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (6,'John Aces',32),(7,'Ian Young',29),(8,'Mary Rose',44),(9,'John Aces',32),(10,'Ian Young',29),(11,'Mary Rose',44),(12,'John Aces',32),(13,'Ian Young',29),(14,'Mary Rose',44),(15,'John Aces',32),(17,'Mary Rose',44),(18,'John Aces',32),(19,'Ian Young',29),(20,'Mary Rose',44),(21,'John Aces',32),(22,'Ian Young',29);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guest`
--

DROP TABLE IF EXISTS `guest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guest` (
  `trans_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_in` date DEFAULT NULL,
  `c_out` date DEFAULT NULL,
  `pax` int(11) DEFAULT NULL,
  `rooms` int(11) DEFAULT NULL,
  `guest` varchar(30) DEFAULT NULL,
  `total_price` double DEFAULT NULL,
  PRIMARY KEY (`trans_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guest`
--

LOCK TABLES `guest` WRITE;
/*!40000 ALTER TABLE `guest` DISABLE KEYS */;
INSERT INTO `guest` VALUES (1,'2018-02-10','2018-02-12',4,2,'DAKSHAY',22),(2,'2018-02-10','2018-02-12',4,2,'DAKSHAY',22),(3,'2018-02-10','2018-02-12',4,2,'DAKSHAY',22),(4,'2018-02-10','2018-02-12',4,2,'DAKSHAY',22),(5,'2018-02-10','2018-02-12',4,2,'DAKSHAY',22),(6,'2018-02-10','2018-02-12',4,2,'DAKSHAY',22),(7,'2018-02-10','2018-02-12',4,2,'DAKSHAY',22),(8,'2018-02-10','2018-02-12',4,2,'DAKSHAY',22),(9,'2018-02-10','2018-02-12',4,2,'DAKSHAY',22),(10,'2018-02-03','2018-08-08',5,5,'KK',75.3);
/*!40000 ALTER TABLE `guest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roomavailability`
--

DROP TABLE IF EXISTS `roomavailability`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roomavailability` (
  `sno` int(11) DEFAULT NULL,
  `c_in` date DEFAULT NULL,
  `c_out` date DEFAULT NULL,
  `standard` int(11) DEFAULT NULL,
  `deluxe` int(11) DEFAULT NULL,
  `super_deluxe` int(11) DEFAULT NULL,
  `suite` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roomavailability`
--

LOCK TABLES `roomavailability` WRITE;
/*!40000 ALTER TABLE `roomavailability` DISABLE KEYS */;
INSERT INTO `roomavailability` VALUES (NULL,'2018-02-07','2018-02-08',10,10,5,5),(NULL,'2018-02-08','2018-02-09',10,10,5,5),(NULL,'2018-02-09','2018-02-10',10,10,5,5),(NULL,'2018-02-10','2018-02-11',10,10,5,5),(NULL,'2018-02-11','2018-02-12',10,10,5,5),(NULL,'2018-02-12','2018-02-13',10,10,5,5),(NULL,'2018-02-13','2018-02-14',10,10,5,5);
/*!40000 ALTER TABLE `roomavailability` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-08 18:30:12
