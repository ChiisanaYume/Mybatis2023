-- MySQL dump 10.13  Distrib 5.5.36, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: genshin
-- ------------------------------------------------------
-- Server version	5.5.36

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
-- Table structure for table `t_elemental_type`
--

DROP TABLE IF EXISTS `t_elemental_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_elemental_type` (
  `no` int(2) NOT NULL DEFAULT '0',
  `type` varchar(255) NOT NULL COMMENT '元素类型;神之眼(神之心)类型',
  `type_c` varchar(255) NOT NULL COMMENT '元素类型;神之眼(神之心)类型(中文)',
  PRIMARY KEY (`no`),
  UNIQUE KEY `tno` (`no`),
  UNIQUE KEY `type` (`type`),
  UNIQUE KEY `type_c` (`type_c`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='元素类型/神之眼属性表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_elemental_type`
--

LOCK TABLES `t_elemental_type` WRITE;
/*!40000 ALTER TABLE `t_elemental_type` DISABLE KEYS */;
INSERT INTO `t_elemental_type` VALUES (0,'nothing','无'),(1,'Anemo','风'),(2,'Geo','岩'),(3,'Electro','雷'),(4,'Dendro','草'),(5,'Hydro','水'),(6,'Pyro','火'),(7,'Cryo','冰');
/*!40000 ALTER TABLE `t_elemental_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_genshin_region`
--

DROP TABLE IF EXISTS `t_genshin_region`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_genshin_region` (
  `no` int(2) NOT NULL DEFAULT '0',
  `region` varchar(255) NOT NULL COMMENT '地区',
  `region_c` varchar(255) NOT NULL COMMENT '地区(中文)',
  PRIMARY KEY (`no`),
  UNIQUE KEY `rno` (`no`),
  UNIQUE KEY `region` (`region`),
  UNIQUE KEY `region_c` (`region_c`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='原神地区(七国)表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_genshin_region`
--

LOCK TABLES `t_genshin_region` WRITE;
/*!40000 ALTER TABLE `t_genshin_region` DISABLE KEYS */;
INSERT INTO `t_genshin_region` VALUES (1,'Mondstadt','蒙德'),(2,'Liyue','璃月'),(3,'Inazuma','稻妻'),(4,'Sumeru','须弥'),(5,'Fontaine','枫丹'),(6,'Natlan','纳塔'),(7,'Snezhnaya','至冬');
/*!40000 ALTER TABLE `t_genshin_region` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_genshin_role`
--

DROP TABLE IF EXISTS `t_genshin_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_genshin_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键;自然标识',
  `name` varchar(255) NOT NULL COMMENT '角色名',
  `name_c` varchar(255) DEFAULT NULL COMMENT '角色名(中文)',
  `new_column` varchar(50) NOT NULL DEFAULT 'default_value',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  UNIQUE KEY `name_c` (`name_c`)
) ENGINE=InnoDB AUTO_INCREMENT=90 DEFAULT CHARSET=utf8 COMMENT='角色基础信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_genshin_role`
--

LOCK TABLES `t_genshin_role` WRITE;
/*!40000 ALTER TABLE `t_genshin_role` DISABLE KEYS */;
INSERT INTO `t_genshin_role` VALUES (4,'Yaoyao','瑶瑶','default_value'),(5,'Klee','可莉','default_value'),(7,'Nahida','纳西妲','default_value'),(8,'Amber','安柏','default_value'),(9,'Barbara','芭芭拉','default_value'),(10,'Hu Tao','胡桃','default_value'),(11,'Mona','莫娜','default_value'),(13,'Jean','琴','default_value'),(14,'Keqing','刻晴','default_value'),(15,'Kirara','琦良良','default_value'),(16,'Diona','迪奥娜','default_value'),(17,'Zhongli','钟离','default_value'),(18,'Xiao','魈','default_value'),(19,'Yelan','夜兰','default_value'),(20,'Xiangling','香菱','default_value'),(21,'Baizhu','白术','default_value'),(22,'Chongyun','重云','default_value'),(23,'Xinyan','辛焱','default_value'),(24,'Xingqiu','行秋','default_value'),(25,'Shenhe','申鹤','default_value'),(26,'Ganyu','甘雨','default_value'),(27,'Yanfei','烟绯','default_value'),(28,'Beidou','北斗','default_value'),(29,'Ningguan','凝光','default_value'),(30,'Yun Jin','云堇','default_value'),(31,'Qiqi','七七','default_value'),(32,'Mika','米卡','default_value'),(33,'Albedo','阿贝多','default_value'),(34,'Diluc','迪卢克','default_value'),(35,'Noelle','诺艾尔','default_value'),(36,'Fishl','菲谢尔','default_value'),(37,'Rosaria','罗莎莉亚','default_value'),(38,'Sucrose','砂糖','default_value'),(39,'Bennett','班尼特','default_value'),(40,'Kaeya','凯亚','default_value'),(41,'Eula','优菈','default_value'),(42,'Lisa','丽莎','default_value'),(43,'Venti','温迪','default_value'),(46,'Shikanoin Heizou','鹿目院平藏','default_value'),(47,'Kuki Shinobu','久岐忍','default_value'),(48,'Raiden Shogun','雷电将军','default_value'),(49,'Arataki Itto','荒泷一斗','default_value'),(50,'Kamisato Ayaka','神里凌华','default_value'),(51,'Kamisato Ayato','神里凌人','default_value'),(52,'Sangonemiya Kokomi','珊瑚宫心海','default_value'),(53,'Kaedehara Kazuha','枫原万叶','default_value'),(54,'Sayu','早柚','default_value'),(55,'Thoma','托马','default_value'),(56,'Yoimiya','宵宫','default_value'),(57,'Yae Miko','八重神子','default_value'),(58,'Gorou','五郎','default_value'),(59,'Kujou Sara','九条裟罗','default_value'),(72,'Nilou','妮露','default_value'),(73,'Collei','柯莱','default_value'),(74,'Dori','多莉','default_value'),(75,'Tighnari','提纳里','default_value'),(76,'Cyno','赛诺','default_value'),(77,'Candace','坎蒂丝','default_value'),(78,'Layla','莱依拉','default_value'),(79,'Dehya','迪希雅','default_value'),(80,'Faruzan','珐露姗','default_value'),(81,'Alhaitham','艾尔海森','default_value'),(82,'Kaveh','卡维','default_value'),(83,'Tartaglia','达达利亚','default_value'),(86,'Lumine','荧','default_value'),(89,'Aether','空','default_value');
/*!40000 ALTER TABLE `t_genshin_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_genshin_role_detail`
--

DROP TABLE IF EXISTS `t_genshin_role_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_genshin_role_detail` (
  `id` int(11) NOT NULL COMMENT '主键;角色编号(自然标识)',
  `sex` int(11) NOT NULL COMMENT '角色姓名;男(1),女(2),其他(3)...',
  `elemental_type` int(11) NOT NULL COMMENT '元素类型/神之眼属性;风(1),岩(2),雷(3)...',
  `region` int(11) NOT NULL COMMENT '所属地区(七国);蒙德(1),璃月(2),稻妻(3)...',
  `weapons_type` int(11) NOT NULL COMMENT '武器类型;单手剑(1),双手剑(2),弓(3),法器(4),长柄武器(5)...',
  `rarity` int(2) DEFAULT NULL COMMENT '角色稀有度(星级 5星/4星)',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `fk_t_sex` (`sex`),
  KEY `fk_t_weapons_type` (`weapons_type`),
  KEY `fk_t_elemental_type` (`elemental_type`),
  KEY `fk_t_genshin_region` (`region`),
  CONSTRAINT `fk_t_elemental_type` FOREIGN KEY (`elemental_type`) REFERENCES `t_elemental_type` (`no`),
  CONSTRAINT `fk_t_genshin_region` FOREIGN KEY (`region`) REFERENCES `t_genshin_region` (`no`),
  CONSTRAINT `fk_t_genshin_role` FOREIGN KEY (`id`) REFERENCES `t_genshin_role` (`id`),
  CONSTRAINT `fk_t_sex` FOREIGN KEY (`sex`) REFERENCES `t_sex` (`no`),
  CONSTRAINT `fk_t_weapons_type` FOREIGN KEY (`weapons_type`) REFERENCES `t_weapons_type` (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色信息详情表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_genshin_role_detail`
--

LOCK TABLES `t_genshin_role_detail` WRITE;
/*!40000 ALTER TABLE `t_genshin_role_detail` DISABLE KEYS */;
INSERT INTO `t_genshin_role_detail` VALUES (4,2,4,2,5,4),(5,2,6,1,4,5),(7,2,4,4,4,5),(8,2,6,1,3,4),(9,2,5,1,4,4),(10,2,6,2,5,5),(11,2,5,1,4,5),(13,2,1,1,1,5),(14,2,3,2,1,5),(15,2,4,4,1,4),(16,2,7,1,3,4),(17,1,2,2,5,5),(18,1,1,2,5,5),(19,2,5,2,3,5),(20,2,6,2,5,4),(21,1,4,2,4,5),(22,1,7,2,2,4),(23,2,6,2,2,4),(24,1,5,2,1,4),(25,2,7,2,5,5),(26,2,7,2,3,5),(27,2,6,2,4,4),(28,2,3,2,2,4),(29,2,2,2,4,4),(30,2,2,2,5,4),(31,2,7,2,1,5),(32,1,7,1,5,4),(33,1,2,1,1,5),(34,1,6,1,2,5),(35,2,2,1,2,4),(36,2,3,1,3,4),(37,2,7,1,5,4),(38,2,1,1,4,4),(39,1,6,1,1,4),(40,1,7,1,1,4);
/*!40000 ALTER TABLE `t_genshin_role_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_sex`
--

DROP TABLE IF EXISTS `t_sex`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_sex` (
  `no` int(2) NOT NULL DEFAULT '0',
  `sex` char(63) NOT NULL,
  `sex_c` char(63) DEFAULT NULL,
  PRIMARY KEY (`no`),
  UNIQUE KEY `sno` (`no`),
  UNIQUE KEY `sex` (`sex`),
  UNIQUE KEY `sex_c` (`sex_c`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_sex`
--

LOCK TABLES `t_sex` WRITE;
/*!40000 ALTER TABLE `t_sex` DISABLE KEYS */;
INSERT INTO `t_sex` VALUES (1,'man','男'),(2,'women','女'),(3,'other','其他');
/*!40000 ALTER TABLE `t_sex` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_weapons_type`
--

DROP TABLE IF EXISTS `t_weapons_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_weapons_type` (
  `no` int(2) NOT NULL DEFAULT '0',
  `weapons` varchar(255) NOT NULL COMMENT '武器类型',
  `weapons_c` varchar(255) NOT NULL COMMENT '武器类型(中文)',
  PRIMARY KEY (`no`),
  UNIQUE KEY `tno` (`no`),
  UNIQUE KEY `weapons` (`weapons`),
  UNIQUE KEY `weapons_c` (`weapons_c`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='武器类型表:单手剑,双手剑,弓,法器,长柄武器...';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_weapons_type`
--

LOCK TABLES `t_weapons_type` WRITE;
/*!40000 ALTER TABLE `t_weapons_type` DISABLE KEYS */;
INSERT INTO `t_weapons_type` VALUES (0,'Other weapons','其他武器'),(1,'Sword','单手剑'),(2,'Claymore','双手剑'),(3,'Bow','弓'),(4,'Catalyst','法器'),(5,'Polearm','长柄武器');
/*!40000 ALTER TABLE `t_weapons_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-21 23:42:51
