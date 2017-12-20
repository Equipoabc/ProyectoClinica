DROP TABLE IF EXISTS Administrador CASCADE;
CREATE TABLE Administrador (

	usuario VARCHAR(20) NOT NULL PRIMARY KEY,
	contrasena VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS Operador CASCADE;
CREATE TABLE Operador (

	usuario VARCHAR(20) NOT NULL PRIMARY KEY,
	contrasena VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS Areas CASCADE;
CREATE TABLE Areas (
  
  id_area VARCHAR(20) NOT NULL PRIMARY KEY,
  nombre_area VARCHAR(20) NOT NULL,
  descripcion VARCHAR(60)
);

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

DROP TABLE IF EXISTS Enfermeras CASCADE;
CREATE TABLE Enfermeras (
  
  id_empleado VARCHAR(20) NOT NULL PRIMARY KEY,
  anos_experiencia INTEGER,
  FOREIGN KEY (id_empleado) REFERENCES Empleados (id_empleado)
);

DROP TABLE IF EXISTS Enfermeras_Habilidades CASCADE;
CREATE TABLE Enfermeras_Habilidades (

  id_empleado VARCHAR(20) NOT NULL,
  habilidad VARCHAR(30) NOT NULL,
  PRIMARY KEY (id_empleado, habilidad),
  FOREIGN KEY (id_empleado) REFERENCES Enfermeras (id_empleado)
);

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

DROP TABLE IF EXISTS Camas CASCADE;
CREATE TABLE Camas (
  
  numero_cama VARCHAR(20) NOT NULL PRIMARY KEY,
  descripcion VARCHAR(50),
  estado VARCHAR(10) NOT NULL,
  id_area VARCHAR(20) NOT NULL,
  FOREIGN KEY (id_area) REFERENCES Areas (id_area)
);

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

DROP TABLE IF EXISTS Campanas CASCADE;
CREATE TABLE Campanas (
  
  codigo_campana VARCHAR(20) NOT NULL PRIMARY KEY,
  nombre_campana VARCHAR(30) NOT NULL,
  objetivo VARCHAR(40),
  fecha_realizacion DATE NOT NULL,
  id_empleado VARCHAR(20) NOT NULL,
  FOREIGN KEY (id_empleado) REFERENCES Medicos (id_empleado)
);

DROP TABLE IF EXISTS Pacientes_Campanas CASCADE;
CREATE TABLE Pacientes_Campanas (
  
  id_paciente VARCHAR(20) NOT NULL,
  codigo_campana VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_paciente, codigo_campana),
  FOREIGN KEY (id_paciente) REFERENCES Pacientes (id_paciente),
  FOREIGN KEY (codigo_campana) REFERENCES Campanas (codigo_campana)
);

DROP TABLE IF EXISTS Historias_clinicas CASCADE;
CREATE TABLE Historias_clinicas (
  
  numero_historia SERIAL NOT NULL PRIMARY KEY,
  fecha_apertura DATE,
  id_paciente VARCHAR(20) NOT NULL,
  FOREIGN KEY (id_paciente) REFERENCES Pacientes (id_paciente)
);

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

DROP TABLE IF EXISTS Formulas_medicas CASCADE;
CREATE TABLE Formulas_medicas (
  
  codigo_formula SERIAL NOT NULL PRIMARY KEY,
  id_empleado VARCHAR(20) NOT NULL,
  numero_registro INTEGER NOT NULL,
  FOREIGN KEY (id_empleado) REFERENCES Medicos (id_empleado),
  FOREIGN KEY (numero_registro) REFERENCES Registros (numero_registro)
);

DROP TABLE IF EXISTS Causas CASCADE;
CREATE TABLE Causas (
  
  codigo_causa SERIAL NOT NULL PRIMARY KEY,
  nombre_causa VARCHAR(30) NOT NULL,
  descripcion VARCHAR(40) NOT NULL
);

DROP TABLE IF EXISTS Registros_Causas CASCADE;
CREATE TABLE Registros_Causas (
  
  numero_registro INTEGER NOT NULL,
  codigo_causa INTEGER NOT NULL,
  PRIMARY KEY (numero_registro, codigo_causa),
  FOREIGN KEY (numero_registro) REFERENCES Registros (numero_registro),
  FOREIGN KEY (codigo_causa) REFERENCES Causas (codigo_causa) 
  ON DELETE CASCADE ON UPDATE CASCADE
);

DROP TABLE IF EXISTS Citas CASCADE;
CREATE TABLE Citas (
  
  id_paciente VARCHAR(20) NOT NULL,
  id_empleado VARCHAR(20) NOT NULL,
  fecha DATE NOT NULL,
  hora TIME NOT NULL,
  precio VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_paciente, fecha, hora),
  FOREIGN KEY (id_empleado) REFERENCES Medicos (id_empleado),
  FOREIGN KEY (id_paciente) REFERENCES Pacientes (id_paciente)
);


