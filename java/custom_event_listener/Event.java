/**
 * @author michael dunleavy
 * @since 04/08/2016
 *
 * <h1> Event </h1>
 * <p> simulate event with simple output statements </p>
 */

public class Event{
	// ideally this enum would be either static or in a separate file, it is
	// here for convenience
	public enum EventType{
		// Print the type when created to prove it is only constructed once per field.
		A("A"), B("B"), C("C");

		EventType(String type){
			System.out.println("message type " + type + " created");
		}
	}

	EventType type;

	public Event(int type){
		if (type == 0)
			this.type = EventType.A;
		else if (type == 1)
			this.type = EventType.B;
		else
			this.type = EventType.C;
	}

	public EventType getType(){
		return type;
	}
}
