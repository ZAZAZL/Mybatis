package pojo;

import java.util.List;

public class category {

	public String id;
	public String name;
	List<product> products;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<product> getProducts() {
		return products;
	}
	public void setProducts(List<product> products) {
		this.products = products;
	}
	@Override

    public String toString() {

        return "Category [id=" + id + ", name=" + name + "]";

    }
	
}
