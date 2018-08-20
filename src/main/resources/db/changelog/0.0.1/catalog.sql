CREATE TABLE labels (
    id bigserial NOT NULL,
    name varchar(128) NOT NULL,
    parent_id bigint,
    is_category boolean DEFAULT true,
    description text,
    PRIMARY KEY(id)
);

CREATE TABLE products (
    id bigserial NOT NULL,
    name varchar(128) NOT NULL,
    description text,
    shop_id bigint NOT NULL,
    price numeric,

    PRIMARY KEY(id),
    FOREIGN KEY (shop_id) REFERENCES shops(id)
);

CREATE TABLE product_images (
    id bigserial NOT NULL,
    product_id bigint NOT NULL,
    image_link text NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(id)
);

CREATE TABLE user_product_wish_relation (
    id bigserial NOT NULL,
    user_id bigint,
    product_id bigint,
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);