DROP TABLE IF EXISTS Medicamentos CASCADE;
CREATE TABLE Medicamentos (
  
  codigo_medicamento VARCHAR(20) NOT NULL PRIMARY KEY,
  nombre_medicamento VARCHAR(30) NOT NULL,
  costo INTEGER NOT NULL,
  descripcion VARCHAR(50)
);

DROP TABLE IF EXISTS Formulas_medicas_Medicamentos CASCADE;
CREATE TABLE Formulas_medicas_Medicamentos (
  
  codigo_formula INTEGER NOT NULL,
  codigo_medicamento VARCHAR(20) NOT NULL,
  PRIMARY KEY (codigo_formula, codigo_medicamento),
  FOREIGN KEY (codigo_formula) REFERENCES Formulas_medicas (codigo_formula),
  FOREIGN KEY (codigo_medicamento) REFERENCES Medicamentos (codigo_medicamento)
  ON DELETE CASCADE ON UPDATE CASCADE
);

DROP TABLE IF EXISTS Agenda CASCADE;
CREATE TABLE Agenda (
  
  id_agenda VARCHAR(20) NOT NULL,
  fecha DATE NOT NULL,
  hora TIME NOT NULL,
  estado VARCHAR(20) NOT NULL,
  id_empleado VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_agenda),
  FOREIGN KEY (id_empleado) REFERENCES Medicos (id_empleado)
);

INSERT INTO Administrador VALUES ('admin', '1');
INSERT INTO Operador VALUES ('ope', '1');
INSERT INTO Areas VALUES ('1', 'Cardiologia', 'Corazon');
INSERT INTO Empleados VALUES ('1','1','1','Sebastian Villegas', 'Cra 27 19-117',
'3353985', 4000000, 'jhoan.villegas', 'arriba');
INSERT INTO Medicos VALUES('1', '1533597', 'Corazon', 'Univalle', '1');


