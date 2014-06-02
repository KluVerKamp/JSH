drop database if exists jsh;
CREATE DATABASE `jsh` ;
use jsh;


CREATE TABLE `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_fk` (`role_id`),
  CONSTRAINT `role_fk` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `meetings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `users_meetings` (
  `user_id` int(11) NOT NULL,
  `meeting_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`meeting_id`),
  KEY `meeting_fk_idx` (`meeting_id`),
  CONSTRAINT `user_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `meeting_fk` FOREIGN KEY (`meeting_id`) REFERENCES `meetings` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `meetings` VALUES (1,'Annual Conf','Down Town'),(2,'Dinner','China Town'),(3,'Picnic','Tataouine');
INSERT INTO `roles` VALUES (1,'Admin'),(2,'Contrib'),(3,'Writer'),(4,'Editor');
INSERT INTO `users` VALUES (1,'amen','ahlan',1),(2,'Mesut','Ozil',2),(3,'Dennis','Bergkamp',1);
INSERT INTO `users_meetings` VALUES (1,1),(2,2),(3,2),(1,3);