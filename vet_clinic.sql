--
-- PostgreSQL database dump
--

-- Dumped from database version 13.1
-- Dumped by pg_dump version 13.1

-- Started on 2021-09-28 10:55:31

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 201 (class 1259 OID 107391)
-- Name: clinic; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.clinic (
    id integer NOT NULL,
    name character varying(255) NOT NULL,
    address character varying(255) NOT NULL,
    phone character varying(20),
    email character varying(100),
    facebook character varying(255),
    twitter character varying(255)
);


ALTER TABLE public.clinic OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 107389)
-- Name: clinic_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.clinic_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.clinic_id_seq OWNER TO postgres;

--
-- TOC entry 3051 (class 0 OID 0)
-- Dependencies: 200
-- Name: clinic_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.clinic_id_seq OWNED BY public.clinic.id;


--
-- TOC entry 203 (class 1259 OID 107417)
-- Name: doctor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.doctor (
    id integer NOT NULL,
    name character varying(255) NOT NULL,
    phone character varying(20),
    bio text,
    photo character varying(255),
    clinic_id integer NOT NULL
);


ALTER TABLE public.doctor OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 107415)
-- Name: doctor_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.doctor_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.doctor_id_seq OWNER TO postgres;

--
-- TOC entry 3052 (class 0 OID 0)
-- Dependencies: 202
-- Name: doctor_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.doctor_id_seq OWNED BY public.doctor.id;


--
-- TOC entry 205 (class 1259 OID 107435)
-- Name: owner; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.owner (
    id integer NOT NULL,
    name character varying(255) NOT NULL,
    phone character varying(20),
    address character varying(255),
    gender character varying(10) NOT NULL
);


ALTER TABLE public.owner OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 107433)
-- Name: owner_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.owner_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.owner_id_seq OWNER TO postgres;

--
-- TOC entry 3053 (class 0 OID 0)
-- Dependencies: 204
-- Name: owner_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.owner_id_seq OWNED BY public.owner.id;


--
-- TOC entry 207 (class 1259 OID 107450)
-- Name: pet; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pet (
    id integer NOT NULL,
    name character varying(255) NOT NULL,
    kind character varying NOT NULL,
    gender character varying(10) NOT NULL,
    photo character varying(255),
    birth_date date NOT NULL,
    weight numeric NOT NULL,
    owner_id integer NOT NULL
);


ALTER TABLE public.pet OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 107448)
-- Name: pet_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.pet_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pet_id_seq OWNER TO postgres;

--
-- TOC entry 3054 (class 0 OID 0)
-- Dependencies: 206
-- Name: pet_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.pet_id_seq OWNED BY public.pet.id;


--
-- TOC entry 209 (class 1259 OID 107468)
-- Name: visit; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.visit (
    id integer NOT NULL,
    clinic_id integer NOT NULL,
    pet_id integer NOT NULL,
    doctor_id integer NOT NULL,
    visit_date date
);


ALTER TABLE public.visit OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 107466)
-- Name: visit_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.visit_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.visit_id_seq OWNER TO postgres;

--
-- TOC entry 3055 (class 0 OID 0)
-- Dependencies: 208
-- Name: visit_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.visit_id_seq OWNED BY public.visit.id;


--
-- TOC entry 2878 (class 2604 OID 107394)
-- Name: clinic id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clinic ALTER COLUMN id SET DEFAULT nextval('public.clinic_id_seq'::regclass);


--
-- TOC entry 2879 (class 2604 OID 107420)
-- Name: doctor id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.doctor ALTER COLUMN id SET DEFAULT nextval('public.doctor_id_seq'::regclass);


--
-- TOC entry 2880 (class 2604 OID 107438)
-- Name: owner id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.owner ALTER COLUMN id SET DEFAULT nextval('public.owner_id_seq'::regclass);


--
-- TOC entry 2881 (class 2604 OID 107453)
-- Name: pet id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pet ALTER COLUMN id SET DEFAULT nextval('public.pet_id_seq'::regclass);


--
-- TOC entry 2882 (class 2604 OID 107471)
-- Name: visit id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.visit ALTER COLUMN id SET DEFAULT nextval('public.visit_id_seq'::regclass);


--
-- TOC entry 3037 (class 0 OID 107391)
-- Dependencies: 201
-- Data for Name: clinic; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.clinic (id, name, address, phone, email, facebook, twitter) FROM stdin;
1	clinic 1	Giza - 6 October	002584765	clinic@gmail.com	\N	\N
\.


