package ecommerce.core;

public class Product {
	private int id;
	private String name;
	private String description;
	private int count;

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
	  this.description = description;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getCount() {
		return count;
	}
}
