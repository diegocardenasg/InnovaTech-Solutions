# InnovaTech-Solutions

Este repositorio contiene el desarrollo de un microservicio diseñado para **InnovaTech-Solutions**, enfocado en la modularidad, escalabilidad y eficiencia de la arquitectura del sistema.

---

## Integrantes
* Diego Cárdenas

---

## Funcionalidades Implementadas
* **Arquitectura de Microservicios:** Estructura desacoplada utilizando Spring Boot para una alta escalabilidad.
* **Persistencia de Datos:** Conexión e integración con base de datos relacional mediante Spring Data JPA.
* **Endpoints REST:** Controladores configurados para la gestión y comunicación eficiente de datos.

---

## Tecnologías Utilizadas
* **Framework Principal:** Spring Boot
* **Base de Datos:** MySQL (Gestionada localmente con XAMPP)
* **Persistencia:** Spring Data JPA / Hibernate

---

## Pasos para Ejecutar el Proyecto

para ejecutar bien el microservicio de entorno local:

### 1. Preparar la Base de Datos (XAMPP)
1. Abre el **XAMPP Control Panel**.
2. Inicia los módulos de **Apache** y **MySQL**.
3. Ir a la opcion admin de MYSQL luego de que se inicie
4. Por ultimo revisar el usuario llamado "innovatech-solution", sino aparece, cree el usuario y importe el archivo .sql

### Dos opciones

### 2.1. Descargar archivo ZIP desde el repositorio InnovaTech-Solutions

1. Seleccione la opcion Clone
2. Descargar en archivo ZIP
3. Luego descomprima el archivo ZIP

### 2.2. Clonar el repositorio
```bash
git clone https://github.com/diegocardenasg/InnovaTech-Solutions.git &&
cd InnovaTech-Solutions
