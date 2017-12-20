DROP TABLE IF EXISTS Administrador CASCADE;
CREATE TABLE Administrador (

	usuario VARCHAR(20) NOT NULL PRIMARY KEY,
	contrasena VARCHAR(20) NOT NULL
);

INSERT INTO Administrador VALUES ('administrador', '12345678');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Operador CASCADE;
CREATE TABLE Operador (

	usuario VARCHAR(20) NOT NULL PRIMARY KEY,
	contrasena VARCHAR(20) NOT NULL
);

INSERT INTO Operador VALUES ('operador', '12345678');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Areas CASCADE;
CREATE TABLE Areas (
  
  id_area VARCHAR(20) NOT NULL PRIMARY KEY,
  nombre_area VARCHAR(20) NOT NULL,
  descripcion VARCHAR(60)
);

INSERT INTO areas VALUES ('101', 'Cardiologia', 'Atencion especial a pacientes que sufren del corazon');
INSERT INTO areas VALUES ('102', 'Pediatria', 'Atencion especial a bebes');
INSERT INTO areas VALUES ('103', 'Radiologia', 'Toma de radiografias');
INSERT INTO areas VALUES ('104', 'Maternidad', 'Atencion a mujeres en embarazo');
INSERT INTO areas VALUES ('105', 'Urgencias', 'Pacientes de urgencia medica');
INSERT INTO areas VALUES ('106', 'Banco de sangre', 'Reservas de sangre para donacion');
INSERT INTO areas VALUES ('107', 'Cuidados intensivos', 'Atencion a pacientes delicados');
INSERT INTO areas VALUES ('108', 'Laboratorio', 'Analisis de muestras');
INSERT INTO areas VALUES ('109', 'Quirofano', 'Salas de cirugias');
INSERT INTO areas VALUES ('110', 'Consultorios', 'Atencion a pacientes');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Empleados CASCADE;
CREATE TABLE Empleados (
  
  id_empleado VARCHAR(20) NOT NULL PRIMARY KEY,
  id_jefe VARCHAR(20) NOT NULL,
  id_area VARCHAR(20) NOT NULL,
  nombre_empleado VARCHAR(40) NOT NULL,
  direccion VARCHAR(30),
  telefono VARCHAR(10),
  salario INTEGER NOT NULL,
  email VARCHAR(30) NOT NULL,
  cargo VARCHAR(30) NOT NULL,
  FOREIGN KEY (id_jefe) REFERENCES Empleados (id_empleado),
  FOREIGN KEY (id_area) REFERENCES Areas (id_area)
);

DROP TABLE IF EXISTS Medicos CASCADE;
CREATE TABLE Medicos (
  
  id_empleado VARCHAR(20) NOT NULL PRIMARY KEY,
  numero_licencia VARCHAR(20) NOT NULL,
  especialidad VARCHAR(30), 
  universidad VARCHAR(30) NOT NULL,
  contrasena VARCHAR (30) NOT NULL,
  FOREIGN KEY (id_empleado) REFERENCES Empleados (id_empleado)
);

INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100008', '100008', '105', 'Danya', '46 Fordem Circle', '4413847', 6885927, 'dpalia0@trellian.com', 'Medico');
INSERT INTO Medicos VALUES('100008', '1533597', 'Cardiologia', 'Univalle', '12345678');
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100011', '100008', '110', 'Sigvard', '00163 Eastlawn Terrace', '6210441', 4126384, 'ssambles1@businesswire.com', 'Medico');
INSERT INTO Medicos VALUES('100011', '1532478', 'Pediatria', 'Javeriana', '12345678');
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100022', '100011', '105', 'Candida', '095 Namekagon Drive', '5802620', 6566769, 'cokeeffe2@oakley.com', 'Medico');
INSERT INTO Medicos VALUES('100022', '1587531', 'Neurologia', 'Univalle', '12345678');
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100019', '100022', '102', 'Winnifred', '3 David Alley', '3426472', 4432623, 'wgower3@unc.edu', 'Medico');
INSERT INTO Medicos VALUES('100019', '1588908', 'Cardiologia', 'Libre', '12345678');
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100015', '100008', '103', 'Kerrin', '053 Grasskamp Trail', '4827692', 6327718, 'kkarsh4@lulu.com', 'Medico');
INSERT INTO Medicos VALUES('100015', '1523546', 'Cancer', 'Libre', '12345678');
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100523', '100008', '107', 'Dina', '0176 Jenna Avenue', '6964255', 6588616, 'dtipper5@people.com.cn', 'Medico');
INSERT INTO Medicos VALUES('100523', '1587906', 'Cirujano', 'Nacional', '12345678');
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100017', '100008', '108', 'Norman', '290 Kenwood Court', '6428061', 7772786, 'nstetlye6@latimes.com', 'Medico');
INSERT INTO Medicos VALUES('100017', '1523780', 'Cirujano', 'Occidente', '12345678');
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100029', '100015', '110', 'Opalina', '3 Vahlen Road', '7036078', 1963714, 'ogowdridge7@nasa.gov', 'Medico');
INSERT INTO Medicos VALUES('100029', '1500998', 'Pediatria', 'Icesi', '12345678');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Enfermeras CASCADE;
CREATE TABLE Enfermeras (
  
  id_empleado VARCHAR(20) NOT NULL PRIMARY KEY,
  anos_experiencia INTEGER,
  FOREIGN KEY (id_empleado) REFERENCES Empleados (id_empleado)
);

INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('106036', '100017', '102', 'Lorry', '9 Welch Junction', '6002270', 6448956, 'lbarnson9@zimbio.com', 'Enfermera');
INSERT INTO Enfermeras VALUES('106036', 12);
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('105032', '100011', '108', 'Kelwin', '09439 Ronald Regan Park', '5493573', 3261047, 'kalbena@example.com', 'Enfermera');
INSERT INTO Enfermeras VALUES('105032', 11);
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('106042', '100011', '102', 'Rudyard', '4 New Castle Avenue', '6777504', 2106677, 'randryszczakb@paypal.com', 'Enfermera');
INSERT INTO Enfermeras VALUES('106042', 5);
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('104039', '100015', '110', 'Johny', '6962 Carberry Avenue', '6011468', 3108910, 'jshillakerc@netvibes.com', 'Enfermera');
INSERT INTO Enfermeras VALUES('104039', 3);
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100033', '100008', '104', 'Lucian', '97 Express Junction', '3578013', 7409998, 'ljuand@kickstarter.com', 'Enfermera');
INSERT INTO Enfermeras VALUES('100033', 6);
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100046', '100033', '101', 'Seymour', '404 Victoria Terrace', '4539300', 4695168, 'skondratenkoe@bing.com', 'Enfermera');
INSERT INTO Enfermeras VALUES('100046', 11);
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100030', '100008', '110', 'Con', '3 Drewry Drive', '3951940', 3538422, 'cheadyf@prweb.com', 'Enfermera');
INSERT INTO Enfermeras VALUES('100030', 8);
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100038', '100008', '106', 'Xymenes', '1 Heath Way', '5746584', 4238425, 'xchaimg@t-online.de', 'Enfermera');
INSERT INTO Enfermeras VALUES('100038', 7);
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100949', '100008', '106', 'Jess', '3724 4th Court', '3504093', 4336085, 'jsporleh@de.vu', 'Enfermera');
INSERT INTO Enfermeras VALUES('100949', 1);
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100040', '100011', '110', 'Miguel', '2688 Buhler Avenue', '3750869', 6402965, 'mbotlyi@hhs.gov', 'Enfermera');
INSERT INTO Enfermeras VALUES('100040', 10);
INSERT INTO empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) 
VALUES ('100052', '100040', '106', 'Baird', '6 Michigan Junction', '5174283', 4733507, 'baustickj@independent.co.uk', 'Enfermera');
INSERT INTO Enfermeras VALUES('100052', 9);

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Enfermeras_Habilidades CASCADE;
CREATE TABLE Enfermeras_Habilidades (

  id_empleado VARCHAR(20) NOT NULL,
  habilidad VARCHAR(30) NOT NULL,
  PRIMARY KEY (id_empleado, habilidad),
  FOREIGN KEY (id_empleado) REFERENCES Enfermeras (id_empleado)
);
         
