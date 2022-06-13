CREATE TABLE IF NOT EXISTS CITIES (
    id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
    city                   VARCHAR      NOT NULL
    );