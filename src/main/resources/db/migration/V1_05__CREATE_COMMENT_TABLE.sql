CREATE TABLE COMMENT
(
    ID     NUMBER,
    POST_ID   NUMBER,
    CONTENT    VARCHAR(100),
    FOREIGN KEY(POST_ID) REFERENCES POST,

PRIMARY KEY (ID)
);

