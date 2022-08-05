create database Ecommerce;
use  Ecommerce;
create table Product
(
id BIGINT primary key,
sku VARCHAR(255),
proname VARCHAR(255),
description VARCHAR(255),
unitprice DECIMAL(13,2),
imageurl VARCHAR(255),
unitsinstock INT,
datecreated DATE,
lastupdated DATE,
categoryid BIGINT,
foreign key(categoryid) references category(categoryid)
);

drop table Product;

insert into Product values(10001,"12345678","Laptop","HP Laptop",100000,"www.laptopimg",10,"2022-10-11","2022-11-11",1001);
insert into Product values(10002,"12345679","Mobile","Samsung",10000,"www.samsung",18,"2022-07-10","2022-07-11",1001);
insert into Product values(10003,"12345677","Headphone","Jabra",9599,"www.jabra",10,"2022-08-11","2022-08-11",1001);

insert into category values(1001,"Electronics");



create table category
(
categoryid BIGINT primary key,
categoryname VARCHAR(255)
);

select * from Product;
select * from category;
ALTER TABLE Product MODIFY id int NOT NULL AUTO_INCREMENT;