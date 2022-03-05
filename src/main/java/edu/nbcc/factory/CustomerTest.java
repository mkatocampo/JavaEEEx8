/**
 * 
 */
package edu.nbcc.factory;

/**
 * @author Maria Ocampo
 * select public static void main in class options
 */
public class CustomerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user = UserFactory.getInstance(UserType.ADMIN);
		//ctrl+space
		System.out.println(user.getEntitlements());

	}

}
