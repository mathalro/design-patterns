package factoryMethod;

/**
 * Concrete Product: implements the product interface
 *
 * @author Matheus Rosa
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
