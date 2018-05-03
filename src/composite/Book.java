package composite;

/**
 * Leaf: Basic behavior objects without children.
 * 
 * @author Matheus Rosa
 *
 */
public class Book extends Product {

	final double TAX = 0.1; 
	
	String author, editor;
	int pages;
	
	public Book(double cost, int pages, String author, String editor) {
		this.cost = cost;
		this.pages = pages;
		this.author = author;
		this.editor = editor;
	}
	
	@Override
	double price() {
		return this.cost*(1+TAX);
	}

}
