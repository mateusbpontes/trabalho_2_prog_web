CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username VARCHAR(10) UNIQUE NOT NULL,
	password VARCHAR(10) NOT NULL,
	name VARCHAR(100) NOT NULL,
	admin BOOLEAN NOT NULL
);

CREATE TABLE products (
	id serial primary key,
	name varchar(255) not null;
  description varchar(255);
	count integer;
);
