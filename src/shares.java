import java.util.*;

public class shares {
	private List<Double> price;
	
	shares(){
		price=null;
	}

	public void setPrice(Double price) {
		this.price.add(price);
	}

	public Double getPrice() {
		return price.get(price.size()-1);
	}

	
}
