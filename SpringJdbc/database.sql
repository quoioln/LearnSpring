
---- drop table if exists Student;
create database if not exists student CHARACTER SET utf8 COLLATE utf8_bin;
use student; 
create table if not exists Student (
	id int primary key auto_increment,
	name varchar(20) not null,
	age int not null
) CHARACTER SET utf8 COLLATE utf8_bin;

insert into Student(name, age) values ('Vo Phu Quoi', 22);
insert into Student(name, age) values ('Nguyen Thi Cam Nhung', 22);
insert into Student(name, age) values ('Chau En Ton', 22);
insert into Student(name, age) values ('Nguyen Phuoc Hung', 22);