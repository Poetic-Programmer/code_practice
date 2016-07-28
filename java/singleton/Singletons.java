/*
 * show the possible ways to implement the singleton pattern. 
 * note the enum is the most efficient
 */

public class Singletons{
	public static void main(String [] args){
		// call the first instance of First - will instantiate.
		Singletons.First.INSTANCE.someFunction();		

		// check that getting the instance does not instantiate again.
		Singletons.First.INSTANCE.someFunction();

		// final check, calling the function.
		Singletons.First.INSTANCE.someFunction();



		// call the first instance of Second - will instantiate.
		Singletons.Second.getInstance().someFunction();

		// check that getting the instance does not instantiate again.
		Singletons.Second.getInstance();

		// final check, calling the function.
		Singletons.Second.getInstance().someFunction();



		// call the first instance of Third.
		Singletons.Third.INSTANCE.someFunction();

		// check that getting the instance does not instantiate again.
		Singletons.Third.INSTANCE.someFunction();

		// final check, calling the function.
		Singletons.Third.INSTANCE.someFunction();
	}	
	/*
	 * Singleton with public final access field. no test for
	 * accesible object
	 */
	public static class First{
		public static final First INSTANCE = new First();

		private First(){
			System.out.println("'First' singleton created");
		}

		public void someFunction(){
			System.out.println("'First' singleton method called");
		}
	}

	/*
	 * singleton with public accessor method, no test for private construction!
	 */
	public static class Second{
		private static Second instance = null;

		private Second(){
			System.out.println("'Second' singleton created");
		}

		public static Second getInstance(){
			if(instance == null){
				instance = new Second();
			}
			return instance;
		}

		public void someFunction(){
			System.out.println("'Second' singleton method called");
		}
	}

	/*
	 * singleton with enum. more concise, absolutely no chance of multiple instantiation
	 * free serialization
	 */
	public enum Third{
		INSTANCE;

		private Third(){
			System.out.println("'Third' singleton created");
		}

		public void someFunction(){
			System.out.println("'Third' singleton method called");
		}
	}
}

