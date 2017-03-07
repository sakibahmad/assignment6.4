/*			EXCEPTION HANDLING
 * Program to validate age for election 
 * a person eligible or not 
 * AND THROW NEGATIVE AGE EXCEPTION
 */

//extending qwerty from class Exception
public class qwerty extends Exception {
	String s1;
	int voterid;
	int age;

	// constuctor
	qwerty(String s) {

		s1 = s;
	}
	// method to pritn string and return negative age exception

	public String toString() {
		return ("negative age exeption " + s1);

	}

	// creating a method for validating age
	public void ageLImit(int age) {
		// try block
		try {
			if (age > 0 && age < 18) {
				// throw exception when age is between 0 and 18
				System.out.println("\n");

				throw new qwerty("\nyour age is less than 18 your entered age is " + age);

			}

			else if (age < 0)
			// throw exception when age is less than 0
			{

				throw new qwerty("\nyou have entered age in negative  " + age);
			} else
				System.out.println("\nyou are eligible to vote");

		}
		// catching excepton
		catch (qwerty ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		// object of qwerty class
		qwerty obj = new qwerty(" not eligible to cast vote  ");
		obj.ageLImit(-1);
		obj.ageLImit(5);
		obj.ageLImit(789);
	}
}
