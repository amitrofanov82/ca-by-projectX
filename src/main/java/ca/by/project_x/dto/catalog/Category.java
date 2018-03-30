package ca.by.project_x.dto.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@AllArgsConstructor
@Data
public class Category {

	@JsonIgnore
	private Category parentCategory=null;
    private List<Category> subCategories=null;
    private String name=null;
    private String description=null;
    //I think it's not good idea to add products here

}
