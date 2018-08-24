package ca.by.project_x.persistence.model.catalog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import ca.by.project_x.persistence.model.users.Shops;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
@Entity
@Table(name="products")
public class Products {
	
	/*
	 * CREATE TABLE products (
    id bigserial NOT NULL,
    name varchar(128) NOT NULL,
    description text,
    shop_id bigint NOT NULL,
    price numeric,

    PRIMARY KEY(id),
    FOREIGN KEY (shop_id) REFERENCES shops(id)
	);*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private long id;
	
	@Column(name="name", nullable=false, length=128)
	private String name;
	
	@Column(name="description")
	private String description;
	
	@JoinColumn(name="shop_id", referencedColumnName = "id", nullable = false)
	private Shops shopId;
	
	@Column(name="price")
	private double price;

}
