package ca.by.project_x.persistence.model.catalog;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ca.by.project_x.persistence.model.users.Users;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
@Entity
@Table(name="user_product_wish_relation")
public class UserProductWishRelation {

	/*
	 * CREATE TABLE user_product_wish_relation (
    id bigserial NOT NULL,
    user_id bigint,
    product_id bigint,
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
	);*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private long id;
	
	@OneToMany
    @MapsId
	@JoinColumn(name="user_id", referencedColumnName="id", nullable=false)
	private Set<Users> userId;
	
	@OneToMany
    @MapsId
	@JoinColumn(name="product_id", referencedColumnName="id", nullable=false)
	private Set<Products> productId;
}
