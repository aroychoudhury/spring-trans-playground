CREATE TABLE users (
  id         INTEGER PRIMARY KEY,
  first_name VARCHAR(50),
  last_name  VARCHAR(50)
);

CREATE TABLE addresses (
  id         INTEGER PRIMARY KEY,
  uderid     INTEGER,
  address1   VARCHAR(50),
  address2   VARCHAR(50),
  city       VARCHAR(30),
  pincode    VARCHAR(6)
);