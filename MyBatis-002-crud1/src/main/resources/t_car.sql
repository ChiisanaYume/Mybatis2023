-- MySQL dump 10.13  Distrib 5.5.36, for Win32 (x86)
--
-- Host: localhost    Database: faintdream
-- ------------------------------------------------------
-- Server version	5.5.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT = @@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS = @@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION = @@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE = @@TIME_ZONE */;
/*!40103 SET TIME_ZONE = '+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;

--
-- Table structure for table `t_car`
--

DROP TABLE IF EXISTS `t_car`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE t_car
(
    id           bigint(20)   NOT NULL AUTO_INCREMENT COMMENT '自然主键，和业务没有关系,自增',
    car_num      varchar(255) NOT NULL COMMENT '汽车编号',
    brand        varchar(255)   DEFAULT NULL COMMENT '汽车品牌',
    guide_price  decimal(10, 2) DEFAULT NULL COMMENT '价格',
    produce_time date           DEFAULT NULL COMMENT '生产日期',
    car_type     varchar(255)   DEFAULT NULL COMMENT '汽车类型；燃油车，电动车，氢能源',
    PRIMARY KEY (id),
    UNIQUE KEY id (id),
    UNIQUE KEY car_num (car_num)
) ENGINE = InnoDB
  AUTO_INCREMENT = 10
  DEFAULT CHARSET = utf8 COMMENT ='车辆信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_car`
--

LOCK TABLES `t_car` WRITE;
/*!40000 ALTER TABLE `t_car`
    DISABLE KEYS */;
INSERT INTO `t_car`
VALUES (1, '1001', '宝马520Li', 30.00, '2023-01-01', '燃油车'),
       (2, '1002', '福特福睿斯', 10.00, '2022-10-01', '燃油车'),
       (3, '1003', '比亚迪秦DMI', 15.00, '2022-10-01', '电动车'),
       (4, '1004', '丰田霸道', 30.00, '2001-10-11', '燃油车'),
       (5, '1005', '大众迈腾', 23.00, '2005-10-11', '燃油车');
/*!40000 ALTER TABLE `t_car`
    ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE = @OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT = @OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS = @OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION = @OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;

-- Dump completed on 2023-05-04 21:54:56
