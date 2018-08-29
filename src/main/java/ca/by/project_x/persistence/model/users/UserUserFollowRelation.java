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

@Getter @Setter @NoArgsConstructor @ToString
@Entity
@Table(name="user_user_follow_relation")
public class UserUserFollowRelation {
	
	/*
	 * CREATE TABLE user_user_follow_relation (
    id bigserial NOT NULL,
    follower_id bigint,
    followee_id bigint,
    PRIMARY KEY(id),
    FOREIGN KEY (follower_id) REFERENCES users(id),
    FOREIGN KEY (followee_id) REFERENCES users(id)
	);*/

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private long id;
	
	@OneToOne
    @JoinColumn(name = "follower_id", referencedColumnName = "id", nullable = false)
    private Users followerId;
	
	@OneToOne
    @JoinColumn(name = "followee_id", referencedColumnName = "id", nullable = false)
    private Users followeeId;
	
}
