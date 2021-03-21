Some code for create docker container use MySql image:
```
docker run --name LibraryDatabaseServer -e MYSQL_ROOT_PASSWORD=mysql -p 3305:3306 mysql  
```

MySQL access information:
user: root
password: mysql
````
SQL command for create database:
CREATE DATABASE library_db;

SQL command for add table book;
CREATE TABLE book (
id int not null auto_increment,
title varchar(100),
genre varchar(100),
description varchar(100),
rate int,
PRIMARY KEY(id)
)

SQL command for add table author;
CREATE TABLE author (
id int not null auto_increment,
first_name varchar(100),
last_name varchar(100),
country varchar(100),
age int,
PRIMARY KEY(id)
)
````
SQL command  for write data in tables;
```
INSERT INTO book (id,title,genre,description,rate) VALUES (1,"Circe","fantasy","description absent",7);
INSERT INTO book (id,title,genre,description,rate) VALUES (2,"Memory, Sorrow, and Thorn","fantasy","description absent",4);
INSERT INTO book (id,title,genre,description,rate) VALUES (3,"Malazan Book","fantasy","description absent",7);
INSERT INTO book (id,title,genre,description,rate) VALUES (4,"The First Law Trilogy","fantasy","description absent",2);
INSERT INTO book (id,title,genre,description,rate) VALUES (5,"The Golem and the Djinni","fantasy","description absent",8);
INSERT INTO book (id,title,genre,description,rate) VALUES (6,"Dune","fantasy","description absent",9);
INSERT INTO book (id,title,genre,description,rate) VALUES (7,"A Song of Ice and Fire","fantasy","description absent",4);
INSERT INTO book (id,title,genre,description,rate) VALUES (8,"Good Omens","fantasy","description absent",6);
INSERT INTO book (id,title,genre,description,rate) VALUES (9,"Rivers of London","fantasy","description absent",8);
INSERT INTO book (id,title,genre,description,rate) VALUES (10,"The Wheel of Time ","fantasy","description absent",9);
INSERT INTO book (id,title,genre,description,rate) VALUES (11,"Then She Was Gone","drama","description absent",10);
INSERT INTO book (id,title,genre,description,rate) VALUES (12,"Before We Were Yours","drama","description absent",7);
INSERT INTO book (id,title,genre,description,rate) VALUES (13,"Where the Crawdads Sing","drama","description absent",5);
INSERT INTO book (id,title,genre,description,rate) VALUES (14,"The Silent Wife","drama","description absent",8);
INSERT INTO book (id,title,genre,description,rate) VALUES (15,"Click","drama","description absent",4);
INSERT INTO book (id,title,genre,description,rate) VALUES (16,"Grant","history","description absent",8);
INSERT INTO book (id,title,genre,description,rate) VALUES (17,"Rites of Spring","history","description absent",5);
INSERT INTO book (id,title,genre,description,rate) VALUES (18,"The History of the Ancient World","history","description absent",5);
INSERT INTO book (id,title,genre,description,rate) VALUES (19,"Democracy: A Life","history","description absent",7);
INSERT INTO book (id,title,genre,description,rate) VALUES (20,"Appeasement","history","description absent",3);

INSERT INTO author (id, first_name, last_name, country, age) VALUES (1,'Stephen', 'King', 'USA', 27);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (2,'Anne', 'Lamott', 'UK', 74);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (3,'William', 'Zinsser', 'USA', 34);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (4,'William', 'Strunk Jr', 'UK', 65);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (5,'Steven', 'Pressfield', 'USA', 25);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (6,'James', 'N. Frey', 'UK', 65);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (7,'Julia', 'Cameron', 'USA', 32);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (8,'Natalie', 'Goldberg', 'USA', 52);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (9,'Annie', 'Dillard', 'UK', 37);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (10,'Lynne', 'Truss', 'Canada', 28);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (11,'Ray', 'Bradbury', 'USA', 51);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (12,'Renni', 'Browne', 'Canada', 45);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (13,'Lisa', 'Cron', 'UK', 41);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (14,'Sean', 'Platt', 'Canada', 36);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (15,'Roy', 'Peter', 'USA', 32);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (16,'Blake', 'Snyder', 'USA', 61);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (17,'Robert', 'McKee', 'UK', 42);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (18,'Donald', 'Maass', 'Canada', 53);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (19,'Larry', 'Brooks', 'UK', 26);
INSERT INTO author (id, first_name, last_name, country, age) VALUES (20,'John', 'Gardner', 'USA', 39);
`````

SQL command for get all books from one genre: 
```
SELECT * FROM book WHERE genre='history';
```

SQL command for get title and genre book after sort decs:
```
SELECT title,genre FROM book ORDER BY rate DESC;
```

SQL command for search book which have most large rate:
```
SELECT title FROM book WHERE rate=(SELECT MAX(rate) FROM book);
```

SQL command forget all user after sort decs;
```
SELECT * FROM author ORDER BY age;
```



