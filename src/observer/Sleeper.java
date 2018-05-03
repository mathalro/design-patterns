package observer;

import java.util.Date;

public class Sleeper implements Observer {

	AlarmClock alarm;
	
	public static void main(String[] args) {
		new Sleeper();
	}
	
	public Sleeper() {
		Date wake = new Date();
		wake.setTime((wake.getTime()) + 3000);
		
		alarm = new AlarmClock();
		
		alarm.init(wake);
		
		alarm.union(this);
		alarm.init(wake);
	}
	
	public void notified() {
		System.out.println("Good morning!");
	}
}
