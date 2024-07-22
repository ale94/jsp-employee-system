# Sistema de Gestión de Empleados

Este es un proyecto de sistema de gestión de empleados desarrollado con Spring Boot y JSP. El sistema permite gestionar empleados, incluyendo operaciones como crear, leer, actualizar y eliminar (CRUD).

## Descripción del Proyecto

El sistema de gestión de empleados proporciona una interfaz web para administrar los registros de empleados. Utiliza Spring Boot para el backend y JSP para el frontend. Este proyecto es ideal para aprender y practicar habilidades de desarrollo web con Java y Spring Boot.

## Características

- Crear un nuevo empleado.
- Listar todos los empleados.
- Actualizar información de un empleado.
- Eliminar un empleado.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación.
- **Spring Boot**: Framework para el desarrollo del backend.
- **JSP**: JavaServer Pages para el desarrollo del frontend.
- **Hibernate**: ORM para la gestión de bases de datos.
- **PostgreSQL**: Base de datos relacional.
- **Maven**: Gestión de dependencias.
- **Bootstrap**: Framework CSS para el diseño responsivo.
- **Docker Compose**: Contenedorización de la aplicación.

## Métodos HTTP

El sistema de gestión de empleados utiliza los siguientes métodos HTTP para las operaciones CRUD:

- **GET**: Recupera datos del servidor.
  - `/employees` - Lista todos los empleados.
  - `/employees/{id}` - Muestra detalles de un empleado específico.

- **POST**: Envía datos al servidor para crear un nuevo recurso.
  - `/employees` - Crea un nuevo empleado.

- **PUT**: Actualiza un recurso existente.
  - `/employees/{id}` - Actualiza la información de un empleado existente.

- **DELETE**: Elimina un recurso existente.
  - `/employees/{id}` - Elimina un empleado específico.

## Capturas de Pantalla

### Listado de Empleados
<a href="https://ibb.co/dMcwg9m"><img src="https://i.ibb.co/h9MJf5Y/home.png" alt="home" border="0"></a>

### Formulario de Creación de Empleado
<a href="https://ibb.co/kKSKd3n"><img src="https://i.ibb.co/b1K1fHh/edit-Employee.png" alt="edit-Employee" border="0"></a>

### Formulario de Editado de Empleado
<a href="https://ibb.co/NZy491P"><img src="https://i.ibb.co/867hrzp/add-Employee.png" alt="add-Employee" border="0"></a>
