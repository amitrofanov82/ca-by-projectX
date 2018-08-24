package ca.by.project_x.persistence.model.users;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name="users")
public class Users {
	
	/*
	 * CREATE TABLE users (
    id bigserial NOT NULL,
    nickname varchar(64) NOT NULL,
    email varchar(128),
    phone varchar(16),
    registered date,
    logged timestamp,
    password varchar(64),
    facebook_id varchar(50),
    google_id varchar(50),
    PRIMARY KEY(id)
	); * */
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private long id;
	
	@Column(name="nickname", nullable=false, unique=true, length=64)
	private String nickname;
	
	@Column(name="email", length=128)
	private String email;
	
	@Column(name="phone", length=16)
	private String phone;
	
	@Column(name="registered")
	private LocalDate registered;
	
	@Column(name="logged")
	private ZonedDateTime logged;
	
	@Column(name="password", length=64)
	private String password;
	
	@Column(name="facebook_id", length=50)
	private String facebookId;

	@Column(name="google_id", length=50)
	private String googleId;
	
	
	
}
