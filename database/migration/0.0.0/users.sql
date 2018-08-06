CREATE TABLE users (
    id bigserial NOT NULL,
    nickname varchar(64) NOT NULL,
    email varchar(128),
    phone varchar(16),
    password varchar(64),
    about text,
    birthdate date,
    registered date,
    logged timestamp,
    avatar_link text,
    location text,
    facebook_id varchar(50)
    twitter_id varchar(50)
    instagram_id varchar(50)
    PRIMARY KEY(id)
);

CREATE TABLE shop (
    id bigserial NOT NULL,
    admin_id bigserial NOT NULL,
    opening_date date,
    location text,
    rating smallserial,
    template_id bigserial,
    PRIMARY KEY(id),
    FOREIGN KEY (admin_id) REFERENCES users(id),
    FOREIGN KEY (template_id) REFERENCES shop_template(id)
);

CREATE TABLE shop_template (
    id bigserial NOT NULL,
    name varchar(64),
    content text,
    PRIMARY KEY(id)
);

CREATE TABLE shop_user_relation (
    id bigserial NOT NULL,
    user_id bigserial,
    shop_id bigserial,
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (shop_id) REFERENCES shop(id)
);

CREATE TABLE user_user_relation (
    id bigserial NOT NULL,
    follower_id bigserial,
    followee_id bigserial,
    PRIMARY KEY(id),
    FOREIGN KEY (follower_id) REFERENCES users(id),
    FOREIGN KEY (followee_id) REFERENCES users(id)
);

CREATE TABLE subscription_list (
    id bigserial NOT NULL,
    user_id bigserial,
    email varchar(128),
    FOREIGN KEY (user_id) REFERENCES users(id)
);
