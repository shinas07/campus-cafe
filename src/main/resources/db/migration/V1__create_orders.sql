CREATE TABLE orders (
                        id      UUID PRIMARY KEY,
                        status  VARCHAR(20) NOT NULL
);

CREATE TABLE order_lines (
                             id         BIGSERIAL PRIMARY KEY,
                             order_id   UUID NOT NULL REFERENCES orders(id),
                             item_name  VARCHAR(100) NOT NULL,
                             quantity   INT NOT NULL,
                             price      NUMERIC(10, 2) NOT NULL
);