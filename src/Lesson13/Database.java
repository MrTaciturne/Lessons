package Lesson13;
//CREATE DATABASE company_repository;
//
//        CREATE SCHEMA company_storage;
//
//        CREATE TABLE company(
//        id SERIAL PRIMARY KEY,
//        name varchar(128) UNIQUE,
//        date DATE NOT NULL CHECK ( date > '1995-01-01' AND date < '2023-09-18')
//        );

//        DROP TABLE company;

//        --Ограничения:
//        --NOT NULL - Не пустость
//        --UNIQUE - Уникальность
//        --CHECK - Првоерка соответствия
//        --PRIMARY KEY - Главный ключ
//        --FOREIGN KEY - Для связывания
//
//        INSERT INTO company(name, date)
//        VALUES ('Apple', '2001-01-01'),
//        ('Google', '2002-01-02'),
//        ('Amazon', '2003-01-10');
//
//        CREATE TABLE employee(
//        id SERIAL PRIMARY KEY,
//        first_name varchar(128) NOT NULL,
//        last_name varchar(128) NOT NULL,
//        company_id INT REFERENCES company(id),
//        salary INT,
//        UNIQUE (first_name, last_name) --Совместное совпадение
//        );
//
//        DROP TABLE employee;
//
//        INSERT INTO employee(FIRST_NAME, LAST_NAME, COMPANY_ID, SALARY)
//        VALUES ('Ivan','Ivanov',2,1000),
//        ('Petr','Petrov',1,2000),
//        ('Maks','Maksimov',3,1500),
//        ('Adnrey','Andreev',NULL,NULL);
//
//        SELECT
//        first_name, salary
//        FROM employee
//        ORDER BY salary
//        LIMIT 2
//        OFFSET 2;
//
//        SELECT
//        first_name, salary
//        FROM employee
//        WHERE first_name = 'Ivan'; -- WHERE last_name LIKE '%ov' окончание
//        -- BETWEEN 1500 AND 2000 Между
//        -- WHERE first_name IN ('Maks', 'Andrey')
//
//        SELECT
//        max(salary) AS max_salary -- Элиас
//        FROM employee e;
//
//        SELECT e.last_name
//        FROM employee e; --Элиасы (переназначение имени)
//
//        -- Агрегирующие функции
//        -- max(), min(), avg(), count(), sum()
//
//        -- DESC - нисходящий порядок
//
//        SELECT now();
//        SELECT lower(first_name)
//        FROM employee;
//
//        SELECT (first_name),
//        first_name || ' ' || employee.last_name fio --Конкретенация
//        FROM employee;
//
//        SELECT sum(salary)
//        FROM (SELECT salary
//        FROM employee
//        ORDER BY salary
//        LIMIT 2) min_salary; --Подзапрос \ Создание таблицы внутри выборки
//
//        SELECT salary, (SELECT max(salary)
//        FROM (SELECT salary
//        FROM employee
//        ORDER BY salary
//        LIMIT 2) min_salary)
//        FROM employee;
//
//        SELECT id, first_name
//        FROM employee
//        WHERE salary = (SELECT max(salary)
//        FROM (SELECT salary
//        FROM employee) min_salary);
//
//        DELETE
//        FROM employee
//        WHERE id = 5;
//
//        UPDATE employee
//        SET company_id = 3
//        WHERE id = 8;
//
//        --
//        --
//        --
//
//        CREATE DATABASE books;
//
//        CREATE TABLE author
//        (
//        id         SERIAL PRIMARY KEY,
//        first_name VARCHAR(128) NOT NULL,
//        last_name  VARCHAR(128) NOT NULL
//        );
//
//        CREATE TABLE book
//        (
//        id        BIGSERIAL PRIMARY KEY,
//        name      VARCHAR(128) NOT NULL,
//        year      SMALLINT     NOT NULL,
//        pages     SMALLINT     NOT NULL,
//        author_id INT REFERENCES author (id) ON DELETE CASCADE
//        );
//
//        INSERT INTO author (first_name, last_name)
//        VALUES ('Кей', 'Хорстманн'),
//        ('Стивен', 'Кови'),
//        ('Тони', 'Роббинс'),
//        ('Наполеон', 'Хилл'),
//        ('Роберт', 'Кийосаки'),
//        ('Дейл', 'Карнеги');
//
//        SELECT *
//        FROM author;
//
//        INSERT INTO book (name, year, pages, author_id)
//        VALUES ('Java. Библиотеку профессионала. Том 1', 2010, 1102, (SELECT id FROM author WHERE last_name = 'Хорстманн')),
//        ('Java. Библиотеку профессионала. Том 2', 2012, 954, (SELECT id FROM author WHERE last_name = 'Хорстманн')),
//        ('Java SE 8. Вводный курс', 2015, 203, (SELECT id FROM author WHERE last_name = 'Хорстманн')),
//        ('7 навыков высокоэффективных людей', 1989, 396, (SELECT id FROM author WHERE last_name = 'Кови')),
//        ('Разбуди в себе исполина', 1991, 576, (SELECT id FROM author WHERE last_name = 'Роббинс')),
//        ('Думай и богатей', 1937, 336, (SELECT id FROM author WHERE last_name = 'Хилл')),
//        ('Богатый папа, бедный папа', 1997, 352, (SELECT id FROM author WHERE last_name = 'Кийосаки')),
//        ('Квадрант денежного потока', 1998, 368, (SELECT id FROM author WHERE last_name = 'Кийосаки')),
//        ('Как перестать беспокоиться и начать жить', 1948, 368, (SELECT id FROM author WHERE last_name = 'Карнеги')),
//        ('Как завоевывать друзей и оказывать влияние на людей', 1936, 352,
//        (SELECT id FROM author WHERE last_name = 'Карнеги'));
//
//        SELECT *
//        FROM book;
//
//        SELECT name, year, (SELECT a.first_name
//        FROM author a
//        WHERE a.id = b.author_id)
//        FROM book b
//        ORDER BY b.year;
//
//        SELECT name, year, (SELECT a.first_name
//        FROM author a
//        WHERE a.id = b.author_id)
//        FROM book b
//        ORDER BY b.year DESC;
//
//        SELECT count(b.name)
//        FROM book b
//        WHERE author_id = 1;
//
//        SELECT count(b.name) Key_count_books
//        FROM book b
//        WHERE (SELECT a.first_name
//        FROM author a
//        WHERE a.id = b.author_id) = 'Кей';
//
//        SELECT count(b.name) Robert_count_books
//        FROM book b
//        WHERE (SELECT a.first_name
//        FROM author a
//        WHERE a.id = b.author_id) = 'Роберт';
//
//        --Книги с колличеством страниц выше среднего
//
//
//        SELECT e.first_name, c.name
//        FROM employee e, company c; --Фигня
//
//        SELECT e.first_name, c.name
//        FROM employee e
//        INNER JOIN company c         -- Left outer join -- Full outer join
//        on e.company_id = c.id;
//
//        SELECT c.name, max(salary) max_salary
//        FROM employee
//        JOIN company c
//        on c.id = employee.company_id
//        GROUP BY c.name
//        HAVING max(salary) > 1800; --Соответствие \ идёт вместе с Groop By
