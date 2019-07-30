-- CREATE DATABASE pantry_project;		`
CREATE DATABASE my_pantry;

CREATE TABLE product (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE brand (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE barcode (
    id int NOT NULL AUTO_INCREMENT,
    barcode varchar(13) NOT NULL,
    brand_code varchar(5) NOT NULL,
    product_code varchar(5) NOT NULL UNIQUE,
    brand_id int NOT NULL, 
    product_id int NOT NULL,
    FOREIGN KEY (brand_id) REFERENCES brand(id),
    FOREIGN KEY (product_id) REFERENCES product(id),
    constraint UQ_brand_product UNIQUE (brand_id, product_id),
    PRIMARY KEY (id)
);

CREATE TABLE pantry (
    id int NOT NULL AUTO_INCREMENT,
    product_id int NOT NULL,
    expiration varchar(10) NOT NULL,
    quantity int NOT NULL,
    FOREIGN KEY (product_id) REFERENCES product(id),
    PRIMARY KEY (id)
);