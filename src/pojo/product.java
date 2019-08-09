package pojo;

public class product {

	    private int id;

	    private String name;
	    
	    private String subTitle;

	    private float originalPrice;
	    private float promotePrice;
	    private int stock;

	    public int getId() {

	        return id;

	    }

	    public void setId(int id) {

	        this.id = id;

	    }

	    public String getName() {

	        return name;

	    }

	    public void setName(String name) {

	        this.name = name;

	    }
		public String getSubTitle() {
			return subTitle;
		}

		public void setSubTitle(String subTitle) {
			this.subTitle = subTitle;
		}

		public float getOriginalPrice() {
			return originalPrice;
		}

		public void setOriginalPrice(float originalPrice) {
			this.originalPrice = originalPrice;
		}

		public float getPromotePrice() {
			return promotePrice;
		}

		public void setPromotePrice(float promotePrice) {
			this.promotePrice = promotePrice;
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}

		@Override

	    public String toString() {

	        return "Product [id=" + id + ", name=" + name + ", subTitle="+subTitle+",originalPrice=" + originalPrice + ",promotePrice=" + promotePrice + ",stock="+stock+"]";

	    }
}
