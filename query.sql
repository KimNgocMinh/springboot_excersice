create schema if not exists account;

use account;

create table User(
                     phone varchar(25) primary key,
                     password varchar(120) not null,
                     email varchar(120) null
);

create table movies (
                        id bigint primary key not null ,
                        movie_name varchar(255) not null,
                        popularity boolean not null,
                        status boolean not null,
                        rate_top double null,
                        information text null,
                        created_timestamp timestamp null,
                        last_updated_timestamp timestamp null
);

create table favorite_movies(
                                id bigint primary key auto_increment,
                                user_id varchar(25) not null,
                                movie_id bigint not null,
                                foreign key (user_id) references user(phone),
                                foreign key (movie_id) references movies(id)
);

