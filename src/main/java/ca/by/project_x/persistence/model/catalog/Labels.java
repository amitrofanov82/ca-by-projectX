package ca.by.project_x.persistence.model.catalog;

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
@Table(name="labels")
public class Labels {
	
	/*
	 * CREATE TABLE labels (
    id bigserial NOT NULL,
    name varchar(128) NOT NULL,
    parent_id bigint,
    is_category boolean DEFAULT true,
    description text,
    PRIMARY KEY(id)
	);*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false, unique=true)
	private long id;
	
	@Column(name="name", nullable=false, length=128)
	private String name;
	
	@Column(name="parent_id")
	private long parentId;
	
	@Column(name="is_category")
	private boolean isCategory;
	
	@Column(name="description")
	private String description;

}
