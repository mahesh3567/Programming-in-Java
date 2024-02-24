
show databases;
use book;
show tables;
CREATE TABLE books (
    id INT,
    title VARCHAR(1000),
    author VARCHAR(1000),
    price DECIMAL(10,2),
    qty INT
);
show tables;
desc books;
INSERT INTO books(id,title,author,price,qty) VALUES (1,'jdbc','john',120,5);
DESC books;
select * from books;
