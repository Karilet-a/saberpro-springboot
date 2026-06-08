# Requisitos cumplidos del parcial

## Segun el PPTX "SABER PRO Parcial JAVA TERCER CORTE"

- Sistema web para gestion y seguimiento de examenes Saber Pro.
- Levantamiento de requerimientos reflejado en roles e historias de usuario.
- Roles implementados:
  - Administrador
  - Coordinacion
  - Docente
  - Estudiante
- Administrador:
  - CRUD de facultades.
  - CRUD de directores mediante el campo director de facultad.
  - CRUD de docentes.
- Coordinacion:
  - CRUD de alumnos.
  - Aprobar alumno Saber Pro.
  - Informe de alumnos.
  - Informe de beneficios.
- Docente:
  - Consulta por facultad.
  - Consulta por cedula.
  - Informes de alumnos y beneficios.
- Estudiante:
  - Datos personales.
  - Registro/cargue de pago Saber Pro.
  - Ultimo resultado.
  - Todos los resultados.
  - Beneficios academicos.
- Dockerfile incluido.
- Configuracion para Render incluida en `render.yaml`.

## Segun el PPTX "Parcial de 3 Corte"

- Login.
- Dashboard Administrador.
- Dashboard Coordinador.
- Gestionar Estudiante.
- Editar estudiante.
- Informe General.
- Informe detallado.
- Resultados detallados.
- Informe de beneficios.
- Dashboard de Estudiante.
- Datos personales.
- Ultimo Resultado.
- Todos los resultados.
- Beneficios Academicos.

## Segun el Excel

La estructura de resultados incluye:

- Tipo y numero de documento.
- Nombres, apellidos, correo y telefono.
- Numero de registro.
- Puntaje global.
- Nivel global.
- Comunicacion escrita.
- Razonamiento cuantitativo.
- Lectura critica.
- Competencias ciudadanas.
- Ingles.
- Formulacion de proyectos de ingenieria.
- Pensamiento cientifico, matematicas y estadistica.
- Diseno de software.
- Nivel de ingles.

## Como abrirlo

La carpeta del proyecto es:

`C:\Users\bryan\Documents\Codex\2026-06-04\files-mentioned-by-the-user-saber\outputs\saberpro-springboot`

En Spring Tool Suite:

1. File > Import.
2. Maven > Existing Maven Projects.
3. Seleccionar la carpeta `saberpro-springboot`.
4. Run As > Spring Boot App.
5. Abrir `http://localhost:8080`.

Usuarios:

| Rol | Usuario | Clave |
|---|---|---|
| Administrador | admin | admin123 |
| Coordinacion | coordinador | coord123 |
| Docente | docente | docente123 |
| Estudiante | estudiante | est123 |

## Que decir si preguntan por XAMPP

El proyecto esta hecho en Spring Boot. XAMPP solo seria necesario si se quiere usar MySQL local. Para el parcial se puede ejecutar con H2, que ya viene configurado, y para Render se puede usar PostgreSQL.
