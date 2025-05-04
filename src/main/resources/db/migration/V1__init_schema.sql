CREATE TABLE menu_category (
                               id SERIAL PRIMARY KEY,
                               restaurant_id VARCHAR(64) NOT NULL,
                               name VARCHAR(255) NOT NULL,
                               created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE menu_item (
                           id SERIAL PRIMARY KEY,
                           restaurant_id VARCHAR(64) NOT NULL,
                           name VARCHAR(255) NOT NULL,
                           description TEXT,
                           category_id INTEGER REFERENCES menu_category(id),
                           is_available BOOLEAN NOT NULL,
                           is_vegetarian BOOLEAN NOT NULL,
                           image_url TEXT,
                           is_customizable BOOLEAN NOT NULL,
                           price NUMERIC(10,2),
                           created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
