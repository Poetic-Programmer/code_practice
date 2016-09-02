public abstract class MyNoun{
	private String name;

	protected abstract String createName();

	protected MyNoun(){
		name = createName();
	}

	public String getName() { return name; }

	/*
	 * Tests for showcasing the functional interface...
	 */
	public boolean hasName() { return (name.length() > 0); }
	public boolean isAdjective() { return false; }
	public boolean isNoun() { return true; }
}
