alter table pet drop foreign key FK9hxka0oqkd15dmqstdarori08;
drop table if exists pet;
drop table if exists user;
create table pet (id bigint not null auto_increment, name varchar(255) not null, user_id bigint, primary key (id)) engine=InnoDB;
create table user (id bigint not null auto_increment, password varchar(255) not null, role varchar(255) not null, userName varchar(255) not null, primary key (id)) engine=InnoDB;
alter table pet add constraint UK_5prk4wplqa8iw7cbr99vxvho unique (name);
alter table user add constraint UK_4bakctviobmdk6ddh2nwg08c2 unique (userName);
alter table pet add constraint FK9hxka0oqkd15dmqstdarori08 foreign key (user_id) references user (id);
