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
    user_id bigint NOT NULL,
    birthdate date,
    location text,
    avatar_link text,
    about text,
    twitter_id varchar(50),
    instagram_id varchar(50),
    UNIQUE(user_id),
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
    FOREIGN KEY (admin_id) REFERENCES users(id),
    FOREIGN KEY (template_id) REFERENCES shop_templates(id)
);



CREATE TABLE user_shop_management_relation (
    id bigserial NOT NULL,
    user_id bigint NOT NULL,
    shop_id bigint NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (shop_id) REFERENCES shops(id)
);

CREATE TABLE user_user_follow_relation (
    id bigserial NOT NULL,
    follower_id bigint,
    followee_id bigint,
    PRIMARY KEY(id),
    FOREIGN KEY (follower_id) REFERENCES users(id),
    FOREIGN KEY (followee_id) REFERENCES users(id)
);

CREATE TABLE subscription_list (
    id bigserial NOT NULL,
    user_id bigint,
    email varchar(128),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE user_shop_assesment_relation (
    id bigserial NOT NULL,
    user_id bigint,
    shop_id bigint,
    mark smallint CHECK (mark > 0 AND mark < 5),
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (shop_id) REFERENCES shops(id)
);