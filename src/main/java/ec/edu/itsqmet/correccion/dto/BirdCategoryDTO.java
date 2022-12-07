package ec.edu.itsqmet.correccion.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "bird_category")
public class BirdCategoryDTO {
	@Id
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
