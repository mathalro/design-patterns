package composite;

public class Composite extends Product {

	@Override
	boolean isComposite() {
		return true;
	}
	
	@Override
	public double price() {
		double price = 0;
		for (Product it : components) {
			price += it.price();
		}
		return price;
	}

}
