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
INSERT INTO `t_elemental_type` VALUES (0,'nothing','无'),(1,'Anemo','风'),(2,'Geo','岩'),(3,'Electro','雷'),(4,'Dendro','草'),(5,'Hydro','水'),(6,'Pyro','火'),(7,'Cryo','冰');
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
INSERT INTO `t_genshin_region` VALUES (0,'Unknown','未知'),(1,'Mondstadt','蒙德'),(2,'Liyue','璃月'),(3,'Inazuma','稻妻'),(4,'Sumeru','须弥'),(5,'Fontaine','枫丹'),(6,'Natlan','纳塔'),(7,'Snezhnaya','至冬');
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
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  UNIQUE KEY `name_c` (`name_c`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8 COMMENT='角色基础信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_genshin_role`
--

LOCK TABLES `t_genshin_role` WRITE;
INSERT INTO `t_genshin_role` VALUES (4,'Yaoyao','瑶瑶'),(5,'Klee','可莉'),(7,'Nahida','纳西妲'),(8,'Amber','安柏'),(9,'Barbara','芭芭拉'),(10,'Hu Tao','胡桃'),(11,'Mona','莫娜'),(13,'Jean','琴'),(14,'Keqing','刻晴'),(15,'Kirara','琦良良'),(16,'Diona','迪奥娜'),(17,'Zhongli','钟离'),(18,'Xiao','魈'),(19,'Yelan','夜兰'),(20,'Xiangling','香菱'),(21,'Baizhu','白术'),(22,'Chongyun','重云'),(23,'Xinyan','辛焱'),(24,'Xingqiu','行秋'),(25,'Shenhe','申鹤'),(26,'Ganyu','甘雨'),(27,'Yanfei','烟绯'),(28,'Beidou','北斗'),(29,'Ningguan','凝光'),(30,'Yun Jin','云堇'),(31,'Qiqi','七七'),(32,'Mika','米卡'),(33,'Albedo','阿贝多'),(34,'Diluc','迪卢克'),(35,'Noelle','诺艾尔'),(36,'Fishl','菲谢尔'),(37,'Rosaria','罗莎莉亚'),(38,'Sucrose','砂糖'),(39,'Bennett','班尼特'),(40,'Kaeya','凯亚'),(41,'Eula','优菈'),(42,'Lisa','丽莎'),(43,'Venti','温迪'),(46,'Shikanoin Heizou','鹿目院平藏'),(47,'Kuki Shinobu','久岐忍'),(48,'Raiden Shogun','雷电将军'),(49,'Arataki Itto','荒泷一斗'),(50,'Kamisato Ayaka','神里凌华'),(51,'Kamisato Ayato','神里凌人'),(52,'Sangonemiya Kokomi','珊瑚宫心海'),(53,'Kaedehara Kazuha','枫原万叶'),(54,'Sayu','早柚'),(55,'Thoma','托马'),(56,'Yoimiya','宵宫'),(57,'Yae Miko','八重神子'),(58,'Gorou','五郎'),(59,'Kujou Sara','九条裟罗'),(72,'Nilou','妮露'),(73,'Collei','柯莱'),(74,'Dori','多莉'),(75,'Tighnari','提纳里'),(76,'Cyno','赛诺'),(77,'Candace','坎蒂丝'),(78,'Layla','莱依拉'),(79,'Dehya','迪希雅'),(80,'Faruzan','珐露姗'),(81,'Alhaitham','艾尔海森'),(82,'Kaveh','卡维'),(83,'Tartaglia','达达利亚'),(86,'Lumine','荧'),(89,'Aether','空'),(90,'Aloy','埃洛伊');
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
INSERT INTO `t_genshin_role_detail` VALUES (4,2,4,2,5,4),(5,2,6,1,4,5),(7,2,4,4,4,5),(8,2,6,1,3,4),(9,2,5,1,4,4),(10,2,6,2,5,5),(11,2,5,1,4,5),(13,2,1,1,1,5),(14,2,3,2,1,5),(15,2,4,4,1,4),(16,2,7,1,3,4),(17,1,2,2,5,5),(18,1,1,2,5,5),(19,2,5,2,3,5),(20,2,6,2,5,4),(21,1,4,2,4,5),(22,1,7,2,2,4),(23,2,6,2,2,4),(24,1,5,2,1,4),(25,2,7,2,5,5),(26,2,7,2,3,5),(27,2,6,2,4,4),(28,2,3,2,2,4),(29,2,2,2,4,4),(30,2,2,2,5,4),(31,2,7,2,1,5),(32,1,7,1,5,4),(33,1,2,1,1,5),(34,1,6,1,2,5),(35,2,2,1,2,4),(36,2,3,1,3,4),(37,2,7,1,5,4),(38,2,1,1,4,4),(39,1,6,1,1,4),(40,1,7,1,1,4),(41,2,7,1,2,5),(42,2,4,1,4,4),(43,1,1,1,3,5),(46,1,1,3,4,4),(47,2,3,3,1,4),(48,2,3,3,5,5),(49,1,2,3,2,5),(50,2,7,3,1,5),(51,1,5,3,1,5),(52,2,5,3,4,5),(53,1,1,3,1,5),(54,2,1,3,2,4),(55,1,6,3,5,4),(56,2,6,3,3,5),(57,2,3,3,4,5),(58,1,2,3,3,4),(59,2,3,3,3,4),(72,2,5,4,1,5),(73,2,4,4,3,4),(74,2,3,4,2,4),(75,1,4,4,3,5),(76,1,3,4,5,5),(77,2,5,4,5,4),(78,2,7,4,1,4),(79,2,6,4,2,5),(80,2,1,4,3,4),(81,1,4,4,1,5),(82,1,4,4,2,4),(83,1,5,7,3,5),(86,2,0,0,1,5),(89,1,0,0,1,5),(90,2,7,1,3,5);
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
INSERT INTO `t_sex` VALUES (1,'man','男'),(2,'women','女'),(3,'other','其他');
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
INSERT INTO `t_weapons_type` VALUES (0,'Other weapons','其他武器'),(1,'Sword','单手剑'),(2,'Claymore','双手剑'),(3,'Bow','弓'),(4,'Catalyst','法器'),(5,'Polearm','长柄武器');
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-26 21:27:17
