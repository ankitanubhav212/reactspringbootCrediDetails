create schema credit;
use credit;
CREATE TABLE credit_card (id INTEGER NOT NULL,name varchar(40),limit_bal INTEGER,sex INTEGER,education INTEGER,marraige INTEGER,age INTEGER,pay_0 INTEGER,pay_2 INTEGER,pay_3 INTEGER,pay_4 INTEGER,pay_5 integer,pay_6 INTEGER,bill_amt1 INTEGER,bill_amt2 INTEGER,bill_amt3 INTEGER,bill_amt4 INTEGER,bill_amt5 INTEGER,bill_amt6 INTEGER,pay_amt1 INTEGER,pay_amt2 INTEGER,pay_amt3 INTEGER,pay_amt4 INTEGER,pay_amt5 INTEGER,pay_amt6 INTEGER,default_payment_nxt_mnth boolean);
LOAD DATA local  INFILE "credit_card.csv" into table credit_card FIELDS TERMINATED BY ',';
