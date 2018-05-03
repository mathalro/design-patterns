package observer;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Subject: receive the registers and send notifications to observers
 * 
 * @author Matheus Rosa
 *
 */
public class Observed extends HashSet {

	protected void notification() {
		for (Iterator obs = iterator(); obs.hasNext();) {
			((Observer)obs.next()).notified();
		}
	}
	
	public void union(Observer observer) {
		add(observer);
	}
	
	public void remove(Observer observer) {
		remove(observer);
	}
}
