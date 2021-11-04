CREATE TABLE capacities (
	id int not null primary key identity(1,1),
	name varchar(255) not null,
	power int not null,
	type varchar(255) not null
);

CREATE TABLE pokemon (
	id int not null primary key identity(1,1),
	name varchar(255) not null,
	life_points int not null,
	attack_strength int not null,
	defence_strength int not null,
	speed int not null,
	type varchar(255) not null,
	capacity int not null,
	CONSTRAINT FK_Capacity_Pokemon FOREIGN KEY (capacity) REFERENCES Capacities(id)

);
