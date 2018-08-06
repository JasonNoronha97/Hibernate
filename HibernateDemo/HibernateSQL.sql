Create table laptops ( id number(5)  PRIMARY KEY, name varchar2(20), price number(10,2) );
desc laptops;

select * from laptops;

CREATE TABLE PERSON ( pid number primary key,
name varchar2(15),
passportno number(12) );

create table PASSPORT ( ppid number(12)  primary key, ppname varchar2(20) );

select * from person;
select * from passport;