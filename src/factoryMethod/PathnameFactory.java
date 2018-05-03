package factoryMethod;

/**
 * Concrete Creator: identifies the Object type and return it. 
 * 
 * @author Matheus Rosa
 *
 */
public class PathnameFactory implements PathnameFactorInterface {

	@Override
	public Pathname getPathname(String pathname) {
		if (pathname.contains("\\")) return new WindowsPathname(pathname);
		return new UnixPathname(pathname);
	}
	
}
