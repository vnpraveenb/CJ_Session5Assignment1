/**
 * 
 */
package Abstract;



import java.util.Scanner;

/**
 * @author Praveen
 *
 */
abstract class Animal
{
	String dogName;
	
	abstract void sleep();
	
	abstract void wakeUp();
	
	
}
public class Dog {
	
 	
	/**
	 * @param dogName
	 */
	public void sleep(String dogName)
	{
		System.out.println( dogName + " is going to sleep!!!!");
	}

	/**
	 * @param dogName
	 */
	public void run(String dogName)
	{
		System.out.println(  dogName + " is now running!!!!");
	}
	
	/**
	 * @param dogName
	 */
	public void wakeUp(String dogName)
	{
		System.out.println( dogName + " has woken up");
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The program implements Abstract class and its methods");
		
		System.out.println("Please input the name of the dog: ");
		
		Scanner scan = new Scanner(System.in);
		String dogName = scan.nextLine();
		
		Dog dogObject = new Dog();
		
		dogObject.sleep(dogName);
		
		dogObject.wakeUp(dogName);

		dogObject.run(dogName);

		
	}

}

