-- Insertar datos en la tabla roles si no existen
-- INSERT INTO roles (role) SELECT 'ADMIN' WHERE NOT EXISTS (SELECT 1 FROM roles WHERE id = 1);
-- INSERT INTO roles (role) SELECT 'USER' WHERE NOT EXISTS (SELECT 1 FROM roles WHERE id = 2);

-- Insertar datos en la tabla users si no existen
-- INSERT INTO users (first_name, last_name, username, password, role)
-- SELECT 'John', 'Doe', 'john', '$2a$10$3Zz9Zz9Zz9Zz9Zz9Zz9Zu1', 1
--     WHERE NOT EXISTS (SELECT 1 FROM users WHERE id = 1);
--
-- INSERT INTO users (first_name, last_name, username, password, role)
-- SELECT 'Jane', 'Doe', 'jane', '$2a$10$3Zz9Zz9Zz9Zz9Zz9Zz9Zu1', 1
--     WHERE NOT EXISTS (SELECT 1 FROM users WHERE id = 2);
