CREATE TABLE user (
    id bigserial NOT NULL,
    nickname varchar(256) NOT NULL,
    email varchar(256),
    password varchar(256),
    about text,
    birthdate date,
    registered date,
    logged timestamp,
    avatar_link text,
    location text,
    PRIMARY KEY(id)
);

CREATE TABLE shop (
    id bigserial NOT NULL,
    admin_id bigserial NOT NULL,
    openingdate date,
    location text,
    rating smallserial,
    PRIMARY KEY(id),
    FOREIGN KEY admin_id REFERENCES user(id)
);

CREATE TABLE shop_user_relation (
    id bigserial NOT NULL,
    user_id bigserial,
    shop_id bigserial,
    PRIMARY KEY(id),
    FOREIGN KEY user_id REFERENCES user(id),
    FOREIGN KEY shop_id REFERENCES shop(id)
)

CREATE TYPE PaymentType AS ENUM ('Credit card', 'Paypal');

CREATE TABLE payment_account (
    id bigserial NOT NULL,
    user_id bigserial,
    payment_type PaymentType,
    payment_service_link_TBD text,
    PRIMARY KEY(id),
    FOREIGN KEY user_id REFERENCES user(id)
);