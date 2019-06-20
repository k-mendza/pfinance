CREATE TABLE public."USERS"
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

ALTER TABLE public."USERS"
    OWNER to postgres;
