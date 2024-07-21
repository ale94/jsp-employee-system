CREATE TABLE employee
(
    id           bigserial NOT NULL,
    name   varchar(20) NOT NULL,
    department   varchar(50) NOT NULL,
    salary double precision NOT NULL,
    CONSTRAINT pk_fly PRIMARY KEY (id)
);