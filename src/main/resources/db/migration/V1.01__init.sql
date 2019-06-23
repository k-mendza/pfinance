CREATE TABLE public.app_user
(
    id bigserial NOT NULL,
    first_name character varying NOT NULL,
    last_name character varying NOT NULL,
    email_address character varying NOT NULL,
    creation_date timestamp with time zone,
    last_activity timestamp with time zone,
    PRIMARY KEY (id)
)
WITH (
    OidS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.app_user
    OWNER to postgres;

CREATE TABLE public.expense_category
(
    id bigserial NOT NULL,
    name character varying NOT NULL,
    description character varying,
    creation_date timestamp with time zone,
    PRIMARY KEY (id)
)
    WITH (
        OidS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public.expense_category
    OWNER to postgres;

CREATE TABLE public.expense_subcategory
(
    id bigserial NOT NULL,
    category_id bigserial NOT NULL,
    name character varying NOT NULL,
    description character varying,
    creation_date timestamp with time zone,
    PRIMARY KEY (id)
)
    WITH (
        OidS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public.expense_subcategory
    OWNER to postgres;

CREATE TABLE public.expense
(
    id bigserial NOT NULL,
    app_user_id bigserial NOT NULL,
    title character varying,
    description character varying,
    amount decimal NOT NULL,
    currency_id character varying,
    creation_date timestamp with time zone,
    category_id bigserial NOT NULL,
    subcategory_id bigserial NOT NULL,
    PRIMARY KEY (id)
)
    WITH (
        OidS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public.expense
    OWNER to postgres;

CREATE TABLE public.income_category
(
    id bigserial NOT NULL,
    name character varying NOT NULL,
    description character varying,
    creation_date timestamp with time zone,
    PRIMARY KEY (id)
)
    WITH (
        OidS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public.income_category
    OWNER to postgres;

CREATE TABLE public.income_subcategory
(
    id bigserial NOT NULL,
    category_id bigserial NOT NULL,
    name character varying NOT NULL,
    description character varying,
    creation_date timestamp with time zone,
    PRIMARY KEY (id)
)
    WITH (
        OidS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public.income_subcategory
    OWNER to postgres;

CREATE TABLE public.income
(
    id bigserial NOT NULL,
    app_user_id bigserial NOT NULL,
    title character varying,
    description character varying,
    amount decimal NOT NULL,
    currency_id character varying,
    creation_date timestamp with time zone,
    category_id bigserial NOT NULL,
    subcategory_id bigserial NOT NULL,
    PRIMARY KEY (id)
)
    WITH (
        OidS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public.income
    OWNER to postgres;