package ca.by.project_x.persistence.model.users;



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

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name="user_shop_management_relation")
public class UserShopManagementRelation {
	
	/*
	 * CREATE TABLE user_shop_management_relation (
    id bigserial NOT NULL,
    user_id bigint NOT NULL,
    shop_id bigint NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (shop_id) REFERENCES shops(id)
	);
	 * */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private long id;
	
	@OneToMany
    @MapsId
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private Set<Users> userId;
	
	@OneToMany
    @MapsId
    @JoinColumn(name = "shop_id", referencedColumnName = "id", nullable = false)
    private Set<Shops> shopId;

}