INSERT INTO Enfermeras_Habilidades VALUES('104039', 'Inyectar');
INSERT INTO Enfermeras_Habilidades VALUES('104039', 'Curaciones');
INSERT INTO Enfermeras_Habilidades VALUES('104039', 'Cuidar pacientes');
INSERT INTO Enfermeras_Habilidades VALUES('104039', 'Tomar muestras');
INSERT INTO Enfermeras_Habilidades VALUES('100033', 'Suministrar medicamentos');
INSERT INTO Enfermeras_Habilidades VALUES('100033', 'Tomar signos vitales');
INSERT INTO Enfermeras_Habilidades VALUES('100033', 'Comprobar medicamentos');
INSERT INTO Enfermeras_Habilidades VALUES('100033', 'Inyectar');
INSERT INTO Enfermeras_Habilidades VALUES('100046', 'Cuidar pacientes');
INSERT INTO Enfermeras_Habilidades VALUES('100046', 'Movilizar pacientes');
INSERT INTO Enfermeras_Habilidades VALUES('100046', 'Ayudar en cirugia');
INSERT INTO Enfermeras_Habilidades VALUES('100046', 'Tomar signos vitales');
INSERT INTO Enfermeras_Habilidades VALUES('100949', 'Tomar signos vitales');
INSERT INTO Enfermeras_Habilidades VALUES('100949', 'Inyectar');
INSERT INTO Enfermeras_Habilidades VALUES('100949', 'Tomar muestras');
INSERT INTO Enfermeras_Habilidades VALUES('100949', 'Suministrar medicamentos');
INSERT INTO Enfermeras_Habilidades VALUES('105032', 'Movilizar pacientes');
INSERT INTO Enfermeras_Habilidades VALUES('105032', 'Ayudar en cirugia');
INSERT INTO Enfermeras_Habilidades VALUES('105032', 'Inyectar');
INSERT INTO Enfermeras_Habilidades VALUES('100030', 'Ayudar en cirugia');
INSERT INTO Enfermeras_Habilidades VALUES('100030', 'Suministrar medicamentos');
INSERT INTO Enfermeras_Habilidades VALUES('100030', 'Movilizar pacientes');
INSERT INTO Enfermeras_Habilidades VALUES('100030', 'Comprobar medicamentos');
INSERT INTO Enfermeras_Habilidades VALUES('100030', 'Inyectar');
INSERT INTO Enfermeras_Habilidades VALUES('105032', 'Tomar muestras');
INSERT INTO Enfermeras_Habilidades VALUES('105032', 'Cuidar pacientes');
INSERT INTO Enfermeras_Habilidades VALUES('106042', 'Tomar signos vitales');
INSERT INTO Enfermeras_Habilidades VALUES('106042', 'Tomar muestras');
INSERT INTO Enfermeras_Habilidades VALUES('106042', 'Inyectar');
INSERT INTO Enfermeras_Habilidades VALUES('106036', 'Tomar muestras');
INSERT INTO Enfermeras_Habilidades VALUES('106036', 'Movilizar pacientes');
INSERT INTO Enfermeras_Habilidades VALUES('106036', 'Ayudar en cirugia');
INSERT INTO Enfermeras_Habilidades VALUES('100038', 'Comprobar medicamentos');
INSERT INTO Enfermeras_Habilidades VALUES('100038', 'Suministrar medicamentos');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Pacientes CASCADE;
CREATE TABLE Pacientes (
  
  id_paciente VARCHAR(20) NOT NULL PRIMARY KEY,
  nombre_paciente VARCHAR(40) NOT NULL,
  direccion VARCHAR(30),
  telefono VARCHAR(10),
  numero_seguro VARCHAR(20) NOT NULL,
  actividad_economica VARCHAR(40),
  fecha_nacimiento DATE NOT NULL
);

INSERT INTO pacientes VALUES ('100040','Maria','Calle 5','3369854','5698','Profesora','1990-04-12');
INSERT INTO pacientes VALUES ('100041','Jose','Calle 6','3369854','5694','Escritor','1999-09-23');
INSERT INTO pacientes VALUES ('100042','Sofia','Calle 7','3364854','5678','profesora','1980-11-05');
INSERT INTO pacientes VALUES ('100043','Miguel','Calle 14','3469854','1698','Profesor','1982-01-05');
INSERT INTO pacientes VALUES ('100044','Sara','Calle 74','3459854','4698','Astronauta','1970-12-05');
INSERT INTO pacientes VALUES ('100045','Luisa','Calle 78','3479854','7898','Odontologa','1985-03-02');
INSERT INTO pacientes VALUES ('100046','Luis','Calle 78','7419854','4598','Bailarina','1989-12-12');
INSERT INTO pacientes VALUES ('100047','Cristina','Calle 78','3374854','1498','Programadora','1980-12-05');
INSERT INTO pacientes VALUES ('100048','Daniel','Calle 12','3369865','5418','Musico','1981-05-05');
INSERT INTO pacientes VALUES ('100049','Rudd','Calle 5','3369854','5698','Cantante','1990-04-12');
INSERT INTO pacientes VALUES ('100050','Aristoteles','Calle 6','3369854','5694','Filosofo','1999-09-23');
INSERT INTO pacientes VALUES ('100051','Feney','Calle 7','3364854','5678','Comerciante','1980-11-05');
INSERT INTO pacientes VALUES ('100052','Valeria','Calle 14','3469854','1698','Estudiante','1982-01-05');
INSERT INTO pacientes VALUES ('100053','Annie','Calle 74','3459854','4698','Astronauta','1970-12-05');
INSERT INTO pacientes VALUES ('100054','Camila','Calle 78','3479854','7898','Medica','1985-03-02');
INSERT INTO pacientes VALUES ('100055','Jorge','Calle 78','7419854','4598','Medico','1989-12-12');
INSERT INTO pacientes VALUES ('100056','Camilo','Calle 78','3374854','1498','Programador','1980-12-05');
INSERT INTO pacientes VALUES ('100057','Arturo','Calle 12','3369865','5418','Musico','1981-05-05');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Camas CASCADE;
CREATE TABLE Camas (
  
  numero_cama VARCHAR(20) NOT NULL PRIMARY KEY,
  descripcion VARCHAR(50),
  estado VARCHAR(10) NOT NULL,
  id_area VARCHAR(20) NOT NULL,
  FOREIGN KEY (id_area) REFERENCES Areas (id_area)
);

