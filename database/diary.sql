CREATE DATABASE diary;
 
USE diary;
 
CREATE TABLE memoryAll
(
    memoryID           INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    memoryName         VARCHAR(255)
);
 
CREATE TABLE memoryMoment
(
memoryMomentID         INT NOT NULL PRIMARY KEY IDENTITY(1,1),
memoryMomentDate       DATE NOT NULL,
memoryMomentTime       TIME NOT NULL,
memoryID               INT ,
FOREIGN KEY (memoryID) REFERENCES memoryAll(memoryID)
                       ON DELETE SET NULL
);
 
CREATE TABLE memoryPlace
(
memoryPlaceID         INT NOT NULL PRIMARY KEY IDENTITY(1,1),
memoryPlaceName       VARCHAR(255) NOT NULL,
memoryID              INT,
FOREIGN KEY(memoryID) REFERENCES memoryAll(memoryID)
                      ON DELETE SET NULL
);
 
CREATE TABLE memoryDescription
(
memoryDescriptionID   INT NOT NULL
                      PRIMARY KEY IDENTITY(1,1),
memoryDescriptionFull VARCHAR(255) NOT NULL,
memoryID              INT,
FOREIGN KEY(memoryID) REFERENCES memoryAll(memoryID)
                      ON DELETE SET NULL
);
 
INSERT INTO memoryAll(memoryName)
VALUES('new pet');
INSERT INTO memoryAll(memoryName)
VALUES('gift received');
INSERT INTO memoryAll(memoryName)
VALUES('new mobile');
 
INSERT INTO memoryMoment(memoryMomentDate,memoryMomentTime,memoryID)
VALUES('2016-12-19','12:30:14',1);
INSERT INTO memoryMoment(memoryMomentDate,memoryMomentTime,memoryID)
VALUES('2017-1-1','2:30:14',2);
INSERT INTO memoryMoment(memoryMomentDate,memoryMomentTime,memoryID)
VALUES('2016-12-31','1:30:14',3);
 
INSERT INTO memoryPlace(memoryPlaceName,memoryID)
VALUES('DHAKA',1);
INSERT INTO memoryPlace(memoryPlaceName,memoryID)
VALUES('RANGPUR',2);
INSERT INTO memoryPlace(memoryPlaceName,memoryID)
VALUES('BARISHAL',3);
 
INSERT INTO memoryDescription(memoryDescriptionFull,memoryID)
VALUES('I have bought a new white cat',1);
INSERT INTO memoryDescription(memoryDescriptionFull,memoryID)
VALUES('one of my best friends have sent me a black whiteboard marker',2);
INSERT INTO memoryDescription(memoryDescriptionFull,memoryID)
VALUES('I have bought a new samsung galaxy note IV',3);