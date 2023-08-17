#################################################################################################
#								Nombre: Fabián Collao Medina									#
#	Curso: BOTIC-SOFOF-22-02-13-0054 | Desarrollo de Aplicaciones Full Stack Java Trainee v2.0	#
#							Nombre de la base de datos: clinica_app								#
#################################################################################################

######## Actividad 1: Consultas a la base de datos #################################

/*Antes de proceder a armar la aplicación, debes validar que la base de datos se encuentra
en condiciones de ser utilizada, es por esto que se te solicitan realizar las siguientes
consultas en lenguaje SQL, las cuales debes agregar en el proyecto dentro de un Package
con el nombre de consultas.*/

USE clinica_app; # Para realizar las consultas en todo el script

###### CONSULTA 1 ########################
/*
Se solicita mostrar el nombre de cada paciente y el nombre del doctor con el que tienen
una cita asignada.
*/
SELECT p.Nombre AS Nombre_Paciente, d.Nombre AS Nombre_Doctor
FROM Pacientes p
INNER JOIN Citas c ON p.ID = c.Paciente_ID
INNER JOIN Doctores d ON c.Doctor_ID = d.ID;

###### CONSULTA 2 ########################
/*
Se solicita una lista del Nombre y la Especialidad de todos los doctores que atendieron al
paciente “Juan Pérez”
*/
SELECT d.Nombre AS Nombre_Doctor, e.Nombre AS Especialidad
FROM Doctores d
INNER JOIN Especialidades e ON d.Especialidad_ID = e.ID
INNER JOIN Citas c ON d.ID = c.Doctor_ID
INNER JOIN Pacientes p ON c.Paciente_ID = p.ID
WHERE p.Nombre = 'Juan Pérez';

###### CONSULTA 3 ########################
/*
Se solicita una lista con el monto que factura cada doctor, ordenados alfabéticamente de
forma descendente, agrupados por el nombre del Doctor.
*/
SELECT d.Nombre AS Nombre_Doctor, SUM(f.Monto) AS Monto_Total
FROM Doctores d
INNER JOIN Citas c ON d.ID = c.Doctor_ID
INNER JOIN Facturas f ON c.Factura_ID = f.ID
GROUP BY d.Nombre
ORDER BY Nombre_Doctor DESC;

###### CONSULTA 4 ########################
/*
Se solicita una lista que muestre por paciente, el diagnóstico y tratamiento que recibió en
su última cita. Ordenados de forma ascendente por el id del paciente.
*/
SELECT p.ID, p.Nombre AS Nombre_Paciente, hc.Diagnostico, hc.Tratamiento
FROM Pacientes p
INNER JOIN Historia_Clinica hc ON p.ID = hc.Paciente_ID
INNER JOIN (
    SELECT Paciente_ID, MAX(Fecha_Cita) AS Ultima_Cita
    FROM Historia_Clinica
    GROUP BY Paciente_ID
) ultima_cita ON hc.Paciente_ID = ultima_cita.Paciente_ID AND hc.Fecha_Cita = ultima_cita.Ultima_Cita
ORDER BY p.ID ASC;


###### CONSULTA 5 ########################
/*
Se solicita una lista con la cantidad de pacientes que ha atendido cada doctor.
*/
SELECT d.Nombre AS Nombre_Doctor, COUNT(DISTINCT c.Paciente_ID) AS Cantidad_Pacientes
FROM Doctores d
LEFT JOIN Citas c ON d.ID = c.Doctor_ID
GROUP BY d.ID;
