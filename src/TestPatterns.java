import singleton.Logger;
import factoryMethod.*;

import com.sun.xml.internal.bind.v2.runtime.Name;

import composite.*;
import strategy.*;

public class TestPatterns {

	public static void main(String[] args) {
		
		// Test singleton
		System.out.println("Test singleton");
		Logger logger1 = Logger.getLogger();
		logger1.log("Teste1");
		Logger logger2 = Logger.getLogger();
		logger2.log("Teste2");
		System.out.println(logger1+" "+logger2);
		
		// Test Factory method
		System.out.println("\nTest factory-method");
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
		
		// Test composite
		System.out.println("\nTest composite");
		Product book = new Book(10, 100, "Matheus", "Tchola");
		Product disc = new Disc(20, "Matheus", "Tchola", 10, 50);
		Composite pack = new Composite();
		
		pack.compose(book);
		System.out.println(pack.price());
		pack.compose(disc);
		System.out.println(pack.price());
		
		// Test strategy
		System.out.println("\nStrategy test");
		class Pessoa {
			String name;
			NameFormatter formatter = new CompleteName();
			
			public Pessoa(String name) {
				this.name = name;
			}
			
			public void defineFormatter(NameFormatter formatter) {
				this.formatter = formatter;
			}
			
			public String getName() {
				return formatter.format(name);
			}
		}
		Pessoa p = new Pessoa("Matheus de Almeida Rosa");
		System.out.println(p.getName());
		p.defineFormatter(new FirstName());
		System.out.println(p.getName());
	}

}
