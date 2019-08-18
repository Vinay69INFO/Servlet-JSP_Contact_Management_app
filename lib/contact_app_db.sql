CREATE DATABASE contact_app_db;
USE contact_app_db;
CREATE TABLE user (
	userId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    phoneNo VARCHAR(50),
    emailId VARCHAR(50),
    address VARCHAR(150),
    userName VARCHAR(50) UNIQUE,
    password VARCHAR(50),
    role INT(1) DEFAULT 2,
    loginStatus INT(1) DEFAULT 1
);

CREATE TABLE contact (
	contactId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    userId INT,
    name VARCHAR(50),
    phoneNo VARCHAR(50),
    email VARCHAR(50),
    address VARCHAR(150),
    remark VARCHAR(150),
    CONSTRAINT FK_userContacts 
    FOREIGN KEY(userId) REFERENCES user(userId) 
    ON DELETE CASCADE
  ON UPDATE NO ACTION
);
