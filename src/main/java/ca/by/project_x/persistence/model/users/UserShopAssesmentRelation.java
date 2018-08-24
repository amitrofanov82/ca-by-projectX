package ca.by.project_x.persistence.model.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
@Entity
@Table(name="user_shop_assesment_relation")
public class UserShopAssesmentRelation {
	
	/*
	 * CREATE TABLE user_shop_assesment_relation (
	 
		    id bigserial NOT NULL,
		    user_id bigint,
		    shop_id bigint,
		    mark smallint CHECK (mark > 0 AND mark < 5),
		    PRIMARY KEY(id),
		    FOREIGN KEY (user_id) REFERENCES users(id),
		    FOREIGN KEY (shop_id) REFERENCES shops(id)
	);*/

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private long id;
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, updatable = false)
	private Users userId;
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "shop_id", referencedColumnName = "id", nullable = false, updatable = false)
	private Shops shopId;
	
	 //from 1 to 5
	@Column(name="mark", length=1)
	private byte mark;
}
