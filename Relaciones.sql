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
  descripcion VARCHAR(50)
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
