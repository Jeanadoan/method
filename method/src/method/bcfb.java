package method;
import java.util.Scanner;
public class bcfb {
/*static void myName (String name, int age, String state, double height) {
	System.out.println ("my name is "+ name +", i am " + age + " years old and i live in "+ state + ". My height is " + height );
}
	public static void main(String[] args) {
	myName ("Jeana", 16, "Washington state", 5.3);
*/
	static int mySum (int number, int number2) {
				return number + number2 ;
				
	}
	
		public static void main(String[] args) {

			Scanner input = new Scanner (System.in);
			System.out.println ("input two numbers");
			int num = input.nextInt ();
			int num2 = input.nextInt ();
			System.out.println	(mySum(num, num2));
		}
}


