DROP DATABASE IF EXISTS `books`;
CREATE DATABASE `books`;
USE `books`;

DROP TABLE IF EXISTS `author`;

--
--外键信息
--dynasty_id外键,与dynasty表的主键关联
--

CREATE TABLE `author` (
  `ID` int(10) primary key not null auto_increment,
  `author_name` varchar(255) NOT NULL,
  `dynasty_id` int(10) not null,
  `author_birthday` varchar(255) default NULL,
  `author_desc` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--
--外键信息
--无外键
--

DROP TABLE IF EXISTS `dynasty`;
CREATE TABLE `dynasty` (
  `dynasty_name` varchar(255) NOT NULL,
  `ID` int(10) primary key not null auto_increment
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--为表author建立外键
alter table author ADD CONSTRAINT FK_author_dynasty FOREIGN KEY (dynasty_id) REFERENCES dynasty (id);

--为表dynasty插入数据
insert into dynasty (dynasty_name) values('先秦');
insert into dynasty (dynasty_name) values('两汉');
insert into dynasty (dynasty_name) values('魏晋');
insert into dynasty (dynasty_name) values('南北朝');
insert into dynasty (dynasty_name) values('隋代');
insert into dynasty (dynasty_name) values('唐代');
insert into dynasty (dynasty_name) values('五代');
insert into dynasty (dynasty_name) values('宋代');
insert into dynasty (dynasty_name) values('金代');
insert into dynasty (dynasty_name) values('元代');
insert into dynasty (dynasty_name) values('明代');
insert into dynasty (dynasty_name) values('清代');
insert into dynasty (dynasty_name) values('民国');
insert into dynasty (dynasty_name) values('当代');

--为表author插入数据
insert into author (author_name,dynasty_id,author_birthday,author_desc) values('柳永',8,'约984年—约1053年','柳永（约984年—约1053年），原名三变，字景庄，后改名柳永，字耆卿，因排行第七，又称柳七，福建崇安人，北宋著名词人，婉约派代表人物。
柳永出身官宦世家，少时学习诗词，有功名用世之志。咸平五年（1002年），柳永离开家乡，流寓杭州、苏州，沉醉于听歌买笑的浪漫生活之中。大中祥符元年（1008年），柳永进京参加科举，屡试不中，遂一心填词。景祐元年（1034年），柳永暮年及第，历任睦州团练推官、余杭县令、晓峰盐碱、泗州判官等职，以屯田员外郎致仕，故世称柳屯田。
柳永是第一位对宋词进行全面革新的词人， 也是两宋词坛上创用词调最多的词人。柳永大力创作慢词，将敷陈其事的赋法移植于词，同时充分运用俚词俗语，以适俗的意象、淋漓尽致的铺叙、平淡无华的白描等独特的艺术个性，对宋词的发展产生了深远影响。');


--两表连接查询
 select author_name,author_birthday,dynasty_name from dynasty,author where author.dynasty_id=dynasty.id;