--
-- TOC entry 3039 (class 0 OID 107417)
-- Dependencies: 203
-- Data for Name: doctor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.doctor (id, name, phone, bio, photo, clinic_id) FROM stdin;
1	Clinic 1	00225843	testing bio ...	photo1.jpg	1
\.


--
-- TOC entry 3041 (class 0 OID 107435)
-- Dependencies: 205
-- Data for Name: owner; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.owner (id, name, phone, address, gender) FROM stdin;
\.


--
-- TOC entry 3043 (class 0 OID 107450)
-- Dependencies: 207
-- Data for Name: pet; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.pet (id, name, kind, gender, photo, birth_date, weight, owner_id) FROM stdin;
\.


--
-- TOC entry 3045 (class 0 OID 107468)
-- Dependencies: 209
-- Data for Name: visit; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.visit (id, clinic_id, pet_id, doctor_id, visit_date) FROM stdin;
\.


--
-- TOC entry 3056 (class 0 OID 0)
-- Dependencies: 200
-- Name: clinic_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.clinic_id_seq', 1, false);


--
-- TOC entry 3057 (class 0 OID 0)
-- Dependencies: 202
-- Name: doctor_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.doctor_id_seq', 1, false);


--
-- TOC entry 3058 (class 0 OID 0)
-- Dependencies: 204
-- Name: owner_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.owner_id_seq', 1, false);


--
-- TOC entry 3059 (class 0 OID 0)
-- Dependencies: 206
-- Name: pet_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pet_id_seq', 1, false);


--
-- TOC entry 3060 (class 0 OID 0)
-- Dependencies: 208
-- Name: visit_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.visit_id_seq', 1, false);


--
-- TOC entry 2884 (class 2606 OID 107401)
-- Name: clinic clinic_name_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clinic
    ADD CONSTRAINT clinic_name_key UNIQUE (name);


--
-- TOC entry 2886 (class 2606 OID 107399)
-- Name: clinic clinic_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clinic
    ADD CONSTRAINT clinic_pkey PRIMARY KEY (id);


--
-- TOC entry 2888 (class 2606 OID 107427)
-- Name: doctor doctor_name_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.doctor
    ADD CONSTRAINT doctor_name_key UNIQUE (name);


--
-- TOC entry 2890 (class 2606 OID 107425)
-- Name: doctor doctor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.doctor
    ADD CONSTRAINT doctor_pkey PRIMARY KEY (id);


--
-- TOC entry 2892 (class 2606 OID 107445)
-- Name: owner owner_name_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.owner
    ADD CONSTRAINT owner_name_key UNIQUE (name);


--
-- TOC entry 2894 (class 2606 OID 107443)
-- Name: owner owner_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.owner
    ADD CONSTRAINT owner_pkey PRIMARY KEY (id);


--
-- TOC entry 2896 (class 2606 OID 107460)
-- Name: pet pet_name_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pet
    ADD CONSTRAINT pet_name_key UNIQUE (name);


--
-- TOC entry 2898 (class 2606 OID 107458)
-- Name: pet pet_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pet
    ADD CONSTRAINT pet_pkey PRIMARY KEY (id);


--
-- TOC entry 2900 (class 2606 OID 107473)
-- Name: visit visit_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.visit
    ADD CONSTRAINT visit_pkey PRIMARY KEY (id);


--
-- TOC entry 2904 (class 2606 OID 107479)
-- Name: visit clinicfk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.visit
    ADD CONSTRAINT clinicfk FOREIGN KEY (clinic_id) REFERENCES public.clinic(id);


--
-- TOC entry 2905 (class 2606 OID 107484)
-- Name: visit doctorfk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.visit
    ADD CONSTRAINT doctorfk FOREIGN KEY (doctor_id) REFERENCES public.doctor(id);


--
-- TOC entry 2901 (class 2606 OID 107428)
-- Name: doctor fk_clinic_doctor; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.doctor
    ADD CONSTRAINT fk_clinic_doctor FOREIGN KEY (clinic_id) REFERENCES public.clinic(id);


--
-- TOC entry 2902 (class 2606 OID 107461)
-- Name: pet owenr_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pet
    ADD CONSTRAINT owenr_fk FOREIGN KEY (owner_id) REFERENCES public.owner(id);


--
-- TOC entry 2903 (class 2606 OID 107474)
-- Name: visit pet_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.visit
    ADD CONSTRAINT pet_fk FOREIGN KEY (pet_id) REFERENCES public.pet(id);


-- Completed on 2021-09-28 10:55:31

--
-- PostgreSQL database dump complete
--

