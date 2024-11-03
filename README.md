# Proyecto Parcial 2 - API de Capitulos

Este proyecto es una API RESTful desarrollada en Java con Spring Boot, que permite gestionar capítulos de una serie. Proporciona endpoints para obtener, crear y eliminar capítulos almacenados en la base de datos.

## Estructura del Proyecto

- **Controladores**: Manejan las peticiones HTTP y definen los endpoints de la API.
- **Servicios**: Contienen la lógica de negocio y se encargan de interactuar con los repositorios.
- **Modelos**: Representan las entidades de la base de datos (por ejemplo, `Capitulos`).
- **Repositorios**: Interactúan directamente con la base de datos usando Spring Data JPA.

## Requerimientos

- **Java 17** o superior
- **Maven** para la gestión de dependencias
- **Spring Boot**
- **MySQL** para la base de datos

## Configuración de la Base de Datos

Asegúrate de configurar las credenciales de la base de datos en el archivo `application.properties` de Spring Boot.

```properties
spring.application.name=parcial-2
spring.datasource.url=jdbc:mysql://<url-de-la-bd>/<nombre-de-la-bd>
spring.datasource.username=<usuario>
spring.datasource.password=<contraseña>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA Configuración
spring.jpa.database=mysql
spring.jpa.open-in-view=false
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

# Configuración de Thymeleaf (si aplica)
spring.thymeleaf.cache=false
![Captura de pantalla 2024-11-03 130934](https://github.com/user-attachments/assets/10b13731-4b74-49e0-82f7-b22904310008)
![Captura de pantalla 2024-11-03 130951](https://github.com/user-attachments/assets/64f5c7b0-2aa5-44c7-9483-fdb9ec7e27b8)
![Captura de pantalla 2024-11-03 131004](https://github.com/user-attachments/assets/1969004c-861d-4b2e-bb1e-f0ac33fed07c)
![Captura de pantalla 2024-11-03 131014](https://github.com/user-attachments/assets/d459c5aa-12d4-4cbd-a869-35db71f54184)



