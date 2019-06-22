CREATE TABLE public."USER"
(
    "ID" bigserial NOT NULL,
    "FIRST_NAME" character varying NOT NULL,
    "LAST_NAME" character varying NOT NULL,
    "EMAIL_ADDRESS" character varying NOT NULL,
    "CREATION_DATE" timestamp with time zone,
    "LAST_ACTIVITY" timestamp with time zone,
    PRIMARY KEY ("ID")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."USER"
    OWNER to postgres;

CREATE TABLE public."EXPENSE_CATEGORY"
(
    "ID" bigserial NOT NULL,
    "NAME" character varying NOT NULL,
    "DESCRIPTION" character varying,
    "CREATION_DATE" timestamp with time zone,
    PRIMARY KEY ("ID")
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public."EXPENSE_CATEGORY"
    OWNER to postgres;

CREATE TABLE public."EXPENSE"
(
    "ID" bigserial NOT NULL,
    "DESCRIPTION" character varying,
    "AMOUNT" decimal NOT NULL,
    "CURRENCY_ID" character varying,
    "CREATION_DATE" timestamp with time zone,
    "CATEGORY_ID" bigserial NOT NULL ,
    PRIMARY KEY ("ID")
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public."EXPENSE"
    OWNER to postgres;

CREATE TABLE public."INCOME_CATEGORY"
(
    "ID" bigserial NOT NULL,
    "NAME" character varying NOT NULL,
    "DESCRIPTION" character varying,
    "CREATION_DATE" timestamp with time zone,
    PRIMARY KEY ("ID")
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public."INCOME_CATEGORY"
    OWNER to postgres;

CREATE TABLE public."INCOME"
(
    "ID" bigserial NOT NULL,
    "DESCRIPTION" character varying,
    "AMOUNT" decimal NOT NULL,
    "CURRENCY_ID" character varying,
    "CREATION_DATE" timestamp with time zone,
    "CATEGORY_ID" bigserial NOT NULL ,
    PRIMARY KEY ("ID")
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public."INCOME"
    OWNER to postgres;
