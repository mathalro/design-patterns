package observer;

import java.util.Date;

/**
 * Concrete Subject: manage the notification state
 * 
 * @author Matheus Rosa
 *
 */
public class AlarmClock extends Observed implements Runnable {

	Date wake;
	Thread time;
	
	public void init(Date wake) {
		this.wake = wake;
		time = new Thread(this);
		time.start();
	}
	
	public Date wake() {
		return wake;
	}
	
	public void stop() {
		time = null;
	}
	
	public void run() {
		while (time != null) {
			if (wake != null) {
				if ((new Date()).before(wake)) continue;
				notification();
				stop();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
