DELETE FROM exam_result;
DELETE FROM teacher;
DELETE FROM student;
DELETE FROM faculty;

INSERT INTO faculty (id, name, director_name) VALUES
(1, 'Tecnologia e Ingenieria', 'Director de Programa'),
(2, 'Ciencias Empresariales', 'Direccion Academica');

INSERT INTO teacher (id, name, email, faculty_id) VALUES
(1, 'Docente Saber Pro', 'docente@saberpro.edu.co', 1);

INSERT INTO student (id, document_type, document_number, first_name, second_name, first_last_name, second_last_name, email, phone, approved_for_saber_pro, payment_uploaded, payment_reference, faculty_id) VALUES
(1, 'CC', '1001', 'Estudiante', '', 'BARBOSA', '', 'estudiante1@uts.edu.co', '', true, false, '', 1),
(2, 'CC', '1002', 'Estudiante', '', 'QUINTERO', '', 'estudiante2@uts.edu.co', '', true, false, '', 1),
(3, 'CC', '1003', 'Estudiante', '', 'PARRA', '', 'estudiante3@uts.edu.co', '', true, false, '', 1),
(4, 'CC', '1004', 'Estudiante', '', 'ANAYA', '', 'estudiante4@uts.edu.co', '', true, false, '', 1),
(5, 'CC', '1005', 'Estudiante', '', 'FLOR', '', 'estudiante5@uts.edu.co', '', true, false, '', 1),
(6, 'CC', '1006', 'Estudiante', '', 'GARCIA', '', 'estudiante6@uts.edu.co', '', true, false, '', 1),
(7, 'CC', '1007', 'Estudiante', '', 'MANOSALVA', '', 'estudiante7@uts.edu.co', '', true, false, '', 1),
(8, 'CC', '1008', 'Estudiante', '', 'MENDOZA', '', 'estudiante8@uts.edu.co', '', true, false, '', 1),
(9, 'CC', '1009', 'Estudiante', '', 'BELTRAN', '', 'estudiante9@uts.edu.co', '', true, false, '', 1),
(10, 'CC', '1010', 'Estudiante', '', 'SANTAMARIA', '', 'estudiante10@uts.edu.co', '', true, false, '', 1),
(11, 'CC', '1011', 'Estudiante', '', 'SANCHEZ', '', 'estudiante11@uts.edu.co', '', true, false, '', 1),
(12, 'CC', '1012', 'Estudiante', '', 'ROMERO', '', 'estudiante12@uts.edu.co', '', true, false, '', 1),
(13, 'CC', '1013', 'Estudiante', '', 'LUNA', '', 'estudiante13@uts.edu.co', '', true, false, '', 1),
(14, 'CC', '1014', 'Estudiante', '', 'TRIANA', '', 'estudiante14@uts.edu.co', '', true, false, '', 1),
(15, 'CC', '1015', 'Estudiante', '', 'SUAREZ', '', 'estudiante15@uts.edu.co', '', true, false, '', 1),
(16, 'CC', '1016', 'Estudiante', '', 'GARCIA', '', 'estudiante16@uts.edu.co', '', true, false, '', 1),
(17, 'CC', '1017', 'Estudiante', '', 'PINZON', '', 'estudiante17@uts.edu.co', '', true, false, '', 1),
(18, 'CC', '1018', 'Estudiante', '', 'JAIMES', '', 'estudiante18@uts.edu.co', '', true, false, '', 1),
(19, 'CC', '1019', 'Estudiante', '', 'NIÑO', '', 'estudiante19@uts.edu.co', '', true, false, '', 1),
(20, 'CC', '1020', 'Estudiante', '', 'FABIAN', '', 'estudiante20@uts.edu.co', '', true, false, '', 1),
(21, 'CC', '1021', 'Estudiante', '', 'HERNANDEZ', '', 'estudiante21@uts.edu.co', '', true, false, '', 1),
(22, 'CC', '1022', 'Estudiante', '', 'LARIOS', '', 'estudiante22@uts.edu.co', '', true, false, '', 1),
(23, 'CC', '1023', 'Estudiante', '', 'CALDERON', '', 'estudiante23@uts.edu.co', '', true, false, '', 1),
(24, 'CC', '1024', 'Estudiante', '', 'VILLARREAL', '', 'estudiante24@uts.edu.co', '', true, false, '', 1),
(25, 'CC', '1025', 'Estudiante', '', 'RESTREPO', '', 'estudiante25@uts.edu.co', '', true, false, '', 1),
(26, 'CC', '1026', 'Estudiante', '', 'CACERES', '', 'estudiante26@uts.edu.co', '', true, false, '', 1),
(27, 'CC', '1027', 'Estudiante', '', 'TABARES', '', 'estudiante27@uts.edu.co', '', true, false, '', 1),
(28, 'CC', '1028', 'Estudiante', '', 'NARANJO', '', 'estudiante28@uts.edu.co', '', true, false, '', 1),
(29, 'CC', '1029', 'Estudiante', '', 'PRADA', '', 'estudiante29@uts.edu.co', '', true, false, '', 1),
(30, 'CC', '1030', 'Estudiante', '', 'VARGAS', '', 'estudiante30@uts.edu.co', '', true, false, '', 1),
(31, 'CC', '1031', 'Estudiante', '', 'TORRES', '', 'estudiante31@uts.edu.co', '', true, false, '', 1),
(32, 'CC', '1032', 'Estudiante', '', 'ORTIZ', '', 'estudiante32@uts.edu.co', '', true, false, '', 1),
(33, 'CC', '1033', 'Estudiante', '', 'VILLAMIZAR', '', 'estudiante33@uts.edu.co', '', true, false, '', 1),
(34, 'CC', '1034', 'Estudiante', '', 'RESTREPO', '', 'estudiante34@uts.edu.co', '', true, false, '', 1);

