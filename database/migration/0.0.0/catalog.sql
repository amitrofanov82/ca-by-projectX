CREATE TABLE labels (
    id bigserial NOT NULL,
    name varchar(128) NOT NULL,
    parent_id bigserial,
    is_category boolean SET DEFAULT true,
    description text,
    PRIMARY KEY(id)
);

CREATE TABLE products (
    id bigserial NOT NULL,
    name varchar(128) NOT NULL,
    description text,
    shop_id bigserial NOT NULL,
    price numeric,

    PRIMARY KEY(id),
    FOREIGN KEY (shop_id) REFERENCES shops(id)
);

CREATE TABLE product_images (
    id bigserial NOT NULL,
    product_id bigserial NOT NULL,
    image_link text NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(id)
);