INSERT INTO areas VALUES ('101','Cardiologia', 'Atencion especial a pacientes que sufren del corazon');
INSERT INTO areas VALUES ('102','Pediatria', 'Atencion especial a bebes');
INSERT INTO areas VALUES ('103','Radiologia', 'Toma de radiografias');
INSERT INTO areas VALUES ('104','Maternidad', 'Atencion a mujeres en embarazo');
INSERT INTO areas VALUES ('105','Urgencias', 'Pacientes de urgencia medica');
INSERT INTO areas VALUES ('106','Banco de Sangre', 'Reservas de sangre para donacion');
INSERT INTO areas VALUES ('107','Cuidados intensivos', 'Atencion a pacientes delicados');
INSERT INTO areas VALUES ('108','Laboratorio', 'Analisis de muestras');
INSERT INTO areas VALUES ('109','Quirofano', 'Salas de cirugias');
INSERT INTO areas VALUES ('110','Consultorios', 'Atencion a pacientes');
/*
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100008, 1, 105, 'Danya', '46 Fordem Circle', 4413847, 6885927, 'dpalia0@trellian.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100011, 100008, 110, 'Sigvard', '00163 Eastlawn Terrace', 6210441, 4126384, 'ssambles1@businesswire.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100022, 100011, 105, 'Candida', '095 Namekagon Drive', 5802620, 6566769, 'cokeeffe2@oakley.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100019, 100022, 102, 'Winnifred', '3 David Alley', 3426472, 4432623, 'wgower3@unc.edu', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100015, 100008, 103, 'Kerrin', '053 Grasskamp Trail', 4827692, 6327718, 'kkarsh4@lulu.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100523, 100008, 107, 'Dina', '0176 Jenna Avenue', 6964255, 6588616, 'dtipper5@people.com.cn', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100017, 1, 108, 'Norman', '290 Kenwood Court', 6428061, 7772786, 'nstetlye6@latimes.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100029, 100015, 110, 'Opalina', '3 Vahlen Road', 7036078, 1963714, 'ogowdridge7@nasa.gov', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (110022, 100011, 101, 'Kare', '980 Welch Street', 3992553, 3168084, 'kcardillo8@quantcast.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (106026, 100017, 102, 'Lorry', '9 Welch Junction', 6002270, 6448956, 'lbarnson9@zimbio.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (105022, 100011, 108, 'Kelwin', '09439 Ronald Regan Park', 5493573, 3261047, 'kalbena@example.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (106012, 1, 102, 'Rudyard', '4 New Castle Avenue', 6777504, 2106677, 'randryszczakb@paypal.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (104029, 100015, 110, 'Johny', '6962 Carberry Avenue', 6011468, 3108910, 'jshillakerc@netvibes.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100023, 100008, 104, 'Lucian', '97 Express Junction', 3578013, 7409998, 'ljuand@kickstarter.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100026, 100023, 101, 'Seymour', '404 Victoria Terrace', 4539300, 4695168, 'skondratenkoe@bing.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100020, 100008, 110, 'Con', '3 Drewry Drive', 3951940, 3538422, 'cheadyf@prweb.com', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100018, 100008, 106, 'Xymenes', '1 Heath Way', 5746584, 4238425, 'xchaimg@t-online.de', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100929, 100008, 106, 'Jess', '3724 4th Court', 3504093, 4336085, 'jsporleh@de.vu', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100030, 100011, 110, 'Miguel', '2688 Buhler Avenue', 3750869, 6402965, 'mbotlyi@hhs.gov', 'medico');
insert into empleados (id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono, salario, email, cargo) values (100012, 100012, 106, 'Baird', '6 Michigan Junction', 5174283, 4733507, 'baustickj@independent.co.uk', 'medico');


INSERT INTO camas VALUES ('1','Cama reclinable','Libre','101');
INSERT INTO camas VALUES ('2','Cama sencilla','Libre','101');
INSERT INTO camas VALUES ('3','Cama reclinable','Libre','102');
INSERT INTO camas VALUES ('4','Cama sencilla','Libre','103');
INSERT INTO camas VALUES ('5','Cama reclinable','Libre','104');
INSERT INTO camas VALUES ('6','Cama reclinable','Libre','105');
INSERT INTO camas VALUES ('7','Cama sencilla','Libre','106');
INSERT INTO camas VALUES ('8','Cama reclinable','Libre','107');
INSERT INTO camas VALUES ('9','Cama reclinable','Libre','108');
INSERT INTO camas VALUES ('10','Cama reclinable','Libre','109');

INSERT INTO campanas VALUES ('100','Vacunacion','Vacunar gratis a la poblacion','2018/12/05','1');
INSERT INTO campanas VALUES ('101','Intervencion','Dar informacion sobre enfermedades','2018/06/05','100012');
INSERT INTO campanas VALUES ('100','Vacunacion Bebes','Vacunar gratis a los bebes','2018/01/05','100013');


INSERT INTO medicamentos VALUES ('1000','Loratadina',4000,'Medicamento para alergias');
INSERT INTO medicamentos VALUES ('1000','Dolex',4000,'Medicamento para el dolor');
INSERT INTO medicamentos VALUES ('1000','Noxpirin',4000,'Medicamento para la gripa');
INSERT INTO medicamentos VALUES ('1000','Robituzin',9000,'Medicamento para la tos');
INSERT INTO medicamentos VALUES ('1000','Buscapina',6000,'Medicamento para los colicos');


INSERT INTO pacientes VALUES ('100040','maria','calle 5','3369854','5698','profesora','1980/12/05');
INSERT INTO pacientes VALUES ('100041','jose','calle 6','3369854','5694','profesor','1980/12/05');
INSERT INTO pacientes VALUES ('100042','sofia','calle 7','3364854','5678','profesora','1980/12/05');
INSERT INTO pacientes VALUES ('100043','miguel','calle 14','3469854','1698','profesor','1980/12/05');
INSERT INTO pacientes VALUES ('100044','sara','calle 74','3459854','4698','profesora','1980/12/05');
INSERT INTO pacientes VALUES ('100045','luisa','calle 78','3479854','7898','profesora','1980/12/05');
INSERT INTO pacientes VALUES ('100046','luis','calle 78','7419854','4598','profesor','1980/12/05');
INSERT INTO pacientes VALUES ('100047','cristina','calle 78','3374854','1498','profesora','1980/12/05');
INSERT INTO pacientes VALUES ('100048','daniel','calle 12','3369865','5418','profesor','1980/12/05');
*/