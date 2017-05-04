-- Sequence --

-- Id Increment on Table Customer --
CREATE SEQUENCE public.tb_customer_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.tb_customer_id_seq
  OWNER TO postgres;

-- Id Increment on Table Employee --  
CREATE SEQUENCE public.tb_employee_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.tb_employee_id_seq
  OWNER TO postgres;
  
-- Id Increment on Table Login --  
CREATE SEQUENCE public.tb_login_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.tb_login_id_seq
  OWNER TO postgres;
  
-- Id Increment on Table Roles -- 
CREATE SEQUENCE public.tb_roles_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.tb_roles_id_seq
  OWNER TO postgres;

-- Table --  
  
-- Table Customer --
CREATE TABLE public.tb_customer
(
  cus_id integer NOT NULL DEFAULT nextval('tb_customer_id_seq'::regclass),
  cus_address character varying(255),
  cus_dob timestamp without time zone,
  cus_email character varying(255),
  cus_name character varying(255),
  cus_phone character varying(255),
  CONSTRAINT tb_customer_pkey PRIMARY KEY (cus_id)
)

-- Table Employee --
CREATE TABLE tb_employee
(
  emp_id integer NOT NULL DEFAULT nextval('tb_employee_id_seq'::regclass),
  emp_address character varying(255),
  emp_dob timestamp without time zone,
  emp_identity_number character varying(255),
  emp_join_date timestamp without time zone,
  emp_name character varying(255),
  emp_phone character varying(255),
  login_id integer NOT NULL,
  CONSTRAINT tb_employee_pkey PRIMARY KEY (emp_id),
  CONSTRAINT fkltonm99ulhfoq5uymmu6q5gcx FOREIGN KEY (login_id)
      REFERENCES public.tb_login (login_id) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
)

-- Table Login --
CREATE TABLE tb_login
(
  login_id integer NOT NULL DEFAULT nextval('tb_login_id_seq'::regclass),
  password character varying(255),
  username character varying(255),
  role_id integer NOT NULL,
  CONSTRAINT tb_login_pkey PRIMARY KEY (login_id),
  CONSTRAINT fk9eb0sjh9hjp83emes0kuaqs3v FOREIGN KEY (role_id)
      REFERENCES public.tb_roles (role_id) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
)

-- Table Roles --
CREATE TABLE public.tb_roles
(
  role_id integer NOT NULL DEFAULT nextval('tb_roles_id_seq'::regclass),
  role_description character varying(255),
  role_name character varying(255),
  CONSTRAINT tb_roles_pkey PRIMARY KEY (role_id)
)
 

