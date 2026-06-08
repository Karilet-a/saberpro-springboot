# Parcial Java Tercer Corte - Sistema Saber Pro

Proyecto Spring Boot para cumplir el enunciado de los documentos: gestion y seguimiento de resultados Saber Pro con roles de Administrador, Coordinacion, Docente y Estudiante.

## Herramienta recomendada

Usa **Spring Tool Suite / Eclipse** si el docente lo menciono o si el curso trabaja con Spring. Tambien puedes abrirlo en **Visual Studio Code** con Extension Pack for Java, pero **XAMPP no es obligatorio**. XAMPP solo serviria para levantar MySQL/MariaDB local; la aplicacion es Java Spring Boot.

## Funcionalidades incluidas

- Login con roles.
- Dashboard segun rol.
- Administrador: CRUD de directores, docentes y facultades representado como gestion base del sistema.
- Coordinacion: CRUD de estudiantes, aprobacion Saber Pro e informes.
- Docente: consulta por facultad, cedula e informes.
- Estudiante: datos personales, cargue/registro de pago, ultimo resultado, todos los resultados y beneficios.
- Informes: general, detallado, resultados y beneficios academicos.
- Base de datos H2 local para pruebas, MySQL opcional con XAMPP y PostgreSQL para Render.
- Dockerfile y `render.yaml` para despliegue.

## Usuarios de prueba

| Usuario | Clave | Rol |
|---|---|---|
| admin | admin123 | Administrador |
| coordinador | coord123 | Coordinacion |
| docente | docente123 | Docente |
| estudiante | est123 | Estudiante |

## Ejecutar en Spring Tool Suite / Eclipse

1. File > Import > Existing Maven Projects.
2. Selecciona esta carpeta: `saberpro-springboot`.
3. Click derecho sobre el proyecto > Run As > Spring Boot App.
4. Abre `http://localhost:8080`.

## Ejecutar en VS Code

1. Instala Extension Pack for Java y Spring Boot Extension Pack.
2. Abre la carpeta `saberpro-springboot`.
3. Ejecuta:

```powershell
mvn spring-boot:run
```

## Base de datos

Por defecto usa H2 en memoria y carga datos de ejemplo desde `data.sql`.

Con XAMPP/MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/saberpro?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

En Render usa PostgreSQL definiendo `DATABASE_URL`, `DATABASE_USERNAME` y `DATABASE_PASSWORD`.

## Evidencia para presentar

- Explica que se levantaron requerimientos desde las historias de usuario de los PPTX.
- Muestra el login y cambia entre roles.
- Muestra CRUD de estudiantes.
- Aprueba un estudiante para Saber Pro.
- Muestra informe general, detalle por documento y beneficios.
- Explica que el Excel alimenta los campos de resultados: puntaje global, niveles, ingles y modulos especificos.
