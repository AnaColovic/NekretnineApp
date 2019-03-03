/*
SQLyog Community v12.5.0 (64 bit)
MySQL - 10.1.36-MariaDB : Database - db_nekretnine
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_nekretnine` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_nekretnine`;

/*Table structure for table `agent` */

DROP TABLE IF EXISTS `agent`;

CREATE TABLE `agent` (
  `idAgent` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ime` varchar(20) DEFAULT NULL,
  `prezime` varchar(20) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idAgent`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `agent` */

insert  into `agent`(`idAgent`,`ime`,`prezime`,`username`,`password`,`email`) values 
(1,'Ana','Colovic','ana','ana','ana@gmail.com'),
(2,'Jovana','Mitrovic','jovana','jovana','jovana@gmail.com'),
(3,'Maja','Colovic','maja','maja','maja@gmail.com');

/*Table structure for table `grad` */

DROP TABLE IF EXISTS `grad`;

CREATE TABLE `grad` (
  `idGrad` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `naziv` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idGrad`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `grad` */

insert  into `grad`(`idGrad`,`naziv`) values 
(1,'Beograd'),
(2,'Novi Sad'),
(3,'Nis'),
(4,'Smederevo'),
(5,'Zrenjanin'),
(6,'Vrsac'),
(7,'Kraljevo'),
(8,'Kragujevac');

/*Table structure for table `klijent` */

DROP TABLE IF EXISTS `klijent`;

CREATE TABLE `klijent` (
  `idKlijent` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ime` varchar(30) DEFAULT NULL,
  `prezime` varchar(30) DEFAULT NULL,
  `jmbg` varchar(13) DEFAULT NULL,
  `datum_rodjenja` date DEFAULT NULL,
  `broj_telefona` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `adresa` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idKlijent`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `klijent` */

insert  into `klijent`(`idKlijent`,`ime`,`prezime`,`jmbg`,`datum_rodjenja`,`broj_telefona`,`email`,`adresa`) values 
(1,'Ana','Colovic','12365846','2019-01-17','123','ana@gmail.com','Borska 34b'),
(2,'Anci','Col','1982938823','2019-01-22','0231','102@ana','Moja adresa'),
(3,'Jovana','Mitrovic','1236547893214','2019-01-23','0632555555','jovana@gmail.com','Oplenacka 54'),
(4,'Ana','Col','1234567891236','2000-01-12','0625555555','ana@','Borska'),
(5,'Maja','Colovic','1458258963254','1999-01-05','065222222','majag@mail','Borska 34b'),
(6,'Maja','Colovic','1206998715000','2000-01-12','0652365897','majac@gmail.com','Borska 11');

/*Table structure for table `nekretnina` */

DROP TABLE IF EXISTS `nekretnina`;

CREATE TABLE `nekretnina` (
  `idNekretnina` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `tip` varchar(30) DEFAULT NULL,
  `broj_soba` double DEFAULT NULL,
  `povrsina` double DEFAULT NULL,
  `adresa` varchar(30) DEFAULT NULL,
  `sprat` int(11) DEFAULT NULL,
  `opis` varchar(50) DEFAULT NULL,
  `vlasnik_id` bigint(20) unsigned DEFAULT NULL,
  `grad_id` bigint(20) unsigned DEFAULT NULL,
  `iznos_kirije` decimal(10,0) DEFAULT NULL,
  `uknjizen` tinyint(1) DEFAULT NULL,
  `cena` decimal(10,0) DEFAULT NULL,
  `namena` varchar(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idNekretnina`),
  KEY `vlasnik_fk` (`vlasnik_id`),
  KEY `grad_fk` (`grad_id`),
  CONSTRAINT `grad_fk` FOREIGN KEY (`grad_id`) REFERENCES `grad` (`idGrad`),
  CONSTRAINT `vlasnik_fk` FOREIGN KEY (`vlasnik_id`) REFERENCES `vlasnik` (`idVlasnik`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

/*Data for the table `nekretnina` */

insert  into `nekretnina`(`idNekretnina`,`tip`,`broj_soba`,`povrsina`,`adresa`,`sprat`,`opis`,`vlasnik_id`,`grad_id`,`iznos_kirije`,`uknjizen`,`cena`,`namena`,`status`) values 
(4,'KUCA',5,100,'Beogradska 12',5,'Kuca u centru grada, kucica',15,1,1000,NULL,NULL,'ZA_IZDAVANJE','U_PONUDI'),
(5,'STAN',1,60,'Juzni Bulevar 15',10,'Opis stana u Kragujevcu',15,1,200,NULL,NULL,'ZA_IZDAVANJE','NIJE_U_PONUDI'),
(6,'STAN',5,70,'Borska 50',1,'Najbolji stan',15,1,NULL,1,60000,'ZA_PRODAJU','NIJE_U_PONUDI'),
(7,'STAN',3,30,'Zrenjaninski put 1',1,'Propala kuca',15,1,NULL,0,20000,'ZA_PRODAJU','NIJE_U_PONUDI'),
(8,'STAN',4,92,'Glavna 66',9,'Ekskluzivni stan u centru grada Kraljeva',15,1,NULL,1,80000,'ZA_PRODAJU','NIJE_U_PONUDI'),
(9,'STAN',2,8555,'Adresa',0,'Opis',15,1,500,NULL,NULL,'ZA_IZDAVANJE','U_PONUDI'),
(10,'KUCA',5,500,'Smedervskki put 111',1,'Kuca u Smederevu',20,1,1000,NULL,NULL,'ZA_IZDAVANJE','NIJE_U_PONUDI'),
(11,'STAN',3,95,'Borska 34b',5,'Novi stan, u potpunosti opremljen',19,1,1000,NULL,NULL,'ZA_IZDAVANJE','U_PONUDI'),
(12,'STAN',2,50,'Beogradska 34',12,'Luksuzni poslovni prostor',21,1,NULL,1,100000,'ZA_PRODAJU','U_PONUDI');

/*Table structure for table `ugovor_o_kupoprodaji` */

DROP TABLE IF EXISTS `ugovor_o_kupoprodaji`;

CREATE TABLE `ugovor_o_kupoprodaji` (
  `idUgovorOKupoprodaji` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `datum_sklapanja` date DEFAULT NULL,
  `mesto_sklapanja` varchar(20) DEFAULT NULL,
  `datum_isplate` date DEFAULT NULL,
  `prodajna_cena` decimal(10,0) DEFAULT NULL,
  `nacin_placanja` varchar(50) DEFAULT NULL,
  `id_nekretnina` bigint(20) unsigned NOT NULL,
  `id_klijent` bigint(20) unsigned NOT NULL,
  `id_agent` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`idUgovorOKupoprodaji`,`id_nekretnina`,`id_klijent`),
  KEY `nekretnina_fk` (`id_nekretnina`),
  KEY `klijent_fk` (`id_klijent`),
  KEY `agent_fk` (`id_agent`),
  CONSTRAINT `agent_fk` FOREIGN KEY (`id_agent`) REFERENCES `agent` (`idAgent`),
  CONSTRAINT `klijent_fk` FOREIGN KEY (`id_klijent`) REFERENCES `klijent` (`idKlijent`),
  CONSTRAINT `nekretnina_fk` FOREIGN KEY (`id_nekretnina`) REFERENCES `nekretnina` (`idNekretnina`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `ugovor_o_kupoprodaji` */

insert  into `ugovor_o_kupoprodaji`(`idUgovorOKupoprodaji`,`datum_sklapanja`,`mesto_sklapanja`,`datum_isplate`,`prodajna_cena`,`nacin_placanja`,`id_nekretnina`,`id_klijent`,`id_agent`) values 
(3,'2019-01-24','Beograd','2019-02-23',60000,'kes batoooo',6,1,1),
(4,'2019-01-26','Beograd','2019-01-26',20000,'neki nacin',7,4,1),
(5,'2019-01-26','Beograd','2019-02-23',80000,'kredit na 20 godina',8,4,1);

/*Table structure for table `ugovor_o_zakupu` */

DROP TABLE IF EXISTS `ugovor_o_zakupu`;

CREATE TABLE `ugovor_o_zakupu` (
  `idUgovoraOZakupu` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `datum_sklapanja` date DEFAULT NULL,
  `mesto_sklapanja` varchar(30) DEFAULT NULL,
  `datum_od` date DEFAULT NULL,
  `datum_do` date DEFAULT NULL,
  `ukupno_za_uplatu` decimal(10,0) DEFAULT NULL,
  `id_nekretnina` bigint(20) unsigned NOT NULL,
  `id_klijent` bigint(20) unsigned NOT NULL,
  `id_agent` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`idUgovoraOZakupu`,`id_nekretnina`,`id_klijent`),
  KEY `fk_agent` (`id_agent`),
  KEY `fk_nekretnina` (`id_nekretnina`),
  KEY `fk_klijent` (`id_klijent`),
  CONSTRAINT `fk_agent` FOREIGN KEY (`id_agent`) REFERENCES `agent` (`idAgent`),
  CONSTRAINT `fk_klijent` FOREIGN KEY (`id_klijent`) REFERENCES `klijent` (`idKlijent`),
  CONSTRAINT `fk_nekretnina` FOREIGN KEY (`id_nekretnina`) REFERENCES `nekretnina` (`idNekretnina`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*Data for the table `ugovor_o_zakupu` */

insert  into `ugovor_o_zakupu`(`idUgovoraOZakupu`,`datum_sklapanja`,`mesto_sklapanja`,`datum_od`,`datum_do`,`ukupno_za_uplatu`,`id_nekretnina`,`id_klijent`,`id_agent`) values 
(10,'2019-01-23','Beograd','2019-02-01','2019-08-01',6000,4,3,1),
(12,'2019-01-23','Nis','2019-01-09','2019-11-09',2000,5,3,1),
(13,'2019-01-25','Beograd','2019-01-26','2019-11-26',10000,4,2,1),
(14,'2019-01-26','Beograd','2020-02-01','2020-07-01',5000,4,5,1),
(15,'2019-01-26','Beograd','2021-01-15','2022-04-15',15000,4,4,1);

/*Table structure for table `vlasnik` */

DROP TABLE IF EXISTS `vlasnik`;

CREATE TABLE `vlasnik` (
  `idVlasnik` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ime` varchar(20) DEFAULT NULL,
  `prezime` varchar(20) DEFAULT NULL,
  `datum_rodjenja` date DEFAULT NULL,
  `broj_telefona` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idVlasnik`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

/*Data for the table `vlasnik` */

insert  into `vlasnik`(`idVlasnik`,`ime`,`prezime`,`datum_rodjenja`,`broj_telefona`) values 
(15,'Ana','Colovic','1996-05-29','0693710774'),
(16,'Maja','Colovic','1998-06-12','063021456'),
(17,'Jovan','Colovic','2001-04-12','062545454'),
(18,'Pera','Peric','1987-01-06','011265962'),
(19,'Stefan','Jovanovic','1996-05-26','0694439658'),
(20,'Silvana','Colovic','1997-01-15','06522222'),
(21,'Sofija','Markovic','1995-05-18','0653563214');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
