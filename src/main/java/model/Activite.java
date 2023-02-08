package model;
// classe model - represente une table dans la base de données
public class Activite {

	private Integer id;
	private String description;
	
	
	public Activite() {
		
	}
	
	public Activite(Integer id, String description) {
		this.id = id;
		this.description = description;
	}

	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	@Override
	public String toString() {
		return "Activite [" + description + "]";
	}
	
	
	
	
}
