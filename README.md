# Menu Digital Backend

Este proyecto es el backend para una aplicación que gestiona todos los datos para dar soporte a un menú digital. Utiliza una base de datos en memoria H2.

## Requisitos

- Java 17
- Spring Boot 3.2.3
- Gradle

## Instalación y ejecución

1. Clona el repositorio en tu máquina local.
2. Navega hasta el directorio del proyecto.
3. Ejecuta el comando `gradle build` para compilar el proyecto.
4. Ejecuta el comando `java -jar build/libs/menu-app-0.0.1-SNAPSHOT.jar` para iniciar el servidor.

El servidor se ejecutará en el puerto 8080.

## Diagrama de Clases

En la dirección `/menu-app/Diagrama App en Carta.html` se encuentra una imagen del diagrama de clases del modelo de datos.

## Pruebas

En la dirección `/menu-app/src/main/resources/misJsons` hay un archivo que contiene varios datos en formato JSON para realizar pruebas.

## Postman

En la dirección `/menu-app/Menu App.postman_collection.json` se encuentra un archivo JSON con una colección de todas las llamadas para importar en Postman y realizar consultas.

