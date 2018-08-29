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
public class Shops {

	/*
	 * CREATE TABLE shops (
    id bigserial NOT NULL,
    admin_id bigint NOT NULL,
    opening_date date,
    location text,
    template_id bigint,
    PRIMARY KEY(id),
    FOREIGN KEY (admin_id) REFERENCES users(id),
    FOREIGN KEY (template_id) REFERENCES shop_templates(id)
	);*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private long id;
	
	@OneToOne
    @JoinColumn(name = "admin_id", referencedColumnName = "id", nullable = false, updatable = false)
    private Users adminId;
	
	@Column(name="opening_date")
	private LocalDate openingDate;
	
	@Column(name="location")
	private String location;
	
	@OneToOne
    @JoinColumn(name = "template_id", referencedColumnName = "id", nullable = false, updatable = false)
	private ShopTemplates templateId;
	
}
