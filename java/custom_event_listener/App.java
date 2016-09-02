/**
 * @author michael dunleavy
 * @since 04/08/2016
 *
 * <h1> Event Listening </h1>
 * <p> use custom objects to show how a typical event handling 
 * system works </p>
 */

public class App{
	public static void main(String [] args){
		App app = new App();

		// Simulate 10 events to show it works
		for(int i = 0; i < 10; ++i){
			app.simulateEvent();
		}
	}

	public void App(){
	}

	public void simulateEvent(){
		// create the source
		EventSource eventSource = new EventSource();

		// tell the source we are listening for an event
		eventSource.setListener(new MyListener());

		// create fake event
		eventSource.registerFakeEvent();
	}

	// create the custom listener
	private class MyListener implements EventListener{
		@Override
		public void actionPerformed(Event event){
			System.out.println("EventListenerCalled");

			// Show which event type was called
			if(event.getType() == Event.EventType.A){
				System.out.println("A Called");
			}
			else if(event.getType() == Event.EventType.B){
				System.out.println("B Called");
			}
			else{
				System.out.println("C Called");
			}
		}
	}
}
