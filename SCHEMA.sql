-- # alter table orders
-- #     drop foreign key FKhwb4y673okgt2yuvxrdim6yeo;
-- # alter table orders
-- #     drop foreign key FKjp7lhaugpjb7u4su3h2khmnb3;
-- # alter table orders
-- #     drop foreign key FK7w5elqmehyp6yp8di8juemso7;
-- # alter table orders_item
-- #     drop foreign key FKlrqyo8q92lfie02g03gp8l89x;
-- # alter table orders_item
-- #     drop foreign key FKruyqb48dne96c3h7ypby8k39i;
-- # alter table orders_item
-- #     drop foreign key FKqa7i0ev3xqm2d6t93n9blxef1;
-- -- alter table product
-- #     drop foreign key FKfq5l3xbmjnklegxpwm1yeodkj;
drop table if exists user;
drop table if exists pet;

-- alter table pet drop foreign key FK9hxka0oqkd15dmqstdarori08;
-- drop table if exists pet;
-- drop table if exists user;
-- create table pet (id bigint not null auto_increment, name varchar(255) not null, user_id bigint, primary key (id)) engine=InnoDB;
-- create table user (id bigint not null auto_increment, password varchar(255) not null, role varchar(255) not null, userName varchar(255) not null, primary key (id)) engine=InnoDB;
-- alter table pet add constraint UK_5prk4wplqa8iw7cbr99vxvho unique (name);
-- alter table user add constraint UK_4bakctviobmdk6ddh2nwg08c2 unique (userName);
-- alter table pet add constraint FK9hxka0oqkd15dmqstdarori08 foreign key (user_id) references user (id);
--
--

create table user (
    id bigint not null auto_increment,
    password varchar(255) not null,
    role varchar(255) not null,
    user_name varchar(255) not null,
    geo_lat DECIMAL(12,6),
    geo_lng DECIMAL(12,6),
    primary key (id)) engine=InnoDB;

create table pet (
    id bigint not null auto_increment,
    type varchar(255) not null,
    name varchar(255) not null,
    user_id bigint,
    primary key (id)) engine=InnoDB;


-- # alter table category
-- #     drop foreign key FK2twm010w181ypxiegra4o0rgc;
-- # alter table category
-- #     add constraint FK2twm010w181ypxiegra4o0rgc foreign key (company_id) references company (id);

alter table user add constraint uk_user_name unique (user_name);
alter table pet add constraint fk_pet_user foreign key (user_id) references user (id);