create schema if not exists account;

use account;

create table User(
                     phone varchar(25) primary key,
                     password varchar(120) not null,
                     email varchar(120) null
);