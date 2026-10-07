show databases;

create database nit9amjun2026;

use nit9amjun2026;

create table employee(empId varchar(10),empName varchar(50), salary int
,designation varchar(50), contract boolean, hike float, gender char, doj datetime);

show tables;

select * from employee;

insert into employee values("1234","Virat Kohli",
2000000,"Senior Dev",false,11.5,'M',"2025-12-31 09:00:00");

insert into employee(empId,salary) values("23456",1000000);

create table employee_unique(empId varchar(10), empName varchar(50), salary int, primary key(empId));

show columns from employee_unique;

insert into employee_unique values(1234,"abc",200000);

select * from employee_unique;

insert into employee_unique(salary) values(20000);

create table employee_notNull(empId int, empName varchar(50) not null, salary int, primary key(empId));

show columns from employee_notNull;

select * from used_cars_data;

select * from used_cars_data where Year=2010;

select * from used_cars_data where Location="Mumbai";

select * from used_cars_data where Owner_Type="First";

select Name, Year from used_cars_data where Mileage>=20;

select * from used_cars_data where Fuel_Type="Petrol" and Owner_Type="Second";

select * from used_cars_data where Fuel_Type="Petrol" or Owner_Type="Second";

select * from used_cars_data where Price<=3;

select * from used_cars_data where Price>=1 and Price<=3;

select * from used_cars_data where Price between 1 and 3;

select * from used_cars_data where Price in (1,1.5,2,2.5,3);

select * from used_cars_data where Name like "Maruti Wagon R%";

select * from used_cars_data where Name like "%BSIV";

select * from used_cars_data where Name like "%CVT%";

select * from used_cars_data where Name not like "%Maruti%";

select * from used_cars_data where Fuel_Type !="Petrol";

select * from used_cars_data where Name not like "%Honda%" and Fuel_type = "Diesel" and mileage >20 and price <5;

select count(Name) from used_cars_data where Price<=3;

select count(name) from used_cars_data where seats = 5 and name="%hyundai%" and fuel_type="electric";

select avg(Mileage) from used_cars_data where Fuel_Type="Petrol";

select sum(Price) from used_cars_data;

select lower(Name) from used_cars_data;

select upper(Name) from used_cars_data;

select datediff("2026-07-25","2026-07-24");

select timediff("2026-07-25 10:30:00", "2026-07-25 09:00:00");

select max(Power) from used_cars_data;

select min(Price) from used_cars_data;

select * from used_cars_data where Price = (select min(Price) from used_cars_data); --sub-query

select * from used_cars_data
where price = (select max(price) from used_cars_data);

select * from used_cars_data order by Price asc;

select * from used_cars_data order by Mileage desc;

select * from used_cars_data order by Price desc limit 5;

select * from used_cars_data order by Mileage asc limit 5;

select * from used_cars_data order by Price desc limit 2,1;

select * from used_cars_data order by Price desc limit 2,2;

select Fuel_Type, count(Fuel_Type) from used_cars_data group by Fuel_Type;

select Owner_Type, count(Owner_Type) from used_cars_data group by Owner_Type;

select Seats, count(Seats) from used_cars_data group by Seats;

update employee set salary = 400000 where empId=1234;

update employee set salary = 400000 where empName="ABC" and empId=1234;

alter table employee add empPhone varchar(10) after empName;

alter table employee drop empPhone;

create database dummydb;

use dummydb;

create table simple (id int, salary int);

insert into simple values (1,1),(2,2),(3,3),(4,4);

select * from simple;

delete from simple where id=1;

truncate table simple;

drop table simple;

drop database dummydb;

select table1.id,table1.name,table1.salary,table2.designation from table1 inner join table2 on table1.id=table2.id;

select table1.id, table1.name, table2.designation, table2.location from table1 right join table2 on table1.id = table2.id;

select table1.id, table1.name, table2.designation, table2.location from table1 left join table2 on table1.id = table2.id;

create table parent(id int, name varchar(50), primary key(id));

create table child (id int, salary int, foreign key(id) references parent(id));

insert into parent values(2,"b");

insert into child values (2,100000);

update child set id=3 where id=2;

select * from child;

select * from parent;

-- Primary Key of Parent Table becomes Foreign Key of Child Table
-- Insertion should always start from Parent Table
-- If we insert in Child table, it will check for that value in Parent Table
-- Updates & Deletes should make sure that there are no Orphan Records
-- We can use CASCADE to delete records from both Parent & Child at a time
-- Foreign Key values can be duplicate but Primary Key values cant