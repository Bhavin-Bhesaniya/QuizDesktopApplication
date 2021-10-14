-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: finalquizapp
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `quizmarks`
--

DROP TABLE IF EXISTS `quizmarks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quizmarks` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `marks` int NOT NULL,
  `language` varchar(15) NOT NULL,
  `date` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quizmarks`
--

LOCK TABLES `quizmarks` WRITE;
/*!40000 ALTER TABLE `quizmarks` DISABLE KEYS */;
INSERT INTO `quizmarks` VALUES (1,0,0,'Python','2021-09-05 08:02:18'),(2,2,8,'Java','2021-09-05 08:40:15'),(3,2,9,'Python','2021-09-05 08:42:05'),(4,2,11,'Asp.net','2021-09-05 08:43:20'),(5,2,10,'C++','2021-09-05 08:44:43'),(6,2,7,'JavaScript','2021-09-05 08:45:58'),(7,2,5,'Andriod','2021-09-05 08:46:33'),(8,2,1,'Java','2021-09-05 08:59:30'),(9,0,2,'Python','2021-09-05 09:09:55'),(10,0,3,'Andriod','2021-09-05 09:10:04'),(11,0,2,'JavaScript','2021-09-05 09:10:10'),(12,0,1,'C++','2021-09-05 09:10:16'),(13,0,1,'Java','2021-09-05 09:10:23'),(14,0,1,'Java','2021-09-05 09:11:37'),(15,0,4,'Asp.net','2021-09-05 09:11:44'),(16,0,1,'JavaScript','2021-09-05 09:11:55'),(17,0,1,'Java','2021-09-05 09:22:35'),(18,1,1,'Java','2021-09-10 17:08:33'),(19,3,3,'Java','2021-09-18 07:07:28'),(20,1,1,'Java','2021-09-27 13:26:41'),(21,1,1,'JavaScript','2021-10-06 21:42:03'),(22,1,4,'Asp.net','2021-10-08 17:25:36'),(23,1,2,'JavaScript','2021-10-08 17:25:46'),(24,9,1,'C++','2021-10-08 17:36:03'),(25,9,4,'Asp.net','2021-10-08 17:36:10'),(26,9,2,'Python','2021-10-08 17:36:18'),(27,9,1,'Java','2021-10-08 17:36:25'),(28,9,2,'JavaScript','2021-10-08 17:36:33'),(29,9,3,'Andriod','2021-10-08 17:36:40'),(30,0,2,'JavaScript','2021-10-08 17:59:13'),(31,11,3,'Andriod','2021-10-09 20:25:11'),(32,1,1,'Java','2021-10-10 14:16:07'),(33,13,2,'Python','2021-10-11 09:57:51'),(34,14,2,'Python','2021-10-11 10:12:30'),(35,1,2,'Python','2021-10-12 18:01:57'),(36,1,2,'Python','2021-10-12 18:06:52'),(37,0,0,'null','2021-10-12 19:52:05'),(38,0,1,'Java','2021-10-12 19:52:31'),(39,0,2,'Python','2021-10-12 19:52:43'),(40,0,1,'C++','2021-10-12 19:52:51'),(41,0,1,'C++','2021-10-12 19:52:55'),(42,0,1,'C++','2021-10-12 19:53:02'),(43,0,2,'Asp.net','2021-10-12 19:53:08'),(44,0,4,'Asp.net','2021-10-12 19:53:11'),(45,0,1,'JavaScript','2021-10-12 19:53:20'),(46,0,3,'JavaScript','2021-10-12 19:53:22'),(47,0,1,'JavaScript','2021-10-12 19:53:30'),(48,0,0,'Java','2021-10-12 19:57:49'),(49,0,0,'Python','2021-10-12 19:57:56'),(50,0,0,'C++','2021-10-12 19:58:02'),(51,0,0,'Asp.net','2021-10-12 19:58:15'),(52,0,1,'JavaScript','2021-10-12 19:58:30'),(53,0,4,'Andriod','2021-10-12 19:59:03'),(54,0,10,'Java','2021-10-12 19:59:56'),(55,0,0,'Java','2021-10-12 21:18:27');
/*!40000 ALTER TABLE `quizmarks` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-14 21:06:30
