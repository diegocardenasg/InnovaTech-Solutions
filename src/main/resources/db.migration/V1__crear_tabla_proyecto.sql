CREATE TABLE proyecto_tech (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_proyecto VARCHAR(100) NOT NULL,
    descripcion TEXT,
    cliente VARCHAR(50) NOT NULL,
    id_estado INT
);