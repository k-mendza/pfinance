-- USERS
INSERT INTO app_user (first_name, last_name, email_address, creation_date)
VALUES ('Developer','PFinance','devfinance@fin.com',current_date);

-- TRANSACTION CATEGORY
INSERT INTO transaction_category (name, description, creation_date)
VALUES ('Jedzenie','Zakupy spożywcze', current_date);

INSERT INTO transaction_category (name, description, creation_date)
VALUES ('Mieszkanie / dom', 'Kredyt, wynajem, czynsz do spółdzielni', current_date);

INSERT INTO transaction_category (name, description, creation_date)
VALUES ('Transport','Bilety komunikacji, paliwo', current_date);

INSERT INTO transaction_category (name, description, creation_date)
VALUES ('Telekomunikacja','Internet, komórka, telewizja', current_date);

INSERT INTO transaction_category (name, description, creation_date)
VALUES ('Opieka zdrowotna', 'Leczenie, konsultacje, badania, leki', current_date);

INSERT INTO transaction_category (name, description, creation_date)
VALUES ('Ubranie','Wydatki związane z odzieżą', current_date);

INSERT INTO transaction_category (name, description, creation_date)
VALUES ('Higiena', 'Środki czystości, kosmetyki', current_date);

INSERT INTO transaction_category (name, description, creation_date)
VALUES ('Dzieci', 'Dzieci', current_date);

INSERT INTO transaction_category (name, description, creation_date)
VALUES ('Rozrywka','Rozrywka', current_date);

INSERT INTO transaction_category (name, description, creation_date)
VALUES ('Inne wydatki','Koszty nie ujęte w innych kategoriach', current_date);

-- TRANSACTION SUBCATEGORY
INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (1 ,'Jedzenie dom','Jedzenie w domu, składniki itd.', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (1 ,'Jedzenie miasto','Jedzenie na mieście', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (1 ,'Jedzenie praca','Jedzenie w/do pracy', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (1 ,'Wyjścia','Wyjścia ze znajomymi', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (1 ,'Inne','Inne', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (2 ,'Czynsz','Czynsz', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (2 ,'Woda i kanalizacja','Woda i kanalizacja', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (2 ,'Prąd','Prąd', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (2 ,'Gaz','Gaz', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (2 ,'Ogrzewanie','Ogrzewanie', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (2 ,'Wywóz śmieci','Wywóz śmieci', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (2 ,'Konserwacja i naprawy','Konserwacja i naprawy', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (2 ,'Wyposażenie','Wyposażenie', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (2 ,'Ubezpieczenie nieruchomości','Ubezpieczenie nieruchomości', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (2 ,'Inne','Inne', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (3 ,'Paliwo','Paliwo', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (3 ,'Przeglądy i naprawy auta','Przeglądy i naprawy auta', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (3 ,'Wyposażenie dodatkowe pojazdu','Przeglądy i naprawy auta', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (3 ,'Ubezpieczenie pojazdu','Ubezpieczenie pojazdu', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (3 ,'Bilety komunikacji miejskiej','Bilety komunikacji miejskiej', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (3 ,'Bilet PKP, PKS','Bilet PKP, PKS', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (3 ,'Taxi','Taxi', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (3 ,'Inne','Inne', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (4 ,'Telefon komórkowy','Telefon komórkowy', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (4 ,'TV','TV', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (4 ,'Internet','Internet', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (4 ,'Inne','Inne', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (5 ,'Lekarz','Lekarz', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (5 ,'Badania','Badania', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (5 ,'Leki','Leki', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (5 ,'Inne','Inne', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (6 ,'Ubranie zwykłe','Ubranie zwykłe', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (6 ,'Ubranie sportowe','Ubranie sportowe', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (6 ,'Buty','Buty', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (6 ,'Dodatki','Dodatki', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (6 ,'Inne','Inne', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (7 ,'Kosmetyki','Kosmetyki', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (7 ,'Środki czystości','Środki czystości', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (7 ,'Fryzjer','Fryzjer', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (7 ,'Kosmetyczka','Kosmetyczka', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (7 ,'Inne','Inne', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (8 ,'Artykuły szkolne','Artykuły szkolne', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (8 ,'Dodatkowe zajęcia','Dodatkowe zajęcia', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (8 ,'Wpłaty na szkołę itp.','Wpłaty na szkołę itp.', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (8 ,'Zabawki / gry','Zabawki / gry', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (8 ,'Opieka nad dziećmi','Opieka nad dziećmi', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (8 ,'Inne','Inne', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (9 ,'Siłownia / Basen','Siłownia / Basen', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (9 ,'Kino / Teatr','Kino / Teatr', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (9 ,'Koncerty','Koncerty', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (9 ,'Czasopisma','Czasopisma', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (9 ,'Książki','Książki', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (9 ,'Hobby','Hobby', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (9 ,'Hotel / Turystyka','Hotel / Turystyka', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (9 ,'Inne','Inne', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (10 ,'Dobroczynność','Dobroczynność', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (10 ,'Prezenty','Prezenty', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (10 ,'Sprzęt RTV','Sprzęt RTV', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (10 ,'Oprogramowanie','Oprogramowanie', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (10 ,'Edukacja / Szkolenia','Edukacja / Szkolenia', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (10 ,'Inne usługi','Inne usługi', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (10 ,'Podatki','Podatki', current_date);

INSERT INTO transaction_subcategory (category_id, name, description, creation_date)
VALUES (10 ,'Inne','Inne', current_date);

-- PAYEE --
INSERT INTO payee (name, description, creation_date)
VALUES ('Biedronka', 'Sieć sklepów Jeronimo Martins', current_date);

INSERT INTO payee (name, description, creation_date)
VALUES ('Chang Jang', 'Właściciel chinola', current_date);

-- CURRENCY --
INSERT INTO currency (id, description, creation_date)
VALUES ('PLN', 'Polski złoty', current_date);

-- PAY SOURCES --
INSERT INTO pay_source (name, description, creation_date)
VALUES ('Karta IDEA', 'Karta płatnicza IDEA Banku', current_date);

-- TRANSACTIONS --
INSERT INTO transaction (app_user_id, payee_id, pay_source_id, title, description, amount, currency_id, flg_tax, flg_obligatory, flg_cyclical, category_id, creation_date, subcategory_id)
VALUES (1, 1, 1, 'Zakupy', 'Biedronka', 50.0, 'PLN', 'N','N','N', 1, current_date, 1);

INSERT INTO transaction (app_user_id, payee_id, pay_source_id, title, description, amount, currency_id, flg_tax, flg_obligatory, flg_cyclical, category_id, creation_date, subcategory_id)
VALUES (1, 2, 1, 'Obiad', 'Chińczyk', 20.0, 'PLN', 'N','N','N', 1, current_date, 3);
commit;
