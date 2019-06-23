-- USERS
INSERT INTO app_user (first_name, last_name, email_address, creation_date)
VALUES ('Developer','PFinance','devfinance@fin.com',current_date);

-- EXPENSES CATEGORY
INSERT INTO expense_category (name, description, creation_date)
VALUES ('Jedzenie','Zakupy spożywcze', current_date);

INSERT INTO expense_category (name, description, creation_date)
VALUES ('Mieszkanie / dom', 'Kredyt, wynajem, czynsz do spółdzielni', current_date);

INSERT INTO expense_category (name, description, creation_date)
VALUES ('Rachunki i opłaty', 'Koszty mieszkaniowe nie ujęte w innych kategoriach', current_date);

INSERT INTO expense_category (name, description, creation_date)
VALUES ('Opieka zdrowotna', 'Leczenie, konsultacje, badania, leki', current_date);

INSERT INTO expense_category (name, description, creation_date)
VALUES ('Higiena', 'Środki czystości, kosmetyki', current_date);

INSERT INTO expense_category (name, description, creation_date)
VALUES ('Ubranie','Wydatki związane z odzieżą', current_date);

INSERT INTO expense_category (name, description, creation_date)
VALUES ('Relaks','Kino, teatr, książki i hobby', current_date);

INSERT INTO expense_category (name, description, creation_date)
VALUES ('Transport','Bilety komunikacji, paliwo', current_date);

INSERT INTO expense_category (name, description, creation_date)
VALUES ('Telekomunikacja','Internet, komórka, telewizja', current_date);

INSERT INTO expense_category (name, description, creation_date)
VALUES ('Inne wydatki','Koszty nie ujęte w innych kategoriach', current_date);

-- EXPENSES SUBCATEGORY
INSERT INTO expense_category (category_id, name, description, creation_date)
VALUES (1 ,'Jedzenie dom','Jedzenie w domu, składniki itd.', current_date);

INSERT INTO expense_category (category_id, name, description, creation_date)
VALUES (1 ,'Jedzenie miasto','Jedzenie na mieście', current_date);

INSERT INTO expense_category (category_id, name, description, creation_date)
VALUES (1 ,'Jedzenie prace','Jedzenie w/do pracy', current_date);

INSERT INTO expense_category (category_id, name, description, creation_date)
VALUES (1 ,'Wyjścia','Wyjścia ze znajomymi', current_date);

INSERT INTO expense_category (category_id, name, description, creation_date)
VALUES (1 ,'Inne','Inne', current_date);

-- EXPENSES
INSERT INTO expense (app_user_id, title, description, amount, currency_id, category_id, subcategory_id)
VALUES (1, 'Zakupy', 'Biedronka', 50.0, 1, 1, 1);

commit;
