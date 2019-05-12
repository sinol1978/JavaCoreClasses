create database catalog4
use catalog4;
create table users(
	id int(5) not null auto_increment,
	name varchar(50),
	primary key(id));

create table phones(
	id int(5) not null auto_increment,
	user_id int(5) not null,
	phone_number varchar(10),
	primary key(id)
);

create table rooms(
	id int(5) not null auto_increment,
	phone_id int(5) not null,
	room_number int(4) not null,
	primary key(id)
);

show tables
describe phones
describe rooms

insert into users (name) values ('Sidorov'),('James'),('Petrov'),('Ivanov')
select * from users

insert into phones (user_id, phone_number) values 
(1,'050111111'),(2,'0503333333'),(3,'09722222');
select * from phones

insert into rooms (phone_id, room_number) values 
(7,305),(8,306),(9,307);
select * from rooms

select id as ID, phone_number as Number from phones where phone_number like '050%' order by phone_number desc

select id as ID, phone_number as Number from phones where id>7 and user_id>1 order by phone_number desc

select count(phone_number) as Phones_Count from phones

select name as Имя, count(name) as Количество from users group by name having Количество>1

select rooms.room_number from users
inner join phones on users.id=phones.user_id
inner join rooms on phones.id=rooms.phone_id
where users.name='James'

select name, users.id from users left join phones on users.id=phones.user_id where phones.user_id is null

alter table phones add foreign key(user_id) references users(id)
alter table rooms add foreign key(phone_id) references phones(id)
select * from rooms, phones
