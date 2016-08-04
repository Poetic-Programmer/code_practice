/**
 * @author michael dunleavy
 * @since 04/08/2016
 *
 * <h1> Event Source </h1>
 * <p> represents an event source, such as a button in a gui </p>
 */

import java.util.Random;

public class EventSource{
	private EventListener listener;

	public EventSource(){
	}

	public void setListener(EventListener listener){
		// point our listener to the passed listener
		this.listener = listener;
	}

	public void registerFakeEvent(){
		Event event = new Event(getRandomEventType());

		listener.actionPerformed(event);
	}

	private int getRandomEventType(){
		// inefficent to create new Random each call!
		Random random = new Random();
		return random.nextInt(3);
	}
}
