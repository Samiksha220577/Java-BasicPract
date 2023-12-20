/**
 * 
 */
package com.sami.opps.ex1;

/**
 * @author SAMI
 *
 */
public class Phone {

	/**
	 * 
	 */
	public Phone() {
		// TODO Auto-generated constructor stub
		System.out.println("Phone constructor");
		this.connectionName = "BSNL";
		System.out.println("Phone constructor connectionName" + connectionName);
		
	}
private String connectionName;

public String getConnectionName() {
	return connectionName;
}
public void setConnectionName(String connectionName) {
	this.connectionName = connectionName;
}
}
