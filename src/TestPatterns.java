import singleton.Logger;
import factoryMethod.*;

public class TestPatterns {

	public static void main(String[] args) {
		
		// Test singleton
		Logger logger1 = Logger.getLogger();
		logger1.log("Teste1");
		Logger logger2 = Logger.getLogger();
		logger2.log("Teste2");
		System.out.println(logger1+" "+logger2);
		
		// Test Factory method
		PathnameFactory factory = new PathnameFactory();
		Pathname pathname1, pathname2;
		
		String windowsPathname = "C:\\teste\\windows\\pathname.txt";
		String unixPathname = "/teste/unix/pathname";
		
		pathname1 = factory.getPathname(windowsPathname);
		pathname2 = factory.getPathname(unixPathname);
		
		System.out.println(pathname1.getClass());
		System.out.println(pathname1.getDirname());
		System.out.println(pathname1.getFilename());
		
		System.out.println(pathname2.getClass());
		System.out.println(pathname2.getDirname());
		System.out.println(pathname2.getFilename());
	}

}