INSERT INTO exam_result (id, application_year, registry_number, global_score, global_level, written_communication, written_communication_level, quantitative_reasoning, quantitative_reasoning_level, critical_reading, critical_reading_level, citizen_competencies, citizen_competencies_level, english, english_level, engineering_projects, engineering_projects_level, math_statistics, math_statistics_level, software_design, software_design_level, english_category, student_id) VALUES
(1, 2026, 'EK20183007722', 200, 'Nivel 4', 128, 'Nivel 2', 182, 'Nivel 3', 202, 'Nivel 4', 206, 'Nivel 4', 183, 'Nivel 3', 185, 'Nivel 3', 160, 'Nivel 3', 197, 'Nivel 4', 'B1', 1),
(2, 2026, 'EK20183140703', 165, 'Nivel 3', 125, 'Nivel 1', 151, 'Nivel 2', 179, 'Nivel 3', 163, 'Nivel 3', 205, 'Nivel 4', 182, 'Nivel 3', 144, 'Nivel 2', 136, 'Nivel 2', 'B2', 2),
(3, 2026, 'EK20183040545', 164, 'Nivel 3', 159, 'Nivel 3', 172, 'Nivel 3', 182, 'Nivel 3', 142, 'Nivel 2', 165, 'Nivel 3', 167, 'Nivel 3', 132, 'Nivel 2', 148, 'Nivel 2', 'A2', 3),
(4, 2026, 'EK20183025381', 160, 'Nivel 3', 146, 'Nivel 2', 199, 'Nivel 4', 157, 'Nivel 3', 149, 'Nivel 2', 147, 'Nivel 2', 174, 'Nivel 3', 127, 'Nivel 2', 171, 'Nivel 3', 'A2', 4),
(5, 2026, 'EK20183025335', 160, 'Nivel 3', 198, 'Nivel 4', 153, 'Nivel 2', 147, 'Nivel 2', 157, 'Nivel 3', 146, 'Nivel 2', 168, 'Nivel 3', 114, 'Nivel 1', 160, 'Nivel 3', 'A2', 5),
(6, 2026, 'EK20183122648', 157, 'Nivel 3', 179, 'Nivel 3', 172, 'Nivel 3', 158, 'Nivel 3', 140, 'Nivel 2', 136, 'Nivel 2', 128, 'Nivel 2', 121, 'Nivel 1', 142, 'Nivel 2', 'A1', 6),
(7, 2026, 'EK20183064605', 153, 'Nivel 2', 115, 'Nivel 1', 152, 'Nivel 2', 159, 'Nivel 3', 172, 'Nivel 3', 165, 'Nivel 3', 142, 'Nivel 2', 118, 'Nivel 1', 119, 'Nivel 1', 'A2', 7),
(8, 2026, 'EK20183187351', 151, 'Nivel 2', 132, 'Nivel 2', 123, 'Nivel 1', 125, 'Nivel 1', 169, 'Nivel 3', 204, 'Nivel 4', 173, 'Nivel 3', 127, 'Nivel 2', 171, 'Nivel 3', 'B2', 8),
(9, 2026, 'EK20183233820', 150, 'Nivel 2', 86, 'Nivel 1', 187, 'Nivel 3', 160, 'Nivel 3', 171, 'Nivel 3', 148, 'Nivel 2', 162, 'Nivel 3', 125, 'Nivel 1', 142, 'Nivel 2', 'A2', 9),
(10, 2026, 'EK20183030016', 150, 'Nivel 2', 175, 'Nivel 3', 149, 'Nivel 2', 145, 'Nivel 2', 158, 'Nivel 3', 125, 'Nivel 1', 162, 'Nivel 3', 76, 'Nivel 1', 125, 'Nivel 1', 'A1', 10),
(11, 2026, 'EK20183047073', 149, 'Nivel 2', 209, 'Nivel 4', 143, 'Nivel 2', 117, 'Nivel 1', 129, 'Nivel 2', 147, 'Nivel 2', 137, 'Nivel 2', 125, 'Nivel 1', 136, 'Nivel 2', 'A2', 11),
(12, 2026, 'EK20183236451', 146, 'Nivel 2', 93, 'Nivel 1', 183, 'Nivel 3', 155, 'Nivel 2', 164, 'Nivel 3', 133, 'Nivel 2', 174, 'Nivel 3', 130, 'Nivel 2', 154, 'Nivel 2', 'A1', 12),
(13, 2026, 'EK20183041714', 141, 'Nivel 2', 125, 'Nivel 1', 157, 'Nivel 3', 138, 'Nivel 2', 135, 'Nivel 2', 152, 'Nivel 2', 176, 'Nivel 3', 128, 'Nivel 2', 165, 'Nivel 3', 'A2', 13),
(14, 2026, 'EK20183187801', 141, 'Nivel 2', 150, 'Nivel 2', 136, 'Nivel 2', 145, 'Nivel 2', 150, 'Nivel 2', 126, 'Nivel 2', 148, 'Nivel 2', 129, 'Nivel 2', 131, 'Nivel 2', 'A1', 14),
(15, 2026, 'EK20183176566', 140, 'Nivel 2', 128, 'Nivel 2', 146, 'Nivel 2', 146, 'Nivel 2', 132, 'Nivel 2', 147, 'Nivel 2', 130, 'Nivel 2', 110, 'Nivel 1', 125, 'Nivel 1', 'A2', 15),
(16, 2026, 'EK20183204427', 139, 'Nivel 2', 129, 'Nivel 2', 138, 'Nivel 2', 148, 'Nivel 2', 146, 'Nivel 2', 135, 'Nivel 2', 109, 'Nivel 1', 107, 'Nivel 1', 131, 'Nivel 2', 'A1', 16),
(17, 2026, 'EK20183196280', 138, 'Nivel 2', 153, 'Nivel 2', 123, 'Nivel 1', 127, 'Nivel 2', 147, 'Nivel 2', 140, 'Nivel 2', 145, 'Nivel 2', 143, 'Nivel 2', 160, 'Nivel 3', 'A1', 17),
(18, 2026, 'EK20183173799', 137, 'Nivel 2', 166, 'Nivel 3', 157, 'Nivel 3', 124, 'Nivel 1', 100, 'Nivel 1', 140, 'Nivel 2', 100, 'Nivel 1', 105, 'Nivel 1', 113, 'Nivel 1', 'A1', 18),
(19, 2026, 'EK20183009565', 134, 'Nivel 2', 165, 'Nivel 3', 137, 'Nivel 2', 136, 'Nivel 2', 118, 'Nivel 1', 116, 'Nivel 1', 146, 'Nivel 2', 122, 'Nivel 1', 154, 'Nivel 2', 'A0', 19),
(20, 2026, 'EK20183117756', 133, 'Nivel 2', 139, 'Nivel 2', 93, 'Nivel 1', 168, 'Nivel 3', 150, 'Nivel 2', 114, 'Nivel 1', 102, 'Nivel 1', 123, 'Nivel 1', 94, 'Nivel 1', 'A0', 20),
(21, 2026, 'EK20183044579', 132, 'Nivel 2', 116, 'Nivel 1', 166, 'Nivel 3', 136, 'Nivel 2', 104, 'Nivel 1', 140, 'Nivel 2', 158, 'Nivel 3', 125, 'Nivel 1', 154, 'Nivel 2', 'A1', 21),
(22, 2026, 'EK20183045760', 131, 'Nivel 2', 149, 'Nivel 2', 123, 'Nivel 1', 129, 'Nivel 2', 121, 'Nivel 1', 131, 'Nivel 2', 101, 'Nivel 1', 102, 'Nivel 1', 165, 'Nivel 3', 'A1', 22),
(23, 2026, 'EK20183034044', 130, 'Nivel 2', 127, 'Nivel 2', 147, 'Nivel 2', 134, 'Nivel 2', 111, 'Nivel 1', 131, 'Nivel 2', 65, 'Nivel 1', 112, 'Nivel 1', 94, 'Nivel 1', 'A1', 23),
(24, 2026, 'EK20183041521', 129, 'Nivel 2', 96, 'Nivel 1', 162, 'Nivel 3', 114, 'Nivel 1', 131, 'Nivel 2', 144, 'Nivel 2', 122, 'Nivel 1', 112, 'Nivel 1', 131, 'Nivel 2', 'A1', 24),
(25, 2026, 'EK20183027436', 126, 'Nivel 2', 81, 'Nivel 1', 134, 'Nivel 2', 126, 'Nivel 2', 149, 'Nivel 2', 139, 'Nivel 2', 127, 'Nivel 2', 136, 'Nivel 2', 142, 'Nivel 2', 'A1', 25),
(26, 2026, 'EK20183031592', 125, 'Nivel 1', 124, 'Nivel 1', 135, 'Nivel 2', 108, 'Nivel 1', 92, 'Nivel 1', 165, 'Nivel 3', 132, 'Nivel 2', 104, 'Nivel 1', 131, 'Nivel 2', 'A2', 26),
(27, 2026, 'EK20183004153', 124, 'Nivel 1', 131, 'Nivel 2', 131, 'Nivel 2', 107, 'Nivel 1', 88, 'Nivel 1', 162, 'Nivel 3', 136, 'Nivel 2', 112, 'Nivel 1', 148, 'Nivel 2', 'A2', 27),
(28, 2026, 'EK20183030783', 122, 'Nivel 1', 166, 'Nivel 3', 113, 'Nivel 1', 113, 'Nivel 1', 112, 'Nivel 1', 106, 'Nivel 1', 135, 'Nivel 2', 117, 'Nivel 1', 119, 'Nivel 1', 'A0', 28),
(29, 2026, 'EK20183024754', 122, 'Nivel 1', 119, 'Nivel 1', 125, 'Nivel 1', 137, 'Nivel 2', 107, 'Nivel 1', 123, 'Nivel 1', 83, 'Nivel 1', 104, 'Nivel 1', 119, 'Nivel 1', 'A1', 29),
(30, 2026, 'EK20183186200', 114, 'Nivel 1', 95, 'Nivel 1', 120, 'Nivel 1', 151, 'Nivel 2', 86, 'Nivel 1', 119, 'Nivel 1', 149, 'Nivel 2', 103, 'Nivel 1', 119, 'Nivel 1', 'A0', 30),
(31, 2026, 'EK20183182410', 113, 'Nivel 1', 109, 'Nivel 1', 105, 'Nivel 1', 104, 'Nivel 1', 103, 'Nivel 1', 142, 'Nivel 2', 102, 'Nivel 1', 135, 'Nivel 2', 80, 'Nivel 1', 'A1', 31),
(32, 2026, 'EK20183213735', 107, 'Nivel 1', 128, 'Nivel 2', 81, 'Nivel 1', 107, 'Nivel 1', 102, 'Nivel 1', 119, 'Nivel 1', 130, 'Nivel 2', 111, 'Nivel 1', 125, 'Nivel 1', 'A0', 32),
(33, 2026, 'EK20183065220', 106, 'Nivel 1', 134, 'Nivel 2', 96, 'Nivel 1', 92, 'Nivel 1', 110, 'Nivel 1', 97, 'Nivel 1', 83, 'Nivel 1', 107, 'Nivel 1', 119, 'Nivel 1', 'A0', 33),
(34, 2026, 'EK20183028123', 96, 'Nivel 1', 0, 'Nivel 1', 117, 'Nivel 1', 122, 'Nivel 1', 105, 'Nivel 1', 137, 'Nivel 2', 157, 'Nivel 3', 96, 'Nivel 1', 131, 'Nivel 2', 'A1', 34);