INSERT INTO camas VALUES ('1','Cama reclinable','Ocupada','101');
INSERT INTO camas VALUES ('2','Cama sencilla','Ocupada','101');
INSERT INTO camas VALUES ('3','Cama reclinable','Ocupada','102');
INSERT INTO camas VALUES ('4','Cama sencilla','Ocupada','103');
INSERT INTO camas VALUES ('5','Cama reclinable','Ocupada','104');
INSERT INTO camas VALUES ('6','Cama reclinable','Ocupada','105');
INSERT INTO camas VALUES ('7','Cama sencilla','Ocupada','106');
INSERT INTO camas VALUES ('8','Cama reclinable','Ocupada','107');
INSERT INTO camas VALUES ('9','Cama reclinable','Libre','108');
INSERT INTO camas VALUES ('10','Cama reclinable','Libre','109');
INSERT INTO camas VALUES ('11','Cama reclinable','Libre','101');
INSERT INTO camas VALUES ('12','Cama sencilla','Libre','101');
INSERT INTO camas VALUES ('13','Cama reclinable','Libre','102');
INSERT INTO camas VALUES ('14','Cama sencilla','Libre','103');
INSERT INTO camas VALUES ('15','Cama reclinable','Libre','104');
INSERT INTO camas VALUES ('16','Cama reclinable','Libre','105');
INSERT INTO camas VALUES ('17','Cama sencilla','Libre','106');
INSERT INTO camas VALUES ('18','Cama reclinable','Libre','107');
INSERT INTO camas VALUES ('19','Cama reclinable','Libre','108');
INSERT INTO camas VALUES ('20','Cama reclinable','Libre','109');
INSERT INTO camas VALUES ('21','Cama reclinable','Libre','101');
INSERT INTO camas VALUES ('22','Cama sencilla','Libre','101');
INSERT INTO camas VALUES ('23','Cama reclinable','Libre','102');
INSERT INTO camas VALUES ('24','Cama sencilla','Libre','103');
INSERT INTO camas VALUES ('25','Cama reclinable','Libre','104');
INSERT INTO camas VALUES ('26','Cama reclinable','Libre','105');
INSERT INTO camas VALUES ('27','Cama sencilla','Libre','106');
INSERT INTO camas VALUES ('28','Cama reclinable','Libre','107');
INSERT INTO camas VALUES ('29','Cama reclinable','Libre','108');
INSERT INTO camas VALUES ('30','Cama reclinable','Libre','109');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Pacientes_Camas CASCADE;
CREATE TABLE Pacientes_Camas (
  
  id_paciente VARCHAR(20) NOT NULL,
  numero_cama VARCHAR(20) NOT NULL,
  fecha_asignacion DATE NOT NULL,
  PRIMARY KEY (id_paciente, numero_cama, fecha_asignacion),
  FOREIGN KEY (id_paciente) REFERENCES Pacientes (id_paciente),
  FOREIGN KEY (numero_cama) REFERENCES Camas (numero_cama) 
  ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Pacientes_Camas VALUES ('100040','1', '2017-10-10');
INSERT INTO Pacientes_Camas VALUES ('100041','2', '2017-02-09');
INSERT INTO Pacientes_Camas VALUES ('100042','3', '2016-11-15');
INSERT INTO Pacientes_Camas VALUES ('100043','4', '2017-05-02');
INSERT INTO Pacientes_Camas VALUES ('100044','5', '2016-12-12');
INSERT INTO Pacientes_Camas VALUES ('100045','6', '2017-01-31');
INSERT INTO Pacientes_Camas VALUES ('100046','7', '2017-03-16');
INSERT INTO Pacientes_Camas VALUES ('100047','8', '2017-12-01');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Campanas CASCADE;
CREATE TABLE Campanas (
  
  codigo_campana VARCHAR(20) NOT NULL PRIMARY KEY,
  nombre_campana VARCHAR(50) NOT NULL,
  objetivo VARCHAR(100),
  fecha_realizacion DATE NOT NULL,
  id_empleado VARCHAR(20) NOT NULL,
  FOREIGN KEY (id_empleado) REFERENCES Medicos (id_empleado)
);

INSERT INTO campanas VALUES ('100','Vacunacion','Vacunar gratis a la poblacion','2018-12-05','100008');
INSERT INTO campanas VALUES ('101','Intervencion','Dar informacion sobre enfermedades','2018-06-05','100015');
INSERT INTO campanas VALUES ('102','Vacunacion bebes','Vacunar gratis a los bebes','2018-01-05','100008');
INSERT INTO campanas VALUES ('103','Feria de la dieta','Informar sobre como tener una mejor dieta','2018-03-16','100015');
INSERT INTO campanas VALUES ('104','Ejercicio en adultos mayores','Fomentar el deporte en los adultos mayores','2018-05-02','100017');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Pacientes_Campanas CASCADE;
CREATE TABLE Pacientes_Campanas (
  
  id_paciente VARCHAR(20) NOT NULL,
  codigo_campana VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_paciente, codigo_campana),
  FOREIGN KEY (id_paciente) REFERENCES Pacientes (id_paciente),
  FOREIGN KEY (codigo_campana) REFERENCES Campanas (codigo_campana)
);

