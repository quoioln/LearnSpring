drop table if exists project_team;
drop table if exists employee;
drop table if exists project;
drop table if exists department;
drop table if exists role;

create table if not exists department(
	department_id SERIAL primary key,
	name varchar(200),
	delete_flag boolean
);

create table if not exists role (
	role_id varchar(10) primary key,
	name varchar(50),
	delete_flag boolean
);

create table if not exists employee(
	employee_id SERIAL primary key,
	login_id varchar(10),
	full_name varchar(100) not null,
	email varchar(100),
	gender integer,
	department_id integer,
	role_id varchar(10),	
	delete_flag boolean,
	constraint fk_department_id foreign key (department_id) references department(department_id),
	constraint fk_role_id foreign key (role_id) references role(role_id)
);

create table if not exists project(
	project_id SERIAL primary key,
	name varchar(200),
	department_id integer,
	status smallint,
	delete_flag boolean,
	constraint fk_department_id foreign key (department_id) references department(department_id)
);

create table if not exists project_team(
	project_team_id serial primary key,
	employee_id integer,
	project_id integer,
	delete_flag boolean,
	constraint fk_employee_id foreign key (employee_id) references employee(employee_id),
	constraint fk_project_id foreign key (project_id) references project(project_id)
);