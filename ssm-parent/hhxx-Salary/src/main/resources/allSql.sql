drop database if exists hhxx;
create database hhxx character set utf8;
use hhxx;

drop table if exists t_admin;

drop table if exists t_check;

drop table if exists t_check_statistics;

drop table if exists t_dept;

drop table if exists t_emp;

drop table if exists t_permission;

drop table if exists t_position;

drop table if exists t_replay;

drop table if exists t_role;

drop table if exists t_role_permission;

drop table if exists t_salary;

drop table if exists t_suggestion;



create table t_admin
(
     id int primary key auto_increment,
     name varchar(32),
     password varchar(32)
);

create table t_check 
(
   id int primary key auto_increment,
   check_in  datetime,                     
   check_out  datetime,
   emp_id int
);

create table t_check_statistics 
(
   id                   int primary key auto_increment,
   statistics_year      int,
   statistics_month     int,
   late_count           int,
   leaveearly_count     int,
   absenteeism_count    int,
   absenteeismhalf_count int,
   emp_id               int
);

create table t_dept 
(
   id                   int primary key auto_increment,
   name                 varchar(32),
   description          text,
   status               int
);

create table t_emp 
(
   id                   int primary key auto_increment,
   name                 varchar(32),
   work_number          varchar(32),
   password             varchar(32),
   birthday             date,
   startday             date,
   gender               boolean,
   marital_status       int,
   phone                varchar(32),
   email                varchar(32),
   birthplace_province  int,
   birthplace_city      int,
   political_outlook    int,
   dept_id              int,
   position_id          int,
   role_id              int
);

create table t_permission 
(
   id                   int primary key auto_increment,
   name                 varchar(32),
   description          text,
   uri                  text
);

create table t_position 
(
   id                   int primary key auto_increment,
   name                 varchar(32)                    null,
   description          text                           null,
   base_salary          double                         null,
   status               int                            null,
   dept_id              int                            null
);

create table t_replay 
(
   id                   int primary key auto_increment,
   replay_time          datetime,
   replay_empid         int,
   content              text,
   suggestion_id        int
);

create table t_role 
(
   id                   int primary key auto_increment,
   name                 varchar(32),
   description          text
);

create table t_role_permission 
(
   role_id              int,
   permission_id        int
);

create table t_salary 
(
   id                   int primary key auto_increment,
   salary_year          int,
   salary_month         int,
   base_salary          double,
   insurance            double,
   accumulation_fund    double,
   tax                  double,
   achievements         double,
   really_salary        double,
   emp_id               int
);

create table t_suggestion 
(
   id                   int primary key auto_increment,
   title                varchar(32),
   send_time            datetime,
   content              text,
   emp_id               int
);

alter table t_role_permission add primary key(role_id,permission_id);

insert into t_admin values(null,'小裴','123');

insert into t_dept values(null,"部门1","这是部门1",1);
insert into t_dept values(null,"部门2","这是部门2",1);
insert into t_dept values(null,"部门3","这是部门3",1);
insert into t_dept values(null,"部门4","这是部门4",1);

insert into t_position values(null,"部门1的职位1","这是部门1的职位1",5000,1,1);
insert into t_position values(null,"部门1的职位2","这是部门1的职位2",5100,1,1);
insert into t_position values(null,"部门1的职位3","这是部门1的职位3",5200,1,1);
insert into t_position values(null,"部门2的职位1","这是部门2的职位1",6000,1,2);
insert into t_position values(null,"部门2的职位2","这是部门2的职位2",6100,1,2);
insert into t_position values(null,"部门3的职位1","这是部门3的职位1",7100,1,3);
insert into t_position values(null,"部门3的职位2","这是部门3的职位2",7200,1,3);
insert into t_position values(null,"部门4的职位1","这是部门4的职位1",8100,1,4);
insert into t_position values(null,"部门4的职位2","这是部门4的职位2",8200,1,4);
insert into t_position values(null,"部门4的职位3","这是部门4的职位3",8300,1,4);

insert into t_emp(name,dept_id,position_id) values("员工1",1,1);
insert into t_emp(name,dept_id,position_id) values("员工2",1,2);
insert into t_emp(name,dept_id,position_id) values("员工3",1,3);
insert into t_emp(name,dept_id,position_id) values("员工4",2,4);
insert into t_emp(name,dept_id,position_id) values("员工5",2,5);
insert into t_emp(name,dept_id,position_id) values("员工6",3,6);
insert into t_emp(name,dept_id,position_id) values("员工7",3,7);
insert into t_emp(name,dept_id,position_id) values("员工8",4,8);
insert into t_emp(name,dept_id,position_id) values("员工9",4,9);
insert into t_emp(name,dept_id,position_id) values("员工10",4,10);

insert into t_check_statistics values(null,2019,8,1,1,0,0,1);
insert into t_check_statistics values(null,2019,9,0,0,0,0,1);
insert into t_check_statistics values(null,2019,10,1,1,1,1,1);
insert into t_check_statistics values(null,2019,8,0,0,0,1,2);
insert into t_check_statistics values(null,2019,9,0,0,1,1,2);
insert into t_check_statistics values(null,2019,10,0,1,1,1,2);
insert into t_check_statistics values(null,2019,8,1,1,1,1,3);
insert into t_check_statistics values(null,2019,9,0,1,0,0,3);
insert into t_check_statistics values(null,2019,10,0,0,1,0,3);
insert into t_check_statistics values(null,2019,8,1,0,1,0,4);
insert into t_check_statistics values(null,2019,9,0,1,1,0,4);
insert into t_check_statistics values(null,2019,10,0,0,0,0,4);
insert into t_check_statistics values(null,2019,8,0,0,1,1,5);
insert into t_check_statistics values(null,2019,9,1,1,1,0,5);
insert into t_check_statistics values(null,2019,10,2,3,1,1,5);
insert into t_check_statistics values(null,2019,8,1,5,1,3,6);
insert into t_check_statistics values(null,2019,9,7,4,1,3,6);
insert into t_check_statistics values(null,2019,10,4,2,1,1,6);
insert into t_check_statistics values(null,2019,8,5,1,1,0,7);
insert into t_check_statistics values(null,2019,9,0,0,1,2,7);
insert into t_check_statistics values(null,2019,10,0,5,1,1,7);
insert into t_check_statistics values(null,2019,8,0,3,1,0,8);
insert into t_check_statistics values(null,2019,9,2,0,1,1,8);
insert into t_check_statistics values(null,2019,10,0,0,1,4,8);
insert into t_check_statistics values(null,2019,8,0,6,1,5,9);
insert into t_check_statistics values(null,2019,9,0,1,1,2,9);
insert into t_check_statistics values(null,2019,10,0,4,1,3,9);
insert into t_check_statistics values(null,2019,8,0,1,1,0,10);
insert into t_check_statistics values(null,2019,9,1,0,1,2,10);
insert into t_check_statistics values(null,2019,10,0,3,1,0,10);






 
commit;