INSERT INTO Pacientes_Campanas VALUES ('100048', '100');
INSERT INTO Pacientes_Campanas VALUES ('100048', '101');
INSERT INTO Pacientes_Campanas VALUES ('100049', '101');
INSERT INTO Pacientes_Campanas VALUES ('100049', '104');
INSERT INTO Pacientes_Campanas VALUES ('100050', '102');
INSERT INTO Pacientes_Campanas VALUES ('100051', '103');
INSERT INTO Pacientes_Campanas VALUES ('100051', '101');
INSERT INTO Pacientes_Campanas VALUES ('100052', '104');
INSERT INTO Pacientes_Campanas VALUES ('100052', '100');
INSERT INTO Pacientes_Campanas VALUES ('100053', '100');
INSERT INTO Pacientes_Campanas VALUES ('100054', '101');
INSERT INTO Pacientes_Campanas VALUES ('100054', '102');
INSERT INTO Pacientes_Campanas VALUES ('100055', '102');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Historias_clinicas CASCADE;
CREATE TABLE Historias_clinicas (
  
  numero_historia SERIAL NOT NULL PRIMARY KEY,
  fecha_apertura DATE,
  id_paciente VARCHAR(20) NOT NULL,
  FOREIGN KEY (id_paciente) REFERENCES Pacientes (id_paciente)
);

INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-10-10', '100040');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-02-15', '100041');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-05-01', '100042');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-01-05', '100043');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-10-30', '100044');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-02-06', '100045');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-07-09', '100046');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-10-10', '100047');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-01-17', '100048');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-03-16', '100049');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-11-26', '100050');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-04-20', '100051');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-09-02', '100052');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-02-01', '100053');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-01-20', '100054');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-12-05', '100055');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-05-02', '100056');
INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) VALUES ('2017-06-12', '100057');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Registros CASCADE;
CREATE TABLE Registros (
  
  numero_registro SERIAL NOT NULL,
  numero_historia INTEGER NOT NULL,
  fecha_consulta DATE NOT NULL,
  hora TIME NOT NULL,
  id_empleado VARCHAR(20) NOT NULL,
  PRIMARY KEY (numero_registro),
  FOREIGN KEY (id_empleado) REFERENCES Empleados (id_empleado),
  FOREIGN KEY (numero_historia) REFERENCES Historias_clinicas (numero_historia)
);

INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('1', '2017-06-12', '10:00:00', '100008');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('2', '2017-04-20', '12:00:00', '100011');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('3', '2017-02-12', '09:30:00', '100022');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('4', '2017-06-11', '14:30:00', '100019');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('5', '2017-03-01', '13:30:00', '100019');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('6', '2017-04-12', '16:00:00', '100015');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('7', '2017-09-10', '16:30:00', '100015');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('8', '2017-10-22', '12:10:00', '100015');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('9', '2017-03-16', '12:00:00', '100523');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('10', '2017-01-11', '10:30:00', '100015');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('11', '2017-07-17', '14:00:00', '100523');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('12', '2017-08-08', '18:00:00', '100017');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('13', '2017-09-03', '17:30:00', '100017');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('14', '2017-02-11', '11:30:00', '100029');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('15', '2017-10-26', '15:00:00', '100029');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('16', '2017-11-26', '15:30:00', '100022');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('17', '2017-03-19', '17:30:00', '100019');
INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) 
VALUES ('18', '2017-06-12', '16:00:00', '100022');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Formulas_medicas CASCADE;
CREATE TABLE Formulas_medicas (
  
  codigo_formula SERIAL NOT NULL PRIMARY KEY,
  id_empleado VARCHAR(20) NOT NULL,
  numero_registro INTEGER NOT NULL,
  FOREIGN KEY (id_empleado) REFERENCES Medicos (id_empleado),
  FOREIGN KEY (numero_registro) REFERENCES Registros (numero_registro)
);

INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100008', '1');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100011', '2');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100022', '3');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100019', '4');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100015', '7');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100015', '8');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100523', '9');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100015', '10');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100523', '11');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100017', '12');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100017', '13');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100022', '16');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100019', '17');
INSERT INTO Formulas_medicas (id_empleado, numero_registro) VALUES ('100022', '18');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Causas CASCADE;
CREATE TABLE Causas (
  
  codigo_causa SERIAL NOT NULL PRIMARY KEY,
  nombre_causa VARCHAR(30) NOT NULL,
  descripcion VARCHAR(100) NOT NULL
);

INSERT INTO Causas (nombre_causa, descripcion) VALUES ('Dolor', 'El paciente presenta dolor');
INSERT INTO Causas (nombre_causa, descripcion) VALUES ('Hinchazon', 'El paciente presenta hinchazon');
INSERT INTO Causas (nombre_causa, descripcion) VALUES ('Malestar', 'El paciente presenta malestar');
INSERT INTO Causas (nombre_causa, descripcion) VALUES ('Herida', 'El paciente tiene una herida');
INSERT INTO Causas (nombre_causa, descripcion) VALUES ('Cirujia', 'El paciente inicia el proceso de cirujia');
INSERT INTO Causas (nombre_causa, descripcion) VALUES ('Consulta general', 'Consulta general');
INSERT INTO Causas (nombre_causa, descripcion) VALUES ('Medicacion', 'El paciente requiere unos medicamentos especificos');
INSERT INTO Causas (nombre_causa, descripcion) VALUES ('Patologia especifica', 'El paciente tiene una patologia especifica');
INSERT INTO Causas (nombre_causa, descripcion) VALUES ('Tratameinto', 'El paciente sigue un tratamiento especifico');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Registros_Causas CASCADE;
CREATE TABLE Registros_Causas (
  
  numero_registro INTEGER NOT NULL,
  codigo_causa INTEGER NOT NULL,
  PRIMARY KEY (numero_registro, codigo_causa),
  FOREIGN KEY (numero_registro) REFERENCES Registros (numero_registro),
  FOREIGN KEY (codigo_causa) REFERENCES Causas (codigo_causa) 
  ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Registros_Causas VALUES (1, 1);
INSERT INTO Registros_Causas VALUES (1, 2);
INSERT INTO Registros_Causas VALUES (1, 3);
INSERT INTO Registros_Causas VALUES (2, 4);
INSERT INTO Registros_Causas VALUES (2, 5);
INSERT INTO Registros_Causas VALUES (2, 6);
INSERT INTO Registros_Causas VALUES (2, 7);
INSERT INTO Registros_Causas VALUES (3, 8);
INSERT INTO Registros_Causas VALUES (4, 9);
INSERT INTO Registros_Causas VALUES (4, 1);
INSERT INTO Registros_Causas VALUES (5, 2);
INSERT INTO Registros_Causas VALUES (5, 3);
INSERT INTO Registros_Causas VALUES (5, 4);
INSERT INTO Registros_Causas VALUES (6, 5);
INSERT INTO Registros_Causas VALUES (6, 6);
INSERT INTO Registros_Causas VALUES (6, 7);
INSERT INTO Registros_Causas VALUES (7, 8);
INSERT INTO Registros_Causas VALUES (7, 9);
INSERT INTO Registros_Causas VALUES (7, 1);
INSERT INTO Registros_Causas VALUES (8, 2);
INSERT INTO Registros_Causas VALUES (8, 3);
INSERT INTO Registros_Causas VALUES (9, 4);
INSERT INTO Registros_Causas VALUES (9, 5);
INSERT INTO Registros_Causas VALUES (9, 6);
INSERT INTO Registros_Causas VALUES (10, 7);
INSERT INTO Registros_Causas VALUES (11, 8);
INSERT INTO Registros_Causas VALUES (12, 9);
INSERT INTO Registros_Causas VALUES (12, 1);
INSERT INTO Registros_Causas VALUES (12, 2);
INSERT INTO Registros_Causas VALUES (13, 3);
INSERT INTO Registros_Causas VALUES (14, 4);
INSERT INTO Registros_Causas VALUES (15, 5);
INSERT INTO Registros_Causas VALUES (15, 6);
INSERT INTO Registros_Causas VALUES (16, 7);
INSERT INTO Registros_Causas VALUES (16, 8);
INSERT INTO Registros_Causas VALUES (16, 9);
INSERT INTO Registros_Causas VALUES (17, 1);
INSERT INTO Registros_Causas VALUES (18, 2);
INSERT INTO Registros_Causas VALUES (18, 3);

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Citas CASCADE;
CREATE TABLE Citas (
  
  id_paciente VARCHAR(20) NOT NULL,
  id_empleado VARCHAR(20) NOT NULL,
  fecha DATE NOT NULL,
  hora TIME NOT NULL,
  precio INTEGER NOT NULL,
  PRIMARY KEY (id_paciente, fecha, hora),
  FOREIGN KEY (id_empleado) REFERENCES Medicos (id_empleado),
  FOREIGN KEY (id_paciente) REFERENCES Pacientes (id_paciente)
);

INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio) 
VALUES ('100040', '100008', '2017-06-12', '10:00:00', 45000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100041', '100011', '2017-04-20', '12:00:00', 30000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100042', '100022', '2017-02-12', '09:30:00', 60000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100043', '100019', '2017-06-11', '14:30:00', 50000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100044', '100019', '2017-03-01', '13:30:00', 90000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100045', '100015', '2017-04-12', '16:00:00', 60000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100046', '100015', '2017-09-10', '16:30:00', 80000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100047', '100015', '2017-10-22', '12:10:00', 90000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100048', '100523', '2017-03-16', '12:00:00', 30000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100049', '100015', '2017-01-11', '10:30:00', 50000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100050', '100523', '2017-07-17', '14:00:00', 60000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100051', '100017', '2017-08-08', '18:00:00', 70000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100052', '100017', '2017-09-03', '17:30:00', 50000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100053', '100029', '2017-02-11', '11:30:00', 20000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100054', '100029', '2017-10-26', '15:00:00', 100000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100055', '100022', '2017-11-26', '15:30:00', 50000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100056', '100019', '2017-03-19', '17:30:00', 40000);
INSERT INTO Citas (id_paciente, id_empleado, fecha, hora, precio)
VALUES ('100057', '100022', '2017-06-12', '16:00:00', 20000);

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Medicamentos CASCADE;
CREATE TABLE Medicamentos (
  
  codigo_medicamento VARCHAR(20) NOT NULL PRIMARY KEY,
  nombre_medicamento VARCHAR(30) NOT NULL,
  costo INTEGER NOT NULL,
  descripcion VARCHAR(50)
);

