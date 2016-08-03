create database if not exists mydb_test character set utf8 collate utf8_bin;
-- use mydb_test;
drop table if exists mydb_test.contact;
create table if not exists mydb_test.contact (
	contact_id integer primary key auto_increment,
	first_name varchar(20),
	last_name varchar(20),
	email varchar(200)
) character set utf8 collate utf8_bin;
