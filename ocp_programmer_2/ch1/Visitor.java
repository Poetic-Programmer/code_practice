public class Visitor{
	public static enum Gender{
		MALE,
		FEMALE
	};
       
	private String name;
	private int age;
	private Gender gender;

	public Visitor(String name, int age, Gender gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() { return name; }
	public int getAge() { return age; }
	public Gender getGender() { return gender; }

	/*
	 * the override notation is optional but it lets the compiler know 
	 * that this method is intended to override from a superclass, so
	 * any problems with this code can be discovered at compile time.
	 */
	@Override 
	public boolean equals(Object obj){
		// return false if the comparative object isn't of type Visitor
		if( !(obj instanceof Visitor) ) return false;

		Visitor otherVisitor = (Visitor) obj;

		return (name.equals(otherVisitor.name) &&
				age == otherVisitor.age);
	}
	@Override
	public int hashCode(){
		return name.hashCode() + 13 * age;
	}
}
