CREATE SEQUENCE PUBLIC.SEC_USER START WITH 1;
CREATE TABLE PUBLIC.T_USER(ID bigint not null,  USER_ID VARCHAR(20), NAME VARCHAR(80), EMAIL VARCHAR(80));


CREATE SEQUENCE PUBLIC.SEC_POSTIT START WITH 1;
CREATE TABLE PUBLIC.T_POSTIT(id bigint not null,  ID_USER int, TITLE VARCHAR(100), TEXT VARCHAR(500), COLOR VARCHAR(5));