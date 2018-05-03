package singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Design pattern: Singleton
 * 
 * Objective: ensure that there is only one instance of a class and supply just
 * one access point to this class 
 * 
 * @author Matheus Rosa
 *
 */
public class Logger {
	private String pathname = "./erro_log";
	private PrintWriter logStream;
	private static Logger logger = null;
	
	private Logger() {
		try {
			logStream = new PrintWriter(new FileWriter(pathname));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static Logger getLogger() {
		if (logger != null) {
			return logger;
		} else {
			return logger = new Logger();
		}
	}
	
	public synchronized void log(String message) {
		logStream.println(new Date()+": "+message);
		logStream.flush();
	}
}