INSERT INTO medicamentos VALUES ('1000', 'Loratadina', 4000, 'Medicamento para alergias');
INSERT INTO medicamentos VALUES ('1001', 'Dolex', 4000, 'Medicamento para el dolor');
INSERT INTO medicamentos VALUES ('1002', 'Noxpirin', 4000, 'Medicamento para la gripa');
INSERT INTO medicamentos VALUES ('1003', 'Robituzin', 9000, 'Medicamento para la tos');
INSERT INTO medicamentos VALUES ('1004', 'Buscapina', 6000, 'Medicamento para los colicos');
INSERT INTO medicamentos VALUES ('1005', 'Acetaminofen', 4000, 'Medicamento para el dolor');
INSERT INTO medicamentos VALUES ('1006', 'Milanta', 4000, 'Medicamento para la gastritis');
INSERT INTO medicamentos VALUES ('1007', 'Suero', 4000, 'Medicamento para recuperacion');
INSERT INTO medicamentos VALUES ('1008', 'Vitamina C', 9000, 'Medicamento para recuperacion');
INSERT INTO medicamentos VALUES ('1009', 'Ampisilina', 6000, 'Medicamento para los gripa');
INSERT INTO medicamentos VALUES ('1010', 'Ibuprofeno', 4000, 'Analgesico');
INSERT INTO medicamentos VALUES ('1011', 'Acetilcisteína', 4000, 'Antibiotico');
INSERT INTO medicamentos VALUES ('1012', 'Dimercaprol', 4000, 'Medicamento para la gripa');
INSERT INTO medicamentos VALUES ('1013', 'Naloxona', 9000, 'Medicamento para la tos');
INSERT INTO medicamentos VALUES ('1014', 'Carbamazepina', 6000, 'Antibiotico');
INSERT INTO medicamentos VALUES ('1015', 'Clorfenamina', 4000, 'Medicamento para el dolor');
INSERT INTO medicamentos VALUES ('1016', 'Penicilamina', 4000, 'Medicamento para la gastritis');
INSERT INTO medicamentos VALUES ('1017', 'Alopurinol', 4000, 'Medicamento para recuperacion');
INSERT INTO medicamentos VALUES ('1018', 'Codeína', 9000, 'Antibiotico');
INSERT INTO medicamentos VALUES ('1019', 'Prometazina', 6000, 'Medicamento para los gripa');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Formulas_medicas_Medicamentos CASCADE;
CREATE TABLE Formulas_medicas_Medicamentos (
  
  codigo_formula INTEGER NOT NULL,
  codigo_medicamento VARCHAR(20) NOT NULL,
  PRIMARY KEY (codigo_formula, codigo_medicamento),
  FOREIGN KEY (codigo_formula) REFERENCES Formulas_medicas (codigo_formula),
  FOREIGN KEY (codigo_medicamento) REFERENCES Medicamentos (codigo_medicamento)
  ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Formulas_medicas_Medicamentos VALUES (1, '1000');
INSERT INTO Formulas_medicas_Medicamentos VALUES (1, '1018');
INSERT INTO Formulas_medicas_Medicamentos VALUES (1, '1009');
INSERT INTO Formulas_medicas_Medicamentos VALUES (1, '1012');
INSERT INTO Formulas_medicas_Medicamentos VALUES (2, '1001');
INSERT INTO Formulas_medicas_Medicamentos VALUES (2, '1019');
INSERT INTO Formulas_medicas_Medicamentos VALUES (2, '1005');
INSERT INTO Formulas_medicas_Medicamentos VALUES (2, '1010');
INSERT INTO Formulas_medicas_Medicamentos VALUES (3, '1002');
INSERT INTO Formulas_medicas_Medicamentos VALUES (3, '1003');
INSERT INTO Formulas_medicas_Medicamentos VALUES (3, '1004');
INSERT INTO Formulas_medicas_Medicamentos VALUES (4, '1003');
INSERT INTO Formulas_medicas_Medicamentos VALUES (5, '1004');
INSERT INTO Formulas_medicas_Medicamentos VALUES (5, '1014');
INSERT INTO Formulas_medicas_Medicamentos VALUES (5, '1017');
INSERT INTO Formulas_medicas_Medicamentos VALUES (6, '1005');
INSERT INTO Formulas_medicas_Medicamentos VALUES (6, '1018');
INSERT INTO Formulas_medicas_Medicamentos VALUES (7, '1006');
INSERT INTO Formulas_medicas_Medicamentos VALUES (7, '1016');
INSERT INTO Formulas_medicas_Medicamentos VALUES (7, '1010');
INSERT INTO Formulas_medicas_Medicamentos VALUES (8, '1007');
INSERT INTO Formulas_medicas_Medicamentos VALUES (9, '1008');
INSERT INTO Formulas_medicas_Medicamentos VALUES (9, '1003');
INSERT INTO Formulas_medicas_Medicamentos VALUES (10, '1009');
INSERT INTO Formulas_medicas_Medicamentos VALUES (10, '1008');
INSERT INTO Formulas_medicas_Medicamentos VALUES (10, '1007');
INSERT INTO Formulas_medicas_Medicamentos VALUES (10, '1006');
INSERT INTO Formulas_medicas_Medicamentos VALUES (10, '1005');
INSERT INTO Formulas_medicas_Medicamentos VALUES (11, '1010');
INSERT INTO Formulas_medicas_Medicamentos VALUES (11, '1011');
INSERT INTO Formulas_medicas_Medicamentos VALUES (12, '1001');
INSERT INTO Formulas_medicas_Medicamentos VALUES (12, '1002');
INSERT INTO Formulas_medicas_Medicamentos VALUES (12, '1003');
INSERT INTO Formulas_medicas_Medicamentos VALUES (13, '1012');
INSERT INTO Formulas_medicas_Medicamentos VALUES (13, '1016');
INSERT INTO Formulas_medicas_Medicamentos VALUES (14, '1013');
INSERT INTO Formulas_medicas_Medicamentos VALUES (14, '1003');
INSERT INTO Formulas_medicas_Medicamentos VALUES (14, '1001');
INSERT INTO Formulas_medicas_Medicamentos VALUES (14, '1014');
INSERT INTO Formulas_medicas_Medicamentos VALUES (12, '1015');
INSERT INTO Formulas_medicas_Medicamentos VALUES (10, '1016');
INSERT INTO Formulas_medicas_Medicamentos VALUES (10, '1017');
INSERT INTO Formulas_medicas_Medicamentos VALUES (1, '1015');
INSERT INTO Formulas_medicas_Medicamentos VALUES (2, '1018');
INSERT INTO Formulas_medicas_Medicamentos VALUES (5, '1001');
INSERT INTO Formulas_medicas_Medicamentos VALUES (2, '1016');
INSERT INTO Formulas_medicas_Medicamentos VALUES (9, '1012');
INSERT INTO Formulas_medicas_Medicamentos VALUES (14, '1017');

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
