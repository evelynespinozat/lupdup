
/* Drop Tables */

DROP TABLE IF EXISTS lupdup.t_donante_campania;
DROP TABLE IF EXISTS lupdup.t_donante_cuestionario_rpta;
DROP TABLE IF EXISTS lupdup.t_allegados;
DROP TABLE IF EXISTS lupdup.t_campania;
DROP TABLE IF EXISTS lupdup.t_catalogo;
DROP TABLE IF EXISTS lupdup.t_cita;
DROP TABLE IF EXISTS lupdup.t_detalle_ficha;
DROP TABLE IF EXISTS lupdup.t_ficha;
DROP TABLE IF EXISTS lupdup.t_sede_salud_usuario;
DROP TABLE IF EXISTS lupdup.t_sede_salud;
DROP TABLE IF EXISTS lupdup.t_centro_salud;
DROP TABLE IF EXISTS lupdup.t_cuestionario;
DROP TABLE IF EXISTS lupdup.t_historial_puntos;
DROP TABLE IF EXISTS lupdup.t_donante;
DROP TABLE IF EXISTS lupdup.t_sede_entidad_colaboradora_usuario;
DROP TABLE IF EXISTS lupdup.t_sede_entidad_colaboradora;
DROP TABLE IF EXISTS lupdup.t_entidad_colaboradora;
DROP TABLE IF EXISTS lupdup.t_imagen;
DROP TABLE IF EXISTS lupdup.t_usuario_perfil;
DROP TABLE IF EXISTS lupdup.t_perfil;
DROP TABLE IF EXISTS lupdup.t_ubigeo;
DROP TABLE IF EXISTS lupdup.t_usuario;



/* Drop Sequences */

DROP SEQUENCE IF EXISTS lupdup.t_campania_id_campania_seq;
DROP SEQUENCE IF EXISTS lupdup.t_catalogo_id_catalogo_seq;
DROP SEQUENCE IF EXISTS lupdup.t_centrosalud_id_centrosalud_seq;
DROP SEQUENCE IF EXISTS lupdup.t_cita_id_cita_seq;
DROP SEQUENCE IF EXISTS lupdup.t_cuestionario_id_cuestionario_seq;
DROP SEQUENCE IF EXISTS lupdup.t_detalleficha_id_detalleficha_seq;
DROP SEQUENCE IF EXISTS lupdup.t_donante_id_donante_seq;
DROP SEQUENCE IF EXISTS lupdup.t_entidadcolaboradora_id_entidadcolaboradora_seq;
DROP SEQUENCE IF EXISTS lupdup.t_ficha_id_ficha_seq;
DROP SEQUENCE IF EXISTS lupdup.t_historialpuntos_id_historialpuntos_seq;
DROP SEQUENCE IF EXISTS lupdup.t_imagen_id_imagen_seq;
DROP SEQUENCE IF EXISTS lupdup.t_perfil_id_perfil_seq;
DROP SEQUENCE IF EXISTS lupdup.t_sedeentidad_id_sedeentidad_seq;
DROP SEQUENCE IF EXISTS lupdup.t_sedesalud_id_sedesalud_seq;
DROP SEQUENCE IF EXISTS lupdup.t_usuario_id_usuario_seq;





/* Create Tables */

