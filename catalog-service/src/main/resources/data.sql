CREATE TABLE catalog (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         product_id VARCHAR(120) NOT NULL UNIQUE,
                         product_name VARCHAR(255) NOT NULL,
                         stock INT NOT NULL,
                         unit_price INT NOT NULL,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

insert into catalog (product_id, product_name, stock, unit_price)
    values ('CATALOG-0001', 'Berlin', 100, 1500);

insert into catalog (product_id, product_name, stock, unit_price)
    values ('CATALOG-0002', 'Tokyo', 100, 900);

insert into catalog (product_id, product_name, stock, unit_price)
    values ('CATALOG-0003', 'Stockholm', 100, 1200);
