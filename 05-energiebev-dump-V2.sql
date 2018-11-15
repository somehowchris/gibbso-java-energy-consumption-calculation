-- MySQL dump 10.13  Distrib 5.5.27, for Win32 (x86)
--
-- Host: localhost    Database: energiebev
-- ------------------------------------------------------
-- Server version	5.5.27

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
-- Table structure for table `enebev`
--
drop database if exists energiebev;
create database energiebev;
connect energiebev;

DROP TABLE IF EXISTS `enebev`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `enebev` (
  `jahr` int(11) NOT NULL,
  `energieform` int(11) NOT NULL,
  `betrag` decimal(12,2) DEFAULT NULL,
  `bevch` int(11) DEFAULT NULL,
  `bevaus` int(11) DEFAULT NULL,
  PRIMARY KEY (`jahr`,`energieform`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enebev`
--

LOCK TABLES `enebev` WRITE;
/*!40000 ALTER TABLE `enebev` DISABLE KEYS */;
INSERT INTO `enebev` VALUES (2000,1,2740.00,5779685,1424370),(2000,2,11200.00,5779685,1424370),(2000,3,8280.00,5779685,1424370),(2000,4,1380.00,5779685,1424370),(2000,5,30.00,5779685,1424370),(2000,6,140.00,5779685,1424370),(2000,7,220.00,5779685,1424370),(2001,1,2670.00,5808100,1447553),(2001,2,10540.00,5808100,1447553),(2001,3,8470.00,5808100,1447553),(2001,4,1700.00,5808100,1447553),(2001,5,20.00,5808100,1447553),(2001,6,150.00,5808100,1447553),(2001,7,250.00,5808100,1447553),(2002,1,2220.00,5836887,1476966),(2002,2,9870.00,5836887,1476966),(2002,3,8360.00,5836887,1476966),(2002,4,1550.00,5836887,1476966),(2002,5,20.00,5836887,1476966),(2002,6,150.00,5836887,1476966),(2002,7,250.00,5836887,1476966),(2003,1,2500.00,5863241,1500907),(2003,2,9920.00,5863241,1500907),(2003,3,8480.00,5863241,1500907),(2003,4,1380.00,5863241,1500907),(2003,5,20.00,5863241,1500907),(2003,6,160.00,5863241,1500907),(2003,7,270.00,5863241,1500907),(2004,1,2830.00,5890439,1524663),(2004,2,10520.00,5890439,1524663),(2004,3,8530.00,5890439,1524663),(2004,4,1550.00,5890439,1524663),(2004,5,20.00,5890439,1524663),(2004,6,160.00,5890439,1524663),(2004,7,270.00,5890439,1524663),(2005,1,3970.00,5917216,1541912),(2005,2,11870.00,5917216,1541912),(2005,3,8510.00,5917216,1541912),(2005,4,1740.00,5917216,1541912),(2005,5,20.00,5917216,1541912),(2005,6,170.00,5917216,1541912),(2005,7,300.00,5917216,1541912),(2006,1,4330.00,5954212,1554527),(2006,2,12850.00,5954212,1554527),(2006,3,8490.00,5954212,1554527),(2006,4,2040.00,5954212,1554527),(2006,5,30.00,5954212,1554527),(2006,6,180.00,5954212,1554527),(2006,7,300.00,5954212,1554527),(2007,1,3840.00,5991401,1602093),(2007,2,13460.00,5991401,1602093),(2007,3,8320.00,5991401,1602093),(2007,4,2140.00,5991401,1602093),(2007,5,50.00,5991401,1602093),(2007,6,190.00,5991401,1602093),(2007,7,300.00,5991401,1602093),(2008,1,5430.00,6032141,1669715),(2008,2,15400.00,6032141,1669715),(2008,3,8590.00,6032141,1669715),(2008,4,2590.00,6032141,1669715),(2008,5,50.00,6032141,1669715),(2008,6,220.00,6032141,1669715),(2008,7,360.00,6032141,1669715),(2009,1,3260.00,6071802,1714004),(2009,2,12190.00,6071802,1714004),(2009,3,9200.00,6071802,1714004),(2009,4,2320.00,6071802,1714004),(2009,5,50.00,6071802,1714004),(2009,6,230.00,6071802,1714004),(2009,7,330.00,6071802,1714004),(2010,1,4260.00,6103857,1766277),(2010,2,13260.00,6103857,1766277),(2010,3,9540.00,6103857,1766277),(2010,4,2400.00,6103857,1766277),(2010,5,40.00,6103857,1766277),(2010,6,250.00,6103857,1766277),(2010,7,350.00,6103857,1766277),(2011,1,3880.00,6138668,1815994),(2011,2,14700.00,6138668,1815994),(2011,3,9850.00,6138668,1815994),(2011,4,2310.00,6138668,1815994),(2011,5,40.00,6138668,1815994),(2011,6,230.00,6138668,1815994),(2011,7,230.00,6138668,1815994),(2012,1,4390.00,6169091,1869969),(2012,2,15680.00,6169091,1869969),(2012,3,9930.00,6169091,1869969),(2012,4,2690.00,6169091,1869969),(2012,5,40.00,6169091,1869969),(2012,6,260.00,6169091,1869969),(2012,7,260.00,6169091,1869969),(2013,1,4420.00,6202184,1937447),(2013,2,15140.00,6202184,1937447),(2013,3,9880.00,6202184,1937447),(2013,4,2840.00,6202184,1937447),(2013,5,40.00,6202184,1937447),(2013,6,290.00,6202184,1937447),(2013,7,250.00,6202184,1937447);
/*!40000 ALTER TABLE `enebev` ENABLE KEYS */;
UNLOCK TABLES;


-- Dump completed on 2015-05-22 11:26:15