CREATE TABLE lupdup.t_donante_campania
(
	id_campania int NOT NULL,
	id_donante int NOT NULL,
	ind_estado int,
	des_documento varchar(300),
	num_precio double precision,
	num_precio_panpania double precision,
	des_comentario varchar(500)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_donante_cuestionario_rpta
(
	id_donantecuestionariorpta serial NOT NULL,
	id_cuestionario int NOT NULL,
	id_donante int NOT NULL,
	es_check varchar(1),
	des_respuesta varchar(500),
	PRIMARY KEY (id_donantecuestionariorpta)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_allegados
(
	id_allegados serial NOT NULL,
	id_donante int NOT NULL,
	nom_nombre varchar(300),
	nom_appaterno varchar(300),
	nom_apmaterno varchar(300),
	fec_nacimiento date,
	num_celular varchar(12),
	num_telefono varchar(12),
	des_correoelectronico varchar(500),
	num_dni varchar(15),
	id_tipopariente int,
	PRIMARY KEY (id_allegados)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_campania
(
	id_campania serial NOT NULL,
	id_entidadcolaboradora int,
	id_imagen int,
	des_campania varchar(300),
	cnt_asignada int,
	cnt_disponible int,
	fec_inicio date,
	fec_fin date,
	ind_activo int,
	num_descuento int,
	des_regalo varchar(300),
	cnt_minpuntos int,
	cnt_gusta int,
	CONSTRAINT pk_t_campania PRIMARY KEY (id_campania)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_catalogo
(
	id_catalogo serial NOT NULL,
	des_indicador varchar(300),
	nom_indicador varchar(300),
	nom_abreviatura varchar(10),
	num_valor int,
	cod_indicador int,
	CONSTRAINT pk_t_catalogo PRIMARY KEY (id_catalogo)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_centro_salud
(
	id_centrosalud serial NOT NULL,
	nom_nombre varchar(300),
	ind_tipoentidad int,
	CONSTRAINT pk_t_centrosalud PRIMARY KEY (id_centrosalud)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_cita
(
	id_cita serial NOT NULL,
	id_sede int,
	id_donante int,
	fec_cita date,
	hor_cita varchar(6),
	CONSTRAINT pk_t_cita PRIMARY KEY (id_cita)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_cuestionario
(
	id_cuestionario serial NOT NULL,
	des_cuestionario varchar(300),
	CONSTRAINT pk_t_cuestionario PRIMARY KEY (id_cuestionario)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_detalle_ficha
(
	id_detalleficha serial NOT NULL,
	id_ficha int,
	num_hematies int,
	num_hemoglobina int,
	num_hematocrito int,
	num_vcm int,
	num_chm int,
	num_linfocitos int,
	num_plaquetas int,
	num_leucocitos int,
	num_neutrofilos int,
	num_eosinofilos int,
	num_vsg int,
	num_glucosa int,
	num_urea int,
	num_acisourico int,
	num_creatinina int,
	num_colesterol int,
	num_hdl int,
	num_ldl int,
	num_trigliceridos int,
	num_transaminasa_got int,
	num_transaminasa_gpt int,
	num_transaminasa_ggt int,
	num_fosfatasa_alcalina int,
	num_calcio int,
	num_hierro int,
	num_potacio int,
	num_sodio int,
	num_bilirrubina int,
	CONSTRAINT pk_t_detalleficha PRIMARY KEY (id_detalleficha)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_donante
(
	id_donante serial NOT NULL,
	id_usuario int,
	nom_nombre varchar(300),
	nom_appaterno varchar(300),
	nom_apmaterno varchar(300),
	fec_nacimiento date,
	ind_estadocivil int,
	ind_sexo int,
	des_gradoinstruc int,
	des_ocupacion varchar(300),
	ind_donante int,
	num_celular varchar(12),
	num_celular2 varchar(12),
	num_telefono varchar(12),
	des_correo varchar(300),
	des_direccion varchar(300),
	ind_tipo int,
	cnt_puntos int,
	CONSTRAINT pk_t_donante PRIMARY KEY (id_donante)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_entidad_colaboradora
(
	id_entidadcolaboradora serial NOT NULL,
	nom_nombre varchar(100),
	CONSTRAINT pk_t_entidadcolaboradora PRIMARY KEY (id_entidadcolaboradora)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_ficha
(
	id_ficha serial NOT NULL,
	id_donante int,
	id_centrosalud int,
	id_imagen int,
	fec_analisis date,
	hor_analisis varchar(6),
	ind_estado int,
	num_unidades int,
	CONSTRAINT pk_t_ficha PRIMARY KEY (id_ficha)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_historial_puntos
(
	id_historialpuntos serial NOT NULL,
	cnt_puntoganado int,
	cnt_puntoperdido int,
	fec_punto date,
	id_donante int,
	ind_tipopunto int,
	CONSTRAINT pk_t_historialpuntos PRIMARY KEY (id_historialpuntos)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_imagen
(
	id_imagen serial NOT NULL,
	nom_descripcion varchar(300),
	nom_ruta varchar(300),
	CONSTRAINT pk_t_imagen PRIMARY KEY (id_imagen)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_perfil
(
	id_perfil serial NOT NULL,
	nom_perfil varchar(300),
	CONSTRAINT pk_t_perfil PRIMARY KEY (id_perfil)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_sede_entidad_colaboradora
(
	id_sedeentidad serial NOT NULL,
	id_entidadcolaboradora int,
	nom_nombre varchar(300),
	des_direccion varchar(300),
	num_telefono varchar(12),
	num_celular varchar(12),
	id_ubigeo int,
	CONSTRAINT pk_t_sedeentidad PRIMARY KEY (id_sedeentidad)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_sede_entidad_colaboradora_usuario
(
	id_usuario int NOT NULL,
	id_sedeentidad int NOT NULL
) WITHOUT OIDS;


CREATE TABLE lupdup.t_sede_salud
(
	id_sedesalud serial NOT NULL,
	id_centrosalud int,
	nom_nombre varchar(300),
	des_direccion varchar(300),
	num_telefono varchar(12),
	num_celular varchar(12),
	CONSTRAINT pk_t_sedesalud PRIMARY KEY (id_sedesalud)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_sede_salud_usuario
(
	id_usuario int NOT NULL,
	id_sedesalud int NOT NULL
) WITHOUT OIDS;


CREATE TABLE lupdup.t_ubigeo
(
	id_ubigeo int NOT NULL,
	id_departamento int,
	id_provincia int,
	id_distrito int,
	des_ubigeo varchar(300),
	CONSTRAINT pk_t_ubigeo PRIMARY KEY (id_ubigeo)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_usuario
(
	id_usuario serial NOT NULL,
	nom_usuario varchar(300),
	clv_usuario varchar(15),
	nom_responsable varchar(300),
	nom_appaterno varchar(300),
	nom_apmaterno varchar(300),
	des_telefono varchar(12),
	des_correo varchar(300),
	des_celular varchar(12),
	CONSTRAINT pk_t_usuario PRIMARY KEY (id_usuario)
) WITHOUT OIDS;


CREATE TABLE lupdup.t_usuario_perfil
(
	id_usuario int NOT NULL,
	id_perfil int NOT NULL
) WITHOUT OIDS;



/* Create Foreign Keys */

ALTER TABLE lupdup.t_donante_campania
	ADD FOREIGN KEY (id_campania)
	REFERENCES lupdup.t_campania (id_campania)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_sede_salud
	ADD CONSTRAINT fk_t_sedesa_reference_t_centro FOREIGN KEY (id_centrosalud)
	REFERENCES lupdup.t_centro_salud (id_centrosalud)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_donante_cuestionario_rpta
	ADD FOREIGN KEY (id_cuestionario)
	REFERENCES lupdup.t_cuestionario (id_cuestionario)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_donante_campania
	ADD FOREIGN KEY (id_donante)
	REFERENCES lupdup.t_donante (id_donante)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_donante_cuestionario_rpta
	ADD FOREIGN KEY (id_donante)
	REFERENCES lupdup.t_donante (id_donante)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_allegados
	ADD FOREIGN KEY (id_donante)
	REFERENCES lupdup.t_donante (id_donante)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_cita
	ADD CONSTRAINT fk_t_cita_reference_t_donant FOREIGN KEY (id_donante)
	REFERENCES lupdup.t_donante (id_donante)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_ficha
	ADD CONSTRAINT fk_t_ficha_reference_t_donant FOREIGN KEY (id_donante)
	REFERENCES lupdup.t_donante (id_donante)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_historial_puntos
	ADD CONSTRAINT fk_t_histor_reference_t_donant FOREIGN KEY (id_donante)
	REFERENCES lupdup.t_donante (id_donante)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_campania
	ADD CONSTRAINT fk_t_campan_reference_t_entida FOREIGN KEY (id_entidadcolaboradora)
	REFERENCES lupdup.t_entidad_colaboradora (id_entidadcolaboradora)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_sede_entidad_colaboradora
	ADD CONSTRAINT fk_t_sedeen_reference_t_entida FOREIGN KEY (id_entidadcolaboradora)
	REFERENCES lupdup.t_entidad_colaboradora (id_entidadcolaboradora)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_detalle_ficha
	ADD CONSTRAINT fk_t_detall_reference_t_ficha FOREIGN KEY (id_ficha)
	REFERENCES lupdup.t_ficha (id_ficha)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_campania
	ADD FOREIGN KEY (id_imagen)
	REFERENCES lupdup.t_imagen (id_imagen)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_ficha
	ADD FOREIGN KEY (id_imagen)
	REFERENCES lupdup.t_imagen (id_imagen)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_usuario_perfil
	ADD CONSTRAINT fk_t_usuari_reference_t_perfil FOREIGN KEY (id_perfil)
	REFERENCES lupdup.t_perfil (id_perfil)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_sede_entidad_colaboradora_usuario
	ADD CONSTRAINT fk_t_usuari_reference_t_sedeen FOREIGN KEY (id_sedeentidad)
	REFERENCES lupdup.t_sede_entidad_colaboradora (id_sedeentidad)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_cita
	ADD CONSTRAINT fk_t_cita_reference_t_sedesa FOREIGN KEY (id_sede)
	REFERENCES lupdup.t_sede_salud (id_sedesalud)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_ficha
	ADD CONSTRAINT fk_t_ficha_reference_t_sedesa FOREIGN KEY (id_centrosalud)
	REFERENCES lupdup.t_sede_salud (id_sedesalud)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_sede_salud_usuario
	ADD CONSTRAINT fk_t_sedesa_reference_t_sedesa FOREIGN KEY (id_sedesalud)
	REFERENCES lupdup.t_sede_salud (id_sedesalud)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_donante
	ADD CONSTRAINT fk_t_donant_reference_t_usuari FOREIGN KEY (id_usuario)
	REFERENCES lupdup.t_usuario (id_usuario)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_sede_entidad_colaboradora_usuario
	ADD CONSTRAINT fk_t_usuari_reference_t_usuari FOREIGN KEY (id_usuario)
	REFERENCES lupdup.t_usuario (id_usuario)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_sede_salud_usuario
	ADD CONSTRAINT fk_t_sedesa_reference_t_usuari FOREIGN KEY (id_usuario)
	REFERENCES lupdup.t_usuario (id_usuario)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE lupdup.t_usuario_perfil
	ADD CONSTRAINT fk_t_usuari_reference_t_usuari FOREIGN KEY (id_usuario)
	REFERENCES lupdup.t_usuario (id_usuario)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



