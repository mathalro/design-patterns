package factoryMethod;

/**
 * @author Matheus Rosa
 * 
 * Concrete Product: implements the product interface
 *
 */
public class WindowsPathname extends Pathname {

	public WindowsPathname(String pathname) {
		this.pathname = pathname;
	}
	
	@Override
	public String getSeparator() {
		return "\\";
	}
}
