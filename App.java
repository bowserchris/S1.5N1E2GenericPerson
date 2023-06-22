package n1e2;

public class App {

	public static void main(String[] args) {
		
		Person person = new Person("chris", "bowser", 33);
		
		String testString = "hello";
		
		Integer testNum = 5;
		
		GenericMethods<Object> generic = new GenericMethods<>(person, testString, testNum);
		
		generic.print(testString, testNum, person);

	}

}

/*
 * Create a class called Person with the attributes firstname, lastname, 
 * and age. It then creates a class called GenericMethods with a generic 
 * method that accepts three generic type arguments. This method should 
 * only print to the screen the arguments it received. In the main() of 
 * the main class, call the generic method with different types of 
 * parameters.

Example: an object of the Person class, a String and a primitive type.

In this way you have verified that any type of parameter can be passed 
to it and in any order.
 * 
 * 
 * */
