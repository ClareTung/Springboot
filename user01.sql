/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : test01

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-12-20 22:05:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
