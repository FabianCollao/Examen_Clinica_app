# Examen_Clinica_app

Este repositorio contiene una aplicación para administrar historias clínicas de pacientes en una clínica médica. La aplicación consta de las siguientes actividades:

## Actividad 1: Consultas a la base de datos

Se realizaron consultas SQL en el paquete `consultas` para obtener información relevante de la base de datos. Las consultas incluyen:

1. Mostrar el nombre de cada paciente y el nombre del doctor con el que tienen una cita asignada.
2. Obtener una lista del Nombre y la Especialidad de todos los doctores que atendieron al paciente "Juan Pérez".
3. Listar el monto que factura cada doctor, ordenados alfabéticamente de forma descendente y agrupados por el nombre del Doctor.
4. Mostrar por paciente el diagnóstico y tratamiento de su última cita, ordenados por el id del paciente.
5. Obtener la cantidad de pacientes atendidos por cada doctor.

## Actividad 2: Algoritmo y Pruebas Unitarias

Se implementaron algoritmos para aplicar descuentos a los pacientes basados en su edad y la experiencia y especialidad de los médicos. Se definieron las interfaces y métodos correspondientes para realizar estos cálculos.

## Actividad 3: API Rest

Se construyeron los servicios y controladores (Rest) necesarios para realizar operaciones CRUD (Crear, Editar, Leer y Eliminar) de Historias clínicas. Se implementaron endpoints para cada una de estas acciones.

## Actividad 4: Web Dinámica

Se desarrollaron controladores que permiten la integración con el frontend. Se implementó una vista web para visualizar el historial clínico de un paciente. La vista incluye:

- Buscador de Pacientes: Permite buscar pacientes por Id u otros parámetros y muestra una lista de resultados. Al seleccionar un paciente, se puede ver su Historia Clínica.
- Historia Clínica: Muestra una lista de todas las visitas del paciente con detalles como fecha, médico, síntomas, diagnóstico y tratamiento.

## Nota

Este proyecto es parte de un examen y fue construido siguiendo los requerimientos proporcionados. Puede contener ajustes y mejoras adicionales.
