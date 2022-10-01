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
                        avg_rate double null,
                        information text null
);

create table favorite_movies(
                                user_id varchar(25) not null references user(phone),
                                movie_id bigint not null references movies(id),
                                primary key (user_id,movie_id)
);

create table rate
(
    user_id  varchar(25) not null references user(phone),
    movie_id bigint      not null references movies(id),
    score    double      not null,
    primary key (user_id, movie_id)
);




