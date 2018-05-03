package composite;

/**
 * Leaf: basic behavior objects without children.
 * 
 * @author Matheus Rosa
 *
 */
public class Disc extends Product {
	
	final double TAX = 0.2;
	
	String author, editor;
	int duration, tracks;
	
	public Disc(double cost, String author, String editor, int duration, int tracks) {
		this.cost = cost;
		this.author = author;
		this.editor = editor;
		this.duration = duration;
		this.tracks = tracks;
	}
	
	@Override
	double price() {
		return this.cost*(1+TAX);
	}
}
