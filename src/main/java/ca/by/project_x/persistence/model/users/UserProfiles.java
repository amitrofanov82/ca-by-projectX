package ca.by.project_x.persistence.model.users;

import java.time.LocalDate;

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
@Table(name="user_profiles")
public class UserProfiles {
	
	/*
	 * CREATE TABLE user_profiles (
    user_id bigint NOT NULL,
    birthdate date,
    location text,
    avatar_link text,
    about text,
    twitter_id varchar(50),
    instagram_id varchar(50),
    UNIQUE(user_id),
    FOREIGN KEY (user_id) REFERENCES users(id)
	); * */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	//TODO decide if it will be also useful to have this field at User side
	@OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, updatable = false)
	private Users user;
	
	@Column(name="birthdate")
	private LocalDate birthdate;
	
	@Column(name="location")
	private String location;
	
	@Column(name="avatar_link")
	private String avatarLink;

	@Column(name="about")
	private String about;

	@Column(name="twitter_id", length=50)
	private String twitterId;
	
	@Column(name="instagram_id", length=50)
	private String instagramId;
	
}
