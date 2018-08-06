CREATE TABLE catalog_category (
        id bigserial NOT NULL,
        name varchar(128) NOT NULL,
        description text NOT NULL,
        parent_category bigserial,
        PRIMARY KEY(id),
        FOREIGN KEY (parent_id) REFERENCES catalog_category(id)
);

CREATE TABLE catalog_filter_type (
    id bigserial NOT NULL,
    name varchar(64),
    -- add filter types and range constraints. May be regexp mask. 
    -- value name/ value type/constraint
    -- need to think further
    PRIMARY KEY(id),
)

CREATE TABLE catalog_filter (
        id bigserial NOT NULL,
        filter_name varchar(128) NOT NULL,
        filter_type bigserial NOT NULL,
        description text,
        PRIMARY KEY(id),
        FOREIGN KEY (filter_type_id) REFERENCES filter_type(id)
);


CREATE TABLE catalog_filter_to_category_mapping (
        filter_id bigserial NOT NULL,
        category_id bigserial NOT NULL,
        description text,
        PRIMARY KEY(filter_id, catalog_id),
        FOREIGN KEY (filter_id) REFERENCES catalog_filter(id),
        FOREIGN KEY (category_id) REFERENCES catalog_category(id)
);


