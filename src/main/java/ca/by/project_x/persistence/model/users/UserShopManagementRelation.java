package ca.by.project_x.persistence.model.users;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor  @ToString
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
	
	@OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private Users userId;
	
	@OneToOne
    @JoinColumn(name = "shop_id", referencedColumnName = "id", nullable = false)
    private Shops shopId;

}
