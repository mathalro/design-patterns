package factoryMethod;

/**
 * Design pattern: factory method
 * 
 * Objective: define an interface to create objects, letting the sub-classes to
 * decide of which class instantiate.
 * 
 * Product: defines the interface to the objects created by the Factory.
 * 
 * @author Matheus Rosa
 *
 */
public abstract class Pathname {
	protected String pathname;
	
	public abstract String getSeparator();
	
	public String getFilename() {
		return pathname.substring(pathname.lastIndexOf(getSeparator())+1);
	}

	public String getDirname() {
		return pathname.substring(0, pathname.lastIndexOf(getSeparator()));
	}
}
