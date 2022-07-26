drop schema if exists train_tracker;
create schema if not exists train_tracker;
use train_tracker;

create table if not exists customer (
    customer_id int,
    first_name varchar(50),
    last_name varchar(50),
    email varchar(50),
    password varchar(50),
    mobile varchar(50)
);


create table if not exists train (
    train_id int,
    name varchar(50),
    model varchar(50),
    manufacturer varchar(50),
    year varchar(50),
    total_seats int,
    seat_layout varchar(50),
    power_type varchar(50)
);

create table if not exists ticket (
    ticket_id int,
    route_id int,
    customer_id int,
    first_name varchar(50),
    source_station_id int,
    destination_station_id int,
    price decimal,
    ticket_date varchar(50),
    seat_no varchar(50)
);

create table if not exists route (
route_id int,
name varchar(50),
train_id int,
sourceStationId int,
destinationStationId int
);