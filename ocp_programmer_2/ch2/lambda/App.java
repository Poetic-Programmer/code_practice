public class App{
	public static void main(String [] args){
		App app = new App();
		app.doThings();
	}

	public App(){
	}

	public void doThings(){
		Dog dog = new Dog();
		Cat cat = new Cat();

		print(dog, d -> d.hasName());
		print(cat, c -> c.hasName());
		print(dog, d -> d.isNoun());
		print(cat, c -> c.isAdjective());
	}

	private void print(MyNoun noun, MyFunctionalInterface i){
		if(i.checkStat(noun)){
			System.out.println(noun.getName() + " passed the test");
		}
	}
}
