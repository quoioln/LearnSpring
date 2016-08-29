-- insert into role table
insert into role values('DBA', 'DB Admin', false);
insert into role values('ADMIN', 'Admin', false);
insert into role values('USER', 'User', false);
-- insert into department table 
insert into department(name, delete_flag) values('DC1', false);
insert into department(name, delete_flag) values('DC2', false);
insert into department(name, delete_flag) values('DC3', false);
insert into department(name, delete_flag) values('DC4', false);
insert into department(name, delete_flag) values('DC5', false);
insert into department(name, delete_flag) values('DC6', false);
insert into department(name, delete_flag) values('DC7', false);
insert into department(name, delete_flag) values('DC8', false);
insert into department(name, delete_flag) values('DC9', false);
insert into department(name, delete_flag) values('DC10', false);
insert into department(name, delete_flag) values('DC11', false);
insert into department(name, delete_flag) values('DC12', false);

-- insert into project
insert into project(name, status, department_id, delete_flag) values('SmartPBXCuscon', 12, 1, false);
insert into project(name, status, department_id, delete_flag) values('OneOperator', 12, 1, false);
insert into project(name, status, department_id, delete_flag) values('Topic room', 12, 1, false);
insert into project(name, status, department_id, delete_flag) values('NGC', 12, 1, false);

-- insert into employee table
insert into employee(login_id, full_name, email, gender, department_id, role_id, delete_flag)
	values('quoioln', 'Vo Phu Quoi', 'quoipro94@gmail.com', 1, 12, 'DBA', false);
insert into employee(login_id, full_name, email, gender, department_id, role_id, delete_flag)
	values('nva', 'Nguyen van A', 'quoipro94@gmail.com', 1, 12, 'ADMIN', false);
insert into employee(login_id, full_name, email, gender, department_id, role_id, delete_flag)
	values('nvb', 'Nguyen van B', 'quoipro94@gmail.com', 1, 12, 'USER', false);
insert into employee(login_id, full_name, email, gender, department_id, role_id, delete_flag)
	values('nvc', 'Nguyen van C', 'quoipro94@gmail.com', 1, 12, 'USER', false);
insert into project_team(employee_id, project_id, delete_flag) values(1, 1, false);
insert into project_team(employee_id, project_id, delete_flag) values(2, 1, false);
insert into project_team(employee_id, project_id, delete_flag) values(3, 1, false);
insert into project_team(employee_id, project_id, delete_flag) values(4, 1, false);
insert into project_team(employee_id, project_id, delete_flag) values(1, 1, false);
insert into project_team(employee_id, project_id, delete_flag) values(1, 1, false);