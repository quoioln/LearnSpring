create table department(
	id SERIAL primary key,
	name varchar(200)
);

create table role (
	id SERIAL primary key,
	
	name varchar(50)
)
create table employee(
	id SERIAL primary key,
	code varchar(10) not null,
	fullname varchar(100) not null,
	
)
