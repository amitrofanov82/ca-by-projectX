package ca.by.project_x.persistence.model.catalog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
@Entity
@Table(name="product_images")
public class ProductImages {

	/*
	 * CREATE TABLE product_images (
    id bigserial NOT NULL,
    product_id bigint NOT NULL,
    image_link text NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(id)
	);*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="product_id", referencedColumnName="id", nullable=false, updatable = false)
	private Products productId;
	
	@Column(name="image_link", nullable=false)
	private String imageLink;
	
}
