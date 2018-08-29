CREATE TABLE users (
    id bigserial NOT NULL,
    nickname varchar(64) NOT NULL,
    email varchar(128),
    phone varchar(16),
    registered date,
    logged timestamp,
    password varchar(64),
    facebook_id varchar(50),
    google_id varchar(50),
    PRIMARY KEY(id)
);

CREATE TABLE user_profiles (
    id bigserial NOT NULL,
    user_id bigint NOT NULL,
    birthdate date,
    location text,
    avatar_link text,
    about text,
    twitter_id varchar(50),
    instagram_id varchar(50),
    PRIMARY KEY(id),
    UNIQUE(id, user_id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE shop_templates (
    id bigserial NOT NULL,
    name varchar(64),
    html_template text,
    PRIMARY KEY(id)
);

CREATE TABLE shops (
    id bigserial NOT NULL,
    admin_id bigint NOT NULL,
    opening_date date,
    location text,
    template_id bigint,
    PRIMARY KEY(id),
    UNIQUE(admin_id),
    FOREIGN KEY (admin_id) REFERENCES users(id),
    FOREIGN KEY (template_id) REFERENCES shop_templates(id)
);

CREATE TABLE subscription_list (
    id bigserial NOT NULL,
    user_id bigint,
    email varchar(128),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

