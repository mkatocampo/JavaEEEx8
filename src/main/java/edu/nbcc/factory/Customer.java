package edu.nbcc.factory;

/**
 * @author Maria Ocampo
 *
 */
public class Customer implements User {

	@Override
	public String getEntitlements() {
		return "Customer user";
	}

}
