/*
Navicat MySQL Data Transfer

Source Server         : MySql5.7_3308
Source Server Version : 50717
Source Host           : localhost:3308
Source Database       : girls

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-10-28 21:43:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'john', '8888');
INSERT INTO `admin` VALUES ('2', 'lyt', '6666');

-- ----------------------------
-- Table structure for beauty
-- ----------------------------
DROP TABLE IF EXISTS `beauty`;
CREATE TABLE `beauty` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `sex` char(1) DEFAULT '女',
  `borndate` datetime DEFAULT '1987-01-01 00:00:00',
  `phone` varchar(11) NOT NULL,
  `photo` blob,
  `boyfriend_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of beauty
-- ----------------------------
INSERT INTO `beauty` VALUES ('1', '柳岩', '女', '1988-02-03 00:00:00', '18209876577', null, '8');
INSERT INTO `beauty` VALUES ('3', 'Angelababy', '女', '1989-02-03 00:00:00', '18209876567', null, '3');
INSERT INTO `beauty` VALUES ('4', '热巴', '女', '1993-02-03 00:00:00', '18209876579', null, '2');
INSERT INTO `beauty` VALUES ('5', '周冬雨', '女', '1992-02-03 00:00:00', '18209179577', null, '9');
INSERT INTO `beauty` VALUES ('6', '周芷若', '女', '1988-02-03 00:00:00', '18209876577', null, '1');
INSERT INTO `beauty` VALUES ('7', '岳灵珊', '女', '1987-12-30 00:00:00', '18219876577', null, '9');
INSERT INTO `beauty` VALUES ('8', '小昭', '女', '1989-02-03 00:00:00', '18209876567', null, '1');
INSERT INTO `beauty` VALUES ('9', '双儿', '女', '1993-02-03 00:00:00', '18209876579', null, '9');
INSERT INTO `beauty` VALUES ('10', '王语嫣', '女', '1992-02-03 00:00:00', '18209179577', null, '4');
INSERT INTO `beauty` VALUES ('11', '夏雪', '女', '1993-02-03 00:00:00', '18209876579', null, '9');
INSERT INTO `beauty` VALUES ('12', '赵敏', '女', '1992-02-03 00:00:00', '18209179577', null, '1');

-- ----------------------------
-- Table structure for boys
-- ----------------------------
DROP TABLE IF EXISTS `boys`;
CREATE TABLE `boys` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `boyName` varchar(20) DEFAULT NULL,
  `userCP` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of boys
-- ----------------------------
INSERT INTO `boys` VALUES ('1', '张无忌', '100');
INSERT INTO `boys` VALUES ('2', '鹿晗', '800');
INSERT INTO `boys` VALUES ('3', '黄晓明', '50');
INSERT INTO `boys` VALUES ('4', '段誉', '300');
