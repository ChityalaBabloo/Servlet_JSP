
Creation of Tables:
-------------------
CREATE TABLE products(productId Number(5) Primary Key, name varchar2(20), model varchar2(20), price number(5), color varchar2(10), features varchar2(2000), image varchar2(20));

CREATE TABLE cart(slno Number(5),productId Number(5),name varchar2(20), model varchar2(20), price number(5), color varchar2(10), features varchar2(2000), image varchar2(20));

CREATE TABLE buy(orderId Number(5),productId Number(5),name varchar2(20), model varchar2(20), price number(5),image varchar2(20),address varchar2(100));
=============================================================

Create sequences:
-----------------
CREATE SEQUENCE slno_seq start with 1;

CREATE SEQUENCE orderId_seq start with 1;
==============================================================

Insert Records into products:
-----------------------------
Insert into products values(1,'RealMe','2 Pro',12000,'Blue','4gb 64gb 3500','realme-2.jpeg');

Insert into products values(2,'Vivo','v11',10000,'Purple','4gb 64gb 3000','vivo-v11.jpeg');

Insert into products values(3,'LG','Q Stylus',18000,'Black','6gb 128gb 3500','lg-q-stylus.jpeg');

Insert into products values(4,'Yu','Ace',7000,'Black','2gb 32gb 3000','yu-ace.jpeg');

Insert into products values(5,'Nokia','8 Sirocco',25000,'Black','6gb 64gb 3500','nokia-8-sirocco.jpeg');

Insert into products values(6,'Galaxy','s9 Plus',30000,'Grey','6gb 64gb 3500','galaxy-s9-plus.jpeg');

Insert into products values(7,'Galaxy','Note 8',67000,'Black','6gb 64gb 4000','Note-8.jpeg');

