package edu.nbcc.factory;

/**
 * @author Maria Ocampo
 *
 */
public class Admin implements User {

	@Override
	public String getEntitlements() {
		return "Admin user";
	}

}
