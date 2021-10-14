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
-- Table structure for table `quizquestion`
--

DROP TABLE IF EXISTS `quizquestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quizquestion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `question` varchar(120) DEFAULT NULL,
  `opt1` varchar(120) DEFAULT NULL,
  `opt2` varchar(120) DEFAULT NULL,
  `opt3` varchar(120) DEFAULT NULL,
  `opt4` varchar(120) DEFAULT NULL,
  `answer` varchar(120) DEFAULT NULL,
  `language` tinytext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quizquestion`
--

LOCK TABLES `quizquestion` WRITE;
/*!40000 ALTER TABLE `quizquestion` DISABLE KEYS */;
INSERT INTO `quizquestion` VALUES (1,'Who Develop Java?','Dennis Ritchie','Bjarne Struostrup','James Goshling','None','James Goshling','Java'),(2,'Who Develop C++?','Bjarne Stroustrup','Dennis Ritchie','Both A & B','None','Bjarne Stroustrup','C++'),(4,'Extension of C++ file?','.cpp','.c','.java','.aspx','.cpp','C++'),(5,'Which statement used to print output in c++?','cout','cin','printf','print','cout','C++'),(6,'Which Are Java Script Keyword?','Var','Let','Const','All','All','JavaScript'),(7,'Java is a ___ language?','Scripting ','Programming','Both','None','Programming','Java'),(8,'Javascript is __?','Programming ','Scripting','Text','None','Scripting','JavaScript'),(10,'Which type of android os ?   ','Mobile based','Server based ','Pc based ','All','Mobile based','Andriod'),(11,'Android os written  in __ ?','Java','C++','C','All Above','All Above','Andriod'),(12,'Who develop android?','Open handset alliance','Microsoft','Unix','Oracle','Open handset alliance','Andriod'),(13,'Features of android ?','Ui','Multi-touch,-tasking','A or B','Both A & B','Both A & B','Andriod'),(14,'What is Asp.net?','Framework','Programming Language','Both','Script','Framework','Asp.net'),(15,'Who Develop Asp.net?','Google','Apache','Microsoft','Oracle','Microsoft','Asp.net'),(16,'Python code run based on__? ','Interpreter','Compiler ','both a & b','None','Interpreter','Python'),(17,'Who develop python?','Guido van roosum','Dennis ritchie','Bjarne stroustrup','Google','Guido van roosum','Python'),(18,'Which operator not found in javascript?','//','/','**','++','//','JavaScript'),(19,'What is a context in android ?','interface to store global information','Create new components','getContext() / getApplicationContext()','All Above','All Above','Andriod'),(20,'How many threads in asyncTask?','One','Two','Five','Three','One','Andriod'),(21,'Correct syntax for output  \"Hi\"  in Python?','p(\"Hi\")','echo(\"Hi\")','print(\"Hi\")','cout(\"Hi\")','print(\"Hi\")','Python'),(22,'How do you insert Comment in C++ code?','/','/* */','//','#','//','C++'),(23,'Which data type is used store text?','Txt','String','Str','myString','String','Java'),(24,'Which method Used convert string in uppecase?','tuc()','touppercase()','upper()','toUpperCase()','toUpperCase()','Java'),(25,'How to create a method in Java?','methodName()','methodName.','methodName[]','(methodname)','methodName()','Java'),(26,'What is AAPT?','Android Asset Providing Tool','Android app tools','Android powerd tools','None','Android Asset Providing Tool','Andriod'),(27,'What is ANR?','Application Not Recording','Application Not Responding','Both A & B','None','Both A & B','Andriod'),(28,'Is list data type supported by AIDL?','No','Yes','Maybe','None','Yes','Andriod'),(29,'Android in which under open source license?','Gnu gpl','Apache / Mit','Oss','Sourceforge','Apache / Mit','Andriod'),(30,'Which header file work with input and output?','#include<iostring>','#include<iostream>','#include<ostring>','#include<istring>','#include<iostream>','C++'),(31,'Which keyword is used to create a class in C++?','className','class','Class','class()','class','C++'),(32,'How to create object of MyClass?','class obj = new MyClass();','new obj = MyClass();','MyClass obj = new MyClass();','class myobj = new obj();','MyClass obj = new MyClass();','Java'),(33,'Which keyword used to access package in Java?','import','include','getlib','plugin','import','Java'),(34,'Java EE stands for __?','Java 2 Enterprise Edition','Java 2 enviroment edition','Both a & b','None ','Java 2 Enterprise Edition','Java'),(35,'An Excption is __','Runtime Error','Compiletime Error','Logical Error','None','Runtime Error','C++'),(36,'guest output :- main(){}','No output','Garbage value','Compile error','Runtime error','No output','C++'),(37,'Types of inheritance supported in C++ ?','Single','Multilevel/pal','hybrid,hierchical','All Above','All Above','C++'),(38,'What is Abstraction?','Hiding the internal implementation','Showing data','Hide unesscary data','None','Hiding the internal implementation','C++'),(39,'Is python a case sensitive ?','No','Yes','Never','None','Yes','Python'),(40,'Does Asp.net support mvc?','Yes','No','Not Availabel','None','Yes','Asp.net'),(41,'Which Thread asp.net support?','Multi-Threading','Single-Threading','Both a& b','none','Multi-Threading','Asp.net'),(42,'Which Type of control asp.net provide?','Client-side','Server-side','Both a & b','None','Both a & b','Asp.net'),(43,'Which control used for user input validation?','Range control','User control','Validation control','Data control','Validation control','Asp.net'),(44,'Which control provided by rich control?','Adrotator','File upload','Calender','All Above','All Above','Asp.net'),(45,'What is Thread?','execution in a program','small process','divide process','Both a & c','execution in a program','Java'),(46,'Javascript is __ - side programming language ','Server-side','Client-side','Both a & b','None','Both a & b','JavaScript'),(47,'Types Of Javascript boxl?','Alert','Prompt','Prompt','All Above','All Above','JavaScript'),(48,'Which catches all the values, except for the ones specified?','catch','label','try','default','default','JavaScript'),(49,'Are Java and JavaScript similar?','No','Yes','Maybe','None','No','JavaScript'),(50,'Which datatype not in javascript?','Number','Class','Object','Boolean','Class','JavaScript'),(51,'Which remove last elements from an array?','pop','push','splice','slice','pop','JavaScript'),(52,'Which datatype ordered, changeable?','List','Set','Dictonary','Tuple','List','Python'),(53,'Which control used to upload file in asp.net?','HtmlInputFile','FileUpload','Both a & b','Not any one','Both a & b','Asp.net'),(54,'Does python has built-in array?','No','Yes','Use array module','Both a & b','No','Python'),(55,'Which is not itrable object?','List','String','Dictonary','Array','Array','Python'),(56,'Which array method used to join two array?','concat','append','both a&b','shift','concat','JavaScript'),(57,'Which is error handling aspect in asp.net?','Tracing','Error handling','Debugging','All Above','All Above','Asp.net'),(58,'Which keyword used in exception handling in python?','try','catch','finally','All Above','All Above','Python'),(59,'Which language used to write asp.net application?','C#','Visualbasic.net','jscript','All Above','All Above','Asp.net'),(60,'Can we declare python with Multiple variable?','a,b,c','No','Yes','None','Yes','Python'),(62,'Which connector used in python for mysql database connection?','Odbc','mysql-connector-python','Jdbc','python-mysql','mysql-connector-python','Python'),(68,'JDBC Stands for?','Java Database Connection','Java Data Balance','Java Database Connectivity','Java Data Compiler','Java Database Connectivity','Java');
/*!40000 ALTER TABLE `quizquestion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-14 21:06:29
