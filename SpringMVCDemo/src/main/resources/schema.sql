drop table if exists employee;
drop table if exists department;

create table if not exists department(
	department_id SERIAL primary key,
	name varchar(200),
	delete_flag boolean
);


create table if not exists employee(
	employee_id SERIAL primary key,
	full_name varchar(100) not null,
	email varchar(100),
	gender integer,
	department_id integer,
	delete_flag boolean,
	constraint fk_department_id foreign key (department_id) references department(department_id)
);
