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
@Table(name="subscription_list")
public class SubscriptionList {

	/*
	 * CREATE TABLE subscription_list (
    id bigserial NOT NULL,
    user_id bigint,
    email varchar(128),
    FOREIGN KEY (user_id) REFERENCES users(id)
	);*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private long id;
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, updatable = false)
	private Users userId;
	
	@Column(name="email", length=128)
	private String email;
	
}
